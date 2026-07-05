package com.stripe.android.paymentsheet.state;

import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.paymentsheet.model.SavedSelection;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$load$3$savedSelection$1", f = "PaymentElementLoader.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultPaymentElementLoader$load$3$savedSelection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SavedSelection>, Object> {
    final /* synthetic */ CommonConfiguration $configuration;
    final /* synthetic */ ElementsSession $elementsSession;
    final /* synthetic */ boolean $isGooglePayReady;
    int label;
    final /* synthetic */ DefaultPaymentElementLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPaymentElementLoader$load$3$savedSelection$1(DefaultPaymentElementLoader defaultPaymentElementLoader, CommonConfiguration commonConfiguration, boolean z, ElementsSession elementsSession, Continuation<? super DefaultPaymentElementLoader$load$3$savedSelection$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultPaymentElementLoader;
        this.$configuration = commonConfiguration;
        this.$isGooglePayReady = z;
        this.$elementsSession = elementsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultPaymentElementLoader$load$3$savedSelection$1(this.this$0, this.$configuration, this.$isGooglePayReady, this.$elementsSession, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SavedSelection> continuation) {
        return ((DefaultPaymentElementLoader$load$3$savedSelection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        this.label = 1;
        Object objRetrieveSavedSelection = this.this$0.retrieveSavedSelection(this.$configuration, this.$isGooglePayReady, this.$elementsSession, (Continuation<? super SavedSelection>) this);
        return objRetrieveSavedSelection == coroutine_suspended ? coroutine_suspended : objRetrieveSavedSelection;
    }
}
