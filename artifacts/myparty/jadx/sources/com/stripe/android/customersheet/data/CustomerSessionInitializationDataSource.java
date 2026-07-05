package com.stripe.android.customersheet.data;

import com.stripe.android.core.injection.IOContext;
import com.stripe.android.customersheet.CustomerPermissions;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodSaveConsentBehavior;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.SavedSelection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CustomerSessionInitializationDataSource.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;", "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;", "elementsSessionManager", "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;", "savedSelectionDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;Lkotlin/coroutines/CoroutineContext;)V", "loadCustomerSheetSession", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "Lcom/stripe/android/customersheet/data/CustomerSheetSession;", "configuration", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSessionInitializationDataSource implements CustomerSheetInitializationDataSource {
    public static final int $stable = 8;
    private final CustomerSessionElementsSessionManager elementsSessionManager;
    private final CustomerSheetSavedSelectionDataSource savedSelectionDataSource;
    private final CoroutineContext workContext;

    @Inject
    public CustomerSessionInitializationDataSource(CustomerSessionElementsSessionManager elementsSessionManager, CustomerSheetSavedSelectionDataSource savedSelectionDataSource, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(elementsSessionManager, "elementsSessionManager");
        Intrinsics.checkNotNullParameter(savedSelectionDataSource, "savedSelectionDataSource");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.elementsSessionManager = elementsSessionManager;
        this.savedSelectionDataSource = savedSelectionDataSource;
        this.workContext = workContext;
    }

    /* compiled from: CustomerSessionInitializationDataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "Lcom/stripe/android/customersheet/data/CustomerSheetSession;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionInitializationDataSource$loadCustomerSheetSession$2", f = "CustomerSessionInitializationDataSource.kt", i = {1}, l = {22, 24}, m = "invokeSuspend", n = {"customerSessionElementsSession"}, s = {"L$1"})
    /* renamed from: com.stripe.android.customersheet.data.CustomerSessionInitializationDataSource$loadCustomerSheetSession$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerSheetDataResult<CustomerSheetSession>>, Object> {
        final /* synthetic */ CustomerSheet.Configuration $configuration;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CustomerSheet.Configuration configuration, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$configuration = configuration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSessionInitializationDataSource.this.new AnonymousClass2(this.$configuration, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerSheetDataResult<CustomerSheetSession>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0016, B:23:0x0067, B:25:0x0088, B:29:0x0094, B:34:0x00ae, B:36:0x00be, B:39:0x00c9, B:37:0x00c5, B:40:0x00e1, B:41:0x00e6, B:26:0x008f, B:42:0x00e7, B:43:0x00ec, B:19:0x004f), top: B:48:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0016, B:23:0x0067, B:25:0x0088, B:29:0x0094, B:34:0x00ae, B:36:0x00be, B:39:0x00c9, B:37:0x00c5, B:40:0x00e1, B:41:0x00e6, B:26:0x008f, B:42:0x00e7, B:43:0x00ec, B:19:0x004f), top: B:48:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00be A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0016, B:23:0x0067, B:25:0x0088, B:29:0x0094, B:34:0x00ae, B:36:0x00be, B:39:0x00c9, B:37:0x00c5, B:40:0x00e1, B:41:0x00e6, B:26:0x008f, B:42:0x00e7, B:43:0x00ec, B:19:0x004f), top: B:48:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0016, B:23:0x0067, B:25:0x0088, B:29:0x0094, B:34:0x00ae, B:36:0x00be, B:39:0x00c9, B:37:0x00c5, B:40:0x00e1, B:41:0x00e6, B:26:0x008f, B:42:0x00e7, B:43:0x00ec, B:19:0x004f), top: B:48:0x0008 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objCreateFailure;
            Object objM9118constructorimpl;
            CustomerSessionElementsSession customerSessionElementsSession;
            CustomerSheet.Configuration configuration;
            ElementsSession.Customer.Components.CustomerSheet customerSheet;
            boolean canRemoveLastPaymentMethod;
            ElementsSession.Customer.Components.CustomerSheet customerSheet2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objCreateFailure = ResultKt.createFailure(th);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objCreateFailure = CustomerSessionInitializationDataSource.this.elementsSessionManager.mo7269fetchElementsSessionIoAF18A(this);
                if (objCreateFailure != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                customerSessionElementsSession = (CustomerSessionElementsSession) this.L$1;
                configuration = (CustomerSheet.Configuration) this.L$0;
                ResultKt.throwOnFailure(obj);
                Object objMo7270toResultd1pmJ48 = ((CustomerSheetDataResult) obj).mo7270toResultd1pmJ48();
                ResultKt.throwOnFailure(objMo7270toResultd1pmJ48);
                SavedSelection savedSelection = (SavedSelection) objMo7270toResultd1pmJ48;
                ElementsSession.Customer customer = customerSessionElementsSession.getCustomer();
                customerSheet = customer.getSession().getComponents().getCustomerSheet();
                boolean zIsPaymentMethodRemoveEnabled = false;
                if (!(customerSheet instanceof ElementsSession.Customer.Components.CustomerSheet.Enabled)) {
                    canRemoveLastPaymentMethod = ((ElementsSession.Customer.Components.CustomerSheet.Enabled) customerSheet).getCanRemoveLastPaymentMethod();
                } else {
                    if (!(customerSheet instanceof ElementsSession.Customer.Components.CustomerSheet.Disabled)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    canRemoveLastPaymentMethod = false;
                }
                ElementsSession elementsSession = customerSessionElementsSession.getElementsSession();
                List<PaymentMethod> paymentMethods = customer.getPaymentMethods();
                PaymentMethodSaveConsentBehavior.Disabled disabled = new PaymentMethodSaveConsentBehavior.Disabled(PaymentMethod.AllowRedisplay.ALWAYS);
                boolean z = !configuration.getAllowsRemovalOfLastSavedPaymentMethod() && canRemoveLastPaymentMethod;
                customerSheet2 = customer.getSession().getComponents().getCustomerSheet();
                if (!(customerSheet2 instanceof ElementsSession.Customer.Components.CustomerSheet.Enabled)) {
                    zIsPaymentMethodRemoveEnabled = ((ElementsSession.Customer.Components.CustomerSheet.Enabled) customerSheet2).isPaymentMethodRemoveEnabled();
                } else if (!(customerSheet2 instanceof ElementsSession.Customer.Components.CustomerSheet.Disabled)) {
                    throw new NoWhenBranchMatchedException();
                }
                objM9118constructorimpl = Result.m9118constructorimpl(new CustomerSheetSession(elementsSession, paymentMethods, savedSelection, disabled, new CustomerPermissions(zIsPaymentMethodRemoveEnabled, z, true), customer.getDefaultPaymentMethod()));
                return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
            }
            ResultKt.throwOnFailure(obj);
            objCreateFailure = ((Result) obj).getValue();
            CustomerSessionInitializationDataSource customerSessionInitializationDataSource = CustomerSessionInitializationDataSource.this;
            CustomerSheet.Configuration configuration2 = this.$configuration;
            if (Result.m9125isSuccessimpl(objCreateFailure)) {
                Result.Companion companion2 = Result.INSTANCE;
                CustomerSessionElementsSession customerSessionElementsSession2 = (CustomerSessionElementsSession) objCreateFailure;
                CustomerSheetSavedSelectionDataSource customerSheetSavedSelectionDataSource = customerSessionInitializationDataSource.savedSelectionDataSource;
                this.L$0 = configuration2;
                this.L$1 = customerSessionElementsSession2;
                this.label = 2;
                Object objRetrieveSavedSelection = customerSheetSavedSelectionDataSource.retrieveSavedSelection(customerSessionElementsSession2, this);
                if (objRetrieveSavedSelection != coroutine_suspended) {
                    customerSessionElementsSession = customerSessionElementsSession2;
                    obj = objRetrieveSavedSelection;
                    configuration = configuration2;
                    Object objMo7270toResultd1pmJ482 = ((CustomerSheetDataResult) obj).mo7270toResultd1pmJ48();
                    ResultKt.throwOnFailure(objMo7270toResultd1pmJ482);
                    SavedSelection savedSelection2 = (SavedSelection) objMo7270toResultd1pmJ482;
                    ElementsSession.Customer customer2 = customerSessionElementsSession.getCustomer();
                    customerSheet = customer2.getSession().getComponents().getCustomerSheet();
                    boolean zIsPaymentMethodRemoveEnabled2 = false;
                    if (!(customerSheet instanceof ElementsSession.Customer.Components.CustomerSheet.Enabled)) {
                    }
                    ElementsSession elementsSession2 = customerSessionElementsSession.getElementsSession();
                    List<PaymentMethod> paymentMethods2 = customer2.getPaymentMethods();
                    PaymentMethodSaveConsentBehavior.Disabled disabled2 = new PaymentMethodSaveConsentBehavior.Disabled(PaymentMethod.AllowRedisplay.ALWAYS);
                    if (configuration.getAllowsRemovalOfLastSavedPaymentMethod()) {
                        customerSheet2 = customer2.getSession().getComponents().getCustomerSheet();
                        if (!(customerSheet2 instanceof ElementsSession.Customer.Components.CustomerSheet.Enabled)) {
                        }
                        objM9118constructorimpl = Result.m9118constructorimpl(new CustomerSheetSession(elementsSession2, paymentMethods2, savedSelection2, disabled2, new CustomerPermissions(zIsPaymentMethodRemoveEnabled2, z, true), customer2.getDefaultPaymentMethod()));
                    }
                    return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
                }
                return coroutine_suspended;
            }
            objM9118constructorimpl = Result.m9118constructorimpl(objCreateFailure);
            return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetInitializationDataSource
    public Object loadCustomerSheetSession(CustomerSheet.Configuration configuration, Continuation<? super CustomerSheetDataResult<CustomerSheetSession>> continuation) {
        return BuildersKt.withContext(this.workContext, new AnonymousClass2(configuration, null), continuation);
    }
}
