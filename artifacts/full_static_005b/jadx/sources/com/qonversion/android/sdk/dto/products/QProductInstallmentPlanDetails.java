package com.qonversion.android.sdk.dto.products;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.ProductDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QProductInstallmentPlanDetails.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;", "", "originalInstallmentPlanDetails", "Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;", "(Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;)V", "commitmentPaymentsCount", "", "getCommitmentPaymentsCount", "()I", "getOriginalInstallmentPlanDetails", "()Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;", "subsequentCommitmentPaymentsCount", "getSubsequentCommitmentPaymentsCount", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QProductInstallmentPlanDetails {
    private final int commitmentPaymentsCount;
    private final ProductDetails.InstallmentPlanDetails originalInstallmentPlanDetails;
    private final int subsequentCommitmentPaymentsCount;

    public static /* synthetic */ QProductInstallmentPlanDetails copy$default(QProductInstallmentPlanDetails qProductInstallmentPlanDetails, ProductDetails.InstallmentPlanDetails installmentPlanDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            installmentPlanDetails = qProductInstallmentPlanDetails.originalInstallmentPlanDetails;
        }
        return qProductInstallmentPlanDetails.copy(installmentPlanDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final ProductDetails.InstallmentPlanDetails getOriginalInstallmentPlanDetails() {
        return this.originalInstallmentPlanDetails;
    }

    public final QProductInstallmentPlanDetails copy(ProductDetails.InstallmentPlanDetails originalInstallmentPlanDetails) {
        Intrinsics.checkNotNullParameter(originalInstallmentPlanDetails, "originalInstallmentPlanDetails");
        return new QProductInstallmentPlanDetails(originalInstallmentPlanDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QProductInstallmentPlanDetails) && Intrinsics.areEqual(this.originalInstallmentPlanDetails, ((QProductInstallmentPlanDetails) other).originalInstallmentPlanDetails);
    }

    public int hashCode() {
        return this.originalInstallmentPlanDetails.hashCode();
    }

    public String toString() {
        return "QProductInstallmentPlanDetails(originalInstallmentPlanDetails=" + this.originalInstallmentPlanDetails + ")";
    }

    public QProductInstallmentPlanDetails(ProductDetails.InstallmentPlanDetails originalInstallmentPlanDetails) {
        Intrinsics.checkNotNullParameter(originalInstallmentPlanDetails, "originalInstallmentPlanDetails");
        this.originalInstallmentPlanDetails = originalInstallmentPlanDetails;
        this.commitmentPaymentsCount = originalInstallmentPlanDetails.getInstallmentPlanCommitmentPaymentsCount();
        this.subsequentCommitmentPaymentsCount = originalInstallmentPlanDetails.getSubsequentInstallmentPlanCommitmentPaymentsCount();
    }

    public final ProductDetails.InstallmentPlanDetails getOriginalInstallmentPlanDetails() {
        return this.originalInstallmentPlanDetails;
    }

    public final int getCommitmentPaymentsCount() {
        return this.commitmentPaymentsCount;
    }

    public final int getSubsequentCommitmentPaymentsCount() {
        return this.subsequentCommitmentPaymentsCount;
    }
}
