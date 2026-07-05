package com.qonversion.android.sdk.dto.products;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qonversion.android.sdk.dto.products.QProductPricingPhase;
import com.qonversion.android.sdk.internal.billing.UtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QProductStoreDetails.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00104\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\n2\u0006\u00107\u001a\u00020\u0005J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u001e\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u001f\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010 \u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\b¨\u0006;"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;", "", "originalProductDetails", "Lcom/android/billingclient/api/ProductDetails;", "basePlanId", "", "(Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V", "getBasePlanId", "()Ljava/lang/String;", "basePlanSubscriptionOfferDetails", "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "getBasePlanSubscriptionOfferDetails", "()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "defaultSubscriptionOfferDetails", "getDefaultSubscriptionOfferDetails", "description", "getDescription", "hasIntroOffer", "", "getHasIntroOffer", "()Z", "hasTrialOffer", "getHasTrialOffer", "hasTrialOrIntroOffer", "getHasTrialOrIntroOffer", "inAppOfferDetails", "Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;", "getInAppOfferDetails", "()Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;", "isInApp", "isInstallment", "isPrepaid", "isSubscription", AppMeasurementSdk.ConditionalUserProperty.NAME, "getName", "getOriginalProductDetails", "()Lcom/android/billingclient/api/ProductDetails;", "productId", "getProductId", "productType", "Lcom/qonversion/android/sdk/dto/products/QProductType;", "getProductType", "()Lcom/qonversion/android/sdk/dto/products/QProductType;", "subscriptionOfferDetails", "", "getSubscriptionOfferDetails", "()Ljava/util/List;", "title", "getTitle", "component1", "component2", "copy", "equals", "other", "findOffer", "offerId", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QProductStoreDetails {
    private final String basePlanId;
    private final QProductOfferDetails basePlanSubscriptionOfferDetails;
    private final QProductOfferDetails defaultSubscriptionOfferDetails;
    private final String description;
    private final boolean hasIntroOffer;
    private final boolean hasTrialOffer;
    private final boolean hasTrialOrIntroOffer;
    private final QProductInAppDetails inAppOfferDetails;
    private final boolean isInApp;
    private final boolean isInstallment;
    private final boolean isPrepaid;
    private final boolean isSubscription;
    private final String name;
    private final ProductDetails originalProductDetails;
    private final String productId;
    private final QProductType productType;
    private final List<QProductOfferDetails> subscriptionOfferDetails;
    private final String title;

    public static /* synthetic */ QProductStoreDetails copy$default(QProductStoreDetails qProductStoreDetails, ProductDetails productDetails, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            productDetails = qProductStoreDetails.originalProductDetails;
        }
        if ((i & 2) != 0) {
            str = qProductStoreDetails.basePlanId;
        }
        return qProductStoreDetails.copy(productDetails, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ProductDetails getOriginalProductDetails() {
        return this.originalProductDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final QProductStoreDetails copy(ProductDetails originalProductDetails, String basePlanId) {
        Intrinsics.checkNotNullParameter(originalProductDetails, "originalProductDetails");
        return new QProductStoreDetails(originalProductDetails, basePlanId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QProductStoreDetails)) {
            return false;
        }
        QProductStoreDetails qProductStoreDetails = (QProductStoreDetails) other;
        return Intrinsics.areEqual(this.originalProductDetails, qProductStoreDetails.originalProductDetails) && Intrinsics.areEqual(this.basePlanId, qProductStoreDetails.basePlanId);
    }

    public int hashCode() {
        int iHashCode = this.originalProductDetails.hashCode() * 31;
        String str = this.basePlanId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "QProductStoreDetails(originalProductDetails=" + this.originalProductDetails + ", basePlanId=" + this.basePlanId + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QProductStoreDetails(ProductDetails originalProductDetails, String str) {
        ArrayList arrayList;
        QProductOfferDetails qProductOfferDetails;
        QProductOfferDetails qProductOfferDetails2;
        boolean z;
        boolean z2;
        boolean z3;
        QProductOfferDetails qProductOfferDetails3;
        QProductType qProductType;
        boolean z4;
        QProductPricingPhase basePlan;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(originalProductDetails, "originalProductDetails");
        this.originalProductDetails = originalProductDetails;
        this.basePlanId = str;
        String productId = originalProductDetails.getProductId();
        Intrinsics.checkNotNullExpressionValue(productId, "getProductId(...)");
        this.productId = productId;
        String name = originalProductDetails.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.name = name;
        String title = originalProductDetails.getTitle();
        Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
        this.title = title;
        String description = originalProductDetails.getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
        this.description = description;
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = originalProductDetails.getSubscriptionOfferDetails();
        if (subscriptionOfferDetails != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : subscriptionOfferDetails) {
                if (Intrinsics.areEqual(((ProductDetails.SubscriptionOfferDetails) obj).getBasePlanId(), this.basePlanId)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList<ProductDetails.SubscriptionOfferDetails> arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 : arrayList3) {
                Intrinsics.checkNotNull(subscriptionOfferDetails2);
                arrayList4.add(new QProductOfferDetails(subscriptionOfferDetails2));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        this.subscriptionOfferDetails = arrayList;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            if (it.hasNext()) {
                next2 = it.next();
                if (it.hasNext()) {
                    double pricePerMaxDuration = UtilsKt.getPricePerMaxDuration((QProductOfferDetails) next2);
                    do {
                        Object next3 = it.next();
                        double pricePerMaxDuration2 = UtilsKt.getPricePerMaxDuration((QProductOfferDetails) next3);
                        if (Double.compare(pricePerMaxDuration, pricePerMaxDuration2) > 0) {
                            next2 = next3;
                            pricePerMaxDuration = pricePerMaxDuration2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next2 = null;
            }
            qProductOfferDetails = (QProductOfferDetails) next2;
        } else {
            qProductOfferDetails = null;
        }
        this.defaultSubscriptionOfferDetails = qProductOfferDetails;
        List<QProductOfferDetails> list = this.subscriptionOfferDetails;
        boolean z5 = true;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((QProductOfferDetails) next).getPricingPhases().size() == 1) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            qProductOfferDetails2 = (QProductOfferDetails) next;
        } else {
            qProductOfferDetails2 = null;
        }
        this.basePlanSubscriptionOfferDetails = qProductOfferDetails2;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = this.originalProductDetails.getOneTimePurchaseOfferDetails();
        this.inAppOfferDetails = oneTimePurchaseOfferDetails != null ? new QProductInAppDetails(oneTimePurchaseOfferDetails) : null;
        List<QProductOfferDetails> list2 = this.subscriptionOfferDetails;
        if (list2 != null) {
            List<QProductOfferDetails> list3 = list2;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (((QProductOfferDetails) it3.next()).getHasTrial()) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
        }
        this.hasTrialOffer = z;
        List<QProductOfferDetails> list4 = this.subscriptionOfferDetails;
        if (list4 != null) {
            List<QProductOfferDetails> list5 = list4;
            if ((list5 instanceof Collection) && list5.isEmpty()) {
                z2 = false;
            } else {
                Iterator<T> it4 = list5.iterator();
                while (it4.hasNext()) {
                    if (((QProductOfferDetails) it4.next()).getHasIntro()) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            }
        }
        this.hasIntroOffer = z2;
        List<QProductOfferDetails> list6 = this.subscriptionOfferDetails;
        if (list6 != null) {
            List<QProductOfferDetails> list7 = list6;
            if ((list7 instanceof Collection) && list7.isEmpty()) {
                z3 = false;
            } else {
                Iterator<T> it5 = list7.iterator();
                while (it5.hasNext()) {
                    if (((QProductOfferDetails) it5.next()).getHasTrialOrIntro()) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            }
        }
        this.hasTrialOrIntroOffer = z3;
        String productType = this.originalProductDetails.getProductType();
        int iHashCode = productType.hashCode();
        if (iHashCode != 3541555) {
            qProductType = (iHashCode == 100343516 && productType.equals("inapp")) ? QProductType.InApp : QProductType.Unknown;
        } else if (productType.equals("subs") && (qProductOfferDetails3 = this.defaultSubscriptionOfferDetails) != null) {
            qProductType = qProductOfferDetails3.getHasTrial() ? QProductType.Trial : qProductOfferDetails3.getHasIntro() ? QProductType.Intro : QProductType.Subscription;
            if (qProductType == null) {
                qProductType = QProductType.Unknown;
            }
        }
        this.productType = qProductType;
        this.isInApp = qProductType == QProductType.InApp;
        boolean z6 = qProductType == QProductType.Trial || qProductType == QProductType.Subscription;
        this.isSubscription = z6;
        if (z6) {
            QProductOfferDetails qProductOfferDetails4 = this.basePlanSubscriptionOfferDetails;
            if (((qProductOfferDetails4 == null || (basePlan = qProductOfferDetails4.getBasePlan()) == null) ? null : basePlan.getRecurrenceMode()) == QProductPricingPhase.RecurrenceMode.NonRecurring) {
                z4 = true;
            }
        } else {
            z4 = false;
        }
        this.isPrepaid = z4;
        if (z6) {
            QProductOfferDetails qProductOfferDetails5 = this.basePlanSubscriptionOfferDetails;
            if ((qProductOfferDetails5 != null ? qProductOfferDetails5.getInstallmentPlanDetails() : null) == null) {
            }
        } else {
            z5 = false;
        }
        this.isInstallment = z5;
    }

    public final ProductDetails getOriginalProductDetails() {
        return this.originalProductDetails;
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<QProductOfferDetails> getSubscriptionOfferDetails() {
        return this.subscriptionOfferDetails;
    }

    public final QProductOfferDetails getDefaultSubscriptionOfferDetails() {
        return this.defaultSubscriptionOfferDetails;
    }

    public final QProductOfferDetails getBasePlanSubscriptionOfferDetails() {
        return this.basePlanSubscriptionOfferDetails;
    }

    public final QProductInAppDetails getInAppOfferDetails() {
        return this.inAppOfferDetails;
    }

    public final boolean getHasTrialOffer() {
        return this.hasTrialOffer;
    }

    public final boolean getHasIntroOffer() {
        return this.hasIntroOffer;
    }

    public final boolean getHasTrialOrIntroOffer() {
        return this.hasTrialOrIntroOffer;
    }

    public final QProductType getProductType() {
        return this.productType;
    }

    /* renamed from: isInApp, reason: from getter */
    public final boolean getIsInApp() {
        return this.isInApp;
    }

    /* renamed from: isSubscription, reason: from getter */
    public final boolean getIsSubscription() {
        return this.isSubscription;
    }

    /* renamed from: isPrepaid, reason: from getter */
    public final boolean getIsPrepaid() {
        return this.isPrepaid;
    }

    /* renamed from: isInstallment, reason: from getter */
    public final boolean getIsInstallment() {
        return this.isInstallment;
    }

    public final QProductOfferDetails findOffer(String offerId) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        List<QProductOfferDetails> list = this.subscriptionOfferDetails;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((QProductOfferDetails) next).getOfferId(), offerId)) {
                obj = next;
                break;
            }
        }
        return (QProductOfferDetails) obj;
    }
}
