package com.stripe.android.core.utils;

import kotlin.Metadata;

/* compiled from: FeatureFlags.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/core/utils/FeatureFlags;", "", "<init>", "()V", "nativeLinkEnabled", "Lcom/stripe/android/core/utils/FeatureFlag;", "getNativeLinkEnabled", "()Lcom/stripe/android/core/utils/FeatureFlag;", "nativeLinkAttestationEnabled", "getNativeLinkAttestationEnabled", "instantDebitsIncentives", "getInstantDebitsIncentives", "financialConnectionsFullSdkUnavailable", "getFinancialConnectionsFullSdkUnavailable", "forceEnableNativeFinancialConnections", "getForceEnableNativeFinancialConnections", "showInlineOtpInWalletButtons", "getShowInlineOtpInWalletButtons", "forceEnableLinkPaymentSelectionHint", "getForceEnableLinkPaymentSelectionHint", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeatureFlags {
    public static final FeatureFlags INSTANCE = new FeatureFlags();
    private static final FeatureFlag nativeLinkEnabled = new FeatureFlag("Native Link");
    private static final FeatureFlag nativeLinkAttestationEnabled = new FeatureFlag("Native Link Attestation");
    private static final FeatureFlag instantDebitsIncentives = new FeatureFlag("Instant Bank Payments Incentives");
    private static final FeatureFlag financialConnectionsFullSdkUnavailable = new FeatureFlag("FC Full SDK Unavailable");
    private static final FeatureFlag forceEnableNativeFinancialConnections = new FeatureFlag("Force enable FC Native");
    private static final FeatureFlag showInlineOtpInWalletButtons = new FeatureFlag("Show Inline Signup in Wallet Buttons");
    private static final FeatureFlag forceEnableLinkPaymentSelectionHint = new FeatureFlag("Force enable payment selection hint");

    private FeatureFlags() {
    }

    public final FeatureFlag getNativeLinkEnabled() {
        return nativeLinkEnabled;
    }

    public final FeatureFlag getNativeLinkAttestationEnabled() {
        return nativeLinkAttestationEnabled;
    }

    public final FeatureFlag getInstantDebitsIncentives() {
        return instantDebitsIncentives;
    }

    public final FeatureFlag getFinancialConnectionsFullSdkUnavailable() {
        return financialConnectionsFullSdkUnavailable;
    }

    public final FeatureFlag getForceEnableNativeFinancialConnections() {
        return forceEnableNativeFinancialConnections;
    }

    public final FeatureFlag getShowInlineOtpInWalletButtons() {
        return showInlineOtpInWalletButtons;
    }

    public final FeatureFlag getForceEnableLinkPaymentSelectionHint() {
        return forceEnableLinkPaymentSelectionHint;
    }
}
