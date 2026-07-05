package io.qonversion.sandwich;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.android.billingclient.api.SkuDetails;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.automations.dto.QActionResult;
import com.qonversion.android.sdk.automations.dto.QScreenPresentationConfig;
import com.qonversion.android.sdk.automations.dto.QScreenPresentationStyle;
import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.QRemoteConfigList;
import com.qonversion.android.sdk.dto.QRemoteConfigurationAssignmentType;
import com.qonversion.android.sdk.dto.QRemoteConfigurationSource;
import com.qonversion.android.sdk.dto.QRemoteConfigurationSourceType;
import com.qonversion.android.sdk.dto.QUser;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.eligibility.QEligibility;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import com.qonversion.android.sdk.dto.entitlements.QTransaction;
import com.qonversion.android.sdk.dto.experiments.QExperiment;
import com.qonversion.android.sdk.dto.experiments.QExperimentGroup;
import com.qonversion.android.sdk.dto.experiments.QExperimentGroupType;
import com.qonversion.android.sdk.dto.offerings.QOffering;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.products.QProductInAppDetails;
import com.qonversion.android.sdk.dto.products.QProductInstallmentPlanDetails;
import com.qonversion.android.sdk.dto.products.QProductOfferDetails;
import com.qonversion.android.sdk.dto.products.QProductPrice;
import com.qonversion.android.sdk.dto.products.QProductPricingPhase;
import com.qonversion.android.sdk.dto.products.QProductStoreDetails;
import com.qonversion.android.sdk.dto.products.QSubscriptionPeriod;
import com.qonversion.android.sdk.dto.properties.QUserProperties;
import com.qonversion.android.sdk.dto.properties.QUserProperty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;

/* compiled from: Mappers.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0001\u001a(\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0001\u001a\n\u0010\b\u001a\u00020\u0002*\u00020\t\u001a\n\u0010\b\u001a\u00020\u0002*\u00020\n\u001a\n\u0010\b\u001a\u00020\u0002*\u00020\u000b\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\r\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u000e\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u000f\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0010\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0011\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0012\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0013\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0005\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0007\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0014\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0015\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0016\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0017\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0018\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0019\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u001a\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u001b\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u001c\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u001d\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u001e\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u001f\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020 \u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020!\u001a\u001c\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\"\u001a(\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0001\u001a\n\u0010$\u001a\u00020%*\u00020\u0013\u001a\u0018\u0010&\u001a\u00020'*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u001a$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006)"}, d2 = {"toEligibilityMap", "", "", "", "Lio/qonversion/sandwich/BridgeData;", "Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;", "toEntitlementsMap", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;", "toFormattedString", "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;", "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;", "Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;", "toMap", "Lcom/android/billingclient/api/SkuDetails;", "Lcom/qonversion/android/sdk/automations/dto/QActionResult;", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;", "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;", "Lcom/qonversion/android/sdk/dto/QUser;", "Lcom/qonversion/android/sdk/dto/QonversionError;", "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;", "Lcom/qonversion/android/sdk/dto/experiments/QExperiment;", "Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;", "Lcom/qonversion/android/sdk/dto/offerings/QOffering;", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;", "Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;", "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "Lcom/qonversion/android/sdk/dto/products/QProductPrice;", "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;", "Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;", "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "Lcom/qonversion/android/sdk/dto/properties/QUserProperties;", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "toProductsMap", "toSandwichError", "Lio/qonversion/sandwich/SandwichError;", "toScreenPresentationConfig", "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;", "toStringMap", "sandwich_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class MappersKt {

    /* compiled from: Mappers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[QExperimentGroupType.values().length];
            try {
                iArr[QExperimentGroupType.Treatment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QExperimentGroupType.Control.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[QRemoteConfigurationSourceType.values().length];
            try {
                iArr2[QRemoteConfigurationSourceType.RemoteConfiguration.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[QRemoteConfigurationSourceType.ExperimentTreatmentGroup.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[QRemoteConfigurationSourceType.ExperimentControlGroup.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[QRemoteConfigurationAssignmentType.values().length];
            try {
                iArr3[QRemoteConfigurationAssignmentType.Auto.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[QRemoteConfigurationAssignmentType.Manual.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final SandwichError toSandwichError(QonversionError qonversionError) {
        Intrinsics.checkNotNullParameter(qonversionError, "<this>");
        return new SandwichError(qonversionError);
    }

    public static final Map<String, Object> toMap(QonversionError qonversionError) {
        Intrinsics.checkNotNullParameter(qonversionError, "<this>");
        return MapsKt.mapOf(TuplesKt.to("code", qonversionError.getCode().toString()), TuplesKt.to("description", qonversionError.getDescription()), TuplesKt.to("additionalMessage", qonversionError.getAdditionalMessage()));
    }

    public static final Map<String, Object> toMap(SkuDetails skuDetails) {
        Intrinsics.checkNotNullParameter(skuDetails, "<this>");
        return MapsKt.mapOf(TuplesKt.to("description", skuDetails.getDescription()), TuplesKt.to("freeTrialPeriod", skuDetails.getFreeTrialPeriod()), TuplesKt.to("iconUrl", skuDetails.getIconUrl()), TuplesKt.to("introductoryPrice", skuDetails.getIntroductoryPrice()), TuplesKt.to("introductoryPriceAmountMicros", Long.valueOf(skuDetails.getIntroductoryPriceAmountMicros())), TuplesKt.to("introductoryPriceCycles", Integer.valueOf(skuDetails.getIntroductoryPriceCycles())), TuplesKt.to("introductoryPricePeriod", skuDetails.getIntroductoryPricePeriod()), TuplesKt.to("originalJson", skuDetails.getOriginalJson()), TuplesKt.to("originalPrice", skuDetails.getOriginalPrice()), TuplesKt.to("originalPriceAmountMicros", Long.valueOf(skuDetails.getOriginalPriceAmountMicros())), TuplesKt.to("price", skuDetails.getPrice()), TuplesKt.to("priceAmountMicros", Long.valueOf(skuDetails.getPriceAmountMicros())), TuplesKt.to("priceCurrencyCode", skuDetails.getPriceCurrencyCode()), TuplesKt.to("sku", skuDetails.getSku()), TuplesKt.to("subscriptionPeriod", skuDetails.getSubscriptionPeriod()), TuplesKt.to("title", skuDetails.getTitle()), TuplesKt.to("type", skuDetails.getType()), TuplesKt.to("hashCode", Integer.valueOf(skuDetails.hashCode())), TuplesKt.to("toString", skuDetails.toString()));
    }

    public static final Map<String, Object> toMap(QProduct qProduct) {
        Intrinsics.checkNotNullParameter(qProduct, "<this>");
        Pair[] pairArr = new Pair[10];
        pairArr[0] = TuplesKt.to("id", qProduct.getQonversionID());
        pairArr[1] = TuplesKt.to("storeId", qProduct.getStoreID());
        pairArr[2] = TuplesKt.to("basePlanId", qProduct.getBasePlanID());
        pairArr[3] = TuplesKt.to("type", qProduct.getType().name());
        QSubscriptionPeriod subscriptionPeriod = qProduct.getSubscriptionPeriod();
        pairArr[4] = TuplesKt.to("subscriptionPeriod", subscriptionPeriod != null ? toMap(subscriptionPeriod) : null);
        QSubscriptionPeriod trialPeriod = qProduct.getTrialPeriod();
        pairArr[5] = TuplesKt.to("trialPeriod", trialPeriod != null ? toMap(trialPeriod) : null);
        SkuDetails skuDetail = qProduct.getSkuDetail();
        pairArr[6] = TuplesKt.to("skuDetails", skuDetail != null ? toMap(skuDetail) : null);
        QProductStoreDetails storeDetails = qProduct.getStoreDetails();
        pairArr[7] = TuplesKt.to("storeDetails", storeDetails != null ? toMap(storeDetails) : null);
        pairArr[8] = TuplesKt.to("prettyPrice", qProduct.getPrettyPrice());
        pairArr[9] = TuplesKt.to("offeringId", qProduct.getOfferingID());
        return MapsKt.mapOf(pairArr);
    }

    public static final Map<String, Object> toMap(QSubscriptionPeriod qSubscriptionPeriod) {
        Intrinsics.checkNotNullParameter(qSubscriptionPeriod, "<this>");
        return MapsKt.mapOf(TuplesKt.to("unitCount", Integer.valueOf(qSubscriptionPeriod.getUnitCount())), TuplesKt.to("unit", qSubscriptionPeriod.getUnit().name()), TuplesKt.to("iso", qSubscriptionPeriod.getIso()));
    }

    public static final Map<String, Object> toMap(QProductPricingPhase qProductPricingPhase) {
        Intrinsics.checkNotNullParameter(qProductPricingPhase, "<this>");
        return MapsKt.mapOf(TuplesKt.to("price", toMap(qProductPricingPhase.getPrice())), TuplesKt.to("billingPeriod", toMap(qProductPricingPhase.getBillingPeriod())), TuplesKt.to("billingCycleCount", Integer.valueOf(qProductPricingPhase.getBillingCycleCount())), TuplesKt.to("recurrenceMode", qProductPricingPhase.getRecurrenceMode().name()), TuplesKt.to("type", qProductPricingPhase.getType().name()), TuplesKt.to("isTrial", Boolean.valueOf(qProductPricingPhase.getIsTrial())), TuplesKt.to("isIntro", Boolean.valueOf(qProductPricingPhase.getIsIntro())), TuplesKt.to("isBasePlan", Boolean.valueOf(qProductPricingPhase.getIsBasePlan())));
    }

    public static final Map<String, Object> toMap(QProductOfferDetails qProductOfferDetails) {
        Intrinsics.checkNotNullParameter(qProductOfferDetails, "<this>");
        Pair[] pairArr = new Pair[12];
        pairArr[0] = TuplesKt.to("basePlanId", qProductOfferDetails.getBasePlanId());
        pairArr[1] = TuplesKt.to("offerId", qProductOfferDetails.getOfferId());
        pairArr[2] = TuplesKt.to("offerToken", qProductOfferDetails.getOfferToken());
        pairArr[3] = TuplesKt.to("tags", qProductOfferDetails.getTags());
        List<QProductPricingPhase> pricingPhases = qProductOfferDetails.getPricingPhases();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pricingPhases, 10));
        Iterator<T> it = pricingPhases.iterator();
        while (it.hasNext()) {
            arrayList.add(toMap((QProductPricingPhase) it.next()));
        }
        pairArr[4] = TuplesKt.to("pricingPhases", arrayList);
        QProductPricingPhase basePlan = qProductOfferDetails.getBasePlan();
        pairArr[5] = TuplesKt.to("basePlan", basePlan != null ? toMap(basePlan) : null);
        QProductInstallmentPlanDetails installmentPlanDetails = qProductOfferDetails.getInstallmentPlanDetails();
        pairArr[6] = TuplesKt.to("installmentPlanDetails", installmentPlanDetails != null ? toMap(installmentPlanDetails) : null);
        QProductPricingPhase trialPhase = qProductOfferDetails.getTrialPhase();
        pairArr[7] = TuplesKt.to("trialPhase", trialPhase != null ? toMap(trialPhase) : null);
        QProductPricingPhase introPhase = qProductOfferDetails.getIntroPhase();
        pairArr[8] = TuplesKt.to("introPhase", introPhase != null ? toMap(introPhase) : null);
        pairArr[9] = TuplesKt.to("hasTrial", Boolean.valueOf(qProductOfferDetails.getHasTrial()));
        pairArr[10] = TuplesKt.to("hasIntro", Boolean.valueOf(qProductOfferDetails.getHasIntro()));
        pairArr[11] = TuplesKt.to("hasTrialOrIntro", Boolean.valueOf(qProductOfferDetails.getHasTrialOrIntro()));
        return MapsKt.mapOf(pairArr);
    }

    public static final Map<String, Object> toMap(QProductInstallmentPlanDetails qProductInstallmentPlanDetails) {
        Intrinsics.checkNotNullParameter(qProductInstallmentPlanDetails, "<this>");
        return MapsKt.mapOf(TuplesKt.to("commitmentPaymentsCount", Integer.valueOf(qProductInstallmentPlanDetails.getCommitmentPaymentsCount())), TuplesKt.to("subsequentCommitmentPaymentsCount", Integer.valueOf(qProductInstallmentPlanDetails.getSubsequentCommitmentPaymentsCount())));
    }

    public static final Map<String, Object> toMap(QProductPrice qProductPrice) {
        Intrinsics.checkNotNullParameter(qProductPrice, "<this>");
        return MapsKt.mapOf(TuplesKt.to("priceAmountMicros", Long.valueOf(qProductPrice.getPriceAmountMicros())), TuplesKt.to("priceCurrencyCode", qProductPrice.getPriceCurrencyCode()), TuplesKt.to("formattedPrice", qProductPrice.getFormattedPrice()), TuplesKt.to("isFree", Boolean.valueOf(qProductPrice.getIsFree())), TuplesKt.to("currencySymbol", qProductPrice.getCurrencySymbol()));
    }

    public static final Map<String, Object> toMap(QProductInAppDetails qProductInAppDetails) {
        Intrinsics.checkNotNullParameter(qProductInAppDetails, "<this>");
        return MapsKt.mapOf(TuplesKt.to("price", toMap(qProductInAppDetails.getPrice())));
    }

    public static final Map<String, Object> toMap(QProductStoreDetails qProductStoreDetails) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(qProductStoreDetails, "<this>");
        Pair[] pairArr = new Pair[17];
        pairArr[0] = TuplesKt.to("basePlanId", qProductStoreDetails.getBasePlanId());
        pairArr[1] = TuplesKt.to("productId", qProductStoreDetails.getProductId());
        pairArr[2] = TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.NAME, qProductStoreDetails.getName());
        pairArr[3] = TuplesKt.to("title", qProductStoreDetails.getTitle());
        pairArr[4] = TuplesKt.to("description", qProductStoreDetails.getDescription());
        List<QProductOfferDetails> subscriptionOfferDetails = qProductStoreDetails.getSubscriptionOfferDetails();
        if (subscriptionOfferDetails != null) {
            List<QProductOfferDetails> list = subscriptionOfferDetails;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(toMap((QProductOfferDetails) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        pairArr[5] = TuplesKt.to("subscriptionOfferDetails", arrayList);
        QProductOfferDetails defaultSubscriptionOfferDetails = qProductStoreDetails.getDefaultSubscriptionOfferDetails();
        pairArr[6] = TuplesKt.to("defaultSubscriptionOfferDetails", defaultSubscriptionOfferDetails != null ? toMap(defaultSubscriptionOfferDetails) : null);
        QProductOfferDetails basePlanSubscriptionOfferDetails = qProductStoreDetails.getBasePlanSubscriptionOfferDetails();
        pairArr[7] = TuplesKt.to("basePlanSubscriptionOfferDetails", basePlanSubscriptionOfferDetails != null ? toMap(basePlanSubscriptionOfferDetails) : null);
        QProductInAppDetails inAppOfferDetails = qProductStoreDetails.getInAppOfferDetails();
        pairArr[8] = TuplesKt.to("inAppOfferDetails", inAppOfferDetails != null ? toMap(inAppOfferDetails) : null);
        pairArr[9] = TuplesKt.to("hasTrialOffer", Boolean.valueOf(qProductStoreDetails.getHasTrialOffer()));
        pairArr[10] = TuplesKt.to("hasIntroOffer", Boolean.valueOf(qProductStoreDetails.getHasIntroOffer()));
        pairArr[11] = TuplesKt.to("hasTrialOrIntroOffer", Boolean.valueOf(qProductStoreDetails.getHasTrialOrIntroOffer()));
        pairArr[12] = TuplesKt.to("productType", qProductStoreDetails.getProductType().name());
        pairArr[13] = TuplesKt.to("isInApp", Boolean.valueOf(qProductStoreDetails.getIsInApp()));
        pairArr[14] = TuplesKt.to("isSubscription", Boolean.valueOf(qProductStoreDetails.getIsSubscription()));
        pairArr[15] = TuplesKt.to("isPrepaid", Boolean.valueOf(qProductStoreDetails.getIsPrepaid()));
        pairArr[16] = TuplesKt.to("isInstallment", Boolean.valueOf(qProductStoreDetails.getIsInstallment()));
        return MapsKt.mapOf(pairArr);
    }

    public static final Map<String, Object> toMap(QEntitlement qEntitlement) {
        Intrinsics.checkNotNullParameter(qEntitlement, "<this>");
        Pair[] pairArr = new Pair[15];
        pairArr[0] = TuplesKt.to("id", qEntitlement.getId());
        pairArr[1] = TuplesKt.to("startedTimestamp", Double.valueOf(qEntitlement.getStartedDate().getTime()));
        pairArr[2] = TuplesKt.to("expirationTimestamp", qEntitlement.getExpirationDate() != null ? Double.valueOf(r1.getTime()) : null);
        pairArr[3] = TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(qEntitlement.isActive()));
        pairArr[4] = TuplesKt.to(Constants.ScionAnalytics.PARAM_SOURCE, qEntitlement.getSource().name());
        pairArr[5] = TuplesKt.to("productId", qEntitlement.getProductId());
        pairArr[6] = TuplesKt.to("renewState", qEntitlement.getRenewState().getType());
        pairArr[7] = TuplesKt.to("renewsCount", Integer.valueOf(qEntitlement.getRenewsCount()));
        pairArr[8] = TuplesKt.to("trialStartTimestamp", qEntitlement.getTrialStartDate() != null ? Double.valueOf(r1.getTime()) : null);
        pairArr[9] = TuplesKt.to("firstPurchaseTimestamp", qEntitlement.getFirstPurchaseDate() != null ? Double.valueOf(r1.getTime()) : null);
        pairArr[10] = TuplesKt.to("lastPurchaseTimestamp", qEntitlement.getLastPurchaseDate() != null ? Double.valueOf(r1.getTime()) : null);
        pairArr[11] = TuplesKt.to("lastActivatedOfferCode", qEntitlement.getLastActivatedOfferCode());
        pairArr[12] = TuplesKt.to("autoRenewDisableTimestamp", qEntitlement.getAutoRenewDisableDate() != null ? Double.valueOf(r1.getTime()) : null);
        pairArr[13] = TuplesKt.to("grantType", qEntitlement.getGrantType().name());
        List<QTransaction> transactions = qEntitlement.getTransactions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(transactions, 10));
        Iterator<T> it = transactions.iterator();
        while (it.hasNext()) {
            arrayList.add(toMap((QTransaction) it.next()));
        }
        pairArr[14] = TuplesKt.to("transactions", arrayList);
        return MapsKt.mapOf(pairArr);
    }

    public static final Map<String, Object> toMap(QTransaction qTransaction) {
        Intrinsics.checkNotNullParameter(qTransaction, "<this>");
        Pair[] pairArr = new Pair[9];
        pairArr[0] = TuplesKt.to("originalTransactionId", qTransaction.getOriginalTransactionId());
        pairArr[1] = TuplesKt.to("transactionId", qTransaction.getTransactionId());
        pairArr[2] = TuplesKt.to("offerCode", qTransaction.getOfferCode());
        pairArr[3] = TuplesKt.to("transactionTimestamp", Double.valueOf(qTransaction.getTransactionDate().getTime()));
        pairArr[4] = TuplesKt.to("expirationTimestamp", qTransaction.getExpirationDate() != null ? Double.valueOf(r1.getTime()) : null);
        pairArr[5] = TuplesKt.to("transactionRevocationTimestamp", qTransaction.getTransactionRevocationDate() != null ? Double.valueOf(r1.getTime()) : null);
        pairArr[6] = TuplesKt.to("ownershipType", qTransaction.getOwnershipType().name());
        pairArr[7] = TuplesKt.to("type", qTransaction.getType().name());
        pairArr[8] = TuplesKt.to("environment", qTransaction.getEnvironment().name());
        return MapsKt.mapOf(pairArr);
    }

    public static final Map<String, Object> toMap(QOffering qOffering) {
        Intrinsics.checkNotNullParameter(qOffering, "<this>");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("id", qOffering.getOfferingID());
        pairArr[1] = TuplesKt.to("tag", qOffering.getTag().getTag());
        List<QProduct> products = qOffering.getProducts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(products, 10));
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(toMap((QProduct) it.next()));
        }
        pairArr[2] = TuplesKt.to("products", arrayList);
        return MapsKt.mapOf(pairArr);
    }

    public static final Map<String, Object> toMap(QOfferings qOfferings) {
        Intrinsics.checkNotNullParameter(qOfferings, "<this>");
        Pair[] pairArr = new Pair[2];
        QOffering main = qOfferings.getMain();
        pairArr[0] = TuplesKt.to("main", main != null ? toMap(main) : null);
        List<QOffering> availableOfferings = qOfferings.getAvailableOfferings();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(availableOfferings, 10));
        Iterator<T> it = availableOfferings.iterator();
        while (it.hasNext()) {
            arrayList.add(toMap((QOffering) it.next()));
        }
        pairArr[1] = TuplesKt.to("availableOfferings", arrayList);
        return MapsKt.mapOf(pairArr);
    }

    public static final Map<String, Object> toMap(QEligibility qEligibility) {
        Intrinsics.checkNotNullParameter(qEligibility, "<this>");
        return MapsKt.mapOf(TuplesKt.to(NotificationCompat.CATEGORY_STATUS, qEligibility.getStatus().getType()));
    }

    public static final Map<String, Object> toMap(QUser qUser) {
        Intrinsics.checkNotNullParameter(qUser, "<this>");
        return MapsKt.mapOf(TuplesKt.to("qonversionId", qUser.getQonversionId()), TuplesKt.to("identityId", qUser.getIdentityId()));
    }

    public static final Map<String, Object> toMap(QUserProperty qUserProperty) {
        Intrinsics.checkNotNullParameter(qUserProperty, "<this>");
        return MapsKt.mapOf(TuplesKt.to("key", qUserProperty.getKey()), TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.VALUE, qUserProperty.getValue()));
    }

    public static final Map<String, Object> toMap(QUserProperties qUserProperties) {
        Intrinsics.checkNotNullParameter(qUserProperties, "<this>");
        List<QUserProperty> properties = qUserProperties.getProperties();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(properties, 10));
        Iterator<T> it = properties.iterator();
        while (it.hasNext()) {
            arrayList.add(toMap((QUserProperty) it.next()));
        }
        return MapsKt.mapOf(TuplesKt.to("properties", arrayList));
    }

    public static final Map<String, Object> toMap(QRemoteConfigList qRemoteConfigList) {
        Intrinsics.checkNotNullParameter(qRemoteConfigList, "<this>");
        List<QRemoteConfig> remoteConfigs = qRemoteConfigList.getRemoteConfigs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(remoteConfigs, 10));
        Iterator<T> it = remoteConfigs.iterator();
        while (it.hasNext()) {
            arrayList.add(toMap((QRemoteConfig) it.next()));
        }
        return MapsKt.mapOf(TuplesKt.to("remoteConfigs", arrayList));
    }

    public static final Map<String, Object> toMap(QRemoteConfig qRemoteConfig) {
        Intrinsics.checkNotNullParameter(qRemoteConfig, "<this>");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("payload", qRemoteConfig.getPayload());
        QExperiment experiment = qRemoteConfig.getExperiment();
        pairArr[1] = TuplesKt.to("experiment", experiment != null ? toMap(experiment) : null);
        pairArr[2] = TuplesKt.to(Constants.ScionAnalytics.PARAM_SOURCE, toMap(qRemoteConfig.getSource()));
        return MapsKt.mapOf(pairArr);
    }

    public static final Map<String, Object> toMap(QExperiment qExperiment) {
        Intrinsics.checkNotNullParameter(qExperiment, "<this>");
        return MapsKt.mapOf(TuplesKt.to("id", qExperiment.getId()), TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.NAME, qExperiment.getName()), TuplesKt.to("group", toMap(qExperiment.getGroup())));
    }

    public static final Map<String, Object> toMap(QExperimentGroup qExperimentGroup) {
        Intrinsics.checkNotNullParameter(qExperimentGroup, "<this>");
        return MapsKt.mapOf(TuplesKt.to("id", qExperimentGroup.getId()), TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.NAME, qExperimentGroup.getName()), TuplesKt.to("type", toFormattedString(qExperimentGroup.getType())));
    }

    public static final String toFormattedString(QExperimentGroupType qExperimentGroupType) {
        Intrinsics.checkNotNullParameter(qExperimentGroupType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[qExperimentGroupType.ordinal()];
        if (i == 1) {
            return "treatment";
        }
        if (i == 2) {
            return "control";
        }
        return "unknown";
    }

    public static final Map<String, Object> toMap(QRemoteConfigurationSource qRemoteConfigurationSource) {
        Intrinsics.checkNotNullParameter(qRemoteConfigurationSource, "<this>");
        return MapsKt.mapOf(TuplesKt.to("id", qRemoteConfigurationSource.getId()), TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.NAME, qRemoteConfigurationSource.getName()), TuplesKt.to("type", toFormattedString(qRemoteConfigurationSource.getType())), TuplesKt.to("assignmentType", toFormattedString(qRemoteConfigurationSource.getAssignmentType())), TuplesKt.to("contextKey", qRemoteConfigurationSource.getContextKey()));
    }

    public static final String toFormattedString(QRemoteConfigurationSourceType qRemoteConfigurationSourceType) {
        Intrinsics.checkNotNullParameter(qRemoteConfigurationSourceType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[qRemoteConfigurationSourceType.ordinal()];
        if (i == 1) {
            return "remote_configuration";
        }
        if (i == 2) {
            return "experiment_treatment_group";
        }
        if (i == 3) {
            return "experiment_control_group";
        }
        return "unknown";
    }

    public static final String toFormattedString(QRemoteConfigurationAssignmentType qRemoteConfigurationAssignmentType) {
        Intrinsics.checkNotNullParameter(qRemoteConfigurationAssignmentType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[qRemoteConfigurationAssignmentType.ordinal()];
        if (i == 1) {
            return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        if (i == 2) {
            return "manual";
        }
        return "unknown";
    }

    public static final Map<String, Object> toMap(QActionResult qActionResult) {
        Intrinsics.checkNotNullParameter(qActionResult, "<this>");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("type", qActionResult.getType().getType());
        pairArr[1] = TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.VALUE, qActionResult.getValue());
        QonversionError error = qActionResult.getError();
        pairArr[2] = TuplesKt.to(Constants.IPC_BUNDLE_KEY_SEND_ERROR, error != null ? toMap(error) : null);
        return MapsKt.mapOf(pairArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QScreenPresentationConfig toScreenPresentationConfig(Map<String, ? extends Object> map) {
        QScreenPresentationStyle qScreenPresentationStyleValueOf;
        Object obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        try {
            obj = map.get("presentationStyle");
        } catch (IllegalArgumentException unused) {
        }
        if (obj == null) {
            qScreenPresentationStyleValueOf = null;
        } else {
            if (!(obj instanceof String)) {
                obj = null;
            }
            if (obj != null) {
                qScreenPresentationStyleValueOf = QScreenPresentationStyle.valueOf((String) obj);
            }
        }
        return qScreenPresentationStyleValueOf != null ? new QScreenPresentationConfig(qScreenPresentationStyleValueOf) : new QScreenPresentationConfig(null, 1, null);
    }

    public static final Map<String, Object> toProductsMap(Map<String, QProduct> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), toMap((QProduct) entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final Map<String, Object> toEntitlementsMap(Map<String, QEntitlement> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), toMap((QEntitlement) entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final Map<String, Object> toEligibilityMap(Map<String, QEligibility> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), toMap((QEligibility) entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final Map<String, String> toStringMap(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        return linkedHashMap3;
    }
}
