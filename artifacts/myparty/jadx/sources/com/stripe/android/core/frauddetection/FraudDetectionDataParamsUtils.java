package com.stripe.android.core.frauddetection;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FraudDetectionDataParamsUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00052\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tJ6\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00052\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;", "", "<init>", "()V", "addFraudDetectionData", "", "", NativeProtocol.WEB_DIALOG_PARAMS, "fraudDetectionData", "Lcom/stripe/android/core/frauddetection/FraudDetectionData;", "stripeIntentParams", SDKConstants.PARAM_KEY, "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FraudDetectionDataParamsUtils {
    public final Map<String, ?> addFraudDetectionData(Map<String, ?> params, FraudDetectionData fraudDetectionData) {
        Object next;
        Map<String, ?> mapAddFraudDetectionData;
        Intrinsics.checkNotNullParameter(params, "params");
        Iterator it = SetsKt.setOf((Object[]) new String[]{ConfirmPaymentIntentParams.PARAM_SOURCE_DATA, "payment_method_data"}).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (params.containsKey((String) next)) {
                break;
            }
        }
        String str = (String) next;
        return (str == null || (mapAddFraudDetectionData = addFraudDetectionData(params, str, fraudDetectionData)) == null) ? params : mapAddFraudDetectionData;
    }

    private final Map<String, ?> addFraudDetectionData(Map<String, ?> stripeIntentParams, String key, FraudDetectionData fraudDetectionData) {
        Object obj = stripeIntentParams.get(key);
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            Map<String, String> params = fraudDetectionData != null ? fraudDetectionData.getParams() : null;
            if (params == null) {
                params = MapsKt.emptyMap();
            }
            Map<String, ?> mapPlus = MapsKt.plus(stripeIntentParams, MapsKt.mapOf(TuplesKt.to(key, MapsKt.plus(map, params))));
            if (mapPlus != null) {
                return mapPlus;
            }
        }
        return stripeIntentParams;
    }
}
