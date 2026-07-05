package com.stripe.android.customersheet.data;

import com.stripe.android.customersheet.CustomerSheet;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSessionIntentDataSource.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSessionIntentDataSource;", "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;", "elementsSessionManager", "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;", "customerSessionProvider", "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;", "<init>", "(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;)V", "canCreateSetupIntents", "", "getCanCreateSetupIntents", "()Z", "retrieveSetupIntentClientSecret", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSessionIntentDataSource implements CustomerSheetIntentDataSource {
    public static final int $stable = 8;
    private final boolean canCreateSetupIntents;
    private final CustomerSheet.CustomerSessionProvider customerSessionProvider;
    private final CustomerSessionElementsSessionManager elementsSessionManager;

    /* compiled from: CustomerSessionIntentDataSource.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionIntentDataSource", f = "CustomerSessionIntentDataSource.kt", i = {0}, l = {15, 16}, m = "retrieveSetupIntentClientSecret", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.customersheet.data.CustomerSessionIntentDataSource$retrieveSetupIntentClientSecret$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerSessionIntentDataSource.this.retrieveSetupIntentClientSecret(this);
        }
    }

    @Inject
    public CustomerSessionIntentDataSource(CustomerSessionElementsSessionManager elementsSessionManager, CustomerSheet.CustomerSessionProvider customerSessionProvider) {
        Intrinsics.checkNotNullParameter(elementsSessionManager, "elementsSessionManager");
        Intrinsics.checkNotNullParameter(customerSessionProvider, "customerSessionProvider");
        this.elementsSessionManager = elementsSessionManager;
        this.customerSessionProvider = customerSessionProvider;
        this.canCreateSetupIntents = true;
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetIntentDataSource
    public boolean getCanCreateSetupIntents() {
        return this.canCreateSetupIntents;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.data.CustomerSheetIntentDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrieveSetupIntentClientSecret(Continuation<? super CustomerSheetDataResult<String>> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objCreateFailure;
        Object objM9118constructorimpl;
        CustomerSessionIntentDataSource customerSessionIntentDataSource;
        Object objM7243provideSetupIntentClientSecretgIAlus;
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
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objCreateFailure = ResultKt.createFailure(th);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CustomerSessionElementsSessionManager customerSessionElementsSessionManager = this.elementsSessionManager;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objCreateFailure = customerSessionElementsSessionManager.mo7268fetchCustomerSessionEphemeralKeyIoAF18A(anonymousClass1);
            if (objCreateFailure != coroutine_suspended) {
                customerSessionIntentDataSource = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM7243provideSetupIntentClientSecretgIAlus = ((Result) obj).getValue();
            ResultKt.throwOnFailure(objM7243provideSetupIntentClientSecretgIAlus);
            objM9118constructorimpl = Result.m9118constructorimpl((String) objM7243provideSetupIntentClientSecretgIAlus);
            return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
        }
        customerSessionIntentDataSource = (CustomerSessionIntentDataSource) anonymousClass1.L$0;
        ResultKt.throwOnFailure(obj);
        objCreateFailure = ((Result) obj).getValue();
        if (Result.m9125isSuccessimpl(objCreateFailure)) {
            Result.Companion companion2 = Result.INSTANCE;
            CustomerSheet.CustomerSessionProvider customerSessionProvider = customerSessionIntentDataSource.customerSessionProvider;
            String customerId = ((CachedCustomerEphemeralKey) objCreateFailure).getCustomerId();
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 2;
            objM7243provideSetupIntentClientSecretgIAlus = customerSessionProvider.m7243provideSetupIntentClientSecretgIAlus(customerId, anonymousClass1);
        }
        objM9118constructorimpl = Result.m9118constructorimpl(objCreateFailure);
        return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
    }
}
