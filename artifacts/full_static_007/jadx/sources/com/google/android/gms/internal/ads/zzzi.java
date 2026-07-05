package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzzi {
    private final String[] zza;
    private final int[] zzb;
    private final zzxr[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zzxr zzf;

    zzzi(String[] strArr, int[] iArr, zzxr[] zzxrVarArr, int[] iArr2, int[][][] iArr3, zzxr zzxrVar) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = zzxrVarArr;
        this.zze = iArr3;
        this.zzd = iArr2;
        this.zzf = zzxrVar;
    }

    public final int zza(int i, int i2, boolean z) {
        int i3 = this.zzc[i].zzb(i2).zzb;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if ((this.zze[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        int i7 = 0;
        int iMin = 16;
        boolean z2 = false;
        while (i4 < iArrCopyOf.length) {
            String str2 = this.zzc[i].zzb(i2).zzb(iArrCopyOf[i4]).zzn;
            int i8 = i7 + 1;
            if (i7 == 0) {
                str = str2;
            } else {
                z2 |= !zzgd.zzG(str, str2);
            }
            iMin = Math.min(iMin, this.zze[i][i2][i4] & 24);
            i4++;
            i7 = i8;
        }
        return z2 ? Math.min(iMin, this.zzd[i]) : iMin;
    }

    public final int zzb(int i, int i2, int i3) {
        return this.zze[i][i2][i3];
    }

    public final int zzc(int i) {
        return this.zzb[i];
    }

    public final zzxr zzd(int i) {
        return this.zzc[i];
    }

    public final zzxr zze() {
        return this.zzf;
    }
}
