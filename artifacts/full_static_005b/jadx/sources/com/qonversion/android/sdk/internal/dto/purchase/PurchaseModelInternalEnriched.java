package com.qonversion.android.sdk.internal.dto.purchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QPurchaseUpdatePolicy;
import com.qonversion.android.sdk.dto.products.QProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseModelInternalEnriched.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B3\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;", "purchaseModel", "product", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/dto/products/QProduct;)V", "productId", "", "oldProduct", "updatePolicy", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "options", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V", "getOldProduct", "()Lcom/qonversion/android/sdk/dto/products/QProduct;", "getProduct", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class PurchaseModelInternalEnriched extends PurchaseModelInternal {
    private final QProduct oldProduct;
    private final QProduct product;

    public final QProduct getProduct() {
        return this.product;
    }

    public final QProduct getOldProduct() {
        return this.oldProduct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseModelInternalEnriched(String productId, QProduct product, QProduct qProduct, QPurchaseUpdatePolicy qPurchaseUpdatePolicy, QPurchaseOptions qPurchaseOptions) {
        super(productId, qProduct != null ? qProduct.getQonversionID() : null, qPurchaseUpdatePolicy, qPurchaseOptions);
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(product, "product");
        this.product = product;
        this.oldProduct = qProduct;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PurchaseModelInternalEnriched(PurchaseModelInternal purchaseModel, QProduct product) {
        Intrinsics.checkNotNullParameter(purchaseModel, "purchaseModel");
        Intrinsics.checkNotNullParameter(product, "product");
        String productId = purchaseModel.getProductId();
        QPurchaseOptions options = purchaseModel.getOptions();
        this(productId, product, options != null ? options.getOldProduct() : null, purchaseModel.getUpdatePolicy(), purchaseModel.getOptions());
    }
}
