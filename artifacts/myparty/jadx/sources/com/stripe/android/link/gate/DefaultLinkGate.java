package com.stripe.android.link.gate;

import com.stripe.android.core.utils.FeatureFlag;
import com.stripe.android.core.utils.FeatureFlags;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.gate.LinkGate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultLinkGate.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/link/gate/DefaultLinkGate;", "Lcom/stripe/android/link/gate/LinkGate;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "<init>", "(Lcom/stripe/android/link/LinkConfiguration;)V", "useNativeLink", "", "getUseNativeLink", "()Z", "useAttestationEndpoints", "getUseAttestationEndpoints", "suppress2faModal", "getSuppress2faModal", "useInlineOtpInWalletButtons", "getUseInlineOtpInWalletButtons", "showRuxInFlowController", "getShowRuxInFlowController", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultLinkGate implements LinkGate {
    public static final int $stable = 8;
    private final LinkConfiguration configuration;

    @Inject
    public DefaultLinkGate(LinkConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.configuration = configuration;
    }

    @Override // com.stripe.android.link.gate.LinkGate
    public boolean getUseNativeLink() {
        if (this.configuration.getStripeIntent().isLiveMode()) {
            return getUseAttestationEndpoints();
        }
        FeatureFlag.Flag value = FeatureFlags.INSTANCE.getNativeLinkEnabled().getValue();
        if (Intrinsics.areEqual(value, FeatureFlag.Flag.Disabled.INSTANCE)) {
            return false;
        }
        if (Intrinsics.areEqual(value, FeatureFlag.Flag.Enabled.INSTANCE)) {
            return true;
        }
        if (Intrinsics.areEqual(value, FeatureFlag.Flag.NotSet.INSTANCE)) {
            return getUseAttestationEndpoints();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.stripe.android.link.gate.LinkGate
    public boolean getUseAttestationEndpoints() {
        if (this.configuration.getStripeIntent().isLiveMode()) {
            return this.configuration.getUseAttestationEndpointsForLink();
        }
        FeatureFlag.Flag value = FeatureFlags.INSTANCE.getNativeLinkAttestationEnabled().getValue();
        if (Intrinsics.areEqual(value, FeatureFlag.Flag.Disabled.INSTANCE)) {
            return false;
        }
        if (Intrinsics.areEqual(value, FeatureFlag.Flag.Enabled.INSTANCE)) {
            return true;
        }
        if (Intrinsics.areEqual(value, FeatureFlag.Flag.NotSet.INSTANCE)) {
            return this.configuration.getUseAttestationEndpointsForLink();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.stripe.android.link.gate.LinkGate
    public boolean getSuppress2faModal() {
        return !getUseNativeLink() || this.configuration.getSuppress2faModal();
    }

    @Override // com.stripe.android.link.gate.LinkGate
    public boolean getUseInlineOtpInWalletButtons() {
        return FeatureFlags.INSTANCE.getShowInlineOtpInWalletButtons().isEnabled() && getUseNativeLink();
    }

    @Override // com.stripe.android.link.gate.LinkGate
    public boolean getShowRuxInFlowController() {
        return getUseNativeLink() && !this.configuration.getDisableRuxInFlowController();
    }

    /* compiled from: DefaultLinkGate.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/gate/DefaultLinkGate$Factory;", "Lcom/stripe/android/link/gate/LinkGate$Factory;", "<init>", "()V", "create", "Lcom/stripe/android/link/gate/LinkGate;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements LinkGate.Factory {
        public static final int $stable = 0;

        @Inject
        public Factory() {
        }

        @Override // com.stripe.android.link.gate.LinkGate.Factory
        public LinkGate create(LinkConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new DefaultLinkGate(configuration);
        }
    }
}
