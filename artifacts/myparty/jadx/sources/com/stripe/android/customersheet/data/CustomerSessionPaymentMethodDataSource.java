package com.stripe.android.customersheet.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.internal.NativeProtocol;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.customersheet.util.SyncDefaultPaymentMethodUtilsKt;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodUpdateParams;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
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

/* compiled from: CustomerSessionPaymentMethodDataSource.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0096@¢\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSessionPaymentMethodDataSource;", "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;", "elementsSessionManager", "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "retrievePaymentMethods", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "", "Lcom/stripe/android/model/PaymentMethod;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentMethod", "paymentMethodId", "", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detachPaymentMethod", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSessionPaymentMethodDataSource implements CustomerSheetPaymentMethodDataSource {
    public static final int $stable = 8;
    private final CustomerRepository customerRepository;
    private final CustomerSessionElementsSessionManager elementsSessionManager;
    private final ErrorReporter errorReporter;
    private final CoroutineContext workContext;

    @Inject
    public CustomerSessionPaymentMethodDataSource(CustomerSessionElementsSessionManager elementsSessionManager, CustomerRepository customerRepository, ErrorReporter errorReporter, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(elementsSessionManager, "elementsSessionManager");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.elementsSessionManager = elementsSessionManager;
        this.customerRepository = customerRepository;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    /* compiled from: CustomerSessionPaymentMethodDataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionPaymentMethodDataSource$retrievePaymentMethods$2", f = "CustomerSessionPaymentMethodDataSource.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerSessionPaymentMethodDataSource$retrievePaymentMethods$2, reason: invalid class name and case insensitive filesystem */
    static final class C08442 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerSheetDataResult<List<? extends PaymentMethod>>>, Object> {
        int label;

        C08442(Continuation<? super C08442> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSessionPaymentMethodDataSource.this.new C08442(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerSheetDataResult<List<? extends PaymentMethod>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super CustomerSheetDataResult<List<PaymentMethod>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super CustomerSheetDataResult<List<PaymentMethod>>> continuation) {
            return ((C08442) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo7269fetchElementsSessionIoAF18A;
            Object objM9118constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo7269fetchElementsSessionIoAF18A = CustomerSessionPaymentMethodDataSource.this.elementsSessionManager.mo7269fetchElementsSessionIoAF18A(this);
                if (objMo7269fetchElementsSessionIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo7269fetchElementsSessionIoAF18A = ((Result) obj).getValue();
            }
            if (Result.m9125isSuccessimpl(objMo7269fetchElementsSessionIoAF18A)) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    CustomerSessionElementsSession customerSessionElementsSession = (CustomerSessionElementsSession) objMo7269fetchElementsSessionIoAF18A;
                    objM9118constructorimpl = Result.m9118constructorimpl(SyncDefaultPaymentMethodUtilsKt.filterToSupportedPaymentMethods(customerSessionElementsSession.getCustomer().getPaymentMethods(), SyncDefaultPaymentMethodUtilsKt.getDefaultPaymentMethodsEnabledForCustomerSheet(customerSessionElementsSession.getElementsSession())));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objMo7269fetchElementsSessionIoAF18A = ResultKt.createFailure(th);
                }
            } else {
                objM9118constructorimpl = Result.m9118constructorimpl(objMo7269fetchElementsSessionIoAF18A);
            }
            return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource
    public Object retrievePaymentMethods(Continuation<? super CustomerSheetDataResult<List<PaymentMethod>>> continuation) {
        return BuildersKt.withContext(this.workContext, new C08442(null), continuation);
    }

    /* compiled from: CustomerSessionPaymentMethodDataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionPaymentMethodDataSource$updatePaymentMethod$2", f = "CustomerSessionPaymentMethodDataSource.kt", i = {}, l = {39, 40}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerSessionPaymentMethodDataSource$updatePaymentMethod$2, reason: invalid class name and case insensitive filesystem */
    static final class C08452 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerSheetDataResult<PaymentMethod>>, Object> {
        final /* synthetic */ PaymentMethodUpdateParams $params;
        final /* synthetic */ String $paymentMethodId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08452(String str, PaymentMethodUpdateParams paymentMethodUpdateParams, Continuation<? super C08452> continuation) {
            super(2, continuation);
            this.$paymentMethodId = str;
            this.$params = paymentMethodUpdateParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSessionPaymentMethodDataSource.this.new C08452(this.$paymentMethodId, this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation) {
            return ((C08452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        
            if (r9 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objCreateFailure;
            Object objM9118constructorimpl;
            Object objMo8419updatePaymentMethodBWLJW6A;
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
                objCreateFailure = CustomerSessionPaymentMethodDataSource.this.elementsSessionManager.mo7268fetchCustomerSessionEphemeralKeyIoAF18A(this);
                if (objCreateFailure != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo8419updatePaymentMethodBWLJW6A = ((Result) obj).getValue();
                ResultKt.throwOnFailure(objMo8419updatePaymentMethodBWLJW6A);
                objM9118constructorimpl = Result.m9118constructorimpl((PaymentMethod) objMo8419updatePaymentMethodBWLJW6A);
                return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
            }
            ResultKt.throwOnFailure(obj);
            objCreateFailure = ((Result) obj).getValue();
            CustomerSessionPaymentMethodDataSource customerSessionPaymentMethodDataSource = CustomerSessionPaymentMethodDataSource.this;
            String str = this.$paymentMethodId;
            PaymentMethodUpdateParams paymentMethodUpdateParams = this.$params;
            if (Result.m9125isSuccessimpl(objCreateFailure)) {
                Result.Companion companion2 = Result.INSTANCE;
                CachedCustomerEphemeralKey cachedCustomerEphemeralKey = (CachedCustomerEphemeralKey) objCreateFailure;
                CustomerRepository customerRepository = customerSessionPaymentMethodDataSource.customerRepository;
                CustomerRepository.CustomerInfo customerInfo = new CustomerRepository.CustomerInfo(cachedCustomerEphemeralKey.getCustomerId(), cachedCustomerEphemeralKey.getEphemeralKey(), cachedCustomerEphemeralKey.getCustomerSessionClientSecret());
                this.label = 2;
                objMo8419updatePaymentMethodBWLJW6A = customerRepository.mo8419updatePaymentMethodBWLJW6A(customerInfo, str, paymentMethodUpdateParams, this);
            }
            objM9118constructorimpl = Result.m9118constructorimpl(objCreateFailure);
            return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource
    public Object updatePaymentMethod(String str, PaymentMethodUpdateParams paymentMethodUpdateParams, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation) {
        return BuildersKt.withContext(this.workContext, new C08452(str, paymentMethodUpdateParams, null), continuation);
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource
    public Object attachPaymentMethod(String str, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation) {
        ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION, null, null, 6, null);
        return CustomerSheetDataResult.INSTANCE.failure(new IllegalStateException("'attach' is not supported for `CustomerSession`!"), null);
    }

    /* compiled from: CustomerSessionPaymentMethodDataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionPaymentMethodDataSource$detachPaymentMethod$2", f = "CustomerSessionPaymentMethodDataSource.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerSessionPaymentMethodDataSource$detachPaymentMethod$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerSheetDataResult<PaymentMethod>>, Object> {
        final /* synthetic */ String $paymentMethodId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$paymentMethodId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSessionPaymentMethodDataSource.this.new AnonymousClass2(this.$paymentMethodId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        
            if (r9 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objCreateFailure;
            Object objM9118constructorimpl;
            Object objMo8416detachPaymentMethodBWLJW6A;
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
                objCreateFailure = CustomerSessionPaymentMethodDataSource.this.elementsSessionManager.mo7268fetchCustomerSessionEphemeralKeyIoAF18A(this);
                if (objCreateFailure != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo8416detachPaymentMethodBWLJW6A = ((Result) obj).getValue();
                ResultKt.throwOnFailure(objMo8416detachPaymentMethodBWLJW6A);
                objM9118constructorimpl = Result.m9118constructorimpl((PaymentMethod) objMo8416detachPaymentMethodBWLJW6A);
                return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
            }
            ResultKt.throwOnFailure(obj);
            objCreateFailure = ((Result) obj).getValue();
            CustomerSessionPaymentMethodDataSource customerSessionPaymentMethodDataSource = CustomerSessionPaymentMethodDataSource.this;
            String str = this.$paymentMethodId;
            if (Result.m9125isSuccessimpl(objCreateFailure)) {
                Result.Companion companion2 = Result.INSTANCE;
                CachedCustomerEphemeralKey cachedCustomerEphemeralKey = (CachedCustomerEphemeralKey) objCreateFailure;
                CustomerRepository customerRepository = customerSessionPaymentMethodDataSource.customerRepository;
                CustomerRepository.CustomerInfo customerInfo = new CustomerRepository.CustomerInfo(cachedCustomerEphemeralKey.getCustomerId(), cachedCustomerEphemeralKey.getEphemeralKey(), cachedCustomerEphemeralKey.getCustomerSessionClientSecret());
                this.label = 2;
                objMo8416detachPaymentMethodBWLJW6A = customerRepository.mo8416detachPaymentMethodBWLJW6A(customerInfo, str, true, this);
            }
            objM9118constructorimpl = Result.m9118constructorimpl(objCreateFailure);
            return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource
    public Object detachPaymentMethod(String str, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation) {
        return BuildersKt.withContext(this.workContext, new AnonymousClass2(str, null), continuation);
    }
}
