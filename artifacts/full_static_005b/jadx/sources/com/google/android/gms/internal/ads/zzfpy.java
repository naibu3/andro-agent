package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfpy {
    private static WindowManager zzb;
    private static final String[] zzc = {"x", "y", "width", "height"};
    static float zza = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject zza(int i, int i2, int i3, int i4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / zza);
            jSONObject.put("y", i2 / zza);
            jSONObject.put("width", i3 / zza);
            jSONObject.put("height", i4 / zza);
        } catch (JSONException e) {
            zzfpz.zza("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void zzb(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            zzfpz.zza("Error with setting ad session id", e);
        }
    }

    public static void zzc(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void zzd(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static void zze(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            zzfpz.zza("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    public static void zzf(JSONObject jSONObject) throws JSONException {
        float f;
        float f2;
        if (zzb != null) {
            zzb.getDefaultDisplay().getRealSize(new Point(0, 0));
            f = r0.x / zza;
            f2 = r0.y / zza;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzg(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = zzc;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) {
                        jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                        jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                        if (jSONArrayOptJSONArray == null) {
                        }
                        if (zzh(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                        }
                    } else if (zzh(jSONArrayOptJSONArray3, jSONArrayOptJSONArray4)) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                            if (!jSONArrayOptJSONArray3.optString(i2, "").equals(jSONArrayOptJSONArray4.optString(i2, ""))) {
                                break;
                            }
                        }
                        jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                        jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 != null) {
                            if (zzh(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                                    if (zzg(jSONArrayOptJSONArray.optJSONObject(i3), jSONArrayOptJSONArray2.optJSONObject(i3))) {
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean zzh(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
