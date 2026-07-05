package com.stripe.android.financialconnections.features.networkinglinksignup;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.focus.FocusRequester;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NetworkingLinkSignupScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1", f = "NetworkingLinkSignupScreen.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NetworkingLinkSignupState.Payload $payload;
    final /* synthetic */ FocusRequester $phoneNumberFocusRequester;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ boolean $showFullForm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1(boolean z, ScrollState scrollState, NetworkingLinkSignupState.Payload payload, FocusRequester focusRequester, Continuation<? super NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1> continuation) {
        super(2, continuation);
        this.$showFullForm = z;
        this.$scrollState = scrollState;
        this.$payload = payload;
        this.$phoneNumberFocusRequester = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1(this.$showFullForm, this.$scrollState, this.$payload, this.$phoneNumberFocusRequester, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$showFullForm) {
                this.label = 1;
                if (NetworkingLinkSignupScreenKt.animateScrollToBottom$default(this.$scrollState, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$payload.getFocusPhoneFieldOnShow()) {
            this.$phoneNumberFocusRequester.requestFocus();
        }
        return Unit.INSTANCE;
    }
}
