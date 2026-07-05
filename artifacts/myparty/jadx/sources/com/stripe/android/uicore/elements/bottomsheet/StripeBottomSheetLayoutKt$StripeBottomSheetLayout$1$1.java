package com.stripe.android.uicore.elements.bottomsheet;

import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StripeBottomSheetLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayoutKt$StripeBottomSheetLayout$1$1", f = "StripeBottomSheetLayout.kt", i = {}, l = {39, 42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class StripeBottomSheetLayoutKt$StripeBottomSheetLayout$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onDismissed;
    final /* synthetic */ StripeBottomSheetState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeBottomSheetLayoutKt$StripeBottomSheetLayout$1$1(StripeBottomSheetState stripeBottomSheetState, Function0<Unit> function0, Continuation<? super StripeBottomSheetLayoutKt$StripeBottomSheetLayout$1$1> continuation) {
        super(2, continuation);
        this.$state = stripeBottomSheetState;
        this.$onDismissed = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StripeBottomSheetLayoutKt$StripeBottomSheetLayout$1$1(this.$state, this.$onDismissed, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StripeBottomSheetLayoutKt$StripeBottomSheetLayout$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$state.getModalBottomSheetState().isVisible()) {
                this.label = 1;
                if (this.$state.show(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((StripeBottomSheetState.DismissalType) obj) == StripeBottomSheetState.DismissalType.SwipedDownByUser) {
                    this.$onDismissed.invoke();
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        obj = this.$state.awaitDismissal(this);
    }
}
