package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzadr {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(byte[] bArr) {
        zzft zzftVarZzg = zzg(bArr);
        zzftVarZzg.zzm(42);
        return zzftVarZzg.zzd(true != zzftVarZzg.zzo() ? 8 : 12) + 1;
    }

    public static int zzb(byte[] bArr) {
        zzft zzftVarZzg = zzg(bArr);
        zzftVarZzg.zzm(32);
        return zzf(zzftVarZzg, zzj, true) + 1;
    }

    public static zzan zzc(byte[] bArr, String str, String str2, int i, zzae zzaeVar) {
        zzft zzftVarZzg = zzg(bArr);
        zzftVarZzg.zzm(60);
        int i2 = zzb[zzftVarZzg.zzd(6)];
        int i3 = zzc[zzftVarZzg.zzd(4)];
        int iZzd = zzftVarZzg.zzd(5);
        int i4 = iZzd >= 29 ? -1 : (zzd[iZzd] * 1000) / 2;
        zzftVarZzg.zzm(10);
        int i5 = i2 + (zzftVarZzg.zzd(2) > 0 ? 1 : 0);
        zzal zzalVar = new zzal();
        zzalVar.zzK(str);
        zzalVar.zzX("audio/vnd.dts");
        zzalVar.zzx(i4);
        zzalVar.zzy(i5);
        zzalVar.zzY(i3);
        zzalVar.zzE(null);
        zzalVar.zzO(str2);
        zzalVar.zzV(i);
        return zzalVar.zzad();
    }

    public static zzadq zzd(byte[] bArr) throws zzch {
        int iZzd;
        int i;
        int iZzd2;
        long jZzt;
        int i2;
        zzft zzftVarZzg = zzg(bArr);
        zzftVarZzg.zzm(40);
        int iZzd3 = zzftVarZzg.zzd(2);
        boolean zZzo = zzftVarZzg.zzo();
        int i3 = true != zZzo ? 16 : 20;
        zzftVarZzg.zzm(true != zZzo ? 8 : 12);
        int iZzd4 = zzftVarZzg.zzd(i3) + 1;
        boolean zZzo2 = zzftVarZzg.zzo();
        int i4 = 0;
        if (zZzo2) {
            iZzd = zzftVarZzg.zzd(2);
            int iZzd5 = zzftVarZzg.zzd(3) + 1;
            if (zzftVarZzg.zzo()) {
                zzftVarZzg.zzm(36);
            }
            int iZzd6 = zzftVarZzg.zzd(3) + 1;
            int iZzd7 = zzftVarZzg.zzd(3) + 1;
            if (iZzd6 != 1 || iZzd7 != 1) {
                throw zzch.zzc("Multiple audio presentations or assets not supported");
            }
            int i5 = iZzd3 + 1;
            int iZzd8 = zzftVarZzg.zzd(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                if (((iZzd8 >> i6) & 1) == 1) {
                    zzftVarZzg.zzm(8);
                }
            }
            int i7 = iZzd5 * 512;
            if (zzftVarZzg.zzo()) {
                zzftVarZzg.zzm(2);
                int iZzd9 = (zzftVarZzg.zzd(2) + 1) << 2;
                int iZzd10 = zzftVarZzg.zzd(2) + 1;
                while (i4 < iZzd10) {
                    zzftVarZzg.zzm(iZzd9);
                    i4++;
                }
            }
            i4 = i7;
        } else {
            iZzd = -1;
        }
        zzftVarZzg.zzm(i3);
        zzftVarZzg.zzm(12);
        if (zZzo2) {
            if (zzftVarZzg.zzo()) {
                zzftVarZzg.zzm(4);
            }
            if (zzftVarZzg.zzo()) {
                zzftVarZzg.zzm(24);
            }
            if (zzftVarZzg.zzo()) {
                zzftVarZzg.zzn(zzftVarZzg.zzd(10) + 1);
            }
            zzftVarZzg.zzm(5);
            int i8 = zze[zzftVarZzg.zzd(4)];
            iZzd2 = zzftVarZzg.zzd(8) + 1;
            i = i8;
        } else {
            i = -2147483647;
            iZzd2 = -1;
        }
        if (zZzo2) {
            if (iZzd == 0) {
                i2 = 32000;
            } else if (iZzd == 1) {
                i2 = 44100;
            } else {
                if (iZzd != 2) {
                    throw zzch.zza("Unsupported reference clock code in DTS HD header: " + iZzd, null);
                }
                i2 = 48000;
            }
            jZzt = zzgd.zzt(i4, 1000000L, i2, RoundingMode.FLOOR);
        } else {
            jZzt = -9223372036854775807L;
        }
        return new zzadq("audio/vnd.dts.hd;profile=lbr", iZzd2, i, iZzd4, jZzt, 0, null);
    }

    public static zzadq zze(byte[] bArr, AtomicInteger atomicInteger) throws zzch {
        long jZzt;
        int iZzd;
        int i;
        int i2;
        zzft zzftVarZzg = zzg(bArr);
        int iZzd2 = zzftVarZzg.zzd(32);
        int iZzf = zzf(zzftVarZzg, zzf, true);
        int i3 = iZzf + 1;
        char c = iZzd2 == 1078008818 ? (char) 1 : (char) 0;
        if (c == 0) {
            jZzt = -9223372036854775807L;
            iZzd = -2147483647;
        } else {
            if (!zzftVarZzg.zzo()) {
                throw zzch.zzc("Only supports full channel mask-based audio presentation");
            }
            int i4 = iZzf - 1;
            if (((bArr[iZzf] & 255) | ((char) (bArr[i4] << 8))) != zzgd.zzd(bArr, 0, i4, SupportMenu.USER_MASK)) {
                throw zzch.zza("CRC check failed", null);
            }
            int iZzd3 = zzftVarZzg.zzd(2);
            if (iZzd3 == 0) {
                i = 512;
            } else if (iZzd3 == 1) {
                i = 480;
            } else {
                if (iZzd3 != 2) {
                    throw zzch.zza("Unsupported base duration index in DTS UHD header: " + iZzd3, null);
                }
                i = 384;
            }
            int iZzd4 = zzftVarZzg.zzd(3) + 1;
            int iZzd5 = zzftVarZzg.zzd(2);
            if (iZzd5 == 0) {
                i2 = 32000;
            } else if (iZzd5 == 1) {
                i2 = 44100;
            } else {
                if (iZzd5 != 2) {
                    throw zzch.zza("Unsupported clock rate index in DTS UHD header: " + iZzd5, null);
                }
                i2 = 48000;
            }
            if (zzftVarZzg.zzo()) {
                zzftVarZzg.zzm(36);
            }
            iZzd = (1 << zzftVarZzg.zzd(2)) * i2;
            jZzt = zzgd.zzt(i * iZzd4, 1000000L, i2, RoundingMode.FLOOR);
        }
        int i5 = iZzd;
        long j = jZzt;
        int iZzf2 = 0;
        for (char c2 = 0; c2 < c; c2 = 1) {
            iZzf2 += zzf(zzftVarZzg, zzg, true);
        }
        for (int i6 = 0; i6 <= 0; i6++) {
            if (c != 0) {
                atomicInteger.set(zzf(zzftVarZzg, zzh, true));
            }
            iZzf2 += atomicInteger.get() != 0 ? zzf(zzftVarZzg, zzi, true) : 0;
        }
        return new zzadq("audio/vnd.dts.uhd;profile=p2", 2, i5, i3 + iZzf2, j, 0, null);
    }

    private static int zzf(zzft zzftVar, int[] iArr, boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && zzftVar.zzo(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return i3 + zzftVar.zzd(iArr[i]);
    }

    private static zzft zzg(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new zzft(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b3 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b3;
            }
        }
        int length = bArrCopyOf.length;
        zzft zzftVar = new zzft(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzft zzftVar2 = new zzft(bArrCopyOf, length);
            while (zzftVar2.zza() >= 16) {
                zzftVar2.zzm(2);
                zzftVar.zzf(zzftVar2.zzd(14), 14);
            }
        }
        zzftVar.zzj(bArrCopyOf, bArrCopyOf.length);
        return zzftVar;
    }
}
