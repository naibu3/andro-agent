package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzde {
    public final int zzb;
    public final String zzc;
    public final int zzd;
    private final zzan[] zzg;
    private int zzh;
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzdd
    };

    public zzde(String str, zzan... zzanVarArr) {
        int length = zzanVarArr.length;
        int i = 1;
        zzeq.zzd(length > 0);
        this.zzc = str;
        this.zzg = zzanVarArr;
        this.zzb = length;
        int iZzb = zzcg.zzb(zzanVarArr[0].zzn);
        this.zzd = iZzb == -1 ? zzcg.zzb(zzanVarArr[0].zzm) : iZzb;
        String strZzc = zzc(zzanVarArr[0].zze);
        int i2 = zzanVarArr[0].zzg | 16384;
        while (true) {
            zzan[] zzanVarArr2 = this.zzg;
            if (i >= zzanVarArr2.length) {
                return;
            }
            if (!strZzc.equals(zzc(zzanVarArr2[i].zze))) {
                zzan[] zzanVarArr3 = this.zzg;
                zzd("languages", zzanVarArr3[0].zze, zzanVarArr3[i].zze, i);
                return;
            } else {
                zzan[] zzanVarArr4 = this.zzg;
                if (i2 != (zzanVarArr4[i].zzg | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzanVarArr4[0].zzg), Integer.toBinaryString(this.zzg[i].zzg), i);
                    return;
                }
                i++;
            }
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zzd(String str, String str2, String str3, int i) {
        zzfk.zzd("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzde zzdeVar = (zzde) obj;
            if (this.zzc.equals(zzdeVar.zzc) && Arrays.equals(this.zzg, zzdeVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.zzc.hashCode() + 527) * 31) + Arrays.hashCode(this.zzg);
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final int zza(zzan zzanVar) {
        int i = 0;
        while (true) {
            zzan[] zzanVarArr = this.zzg;
            if (i >= zzanVarArr.length) {
                return -1;
            }
            if (zzanVar == zzanVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final zzan zzb(int i) {
        return this.zzg[i];
    }
}
