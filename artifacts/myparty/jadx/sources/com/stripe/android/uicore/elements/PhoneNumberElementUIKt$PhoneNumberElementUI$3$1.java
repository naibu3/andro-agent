package com.stripe.android.uicore.elements;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import com.stripe.android.uicore.FocusManagerKtKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PhoneNumberElementUI.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$3$1", f = "PhoneNumberElementUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PhoneNumberElementUIKt$PhoneNumberElementUI$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ MutableState<Boolean> $hasFocus$delegate;
    final /* synthetic */ State<Boolean> $isComplete$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneNumberElementUIKt$PhoneNumberElementUI$3$1(FocusManager focusManager, State<Boolean> state, MutableState<Boolean> mutableState, Continuation<? super PhoneNumberElementUIKt$PhoneNumberElementUI$3$1> continuation) {
        super(2, continuation);
        this.$focusManager = focusManager;
        this.$isComplete$delegate = state;
        this.$hasFocus$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PhoneNumberElementUIKt$PhoneNumberElementUI$3$1(this.$focusManager, this.$isComplete$delegate, this.$hasFocus$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PhoneNumberElementUIKt$PhoneNumberElementUI$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (PhoneNumberElementUIKt.PhoneNumberElementUI_Rts_TWA$lambda$10(this.$isComplete$delegate) && PhoneNumberElementUIKt.PhoneNumberElementUI_Rts_TWA$lambda$17(this.$hasFocus$delegate)) {
                FocusManagerKtKt.m8697moveFocusSafelyMxy_nc0(this.$focusManager, FocusDirection.INSTANCE.m3338getNextdhqQ8s());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
