package com.qonversion.android.sdk.dto.products;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.SkuDetails;
import com.qonversion.android.sdk.dto.QPurchaseModel;
import com.qonversion.android.sdk.dto.QPurchaseUpdateModel;
import com.qonversion.android.sdk.dto.QPurchaseUpdatePolicy;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: QProduct.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010+\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\u0015\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0000¢\u0006\u0002\b5J\u0012\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0007J\u0014\u00106\u001a\u0002072\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003H\u0007J\u001c\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?H\u0007J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR&\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006A"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProduct;", "", "qonversionID", "", "storeID", "basePlanID", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBasePlanID", "()Ljava/lang/String;", "offeringID", "getOfferingID", "setOfferingID", "(Ljava/lang/String;)V", "prettyPrice", "getPrettyPrice", "getQonversionID", "skuDetail", "Lcom/android/billingclient/api/SkuDetails;", "getSkuDetail$annotations", "()V", "getSkuDetail", "()Lcom/android/billingclient/api/SkuDetails;", "setSkuDetail", "(Lcom/android/billingclient/api/SkuDetails;)V", "<set-?>", "Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;", "storeDetails", "getStoreDetails", "()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;", "getStoreID", "subscriptionPeriod", "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "getSubscriptionPeriod", "()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "trialPeriod", "getTrialPeriod", "type", "Lcom/qonversion/android/sdk/dto/products/QProductType;", "getType", "()Lcom/qonversion/android/sdk/dto/products/QProductType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "setStoreProductDetails", "", "productDetails", "Lcom/android/billingclient/api/ProductDetails;", "setStoreProductDetails$sdk_release", "toPurchaseModel", "Lcom/qonversion/android/sdk/dto/QPurchaseModel;", "offer", "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "offerId", "toPurchaseUpdateModel", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;", "oldProductId", "updatePolicy", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QProduct {
    private final String basePlanID;
    private transient String offeringID;
    private final String qonversionID;
    private transient SkuDetails skuDetail;
    private transient QProductStoreDetails storeDetails;
    private final String storeID;

    public static /* synthetic */ QProduct copy$default(QProduct qProduct, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qProduct.qonversionID;
        }
        if ((i & 2) != 0) {
            str2 = qProduct.storeID;
        }
        if ((i & 4) != 0) {
            str3 = qProduct.basePlanID;
        }
        return qProduct.copy(str, str2, str3);
    }

    @Deprecated(message = "Consider using `storeDetails` instead")
    public static /* synthetic */ void getSkuDetail$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getQonversionID() {
        return this.qonversionID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStoreID() {
        return this.storeID;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBasePlanID() {
        return this.basePlanID;
    }

    public final QProduct copy(@Json(name = "id") String qonversionID, @Json(name = "store_id") String storeID, @Json(name = "base_plan_id") String basePlanID) {
        Intrinsics.checkNotNullParameter(qonversionID, "qonversionID");
        return new QProduct(qonversionID, storeID, basePlanID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QProduct)) {
            return false;
        }
        QProduct qProduct = (QProduct) other;
        return Intrinsics.areEqual(this.qonversionID, qProduct.qonversionID) && Intrinsics.areEqual(this.storeID, qProduct.storeID) && Intrinsics.areEqual(this.basePlanID, qProduct.basePlanID);
    }

    public int hashCode() {
        int iHashCode = this.qonversionID.hashCode() * 31;
        String str = this.storeID;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.basePlanID;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Deprecated(message = "Use new QPurchaseOptions object instead", replaceWith = @ReplaceWith(expression = "QPurchaseOptions.Builder().setOfferId(offerId).build()", imports = {}))
    public final QPurchaseModel toPurchaseModel() {
        return toPurchaseModel$default(this, null, 1, null);
    }

    @Deprecated(message = "Use new QPurchaseOptions object instead", replaceWith = @ReplaceWith(expression = "QPurchaseOptions.Builder().setOldProduct(TODO(\"pass old product here\")).build()", imports = {}))
    public final QPurchaseUpdateModel toPurchaseUpdateModel(String oldProductId) {
        Intrinsics.checkNotNullParameter(oldProductId, "oldProductId");
        return toPurchaseUpdateModel$default(this, oldProductId, null, 2, null);
    }

    public String toString() {
        return "QProduct(qonversionID=" + this.qonversionID + ", storeID=" + this.storeID + ", basePlanID=" + this.basePlanID + ")";
    }

    public QProduct(@Json(name = "id") String qonversionID, @Json(name = "store_id") String str, @Json(name = "base_plan_id") String str2) {
        Intrinsics.checkNotNullParameter(qonversionID, "qonversionID");
        this.qonversionID = qonversionID;
        this.storeID = str;
        this.basePlanID = str2;
    }

    public final String getQonversionID() {
        return this.qonversionID;
    }

    public final String getStoreID() {
        return this.storeID;
    }

    public final String getBasePlanID() {
        return this.basePlanID;
    }

    public final SkuDetails getSkuDetail() {
        return this.skuDetail;
    }

    public final void setSkuDetail(SkuDetails skuDetails) {
        this.skuDetail = skuDetails;
    }

    public final QProductStoreDetails getStoreDetails() {
        return this.storeDetails;
    }

    public final String getOfferingID() {
        return this.offeringID;
    }

    public final void setOfferingID(String str) {
        this.offeringID = str;
    }

    public final QSubscriptionPeriod getSubscriptionPeriod() {
        String subscriptionPeriod;
        QProductOfferDetails defaultSubscriptionOfferDetails;
        QProductStoreDetails qProductStoreDetails = this.storeDetails;
        if (qProductStoreDetails != null && (defaultSubscriptionOfferDetails = qProductStoreDetails.getDefaultSubscriptionOfferDetails()) != null) {
            QProductPricingPhase basePlan = defaultSubscriptionOfferDetails.getBasePlan();
            if (basePlan != null) {
                return basePlan.getBillingPeriod();
            }
            return null;
        }
        SkuDetails skuDetails = this.skuDetail;
        if (skuDetails == null || (subscriptionPeriod = skuDetails.getSubscriptionPeriod()) == null) {
            return null;
        }
        if (StringsKt.isBlank(subscriptionPeriod)) {
            subscriptionPeriod = null;
        }
        if (subscriptionPeriod != null) {
            return QSubscriptionPeriod.INSTANCE.from(subscriptionPeriod);
        }
        return null;
    }

    public final QSubscriptionPeriod getTrialPeriod() {
        String freeTrialPeriod;
        QProductOfferDetails defaultSubscriptionOfferDetails;
        QProductStoreDetails qProductStoreDetails = this.storeDetails;
        if (qProductStoreDetails != null && (defaultSubscriptionOfferDetails = qProductStoreDetails.getDefaultSubscriptionOfferDetails()) != null) {
            QProductPricingPhase trialPhase = defaultSubscriptionOfferDetails.getTrialPhase();
            if (trialPhase != null) {
                return trialPhase.getBillingPeriod();
            }
            return null;
        }
        SkuDetails skuDetails = this.skuDetail;
        if (skuDetails == null || (freeTrialPeriod = skuDetails.getFreeTrialPeriod()) == null) {
            return null;
        }
        if (StringsKt.isBlank(freeTrialPeriod)) {
            freeTrialPeriod = null;
        }
        if (freeTrialPeriod != null) {
            return QSubscriptionPeriod.INSTANCE.from(freeTrialPeriod);
        }
        return null;
    }

    public final QProductType getType() {
        String introductoryPricePeriod;
        List<QProductOfferDetails> subscriptionOfferDetails;
        QProductStoreDetails qProductStoreDetails = this.storeDetails;
        QProductType productType = (qProductStoreDetails == null || (((subscriptionOfferDetails = qProductStoreDetails.getSubscriptionOfferDetails()) == null || !(subscriptionOfferDetails.isEmpty() ^ true)) && qProductStoreDetails.getInAppOfferDetails() == null)) ? null : qProductStoreDetails.getProductType();
        if (productType != null && productType != QProductType.Unknown) {
            return productType;
        }
        SkuDetails skuDetails = this.skuDetail;
        if (Intrinsics.areEqual(skuDetails != null ? skuDetails.getType() : null, "inapp")) {
            return QProductType.InApp;
        }
        if (getTrialPeriod() != null) {
            return QProductType.Trial;
        }
        SkuDetails skuDetails2 = this.skuDetail;
        return (skuDetails2 == null || (introductoryPricePeriod = skuDetails2.getIntroductoryPricePeriod()) == null || !(StringsKt.isBlank(introductoryPricePeriod) ^ true)) ? getSubscriptionPeriod() != null ? QProductType.Subscription : QProductType.Unknown : QProductType.Intro;
    }

    public final String getPrettyPrice() {
        QProductOfferDetails basePlanSubscriptionOfferDetails;
        QProductPricingPhase basePlan;
        QProductPrice price;
        QProductInAppDetails inAppOfferDetails;
        QProductPrice price2;
        if (getType() == QProductType.InApp) {
            QProductStoreDetails qProductStoreDetails = this.storeDetails;
            if (qProductStoreDetails == null || (inAppOfferDetails = qProductStoreDetails.getInAppOfferDetails()) == null || (price2 = inAppOfferDetails.getPrice()) == null) {
                return null;
            }
            return price2.getFormattedPrice();
        }
        QProductStoreDetails qProductStoreDetails2 = this.storeDetails;
        if ((qProductStoreDetails2 != null ? qProductStoreDetails2.getBasePlanSubscriptionOfferDetails() : null) != null) {
            QProductStoreDetails qProductStoreDetails3 = this.storeDetails;
            if (qProductStoreDetails3 == null || (basePlanSubscriptionOfferDetails = qProductStoreDetails3.getBasePlanSubscriptionOfferDetails()) == null || (basePlan = basePlanSubscriptionOfferDetails.getBasePlan()) == null || (price = basePlan.getPrice()) == null) {
                return null;
            }
            return price.getFormattedPrice();
        }
        SkuDetails skuDetails = this.skuDetail;
        if (skuDetails != null) {
            return skuDetails.getPrice();
        }
        return null;
    }

    public static /* synthetic */ QPurchaseModel toPurchaseModel$default(QProduct qProduct, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return qProduct.toPurchaseModel(str);
    }

    @Deprecated(message = "Use new QPurchaseOptions object instead", replaceWith = @ReplaceWith(expression = "QPurchaseOptions.Builder().setOfferId(offerId).build()", imports = {}))
    public final QPurchaseModel toPurchaseModel(String offerId) {
        return new QPurchaseModel(this.qonversionID, offerId);
    }

    @Deprecated(message = "Use new QPurchaseOptions object instead", replaceWith = @ReplaceWith(expression = "QPurchaseOptions.Builder().setOffer(offer).build()", imports = {}))
    public final QPurchaseModel toPurchaseModel(QProductOfferDetails offer) {
        QPurchaseModel purchaseModel = toPurchaseModel(offer != null ? offer.getOfferId() : null);
        if (offer != null && offer.getOfferId() == null) {
            purchaseModel.removeOffer();
        }
        return purchaseModel;
    }

    public static /* synthetic */ QPurchaseUpdateModel toPurchaseUpdateModel$default(QProduct qProduct, String str, QPurchaseUpdatePolicy qPurchaseUpdatePolicy, int i, Object obj) {
        if ((i & 2) != 0) {
            qPurchaseUpdatePolicy = null;
        }
        return qProduct.toPurchaseUpdateModel(str, qPurchaseUpdatePolicy);
    }

    @Deprecated(message = "Use new QPurchaseOptions object instead", replaceWith = @ReplaceWith(expression = "QPurchaseOptions.Builder().setOldProduct(TODO(\"pass old product here\")).build()", imports = {}))
    public final QPurchaseUpdateModel toPurchaseUpdateModel(String oldProductId, QPurchaseUpdatePolicy updatePolicy) {
        Intrinsics.checkNotNullParameter(oldProductId, "oldProductId");
        return new QPurchaseUpdateModel(this.qonversionID, oldProductId, updatePolicy, null, 8, null);
    }

    public final void setStoreProductDetails$sdk_release(ProductDetails productDetails) {
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        this.storeDetails = new QProductStoreDetails(productDetails, this.basePlanID);
    }
}
