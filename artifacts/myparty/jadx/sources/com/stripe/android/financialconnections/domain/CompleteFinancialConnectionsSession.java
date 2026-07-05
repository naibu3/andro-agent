package com.stripe.android.financialconnections.domain;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompleteFinancialConnectionsSession.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086B¢\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "fetchPaginatedAccountsForSession", "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V", "invoke", "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$Result;", "earlyTerminationCause", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;", "closeAuthFlowError", "", "(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeSessionCompletionStatus", "", "session", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "Result", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CompleteFinancialConnectionsSession {
    public static final int $stable = 8;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession;
    private final FinancialConnectionsRepository repository;

    /* compiled from: CompleteFinancialConnectionsSession.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession", f = "CompleteFinancialConnectionsSession.kt", i = {0, 0, 0, 1, 1, 1}, l = {18, 23}, m = "invoke", n = {"this", "earlyTerminationCause", "closeAuthFlowError", "this", "earlyTerminationCause", "closeAuthFlowError"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CompleteFinancialConnectionsSession.this.invoke(null, null, this);
        }
    }

    @Inject
    public CompleteFinancialConnectionsSession(FinancialConnectionsRepository repository, FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession, FinancialConnectionsSheetConfiguration configuration) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(fetchPaginatedAccountsForSession, "fetchPaginatedAccountsForSession");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.repository = repository;
        this.fetchPaginatedAccountsForSession = fetchPaginatedAccountsForSession;
        this.configuration = configuration;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause, Throwable th, Continuation<? super Result> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        AnonymousClass1 anonymousClass1;
        CompleteFinancialConnectionsSession completeFinancialConnectionsSession;
        NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause2;
        Throwable th2;
        CompleteFinancialConnectionsSession completeFinancialConnectionsSession2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objPostCompleteFinancialConnectionsSessions = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objPostCompleteFinancialConnectionsSessions);
            FinancialConnectionsRepository financialConnectionsRepository = this.repository;
            String value = earlyTerminationCause != null ? earlyTerminationCause.getValue() : null;
            String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = earlyTerminationCause;
            anonymousClass1.L$2 = th;
            anonymousClass1.label = 1;
            objPostCompleteFinancialConnectionsSessions = financialConnectionsRepository.postCompleteFinancialConnectionsSessions(financialConnectionsSessionClientSecret, value, anonymousClass1);
            if (objPostCompleteFinancialConnectionsSessions != coroutine_suspended) {
                completeFinancialConnectionsSession = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th2 = (Throwable) anonymousClass1.L$2;
            earlyTerminationCause2 = (NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause) anonymousClass1.L$1;
            completeFinancialConnectionsSession2 = (CompleteFinancialConnectionsSession) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objPostCompleteFinancialConnectionsSessions);
            FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) objPostCompleteFinancialConnectionsSessions;
            return new Result(financialConnectionsSession, completeFinancialConnectionsSession2.computeSessionCompletionStatus(financialConnectionsSession, earlyTerminationCause2, th2));
        }
        th = (Throwable) anonymousClass1.L$2;
        earlyTerminationCause = (NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause) anonymousClass1.L$1;
        completeFinancialConnectionsSession = (CompleteFinancialConnectionsSession) anonymousClass1.L$0;
        ResultKt.throwOnFailure(objPostCompleteFinancialConnectionsSessions);
        FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession = completeFinancialConnectionsSession.fetchPaginatedAccountsForSession;
        anonymousClass1.L$0 = completeFinancialConnectionsSession;
        anonymousClass1.L$1 = earlyTerminationCause;
        anonymousClass1.L$2 = th;
        anonymousClass1.label = 2;
        objPostCompleteFinancialConnectionsSessions = fetchPaginatedAccountsForSession.invoke((FinancialConnectionsSession) objPostCompleteFinancialConnectionsSessions, anonymousClass1);
        if (objPostCompleteFinancialConnectionsSessions != coroutine_suspended) {
            Throwable th3 = th;
            earlyTerminationCause2 = earlyTerminationCause;
            th2 = th3;
            completeFinancialConnectionsSession2 = completeFinancialConnectionsSession;
            FinancialConnectionsSession financialConnectionsSession2 = (FinancialConnectionsSession) objPostCompleteFinancialConnectionsSessions;
            return new Result(financialConnectionsSession2, completeFinancialConnectionsSession2.computeSessionCompletionStatus(financialConnectionsSession2, earlyTerminationCause2, th2));
        }
        return coroutine_suspended;
    }

    private final String computeSessionCompletionStatus(FinancialConnectionsSession session, NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause, Throwable closeAuthFlowError) {
        String analyticsValue;
        return (earlyTerminationCause == null || (analyticsValue = earlyTerminationCause.getAnalyticsValue()) == null) ? CompleteFinancialConnectionsSessionKt.completionStatus(session, closeAuthFlowError) : analyticsValue;
    }

    /* compiled from: CompleteFinancialConnectionsSession.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$Result;", "", "session", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "status", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ljava/lang/String;)V", "getSession", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result {
        public static final int $stable = 8;
        private final FinancialConnectionsSession session;
        private final String status;

        public static /* synthetic */ Result copy$default(Result result, FinancialConnectionsSession financialConnectionsSession, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                financialConnectionsSession = result.session;
            }
            if ((i & 2) != 0) {
                str = result.status;
            }
            return result.copy(financialConnectionsSession, str);
        }

        /* renamed from: component1, reason: from getter */
        public final FinancialConnectionsSession getSession() {
            return this.session;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        public final Result copy(FinancialConnectionsSession session, String status) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(status, "status");
            return new Result(session, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.session, result.session) && Intrinsics.areEqual(this.status, result.status);
        }

        public int hashCode() {
            return (this.session.hashCode() * 31) + this.status.hashCode();
        }

        public String toString() {
            return "Result(session=" + this.session + ", status=" + this.status + ")";
        }

        public Result(FinancialConnectionsSession session, String status) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(status, "status");
            this.session = session;
            this.status = status;
        }

        public final FinancialConnectionsSession getSession() {
            return this.session;
        }

        public final String getStatus() {
            return this.status;
        }
    }
}
