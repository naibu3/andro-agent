package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzmk extends zzvc {
    private final zzdb zzd;

    zzmk(zzml zzmlVar, zzdc zzdcVar) {
        super(zzdcVar);
        this.zzd = new zzdb();
    }

    @Override // com.google.android.gms.internal.ads.zzvc, com.google.android.gms.internal.ads.zzdc
    public final zzcz zzd(int i, zzcz zzczVar, boolean z) {
        zzcz zzczVarZzd = this.zzc.zzd(i, zzczVar, z);
        if (this.zzc.zze(zzczVarZzd.zzd, this.zzd, 0L).zzb()) {
            Object obj = zzczVar.zzb;
            Object obj2 = zzczVar.zzc;
            int i2 = zzczVar.zzd;
            long j = zzczVar.zze;
            long j2 = zzczVar.zzf;
            zzczVarZzd.zzl(obj, obj2, i2, j, 0L, zzd.zza, true);
        } else {
            zzczVarZzd.zzg = true;
        }
        return zzczVarZzd;
    }
}
