package com.stripe.android.financialconnections;

import android.os.Bundle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgsKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetState.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000201B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0011J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010+\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00062"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "", "initialArgs", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "activityRecreated", "", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "webAuthFlowStatus", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;", "viewEffect", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", "<init>", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;)V", CardScanActivity.ARGS, "savedState", "Landroid/os/Bundle;", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;Landroid/os/Bundle;)V", "getInitialArgs", "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "getActivityRecreated", "()Z", "getManifest", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "getWebAuthFlowStatus", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;", "getViewEffect", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", "isInstantDebits", "theme", "Lcom/stripe/android/financialconnections/ui/theme/Theme;", "getTheme", "()Lcom/stripe/android/financialconnections/ui/theme/Theme;", "sessionSecret", "", "getSessionSecret", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "AuthFlowStatus", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsSheetState {
    public static final String KEY_MANIFEST = "financial_connections_sheet_manifest";
    public static final String KEY_SAVED_STATE = "financial_connections_sheet_state";
    public static final String KEY_WEB_AUTH_FLOW_STATUS = "financial_connections_sheet_web_auth_flow_status";
    private final boolean activityRecreated;
    private final FinancialConnectionsSheetActivityArgs initialArgs;
    private final FinancialConnectionsSessionManifest manifest;
    private final FinancialConnectionsSheetViewEffect viewEffect;
    private final AuthFlowStatus webAuthFlowStatus;
    public static final int $stable = 8;

    public static /* synthetic */ FinancialConnectionsSheetState copy$default(FinancialConnectionsSheetState financialConnectionsSheetState, FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs, boolean z, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, AuthFlowStatus authFlowStatus, FinancialConnectionsSheetViewEffect financialConnectionsSheetViewEffect, int i, Object obj) {
        if ((i & 1) != 0) {
            financialConnectionsSheetActivityArgs = financialConnectionsSheetState.initialArgs;
        }
        if ((i & 2) != 0) {
            z = financialConnectionsSheetState.activityRecreated;
        }
        if ((i & 4) != 0) {
            financialConnectionsSessionManifest = financialConnectionsSheetState.manifest;
        }
        if ((i & 8) != 0) {
            authFlowStatus = financialConnectionsSheetState.webAuthFlowStatus;
        }
        if ((i & 16) != 0) {
            financialConnectionsSheetViewEffect = financialConnectionsSheetState.viewEffect;
        }
        FinancialConnectionsSheetViewEffect financialConnectionsSheetViewEffect2 = financialConnectionsSheetViewEffect;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = financialConnectionsSessionManifest;
        return financialConnectionsSheetState.copy(financialConnectionsSheetActivityArgs, z, financialConnectionsSessionManifest2, authFlowStatus, financialConnectionsSheetViewEffect2);
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSheetActivityArgs getInitialArgs() {
        return this.initialArgs;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getActivityRecreated() {
        return this.activityRecreated;
    }

    /* renamed from: component3, reason: from getter */
    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    /* renamed from: component4, reason: from getter */
    public final AuthFlowStatus getWebAuthFlowStatus() {
        return this.webAuthFlowStatus;
    }

    /* renamed from: component5, reason: from getter */
    public final FinancialConnectionsSheetViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final FinancialConnectionsSheetState copy(FinancialConnectionsSheetActivityArgs initialArgs, boolean activityRecreated, FinancialConnectionsSessionManifest manifest, AuthFlowStatus webAuthFlowStatus, FinancialConnectionsSheetViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(initialArgs, "initialArgs");
        Intrinsics.checkNotNullParameter(webAuthFlowStatus, "webAuthFlowStatus");
        return new FinancialConnectionsSheetState(initialArgs, activityRecreated, manifest, webAuthFlowStatus, viewEffect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSheetState)) {
            return false;
        }
        FinancialConnectionsSheetState financialConnectionsSheetState = (FinancialConnectionsSheetState) other;
        return Intrinsics.areEqual(this.initialArgs, financialConnectionsSheetState.initialArgs) && this.activityRecreated == financialConnectionsSheetState.activityRecreated && Intrinsics.areEqual(this.manifest, financialConnectionsSheetState.manifest) && this.webAuthFlowStatus == financialConnectionsSheetState.webAuthFlowStatus && Intrinsics.areEqual(this.viewEffect, financialConnectionsSheetState.viewEffect);
    }

    public int hashCode() {
        int iHashCode = ((this.initialArgs.hashCode() * 31) + Boolean.hashCode(this.activityRecreated)) * 31;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = this.manifest;
        int iHashCode2 = (((iHashCode + (financialConnectionsSessionManifest == null ? 0 : financialConnectionsSessionManifest.hashCode())) * 31) + this.webAuthFlowStatus.hashCode()) * 31;
        FinancialConnectionsSheetViewEffect financialConnectionsSheetViewEffect = this.viewEffect;
        return iHashCode2 + (financialConnectionsSheetViewEffect != null ? financialConnectionsSheetViewEffect.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsSheetState(initialArgs=" + this.initialArgs + ", activityRecreated=" + this.activityRecreated + ", manifest=" + this.manifest + ", webAuthFlowStatus=" + this.webAuthFlowStatus + ", viewEffect=" + this.viewEffect + ")";
    }

    public FinancialConnectionsSheetState(FinancialConnectionsSheetActivityArgs initialArgs, boolean z, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, AuthFlowStatus webAuthFlowStatus, FinancialConnectionsSheetViewEffect financialConnectionsSheetViewEffect) {
        Intrinsics.checkNotNullParameter(initialArgs, "initialArgs");
        Intrinsics.checkNotNullParameter(webAuthFlowStatus, "webAuthFlowStatus");
        this.initialArgs = initialArgs;
        this.activityRecreated = z;
        this.manifest = financialConnectionsSessionManifest;
        this.webAuthFlowStatus = webAuthFlowStatus;
        this.viewEffect = financialConnectionsSheetViewEffect;
    }

    public final FinancialConnectionsSheetActivityArgs getInitialArgs() {
        return this.initialArgs;
    }

    public final boolean getActivityRecreated() {
        return this.activityRecreated;
    }

    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    public final AuthFlowStatus getWebAuthFlowStatus() {
        return this.webAuthFlowStatus;
    }

    public final FinancialConnectionsSheetViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final boolean isInstantDebits() {
        return FinancialConnectionsSheetActivityArgsKt.getFlowType(this.initialArgs) == FinancialConnectionsSheetFlowType.ForInstantDebits;
    }

    public final Theme getTheme() {
        return isInstantDebits() ? Theme.LinkLight : Theme.DefaultLight;
    }

    public final String getSessionSecret() {
        return this.initialArgs.getConfiguration().getFinancialConnectionsSessionClientSecret();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FinancialConnectionsSheetState(FinancialConnectionsSheetActivityArgs args, Bundle bundle) {
        Intrinsics.checkNotNullParameter(args, "args");
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = bundle != null ? (FinancialConnectionsSessionManifest) bundle.getParcelable(KEY_MANIFEST) : null;
        Serializable serializable = bundle != null ? bundle.getSerializable(KEY_WEB_AUTH_FLOW_STATUS) : null;
        AuthFlowStatus authFlowStatus = serializable instanceof AuthFlowStatus ? (AuthFlowStatus) serializable : null;
        this(args, false, financialConnectionsSessionManifest, authFlowStatus == null ? AuthFlowStatus.NONE : authFlowStatus, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinancialConnectionsSheetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ON_EXTERNAL_ACTIVITY", "INTERMEDIATE_DEEPLINK", "NONE", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuthFlowStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AuthFlowStatus[] $VALUES;
        public static final AuthFlowStatus ON_EXTERNAL_ACTIVITY = new AuthFlowStatus("ON_EXTERNAL_ACTIVITY", 0);
        public static final AuthFlowStatus INTERMEDIATE_DEEPLINK = new AuthFlowStatus("INTERMEDIATE_DEEPLINK", 1);
        public static final AuthFlowStatus NONE = new AuthFlowStatus("NONE", 2);

        private static final /* synthetic */ AuthFlowStatus[] $values() {
            return new AuthFlowStatus[]{ON_EXTERNAL_ACTIVITY, INTERMEDIATE_DEEPLINK, NONE};
        }

        public static EnumEntries<AuthFlowStatus> getEntries() {
            return $ENTRIES;
        }

        private AuthFlowStatus(String str, int i) {
        }

        static {
            AuthFlowStatus[] authFlowStatusArr$values = $values();
            $VALUES = authFlowStatusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(authFlowStatusArr$values);
        }

        public static AuthFlowStatus valueOf(String str) {
            return (AuthFlowStatus) Enum.valueOf(AuthFlowStatus.class, str);
        }

        public static AuthFlowStatus[] values() {
            return (AuthFlowStatus[]) $VALUES.clone();
        }
    }
}
