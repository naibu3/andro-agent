package com.stripe.android.financialconnections.features.partnerauth;

import androidx.core.app.FrameMetricsAggregator;
import com.stripe.android.financialconnections.domain.CancelAuthorizationSession;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PartnerAuthViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onCancelClick$1$1", f = "PartnerAuthViewModel.kt", i = {}, l = {509, FrameMetricsAggregator.EVERY_DURATION}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class PartnerAuthViewModel$onCancelClick$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SharedPartnerAuthState $state;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PartnerAuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartnerAuthViewModel$onCancelClick$1$1(PartnerAuthViewModel partnerAuthViewModel, SharedPartnerAuthState sharedPartnerAuthState, Continuation<? super PartnerAuthViewModel$onCancelClick$1$1> continuation) {
        super(2, continuation);
        this.this$0 = partnerAuthViewModel;
        this.$state = sharedPartnerAuthState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PartnerAuthViewModel$onCancelClick$1$1 partnerAuthViewModel$onCancelClick$1$1 = new PartnerAuthViewModel$onCancelClick$1$1(this.this$0, this.$state, continuation);
        partnerAuthViewModel$onCancelClick$1$1.L$0 = obj;
        return partnerAuthViewModel$onCancelClick$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PartnerAuthViewModel$onCancelClick$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[Catch: all -> 0x0087, TryCatch #1 {all -> 0x0087, blocks: (B:26:0x0075, B:21:0x0055, B:23:0x0061, B:27:0x007b, B:28:0x0086, B:18:0x004e), top: B:42:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[Catch: all -> 0x0087, TryCatch #1 {all -> 0x0087, blocks: (B:26:0x0075, B:21:0x0055, B:23:0x0061, B:27:0x007b, B:28:0x0086, B:18:0x004e), top: B:42:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        PartnerAuthViewModel$onCancelClick$1$1 partnerAuthViewModel$onCancelClick$1$1;
        PartnerAuthViewModel partnerAuthViewModel;
        FinancialConnectionsAuthorizationSession activeAuthSession;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onCancelClick$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PartnerAuthViewModel$onCancelClick$1$1.invokeSuspend$lambda$0((SharedPartnerAuthState) obj2);
                }
            });
            partnerAuthViewModel = this.this$0;
            try {
                Result.Companion companion = Result.INSTANCE;
                GetOrFetchSync getOrFetchSync = partnerAuthViewModel.getOrFetchSync;
                GetOrFetchSync.RefetchCondition.IfMissingActiveAuthSession ifMissingActiveAuthSession = GetOrFetchSync.RefetchCondition.IfMissingActiveAuthSession.INSTANCE;
                this.L$0 = partnerAuthViewModel;
                this.label = 1;
                partnerAuthViewModel$onCancelClick$1$1 = this;
                try {
                    obj = GetOrFetchSync.invoke$default(getOrFetchSync, ifMissingActiveAuthSession, false, partnerAuthViewModel$onCancelClick$1$1, 2, null);
                    if (obj != coroutine_suspended) {
                        activeAuthSession = ((SynchronizeSessionResponse) obj).getManifest().getActiveAuthSession();
                        if (activeAuthSession == null) {
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m9118constructorimpl(ResultKt.createFailure(th));
                    if (partnerAuthViewModel$onCancelClick$1$1.$state.getInModal()) {
                    }
                    return Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                th = th3;
                partnerAuthViewModel$onCancelClick$1$1 = this;
            }
        } else {
            try {
                if (i == 1) {
                    partnerAuthViewModel = (PartnerAuthViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    partnerAuthViewModel$onCancelClick$1$1 = this;
                    activeAuthSession = ((SynchronizeSessionResponse) obj).getManifest().getActiveAuthSession();
                    if (activeAuthSession == null) {
                        CancelAuthorizationSession cancelAuthorizationSession = partnerAuthViewModel.cancelAuthorizationSession;
                        String id = activeAuthSession.getId();
                        partnerAuthViewModel$onCancelClick$1$1.L$0 = null;
                        partnerAuthViewModel$onCancelClick$1$1.label = 2;
                        obj = cancelAuthorizationSession.invoke(id, this);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    partnerAuthViewModel$onCancelClick$1$1 = this;
                    Result.m9118constructorimpl((FinancialConnectionsAuthorizationSession) obj);
                }
            } catch (Throwable th4) {
                th = th4;
                partnerAuthViewModel$onCancelClick$1$1 = this;
                Result.Companion companion22 = Result.INSTANCE;
                Result.m9118constructorimpl(ResultKt.createFailure(th));
                if (partnerAuthViewModel$onCancelClick$1$1.$state.getInModal()) {
                }
                return Unit.INSTANCE;
            }
        }
        if (partnerAuthViewModel$onCancelClick$1$1.$state.getInModal()) {
            partnerAuthViewModel$onCancelClick$1$1.this$0.cancelInModal();
        } else {
            partnerAuthViewModel$onCancelClick$1$1.this$0.cancelInFullscreen();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPartnerAuthState invokeSuspend$lambda$0(SharedPartnerAuthState sharedPartnerAuthState) {
        return SharedPartnerAuthState.copy$default(sharedPartnerAuthState, null, null, null, new Async.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.Action.CANCELLING)), false, 23, null);
    }
}
