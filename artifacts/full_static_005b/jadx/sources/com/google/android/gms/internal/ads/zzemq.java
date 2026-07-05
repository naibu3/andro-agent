package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzemq implements zzehn {
    private final zzenu zza;
    private final zzdst zzb;

    zzemq(zzenu zzenuVar, zzdst zzdstVar) {
        this.zza = zzenuVar;
        this.zzb = zzdstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehn
    public final zzeho zza(String str, JSONObject jSONObject) throws zzfhv {
        zzbte zzbteVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbF)).booleanValue()) {
            try {
                zzbteVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Coundn't create RTB adapter: ", e);
                zzbteVarZzb = null;
            }
        } else {
            zzbteVarZzb = this.zza.zza(str);
        }
        if (zzbteVarZzb == null) {
            return null;
        }
        return new zzeho(zzbteVarZzb, new zzejh(), str);
    }
}
