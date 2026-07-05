package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsLinkWithStripe.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe;", "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;", "initialState", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "<init>", "(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V", "invoke", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealIsLinkWithStripe implements IsLinkWithStripe {
    public static final int $stable = 8;
    private final FinancialConnectionsSheetNativeState initialState;

    @Inject
    public RealIsLinkWithStripe(FinancialConnectionsSheetNativeState initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.initialState = initialState;
    }

    @Override // com.stripe.android.financialconnections.domain.IsLinkWithStripe
    public boolean invoke() {
        return this.initialState.isLinkWithStripe();
    }
}
