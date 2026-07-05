package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateLocalManifest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;)V", "getRepository", "()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "invoke", "", "block", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpdateLocalManifest {
    public static final int $stable = 8;
    private final FinancialConnectionsManifestRepository repository;

    @Inject
    public UpdateLocalManifest(FinancialConnectionsManifestRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final FinancialConnectionsManifestRepository getRepository() {
        return this.repository;
    }

    public final void invoke(Function1<? super FinancialConnectionsSessionManifest, FinancialConnectionsSessionManifest> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.repository.updateLocalManifest(block);
    }
}
