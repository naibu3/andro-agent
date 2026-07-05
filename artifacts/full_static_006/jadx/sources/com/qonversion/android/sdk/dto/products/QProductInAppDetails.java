package com.qonversion.android.sdk.dto.products;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.ProductDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QProductInAppDetails.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;", "", "originalOneTimePurchaseOfferDetails", "Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;", "(Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;)V", "getOriginalOneTimePurchaseOfferDetails", "()Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;", "price", "Lcom/qonversion/android/sdk/dto/products/QProductPrice;", "getPrice", "()Lcom/qonversion/android/sdk/dto/products/QProductPrice;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QProductInAppDetails {
    private final ProductDetails.OneTimePurchaseOfferDetails originalOneTimePurchaseOfferDetails;
    private final QProductPrice price;

    public static /* synthetic */ QProductInAppDetails copy$default(QProductInAppDetails qProductInAppDetails, ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            oneTimePurchaseOfferDetails = qProductInAppDetails.originalOneTimePurchaseOfferDetails;
        }
        return qProductInAppDetails.copy(oneTimePurchaseOfferDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final ProductDetails.OneTimePurchaseOfferDetails getOriginalOneTimePurchaseOfferDetails() {
        return this.originalOneTimePurchaseOfferDetails;
    }

    public final QProductInAppDetails copy(ProductDetails.OneTimePurchaseOfferDetails originalOneTimePurchaseOfferDetails) {
        Intrinsics.checkNotNullParameter(originalOneTimePurchaseOfferDetails, "originalOneTimePurchaseOfferDetails");
        return new QProductInAppDetails(originalOneTimePurchaseOfferDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QProductInAppDetails) && Intrinsics.areEqual(this.originalOneTimePurchaseOfferDetails, ((QProductInAppDetails) other).originalOneTimePurchaseOfferDetails);
    }

    public int hashCode() {
        return this.originalOneTimePurchaseOfferDetails.hashCode();
    }

    public String toString() {
        return "QProductInAppDetails(originalOneTimePurchaseOfferDetails=" + this.originalOneTimePurchaseOfferDetails + ")";
    }

    public QProductInAppDetails(ProductDetails.OneTimePurchaseOfferDetails originalOneTimePurchaseOfferDetails) {
        Intrinsics.checkNotNullParameter(originalOneTimePurchaseOfferDetails, "originalOneTimePurchaseOfferDetails");
        this.originalOneTimePurchaseOfferDetails = originalOneTimePurchaseOfferDetails;
        long priceAmountMicros = originalOneTimePurchaseOfferDetails.getPriceAmountMicros();
        String priceCurrencyCode = originalOneTimePurchaseOfferDetails.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "getPriceCurrencyCode(...)");
        String formattedPrice = originalOneTimePurchaseOfferDetails.getFormattedPrice();
        Intrinsics.checkNotNullExpressionValue(formattedPrice, "getFormattedPrice(...)");
        this.price = new QProductPrice(priceAmountMicros, priceCurrencyCode, formattedPrice);
    }

    public final ProductDetails.OneTimePurchaseOfferDetails getOriginalOneTimePurchaseOfferDetails() {
        return this.originalOneTimePurchaseOfferDetails;
    }

    public final QProductPrice getPrice() {
        return this.price;
    }
}
