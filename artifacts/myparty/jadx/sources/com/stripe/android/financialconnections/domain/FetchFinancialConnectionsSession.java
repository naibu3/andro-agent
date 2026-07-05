package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
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

/* compiled from: FetchFinancialConnectionsSession.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086B¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;", "", "fetchPaginatedAccountsForSession", "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;", "financialConnectionsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "<init>", "(Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V", "invoke", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "clientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FetchFinancialConnectionsSession {
    public static final int $stable = 0;
    private final FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession;
    private final FinancialConnectionsRepository financialConnectionsRepository;

    /* compiled from: FetchFinancialConnectionsSession.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession", f = "FetchFinancialConnectionsSession.kt", i = {0}, l = {20, 21}, m = "invoke", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FetchFinancialConnectionsSession.this.invoke(null, this);
        }
    }

    @Inject
    public FetchFinancialConnectionsSession(FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession, FinancialConnectionsRepository financialConnectionsRepository) {
        Intrinsics.checkNotNullParameter(fetchPaginatedAccountsForSession, "fetchPaginatedAccountsForSession");
        Intrinsics.checkNotNullParameter(financialConnectionsRepository, "financialConnectionsRepository");
        this.fetchPaginatedAccountsForSession = fetchPaginatedAccountsForSession;
        this.financialConnectionsRepository = financialConnectionsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, Continuation<? super FinancialConnectionsSession> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        AnonymousClass1 anonymousClass1;
        FetchFinancialConnectionsSession fetchFinancialConnectionsSession;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object financialConnectionsSession = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(financialConnectionsSession);
            FinancialConnectionsRepository financialConnectionsRepository = this.financialConnectionsRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            financialConnectionsSession = financialConnectionsRepository.getFinancialConnectionsSession(str, anonymousClass1);
            if (financialConnectionsSession != coroutine_suspended) {
                fetchFinancialConnectionsSession = this;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(financialConnectionsSession);
            return financialConnectionsSession;
        }
        fetchFinancialConnectionsSession = (FetchFinancialConnectionsSession) anonymousClass1.L$0;
        ResultKt.throwOnFailure(financialConnectionsSession);
        FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession = fetchFinancialConnectionsSession.fetchPaginatedAccountsForSession;
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        Object objInvoke = fetchPaginatedAccountsForSession.invoke((FinancialConnectionsSession) financialConnectionsSession, anonymousClass1);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }
}
