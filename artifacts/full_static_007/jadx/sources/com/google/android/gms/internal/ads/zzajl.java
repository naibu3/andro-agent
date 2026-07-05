package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzajl implements zzaji {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzajl(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = i2;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1L;
    }

    public static zzajl zzb(long j, zzajk zzajkVar, long j2) {
        long j3 = zzajkVar.zzb;
        if (j3 == -1) {
            j3 = -1;
        }
        long jZzs = zzgd.zzs((j3 * r7.zzg) - 1, zzajkVar.zza.zzd);
        long j4 = zzajkVar.zzc;
        if (j4 == -1 || zzajkVar.zzf == null) {
            zzaen zzaenVar = zzajkVar.zza;
            return new zzajl(j2, zzaenVar.zzc, jZzs, zzaenVar.zzf, -1L, null);
        }
        if (j != -1) {
            long j5 = j2 + j4;
            if (j != j5) {
                zzfk.zzf("XingSeeker", "XING data size mismatch: " + j + ", " + j5);
            }
        }
        zzaen zzaenVar2 = zzajkVar.zza;
        return new zzajl(j2, zzaenVar2.zzc, jZzs, zzaenVar2.zzf, zzajkVar.zzc, zzajkVar.zzf);
    }

    private final long zzf(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final long zze(long j) {
        if (!zzh()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        zzeq.zzb(jArr);
        double d = (j2 * 256.0d) / this.zze;
        int iZzc = zzgd.zzc(jArr, (long) d, true, true);
        long jZzf = zzf(iZzc);
        long j3 = jArr[iZzc];
        int i = iZzc + 1;
        long jZzf2 = zzf(i);
        return jZzf + Math.round((j3 == (iZzc == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (jZzf2 - jZzf));
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j) {
        if (!zzh()) {
            zzaeu zzaeuVar = new zzaeu(0L, this.zza + this.zzb);
            return new zzaer(zzaeuVar, zzaeuVar);
        }
        long jMax = Math.max(0L, Math.min(j, this.zzc));
        double d = (jMax * 100.0d) / this.zzc;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzg;
                zzeq.zzb(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j2 = this.zze;
        zzaeu zzaeuVar2 = new zzaeu(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j2), j2 - 1)));
        return new zzaer(zzaeuVar2, zzaeuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return this.zzg != null;
    }
}
