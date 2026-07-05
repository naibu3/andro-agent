package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaks {
    public final zzakp zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzaks(zzakp zzakpVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzeq.zzd(length == length2);
        int length3 = jArr.length;
        zzeq.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzeq.zzd(length4 == length2);
        this.zza = zzakpVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j;
        this.zzb = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int zza(long j) {
        for (int iZzc = zzgd.zzc(this.zzf, j, true, false); iZzc >= 0; iZzc--) {
            if ((this.zzg[iZzc] & 1) != 0) {
                return iZzc;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        for (int iZza = zzgd.zza(this.zzf, j, true, false); iZza < this.zzf.length; iZza++) {
            if ((this.zzg[iZza] & 1) != 0) {
                return iZza;
            }
        }
        return -1;
    }
}
