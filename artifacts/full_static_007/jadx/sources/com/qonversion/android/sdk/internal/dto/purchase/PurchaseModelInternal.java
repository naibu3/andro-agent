package com.qonversion.android.sdk.internal.dto.purchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.QPurchaseModel;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QPurchaseUpdateModel;
import com.qonversion.android.sdk.dto.QPurchaseUpdatePolicy;
import com.qonversion.android.sdk.dto.products.QProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseModelInternal.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\n¢\u0006\u0002\u0010\u000bB+\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;", "", "purchaseModel", "Lcom/qonversion/android/sdk/dto/QPurchaseModel;", "(Lcom/qonversion/android/sdk/dto/QPurchaseModel;)V", "product", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "options", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;", "(Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;)V", "productId", "", "oldProductId", "updatePolicy", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V", "getOldProductId", "()Ljava/lang/String;", "getOptions", "()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "getProductId", "getUpdatePolicy", "()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "enrich", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;", "oldProduct", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public class PurchaseModelInternal {
    private final String oldProductId;
    private final QPurchaseOptions options;
    private final String productId;
    private final QPurchaseUpdatePolicy updatePolicy;

    public PurchaseModelInternal(String productId, String str, QPurchaseUpdatePolicy qPurchaseUpdatePolicy, QPurchaseOptions qPurchaseOptions) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.productId = productId;
        this.oldProductId = str;
        this.updatePolicy = qPurchaseUpdatePolicy;
        this.options = qPurchaseOptions;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getOldProductId() {
        return this.oldProductId;
    }

    public final QPurchaseUpdatePolicy getUpdatePolicy() {
        return this.updatePolicy;
    }

    public final QPurchaseOptions getOptions() {
        return this.options;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PurchaseModelInternal(QPurchaseModel purchaseModel) {
        this(purchaseModel.getProductId(), (String) null, (QPurchaseUpdatePolicy) null, new QPurchaseOptions(null, purchaseModel.getOfferId(), purchaseModel.getApplyOffer(), null, null, null, 57, null));
        Intrinsics.checkNotNullParameter(purchaseModel, "purchaseModel");
    }

    public /* synthetic */ PurchaseModelInternal(QProduct qProduct, QPurchaseOptions qPurchaseOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qProduct, (i & 2) != 0 ? null : qPurchaseOptions);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PurchaseModelInternal(QProduct product, QPurchaseOptions qPurchaseOptions) {
        QProduct oldProduct;
        Intrinsics.checkNotNullParameter(product, "product");
        this(product.getQonversionID(), (qPurchaseOptions == null || (oldProduct = qPurchaseOptions.getOldProduct()) == null) ? null : oldProduct.getQonversionID(), qPurchaseOptions != null ? qPurchaseOptions.getUpdatePolicy() : null, qPurchaseOptions);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PurchaseModelInternal(QPurchaseUpdateModel purchaseModel) {
        this(purchaseModel.getProductId(), purchaseModel.getOldProductId(), purchaseModel.getUpdatePolicy(), new QPurchaseOptions(null, purchaseModel.getOfferId(), purchaseModel.getApplyOffer(), null, null, null, 57, null));
        Intrinsics.checkNotNullParameter(purchaseModel, "purchaseModel");
    }

    public final PurchaseModelInternalEnriched enrich(QProduct product, QProduct oldProduct) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new PurchaseModelInternalEnriched(this.productId, product, oldProduct, this.updatePolicy, this.options);
    }
}
