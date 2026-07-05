package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarkLinkStepUpVerified.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0086B¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/financialconnections/domain/MarkLinkStepUpVerified;", "", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "<init>", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;)V", "invoke", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MarkLinkStepUpVerified {
    public static final int $stable = 8;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final FinancialConnectionsManifestRepository repository;

    @Inject
    public MarkLinkStepUpVerified(FinancialConnectionsSheetConfiguration configuration, FinancialConnectionsManifestRepository repository) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.configuration = configuration;
        this.repository = repository;
    }

    public final Object invoke(Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        return this.repository.postMarkLinkStepUpVerified(this.configuration.getFinancialConnectionsSessionClientSecret(), continuation);
    }
}
