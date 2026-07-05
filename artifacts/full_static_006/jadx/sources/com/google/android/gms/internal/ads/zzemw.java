package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzemw implements zzdau {
    boolean zza = false;
    final /* synthetic */ zzeho zzb;
    final /* synthetic */ zzccn zzc;
    final /* synthetic */ zzemx zzd;

    zzemw(zzemx zzemxVar, zzeho zzehoVar, zzccn zzccnVar) {
        this.zzb = zzehoVar;
        this.zzc = zzccnVar;
        this.zzd = zzemxVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfA)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzehp(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzemx.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final synchronized void zzc(int i, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzemx.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
