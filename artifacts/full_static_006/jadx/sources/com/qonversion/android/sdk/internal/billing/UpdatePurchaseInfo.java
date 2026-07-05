package com.qonversion.android.sdk.internal.billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.QPurchaseUpdatePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdatePurchaseInfo.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;", "", "purchaseToken", "", "updatePolicy", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V", "getPurchaseToken", "()Ljava/lang/String;", "getUpdatePolicy", "()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class UpdatePurchaseInfo {
    private final String purchaseToken;
    private final QPurchaseUpdatePolicy updatePolicy;

    public static /* synthetic */ UpdatePurchaseInfo copy$default(UpdatePurchaseInfo updatePurchaseInfo, String str, QPurchaseUpdatePolicy qPurchaseUpdatePolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updatePurchaseInfo.purchaseToken;
        }
        if ((i & 2) != 0) {
            qPurchaseUpdatePolicy = updatePurchaseInfo.updatePolicy;
        }
        return updatePurchaseInfo.copy(str, qPurchaseUpdatePolicy);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component2, reason: from getter */
    public final QPurchaseUpdatePolicy getUpdatePolicy() {
        return this.updatePolicy;
    }

    public final UpdatePurchaseInfo copy(String purchaseToken, QPurchaseUpdatePolicy updatePolicy) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        return new UpdatePurchaseInfo(purchaseToken, updatePolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePurchaseInfo)) {
            return false;
        }
        UpdatePurchaseInfo updatePurchaseInfo = (UpdatePurchaseInfo) other;
        return Intrinsics.areEqual(this.purchaseToken, updatePurchaseInfo.purchaseToken) && this.updatePolicy == updatePurchaseInfo.updatePolicy;
    }

    public int hashCode() {
        int iHashCode = this.purchaseToken.hashCode() * 31;
        QPurchaseUpdatePolicy qPurchaseUpdatePolicy = this.updatePolicy;
        return iHashCode + (qPurchaseUpdatePolicy == null ? 0 : qPurchaseUpdatePolicy.hashCode());
    }

    public String toString() {
        return "UpdatePurchaseInfo(purchaseToken=" + this.purchaseToken + ", updatePolicy=" + this.updatePolicy + ")";
    }

    public UpdatePurchaseInfo(String purchaseToken, QPurchaseUpdatePolicy qPurchaseUpdatePolicy) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.purchaseToken = purchaseToken;
        this.updatePolicy = qPurchaseUpdatePolicy;
    }

    public /* synthetic */ UpdatePurchaseInfo(String str, QPurchaseUpdatePolicy qPurchaseUpdatePolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : qPurchaseUpdatePolicy);
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final QPurchaseUpdatePolicy getUpdatePolicy() {
        return this.updatePolicy;
    }
}
