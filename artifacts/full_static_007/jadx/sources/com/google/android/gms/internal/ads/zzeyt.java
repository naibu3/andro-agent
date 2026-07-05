package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeyt implements zzexv {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfvd zzc;

    public zzeyt(AdvertisingIdClient.Info info, String str, zzfvd zzfvdVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbw.zzg((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    jSONObjectZzg.put("pdid", str);
                    jSONObjectZzg.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzg.put("rdid", this.zza.getId());
            jSONObjectZzg.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            jSONObjectZzg.put("idtype", "adid");
            zzfvd zzfvdVar = this.zzc;
            if (zzfvdVar.zzc()) {
                jSONObjectZzg.put("paidv1_id_android_3p", zzfvdVar.zzb());
                jSONObjectZzg.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
