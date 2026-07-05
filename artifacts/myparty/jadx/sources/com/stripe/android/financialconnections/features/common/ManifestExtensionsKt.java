package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManifestExtensions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u000b\u001a\u00020\u0001*\u00020\fH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\r"}, d2 = {"isDataFlow", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z", "canSaveAccountsToLink", "getCanSaveAccountsToLink", "getBusinessName", "", "enableRetrieveAuthSession", "useContinueWithMerchantText", "enableWorkManager", "showManualEntryInErrors", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManifestExtensionsKt {
    public static final boolean isDataFlow(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionManifest, "<this>");
        return financialConnectionsSessionManifest.getPaymentMethodType() == null;
    }

    public static final boolean getCanSaveAccountsToLink(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionManifest, "<this>");
        return Intrinsics.areEqual((Object) financialConnectionsSessionManifest.getAccountholderIsLinkConsumer(), (Object) true) && Intrinsics.areEqual((Object) financialConnectionsSessionManifest.isNetworkingUserFlow(), (Object) true);
    }

    public static final String getBusinessName(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionManifest, "<this>");
        String businessName = financialConnectionsSessionManifest.getBusinessName();
        return businessName == null ? financialConnectionsSessionManifest.getConnectPlatformName() : businessName;
    }

    public static final boolean enableRetrieveAuthSession(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionManifest, "<this>");
        return !(financialConnectionsSessionManifest.getFeatures() != null ? Intrinsics.areEqual((Object) r2.get("bank_connections_disable_defensive_auth_session_retrieval_on_complete"), (Object) true) : false);
    }

    public static final boolean useContinueWithMerchantText(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionManifest, "<this>");
        Map<String, Boolean> features = financialConnectionsSessionManifest.getFeatures();
        if (features != null) {
            return Intrinsics.areEqual((Object) features.get("bank_connections_continue_with_merchant_text"), (Object) true);
        }
        return false;
    }

    public static final boolean enableWorkManager(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionManifest, "<this>");
        Map<String, Boolean> features = financialConnectionsSessionManifest.getFeatures();
        if (features != null) {
            return Intrinsics.areEqual((Object) features.get("bank_connections_android_enable_work_manager"), (Object) true);
        }
        return false;
    }

    public static final boolean showManualEntryInErrors(SynchronizeSessionResponse synchronizeSessionResponse) {
        Intrinsics.checkNotNullParameter(synchronizeSessionResponse, "<this>");
        return synchronizeSessionResponse.getManifest().getAllowManualEntry() && !synchronizeSessionResponse.getVisual().getReducedManualEntryProminenceInErrors();
    }
}
