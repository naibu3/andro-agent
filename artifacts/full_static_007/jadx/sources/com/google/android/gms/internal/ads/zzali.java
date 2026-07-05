package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
abstract class zzali {
    private zzafa zzb;
    private zzadx zzc;
    private zzald zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzalb zza = new zzalb();
    private zzalf zzj = new zzalf();

    protected abstract long zza(zzfu zzfuVar);

    protected void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzalf();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzfu zzfuVar, long j, zzalf zzalfVar) throws IOException;

    final int zze(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        zzeq.zzb(this.zzb);
        int i = zzgd.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzadvVar)) {
                long jZzf = zzadvVar.zzf();
                long j = this.zzf;
                this.zzk = jZzf - j;
                if (zzc(this.zza.zza(), j, this.zzj)) {
                    this.zzf = zzadvVar.zzf();
                } else {
                    zzan zzanVar = this.zzj.zza;
                    this.zzi = zzanVar.zzB;
                    if (!this.zzm) {
                        this.zzb.zzl(zzanVar);
                        this.zzm = true;
                    }
                    zzald zzaldVar = this.zzj.zzb;
                    if (zzaldVar != null) {
                        this.zzd = zzaldVar;
                    } else if (zzadvVar.zzd() == -1) {
                        this.zzd = new zzalh(null);
                    } else {
                        zzalc zzalcVarZzb = this.zza.zzb();
                        this.zzd = new zzakw(this, this.zzf, zzadvVar.zzd(), zzalcVarZzb.zzd + zzalcVarZzb.zze, zzalcVarZzb.zzb, (zzalcVarZzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                }
            }
            this.zzh = 3;
            return -1;
        }
        if (i2 == 1) {
            ((zzadi) zzadvVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        }
        if (i2 != 2) {
            return -1;
        }
        long jZzd = this.zzd.zzd(zzadvVar);
        if (jZzd >= 0) {
            zzaeqVar.zza = jZzd;
            return 1;
        }
        if (jZzd < -1) {
            zzi(-(jZzd + 2));
        }
        if (!this.zzl) {
            zzaet zzaetVarZze = this.zzd.zze();
            zzeq.zzb(zzaetVarZze);
            this.zzc.zzO(zzaetVarZze);
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zze(zzadvVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzfu zzfuVarZza = this.zza.zza();
        long jZza = zza(zzfuVarZza);
        if (jZza >= 0) {
            long j2 = this.zzg;
            if (j2 + jZza >= this.zze) {
                long jZzf2 = zzf(j2);
                zzaey.zzb(this.zzb, zzfuVarZza, zzfuVarZza.zze());
                this.zzb.zzs(jZzf2, 1, zzfuVarZza.zze(), 0, null);
                this.zze = -1L;
            }
        }
        this.zzg += jZza;
        return 0;
    }

    protected final long zzf(long j) {
        return (j * 1000000) / this.zzi;
    }

    protected final long zzg(long j) {
        return (this.zzi * j) / 1000000;
    }

    final void zzh(zzadx zzadxVar, zzafa zzafaVar) {
        this.zzc = zzadxVar;
        this.zzb = zzafaVar;
        zzb(true);
    }

    protected void zzi(long j) {
        this.zzg = j;
    }

    final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            this.zze = zzg(j2);
            zzald zzaldVar = this.zzd;
            int i = zzgd.zza;
            zzaldVar.zzg(this.zze);
            this.zzh = 2;
        }
    }
}
