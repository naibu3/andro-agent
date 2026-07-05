package com.reactnativestripesdk;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedPaymentElementViewManager.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001a\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002\u001a\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"getStringArrayList", "", "", "Lcom/facebook/react/bridge/ReadableMap;", SDKConstants.PARAM_KEY, "getIntegerArrayList", "", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementViewManagerKt {
    public static final List<String> getStringArrayList(ReadableMap readableMap, String key) {
        ReadableArray array;
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!readableMap.hasKey(key) || readableMap.getType(key) != ReadableType.Array || (array = readableMap.getArray(key)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = array.size();
        for (int i = 0; i < size; i++) {
            String string = array.getString(i);
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    public static final List<Integer> getIntegerArrayList(ReadableMap readableMap, String key) {
        ReadableArray array;
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!readableMap.hasKey(key) || readableMap.getType(key) != ReadableType.Array || (array = readableMap.getArray(key)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = array.size();
        for (int i = 0; i < size; i++) {
            if (array.getType(i) == ReadableType.Number) {
                arrayList.add(Integer.valueOf(array.getInt(i)));
            }
        }
        return arrayList;
    }
}
