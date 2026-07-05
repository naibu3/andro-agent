package com.stripe.android.stripe3ds2.transaction;

import com.facebook.device.yearclass.YearClass;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChallengeActionHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$submit$2", f = "ChallengeActionHandler.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChallengeActionHandler$Default$submit$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChallengeRequestResult>, Object> {
    final /* synthetic */ ChallengeAction $action;
    int label;
    final /* synthetic */ ChallengeActionHandler.Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeActionHandler$Default$submit$2(ChallengeActionHandler.Default r1, ChallengeAction challengeAction, Continuation<? super ChallengeActionHandler$Default$submit$2> continuation) {
        super(2, continuation);
        this.this$0 = r1;
        this.$action = challengeAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChallengeActionHandler$Default$submit$2(this.this$0, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChallengeRequestResult> continuation) {
        return ((ChallengeActionHandler$Default$submit$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChallengeRequestData challengeRequestDataCopy$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ChallengeRequestData challengeRequestData = new ChallengeRequestData(this.this$0.creqData.getMessageVersion(), this.this$0.creqData.getThreeDsServerTransId(), this.this$0.creqData.getAcsTransId(), this.this$0.creqData.getSdkTransId(), this.this$0.creqData.getThreeDSRequestorAppURL(), null, null, null, this.this$0.creqData.getMessageExtensions(), null, null, null, 3808, null);
        ChallengeAction challengeAction = this.$action;
        if (challengeAction instanceof ChallengeAction.NativeForm) {
            ChallengeAction.NativeForm nativeForm = (ChallengeAction.NativeForm) challengeAction;
            challengeRequestDataCopy$default = ChallengeRequestData.copy$default(challengeRequestData, null, null, null, null, null, nativeForm.getUserEntry$3ds2sdk_release(), null, null, null, null, null, nativeForm.getWhitelistingValue$3ds2sdk_release(), YearClass.CLASS_2015, null);
        } else if (challengeAction instanceof ChallengeAction.HtmlForm) {
            challengeRequestDataCopy$default = ChallengeRequestData.copy$default(challengeRequestData, null, null, null, null, null, null, null, ((ChallengeAction.HtmlForm) challengeAction).getUserEntry$3ds2sdk_release(), null, null, null, null, 3967, null);
        } else if (challengeAction instanceof ChallengeAction.Oob) {
            challengeRequestDataCopy$default = ChallengeRequestData.copy$default(challengeRequestData, null, null, null, null, null, null, null, null, null, Boxing.boxBoolean(true), null, ((ChallengeAction.Oob) challengeAction).getWhitelistingValue$3ds2sdk_release(), 1535, null);
        } else if (challengeAction instanceof ChallengeAction.Resend) {
            challengeRequestDataCopy$default = ChallengeRequestData.copy$default(challengeRequestData, null, null, null, null, null, null, null, null, null, null, Boxing.boxBoolean(true), null, 3071, null);
        } else {
            if (!(challengeAction instanceof ChallengeAction.Cancel)) {
                throw new NoWhenBranchMatchedException();
            }
            challengeRequestDataCopy$default = ChallengeRequestData.copy$default(challengeRequestData, null, null, null, null, null, null, ChallengeRequestData.CancelReason.UserSelected, null, null, null, null, null, 4031, null);
        }
        this.label = 1;
        Object objExecuteChallengeRequest = this.this$0.executeChallengeRequest(challengeRequestDataCopy$default, this);
        return objExecuteChallengeRequest == coroutine_suspended ? coroutine_suspended : objExecuteChallengeRequest;
    }
}
