package com.stripe.android.customersheet;

import com.stripe.android.customersheet.CustomerAdapter;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.R;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StripeCustomerAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter$setSelectedPaymentOption$2$1", f = "StripeCustomerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class StripeCustomerAdapter$setSelectedPaymentOption$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerAdapter.Result<Unit>>, Object> {
    final /* synthetic */ CustomerAdapter.PaymentOption $paymentOption;
    final /* synthetic */ PrefsRepository $prefsRepository;
    int label;
    final /* synthetic */ StripeCustomerAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeCustomerAdapter$setSelectedPaymentOption$2$1(PrefsRepository prefsRepository, CustomerAdapter.PaymentOption paymentOption, StripeCustomerAdapter stripeCustomerAdapter, Continuation<StripeCustomerAdapter$setSelectedPaymentOption$2$1> continuation) {
        super(2, continuation);
        this.$prefsRepository = prefsRepository;
        this.$paymentOption = paymentOption;
        this.this$0 = stripeCustomerAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StripeCustomerAdapter$setSelectedPaymentOption$2$1(this.$prefsRepository, this.$paymentOption, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerAdapter.Result<Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<CustomerAdapter.Result<Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<CustomerAdapter.Result<Unit>> continuation) {
        return ((StripeCustomerAdapter$setSelectedPaymentOption$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PrefsRepository prefsRepository = this.$prefsRepository;
        CustomerAdapter.PaymentOption paymentOption = this.$paymentOption;
        if (prefsRepository.setSavedSelection(paymentOption != null ? paymentOption.toSavedSelection$paymentsheet_release() : null)) {
            return CustomerAdapter.Result.INSTANCE.success(Unit.INSTANCE);
        }
        return CustomerAdapter.Result.INSTANCE.failure(new IOException("Unable to persist payment option " + this.$paymentOption), this.this$0.context.getString(R.string.stripe_something_went_wrong));
    }
}
