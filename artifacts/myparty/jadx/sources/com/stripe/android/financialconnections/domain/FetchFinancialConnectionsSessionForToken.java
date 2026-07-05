package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.model.Token;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FetchFinancialConnectionsSessionForToken.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0086B¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;", "", "connectionsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V", "invoke", "Lkotlin/Pair;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "Lcom/stripe/android/model/Token;", "clientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FetchFinancialConnectionsSessionForToken {
    public static final int $stable = 8;
    private final FinancialConnectionsRepository connectionsRepository;

    /* compiled from: FetchFinancialConnectionsSessionForToken.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken", f = "FetchFinancialConnectionsSessionForToken.kt", i = {}, l = {20}, m = "invoke", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FetchFinancialConnectionsSessionForToken.this.invoke(null, this);
        }
    }

    @Inject
    public FetchFinancialConnectionsSessionForToken(FinancialConnectionsRepository connectionsRepository) {
        Intrinsics.checkNotNullParameter(connectionsRepository, "connectionsRepository");
        this.connectionsRepository = connectionsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, Continuation<? super Pair<FinancialConnectionsSession, Token>> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        AnonymousClass1 anonymousClass1;
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
            FinancialConnectionsRepository financialConnectionsRepository = this.connectionsRepository;
            anonymousClass1.label = 1;
            financialConnectionsSession = financialConnectionsRepository.getFinancialConnectionsSession(str, anonymousClass1);
            if (financialConnectionsSession == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(financialConnectionsSession);
        }
        FinancialConnectionsSession financialConnectionsSession2 = (FinancialConnectionsSession) financialConnectionsSession;
        Token parsedToken = financialConnectionsSession2.getParsedToken();
        if (parsedToken == null) {
            throw new IllegalArgumentException("Could not extract Token from FinancialConnectionsSession.".toString());
        }
        return TuplesKt.to(financialConnectionsSession2, parsedToken);
    }
}
