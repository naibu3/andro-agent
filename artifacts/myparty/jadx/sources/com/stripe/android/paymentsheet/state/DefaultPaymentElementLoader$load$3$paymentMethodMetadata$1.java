package com.stripe.android.paymentsheet.state;

import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: PaymentElementLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$load$3$paymentMethodMetadata$1", f = "PaymentElementLoader.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultPaymentElementLoader$load$3$paymentMethodMetadata$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PaymentMethodMetadata>, Object> {
    final /* synthetic */ CommonConfiguration $configuration;
    final /* synthetic */ DefaultPaymentElementLoader.CustomerInfo $customerInfo;
    final /* synthetic */ ElementsSession $elementsSession;
    final /* synthetic */ boolean $isGooglePayReady;
    final /* synthetic */ Deferred<LinkState> $linkState;
    int label;
    final /* synthetic */ DefaultPaymentElementLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPaymentElementLoader$load$3$paymentMethodMetadata$1(Deferred<LinkState> deferred, DefaultPaymentElementLoader defaultPaymentElementLoader, CommonConfiguration commonConfiguration, ElementsSession elementsSession, DefaultPaymentElementLoader.CustomerInfo customerInfo, boolean z, Continuation<? super DefaultPaymentElementLoader$load$3$paymentMethodMetadata$1> continuation) {
        super(2, continuation);
        this.$linkState = deferred;
        this.this$0 = defaultPaymentElementLoader;
        this.$configuration = commonConfiguration;
        this.$elementsSession = elementsSession;
        this.$customerInfo = customerInfo;
        this.$isGooglePayReady = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultPaymentElementLoader$load$3$paymentMethodMetadata$1(this.$linkState, this.this$0, this.$configuration, this.$elementsSession, this.$customerInfo, this.$isGooglePayReady, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PaymentMethodMetadata> continuation) {
        return ((DefaultPaymentElementLoader$load$3$paymentMethodMetadata$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$linkState.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return this.this$0.createPaymentMethodMetadata(this.$configuration, this.$elementsSession, this.$customerInfo, (LinkState) obj, this.$isGooglePayReady);
    }
}
