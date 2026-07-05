package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.utils.FeatureFlags;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.debug.DebugConfiguration;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.utils.Experiment;
import com.stripe.android.financialconnections.utils.ExperimentsKt;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeAuthFlowRouter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;", "", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "debugConfiguration", "Lcom/stripe/android/financialconnections/debug/DebugConfiguration;", "<init>", "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/debug/DebugConfiguration;)V", "nativeAuthFlowEnabled", "", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "logExposure", "", "nativeKillSwitchActive", "nativeExperienceEnabled", "shouldLogExposure", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NativeAuthFlowRouter {
    private static final String EXPERIMENT_VALUE_NATIVE_TREATMENT = "treatment";
    private static final String FEATURE_KEY_NATIVE_KILLSWITCH = "bank_connections_mobile_native_version_killswitch";
    private final DebugConfiguration debugConfiguration;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    public static final int $stable = 8;

    @Inject
    public NativeAuthFlowRouter(FinancialConnectionsAnalyticsTracker eventTracker, DebugConfiguration debugConfiguration) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(debugConfiguration, "debugConfiguration");
        this.eventTracker = eventTracker;
        this.debugConfiguration = debugConfiguration;
    }

    public final boolean nativeAuthFlowEnabled(FinancialConnectionsSessionManifest manifest) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        if (FeatureFlags.INSTANCE.getForceEnableNativeFinancialConnections().isEnabled()) {
            return true;
        }
        Boolean overriddenNative$financial_connections_release = this.debugConfiguration.getOverriddenNative$financial_connections_release();
        return overriddenNative$financial_connections_release != null ? overriddenNative$financial_connections_release.booleanValue() : !nativeKillSwitchActive(manifest) && nativeExperienceEnabled(manifest);
    }

    public final void logExposure(FinancialConnectionsSessionManifest manifest) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        if (shouldLogExposure(manifest)) {
            ExperimentsKt.trackExposure(this.eventTracker, Experiment.CONNECTIONS_MOBILE_NATIVE, manifest);
        }
    }

    private final boolean nativeKillSwitchActive(FinancialConnectionsSessionManifest manifest) {
        Map<String, Boolean> features = manifest.getFeatures();
        if (features == null) {
            return true;
        }
        if (features.isEmpty()) {
            return false;
        }
        for (Map.Entry<String, Boolean> entry : features.entrySet()) {
            if (Intrinsics.areEqual(entry.getKey(), FEATURE_KEY_NATIVE_KILLSWITCH) && entry.getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final boolean nativeExperienceEnabled(FinancialConnectionsSessionManifest manifest) {
        Boolean boolIsLinkWithStripe = manifest.isLinkWithStripe();
        return (boolIsLinkWithStripe != null ? boolIsLinkWithStripe.booleanValue() : false) || Intrinsics.areEqual(ExperimentsKt.experimentAssignment(manifest, Experiment.CONNECTIONS_MOBILE_NATIVE), EXPERIMENT_VALUE_NATIVE_TREATMENT);
    }

    private final boolean shouldLogExposure(FinancialConnectionsSessionManifest manifest) {
        boolean z = this.debugConfiguration.getOverriddenNative$financial_connections_release() != null;
        Boolean boolIsLinkWithStripe = manifest.isLinkWithStripe();
        return (z || (boolIsLinkWithStripe != null ? boolIsLinkWithStripe.booleanValue() : false) || nativeKillSwitchActive(manifest)) ? false : true;
    }
}
