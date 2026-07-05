package com.qonversion.android.sdk.internal.dto.eligibility;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.qonversion.android.sdk.dto.eligibility.QIntroEligibilityStatus;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductEligibility.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/eligibility/ProductEligibility;", "", "product", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "eligibilityStatus", "Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;", "(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;)V", "getEligibilityStatus", "()Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;", "getProduct", "()Lcom/qonversion/android/sdk/dto/products/QProduct;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class ProductEligibility {
    private final QIntroEligibilityStatus eligibilityStatus;
    private final QProduct product;

    public static /* synthetic */ ProductEligibility copy$default(ProductEligibility productEligibility, QProduct qProduct, QIntroEligibilityStatus qIntroEligibilityStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            qProduct = productEligibility.product;
        }
        if ((i & 2) != 0) {
            qIntroEligibilityStatus = productEligibility.eligibilityStatus;
        }
        return productEligibility.copy(qProduct, qIntroEligibilityStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final QProduct getProduct() {
        return this.product;
    }

    /* renamed from: component2, reason: from getter */
    public final QIntroEligibilityStatus getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    public final ProductEligibility copy(@Json(name = "product") QProduct product, @Json(name = "intro_eligibility_status") QIntroEligibilityStatus eligibilityStatus) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(eligibilityStatus, "eligibilityStatus");
        return new ProductEligibility(product, eligibilityStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductEligibility)) {
            return false;
        }
        ProductEligibility productEligibility = (ProductEligibility) other;
        return Intrinsics.areEqual(this.product, productEligibility.product) && this.eligibilityStatus == productEligibility.eligibilityStatus;
    }

    public int hashCode() {
        return (this.product.hashCode() * 31) + this.eligibilityStatus.hashCode();
    }

    public String toString() {
        return "ProductEligibility(product=" + this.product + ", eligibilityStatus=" + this.eligibilityStatus + ")";
    }

    public ProductEligibility(@Json(name = "product") QProduct product, @Json(name = "intro_eligibility_status") QIntroEligibilityStatus eligibilityStatus) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(eligibilityStatus, "eligibilityStatus");
        this.product = product;
        this.eligibilityStatus = eligibilityStatus;
    }

    public final QProduct getProduct() {
        return this.product;
    }

    public final QIntroEligibilityStatus getEligibilityStatus() {
        return this.eligibilityStatus;
    }
}
