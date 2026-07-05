package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.widget.Toast;
import com.stripe.android.link.ui.verification.VerificationViewState;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.WalletButtonsInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WalletButtonsContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.ui.WalletButtonsContent$ResendCodeNotificationEffect$1$1", f = "WalletButtonsContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class WalletButtonsContent$ResendCodeNotificationEffect$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ WalletButtonsInteractor.State $state;
    int label;
    final /* synthetic */ WalletButtonsContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WalletButtonsContent$ResendCodeNotificationEffect$1$1(WalletButtonsInteractor.State state, Context context, WalletButtonsContent walletButtonsContent, Continuation<? super WalletButtonsContent$ResendCodeNotificationEffect$1$1> continuation) {
        super(2, continuation);
        this.$state = state;
        this.$context = context;
        this.this$0 = walletButtonsContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletButtonsContent$ResendCodeNotificationEffect$1$1(this.$state, this.$context, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletButtonsContent$ResendCodeNotificationEffect$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        VerificationViewState viewState;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WalletButtonsInteractor.State.LinkOtpState link2FAState = this.$state.getLink2FAState();
        if (link2FAState != null && (viewState = link2FAState.getViewState()) != null && viewState.getDidSendNewCode()) {
            Toast.makeText(this.$context, R.string.stripe_verification_code_sent, 0).show();
            this.this$0.interactor.handleViewAction(WalletButtonsInteractor.ViewAction.OnResendCodeNotificationSent.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
