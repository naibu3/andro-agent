package com.stripe.android.link.ui.inline;

import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.stripe.android.link.ui.signup.SignUpState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinkInlineSignup.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$2$1", f = "LinkInlineSignup.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class LinkInlineSignupKt$LinkInlineSignup$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    final /* synthetic */ State<InlineSignupViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkInlineSignupKt$LinkInlineSignup$2$1(FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, State<InlineSignupViewState> state, Continuation<? super LinkInlineSignupKt$LinkInlineSignup$2$1> continuation) {
        super(2, continuation);
        this.$focusManager = focusManager;
        this.$keyboardController = softwareKeyboardController;
        this.$viewState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkInlineSignupKt$LinkInlineSignup$2$1(this.$focusManager, this.$keyboardController, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LinkInlineSignupKt$LinkInlineSignup$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (LinkInlineSignupKt.LinkInlineSignup$lambda$0(this.$viewState$delegate).getSignUpState$paymentsheet_release() == SignUpState.InputtingPrimaryField && LinkInlineSignupKt.LinkInlineSignup$lambda$0(this.$viewState$delegate).getUserInput() != null) {
                this.$focusManager.clearFocus(true);
                SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
