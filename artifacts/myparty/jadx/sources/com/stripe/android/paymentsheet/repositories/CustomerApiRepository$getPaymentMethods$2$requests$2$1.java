package com.stripe.android.paymentsheet.repositories;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CustomerApiRepository.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2$requests$2$1", f = "CustomerApiRepository.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class CustomerApiRepository$getPaymentMethods$2$requests$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends PaymentMethod>>>, Object> {
    final /* synthetic */ CustomerRepository.CustomerInfo $customerInfo;
    final /* synthetic */ PaymentMethod.Type $paymentMethodType;
    int label;
    final /* synthetic */ CustomerApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerApiRepository$getPaymentMethods$2$requests$2$1(CustomerApiRepository customerApiRepository, CustomerRepository.CustomerInfo customerInfo, PaymentMethod.Type type, Continuation<? super CustomerApiRepository$getPaymentMethods$2$requests$2$1> continuation) {
        super(2, continuation);
        this.this$0 = customerApiRepository;
        this.$customerInfo = customerInfo;
        this.$paymentMethodType = type;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomerApiRepository$getPaymentMethods$2$requests$2$1(this.this$0, this.$customerInfo, this.$paymentMethodType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends PaymentMethod>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<PaymentMethod>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<PaymentMethod>>> continuation) {
        return ((CustomerApiRepository$getPaymentMethods$2$requests$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo8037getPaymentMethodsBWLJW6A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            objMo8037getPaymentMethodsBWLJW6A = this.this$0.stripeRepository.mo8037getPaymentMethodsBWLJW6A(new ListPaymentMethodsParams(this.$customerInfo.getId(), this.$paymentMethodType, Boxing.boxInt(100), null, null, 24, null), this.this$0.productUsageTokens, new ApiRequest.Options(this.$customerInfo.getEphemeralKeySecret(), ((PaymentConfiguration) this.this$0.lazyPaymentConfig.get()).getStripeAccountId(), null, 4, null), this);
            if (objMo8037getPaymentMethodsBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8037getPaymentMethodsBWLJW6A = ((Result) obj).getValue();
        }
        CustomerApiRepository customerApiRepository = this.this$0;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8037getPaymentMethodsBWLJW6A);
        if (thM9121exceptionOrNullimpl != null) {
            customerApiRepository.logger.error("Failed to retrieve payment methods.", thM9121exceptionOrNullimpl);
            ErrorReporter.DefaultImpls.report$default(customerApiRepository.errorReporter, ErrorReporter.ExpectedErrorEvent.GET_SAVED_PAYMENT_METHODS_FAILURE, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), null, 4, null);
        }
        CustomerApiRepository customerApiRepository2 = this.this$0;
        if (Result.m9125isSuccessimpl(objMo8037getPaymentMethodsBWLJW6A)) {
            ErrorReporter.DefaultImpls.report$default(customerApiRepository2.errorReporter, ErrorReporter.SuccessEvent.GET_SAVED_PAYMENT_METHODS_SUCCESS, null, null, 6, null);
        }
        return Result.m9117boximpl(objMo8037getPaymentMethodsBWLJW6A);
    }
}
