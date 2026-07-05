package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsNetworkingRelinkSession.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/domain/RealIsNetworkingRelinkSession;", "Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;", "pendingRepairRepository", "Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;", "<init>", "(Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;)V", "invoke", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealIsNetworkingRelinkSession implements IsNetworkingRelinkSession {
    public static final int $stable = 8;
    private final CoreAuthorizationPendingNetworkingRepairRepository pendingRepairRepository;

    @Inject
    public RealIsNetworkingRelinkSession(CoreAuthorizationPendingNetworkingRepairRepository pendingRepairRepository) {
        Intrinsics.checkNotNullParameter(pendingRepairRepository, "pendingRepairRepository");
        this.pendingRepairRepository = pendingRepairRepository;
    }

    @Override // com.stripe.android.financialconnections.domain.IsNetworkingRelinkSession
    public boolean invoke() {
        return this.pendingRepairRepository.get() != null;
    }
}
