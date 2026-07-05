package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzt {
    public static final zzt zza;
    public static final zzt zzb;

    @Deprecated
    public static final zzn zzc;
    private static final String zzj;
    private static final String zzk;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    private static final String zzo;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final byte[] zzg;
    public final int zzh;
    public final int zzi;
    private int zzp;

    static {
        zzr zzrVar = new zzr();
        zzrVar.zzc(1);
        zzrVar.zzb(2);
        zzrVar.zzd(3);
        zza = zzrVar.zzg();
        zzr zzrVar2 = new zzr();
        zzrVar2.zzc(1);
        zzrVar2.zzb(1);
        zzrVar2.zzd(2);
        zzb = zzrVar2.zzg();
        zzj = Integer.toString(0, 36);
        zzk = Integer.toString(1, 36);
        zzl = Integer.toString(2, 36);
        zzm = Integer.toString(3, 36);
        zzn = Integer.toString(4, 36);
        zzo = Integer.toString(5, 36);
        zzc = new zzn() { // from class: com.google.android.gms.internal.ads.zzp
        };
    }

    /* synthetic */ zzt(int i, int i2, int i3, byte[] bArr, int i4, int i5, zzs zzsVar) {
        this.zzd = i;
        this.zze = i2;
        this.zzf = i3;
        this.zzg = bArr;
        this.zzh = i4;
        this.zzi = i5;
    }

    @Pure
    public static int zza(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int zzb(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean zzg(zzt zztVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (zztVar == null) {
            return true;
        }
        int i5 = zztVar.zzd;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = zztVar.zze) == -1 || i == 2) && (((i2 = zztVar.zzf) == -1 || i2 == 3) && zztVar.zzg == null && (((i3 = zztVar.zzi) == -1 || i3 == 8) && ((i4 = zztVar.zzh) == -1 || i4 == 8)));
    }

    private static String zzh(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i;
    }

    private static String zzi(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i == 2) {
            return "BT601";
        }
        return "Undefined color space " + i;
    }

    private static String zzj(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzt zztVar = (zzt) obj;
            if (this.zzd == zztVar.zzd && this.zze == zztVar.zze && this.zzf == zztVar.zzf && Arrays.equals(this.zzg, zztVar.zzg) && this.zzh == zztVar.zzh && this.zzi == zztVar.zzi) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzp;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zzf) * 31) + Arrays.hashCode(this.zzg)) * 31) + this.zzh) * 31) + this.zzi;
        this.zzp = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i = this.zzh;
        int i2 = this.zzf;
        int i3 = this.zze;
        String strZzi = zzi(this.zzd);
        String strZzh = zzh(i3);
        String strZzj = zzj(i2);
        String str2 = "NA";
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        int i4 = this.zzi;
        if (i4 != -1) {
            str2 = i4 + "bit Chroma";
        }
        return "ColorInfo(" + strZzi + ", " + strZzh + ", " + strZzj + ", " + (this.zzg != null) + ", " + str + ", " + str2 + ")";
    }

    public final zzr zzc() {
        return new zzr(this, null);
    }

    public final String zzd() {
        String str;
        String str2;
        if (zzf()) {
            str = String.format(Locale.US, "%s/%s/%s", zzi(this.zzd), zzh(this.zze), zzj(this.zzf));
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            str2 = this.zzh + "/" + this.zzi;
        } else {
            str2 = "NA/NA";
        }
        return str + "/" + str2;
    }

    public final boolean zze() {
        return (this.zzh == -1 || this.zzi == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzd == -1 || this.zze == -1 || this.zzf == -1) ? false : true;
    }
}
