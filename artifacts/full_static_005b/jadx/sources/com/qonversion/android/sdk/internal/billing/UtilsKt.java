package com.qonversion.android.sdk.internal.billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.products.QProductOfferDetails;
import com.qonversion.android.sdk.dto.products.QProductPricingPhase;
import com.qonversion.android.sdk.dto.products.QSubscriptionPeriod;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: utils.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\b\u0010\"\u001a\u00020#H\u0000\u001a\f\u0010$\u001a\u00020\u001c*\u00020#H\u0002\u001a\f\u0010%\u001a\u00020\u001c*\u00020\u0014H\u0000\u001a\f\u0010%\u001a\u00020\u001c*\u00020\u001dH\u0000\u001a\f\u0010%\u001a\u00020\u001c*\u00020 H\u0000\u001a\f\u0010%\u001a\u00020\u001c*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007\"\u001e\u0010\b\u001a\u00020\t*\u00020\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u000f\u001a\u00020\u0001*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015\"\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010!¨\u0006&"}, d2 = {"MAX_BILLING_PHASES_DURATION_YEARS", "", "durationDays", "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;", "getDurationDays", "(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)I", "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)I", "hasAnyStoreDetails", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "getHasAnyStoreDetails$annotations", "(Lcom/qonversion/android/sdk/dto/products/QProduct;)V", "getHasAnyStoreDetails", "(Lcom/qonversion/android/sdk/dto/products/QProduct;)Z", "inDays", "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;", "getInDays", "(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)I", "isOk", "Lcom/android/billingclient/api/BillingResult;", "(Lcom/android/billingclient/api/BillingResult;)Z", "pricePerMaxDuration", "", "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "getPricePerMaxDuration", "(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)D", "productId", "", "Lcom/android/billingclient/api/Purchase;", "getProductId", "(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;", "getCurrentTimeInMillis", "", "convertLongToTime", "getDescription", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class UtilsKt {
    private static final int MAX_BILLING_PHASES_DURATION_YEARS = 55;

    /* compiled from: utils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[QProductPricingPhase.Type.values().length];
            try {
                iArr[QProductPricingPhase.Type.FreeTrial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QProductPricingPhase.Type.DiscountedRecurringPayment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QProductPricingPhase.Type.DiscountedSinglePayment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[QSubscriptionPeriod.Unit.values().length];
            try {
                iArr2[QSubscriptionPeriod.Unit.Day.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[QSubscriptionPeriod.Unit.Week.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[QSubscriptionPeriod.Unit.Month.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[QSubscriptionPeriod.Unit.Year.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[QSubscriptionPeriod.Unit.Unknown.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ void getHasAnyStoreDetails$annotations(QProduct qProduct) {
    }

    public static final boolean isOk(BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "<this>");
        return billingResult.getResponseCode() == 0;
    }

    public static final String getDescription(BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "<this>");
        return "It is a proxy of the Google BillingClient error: " + getDescription(billingResult.getResponseCode());
    }

    public static final String getDescription(PurchaseHistoryRecord purchaseHistoryRecord) {
        Intrinsics.checkNotNullParameter(purchaseHistoryRecord, "<this>");
        return "ProductId: " + getProductId(purchaseHistoryRecord) + "; PurchaseTime: " + convertLongToTime(purchaseHistoryRecord.getPurchaseTime()) + "; PurchaseToken: " + purchaseHistoryRecord.getPurchaseToken();
    }

    public static final String getDescription(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "<this>");
        return "ProductId: " + getProductId(purchase) + "; OrderId: " + purchase.getOrderId() + "; PurchaseToken: " + purchase.getPurchaseToken();
    }

    public static final String getProductId(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "<this>");
        List<String> products = purchase.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        return (String) CollectionsKt.firstOrNull((List) products);
    }

    public static final String getProductId(PurchaseHistoryRecord purchaseHistoryRecord) {
        Intrinsics.checkNotNullParameter(purchaseHistoryRecord, "<this>");
        List<String> products = purchaseHistoryRecord.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        return (String) CollectionsKt.firstOrNull((List) products);
    }

    public static final long getCurrentTimeInMillis() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public static final double getPricePerMaxDuration(QProductOfferDetails qProductOfferDetails) {
        Intrinsics.checkNotNullParameter(qProductOfferDetails, "<this>");
        int inDays = getInDays(QSubscriptionPeriod.Unit.Year) * 55;
        double priceAmountMicros = 0.0d;
        for (QProductPricingPhase qProductPricingPhase : qProductOfferDetails.getPricingPhases()) {
            if (qProductPricingPhase.getIsBasePlan()) {
                return priceAmountMicros + (qProductPricingPhase.getPrice().getPriceAmountMicros() * (getDurationDays(qProductPricingPhase.getBillingPeriod()) != 0 ? inDays / getDurationDays(qProductPricingPhase.getBillingPeriod()) : Double.MAX_VALUE));
            }
            inDays -= getDurationDays(qProductPricingPhase);
            if (!qProductPricingPhase.getIsTrial()) {
                priceAmountMicros += qProductPricingPhase.getPrice().getPriceAmountMicros() * qProductPricingPhase.getBillingCycleCount();
            }
        }
        return priceAmountMicros;
    }

    public static final int getDurationDays(QProductPricingPhase qProductPricingPhase) {
        Intrinsics.checkNotNullParameter(qProductPricingPhase, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[qProductPricingPhase.getType().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            return 0;
        }
        return qProductPricingPhase.getBillingCycleCount() * getDurationDays(qProductPricingPhase.getBillingPeriod());
    }

    public static final int getDurationDays(QSubscriptionPeriod qSubscriptionPeriod) {
        Intrinsics.checkNotNullParameter(qSubscriptionPeriod, "<this>");
        return getInDays(qSubscriptionPeriod.getUnit()) * qSubscriptionPeriod.getUnitCount();
    }

    public static final int getInDays(QSubscriptionPeriod.Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[unit.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 7;
        }
        if (i == 3) {
            return 30;
        }
        if (i == 4) {
            return 365;
        }
        if (i == 5) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean getHasAnyStoreDetails(QProduct qProduct) {
        Intrinsics.checkNotNullParameter(qProduct, "<this>");
        return (qProduct.getSkuDetail() == null && qProduct.getStoreDetails() == null) ? false : true;
    }

    private static final String convertLongToTime(long j) {
        String str = new SimpleDateFormat("yyyy.MM.dd HH:mm", Locale.getDefault()).format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private static final String getDescription(int i) {
        if (i == 12) {
            return "NETWORK_ERROR";
        }
        switch (i) {
            case -2:
                return "FEATURE_NOT_SUPPORTED";
            case -1:
                return "SERVICE_DISCONNECTED";
            case 0:
                return "OK";
            case 1:
                return "USER_CANCELED";
            case 2:
                return "SERVICE_UNAVAILABLE";
            case 3:
                return "BILLING_UNAVAILABLE";
            case 4:
                return "ITEM_UNAVAILABLE";
            case 5:
                return "DEVELOPER_ERROR";
            case 6:
                return "ERROR";
            case 7:
                return "ITEM_ALREADY_OWNED";
            case 8:
                return "ITEM_NOT_OWNED";
            default:
                return String.valueOf(i);
        }
    }
}
