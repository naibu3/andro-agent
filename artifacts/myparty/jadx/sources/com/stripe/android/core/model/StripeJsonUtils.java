package com.stripe.android.core.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StripeJsonUtils.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0005J\u001f\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\n\u001a\u00020\u0005H\u0007J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0005H\u0007J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0005H\u0007J(\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0005J&\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0005J \u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00152\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001e\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00152\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u001c\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0015J\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\f\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001aH\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/stripe/android/core/model/StripeJsonUtils;", "", "<init>", "()V", "NULL", "", "optBoolean", "", "jsonObject", "Lorg/json/JSONObject;", "fieldName", "optInteger", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "optLong", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "optString", "optCountryCode", "optCurrency", "optMap", "", "optHash", "jsonObjectToMap", "jsonObjectToStringMap", "jsonArrayToList", "", "jsonArray", "Lorg/json/JSONArray;", "mapToJsonObject", "mapObject", "listToJsonArray", "values", "nullIfNullOrEmpty", "possibleNull", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeJsonUtils {
    public static final StripeJsonUtils INSTANCE = new StripeJsonUtils();
    private static final String NULL = "null";

    private StripeJsonUtils() {
    }

    public final /* synthetic */ boolean optBoolean(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        return jsonObject.has(fieldName) && jsonObject.optBoolean(fieldName, false);
    }

    public final /* synthetic */ Integer optInteger(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        if (jsonObject.has(fieldName)) {
            return Integer.valueOf(jsonObject.optInt(fieldName));
        }
        return null;
    }

    public final /* synthetic */ Long optLong(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        if (jsonObject.has(fieldName)) {
            return Long.valueOf(jsonObject.optLong(fieldName));
        }
        return null;
    }

    @JvmStatic
    public static final String optString(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        return INSTANCE.nullIfNullOrEmpty(jsonObject != null ? jsonObject.optString(fieldName) : null);
    }

    public final /* synthetic */ String optCountryCode(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        String strNullIfNullOrEmpty = nullIfNullOrEmpty(jsonObject.optString(fieldName));
        if (strNullIfNullOrEmpty == null || strNullIfNullOrEmpty.length() != 2) {
            return null;
        }
        return strNullIfNullOrEmpty;
    }

    @JvmStatic
    public static final String optCurrency(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        String strNullIfNullOrEmpty = INSTANCE.nullIfNullOrEmpty(jsonObject.optString(fieldName));
        if (strNullIfNullOrEmpty == null || strNullIfNullOrEmpty.length() != 3) {
            return null;
        }
        return strNullIfNullOrEmpty;
    }

    public final /* synthetic */ Map optMap(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(fieldName);
        if (jSONObjectOptJSONObject != null) {
            return INSTANCE.jsonObjectToMap(jSONObjectOptJSONObject);
        }
        return null;
    }

    public final /* synthetic */ Map optHash(JSONObject jsonObject, String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(fieldName);
        if (jSONObjectOptJSONObject != null) {
            return INSTANCE.jsonObjectToStringMap(jSONObjectOptJSONObject);
        }
        return null;
    }

    public final /* synthetic */ Map jsonObjectToMap(JSONObject jsonObject) {
        Map mapMapOf;
        if (jsonObject == null) {
            return null;
        }
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames == null) {
            jSONArrayNames = new JSONArray();
        }
        IntRange intRangeUntil = RangesKt.until(0, jSONArrayNames.length());
        ArrayList<String> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArrayNames.getString(((IntIterator) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            Object objOpt = jsonObject.opt(str);
            if (objOpt == null || Intrinsics.areEqual(objOpt, "null")) {
                mapMapOf = null;
            } else {
                if (objOpt instanceof JSONObject) {
                    objOpt = INSTANCE.jsonObjectToMap((JSONObject) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    objOpt = INSTANCE.jsonArrayToList((JSONArray) objOpt);
                }
                mapMapOf = MapsKt.mapOf(TuplesKt.to(str, objOpt));
            }
            if (mapMapOf != null) {
                arrayList2.add(mapMapOf);
            }
        }
        Map mapEmptyMap = MapsKt.emptyMap();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            mapEmptyMap = MapsKt.plus(mapEmptyMap, (Map) it2.next());
        }
        return mapEmptyMap;
    }

    public final /* synthetic */ Map jsonObjectToStringMap(JSONObject jsonObject) {
        if (jsonObject == null) {
            return null;
        }
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames == null) {
            jSONArrayNames = new JSONArray();
        }
        IntRange intRangeUntil = RangesKt.until(0, jSONArrayNames.length());
        ArrayList<String> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArrayNames.getString(((IntIterator) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            Object objOpt = jsonObject.opt(str);
            Map mapMapOf = (objOpt == null || Intrinsics.areEqual(objOpt, "null")) ? null : MapsKt.mapOf(TuplesKt.to(str, objOpt.toString()));
            if (mapMapOf != null) {
                arrayList2.add(mapMapOf);
            }
        }
        Map mapEmptyMap = MapsKt.emptyMap();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            mapEmptyMap = MapsKt.plus(mapEmptyMap, (Map) it2.next());
        }
        return mapEmptyMap;
    }

    public final /* synthetic */ List jsonArrayToList(JSONArray jsonArray) {
        if (jsonArray == null) {
            return null;
        }
        IntRange intRangeUntil = RangesKt.until(0, jsonArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(jsonArray.get(((IntIterator) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object objJsonObjectToMap : arrayList) {
            if (objJsonObjectToMap instanceof JSONArray) {
                objJsonObjectToMap = INSTANCE.jsonArrayToList((JSONArray) objJsonObjectToMap);
            } else if (objJsonObjectToMap instanceof JSONObject) {
                objJsonObjectToMap = INSTANCE.jsonObjectToMap((JSONObject) objJsonObjectToMap);
            } else if (Intrinsics.areEqual(objJsonObjectToMap, "null")) {
                objJsonObjectToMap = null;
            }
            if (objJsonObjectToMap != null) {
                arrayList2.add(objJsonObjectToMap);
            }
        }
        return arrayList2;
    }

    public final JSONObject mapToJsonObject(Map<String, ?> mapObject) throws JSONException {
        if (mapObject == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : mapObject.keySet()) {
            Object obj = mapObject.get(str);
            if (obj != null) {
                try {
                    if (obj instanceof Map) {
                        try {
                            jSONObject.put(str, mapToJsonObject((Map) obj));
                        } catch (ClassCastException unused) {
                            Unit unit = Unit.INSTANCE;
                        }
                    } else if (obj instanceof List) {
                        jSONObject.put(str, listToJsonArray((List) obj));
                    } else if ((obj instanceof Number) || (obj instanceof Boolean)) {
                        jSONObject.put(str, obj);
                    } else {
                        jSONObject.put(str, obj.toString());
                    }
                } catch (JSONException unused2) {
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        return jSONObject;
    }

    private final JSONArray listToJsonArray(List<?> values) throws JSONException {
        if (values == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object objValueOf : values) {
            if (objValueOf instanceof Map) {
                objValueOf = INSTANCE.mapToJsonObject((Map) objValueOf);
            } else if (objValueOf instanceof List) {
                objValueOf = INSTANCE.listToJsonArray((List) objValueOf);
            } else if (!(objValueOf instanceof Number) && !(objValueOf instanceof Boolean)) {
                objValueOf = String.valueOf(objValueOf);
            }
            jSONArray.put(objValueOf);
        }
        return jSONArray;
    }

    public final /* synthetic */ String nullIfNullOrEmpty(String possibleNull) {
        if (possibleNull == null || Intrinsics.areEqual("null", possibleNull) || possibleNull.length() == 0) {
            return null;
        }
        return possibleNull;
    }
}
