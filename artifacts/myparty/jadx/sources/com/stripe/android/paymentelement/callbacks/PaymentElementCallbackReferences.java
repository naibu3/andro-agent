package com.stripe.android.paymentelement.callbacks;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentElementCallbackReferences.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0007H\u0086\u0002J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006J\b\u0010\u000e\u001a\u00020\u000bH\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;", "", "<init>", "()V", "instanceCallbackMap", "", "", "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;", "get", SDKConstants.PARAM_KEY, "set", "", "callbacks", "remove", "clear", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentElementCallbackReferences {
    public static final PaymentElementCallbackReferences INSTANCE = new PaymentElementCallbackReferences();
    private static final Map<String, PaymentElementCallbacks> instanceCallbackMap = new LinkedHashMap();
    public static final int $stable = 8;

    private PaymentElementCallbackReferences() {
    }

    public final PaymentElementCallbacks get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, PaymentElementCallbacks> map = instanceCallbackMap;
        PaymentElementCallbacks paymentElementCallbacks = map.get(key);
        return paymentElementCallbacks == null ? (PaymentElementCallbacks) CollectionsKt.firstOrNull(map.values()) : paymentElementCallbacks;
    }

    public final void set(String key, PaymentElementCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        instanceCallbackMap.put(key, callbacks);
    }

    public final void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        instanceCallbackMap.remove(key);
    }

    public final void clear() {
        instanceCallbackMap.clear();
    }
}
