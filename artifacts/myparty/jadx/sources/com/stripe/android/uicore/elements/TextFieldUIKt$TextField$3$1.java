package com.stripe.android.uicore.elements;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusManager;
import com.stripe.android.uicore.FocusManagerKtKt;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextFieldUI.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.elements.TextFieldUIKt$TextField$3$1", f = "TextFieldUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class TextFieldUIKt$TextField$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<TextFieldState> $fieldState$delegate;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ MutableState<Boolean> $hasFocus;
    final /* synthetic */ int $nextFocusDirection;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextFieldUIKt$TextField$3$1(MutableState<Boolean> mutableState, FocusManager focusManager, int i, State<? extends TextFieldState> state, Continuation<? super TextFieldUIKt$TextField$3$1> continuation) {
        super(2, continuation);
        this.$hasFocus = mutableState;
        this.$focusManager = focusManager;
        this.$nextFocusDirection = i;
        this.$fieldState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextFieldUIKt$TextField$3$1(this.$hasFocus, this.$focusManager, this.$nextFocusDirection, this.$fieldState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextFieldUIKt$TextField$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(TextFieldUIKt.TextField_ZkbtPhE$lambda$18(this.$fieldState$delegate), TextFieldStateConstants.Valid.Full.INSTANCE) && this.$hasFocus.getValue().booleanValue()) {
                FocusManagerKtKt.m8697moveFocusSafelyMxy_nc0(this.$focusManager, this.$nextFocusDirection);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
