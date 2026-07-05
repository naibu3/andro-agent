package com.stripe.android.stripe3ds2.transaction;

import androidx.webkit.Profile;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;

/* compiled from: ChallengeActionHandler.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "", "submit", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "action", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Profile.DEFAULT_PROFILE_NAME, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChallengeActionHandler {
    Object submit(ChallengeAction challengeAction, Continuation<? super ChallengeRequestResult> continuation);

    /* compiled from: ChallengeActionHandler.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "challengeRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;Lkotlin/coroutines/CoroutineContext;)V", "creqExecutorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;Lkotlin/coroutines/CoroutineContext;)V", "submit", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "action", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeChallengeRequest", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Default implements ChallengeActionHandler {
        private final ChallengeRequestExecutor challengeRequestExecutor;
        private final ChallengeRequestData creqData;
        private final ErrorReporter errorReporter;
        private final CoroutineContext workContext;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long CREQ_DELAY = TimeUnit.SECONDS.toMillis(1);

        public Default(ChallengeRequestData creqData, ErrorReporter errorReporter, ChallengeRequestExecutor challengeRequestExecutor, CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(challengeRequestExecutor, "challengeRequestExecutor");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            this.creqData = creqData;
            this.errorReporter = errorReporter;
            this.challengeRequestExecutor = challengeRequestExecutor;
            this.workContext = workContext;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Default(ChallengeRequestData creqData, ErrorReporter errorReporter, ChallengeRequestExecutor.Factory creqExecutorFactory, CoroutineContext workContext) {
            this(creqData, errorReporter, creqExecutorFactory.create(errorReporter, workContext), workContext);
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(creqExecutorFactory, "creqExecutorFactory");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler
        public Object submit(ChallengeAction challengeAction, Continuation<? super ChallengeRequestResult> continuation) {
            return BuildersKt.withContext(this.workContext, new ChallengeActionHandler$Default$submit$2(this, challengeAction, null), continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(8:12|41|13|28|33|(1:35)|36|(1:45)(2:39|40))(2:17|18))(1:19))(3:20|(1:23)|26)|43|24|(6:27|28|33|(0)|36|(0)(0))|26) */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
        
            r9 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
        
            r0 = r2;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object executeChallengeRequest(ChallengeRequestData challengeRequestData, Continuation<? super ChallengeRequestResult> continuation) {
            ChallengeActionHandler$Default$executeChallengeRequest$1 challengeActionHandler$Default$executeChallengeRequest$1;
            Default r2;
            Default r0;
            Object objM9118constructorimpl;
            Throwable thM9121exceptionOrNullimpl;
            if (continuation instanceof ChallengeActionHandler$Default$executeChallengeRequest$1) {
                challengeActionHandler$Default$executeChallengeRequest$1 = (ChallengeActionHandler$Default$executeChallengeRequest$1) continuation;
                if ((challengeActionHandler$Default$executeChallengeRequest$1.label & Integer.MIN_VALUE) != 0) {
                    challengeActionHandler$Default$executeChallengeRequest$1.label -= Integer.MIN_VALUE;
                } else {
                    challengeActionHandler$Default$executeChallengeRequest$1 = new ChallengeActionHandler$Default$executeChallengeRequest$1(this, continuation);
                }
            }
            Object objExecute = challengeActionHandler$Default$executeChallengeRequest$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = challengeActionHandler$Default$executeChallengeRequest$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(objExecute);
                long j = CREQ_DELAY;
                challengeActionHandler$Default$executeChallengeRequest$1.L$0 = this;
                challengeActionHandler$Default$executeChallengeRequest$1.L$1 = challengeRequestData;
                challengeActionHandler$Default$executeChallengeRequest$1.label = 1;
                if (DelayKt.delay(j, challengeActionHandler$Default$executeChallengeRequest$1) != coroutine_suspended) {
                    r2 = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                challengeRequestData = (ChallengeRequestData) challengeActionHandler$Default$executeChallengeRequest$1.L$1;
                r0 = (Default) challengeActionHandler$Default$executeChallengeRequest$1.L$0;
                try {
                    ResultKt.throwOnFailure(objExecute);
                    objM9118constructorimpl = Result.m9118constructorimpl((ChallengeRequestResult) objExecute);
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl2 != null) {
                    }
                }
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    r0.errorReporter.reportError(new RuntimeException(StringsKt.trimIndent("\n                            Failed to execute challenge request.\n\n                            CReq = " + challengeRequestData.sanitize$3ds2sdk_release() + "\n                        "), thM9121exceptionOrNullimpl));
                }
                Throwable thM9121exceptionOrNullimpl22 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                return thM9121exceptionOrNullimpl22 != null ? objM9118constructorimpl : new ChallengeRequestResult.RuntimeError(thM9121exceptionOrNullimpl22);
            }
            challengeRequestData = (ChallengeRequestData) challengeActionHandler$Default$executeChallengeRequest$1.L$1;
            r2 = (Default) challengeActionHandler$Default$executeChallengeRequest$1.L$0;
            ResultKt.throwOnFailure(objExecute);
            Result.Companion companion2 = Result.INSTANCE;
            ChallengeRequestExecutor challengeRequestExecutor = r2.challengeRequestExecutor;
            challengeActionHandler$Default$executeChallengeRequest$1.L$0 = r2;
            challengeActionHandler$Default$executeChallengeRequest$1.L$1 = challengeRequestData;
            challengeActionHandler$Default$executeChallengeRequest$1.label = 2;
            objExecute = challengeRequestExecutor.execute(challengeRequestData, challengeActionHandler$Default$executeChallengeRequest$1);
            if (objExecute != coroutine_suspended) {
                r0 = r2;
                objM9118constructorimpl = Result.m9118constructorimpl((ChallengeRequestResult) objExecute);
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                Throwable thM9121exceptionOrNullimpl222 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl222 != null) {
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: ChallengeActionHandler.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$Companion;", "", "<init>", "()V", "CREQ_DELAY", "", "getCREQ_DELAY$3ds2sdk_release", "()J", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final long getCREQ_DELAY$3ds2sdk_release() {
                return Default.CREQ_DELAY;
            }
        }
    }
}
