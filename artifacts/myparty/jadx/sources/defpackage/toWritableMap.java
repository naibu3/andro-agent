package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.reactnativestripesdk.utils.MappersKt;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionDisplayDataMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: PaymentOptionDisplayDataMapperKt, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class toWritableMap {
    public static final WritableMap toWritableMap(EmbeddedPaymentElement.PaymentOptionDisplayData paymentOptionDisplayData) {
        Intrinsics.checkNotNullParameter(paymentOptionDisplayData, "<this>");
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putString("label", paymentOptionDisplayData.getLabel());
        writableMapCreateMap.putString("paymentMethodType", paymentOptionDisplayData.getPaymentMethodType());
        writableMapCreateMap.putMap("billingDetails", MappersKt.mapFromPaymentSheetBillingDetails(paymentOptionDisplayData.getBillingDetails()));
        return writableMapCreateMap;
    }
}
