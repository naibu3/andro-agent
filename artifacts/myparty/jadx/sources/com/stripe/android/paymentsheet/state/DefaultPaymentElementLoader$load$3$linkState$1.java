package com.stripe.android.paymentsheet.state;

import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.link.model.LinkAppearance;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentElementLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/state/LinkState;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$load$3$linkState$1", f = "PaymentElementLoader.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultPaymentElementLoader$load$3$linkState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LinkState>, Object> {
    final /* synthetic */ CommonConfiguration $configuration;
    final /* synthetic */ DefaultPaymentElementLoader.CustomerInfo $customerInfo;
    final /* synthetic */ ElementsSession $elementsSession;
    final /* synthetic */ PaymentElementLoader.InitializationMode $initializationMode;
    int label;
    final /* synthetic */ DefaultPaymentElementLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPaymentElementLoader$load$3$linkState$1(CommonConfiguration commonConfiguration, DefaultPaymentElementLoader defaultPaymentElementLoader, ElementsSession elementsSession, DefaultPaymentElementLoader.CustomerInfo customerInfo, PaymentElementLoader.InitializationMode initializationMode, Continuation<? super DefaultPaymentElementLoader$load$3$linkState$1> continuation) {
        super(2, continuation);
        this.$configuration = commonConfiguration;
        this.this$0 = defaultPaymentElementLoader;
        this.$elementsSession = elementsSession;
        this.$customerInfo = customerInfo;
        this.$initializationMode = initializationMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultPaymentElementLoader$load$3$linkState$1(this.$configuration, this.this$0, this.$elementsSession, this.$customerInfo, this.$initializationMode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LinkState> continuation) {
        return ((DefaultPaymentElementLoader$load$3$linkState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        LinkAppearance linkAppearance = this.$configuration.getLinkAppearance();
        this.label = 1;
        Object objCreateLinkState = this.this$0.createLinkState(this.$elementsSession, this.$configuration, this.$customerInfo, this.$initializationMode, linkAppearance, this);
        return objCreateLinkState == coroutine_suspended ? coroutine_suspended : objCreateLinkState;
    }
}
