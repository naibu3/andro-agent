package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.DuplicatePaymentMethodDetachFailureException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CustomerApiRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1", f = "CustomerApiRepository.kt", i = {0}, l = {281}, m = "invokeSuspend", n = {"id"}, s = {"L$1"})
/* loaded from: classes6.dex */
final class CustomerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PaymentMethod>>, Object> {
    final /* synthetic */ CustomerRepository.CustomerInfo $customerInfo;
    final /* synthetic */ List<DuplicatePaymentMethodDetachFailureException.DuplicateDetachFailure> $failureResults;
    final /* synthetic */ PaymentMethod $paymentMethod;
    final /* synthetic */ CustomerRepository $this_detachPaymentMethodAndDuplicates;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1(PaymentMethod paymentMethod, CustomerRepository customerRepository, CustomerRepository.CustomerInfo customerInfo, List<DuplicatePaymentMethodDetachFailureException.DuplicateDetachFailure> list, Continuation<? super CustomerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1> continuation) {
        super(2, continuation);
        this.$paymentMethod = paymentMethod;
        this.$this_detachPaymentMethodAndDuplicates = customerRepository;
        this.$customerInfo = customerInfo;
        this.$failureResults = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1(this.$paymentMethod, this.$this_detachPaymentMethodAndDuplicates, this.$customerInfo, this.$failureResults, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends PaymentMethod>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<PaymentMethod>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<PaymentMethod>> continuation) {
        return ((CustomerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object value;
        List<DuplicatePaymentMethodDetachFailureException.DuplicateDetachFailure> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = this.$paymentMethod.id;
            if (str2 == null) {
                return null;
            }
            CustomerRepository customerRepository = this.$this_detachPaymentMethodAndDuplicates;
            CustomerRepository.CustomerInfo customerInfo = this.$customerInfo;
            List<DuplicatePaymentMethodDetachFailureException.DuplicateDetachFailure> list2 = this.$failureResults;
            this.L$0 = list2;
            this.L$1 = str2;
            this.label = 1;
            Object objMo8416detachPaymentMethodBWLJW6A = customerRepository.mo8416detachPaymentMethodBWLJW6A(customerInfo, str2, false, this);
            if (objMo8416detachPaymentMethodBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
            value = objMo8416detachPaymentMethodBWLJW6A;
            list = list2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            list = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            value = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(value);
        if (thM9121exceptionOrNullimpl != null) {
            list.add(new DuplicatePaymentMethodDetachFailureException.DuplicateDetachFailure(str, thM9121exceptionOrNullimpl));
        }
        return Result.m9117boximpl(value);
    }
}
