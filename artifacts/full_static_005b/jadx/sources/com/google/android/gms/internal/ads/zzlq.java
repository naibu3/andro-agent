package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzlq {
    public final zzvm zza;
    public final Object zzb;
    public boolean zzd;
    public boolean zze;
    public zzlr zzf;
    public boolean zzg;
    private final zzmp[] zzi;
    private final zzzm zzj;
    private final zzmf zzk;
    private zzlq zzl;
    private zzzn zzn;
    private long zzo;
    private zzxr zzm = zzxr.zza;
    public final zzxf[] zzc = new zzxf[2];
    private final boolean[] zzh = new boolean[2];

    public zzlq(zzmp[] zzmpVarArr, long j, zzzm zzzmVar, zzzv zzzvVar, zzmf zzmfVar, zzlr zzlrVar, zzzn zzznVar) {
        this.zzi = zzmpVarArr;
        this.zzo = j;
        this.zzj = zzzmVar;
        this.zzk = zzmfVar;
        this.zzb = zzlrVar.zza.zza;
        this.zzf = zzlrVar;
        this.zzn = zzznVar;
        zzvo zzvoVar = zzlrVar.zza;
        long j2 = zzlrVar.zzb;
        long j3 = zzlrVar.zzd;
        zzvm zzvmVarZzp = zzmfVar.zzp(zzvoVar, zzzvVar, j2);
        this.zza = j3 != -9223372036854775807L ? new zzus(zzvmVarZzp, true, 0L, j3) : zzvmVarZzp;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzzn zzznVar = this.zzn;
            if (i >= zzznVar.zza) {
                return;
            }
            zzznVar.zzb(i);
            zzzg zzzgVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzzn zzznVar = this.zzn;
            if (i >= zzznVar.zza) {
                return;
            }
            zzznVar.zzb(i);
            zzzg zzzgVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzzn zzznVar, long j, boolean z) {
        return zzb(zzznVar, j, false, new boolean[2]);
    }

    public final long zzb(zzzn zzznVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzznVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzznVar.zza(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzmpVarArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzznVar;
        zzt();
        long jZzf = this.zza.zzf(zzznVar.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzmp[] zzmpVarArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzmpVarArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zzxf[] zzxfVarArr = this.zzc;
            if (i4 >= 2) {
                return jZzf;
            }
            if (zzxfVarArr[i4] != null) {
                zzeq.zzf(zzznVar.zzb(i4));
                this.zzi[i4].zzb();
                this.zze = true;
            } else {
                zzeq.zzf(zzznVar.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long jZzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzf.zze : jZzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzlq zzg() {
        return this.zzl;
    }

    public final zzxr zzh() {
        return this.zzm;
    }

    public final zzzn zzi() {
        return this.zzn;
    }

    public final zzzn zzj(float f, zzdc zzdcVar) throws zzjh {
        zzzn zzznVarZzp = this.zzj.zzp(this.zzi, this.zzm, this.zzf.zza, zzdcVar);
        for (zzzg zzzgVar : zzznVarZzp.zzc) {
        }
        return zzznVarZzp;
    }

    public final void zzk(long j, float f, long j2) {
        zzeq.zzf(zzu());
        long j3 = j - this.zzo;
        zzlm zzlmVar = new zzlm();
        zzlmVar.zze(j3);
        zzlmVar.zzf(f);
        zzlmVar.zzd(j2);
        this.zza.zzo(new zzlo(zzlmVar, null));
    }

    public final void zzl(float f, zzdc zzdcVar) throws zzjh {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzzn zzznVarZzj = zzj(f, zzdcVar);
        zzlr zzlrVar = this.zzf;
        long jMax = zzlrVar.zzb;
        long j = zzlrVar.zze;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jZza = zza(zzznVarZzj, jMax, false);
        long j2 = this.zzo;
        zzlr zzlrVar2 = this.zzf;
        this.zzo = j2 + (zzlrVar2.zzb - jZza);
        this.zzf = zzlrVar2.zzb(jZza);
    }

    public final void zzm(long j) {
        zzeq.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzvm zzvmVar = this.zza;
        try {
            boolean z = zzvmVar instanceof zzus;
            zzmf zzmfVar = this.zzk;
            if (z) {
                zzmfVar.zzi(((zzus) zzvmVar).zza);
            } else {
                zzmfVar.zzi(zzvmVar);
            }
        } catch (RuntimeException e) {
            zzfk.zzd("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzlq zzlqVar) {
        if (zzlqVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzlqVar;
        zzt();
    }

    public final void zzp(long j) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzvm zzvmVar = this.zza;
        if (zzvmVar instanceof zzus) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzus) zzvmVar).zzn(0L, j);
        }
    }

    public final boolean zzr() {
        if (this.zzd) {
            return !this.zze || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }
}
