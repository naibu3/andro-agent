package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzus implements zzvm, zzvl {
    public final zzvm zza;
    long zzb;
    private zzvl zzc;
    private zzur[] zzd = new zzur[0];
    private long zze = 0;

    public zzus(zzvm zzvmVar, boolean z, long j, long j2) {
        this.zza = zzvmVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zza(long j, zzmr zzmrVar) {
        if (j == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(zzmrVar.zzf, j));
        long j2 = zzmrVar.zzg;
        long j3 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j2, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j));
        if (jMax != zzmrVar.zzf || jMax2 != zzmrVar.zzg) {
            zzmrVar = new zzmr(jMax, jMax2);
        }
        return this.zza.zza(j, zzmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzb < j) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzc < j) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j;
        }
        long jZzd2 = this.zza.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        zzeq.zzf(jZzd2 >= 0);
        long j2 = this.zzb;
        zzeq.zzf(j2 == Long.MIN_VALUE || jZzd2 <= j2);
        return jZzd2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // com.google.android.gms.internal.ads.zzvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zze(long j) {
        this.zze = -9223372036854775807L;
        boolean z = false;
        for (zzur zzurVar : this.zzd) {
            if (zzurVar != null) {
                zzurVar.zzc();
            }
        }
        long jZze = this.zza.zze(j);
        if (jZze == j) {
            z = true;
        } else if (jZze >= 0) {
            long j2 = this.zzb;
            if (j2 == Long.MIN_VALUE || jZze <= j2) {
            }
        }
        zzeq.zzf(z);
        return jZze;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    @Override // com.google.android.gms.internal.ads.zzvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzf(zzzg[] zzzgVarArr, boolean[] zArr, zzxf[] zzxfVarArr, boolean[] zArr2, long j) {
        int length = zzxfVarArr.length;
        this.zzd = new zzur[length];
        zzxf[] zzxfVarArr2 = new zzxf[length];
        int i = 0;
        while (true) {
            zzxf zzxfVar = null;
            if (i >= zzxfVarArr.length) {
                break;
            }
            zzur[] zzurVarArr = this.zzd;
            zzur zzurVar = (zzur) zzxfVarArr[i];
            zzurVarArr[i] = zzurVar;
            if (zzurVar != null) {
                zzxfVar = zzurVar.zza;
            }
            zzxfVarArr2[i] = zzxfVar;
            i++;
        }
        long jZzf = this.zza.zzf(zzzgVarArr, zArr, zzxfVarArr2, zArr2, j);
        long j2 = (zzq() && j == 0) ? 0L : j;
        this.zze = -9223372036854775807L;
        boolean z = true;
        if (jZzf != j2) {
            if (jZzf >= 0) {
                long j3 = this.zzb;
                if (j3 != Long.MIN_VALUE && jZzf > j3) {
                    z = false;
                }
            }
        }
        zzeq.zzf(z);
        for (int i2 = 0; i2 < zzxfVarArr.length; i2++) {
            zzxf zzxfVar2 = zzxfVarArr2[i2];
            if (zzxfVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzur[] zzurVarArr2 = this.zzd;
                zzur zzurVar2 = zzurVarArr2[i2];
                if (zzurVar2 == null || zzurVar2.zza != zzxfVar2) {
                    zzurVarArr2[i2] = new zzur(this, zzxfVar2);
                }
            }
            zzxfVarArr[i2] = this.zzd[i2];
        }
        return jZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final /* bridge */ /* synthetic */ void zzg(zzxh zzxhVar) {
        zzvl zzvlVar = this.zzc;
        zzvlVar.getClass();
        zzvlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final zzxr zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl(zzvl zzvlVar, long j) {
        this.zzc = zzvlVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        return this.zza.zzo(zzloVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        return this.zza.zzp();
    }

    final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzi(zzvm zzvmVar) {
        zzvl zzvlVar = this.zzc;
        zzvlVar.getClass();
        zzvlVar.zzi(this);
    }
}
