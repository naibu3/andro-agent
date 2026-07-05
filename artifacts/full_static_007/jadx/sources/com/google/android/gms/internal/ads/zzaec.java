package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaec {
    public static int zza(zzfu zzfuVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzfuVar.zzm() + 1;
            case 7:
                return zzfuVar.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzadv zzadvVar, zzaeg zzaegVar) throws IOException {
        zzadvVar.zzj();
        zzadi zzadiVar = (zzadi) zzadvVar;
        zzadiVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzadiVar.zzm(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzadiVar.zzl(2, false);
        int i2 = 1 != i ? 6 : 7;
        zzfu zzfuVar = new zzfu(i2);
        zzfuVar.zzJ(zzady.zza(zzadvVar, zzfuVar.zzM(), 0, i2));
        zzadvVar.zzj();
        zzaeb zzaebVar = new zzaeb();
        if (zzd(zzfuVar, zzaegVar, z, zzaebVar)) {
            return zzaebVar.zza;
        }
        throw zzch.zza(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzc(zzfu zzfuVar, zzaeg zzaegVar, int i, zzaeb zzaebVar) {
        int iZza;
        int iZzd = zzfuVar.zzd();
        long jZzu = zzfuVar.zzu();
        long j = jZzu >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = jZzu >> 12;
        long j3 = jZzu >> 8;
        long j4 = jZzu >> 4;
        long j5 = jZzu >> 1;
        long j6 = jZzu & 1;
        int i2 = (int) (j4 & 15);
        if (i2 > 7 ? !(i2 > 10 || zzaegVar.zzg != 2) : i2 == zzaegVar.zzg - 1) {
            int i3 = (int) (j5 & 7);
            if ((i3 == 0 || i3 == zzaegVar.zzi) && j6 != 1 && zzd(zzfuVar, zzaegVar, z, zzaebVar) && (iZza = zza(zzfuVar, (int) (j2 & 15))) != -1 && iZza <= zzaegVar.zzb) {
                int i4 = zzaegVar.zze;
                int i5 = (int) (j3 & 15);
                if (i5 != 0) {
                    if (i5 <= 11) {
                        if (i5 == zzaegVar.zzf) {
                            if (zzfuVar.zzm() == zzgd.zzf(zzfuVar.zzM(), iZzd, zzfuVar.zzd() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i5 == 12) {
                        if (zzfuVar.zzm() * 1000 == i4) {
                        }
                    } else if (i5 <= 14) {
                        int iZzq = zzfuVar.zzq();
                        if (i5 == 14) {
                            iZzq *= 10;
                        }
                        if (iZzq == i4) {
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean zzd(zzfu zzfuVar, zzaeg zzaegVar, boolean z, zzaeb zzaebVar) {
        try {
            long jZzw = zzfuVar.zzw();
            if (!z) {
                jZzw *= zzaegVar.zzb;
            }
            zzaebVar.zza = jZzw;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
