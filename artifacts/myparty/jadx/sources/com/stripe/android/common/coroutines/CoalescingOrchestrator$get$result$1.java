package com.stripe.android.common.coroutines;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: CoalescingOrchestrator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.common.coroutines.CoalescingOrchestrator$get$result$1", f = "CoalescingOrchestrator.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CoalescingOrchestrator$get$result$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ Ref.ObjectRef<CoalescingOrchestrator<T>> $$this;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoalescingOrchestrator$get$result$1(Ref.ObjectRef<CoalescingOrchestrator<T>> objectRef, Continuation<? super CoalescingOrchestrator$get$result$1> continuation) {
        super(2, continuation);
        this.$$this = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoalescingOrchestrator$get$result$1 coalescingOrchestrator$get$result$1 = new CoalescingOrchestrator$get$result$1(this.$$this, continuation);
        coalescingOrchestrator$get$result$1.L$0 = obj;
        return coalescingOrchestrator$get$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((CoalescingOrchestrator$get$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [T, kotlinx.coroutines.Deferred] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Object obj2 = ((CoalescingOrchestrator) this.$$this.element).lock;
            Ref.ObjectRef<CoalescingOrchestrator<T>> objectRef2 = this.$$this;
            synchronized (obj2) {
                if (((CoalescingOrchestrator) objectRef2.element).dataInitialized) {
                    Object obj3 = ((CoalescingOrchestrator) objectRef2.element).data;
                    if (obj3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        obj3 = Unit.INSTANCE;
                    }
                    return obj3;
                }
                ?? r5 = (T) ((CoalescingOrchestrator) objectRef2.element).deferred;
                if (r5 == 0 || r5.isCancelled()) {
                    objectRef.element = (T) objectRef2.element.loadDataAsync(coroutineScope);
                } else {
                    objectRef.element = r5;
                }
                Unit unit = Unit.INSTANCE;
                Function0 function0 = ((CoalescingOrchestrator) this.$$this.element).awaitListener;
                if (function0 != null) {
                    function0.invoke();
                }
                this.label = 1;
                Object objAwait = ((Deferred) objectRef.element).await(this);
                return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
            }
        } catch (CancellationException unused) {
            return null;
        }
    }
}
