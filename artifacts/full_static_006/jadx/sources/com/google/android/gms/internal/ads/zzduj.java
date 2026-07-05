package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.webkit.WebViewFeature;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzduj implements zzdcg, zzdaz, zzczo, zzdhu {
    private final zzdux zza;
    private final zzdvh zzb;

    public zzduj(zzdux zzduxVar, zzdvh zzdvhVar) {
        this.zza = zzduxVar;
        this.zzb = zzdvhVar;
    }

    private final void zzc(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzc(str, String.valueOf(j));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzd(Bundle bundle, zzgbc zzgbcVar) {
        int size = zzgbcVar.size();
        for (int i = 0; i < size; i++) {
            zzdum zzdumVar = (zzdum) zzgbcVar.get(i);
            long j = bundle.getLong(zzdumVar.zza().zza(), -1L);
            long j2 = bundle.getLong(zzdumVar.zzb().zza(), -1L);
            if (j > 0 && j2 > 0) {
                this.zza.zzc(zzdumVar.zzc(), String.valueOf(j2 - j));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzc("ftl", String.valueOf(zzeVar.zza));
        this.zza.zzc("ed", zzeVar.zzc);
        this.zzb.zzf(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) {
        this.zza.zze(zzbxuVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdo(zzfhf zzfhfVar) {
        this.zza.zzd(zzfhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdhu
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzax zzaxVar) {
        String str;
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhj)).booleanValue()) {
            if (zzaxVar == null) {
                this.zza.zzb().put("action", "sgs");
                this.zza.zzb().put("request_id", "-1");
                this.zzb.zzf(this.zza.zzb());
                return;
            }
            zzbxu zzbxuVar = zzaxVar.zzc;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && zzbxuVar != null && (bundle = zzbxuVar.zzm) != null) {
                bundle.putLong(zzdul.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
                zzd(bundle, zzdum.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(zzaxVar.zzb);
                this.zza.zzb().put("action", "sgs");
                Map mapZzb = this.zza.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjG)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error retrieving JSONObject from the requestJson, ", e);
                    }
                } else {
                    str = "na";
                }
                mapZzb.put("tpc", str);
                zzbxu zzbxuVar2 = zzaxVar.zzc;
                if (zzbxuVar2 != null) {
                    this.zza.zze(zzbxuVar2.zza);
                }
                this.zzb.zzf(this.zza.zzb());
            } catch (JSONException unused) {
                this.zza.zzb().put("action", "sgf");
                this.zza.zzb().put("sgf_reason", "request_invalid");
                this.zzb.zzf(this.zza.zzb());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhu
    public final void zzf(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhj)).booleanValue()) {
            this.zza.zzb().put("action", "sgf");
            this.zza.zzc("sgf_reason", str);
            this.zzb.zzf(this.zza.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        this.zza.zzb().put("action", "loaded");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue()) {
            this.zza.zza().putLong(zzdul.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
            zzd(this.zza.zza(), zzdum.zzb);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmB)).booleanValue()) {
            this.zza.zzb().put("mafe", true != WebViewFeature.isFeatureSupported("MUTE_AUDIO") ? "0" : "1");
        }
        this.zzb.zzf(this.zza.zzb());
    }
}
