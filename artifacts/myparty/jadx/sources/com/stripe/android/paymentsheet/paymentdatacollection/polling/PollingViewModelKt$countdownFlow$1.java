package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: PollingViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/time/Duration;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModelKt$countdownFlow$1", f = "PollingViewModel.kt", i = {0, 0, 1, 1, 2, 2}, l = {238, 241, 243}, m = "invokeSuspend", n = {"$this$flow", "remainingDuration", "$this$flow", "remainingDuration", "$this$flow", "remainingDuration"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes6.dex */
final class PollingViewModelKt$countdownFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Duration>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $duration;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PollingViewModelKt$countdownFlow$1(long j, Continuation<? super PollingViewModelKt$countdownFlow$1> continuation) {
        super(2, continuation);
        this.$duration = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PollingViewModelKt$countdownFlow$1 pollingViewModelKt$countdownFlow$1 = new PollingViewModelKt$countdownFlow$1(this.$duration, continuation);
        pollingViewModelKt$countdownFlow$1.L$0 = obj;
        return pollingViewModelKt$countdownFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Duration> flowCollector, Continuation<? super Unit> continuation) {
        return ((PollingViewModelKt$countdownFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008d -> B:15:0x004c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        long jM10510minusLRDsOJo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            jM10510minusLRDsOJo = this.$duration;
            this.L$0 = flowCollector;
            this.J$0 = jM10510minusLRDsOJo;
            this.label = 1;
            if (flowCollector.emit(Duration.m10480boximpl(jM10510minusLRDsOJo), this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                jM10510minusLRDsOJo = this.J$0;
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                jM10510minusLRDsOJo = Duration.m10510minusLRDsOJo(jM10510minusLRDsOJo, DurationKt.toDuration(1, DurationUnit.SECONDS));
                this.L$0 = flowCollector;
                this.J$0 = jM10510minusLRDsOJo;
                this.label = 3;
                if (flowCollector.emit(Duration.m10480boximpl(jM10510minusLRDsOJo), this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        jM10510minusLRDsOJo = this.J$0;
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (Duration.m10481compareToLRDsOJo(jM10510minusLRDsOJo, Duration.INSTANCE.m10573getZEROUwyO8pc()) <= 0) {
            Duration.Companion companion2 = Duration.INSTANCE;
            this.L$0 = flowCollector;
            this.J$0 = jM10510minusLRDsOJo;
            this.label = 2;
            if (DelayKt.m10627delayVtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), this) != coroutine_suspended) {
                Duration.Companion companion3 = Duration.INSTANCE;
                jM10510minusLRDsOJo = Duration.m10510minusLRDsOJo(jM10510minusLRDsOJo, DurationKt.toDuration(1, DurationUnit.SECONDS));
                this.L$0 = flowCollector;
                this.J$0 = jM10510minusLRDsOJo;
                this.label = 3;
                if (flowCollector.emit(Duration.m10480boximpl(jM10510minusLRDsOJo), this) != coroutine_suspended) {
                    if (Duration.m10481compareToLRDsOJo(jM10510minusLRDsOJo, Duration.INSTANCE.m10573getZEROUwyO8pc()) <= 0) {
                        return Unit.INSTANCE;
                    }
                }
            }
            return coroutine_suspended;
        }
    }
}
