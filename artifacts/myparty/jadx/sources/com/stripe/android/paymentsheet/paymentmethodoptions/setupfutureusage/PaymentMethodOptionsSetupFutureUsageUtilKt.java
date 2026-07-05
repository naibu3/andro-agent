package com.stripe.android.paymentsheet.paymentmethodoptions.setupfutureusage;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodOptionsSetupFutureUsageUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toJsonObjectString", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment$PaymentMethodOptions;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentMethodOptionsSetupFutureUsageUtilKt {

    /* compiled from: PaymentMethodOptionsSetupFutureUsageUtil.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheet.IntentConfiguration.SetupFutureUse.values().length];
            try {
                iArr[PaymentSheet.IntentConfiguration.SetupFutureUse.OffSession.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSheet.IntentConfiguration.SetupFutureUse.OnSession.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentSheet.IntentConfiguration.SetupFutureUse.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toJsonObjectString(PaymentSheet.IntentConfiguration.Mode.Payment.PaymentMethodOptions paymentMethodOptions) {
        String str;
        Intrinsics.checkNotNullParameter(paymentMethodOptions, "<this>");
        Map<PaymentMethod.Type, PaymentSheet.IntentConfiguration.SetupFutureUse> setupFutureUsageValues$paymentsheet_release = paymentMethodOptions.getSetupFutureUsageValues$paymentsheet_release();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(setupFutureUsageValues$paymentsheet_release.size()));
        Iterator<T> it = setupFutureUsageValues$paymentsheet_release.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((PaymentMethod.Type) entry.getKey()).code, entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            int i = WhenMappings.$EnumSwitchMapping$0[((PaymentSheet.IntentConfiguration.SetupFutureUse) entry2.getValue()).ordinal()];
            if (i == 1) {
                str = PaymentIntent.OFF_SESSION;
            } else if (i == 2) {
                str = PaymentIntent.ON_SESSION;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "none";
            }
            linkedHashMap2.put(key, MapsKt.mapOf(TuplesKt.to("setup_future_usage", str)));
        }
        return String.valueOf(StripeJsonUtils.INSTANCE.mapToJsonObject(linkedHashMap2));
    }
}
