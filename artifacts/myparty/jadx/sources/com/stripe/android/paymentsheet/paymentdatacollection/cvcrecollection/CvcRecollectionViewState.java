package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CvcRecollectionViewState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewState;", "", "lastFour", "", "isTestMode", "", "cvcState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;", "isEnabled", "<init>", "(Ljava/lang/String;ZLcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;Z)V", "getLastFour", "()Ljava/lang/String;", "()Z", "getCvcState", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CvcRecollectionViewState {
    public static final int $stable = 0;
    private final CvcState cvcState;
    private final boolean isEnabled;
    private final boolean isTestMode;
    private final String lastFour;

    public static /* synthetic */ CvcRecollectionViewState copy$default(CvcRecollectionViewState cvcRecollectionViewState, String str, boolean z, CvcState cvcState, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cvcRecollectionViewState.lastFour;
        }
        if ((i & 2) != 0) {
            z = cvcRecollectionViewState.isTestMode;
        }
        if ((i & 4) != 0) {
            cvcState = cvcRecollectionViewState.cvcState;
        }
        if ((i & 8) != 0) {
            z2 = cvcRecollectionViewState.isEnabled;
        }
        return cvcRecollectionViewState.copy(str, z, cvcState, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    /* renamed from: component3, reason: from getter */
    public final CvcState getCvcState() {
        return this.cvcState;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final CvcRecollectionViewState copy(String lastFour, boolean isTestMode, CvcState cvcState, boolean isEnabled) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(cvcState, "cvcState");
        return new CvcRecollectionViewState(lastFour, isTestMode, cvcState, isEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CvcRecollectionViewState)) {
            return false;
        }
        CvcRecollectionViewState cvcRecollectionViewState = (CvcRecollectionViewState) other;
        return Intrinsics.areEqual(this.lastFour, cvcRecollectionViewState.lastFour) && this.isTestMode == cvcRecollectionViewState.isTestMode && Intrinsics.areEqual(this.cvcState, cvcRecollectionViewState.cvcState) && this.isEnabled == cvcRecollectionViewState.isEnabled;
    }

    public int hashCode() {
        return (((((this.lastFour.hashCode() * 31) + Boolean.hashCode(this.isTestMode)) * 31) + this.cvcState.hashCode()) * 31) + Boolean.hashCode(this.isEnabled);
    }

    public String toString() {
        return "CvcRecollectionViewState(lastFour=" + this.lastFour + ", isTestMode=" + this.isTestMode + ", cvcState=" + this.cvcState + ", isEnabled=" + this.isEnabled + ")";
    }

    public CvcRecollectionViewState(String lastFour, boolean z, CvcState cvcState, boolean z2) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(cvcState, "cvcState");
        this.lastFour = lastFour;
        this.isTestMode = z;
        this.cvcState = cvcState;
        this.isEnabled = z2;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }

    public final CvcState getCvcState() {
        return this.cvcState;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }
}
