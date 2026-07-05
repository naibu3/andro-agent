package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {745, 748, 751}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
/* loaded from: classes.dex */
final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation<? super ScrollingLogic$onDragStopped$performFling$1> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, continuation);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).getPackedValue();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
        return m839invokesFctU(velocity.getPackedValue(), continuation);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m839invokesFctU(long j, Continuation<? super Velocity> continuation) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(Velocity.m6345boximpl(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM4742dispatchPreFlingQWom1Mo;
        long j;
        long jM6357minusAH228Gc;
        Object objM832doFlingAnimationQWom1Mo;
        long packedValue;
        Object objM4740dispatchPostFlingRZ2iAVY;
        long j2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j3 = this.J$0;
            this.J$0 = j3;
            this.label = 1;
            objM4742dispatchPreFlingQWom1Mo = this.this$0.nestedScrollDispatcher.m4742dispatchPreFlingQWom1Mo(j3, this);
            if (objM4742dispatchPreFlingQWom1Mo != coroutine_suspended) {
                j = j3;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j4 = this.J$1;
                j2 = this.J$0;
                ResultKt.throwOnFailure(obj);
                packedValue = j4;
                objM4740dispatchPostFlingRZ2iAVY = obj;
                return Velocity.m6345boximpl(Velocity.m6357minusAH228Gc(j2, Velocity.m6357minusAH228Gc(packedValue, ((Velocity) objM4740dispatchPostFlingRZ2iAVY).getPackedValue())));
            }
            long j5 = this.J$1;
            long j6 = this.J$0;
            ResultKt.throwOnFailure(obj);
            jM6357minusAH228Gc = j5;
            j = j6;
            objM832doFlingAnimationQWom1Mo = obj;
            packedValue = ((Velocity) objM832doFlingAnimationQWom1Mo).getPackedValue();
            this.J$0 = j;
            this.J$1 = packedValue;
            this.label = 3;
            objM4740dispatchPostFlingRZ2iAVY = this.this$0.nestedScrollDispatcher.m4740dispatchPostFlingRZ2iAVY(Velocity.m6357minusAH228Gc(jM6357minusAH228Gc, packedValue), packedValue, this);
            if (objM4740dispatchPostFlingRZ2iAVY != coroutine_suspended) {
                j2 = j;
                return Velocity.m6345boximpl(Velocity.m6357minusAH228Gc(j2, Velocity.m6357minusAH228Gc(packedValue, ((Velocity) objM4740dispatchPostFlingRZ2iAVY).getPackedValue())));
            }
            return coroutine_suspended;
        }
        j = this.J$0;
        ResultKt.throwOnFailure(obj);
        objM4742dispatchPreFlingQWom1Mo = obj;
        jM6357minusAH228Gc = Velocity.m6357minusAH228Gc(j, ((Velocity) objM4742dispatchPreFlingQWom1Mo).getPackedValue());
        this.J$0 = j;
        this.J$1 = jM6357minusAH228Gc;
        this.label = 2;
        objM832doFlingAnimationQWom1Mo = this.this$0.m832doFlingAnimationQWom1Mo(jM6357minusAH228Gc, this);
        if (objM832doFlingAnimationQWom1Mo != coroutine_suspended) {
            packedValue = ((Velocity) objM832doFlingAnimationQWom1Mo).getPackedValue();
            this.J$0 = j;
            this.J$1 = packedValue;
            this.label = 3;
            objM4740dispatchPostFlingRZ2iAVY = this.this$0.nestedScrollDispatcher.m4740dispatchPostFlingRZ2iAVY(Velocity.m6357minusAH228Gc(jM6357minusAH228Gc, packedValue), packedValue, this);
            if (objM4740dispatchPostFlingRZ2iAVY != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
