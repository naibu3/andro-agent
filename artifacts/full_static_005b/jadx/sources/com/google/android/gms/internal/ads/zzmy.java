package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzmy {
    public final long zza;
    public final zzdc zzb;
    public final int zzc;
    public final zzvo zzd;
    public final long zze;
    public final zzdc zzf;
    public final int zzg;
    public final zzvo zzh;
    public final long zzi;
    public final long zzj;

    public zzmy(long j, zzdc zzdcVar, int i, zzvo zzvoVar, long j2, zzdc zzdcVar2, int i2, zzvo zzvoVar2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzdcVar;
        this.zzc = i;
        this.zzd = zzvoVar;
        this.zze = j2;
        this.zzf = zzdcVar2;
        this.zzg = i2;
        this.zzh = zzvoVar2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmy zzmyVar = (zzmy) obj;
            if (this.zza == zzmyVar.zza && this.zzc == zzmyVar.zzc && this.zze == zzmyVar.zze && this.zzg == zzmyVar.zzg && this.zzi == zzmyVar.zzi && this.zzj == zzmyVar.zzj && zzfya.zza(this.zzb, zzmyVar.zzb) && zzfya.zza(this.zzd, zzmyVar.zzd) && zzfya.zza(this.zzf, zzmyVar.zzf) && zzfya.zza(this.zzh, zzmyVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
