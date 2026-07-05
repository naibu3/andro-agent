package com.qonversion.android.sdk.dto.products;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.ProductDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QProductOfferDetails.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0013\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\"¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\b¨\u00060"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "", "originalOfferDetails", "Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;", "(Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;)V", "basePlan", "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;", "getBasePlan", "()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;", "basePlanId", "", "getBasePlanId", "()Ljava/lang/String;", "hasIntro", "", "getHasIntro", "()Z", "hasTrial", "getHasTrial", "hasTrialOrIntro", "getHasTrialOrIntro", "installmentPlanDetails", "Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;", "getInstallmentPlanDetails", "()Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;", "introPhase", "getIntroPhase", "offerId", "getOfferId", "offerToken", "getOfferToken", "getOriginalOfferDetails", "()Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;", "pricingPhases", "", "getPricingPhases", "()Ljava/util/List;", "tags", "getTags", "trialPhase", "getTrialPhase", "component1", "copy", "equals", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QProductOfferDetails {
    private final QProductPricingPhase basePlan;
    private final String basePlanId;
    private final boolean hasIntro;
    private final boolean hasTrial;
    private final boolean hasTrialOrIntro;
    private final QProductInstallmentPlanDetails installmentPlanDetails;
    private final QProductPricingPhase introPhase;
    private final String offerId;
    private final String offerToken;
    private final ProductDetails.SubscriptionOfferDetails originalOfferDetails;
    private final List<QProductPricingPhase> pricingPhases;
    private final List<String> tags;
    private final QProductPricingPhase trialPhase;

    public static /* synthetic */ QProductOfferDetails copy$default(QProductOfferDetails qProductOfferDetails, ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionOfferDetails = qProductOfferDetails.originalOfferDetails;
        }
        return qProductOfferDetails.copy(subscriptionOfferDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final ProductDetails.SubscriptionOfferDetails getOriginalOfferDetails() {
        return this.originalOfferDetails;
    }

    public final QProductOfferDetails copy(ProductDetails.SubscriptionOfferDetails originalOfferDetails) {
        Intrinsics.checkNotNullParameter(originalOfferDetails, "originalOfferDetails");
        return new QProductOfferDetails(originalOfferDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QProductOfferDetails) && Intrinsics.areEqual(this.originalOfferDetails, ((QProductOfferDetails) other).originalOfferDetails);
    }

    public int hashCode() {
        return this.originalOfferDetails.hashCode();
    }

    public String toString() {
        return "QProductOfferDetails(originalOfferDetails=" + this.originalOfferDetails + ")";
    }

    public QProductOfferDetails(ProductDetails.SubscriptionOfferDetails originalOfferDetails) {
        Object obj;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(originalOfferDetails, "originalOfferDetails");
        this.originalOfferDetails = originalOfferDetails;
        String basePlanId = originalOfferDetails.getBasePlanId();
        Intrinsics.checkNotNullExpressionValue(basePlanId, "getBasePlanId(...)");
        this.basePlanId = basePlanId;
        this.offerId = originalOfferDetails.getOfferId();
        String offerToken = originalOfferDetails.getOfferToken();
        Intrinsics.checkNotNullExpressionValue(offerToken, "getOfferToken(...)");
        this.offerToken = offerToken;
        List<String> offerTags = originalOfferDetails.getOfferTags();
        Intrinsics.checkNotNullExpressionValue(offerTags, "getOfferTags(...)");
        this.tags = offerTags;
        List<ProductDetails.PricingPhase> pricingPhaseList = originalOfferDetails.getPricingPhases().getPricingPhaseList();
        Intrinsics.checkNotNullExpressionValue(pricingPhaseList, "getPricingPhaseList(...)");
        List<ProductDetails.PricingPhase> list = pricingPhaseList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ProductDetails.PricingPhase pricingPhase : list) {
            Intrinsics.checkNotNull(pricingPhase);
            arrayList.add(new QProductPricingPhase(pricingPhase));
        }
        ArrayList arrayList2 = arrayList;
        this.pricingPhases = arrayList2;
        Iterator it = arrayList2.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                if (((QProductPricingPhase) next).getIsBasePlan()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.basePlan = (QProductPricingPhase) next;
        ProductDetails.InstallmentPlanDetails installmentPlanDetails = this.originalOfferDetails.getInstallmentPlanDetails();
        this.installmentPlanDetails = installmentPlanDetails != null ? new QProductInstallmentPlanDetails(installmentPlanDetails) : null;
        Iterator<T> it2 = this.pricingPhases.iterator();
        while (true) {
            if (it2.hasNext()) {
                next2 = it2.next();
                if (((QProductPricingPhase) next2).getIsTrial()) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        this.trialPhase = (QProductPricingPhase) next2;
        Iterator<T> it3 = this.pricingPhases.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (((QProductPricingPhase) next3).getIsIntro()) {
                obj = next3;
                break;
            }
        }
        QProductPricingPhase qProductPricingPhase = (QProductPricingPhase) obj;
        this.introPhase = qProductPricingPhase;
        boolean z = true;
        boolean z2 = this.trialPhase != null;
        this.hasTrial = z2;
        boolean z3 = qProductPricingPhase != null;
        this.hasIntro = z3;
        if (!z2 && !z3) {
            z = false;
        }
        this.hasTrialOrIntro = z;
    }

    public final ProductDetails.SubscriptionOfferDetails getOriginalOfferDetails() {
        return this.originalOfferDetails;
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final List<QProductPricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final QProductPricingPhase getBasePlan() {
        return this.basePlan;
    }

    public final QProductInstallmentPlanDetails getInstallmentPlanDetails() {
        return this.installmentPlanDetails;
    }

    public final QProductPricingPhase getTrialPhase() {
        return this.trialPhase;
    }

    public final QProductPricingPhase getIntroPhase() {
        return this.introPhase;
    }

    public final boolean getHasTrial() {
        return this.hasTrial;
    }

    public final boolean getHasIntro() {
        return this.hasIntro;
    }

    public final boolean getHasTrialOrIntro() {
        return this.hasTrialOrIntro;
    }
}
