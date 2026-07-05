package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzajk {
    public final zzaen zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzajk(zzaen zzaenVar, long j, long j2, long[] jArr, int i, int i2) {
        this.zza = zzaenVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i2;
    }

    public static zzajk zza(zzaen zzaenVar, zzfu zzfuVar) {
        long[] jArr;
        int i;
        int i2;
        int iZzg = zzfuVar.zzg();
        int iZzp = (iZzg & 1) != 0 ? zzfuVar.zzp() : -1;
        long jZzu = (iZzg & 2) != 0 ? zzfuVar.zzu() : -1L;
        if ((iZzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = zzfuVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZzg & 8) != 0) {
            zzfuVar.zzL(4);
        }
        if (zzfuVar.zzb() >= 24) {
            zzfuVar.zzL(21);
            int iZzo = zzfuVar.zzo();
            i2 = iZzo & 4095;
            i = iZzo >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzajk(zzaenVar, iZzp, jZzu, jArr, i, i2);
    }
}
