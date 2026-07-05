package com.stripe.android.customersheet.data;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.imagepipeline.transcoder.JpegTranscoderUtils;
import com.facebook.internal.NativeProtocol;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.common.coroutines.CoroutinesKtxKt;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.customersheet.CustomerAdapter;
import com.stripe.android.customersheet.CustomerPermissions;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.data.CustomerSheetDataResult;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodSaveConsentBehavior;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodUpdateParams;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: CustomerAdapterDataSource.kt */
@Singleton
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B+\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0014H\u0096@¢\u0006\u0002\u0010\u001cJ$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010$J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010$J \u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00142\b\u0010(\u001a\u0004\u0018\u00010)H\u0096@¢\u0006\u0002\u0010*J&\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00142\b\u0010-\u001a\u0004\u0018\u00010'2\u0006\u0010.\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010/J\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014H\u0096@¢\u0006\u0002\u0010\u001cJ\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0082@¢\u0006\u0004\b4\u0010\u001cJ\u001c\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a02H\u0082@¢\u0006\u0004\b6\u0010\u001cJ\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0002J>\u00108\u001a\b\u0012\u0004\u0012\u0002H90\u0014\"\u0004\b\u0000\u001092\"\u0010:\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H90=0<\u0012\u0006\u0012\u0004\u0018\u00010>0;H\u0082@¢\u0006\u0002\u0010?R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006@"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;", "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;", "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;", "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;", "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;", "elementsSessionRepository", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "customerAdapter", "Lcom/stripe/android/customersheet/CustomerAdapter;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/customersheet/CustomerAdapter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "canCreateSetupIntents", "", "getCanCreateSetupIntents", "()Z", "loadCustomerSheetSession", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "Lcom/stripe/android/customersheet/data/CustomerSheetSession;", "configuration", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrievePaymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentMethod", "paymentMethodId", "", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detachPaymentMethod", "retrieveSavedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "customerSessionElementsSession", "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;", "(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSavedSelection", "", BaseSheetViewModel.SAVE_SELECTION, "shouldSyncDefault", "(Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSetupIntentClientSecret", "fetchElementsSession", "Lkotlin/Result;", "Lcom/stripe/android/model/ElementsSession;", "fetchElementsSession-IoAF18A", "fetchInitialPaymentMethods", "fetchInitialPaymentMethods-IoAF18A", "createPaymentMethodTypes", "runCatchingAdapterTask", ExifInterface.GPS_DIRECTION_TRUE, "task", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerAdapterDataSource implements CustomerSheetInitializationDataSource, CustomerSheetSavedSelectionDataSource, CustomerSheetPaymentMethodDataSource, CustomerSheetIntentDataSource {
    public static final int $stable = 8;
    private final boolean canCreateSetupIntents;
    private final CustomerAdapter customerAdapter;
    private final ElementsSessionRepository elementsSessionRepository;
    private final ErrorReporter errorReporter;
    private final CoroutineContext workContext;

    /* compiled from: CustomerAdapterDataSource.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource", f = "CustomerAdapterDataSource.kt", i = {}, l = {41}, m = "loadCustomerSheetSession", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerAdapterDataSource$loadCustomerSheetSession$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerAdapterDataSource.this.loadCustomerSheetSession(null, this);
        }
    }

    @Inject
    public CustomerAdapterDataSource(ElementsSessionRepository elementsSessionRepository, CustomerAdapter customerAdapter, ErrorReporter errorReporter, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(elementsSessionRepository, "elementsSessionRepository");
        Intrinsics.checkNotNullParameter(customerAdapter, "customerAdapter");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.elementsSessionRepository = elementsSessionRepository;
        this.customerAdapter = customerAdapter;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        this.canCreateSetupIntents = customerAdapter.getCanCreateSetupIntents();
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetIntentDataSource
    public boolean getCanCreateSetupIntents() {
        return this.canCreateSetupIntents;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.data.CustomerSheetInitializationDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadCustomerSheetSession(CustomerSheet.Configuration configuration, Continuation<? super CustomerSheetDataResult<CustomerSheetSession>> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objRunCatching$default;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object obj = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext coroutineContext = this.workContext;
            C08372 c08372 = new C08372(configuration, this, null);
            anonymousClass12.label = 1;
            objRunCatching$default = CoroutinesKtxKt.runCatching$default(coroutineContext, null, c08372, anonymousClass12, 1, null);
            if (objRunCatching$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objRunCatching$default = ((Result) obj).getValue();
        }
        return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objRunCatching$default);
    }

    /* compiled from: CustomerAdapterDataSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/data/CustomerSheetSession;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$loadCustomerSheetSession$2", f = "CustomerAdapterDataSource.kt", i = {0, 0, 1, 1, 2, 2}, l = {54, ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE, 56}, m = "invokeSuspend", n = {"paymentMethodsResult", "savedSelectionResult", "savedSelectionResult", "elementsSession", "elementsSession", "paymentMethods"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.stripe.android.customersheet.data.CustomerAdapterDataSource$loadCustomerSheetSession$2, reason: invalid class name and case insensitive filesystem */
    static final class C08372 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerSheetSession>, Object> {
        final /* synthetic */ CustomerSheet.Configuration $configuration;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ CustomerAdapterDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08372(CustomerSheet.Configuration configuration, CustomerAdapterDataSource customerAdapterDataSource, Continuation<? super C08372> continuation) {
            super(2, continuation);
            this.$configuration = configuration;
            this.this$0 = customerAdapterDataSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08372 c08372 = new C08372(this.$configuration, this.this$0, continuation);
            c08372.L$0 = obj;
            return c08372;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerSheetSession> continuation) {
            return ((C08372) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Deferred deferred;
            Deferred deferred2;
            ElementsSession elementsSession;
            Deferred deferred3;
            Object objAwait;
            List list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CustomerAdapterDataSource$loadCustomerSheetSession$2$elementsSessionResult$1(this.this$0, null), 3, null);
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CustomerAdapterDataSource$loadCustomerSheetSession$2$paymentMethodsResult$1(this.this$0, null), 3, null);
                Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CustomerAdapterDataSource$loadCustomerSheetSession$2$savedSelectionResult$1(this.this$0, null), 3, null);
                this.L$0 = deferredAsync$default2;
                this.L$1 = deferredAsync$default3;
                this.label = 1;
                obj = deferredAsync$default.await(this);
                if (obj != coroutine_suspended) {
                    deferred = deferredAsync$default2;
                    deferred2 = deferredAsync$default3;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) this.L$1;
                    elementsSession = (ElementsSession) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    list = list2;
                    ElementsSession elementsSession2 = elementsSession;
                    Object value = ((Result) obj).getValue();
                    ResultKt.throwOnFailure(value);
                    return new CustomerSheetSession(elementsSession2, list, (SavedSelection) value, PaymentMethodSaveConsentBehavior.Legacy.INSTANCE, new CustomerPermissions(true, this.$configuration.getAllowsRemovalOfLastSavedPaymentMethod(), false), null);
                }
                elementsSession = (ElementsSession) this.L$1;
                deferred3 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                Object value2 = ((Result) obj).getValue();
                ResultKt.throwOnFailure(value2);
                List list3 = (List) value2;
                this.L$0 = elementsSession;
                this.L$1 = list3;
                this.label = 3;
                objAwait = deferred3.await(this);
                if (objAwait != coroutine_suspended) {
                    list = list3;
                    obj = objAwait;
                    ElementsSession elementsSession22 = elementsSession;
                    Object value3 = ((Result) obj).getValue();
                    ResultKt.throwOnFailure(value3);
                    return new CustomerSheetSession(elementsSession22, list, (SavedSelection) value3, PaymentMethodSaveConsentBehavior.Legacy.INSTANCE, new CustomerPermissions(true, this.$configuration.getAllowsRemovalOfLastSavedPaymentMethod(), false), null);
                }
                return coroutine_suspended;
            }
            deferred2 = (Deferred) this.L$1;
            deferred = (Deferred) this.L$0;
            ResultKt.throwOnFailure(obj);
            Object value4 = ((Result) obj).getValue();
            ResultKt.throwOnFailure(value4);
            ElementsSession elementsSession3 = (ElementsSession) value4;
            this.L$0 = deferred2;
            this.L$1 = elementsSession3;
            this.label = 2;
            Object objAwait2 = deferred.await(this);
            if (objAwait2 != coroutine_suspended) {
                Deferred deferred4 = deferred2;
                elementsSession = elementsSession3;
                obj = objAwait2;
                deferred3 = deferred4;
                Object value22 = ((Result) obj).getValue();
                ResultKt.throwOnFailure(value22);
                List list32 = (List) value22;
                this.L$0 = elementsSession;
                this.L$1 = list32;
                this.label = 3;
                objAwait = deferred3.await(this);
                if (objAwait != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    /* compiled from: CustomerAdapterDataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "", "Lcom/stripe/android/model/PaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$retrievePaymentMethods$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerAdapterDataSource$retrievePaymentMethods$2, reason: invalid class name and case insensitive filesystem */
    static final class C08382 extends SuspendLambda implements Function1<Continuation<? super CustomerAdapter.Result<List<? extends PaymentMethod>>>, Object> {
        int label;

        C08382(Continuation<? super C08382> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CustomerAdapterDataSource.this.new C08382(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super CustomerAdapter.Result<List<? extends PaymentMethod>>> continuation) {
            return invoke2((Continuation<? super CustomerAdapter.Result<List<PaymentMethod>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super CustomerAdapter.Result<List<PaymentMethod>>> continuation) {
            return ((C08382) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objRetrievePaymentMethods = CustomerAdapterDataSource.this.customerAdapter.retrievePaymentMethods(this);
            return objRetrievePaymentMethods == coroutine_suspended ? coroutine_suspended : objRetrievePaymentMethods;
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource
    public Object retrievePaymentMethods(Continuation<? super CustomerSheetDataResult<List<PaymentMethod>>> continuation) {
        return runCatchingAdapterTask(new C08382(null), continuation);
    }

    /* compiled from: CustomerAdapterDataSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "Lcom/stripe/android/model/PaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$updatePaymentMethod$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {JpegTranscoderUtils.DEFAULT_JPEG_QUALITY}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerAdapterDataSource$updatePaymentMethod$2, reason: invalid class name and case insensitive filesystem */
    static final class C08432 extends SuspendLambda implements Function1<Continuation<? super CustomerAdapter.Result<PaymentMethod>>, Object> {
        final /* synthetic */ PaymentMethodUpdateParams $params;
        final /* synthetic */ String $paymentMethodId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08432(String str, PaymentMethodUpdateParams paymentMethodUpdateParams, Continuation<? super C08432> continuation) {
            super(1, continuation);
            this.$paymentMethodId = str;
            this.$params = paymentMethodUpdateParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CustomerAdapterDataSource.this.new C08432(this.$paymentMethodId, this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super CustomerAdapter.Result<PaymentMethod>> continuation) {
            return ((C08432) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objUpdatePaymentMethod = CustomerAdapterDataSource.this.customerAdapter.updatePaymentMethod(this.$paymentMethodId, this.$params, this);
            return objUpdatePaymentMethod == coroutine_suspended ? coroutine_suspended : objUpdatePaymentMethod;
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource
    public Object updatePaymentMethod(String str, PaymentMethodUpdateParams paymentMethodUpdateParams, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation) {
        return runCatchingAdapterTask(new C08432(str, paymentMethodUpdateParams, null), continuation);
    }

    /* compiled from: CustomerAdapterDataSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "Lcom/stripe/android/model/PaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$attachPaymentMethod$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerAdapterDataSource$attachPaymentMethod$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super CustomerAdapter.Result<PaymentMethod>>, Object> {
        final /* synthetic */ String $paymentMethodId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$paymentMethodId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CustomerAdapterDataSource.this.new AnonymousClass2(this.$paymentMethodId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super CustomerAdapter.Result<PaymentMethod>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objAttachPaymentMethod = CustomerAdapterDataSource.this.customerAdapter.attachPaymentMethod(this.$paymentMethodId, this);
            return objAttachPaymentMethod == coroutine_suspended ? coroutine_suspended : objAttachPaymentMethod;
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource
    public Object attachPaymentMethod(String str, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation) {
        return runCatchingAdapterTask(new AnonymousClass2(str, null), continuation);
    }

    /* compiled from: CustomerAdapterDataSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "Lcom/stripe/android/model/PaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$detachPaymentMethod$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerAdapterDataSource$detachPaymentMethod$2, reason: invalid class name and case insensitive filesystem */
    static final class C08362 extends SuspendLambda implements Function1<Continuation<? super CustomerAdapter.Result<PaymentMethod>>, Object> {
        final /* synthetic */ String $paymentMethodId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08362(String str, Continuation<? super C08362> continuation) {
            super(1, continuation);
            this.$paymentMethodId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CustomerAdapterDataSource.this.new C08362(this.$paymentMethodId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super CustomerAdapter.Result<PaymentMethod>> continuation) {
            return ((C08362) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objDetachPaymentMethod = CustomerAdapterDataSource.this.customerAdapter.detachPaymentMethod(this.$paymentMethodId, this);
            return objDetachPaymentMethod == coroutine_suspended ? coroutine_suspended : objDetachPaymentMethod;
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource
    public Object detachPaymentMethod(String str, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation) {
        return runCatchingAdapterTask(new C08362(str, null), continuation);
    }

    /* compiled from: CustomerAdapterDataSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$retrieveSavedSelection$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerAdapterDataSource$retrieveSavedSelection$2, reason: invalid class name and case insensitive filesystem */
    static final class C08392 extends SuspendLambda implements Function1<Continuation<? super CustomerAdapter.Result<SavedSelection>>, Object> {
        int label;

        C08392(Continuation<? super C08392> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CustomerAdapterDataSource.this.new C08392(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super CustomerAdapter.Result<SavedSelection>> continuation) {
            return ((C08392) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = CustomerAdapterDataSource.this.customerAdapter.retrieveSelectedPaymentOption(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CustomerAdapter.Result result = (CustomerAdapter.Result) obj;
            if (result instanceof CustomerAdapter.Result.Success) {
                CustomerAdapter.Result.Companion companion = CustomerAdapter.Result.INSTANCE;
                CustomerAdapter.PaymentOption paymentOption = (CustomerAdapter.PaymentOption) ((CustomerAdapter.Result.Success) result).getValue();
                return companion.success(paymentOption != null ? paymentOption.toSavedSelection$paymentsheet_release() : null);
            }
            if (!(result instanceof CustomerAdapter.Result.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
            return CustomerAdapter.Result.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetSavedSelectionDataSource
    public Object retrieveSavedSelection(CustomerSessionElementsSession customerSessionElementsSession, Continuation<? super CustomerSheetDataResult<SavedSelection>> continuation) {
        return runCatchingAdapterTask(new C08392(null), continuation);
    }

    /* compiled from: CustomerAdapterDataSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$setSavedSelection$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerAdapterDataSource$setSavedSelection$2, reason: invalid class name and case insensitive filesystem */
    static final class C08422 extends SuspendLambda implements Function1<Continuation<? super CustomerAdapter.Result<Unit>>, Object> {
        final /* synthetic */ SavedSelection $selection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08422(SavedSelection savedSelection, Continuation<? super C08422> continuation) {
            super(1, continuation);
            this.$selection = savedSelection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CustomerAdapterDataSource.this.new C08422(this.$selection, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super CustomerAdapter.Result<Unit>> continuation) {
            return ((C08422) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            CustomerAdapter customerAdapter = CustomerAdapterDataSource.this.customerAdapter;
            SavedSelection savedSelection = this.$selection;
            CustomerAdapter.PaymentOption paymentOption$paymentsheet_release = savedSelection != null ? CustomerAdapter.PaymentOption.INSTANCE.toPaymentOption$paymentsheet_release(savedSelection) : null;
            this.label = 1;
            Object selectedPaymentOption = customerAdapter.setSelectedPaymentOption(paymentOption$paymentsheet_release, this);
            return selectedPaymentOption == coroutine_suspended ? coroutine_suspended : selectedPaymentOption;
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetSavedSelectionDataSource
    public Object setSavedSelection(SavedSelection savedSelection, boolean z, Continuation<? super CustomerSheetDataResult<Unit>> continuation) {
        return runCatchingAdapterTask(new C08422(savedSelection, null), continuation);
    }

    /* compiled from: CustomerAdapterDataSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$retrieveSetupIntentClientSecret$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerAdapterDataSource$retrieveSetupIntentClientSecret$2, reason: invalid class name and case insensitive filesystem */
    static final class C08402 extends SuspendLambda implements Function1<Continuation<? super CustomerAdapter.Result<String>>, Object> {
        int label;

        C08402(Continuation<? super C08402> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CustomerAdapterDataSource.this.new C08402(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super CustomerAdapter.Result<String>> continuation) {
            return ((C08402) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object obj2 = CustomerAdapterDataSource.this.customerAdapter.setupIntentClientSecretForCustomerAttach(this);
            return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetIntentDataSource
    public Object retrieveSetupIntentClientSecret(Continuation<? super CustomerSheetDataResult<String>> continuation) {
        return runCatchingAdapterTask(new C08402(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: fetchElementsSession-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7266fetchElementsSessionIoAF18A(Continuation<? super Result<ElementsSession>> continuation) {
        CustomerAdapterDataSource$fetchElementsSession$1 customerAdapterDataSource$fetchElementsSession$1;
        Object objMo8420gethUnOzRk;
        CustomerAdapterDataSource customerAdapterDataSource;
        if (continuation instanceof CustomerAdapterDataSource$fetchElementsSession$1) {
            customerAdapterDataSource$fetchElementsSession$1 = (CustomerAdapterDataSource$fetchElementsSession$1) continuation;
            if ((customerAdapterDataSource$fetchElementsSession$1.label & Integer.MIN_VALUE) != 0) {
                customerAdapterDataSource$fetchElementsSession$1.label -= Integer.MIN_VALUE;
            } else {
                customerAdapterDataSource$fetchElementsSession$1 = new CustomerAdapterDataSource$fetchElementsSession$1(this, continuation);
            }
        }
        CustomerAdapterDataSource$fetchElementsSession$1 customerAdapterDataSource$fetchElementsSession$12 = customerAdapterDataSource$fetchElementsSession$1;
        Object obj = customerAdapterDataSource$fetchElementsSession$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = customerAdapterDataSource$fetchElementsSession$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentElementLoader.InitializationMode.DeferredIntent deferredIntent = new PaymentElementLoader.InitializationMode.DeferredIntent(new PaymentSheet.IntentConfiguration(new PaymentSheet.IntentConfiguration.Mode.Setup(null, null, 3, null), createPaymentMethodTypes(), null, null, false, 28, null));
            ElementsSessionRepository elementsSessionRepository = this.elementsSessionRepository;
            List<String> listEmptyList = CollectionsKt.emptyList();
            List<PaymentSheet.CustomPaymentMethod> listEmptyList2 = CollectionsKt.emptyList();
            customerAdapterDataSource$fetchElementsSession$12.L$0 = this;
            customerAdapterDataSource$fetchElementsSession$12.label = 1;
            objMo8420gethUnOzRk = elementsSessionRepository.mo8420gethUnOzRk(deferredIntent, null, listEmptyList2, listEmptyList, null, customerAdapterDataSource$fetchElementsSession$12);
            if (objMo8420gethUnOzRk == coroutine_suspended) {
                return coroutine_suspended;
            }
            customerAdapterDataSource = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            customerAdapterDataSource = (CustomerAdapterDataSource) customerAdapterDataSource$fetchElementsSession$12.L$0;
            ResultKt.throwOnFailure(obj);
            objMo8420gethUnOzRk = ((Result) obj).getValue();
        }
        if (Result.m9125isSuccessimpl(objMo8420gethUnOzRk)) {
            ErrorReporter.DefaultImpls.report$default(customerAdapterDataSource.errorReporter, ErrorReporter.SuccessEvent.CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS, null, null, 6, null);
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8420gethUnOzRk);
        if (thM9121exceptionOrNullimpl != null) {
            ErrorReporter.DefaultImpls.report$default(customerAdapterDataSource.errorReporter, ErrorReporter.ExpectedErrorEvent.CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), null, 4, null);
        }
        return objMo8420gethUnOzRk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: fetchInitialPaymentMethods-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7267fetchInitialPaymentMethodsIoAF18A(Continuation<? super Result<? extends List<PaymentMethod>>> continuation) {
        CustomerAdapterDataSource$fetchInitialPaymentMethods$1 customerAdapterDataSource$fetchInitialPaymentMethods$1;
        CustomerAdapterDataSource customerAdapterDataSource;
        StripeError stripeError;
        if (continuation instanceof CustomerAdapterDataSource$fetchInitialPaymentMethods$1) {
            customerAdapterDataSource$fetchInitialPaymentMethods$1 = (CustomerAdapterDataSource$fetchInitialPaymentMethods$1) continuation;
            if ((customerAdapterDataSource$fetchInitialPaymentMethods$1.label & Integer.MIN_VALUE) != 0) {
                customerAdapterDataSource$fetchInitialPaymentMethods$1.label -= Integer.MIN_VALUE;
            } else {
                customerAdapterDataSource$fetchInitialPaymentMethods$1 = new CustomerAdapterDataSource$fetchInitialPaymentMethods$1(this, continuation);
            }
        }
        Object objRetrievePaymentMethods = customerAdapterDataSource$fetchInitialPaymentMethods$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = customerAdapterDataSource$fetchInitialPaymentMethods$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objRetrievePaymentMethods);
            customerAdapterDataSource$fetchInitialPaymentMethods$1.L$0 = this;
            customerAdapterDataSource$fetchInitialPaymentMethods$1.label = 1;
            objRetrievePaymentMethods = retrievePaymentMethods(customerAdapterDataSource$fetchInitialPaymentMethods$1);
            if (objRetrievePaymentMethods == coroutine_suspended) {
                return coroutine_suspended;
            }
            customerAdapterDataSource = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            customerAdapterDataSource = (CustomerAdapterDataSource) customerAdapterDataSource$fetchInitialPaymentMethods$1.L$0;
            ResultKt.throwOnFailure(objRetrievePaymentMethods);
        }
        CustomerSheetDataResult customerSheetDataResult = (CustomerSheetDataResult) objRetrievePaymentMethods;
        if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
            ErrorReporter.DefaultImpls.report$default(customerAdapterDataSource.errorReporter, ErrorReporter.SuccessEvent.CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS, null, null, 6, null);
        }
        CustomerSheetDataResult.Failure failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(customerSheetDataResult);
        if (failureFailureOrNull != null) {
            if (failureFailureOrNull.getDisplayMessage() == null) {
                Throwable cause = failureFailureOrNull.getCause();
                StripeException stripeException = cause instanceof StripeException ? (StripeException) cause : null;
                if (stripeException != null && (stripeError = stripeException.getStripeError()) != null) {
                    stripeError.getMessage();
                }
            }
            ErrorReporter.DefaultImpls.report$default(customerAdapterDataSource.errorReporter, ErrorReporter.ExpectedErrorEvent.CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE, StripeException.INSTANCE.create(failureFailureOrNull.getCause()), null, 4, null);
        }
        return customerSheetDataResult.mo7270toResultd1pmJ48();
    }

    private final List<String> createPaymentMethodTypes() {
        if (this.customerAdapter.getCanCreateSetupIntents()) {
            List<String> paymentMethodTypes = this.customerAdapter.getPaymentMethodTypes();
            return paymentMethodTypes == null ? CollectionsKt.emptyList() : paymentMethodTypes;
        }
        return CollectionsKt.listOf("card");
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CustomerAdapterDataSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$runCatchingAdapterTask$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerAdapterDataSource$runCatchingAdapterTask$2, reason: invalid class name and case insensitive filesystem */
    static final class C08412<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerSheetDataResult<T>>, Object> {
        final /* synthetic */ Function1<Continuation<? super CustomerAdapter.Result<T>>, Object> $task;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C08412(Function1<? super Continuation<? super CustomerAdapter.Result<T>>, ? extends Object> function1, Continuation<? super C08412> continuation) {
            super(2, continuation);
            this.$task = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08412 c08412 = new C08412(this.$task, continuation);
            c08412.L$0 = obj;
            return c08412;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerSheetDataResult<T>> continuation) {
            return ((C08412) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function1<Continuation<? super CustomerAdapter.Result<T>>, Object> function1 = this.$task;
                    Result.Companion companion = Result.INSTANCE;
                    this.label = 1;
                    obj = function1.invoke(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM9118constructorimpl = Result.m9118constructorimpl((CustomerAdapter.Result) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl == null) {
                return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult((CustomerAdapter.Result) objM9118constructorimpl);
            }
            return CustomerSheetDataResult.INSTANCE.failure(thM9121exceptionOrNullimpl, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object runCatchingAdapterTask(Function1<? super Continuation<? super CustomerAdapter.Result<T>>, ? extends Object> function1, Continuation<? super CustomerSheetDataResult<T>> continuation) {
        return BuildersKt.withContext(this.workContext, new C08412(function1, null), continuation);
    }
}
