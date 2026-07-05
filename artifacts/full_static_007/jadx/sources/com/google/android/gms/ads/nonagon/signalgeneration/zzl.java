package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdhu;
import com.google.android.gms.internal.ads.zzdux;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
public final class zzl implements zzdhu {
    private final zzdux zza;
    private final zzk zzb;
    private final String zzc;

    public zzl(zzdux zzduxVar, zzk zzkVar, String str) {
        this.zza = zzduxVar;
        this.zzb = zzkVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdhu
    public final void zze(zzax zzaxVar) {
        if (zzaxVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhg)).booleanValue()) {
                this.zzb.zzd(this.zzc, zzaxVar.zzb, this.zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhu
    public final void zzf(String str) {
    }
}
