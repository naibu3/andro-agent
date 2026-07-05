package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzdwg {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    /* synthetic */ zzdwg(String str, zzdwf zzdwfVar) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ String zza(zzdwg zzdwgVar) throws JSONException {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjX);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdwgVar.zza);
            jSONObject.put("eventCategory", zzdwgVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdwgVar.zzc);
            jSONObject.putOpt("errorCode", zzdwgVar.zzd);
            jSONObject.putOpt("rewardType", zzdwgVar.zze);
            jSONObject.putOpt("rewardAmount", zzdwgVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
