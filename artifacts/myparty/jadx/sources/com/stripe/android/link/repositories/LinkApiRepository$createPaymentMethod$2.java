package com.stripe.android.link.repositories;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.confirmation.DefaultLinkConfirmationHandlerKt;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
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

/* compiled from: LinkApiRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository$createPaymentMethod$2", f = "LinkApiRepository.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class LinkApiRepository$createPaymentMethod$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PaymentMethod>>, Object> {
    final /* synthetic */ String $consumerSessionClientSecret;
    final /* synthetic */ LinkPaymentMethod $paymentMethod;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkApiRepository$createPaymentMethod$2(LinkPaymentMethod linkPaymentMethod, String str, LinkApiRepository linkApiRepository, Continuation<? super LinkApiRepository$createPaymentMethod$2> continuation) {
        super(2, continuation);
        this.$paymentMethod = linkPaymentMethod;
        this.$consumerSessionClientSecret = str;
        this.this$0 = linkApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkApiRepository$createPaymentMethod$2(this.$paymentMethod, this.$consumerSessionClientSecret, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends PaymentMethod>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<PaymentMethod>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<PaymentMethod>> continuation) {
        return ((LinkApiRepository$createPaymentMethod$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo8025createPaymentMethod0E7RQCE;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentMethodCreateParams paymentMethodCreateParamsCreatePaymentMethodCreateParams = DefaultLinkConfirmationHandlerKt.createPaymentMethodCreateParams(this.$paymentMethod.getDetails(), this.$consumerSessionClientSecret, this.$paymentMethod.getCollectedCvc(), this.$paymentMethod.getBillingPhone());
            this.label = 1;
            objMo8025createPaymentMethod0E7RQCE = this.this$0.stripeRepository.mo8025createPaymentMethod0E7RQCE(paymentMethodCreateParamsCreatePaymentMethodCreateParams, new ApiRequest.Options(this.this$0.publishableKeyProvider, this.this$0.stripeAccountIdProvider), this);
            if (objMo8025createPaymentMethod0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8025createPaymentMethod0E7RQCE = ((Result) obj).getValue();
        }
        return Result.m9117boximpl(objMo8025createPaymentMethod0E7RQCE);
    }
}
