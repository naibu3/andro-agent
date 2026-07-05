package com.stripe.android.shoppay.bridge;

import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.shoppay.bridge.ECEDeliveryEstimate;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ShopPayMapper.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0000\u001a\f\u0010\t\u001a\u00020\n*\u00020\u0003H\u0000\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0005H\u0000\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u0006H\u0000\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0000¨\u0006\u0012"}, d2 = {"toJSON", "Lorg/json/JSONObject;", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;", "toECELineItem", "Lcom/stripe/android/shoppay/bridge/ECELineItem;", "toECEShippingRate", "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;", "toECEDeliveryEstimate", "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;", "toECEDeliveryEstimateUnit", "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;", "toECEDeliveryTimeUnit", "Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShopPayMapperKt {

    /* compiled from: ShopPayMapper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit.TimeUnit.values().length];
            try {
                iArr[PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit.TimeUnit.HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit.TimeUnit.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit.TimeUnit.BUSINESS_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit.TimeUnit.WEEK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit.TimeUnit.MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final JSONObject toJSON(PaymentSheet.ShopPayConfiguration.LineItem lineItem) throws JSONException {
        Intrinsics.checkNotNullParameter(lineItem, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", lineItem.getName());
        jSONObject.put(CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, lineItem.getAmount());
        return jSONObject;
    }

    public static final JSONObject toJSON(PaymentSheet.ShopPayConfiguration.ShippingRate shippingRate) throws JSONException {
        Intrinsics.checkNotNullParameter(shippingRate, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", shippingRate.getId());
        jSONObject.put(CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, shippingRate.getAmount());
        jSONObject.put("displayName", shippingRate.getDisplayName());
        PaymentSheet.ShopPayConfiguration.DeliveryEstimate deliveryEstimate = shippingRate.getDeliveryEstimate();
        if (deliveryEstimate != null) {
            jSONObject.put("deliveryEstimate", toJSON(deliveryEstimate));
        }
        return jSONObject;
    }

    public static final Object toJSON(PaymentSheet.ShopPayConfiguration.DeliveryEstimate deliveryEstimate) throws JSONException {
        Intrinsics.checkNotNullParameter(deliveryEstimate, "<this>");
        if (deliveryEstimate instanceof PaymentSheet.ShopPayConfiguration.DeliveryEstimate.Text) {
            return ((PaymentSheet.ShopPayConfiguration.DeliveryEstimate.Text) deliveryEstimate).getValue();
        }
        if (!(deliveryEstimate instanceof PaymentSheet.ShopPayConfiguration.DeliveryEstimate.Range)) {
            throw new NoWhenBranchMatchedException();
        }
        JSONObject jSONObject = new JSONObject();
        PaymentSheet.ShopPayConfiguration.DeliveryEstimate.Range range = (PaymentSheet.ShopPayConfiguration.DeliveryEstimate.Range) deliveryEstimate;
        PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit minimum = range.getMinimum();
        jSONObject.putOpt("minimum", minimum != null ? toJSON(minimum) : null);
        PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit maximum = range.getMaximum();
        jSONObject.putOpt("maximum", maximum != null ? toJSON(maximum) : null);
        return jSONObject;
    }

    public static final JSONObject toJSON(PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit deliveryEstimateUnit) throws JSONException {
        Intrinsics.checkNotNullParameter(deliveryEstimateUnit, "<this>");
        JSONObject jSONObject = new JSONObject();
        String lowerCase = deliveryEstimateUnit.getUnit().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        jSONObject.put("unit", lowerCase);
        jSONObject.put("value", deliveryEstimateUnit.getValue());
        return jSONObject;
    }

    public static final ECELineItem toECELineItem(PaymentSheet.ShopPayConfiguration.LineItem lineItem) {
        Intrinsics.checkNotNullParameter(lineItem, "<this>");
        return new ECELineItem(lineItem.getName(), lineItem.getAmount());
    }

    public static final ECEShippingRate toECEShippingRate(PaymentSheet.ShopPayConfiguration.ShippingRate shippingRate) {
        Intrinsics.checkNotNullParameter(shippingRate, "<this>");
        String id = shippingRate.getId();
        int amount = shippingRate.getAmount();
        String displayName = shippingRate.getDisplayName();
        PaymentSheet.ShopPayConfiguration.DeliveryEstimate deliveryEstimate = shippingRate.getDeliveryEstimate();
        return new ECEShippingRate(id, amount, displayName, deliveryEstimate != null ? toECEDeliveryEstimate(deliveryEstimate) : null);
    }

    public static final ECEDeliveryEstimate toECEDeliveryEstimate(PaymentSheet.ShopPayConfiguration.DeliveryEstimate deliveryEstimate) {
        Intrinsics.checkNotNullParameter(deliveryEstimate, "<this>");
        if (deliveryEstimate instanceof PaymentSheet.ShopPayConfiguration.DeliveryEstimate.Text) {
            return new ECEDeliveryEstimate.Text(((PaymentSheet.ShopPayConfiguration.DeliveryEstimate.Text) deliveryEstimate).getValue());
        }
        if (!(deliveryEstimate instanceof PaymentSheet.ShopPayConfiguration.DeliveryEstimate.Range)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentSheet.ShopPayConfiguration.DeliveryEstimate.Range range = (PaymentSheet.ShopPayConfiguration.DeliveryEstimate.Range) deliveryEstimate;
        PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit maximum = range.getMaximum();
        ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit = maximum != null ? toECEDeliveryEstimateUnit(maximum) : null;
        PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit minimum = range.getMinimum();
        return new ECEDeliveryEstimate.Range(new ECEStructuredDeliveryEstimate(eCEDeliveryEstimateUnit, minimum != null ? toECEDeliveryEstimateUnit(minimum) : null));
    }

    public static final ECEDeliveryEstimateUnit toECEDeliveryEstimateUnit(PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit deliveryEstimateUnit) {
        Intrinsics.checkNotNullParameter(deliveryEstimateUnit, "<this>");
        return new ECEDeliveryEstimateUnit(toECEDeliveryTimeUnit(deliveryEstimateUnit.getUnit()), deliveryEstimateUnit.getValue());
    }

    public static final DeliveryTimeUnit toECEDeliveryTimeUnit(PaymentSheet.ShopPayConfiguration.DeliveryEstimate.DeliveryEstimateUnit.TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[timeUnit.ordinal()];
        if (i == 1) {
            return DeliveryTimeUnit.HOUR;
        }
        if (i == 2) {
            return DeliveryTimeUnit.DAY;
        }
        if (i == 3) {
            return DeliveryTimeUnit.BUSINESS_DAY;
        }
        if (i == 4) {
            return DeliveryTimeUnit.WEEK;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return DeliveryTimeUnit.MONTH;
    }
}
