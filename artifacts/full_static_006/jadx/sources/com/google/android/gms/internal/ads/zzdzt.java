package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdzt implements zzhkp {
    private final zzhlg zza;

    public zzdzt(zzhlg zzhlgVar) {
        this.zza = zzhlgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.ads.zzhlg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zzb() throws JSONException {
        String strValueOf;
        zzfho zzfhoVarZza = ((zzczc) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhv)).booleanValue()) {
            String str = zzfhoVarZza.zzd.zzx;
            if (!TextUtils.isEmpty(str)) {
                try {
                    strValueOf = new JSONObject(str).getString("request_id");
                } catch (JSONException unused) {
                }
                if (TextUtils.isEmpty(strValueOf)) {
                    if (zzfhoVarZza.zzd.zzs != null) {
                        try {
                            strValueOf = new JSONObject(zzfhoVarZza.zzd.zzs.zza).getString("request_id");
                        } catch (JSONException unused2) {
                        }
                        if (TextUtils.isEmpty(strValueOf)) {
                            strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.zze().nextInt() & Integer.MAX_VALUE);
                        }
                    }
                }
            }
        }
        zzhkx.zzb(strValueOf);
        return strValueOf;
    }
}
