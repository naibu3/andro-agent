package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FlowControllerConfigurationHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler$configureInternal$onConfigured$2", f = "FlowControllerConfigurationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class FlowControllerConfigurationHandler$configureInternal$onConfigured$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentSheet.FlowController.ConfigCallback $callback;
    final /* synthetic */ Throwable $error;
    int label;
    final /* synthetic */ FlowControllerConfigurationHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowControllerConfigurationHandler$configureInternal$onConfigured$2(FlowControllerConfigurationHandler flowControllerConfigurationHandler, Throwable th, PaymentSheet.FlowController.ConfigCallback configCallback, Continuation<? super FlowControllerConfigurationHandler$configureInternal$onConfigured$2> continuation) {
        super(2, continuation);
        this.this$0 = flowControllerConfigurationHandler;
        this.$error = th;
        this.$callback = configCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlowControllerConfigurationHandler$configureInternal$onConfigured$2(this.this$0, this.$error, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlowControllerConfigurationHandler$configureInternal$onConfigured$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.didLastConfigurationFail = this.$error != null;
        this.this$0.resetJob();
        PaymentSheet.FlowController.ConfigCallback configCallback = this.$callback;
        Throwable th = this.$error;
        configCallback.onConfigured(th == null, th);
        return Unit.INSTANCE;
    }
}
