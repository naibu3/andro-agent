package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateCachedAccounts.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0086B¢\u0006\u0002\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;)V", "getRepository", "()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "invoke", "", "accounts", "", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpdateCachedAccounts {
    public static final int $stable = 8;
    private final FinancialConnectionsAccountsRepository repository;

    @Inject
    public UpdateCachedAccounts(FinancialConnectionsAccountsRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final FinancialConnectionsAccountsRepository getRepository() {
        return this.repository;
    }

    public final Object invoke(List<PartnerAccount> list, Continuation<? super Unit> continuation) {
        Object objUpdateCachedAccounts = this.repository.updateCachedAccounts(list, continuation);
        return objUpdateCachedAccounts == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateCachedAccounts : Unit.INSTANCE;
    }
}
