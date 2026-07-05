package com.stripe.android.link.ui.verification;

import android.content.Context;
import android.widget.Toast;
import com.stripe.android.paymentsheet.R;
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

/* compiled from: VerificationBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.ui.verification.VerificationBodyKt$LaunchedEffects$3$1", f = "VerificationBody.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class VerificationBodyKt$LaunchedEffects$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function0<Unit> $didShowCodeSentNotification;
    final /* synthetic */ VerificationViewState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationBodyKt$LaunchedEffects$3$1(VerificationViewState verificationViewState, Context context, Function0<Unit> function0, Continuation<? super VerificationBodyKt$LaunchedEffects$3$1> continuation) {
        super(2, continuation);
        this.$state = verificationViewState;
        this.$context = context;
        this.$didShowCodeSentNotification = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerificationBodyKt$LaunchedEffects$3$1(this.$state, this.$context, this.$didShowCodeSentNotification, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerificationBodyKt$LaunchedEffects$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$state.getDidSendNewCode()) {
            Toast.makeText(this.$context, R.string.stripe_verification_code_sent, 0).show();
            this.$didShowCodeSentNotification.invoke();
        }
        return Unit.INSTANCE;
    }
}
