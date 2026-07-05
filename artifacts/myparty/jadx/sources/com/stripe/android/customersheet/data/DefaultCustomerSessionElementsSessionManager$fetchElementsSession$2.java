package com.stripe.android.customersheet.data;

import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CustomerSessionElementsSessionManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.data.DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2", f = "CustomerSessionElementsSessionManager.kt", i = {1, 2, 2, 3}, l = {63, 68, 75, 80}, m = "invokeSuspend", n = {"intentConfiguration", "customerSessionClientSecret", "intentConfiguration", "customerSessionClientSecret"}, s = {"L$1", "L$1", "L$2", "L$1"})
/* loaded from: classes5.dex */
final class DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends CustomerSessionElementsSession>>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DefaultCustomerSessionElementsSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2(DefaultCustomerSessionElementsSessionManager defaultCustomerSessionElementsSessionManager, Continuation<? super DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2> continuation) {
        super(2, continuation);
        this.this$0 = defaultCustomerSessionElementsSessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2 defaultCustomerSessionElementsSessionManager$fetchElementsSession$2 = new DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2(this.this$0, continuation);
        defaultCustomerSessionElementsSessionManager$fetchElementsSession$2.L$0 = obj;
        return defaultCustomerSessionElementsSessionManager$fetchElementsSession$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends CustomerSessionElementsSession>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<CustomerSessionElementsSession>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<CustomerSessionElementsSession>> continuation) {
        return ((DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4 A[Catch: all -> 0x0195, TryCatch #0 {all -> 0x0195, blocks: (B:9:0x001e, B:52:0x013f, B:54:0x0145, B:55:0x014b, B:57:0x0151, B:58:0x0154, B:65:0x017b, B:67:0x0181, B:68:0x018b, B:64:0x0177, B:63:0x016c, B:14:0x003f, B:40:0x00df, B:42:0x00e4, B:44:0x00e8, B:46:0x010c, B:48:0x0113, B:17:0x0050, B:36:0x00b3, B:20:0x0060, B:28:0x008d, B:30:0x0093, B:31:0x0099, B:32:0x009f, B:23:0x0075, B:25:0x007d, B:60:0x015a), top: B:74:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c A[Catch: all -> 0x0195, TryCatch #0 {all -> 0x0195, blocks: (B:9:0x001e, B:52:0x013f, B:54:0x0145, B:55:0x014b, B:57:0x0151, B:58:0x0154, B:65:0x017b, B:67:0x0181, B:68:0x018b, B:64:0x0177, B:63:0x016c, B:14:0x003f, B:40:0x00df, B:42:0x00e4, B:44:0x00e8, B:46:0x010c, B:48:0x0113, B:17:0x0050, B:36:0x00b3, B:20:0x0060, B:28:0x008d, B:30:0x0093, B:31:0x0099, B:32:0x009f, B:23:0x0075, B:25:0x007d, B:60:0x015a), top: B:74:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145 A[Catch: all -> 0x0195, TryCatch #0 {all -> 0x0195, blocks: (B:9:0x001e, B:52:0x013f, B:54:0x0145, B:55:0x014b, B:57:0x0151, B:58:0x0154, B:65:0x017b, B:67:0x0181, B:68:0x018b, B:64:0x0177, B:63:0x016c, B:14:0x003f, B:40:0x00df, B:42:0x00e4, B:44:0x00e8, B:46:0x010c, B:48:0x0113, B:17:0x0050, B:36:0x00b3, B:20:0x0060, B:28:0x008d, B:30:0x0093, B:31:0x0099, B:32:0x009f, B:23:0x0075, B:25:0x007d, B:60:0x015a), top: B:74:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151 A[Catch: all -> 0x0195, TryCatch #0 {all -> 0x0195, blocks: (B:9:0x001e, B:52:0x013f, B:54:0x0145, B:55:0x014b, B:57:0x0151, B:58:0x0154, B:65:0x017b, B:67:0x0181, B:68:0x018b, B:64:0x0177, B:63:0x016c, B:14:0x003f, B:40:0x00df, B:42:0x00e4, B:44:0x00e8, B:46:0x010c, B:48:0x0113, B:17:0x0050, B:36:0x00b3, B:20:0x0060, B:28:0x008d, B:30:0x0093, B:31:0x0099, B:32:0x009f, B:23:0x0075, B:25:0x007d, B:60:0x015a), top: B:74:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177 A[Catch: all -> 0x0195, TryCatch #0 {all -> 0x0195, blocks: (B:9:0x001e, B:52:0x013f, B:54:0x0145, B:55:0x014b, B:57:0x0151, B:58:0x0154, B:65:0x017b, B:67:0x0181, B:68:0x018b, B:64:0x0177, B:63:0x016c, B:14:0x003f, B:40:0x00df, B:42:0x00e4, B:44:0x00e8, B:46:0x010c, B:48:0x0113, B:17:0x0050, B:36:0x00b3, B:20:0x0060, B:28:0x008d, B:30:0x0093, B:31:0x0099, B:32:0x009f, B:23:0x0075, B:25:0x007d, B:60:0x015a), top: B:74:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181 A[Catch: all -> 0x0195, TryCatch #0 {all -> 0x0195, blocks: (B:9:0x001e, B:52:0x013f, B:54:0x0145, B:55:0x014b, B:57:0x0151, B:58:0x0154, B:65:0x017b, B:67:0x0181, B:68:0x018b, B:64:0x0177, B:63:0x016c, B:14:0x003f, B:40:0x00df, B:42:0x00e4, B:44:0x00e8, B:46:0x010c, B:48:0x0113, B:17:0x0050, B:36:0x00b3, B:20:0x0060, B:28:0x008d, B:30:0x0093, B:31:0x0099, B:32:0x009f, B:23:0x0075, B:25:0x007d, B:60:0x015a), top: B:74:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM9118constructorimpl;
        DefaultCustomerSessionElementsSessionManager defaultCustomerSessionElementsSessionManager;
        CustomerSheet.IntentConfiguration intentConfiguration;
        Object objM7242intentConfigurationIoAF18A;
        Object objM7244providesCustomerSessionClientSecretIoAF18A;
        DefaultCustomerSessionElementsSessionManager defaultCustomerSessionElementsSessionManager2;
        CustomerSheet.IntentConfiguration intentConfiguration2;
        Object savedSelection;
        DefaultCustomerSessionElementsSessionManager defaultCustomerSessionElementsSessionManager3;
        CustomerSheet.CustomerSessionClientSecret customerSessionClientSecret;
        Object objMo8420gethUnOzRk;
        CustomerSheet.CustomerSessionClientSecret customerSessionClientSecret2;
        DefaultCustomerSessionElementsSessionManager defaultCustomerSessionElementsSessionManager4;
        Throwable thM9121exceptionOrNullimpl;
        Object objM9118constructorimpl2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            defaultCustomerSessionElementsSessionManager = this.this$0;
            Result.Companion companion2 = Result.INSTANCE;
            intentConfiguration = defaultCustomerSessionElementsSessionManager.intentConfiguration;
            if (intentConfiguration == null) {
                CustomerSheet.CustomerSessionProvider customerSessionProvider = defaultCustomerSessionElementsSessionManager.customerSessionProvider;
                this.L$0 = defaultCustomerSessionElementsSessionManager;
                this.label = 1;
                objM7242intentConfigurationIoAF18A = customerSessionProvider.m7242intentConfigurationIoAF18A(this);
                if (objM7242intentConfigurationIoAF18A == coroutine_suspended) {
                }
            } else {
                CustomerSheet.CustomerSessionProvider customerSessionProvider2 = defaultCustomerSessionElementsSessionManager.customerSessionProvider;
                this.L$0 = defaultCustomerSessionElementsSessionManager;
                this.L$1 = intentConfiguration;
                this.label = 2;
                objM7244providesCustomerSessionClientSecretIoAF18A = customerSessionProvider2.m7244providesCustomerSessionClientSecretIoAF18A(this);
                if (objM7244providesCustomerSessionClientSecretIoAF18A == coroutine_suspended) {
                    defaultCustomerSessionElementsSessionManager2 = defaultCustomerSessionElementsSessionManager;
                    intentConfiguration2 = intentConfiguration;
                    ResultKt.throwOnFailure(objM7244providesCustomerSessionClientSecretIoAF18A);
                    CustomerSheet.CustomerSessionClientSecret customerSessionClientSecret3 = (CustomerSheet.CustomerSessionClientSecret) objM7244providesCustomerSessionClientSecretIoAF18A;
                    defaultCustomerSessionElementsSessionManager2.validateCustomerSessionClientSecret(customerSessionClientSecret3.getClientSecret());
                    PrefsRepository prefsRepository = (PrefsRepository) defaultCustomerSessionElementsSessionManager2.prefsRepositoryFactory.invoke(customerSessionClientSecret3.getCustomerId());
                    this.L$0 = defaultCustomerSessionElementsSessionManager2;
                    this.L$1 = customerSessionClientSecret3;
                    this.L$2 = intentConfiguration2;
                    this.label = 3;
                    savedSelection = prefsRepository.getSavedSelection(false, false, this);
                    if (savedSelection != coroutine_suspended) {
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                intentConfiguration2 = (CustomerSheet.IntentConfiguration) this.L$1;
                defaultCustomerSessionElementsSessionManager2 = (DefaultCustomerSessionElementsSessionManager) this.L$0;
                ResultKt.throwOnFailure(obj);
                objM7244providesCustomerSessionClientSecretIoAF18A = ((Result) obj).getValue();
                ResultKt.throwOnFailure(objM7244providesCustomerSessionClientSecretIoAF18A);
                CustomerSheet.CustomerSessionClientSecret customerSessionClientSecret32 = (CustomerSheet.CustomerSessionClientSecret) objM7244providesCustomerSessionClientSecretIoAF18A;
                defaultCustomerSessionElementsSessionManager2.validateCustomerSessionClientSecret(customerSessionClientSecret32.getClientSecret());
                PrefsRepository prefsRepository2 = (PrefsRepository) defaultCustomerSessionElementsSessionManager2.prefsRepositoryFactory.invoke(customerSessionClientSecret32.getCustomerId());
                this.L$0 = defaultCustomerSessionElementsSessionManager2;
                this.L$1 = customerSessionClientSecret32;
                this.L$2 = intentConfiguration2;
                this.label = 3;
                savedSelection = prefsRepository2.getSavedSelection(false, false, this);
                if (savedSelection != coroutine_suspended) {
                    return coroutine_suspended;
                }
                defaultCustomerSessionElementsSessionManager3 = defaultCustomerSessionElementsSessionManager2;
                customerSessionClientSecret = customerSessionClientSecret32;
                if (!(savedSelection instanceof SavedSelection.PaymentMethod)) {
                }
                CustomerSheet.IntentConfiguration intentConfiguration3 = intentConfiguration2;
                ElementsSessionRepository elementsSessionRepository = defaultCustomerSessionElementsSessionManager3.elementsSessionRepository;
                PaymentElementLoader.InitializationMode.DeferredIntent deferredIntent = new PaymentElementLoader.InitializationMode.DeferredIntent(new PaymentSheet.IntentConfiguration(new PaymentSheet.IntentConfiguration.Mode.Setup(null, null, 3, null), intentConfiguration3.getPaymentMethodTypes$paymentsheet_release(), null, null, false, 28, null));
                if (paymentMethod == null) {
                }
                PaymentSheet.CustomerConfiguration customerConfigurationCreateWithCustomerSession = PaymentSheet.CustomerConfiguration.INSTANCE.createWithCustomerSession(customerSessionClientSecret.getCustomerId(), customerSessionClientSecret.getClientSecret());
                List<PaymentSheet.CustomPaymentMethod> listEmptyList = CollectionsKt.emptyList();
                List<String> listEmptyList2 = CollectionsKt.emptyList();
                this.L$0 = defaultCustomerSessionElementsSessionManager3;
                this.L$1 = customerSessionClientSecret;
                this.L$2 = null;
                this.label = 4;
                objMo8420gethUnOzRk = elementsSessionRepository.mo8420gethUnOzRk(deferredIntent, customerConfigurationCreateWithCustomerSession, listEmptyList, listEmptyList2, id, this);
                if (objMo8420gethUnOzRk != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                customerSessionClientSecret2 = (CustomerSheet.CustomerSessionClientSecret) this.L$1;
                defaultCustomerSessionElementsSessionManager4 = (DefaultCustomerSessionElementsSessionManager) this.L$0;
                ResultKt.throwOnFailure(obj);
                objMo8420gethUnOzRk = ((Result) obj).getValue();
                if (Result.m9125isSuccessimpl(objMo8420gethUnOzRk)) {
                    defaultCustomerSessionElementsSessionManager4.reportSuccessfulElementsSessionLoad();
                }
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8420gethUnOzRk);
                if (thM9121exceptionOrNullimpl != null) {
                    defaultCustomerSessionElementsSessionManager4.reportFailedElementsSessionLoad(thM9121exceptionOrNullimpl);
                }
                if (Result.m9125isSuccessimpl(objMo8420gethUnOzRk)) {
                    objM9118constructorimpl2 = Result.m9118constructorimpl(objMo8420gethUnOzRk);
                } else {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        objM9118constructorimpl2 = Result.m9118constructorimpl(defaultCustomerSessionElementsSessionManager4.createCustomerSessionElementsSession((ElementsSession) objMo8420gethUnOzRk, customerSessionClientSecret2.getClientSecret()));
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th2));
                    }
                }
                if (Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
                    defaultCustomerSessionElementsSessionManager4.cachedCustomerEphemeralKey = ((CustomerSessionElementsSession) objM9118constructorimpl2).getEphemeralKey();
                }
                ResultKt.throwOnFailure(objM9118constructorimpl2);
                objM9118constructorimpl = Result.m9118constructorimpl((CustomerSessionElementsSession) objM9118constructorimpl2);
                return Result.m9117boximpl(objM9118constructorimpl);
            }
            intentConfiguration2 = (CustomerSheet.IntentConfiguration) this.L$2;
            CustomerSheet.CustomerSessionClientSecret customerSessionClientSecret4 = (CustomerSheet.CustomerSessionClientSecret) this.L$1;
            DefaultCustomerSessionElementsSessionManager defaultCustomerSessionElementsSessionManager5 = (DefaultCustomerSessionElementsSessionManager) this.L$0;
            ResultKt.throwOnFailure(obj);
            savedSelection = obj;
            customerSessionClientSecret = customerSessionClientSecret4;
            defaultCustomerSessionElementsSessionManager3 = defaultCustomerSessionElementsSessionManager5;
            SavedSelection.PaymentMethod paymentMethod = !(savedSelection instanceof SavedSelection.PaymentMethod) ? (SavedSelection.PaymentMethod) savedSelection : null;
            CustomerSheet.IntentConfiguration intentConfiguration32 = intentConfiguration2;
            ElementsSessionRepository elementsSessionRepository2 = defaultCustomerSessionElementsSessionManager3.elementsSessionRepository;
            PaymentElementLoader.InitializationMode.DeferredIntent deferredIntent2 = new PaymentElementLoader.InitializationMode.DeferredIntent(new PaymentSheet.IntentConfiguration(new PaymentSheet.IntentConfiguration.Mode.Setup(null, null, 3, null), intentConfiguration32.getPaymentMethodTypes$paymentsheet_release(), null, null, false, 28, null));
            String id = paymentMethod == null ? paymentMethod.getId() : null;
            PaymentSheet.CustomerConfiguration customerConfigurationCreateWithCustomerSession2 = PaymentSheet.CustomerConfiguration.INSTANCE.createWithCustomerSession(customerSessionClientSecret.getCustomerId(), customerSessionClientSecret.getClientSecret());
            List<PaymentSheet.CustomPaymentMethod> listEmptyList3 = CollectionsKt.emptyList();
            List<String> listEmptyList22 = CollectionsKt.emptyList();
            this.L$0 = defaultCustomerSessionElementsSessionManager3;
            this.L$1 = customerSessionClientSecret;
            this.L$2 = null;
            this.label = 4;
            objMo8420gethUnOzRk = elementsSessionRepository2.mo8420gethUnOzRk(deferredIntent2, customerConfigurationCreateWithCustomerSession2, listEmptyList3, listEmptyList22, id, this);
            if (objMo8420gethUnOzRk != coroutine_suspended) {
                customerSessionClientSecret2 = customerSessionClientSecret;
                defaultCustomerSessionElementsSessionManager4 = defaultCustomerSessionElementsSessionManager3;
                if (Result.m9125isSuccessimpl(objMo8420gethUnOzRk)) {
                }
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8420gethUnOzRk);
                if (thM9121exceptionOrNullimpl != null) {
                }
                if (Result.m9125isSuccessimpl(objMo8420gethUnOzRk)) {
                }
                if (Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
                }
                ResultKt.throwOnFailure(objM9118constructorimpl2);
                objM9118constructorimpl = Result.m9118constructorimpl((CustomerSessionElementsSession) objM9118constructorimpl2);
                return Result.m9117boximpl(objM9118constructorimpl);
            }
            return coroutine_suspended;
        }
        defaultCustomerSessionElementsSessionManager = (DefaultCustomerSessionElementsSessionManager) this.L$0;
        ResultKt.throwOnFailure(obj);
        objM7242intentConfigurationIoAF18A = ((Result) obj).getValue();
        if (Result.m9125isSuccessimpl(objM7242intentConfigurationIoAF18A)) {
            defaultCustomerSessionElementsSessionManager.intentConfiguration = (CustomerSheet.IntentConfiguration) objM7242intentConfigurationIoAF18A;
        }
        ResultKt.throwOnFailure(objM7242intentConfigurationIoAF18A);
        intentConfiguration = (CustomerSheet.IntentConfiguration) objM7242intentConfigurationIoAF18A;
        CustomerSheet.CustomerSessionProvider customerSessionProvider22 = defaultCustomerSessionElementsSessionManager.customerSessionProvider;
        this.L$0 = defaultCustomerSessionElementsSessionManager;
        this.L$1 = intentConfiguration;
        this.label = 2;
        objM7244providesCustomerSessionClientSecretIoAF18A = customerSessionProvider22.m7244providesCustomerSessionClientSecretIoAF18A(this);
        if (objM7244providesCustomerSessionClientSecretIoAF18A == coroutine_suspended) {
        }
    }
}
