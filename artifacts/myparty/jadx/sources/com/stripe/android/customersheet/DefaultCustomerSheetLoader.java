package com.stripe.android.customersheet;

import com.stripe.android.common.coroutines.Single;
import com.stripe.android.common.coroutines.SingleKt;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.CustomerSheetState;
import com.stripe.android.customersheet.analytics.CustomerSheetEventReporter;
import com.stripe.android.customersheet.data.CustomerSheetDataResult;
import com.stripe.android.customersheet.data.CustomerSheetInitializationDataSource;
import com.stripe.android.customersheet.data.CustomerSheetSession;
import com.stripe.android.customersheet.util.CustomerSheetHacks;
import com.stripe.android.customersheet.util.CustomerSheetUtilsKt;
import com.stripe.android.customersheet.util.SyncDefaultPaymentMethodUtilsKt;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.lpmfoundations.luxe.LpmRepository;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.CustomerMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentSheetCardBrandFilter;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.financialconnections.IsFinancialConnectionsSdkAvailable;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.model.StripeIntentValidatorKt;
import com.stripe.android.ui.core.elements.SharedDataSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CustomerSheetLoader.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001Bf\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018B\\\b\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bH\u0082@¢\u0006\u0004\b\"\u0010#J&\u0010$\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010)J \u0010*\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'2\u0006\u0010+\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J(\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010&\u001a\u00020'2\u0006\u0010+\u001a\u00020%2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J \u00101\u001a\u0004\u0018\u00010-2\u0006\u0010&\u001a\u00020'2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\u001c\u00102\u001a\b\u0012\u0004\u0012\u0002030/2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030/H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;", "Lcom/stripe/android/customersheet/CustomerSheetLoader;", "isLiveModeProvider", "Lkotlin/Function0;", "", "googlePayRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "Lkotlin/jvm/JvmSuppressWildcards;", "isFinancialConnectionsAvailable", "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;", "lpmRepository", "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;", "initializationDataSourceProvider", "Lcom/stripe/android/common/coroutines/Single;", "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;", "eventReporter", "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "load", "Lkotlin/Result;", "Lcom/stripe/android/customersheet/CustomerSheetState$Full;", "configuration", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "load-gIAlu-s", "(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveInitializationDataSource", "retrieveInitializationDataSource-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "customerSheetSession", "Lcom/stripe/android/customersheet/data/CustomerSheetSession;", "isPaymentMethodSyncDefaultEnabled", "(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/data/CustomerSheetSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCustomerSheetState", "metadata", "getPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "useLocalSelectionAsPaymentSelection", "filterSupportedPaymentMethods", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "supportedPaymentMethods", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultCustomerSheetLoader implements CustomerSheetLoader {
    public static final int $stable = 8;
    private final ErrorReporter errorReporter;
    private final CustomerSheetEventReporter eventReporter;
    private final Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory;
    private final Single<CustomerSheetInitializationDataSource> initializationDataSourceProvider;
    private final IsFinancialConnectionsSdkAvailable isFinancialConnectionsAvailable;
    private final Function0<Boolean> isLiveModeProvider;
    private final LpmRepository lpmRepository;
    private final CoroutineContext workContext;

    /* compiled from: CustomerSheetLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.DefaultCustomerSheetLoader", f = "CustomerSheetLoader.kt", i = {0, 0, 0, 0, 0}, l = {145}, m = "createPaymentMethodMetadata", n = {"configuration", "customerSheetSession", "elementsSession", "sharedDataSpecs", "isPaymentMethodSyncDefaultEnabled"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0"})
    /* renamed from: com.stripe.android.customersheet.DefaultCustomerSheetLoader$createPaymentMethodMetadata$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultCustomerSheetLoader.this.createPaymentMethodMetadata(null, null, false, this);
        }
    }

    public DefaultCustomerSheetLoader(@Named(NamedConstantsKt.IS_LIVE_MODE) Function0<Boolean> isLiveModeProvider, Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory, IsFinancialConnectionsSdkAvailable isFinancialConnectionsAvailable, LpmRepository lpmRepository, Single<CustomerSheetInitializationDataSource> initializationDataSourceProvider, CustomerSheetEventReporter eventReporter, ErrorReporter errorReporter, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(isLiveModeProvider, "isLiveModeProvider");
        Intrinsics.checkNotNullParameter(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        Intrinsics.checkNotNullParameter(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        Intrinsics.checkNotNullParameter(lpmRepository, "lpmRepository");
        Intrinsics.checkNotNullParameter(initializationDataSourceProvider, "initializationDataSourceProvider");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.isLiveModeProvider = isLiveModeProvider;
        this.googlePayRepositoryFactory = googlePayRepositoryFactory;
        this.isFinancialConnectionsAvailable = isFinancialConnectionsAvailable;
        this.lpmRepository = lpmRepository;
        this.initializationDataSourceProvider = initializationDataSourceProvider;
        this.eventReporter = eventReporter;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Inject
    public DefaultCustomerSheetLoader(@Named(NamedConstantsKt.IS_LIVE_MODE) Function0<Boolean> isLiveModeProvider, Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory, IsFinancialConnectionsSdkAvailable isFinancialConnectionsAvailable, LpmRepository lpmRepository, CustomerSheetEventReporter eventReporter, ErrorReporter errorReporter, @IOContext CoroutineContext workContext) {
        this(isLiveModeProvider, googlePayRepositoryFactory, isFinancialConnectionsAvailable, lpmRepository, CustomerSheetHacks.INSTANCE.getInitializationDataSource(), eventReporter, errorReporter, workContext);
        Intrinsics.checkNotNullParameter(isLiveModeProvider, "isLiveModeProvider");
        Intrinsics.checkNotNullParameter(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        Intrinsics.checkNotNullParameter(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        Intrinsics.checkNotNullParameter(lpmRepository, "lpmRepository");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:14:0x0039, B:44:0x00f6, B:19:0x004e, B:34:0x008e, B:35:0x00b3, B:37:0x00b9, B:39:0x00cf, B:40:0x00d3, B:22:0x005a, B:31:0x007c), top: B:54:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.stripe.android.customersheet.DefaultCustomerSheetLoader] */
    @Override // com.stripe.android.customersheet.CustomerSheetLoader
    /* renamed from: load-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7250loadgIAlus(CustomerSheet.Configuration configuration, Continuation<? super Result<CustomerSheetState.Full>> continuation) {
        DefaultCustomerSheetLoader$load$1 defaultCustomerSheetLoader$load$1;
        Throwable th;
        DefaultCustomerSheetLoader defaultCustomerSheetLoader;
        Object objM9118constructorimpl;
        DefaultCustomerSheetLoader defaultCustomerSheetLoader2;
        Throwable thM9121exceptionOrNullimpl;
        Object objM7263retrieveInitializationDataSourceIoAF18A;
        DefaultCustomerSheetLoader defaultCustomerSheetLoader3;
        DefaultCustomerSheetLoader defaultCustomerSheetLoader4;
        CustomerSheet.Configuration configuration2;
        CustomerSheetSession customerSheetSession;
        if (continuation instanceof DefaultCustomerSheetLoader$load$1) {
            defaultCustomerSheetLoader$load$1 = (DefaultCustomerSheetLoader$load$1) continuation;
            if ((defaultCustomerSheetLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                defaultCustomerSheetLoader$load$1.label -= Integer.MIN_VALUE;
            } else {
                defaultCustomerSheetLoader$load$1 = new DefaultCustomerSheetLoader$load$1(this, continuation);
            }
        }
        Object objLoadCustomerSheetSession = defaultCustomerSheetLoader$load$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = defaultCustomerSheetLoader$load$1.label;
        try {
        } catch (Throwable th2) {
            th = th2;
            defaultCustomerSheetLoader = r2;
        }
        if (r2 == 0) {
            ResultKt.throwOnFailure(objLoadCustomerSheetSession);
            try {
                Result.Companion companion = Result.INSTANCE;
                defaultCustomerSheetLoader$load$1.L$0 = this;
                defaultCustomerSheetLoader$load$1.L$1 = configuration;
                defaultCustomerSheetLoader$load$1.label = 1;
                objM7263retrieveInitializationDataSourceIoAF18A = m7263retrieveInitializationDataSourceIoAF18A(defaultCustomerSheetLoader$load$1);
                if (objM7263retrieveInitializationDataSourceIoAF18A != coroutine_suspended) {
                    defaultCustomerSheetLoader3 = this;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                defaultCustomerSheetLoader = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                defaultCustomerSheetLoader2 = defaultCustomerSheetLoader;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        } else {
            if (r2 != 1) {
                if (r2 != 2) {
                    if (r2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    customerSheetSession = (CustomerSheetSession) defaultCustomerSheetLoader$load$1.L$2;
                    configuration2 = (CustomerSheet.Configuration) defaultCustomerSheetLoader$load$1.L$1;
                    DefaultCustomerSheetLoader defaultCustomerSheetLoader5 = (DefaultCustomerSheetLoader) defaultCustomerSheetLoader$load$1.L$0;
                    ResultKt.throwOnFailure(objLoadCustomerSheetSession);
                    r2 = defaultCustomerSheetLoader5;
                    objM9118constructorimpl = Result.m9118constructorimpl(TuplesKt.to(r2.createCustomerSheetState(customerSheetSession, (PaymentMethodMetadata) objLoadCustomerSheetSession, configuration2), customerSheetSession));
                    defaultCustomerSheetLoader2 = r2;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl == null) {
                        Pair pair = (Pair) objM9118constructorimpl;
                        CustomerSheetState.Full full = (CustomerSheetState.Full) pair.component1();
                        defaultCustomerSheetLoader2.eventReporter.onLoadSucceeded((CustomerSheetSession) pair.component2());
                        Result.Companion companion3 = Result.INSTANCE;
                        return Result.m9118constructorimpl(full);
                    }
                    defaultCustomerSheetLoader2.eventReporter.onLoadFailed(thM9121exceptionOrNullimpl);
                    Result.Companion companion4 = Result.INSTANCE;
                    return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
                }
                configuration = (CustomerSheet.Configuration) defaultCustomerSheetLoader$load$1.L$1;
                DefaultCustomerSheetLoader defaultCustomerSheetLoader6 = (DefaultCustomerSheetLoader) defaultCustomerSheetLoader$load$1.L$0;
                ResultKt.throwOnFailure(objLoadCustomerSheetSession);
                defaultCustomerSheetLoader4 = defaultCustomerSheetLoader6;
                Object objMo7270toResultd1pmJ48 = ((CustomerSheetDataResult) objLoadCustomerSheetSession).mo7270toResultd1pmJ48();
                ResultKt.throwOnFailure(objMo7270toResultd1pmJ48);
                CustomerSheetSession customerSheetSession2 = (CustomerSheetSession) objMo7270toResultd1pmJ48;
                boolean defaultPaymentMethodsEnabledForCustomerSheet = SyncDefaultPaymentMethodUtilsKt.getDefaultPaymentMethodsEnabledForCustomerSheet(customerSheetSession2.getElementsSession());
                List<PaymentMethod> paymentMethods = customerSheetSession2.getPaymentMethods();
                ArrayList arrayList = new ArrayList();
                for (Object obj : paymentMethods) {
                    if (new PaymentSheetCardBrandFilter(configuration.getCardBrandAcceptance()).isAccepted((PaymentMethod) obj)) {
                        arrayList.add(obj);
                    }
                }
                CustomerSheetSession customerSheetSessionCopy$default = CustomerSheetSession.copy$default(customerSheetSession2, null, SyncDefaultPaymentMethodUtilsKt.filterToSupportedPaymentMethods(arrayList, defaultPaymentMethodsEnabledForCustomerSheet), null, null, null, null, 61, null);
                defaultCustomerSheetLoader$load$1.L$0 = defaultCustomerSheetLoader4;
                defaultCustomerSheetLoader$load$1.L$1 = configuration;
                defaultCustomerSheetLoader$load$1.L$2 = customerSheetSessionCopy$default;
                defaultCustomerSheetLoader$load$1.label = 3;
                objLoadCustomerSheetSession = defaultCustomerSheetLoader4.createPaymentMethodMetadata(configuration, customerSheetSessionCopy$default, defaultPaymentMethodsEnabledForCustomerSheet, defaultCustomerSheetLoader$load$1);
                if (objLoadCustomerSheetSession != coroutine_suspended) {
                    configuration2 = configuration;
                    customerSheetSession = customerSheetSessionCopy$default;
                    r2 = defaultCustomerSheetLoader4;
                    objM9118constructorimpl = Result.m9118constructorimpl(TuplesKt.to(r2.createCustomerSheetState(customerSheetSession, (PaymentMethodMetadata) objLoadCustomerSheetSession, configuration2), customerSheetSession));
                    defaultCustomerSheetLoader2 = r2;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl == null) {
                    }
                }
                return coroutine_suspended;
            }
            configuration = (CustomerSheet.Configuration) defaultCustomerSheetLoader$load$1.L$1;
            DefaultCustomerSheetLoader defaultCustomerSheetLoader7 = (DefaultCustomerSheetLoader) defaultCustomerSheetLoader$load$1.L$0;
            ResultKt.throwOnFailure(objLoadCustomerSheetSession);
            objM7263retrieveInitializationDataSourceIoAF18A = ((Result) objLoadCustomerSheetSession).getValue();
            defaultCustomerSheetLoader3 = defaultCustomerSheetLoader7;
        }
        ResultKt.throwOnFailure(objM7263retrieveInitializationDataSourceIoAF18A);
        defaultCustomerSheetLoader$load$1.L$0 = defaultCustomerSheetLoader3;
        defaultCustomerSheetLoader$load$1.L$1 = configuration;
        defaultCustomerSheetLoader$load$1.label = 2;
        objLoadCustomerSheetSession = ((CustomerSheetInitializationDataSource) objM7263retrieveInitializationDataSourceIoAF18A).loadCustomerSheetSession(configuration, defaultCustomerSheetLoader$load$1);
        defaultCustomerSheetLoader4 = defaultCustomerSheetLoader3;
        if (objLoadCustomerSheetSession != coroutine_suspended) {
            Object objMo7270toResultd1pmJ482 = ((CustomerSheetDataResult) objLoadCustomerSheetSession).mo7270toResultd1pmJ48();
            ResultKt.throwOnFailure(objMo7270toResultd1pmJ482);
            CustomerSheetSession customerSheetSession22 = (CustomerSheetSession) objMo7270toResultd1pmJ482;
            boolean defaultPaymentMethodsEnabledForCustomerSheet2 = SyncDefaultPaymentMethodUtilsKt.getDefaultPaymentMethodsEnabledForCustomerSheet(customerSheetSession22.getElementsSession());
            List<PaymentMethod> paymentMethods2 = customerSheetSession22.getPaymentMethods();
            ArrayList arrayList2 = new ArrayList();
            while (r5.hasNext()) {
            }
            CustomerSheetSession customerSheetSessionCopy$default2 = CustomerSheetSession.copy$default(customerSheetSession22, null, SyncDefaultPaymentMethodUtilsKt.filterToSupportedPaymentMethods(arrayList2, defaultPaymentMethodsEnabledForCustomerSheet2), null, null, null, null, 61, null);
            defaultCustomerSheetLoader$load$1.L$0 = defaultCustomerSheetLoader4;
            defaultCustomerSheetLoader$load$1.L$1 = configuration;
            defaultCustomerSheetLoader$load$1.L$2 = customerSheetSessionCopy$default2;
            defaultCustomerSheetLoader$load$1.label = 3;
            objLoadCustomerSheetSession = defaultCustomerSheetLoader4.createPaymentMethodMetadata(configuration, customerSheetSessionCopy$default2, defaultPaymentMethodsEnabledForCustomerSheet2, defaultCustomerSheetLoader$load$1);
            if (objLoadCustomerSheetSession != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: retrieveInitializationDataSource-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7263retrieveInitializationDataSourceIoAF18A(Continuation<? super Result<? extends CustomerSheetInitializationDataSource>> continuation) {
        DefaultCustomerSheetLoader$retrieveInitializationDataSource$1 defaultCustomerSheetLoader$retrieveInitializationDataSource$1;
        Object objM7214awaitWithTimeoutdWUq8MI;
        DefaultCustomerSheetLoader defaultCustomerSheetLoader;
        if (continuation instanceof DefaultCustomerSheetLoader$retrieveInitializationDataSource$1) {
            defaultCustomerSheetLoader$retrieveInitializationDataSource$1 = (DefaultCustomerSheetLoader$retrieveInitializationDataSource$1) continuation;
            if ((defaultCustomerSheetLoader$retrieveInitializationDataSource$1.label & Integer.MIN_VALUE) != 0) {
                defaultCustomerSheetLoader$retrieveInitializationDataSource$1.label -= Integer.MIN_VALUE;
            } else {
                defaultCustomerSheetLoader$retrieveInitializationDataSource$1 = new DefaultCustomerSheetLoader$retrieveInitializationDataSource$1(this, continuation);
            }
        }
        Object obj = defaultCustomerSheetLoader$retrieveInitializationDataSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultCustomerSheetLoader$retrieveInitializationDataSource$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Single<CustomerSheetInitializationDataSource> single = this.initializationDataSourceProvider;
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
            Function0 function0 = new Function0() { // from class: com.stripe.android.customersheet.DefaultCustomerSheetLoader$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DefaultCustomerSheetLoader.retrieveInitializationDataSource_IoAF18A$lambda$4();
                }
            };
            defaultCustomerSheetLoader$retrieveInitializationDataSource$1.L$0 = this;
            defaultCustomerSheetLoader$retrieveInitializationDataSource$1.label = 1;
            objM7214awaitWithTimeoutdWUq8MI = SingleKt.m7214awaitWithTimeoutdWUq8MI(single, duration, function0, defaultCustomerSheetLoader$retrieveInitializationDataSource$1);
            if (objM7214awaitWithTimeoutdWUq8MI == coroutine_suspended) {
                return coroutine_suspended;
            }
            defaultCustomerSheetLoader = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultCustomerSheetLoader = (DefaultCustomerSheetLoader) defaultCustomerSheetLoader$retrieveInitializationDataSource$1.L$0;
            ResultKt.throwOnFailure(obj);
            objM7214awaitWithTimeoutdWUq8MI = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM7214awaitWithTimeoutdWUq8MI);
        if (thM9121exceptionOrNullimpl != null) {
            ErrorReporter.DefaultImpls.report$default(defaultCustomerSheetLoader.errorReporter, ErrorReporter.ExpectedErrorEvent.CUSTOMER_SHEET_ADAPTER_NOT_FOUND, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), null, 4, null);
        }
        return objM7214awaitWithTimeoutdWUq8MI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retrieveInitializationDataSource_IoAF18A$lambda$4() {
        return "Couldn't find an instance of InitializationDataSource. Are you instantiating CustomerSheet unconditionally in your app?";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createPaymentMethodMetadata(CustomerSheet.Configuration configuration, CustomerSheetSession customerSheetSession, boolean z, Continuation<? super PaymentMethodMetadata> continuation) {
        AnonymousClass1 anonymousClass1;
        ElementsSession elementsSession;
        List<SharedDataSpec> sharedDataSpecs;
        Object objFirst;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            elementsSession = customerSheetSession.getElementsSession();
            sharedDataSpecs = this.lpmRepository.getSharedDataSpecs(elementsSession.getStripeIntent(), elementsSession.getPaymentMethodSpecs()).getSharedDataSpecs();
            if (configuration.getGooglePayEnabled()) {
                Flow<Boolean> flowIsReady = this.googlePayRepositoryFactory.invoke(this.isLiveModeProvider.invoke().booleanValue() ? GooglePayEnvironment.Production : GooglePayEnvironment.Test).isReady();
                anonymousClass1.L$0 = configuration;
                anonymousClass1.L$1 = customerSheetSession;
                anonymousClass1.L$2 = elementsSession;
                anonymousClass1.L$3 = sharedDataSpecs;
                anonymousClass1.Z$0 = z;
                anonymousClass1.label = 1;
                objFirst = FlowKt.first(flowIsReady, anonymousClass1);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            CustomerSheet.Configuration configuration2 = configuration;
            return PaymentMethodMetadata.INSTANCE.createForCustomerSheet$paymentsheet_release(elementsSession, configuration2, customerSheetSession.getPaymentMethodSaveConsentBehavior(), sharedDataSpecs, z, new CustomerMetadata(true, z, CustomerMetadata.Permissions.INSTANCE.createForCustomerSheet$paymentsheet_release(configuration2, customerSheetSession)));
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z2 = anonymousClass1.Z$0;
        List<SharedDataSpec> list = (List) anonymousClass1.L$3;
        ElementsSession elementsSession2 = (ElementsSession) anonymousClass1.L$2;
        CustomerSheetSession customerSheetSession2 = (CustomerSheetSession) anonymousClass1.L$1;
        CustomerSheet.Configuration configuration3 = (CustomerSheet.Configuration) anonymousClass1.L$0;
        ResultKt.throwOnFailure(obj);
        z = z2;
        configuration = configuration3;
        objFirst = obj;
        elementsSession = elementsSession2;
        sharedDataSpecs = list;
        customerSheetSession = customerSheetSession2;
        boolean z3 = ((Boolean) objFirst).booleanValue();
        CustomerSheet.Configuration configuration22 = configuration;
        return PaymentMethodMetadata.INSTANCE.createForCustomerSheet$paymentsheet_release(elementsSession, configuration22, customerSheetSession.getPaymentMethodSaveConsentBehavior(), sharedDataSpecs, z3, new CustomerMetadata(true, z, CustomerMetadata.Permissions.INSTANCE.createForCustomerSheet$paymentsheet_release(configuration22, customerSheetSession)));
    }

    private final CustomerSheetState.Full createCustomerSheetState(CustomerSheetSession customerSheetSession, PaymentMethodMetadata metadata, CustomerSheet.Configuration configuration) {
        PaymentSelection paymentSelection = getPaymentSelection(customerSheetSession, metadata, customerSheetSession.getPaymentMethods());
        return new CustomerSheetState.Full(configuration, metadata, CustomerSheetUtilsKt.sortPaymentMethods(customerSheetSession.getPaymentMethods(), paymentSelection instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) paymentSelection : null), customerSheetSession.getPermissions(), filterSupportedPaymentMethods(metadata.sortedSupportedPaymentMethods()), paymentSelection, StripeIntentValidatorKt.validate(customerSheetSession.getElementsSession().getStripeIntent()));
    }

    private final PaymentSelection getPaymentSelection(CustomerSheetSession customerSheetSession, PaymentMethodMetadata metadata, List<PaymentMethod> paymentMethods) {
        CustomerMetadata customerMetadata = metadata.getCustomerMetadata();
        if (customerMetadata != null && customerMetadata.isPaymentMethodSetAsDefaultEnabled()) {
            return SyncDefaultPaymentMethodUtilsKt.getDefaultPaymentMethodAsPaymentSelection(paymentMethods, customerSheetSession.getDefaultPaymentMethodId());
        }
        return useLocalSelectionAsPaymentSelection(customerSheetSession, paymentMethods);
    }

    private final PaymentSelection useLocalSelectionAsPaymentSelection(CustomerSheetSession customerSheetSession, List<PaymentMethod> paymentMethods) {
        Object next;
        SavedSelection savedSelection = customerSheetSession.getSavedSelection();
        PaymentSelection.Saved saved = null;
        if (savedSelection == null) {
            return null;
        }
        if (savedSelection instanceof SavedSelection.GooglePay) {
            return PaymentSelection.GooglePay.INSTANCE;
        }
        if (savedSelection instanceof SavedSelection.Link) {
            return new PaymentSelection.Link(null, null, null, 7, null);
        }
        if (savedSelection instanceof SavedSelection.PaymentMethod) {
            Iterator<T> it = paymentMethods.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((PaymentMethod) next).id, ((SavedSelection.PaymentMethod) savedSelection).getId())) {
                    break;
                }
            }
            PaymentMethod paymentMethod = (PaymentMethod) next;
            if (paymentMethod != null) {
                saved = new PaymentSelection.Saved(paymentMethod, null, null, 6, null);
            }
            return saved;
        }
        if (savedSelection instanceof SavedSelection.None) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final List<SupportedPaymentMethod> filterSupportedPaymentMethods(List<SupportedPaymentMethod> supportedPaymentMethods) {
        Set ofNotNull = SetsKt.setOfNotNull((Object[]) new String[]{PaymentMethod.Type.Card.code, PaymentMethod.Type.USBankAccount.code});
        ArrayList arrayList = new ArrayList();
        for (Object obj : supportedPaymentMethods) {
            if (ofNotNull.contains(((SupportedPaymentMethod) obj).getCode())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
