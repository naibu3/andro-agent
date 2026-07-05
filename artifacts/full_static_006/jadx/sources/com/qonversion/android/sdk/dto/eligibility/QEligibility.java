package com.qonversion.android.sdk.dto.eligibility;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QEligibility.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;", "", NotificationCompat.CATEGORY_STATUS, "Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;", "(Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;)V", "getStatus", "()Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QEligibility {
    private final QIntroEligibilityStatus status;

    public static /* synthetic */ QEligibility copy$default(QEligibility qEligibility, QIntroEligibilityStatus qIntroEligibilityStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            qIntroEligibilityStatus = qEligibility.status;
        }
        return qEligibility.copy(qIntroEligibilityStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final QIntroEligibilityStatus getStatus() {
        return this.status;
    }

    public final QEligibility copy(QIntroEligibilityStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new QEligibility(status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QEligibility) && this.status == ((QEligibility) other).status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return "QEligibility(status=" + this.status + ")";
    }

    public QEligibility(QIntroEligibilityStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
    }

    public final QIntroEligibilityStatus getStatus() {
        return this.status;
    }
}
