package com.stripe.android.financialconnections.utils;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Experiments.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0000¨\u0006\u000b"}, d2 = {"experimentPresent", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "experiment", "Lcom/stripe/android/financialconnections/utils/Experiment;", "experimentAssignment", "", "trackExposure", "", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "manifest", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExperimentsKt {
    public static final boolean experimentPresent(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, Experiment experiment) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionManifest, "<this>");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        return experimentAssignment(financialConnectionsSessionManifest, experiment) != null;
    }

    public static final String experimentAssignment(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, Experiment experiment) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionManifest, "<this>");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Map<String, String> experimentAssignments = financialConnectionsSessionManifest.getExperimentAssignments();
        if (experimentAssignments != null) {
            return experimentAssignments.get(experiment.getKey());
        }
        return null;
    }

    public static final void trackExposure(FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, Experiment experiment, FinancialConnectionsSessionManifest manifest) {
        Intrinsics.checkNotNullParameter(financialConnectionsAnalyticsTracker, "<this>");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        String assignmentEventId = manifest.getAssignmentEventId();
        String accountholderToken = manifest.getAccountholderToken();
        if (!experimentPresent(manifest, experiment) || assignmentEventId == null || accountholderToken == null) {
            return;
        }
        financialConnectionsAnalyticsTracker.track(new FinancialConnectionsAnalyticsEvent.Exposure(experiment.getKey(), assignmentEventId, accountholderToken));
    }
}
