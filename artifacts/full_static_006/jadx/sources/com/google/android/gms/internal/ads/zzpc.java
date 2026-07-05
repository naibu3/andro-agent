package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzpc {
    final /* synthetic */ zzpd zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzvo zze;
    private boolean zzf;
    private boolean zzg;

    public zzpc(zzpd zzpdVar, String str, int i, zzvo zzvoVar) {
        this.zza = zzpdVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzvoVar == null ? -1L : zzvoVar.zzd;
        if (zzvoVar == null || !zzvoVar.zzb()) {
            return;
        }
        this.zze = zzvoVar;
    }

    public final void zzg(int i, zzvo zzvoVar) {
        if (this.zzd == -1 && i == this.zzc && zzvoVar != null) {
            zzpd zzpdVar = this.zza;
            long j = zzvoVar.zzd;
            if (j >= zzpdVar.zzl()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i, zzvo zzvoVar) {
        if (zzvoVar == null) {
            return i == this.zzc;
        }
        zzvo zzvoVar2 = this.zze;
        return zzvoVar2 == null ? !zzvoVar.zzb() && zzvoVar.zzd == this.zzd : zzvoVar.zzd == zzvoVar2.zzd && zzvoVar.zzb == zzvoVar2.zzb && zzvoVar.zzc == zzvoVar2.zzc;
    }

    public final boolean zzk(zzmy zzmyVar) {
        zzvo zzvoVar = zzmyVar.zzd;
        if (zzvoVar == null) {
            return this.zzc != zzmyVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzvoVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzdc zzdcVar = zzmyVar.zzb;
        int iZza = zzdcVar.zza(zzvoVar.zza);
        int iZza2 = zzdcVar.zza(this.zze.zza);
        zzvo zzvoVar2 = zzmyVar.zzd;
        if (zzvoVar2.zzd < this.zze.zzd || iZza < iZza2) {
            return false;
        }
        if (iZza > iZza2) {
            return true;
        }
        if (!zzvoVar2.zzb()) {
            int i = zzmyVar.zzd.zze;
            return i == -1 || i > this.zze.zzb;
        }
        zzvo zzvoVar3 = zzmyVar.zzd;
        int i2 = zzvoVar3.zzb;
        int i3 = zzvoVar3.zzc;
        zzvo zzvoVar4 = this.zze;
        int i4 = zzvoVar4.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzvoVar4.zzc;
        }
        return true;
    }

    public final boolean zzl(zzdc zzdcVar, zzdc zzdcVar2) {
        int i = this.zzc;
        if (i < zzdcVar.zzc()) {
            zzdcVar.zze(i, this.zza.zzc, 0L);
            for (int i2 = this.zza.zzc.zzp; i2 <= this.zza.zzc.zzq; i2++) {
                int iZza = zzdcVar2.zza(zzdcVar.zzf(i2));
                if (iZza != -1) {
                    i = zzdcVar2.zzd(iZza, this.zza.zzd, false).zzd;
                    break;
                }
            }
            i = -1;
        } else if (i >= zzdcVar2.zzc()) {
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzvo zzvoVar = this.zze;
        return zzvoVar == null || zzdcVar2.zza(zzvoVar.zza) != -1;
    }
}
