package com.stripe.android.core.networking;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* compiled from: AnalyticsRequestV2.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0004H\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"InstantAnalyticsExecutionCutOff", "", "toJsonElement", "Lkotlinx/serialization/json/JsonElement;", "", "", "stripe-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnalyticsRequestV2Kt {
    public static final int InstantAnalyticsExecutionCutOff = 5;

    private static final JsonElement toJsonElement(List<?> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : CollectionsKt.filterNotNull(list)) {
            if (obj instanceof Map) {
                arrayList.add(toJsonElement((Map<?, ?>) obj));
            } else if (obj instanceof List) {
                arrayList.add(toJsonElement((List<?>) obj));
            } else {
                arrayList.add(JsonElementKt.JsonPrimitive(obj.toString()));
            }
        }
        return new JsonArray(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonElement toJsonElement(Map<?, ?> map) {
        Object value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null && (value = entry.getValue()) != null) {
                if (value instanceof Map) {
                    linkedHashMap.put(str, toJsonElement((Map<?, ?>) value));
                } else if (value instanceof List) {
                    linkedHashMap.put(str, toJsonElement((List<?>) value));
                } else {
                    linkedHashMap.put(str, JsonElementKt.JsonPrimitive(value.toString()));
                }
            }
        }
        return new JsonObject(linkedHashMap);
    }
}
