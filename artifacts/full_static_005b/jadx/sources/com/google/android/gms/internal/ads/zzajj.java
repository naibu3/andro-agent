package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzajj implements zzaji {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzajj(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
    }

    public static zzajj zzb(long j, long j2, zzaen zzaenVar, zzfu zzfuVar) {
        int iZzm;
        zzfuVar.zzL(10);
        int iZzg = zzfuVar.zzg();
        if (iZzg <= 0) {
            return null;
        }
        int i = zzaenVar.zzd;
        long jZzt = zzgd.zzt(iZzg, (i >= 32000 ? 1152 : 576) * 1000000, i, RoundingMode.FLOOR);
        int iZzq = zzfuVar.zzq();
        int iZzq2 = zzfuVar.zzq();
        int iZzq3 = zzfuVar.zzq();
        zzfuVar.zzL(2);
        long j3 = j2 + zzaenVar.zzc;
        long[] jArr = new long[iZzq];
        long[] jArr2 = new long[iZzq];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iZzq) {
            long j5 = jZzt;
            jArr[i2] = (i2 * jZzt) / iZzq;
            jArr2[i2] = Math.max(j4, j3);
            if (iZzq3 == 1) {
                iZzm = zzfuVar.zzm();
            } else if (iZzq3 == 2) {
                iZzm = zzfuVar.zzq();
            } else if (iZzq3 == 3) {
                iZzm = zzfuVar.zzo();
            } else {
                if (iZzq3 != 4) {
                    return null;
                }
                iZzm = zzfuVar.zzp();
            }
            j4 += iZzm * iZzq2;
            i2++;
            jZzt = j5;
        }
        long j6 = jZzt;
        if (j != -1 && j != j4) {
            zzfk.zzf("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new zzajj(jArr, jArr2, j6, j4, zzaenVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final long zze(long j) {
        return this.zza[zzgd.zzc(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j) {
        long[] jArr = this.zza;
        int iZzc = zzgd.zzc(jArr, j, true, true);
        zzaeu zzaeuVar = new zzaeu(jArr[iZzc], this.zzb[iZzc]);
        if (zzaeuVar.zzb < j) {
            long[] jArr2 = this.zza;
            if (iZzc != jArr2.length - 1) {
                int i = iZzc + 1;
                return new zzaer(zzaeuVar, new zzaeu(jArr2[i], this.zzb[i]));
            }
        }
        return new zzaer(zzaeuVar, zzaeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
