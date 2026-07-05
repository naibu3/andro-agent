package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.GetFinancialConnectionsAcccountsParams;
import com.stripe.android.financialconnections.model.ManualEntry;
import com.stripe.android.financialconnections.model.PaymentAccount;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FetchPaginatedAccountsForSession.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0086B¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;", "", "financialConnectionsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V", "invoke", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "session", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FetchPaginatedAccountsForSession {
    public static final int $stable = 8;
    private final FinancialConnectionsRepository financialConnectionsRepository;

    /* compiled from: FetchPaginatedAccountsForSession.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.FetchPaginatedAccountsForSession", f = "FetchPaginatedAccountsForSession.kt", i = {0, 0, 0, 1, 1, 1}, l = {28, 34}, m = "invoke", n = {"this", "session", "accounts", "this", "session", "accounts"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.financialconnections.domain.FetchPaginatedAccountsForSession$invoke$1, reason: invalid class name */
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
            return FetchPaginatedAccountsForSession.this.invoke(null, this);
        }
    }

    @Inject
    public FetchPaginatedAccountsForSession(FinancialConnectionsRepository financialConnectionsRepository) {
        Intrinsics.checkNotNullParameter(financialConnectionsRepository, "financialConnectionsRepository");
        this.financialConnectionsRepository = financialConnectionsRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e1, code lost:
    
        if (r2 == r4) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00e1 -> B:30:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(FinancialConnectionsSession financialConnectionsSession, Continuation<? super FinancialConnectionsSession> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        AnonymousClass1 anonymousClass1;
        ArrayList arrayList;
        Object financialConnectionsAccounts;
        FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession;
        FinancialConnectionsAccountList financialConnectionsAccountList;
        ArrayList arrayList2;
        FinancialConnectionsSession financialConnectionsSession2 = financialConnectionsSession;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object financialConnectionsAccounts2 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(financialConnectionsAccounts2);
            if (!financialConnectionsSession2.getAccounts().getHasMore()) {
                return financialConnectionsSession2;
            }
            arrayList = new ArrayList();
            arrayList.addAll(financialConnectionsSession2.getAccounts().getData());
            FinancialConnectionsRepository financialConnectionsRepository = this.financialConnectionsRepository;
            GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams = new GetFinancialConnectionsAcccountsParams(financialConnectionsSession2.getClientSecret(), ((FinancialConnectionsAccount) CollectionsKt.last((List) arrayList)).getId());
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = financialConnectionsSession2;
            anonymousClass1.L$2 = arrayList;
            anonymousClass1.label = 1;
            financialConnectionsAccounts = financialConnectionsRepository.getFinancialConnectionsAccounts(getFinancialConnectionsAcccountsParams, anonymousClass1);
            if (financialConnectionsAccounts != coroutine_suspended) {
                fetchPaginatedAccountsForSession = this;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ?? r1 = (List) anonymousClass1.L$2;
            FinancialConnectionsSession financialConnectionsSession3 = (FinancialConnectionsSession) anonymousClass1.L$1;
            fetchPaginatedAccountsForSession = (FetchPaginatedAccountsForSession) anonymousClass1.L$0;
            ResultKt.throwOnFailure(financialConnectionsAccounts2);
            arrayList = r1;
            financialConnectionsSession2 = financialConnectionsSession3;
            financialConnectionsAccounts = financialConnectionsAccounts2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r12 = (List) anonymousClass1.L$2;
            FinancialConnectionsSession financialConnectionsSession4 = (FinancialConnectionsSession) anonymousClass1.L$1;
            fetchPaginatedAccountsForSession = (FetchPaginatedAccountsForSession) anonymousClass1.L$0;
            ResultKt.throwOnFailure(financialConnectionsAccounts2);
            arrayList2 = r12;
            financialConnectionsSession2 = financialConnectionsSession4;
            financialConnectionsAccountList = (FinancialConnectionsAccountList) financialConnectionsAccounts2;
            arrayList2.addAll(financialConnectionsAccountList.getData());
            if (!financialConnectionsAccountList.getHasMore() && arrayList2.size() < 100) {
                FinancialConnectionsRepository financialConnectionsRepository2 = fetchPaginatedAccountsForSession.financialConnectionsRepository;
                GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams2 = new GetFinancialConnectionsAcccountsParams(financialConnectionsSession2.getClientSecret(), ((FinancialConnectionsAccount) CollectionsKt.last((List) arrayList2)).getId());
                anonymousClass1.L$0 = fetchPaginatedAccountsForSession;
                anonymousClass1.L$1 = financialConnectionsSession2;
                anonymousClass1.L$2 = arrayList2;
                anonymousClass1.label = 2;
                financialConnectionsAccounts2 = financialConnectionsRepository2.getFinancialConnectionsAccounts(getFinancialConnectionsAcccountsParams2, anonymousClass1);
            } else {
                return new FinancialConnectionsSession(financialConnectionsSession2.getClientSecret(), financialConnectionsSession2.getId(), (FinancialConnectionsAccountList) null, new FinancialConnectionsAccountList(arrayList2, financialConnectionsAccountList.getHasMore(), financialConnectionsAccountList.getUrl(), Boxing.boxInt(arrayList2.size()), financialConnectionsAccountList.getTotalCount()), financialConnectionsSession2.getLivemode(), (PaymentAccount) null, (String) null, (String) null, (ManualEntry) null, (FinancialConnectionsSession.Status) null, (FinancialConnectionsSession.StatusDetails) null, 1892, (DefaultConstructorMarker) null);
            }
        }
        financialConnectionsAccountList = (FinancialConnectionsAccountList) financialConnectionsAccounts;
        arrayList.addAll(financialConnectionsAccountList.getData());
        arrayList2 = arrayList;
        if (!financialConnectionsAccountList.getHasMore()) {
        }
        return new FinancialConnectionsSession(financialConnectionsSession2.getClientSecret(), financialConnectionsSession2.getId(), (FinancialConnectionsAccountList) null, new FinancialConnectionsAccountList(arrayList2, financialConnectionsAccountList.getHasMore(), financialConnectionsAccountList.getUrl(), Boxing.boxInt(arrayList2.size()), financialConnectionsAccountList.getTotalCount()), financialConnectionsSession2.getLivemode(), (PaymentAccount) null, (String) null, (String) null, (ManualEntry) null, (FinancialConnectionsSession.Status) null, (FinancialConnectionsSession.StatusDetails) null, 1892, (DefaultConstructorMarker) null);
    }
}
