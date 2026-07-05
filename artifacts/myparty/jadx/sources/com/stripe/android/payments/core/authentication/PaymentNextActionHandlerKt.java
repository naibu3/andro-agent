package com.stripe.android.payments.core.authentication;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.WithLifecycleStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: PaymentNextActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"awaitResumed", "", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentNextActionHandlerKt {

    /* compiled from: PaymentNextActionHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.PaymentNextActionHandlerKt", f = "PaymentNextActionHandler.kt", i = {0}, l = {LockFreeTaskQueueCore.CLOSED_SHIFT, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "awaitResumed", n = {"completable"}, s = {"L$0"})
    /* renamed from: com.stripe.android.payments.core.authentication.PaymentNextActionHandlerKt$awaitResumed$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentNextActionHandlerKt.awaitResumed(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (r12.await(r6) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitResumed(LifecycleOwner lifecycleOwner, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        final CompletableDeferred completableDeferredCompletableDeferred$default;
        CompletableDeferred completableDeferred;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object obj = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            boolean zIsDispatchNeeded = immediate.isDispatchNeeded(anonymousClass12.get$context());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                }
                if (lifecycle.getState().compareTo(state) >= 0) {
                    Boxing.boxBoolean(completableDeferredCompletableDeferred$default.complete(Unit.INSTANCE));
                    anonymousClass12.L$0 = null;
                    anonymousClass12.label = 2;
                }
            }
            Function0<Boolean> function0 = new Function0<Boolean>() { // from class: com.stripe.android.payments.core.authentication.PaymentNextActionHandlerKt$awaitResumed$$inlined$withResumed$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(completableDeferredCompletableDeferred$default.complete(Unit.INSTANCE));
                }
            };
            anonymousClass12.L$0 = completableDeferredCompletableDeferred$default;
            anonymousClass12.label = 1;
            if (WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, function0, anonymousClass12) != coroutine_suspended) {
                completableDeferred = completableDeferredCompletableDeferred$default;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        completableDeferred = (CompletableDeferred) anonymousClass12.L$0;
        ResultKt.throwOnFailure(obj);
        completableDeferredCompletableDeferred$default = completableDeferred;
        anonymousClass12.L$0 = null;
        anonymousClass12.label = 2;
    }
}
