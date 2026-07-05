package com.stripe.android.uicore.navigation;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: KeyboardController.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u0004H\u0086@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/uicore/navigation/KeyboardController;", "", "dismissKeyboard", "Lkotlin/Function0;", "", "isKeyboardVisible", "Landroidx/compose/runtime/State;", "", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/State;)V", "dismiss", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitKeyboardDismissed", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyboardController {
    public static final int $stable = 0;
    private final Function0<Unit> dismissKeyboard;
    private final State<Boolean> isKeyboardVisible;

    public KeyboardController(Function0<Unit> dismissKeyboard, State<Boolean> isKeyboardVisible) {
        Intrinsics.checkNotNullParameter(dismissKeyboard, "dismissKeyboard");
        Intrinsics.checkNotNullParameter(isKeyboardVisible, "isKeyboardVisible");
        this.dismissKeyboard = dismissKeyboard;
        this.isKeyboardVisible = isKeyboardVisible;
    }

    public final Object dismiss(Continuation<? super Unit> continuation) {
        if (this.isKeyboardVisible.getValue().booleanValue()) {
            this.dismissKeyboard.invoke();
            Object objAwaitKeyboardDismissed = awaitKeyboardDismissed(continuation);
            return objAwaitKeyboardDismissed == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitKeyboardDismissed : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: KeyboardController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.navigation.KeyboardController$awaitKeyboardDismissed$3", f = "KeyboardController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.uicore.navigation.KeyboardController$awaitKeyboardDismissed$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass3) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!this.Z$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitKeyboardDismissed(Continuation<? super Unit> continuation) {
        Object objFirst = FlowKt.first(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.stripe.android.uicore.navigation.KeyboardController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(KeyboardController.awaitKeyboardDismissed$lambda$0(this.f$0));
            }
        }), new AnonymousClass3(null), continuation);
        return objFirst == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFirst : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean awaitKeyboardDismissed$lambda$0(KeyboardController keyboardController) {
        return keyboardController.isKeyboardVisible.getValue().booleanValue();
    }
}
