package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdo {
    public final int zzb;
    private final zzde zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final boolean[] zzj;
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(3, 36);
    private static final String zzf = Integer.toString(4, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzdn
    };

    public zzdo(zzde zzdeVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzdeVar.zzb;
        this.zzb = i;
        zzeq.zzd(i == iArr.length && i == zArr.length);
        this.zzg = zzdeVar;
        this.zzh = z && i > 1;
        this.zzi = (int[]) iArr.clone();
        this.zzj = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzdo zzdoVar = (zzdo) obj;
            if (this.zzh == zzdoVar.zzh && this.zzg.equals(zzdoVar.zzg) && Arrays.equals(this.zzi, zzdoVar.zzi) && Arrays.equals(this.zzj, zzdoVar.zzj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzg.hashCode() * 31) + (this.zzh ? 1 : 0)) * 31) + Arrays.hashCode(this.zzi)) * 31) + Arrays.hashCode(this.zzj);
    }

    public final int zza() {
        return this.zzg.zzd;
    }

    public final zzan zzb(int i) {
        return this.zzg.zzb(i);
    }

    public final boolean zzc() {
        for (boolean z : this.zzj) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i) {
        return this.zzj[i];
    }
}
