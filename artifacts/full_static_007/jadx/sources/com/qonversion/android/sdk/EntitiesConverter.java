package com.qonversion.android.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class EntitiesConverter {
    static Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object map2 = jSONObject.get(next);
            if (map2 instanceof JSONArray) {
                map2 = toList((JSONArray) map2);
            } else if (map2 instanceof JSONObject) {
                map2 = toMap((JSONObject) map2);
            }
            map.put(next, map2);
        }
        return map;
    }

    public static List<Object> toList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object map = jSONArray.get(i);
            if (map instanceof JSONArray) {
                map = toList((JSONArray) map);
            } else if (map instanceof JSONObject) {
                map = toMap((JSONObject) map);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    static JSONObject convertMapToJson(Map<String, ?> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                jSONObject.put(entry.getKey(), JSONObject.NULL);
            } else if (value instanceof Map) {
                jSONObject.put(entry.getKey(), convertMapToJson((Map) entry.getValue()));
            } else if (entry.getValue() instanceof Object[]) {
                jSONObject.put(entry.getKey(), convertArrayToJson((Object[]) entry.getValue()));
            } else if (entry.getValue() instanceof List) {
                jSONObject.put(entry.getKey(), convertArrayToJson(((List) entry.getValue()).toArray()));
            } else {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    static JSONArray convertArrayToJson(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            if (obj == null) {
                jSONArray.put(JSONObject.NULL);
            } else if (obj instanceof Map) {
                jSONArray.put(convertMapToJson((Map) obj));
            } else if (obj instanceof Object[]) {
                jSONArray.put(convertArrayToJson((Object[]) obj));
            } else if (obj instanceof List) {
                jSONArray.put(convertArrayToJson(((List) obj).toArray()));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    static List<String> convertArrayToStringList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }
}
