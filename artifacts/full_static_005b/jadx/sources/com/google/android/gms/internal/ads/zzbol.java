package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbol {
    public static void zza(zzbom zzbomVar, String str, Map map) {
        try {
            zzbomVar.zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbom zzbomVar, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzbomVar.zza(sb.toString());
    }

    public static void zzc(zzbom zzbomVar, String str, String str2) {
        zzbomVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbom zzbomVar, String str, JSONObject jSONObject) {
        zzbomVar.zzb(str, jSONObject.toString());
    }
}
