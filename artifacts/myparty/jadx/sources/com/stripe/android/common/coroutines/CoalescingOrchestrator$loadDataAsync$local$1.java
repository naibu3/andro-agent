package com.stripe.android.common.coroutines;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: CoalescingOrchestrator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.common.coroutines.CoalescingOrchestrator$loadDataAsync$local$1", f = "CoalescingOrchestrator.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CoalescingOrchestrator$loadDataAsync$local$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    int label;
    final /* synthetic */ CoalescingOrchestrator<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoalescingOrchestrator$loadDataAsync$local$1(CoalescingOrchestrator<T> coalescingOrchestrator, Continuation<? super CoalescingOrchestrator$loadDataAsync$local$1> continuation) {
        super(2, continuation);
        this.this$0 = coalescingOrchestrator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoalescingOrchestrator$loadDataAsync$local$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((CoalescingOrchestrator$loadDataAsync$local$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function1 function1 = ((CoalescingOrchestrator) this.this$0).factory;
            this.label = 1;
            obj = function1.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Object obj2 = ((CoalescingOrchestrator) this.this$0).lock;
        CoalescingOrchestrator<T> coalescingOrchestrator = this.this$0;
        synchronized (obj2) {
            if (((Boolean) ((CoalescingOrchestrator) coalescingOrchestrator).keepDataInMemory.invoke(obj)).booleanValue()) {
                ((CoalescingOrchestrator) coalescingOrchestrator).data = obj;
                ((CoalescingOrchestrator) coalescingOrchestrator).dataInitialized = true;
            }
            ((CoalescingOrchestrator) coalescingOrchestrator).deferred = null;
            Unit unit = Unit.INSTANCE;
        }
        return obj;
    }
}
