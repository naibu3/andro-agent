package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzapt implements zzapu {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzadx zzc;
    private final zzafa zzd;
    private final zzapx zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfu zzh;
    private final int zzi;
    private final zzan zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzapt(zzadx zzadxVar, zzafa zzafaVar, zzapx zzapxVar) throws zzch {
        this.zzc = zzadxVar;
        this.zzd = zzafaVar;
        this.zze = zzapxVar;
        int iMax = Math.max(1, zzapxVar.zzc / 10);
        this.zzi = iMax;
        zzfu zzfuVar = new zzfu(zzapxVar.zzf);
        zzfuVar.zzk();
        int iZzk = zzfuVar.zzk();
        this.zzf = iZzk;
        int i = zzapxVar.zzb;
        int i2 = (((zzapxVar.zzd - (i * 4)) * 8) / (zzapxVar.zze * i)) + 1;
        if (iZzk != i2) {
            throw zzch.zza("Expected frames per block: " + i2 + "; got: " + iZzk, null);
        }
        int i3 = zzgd.zza;
        int i4 = ((iMax + iZzk) - 1) / iZzk;
        this.zzg = new byte[zzapxVar.zzd * i4];
        this.zzh = new zzfu(i4 * (iZzk + iZzk) * i);
        int i5 = ((zzapxVar.zzc * zzapxVar.zzd) * 8) / iZzk;
        zzal zzalVar = new zzal();
        zzalVar.zzX("audio/raw");
        zzalVar.zzx(i5);
        zzalVar.zzS(i5);
        zzalVar.zzP((iMax + iMax) * i);
        zzalVar.zzy(zzapxVar.zzb);
        zzalVar.zzY(zzapxVar.zzc);
        zzalVar.zzR(2);
        this.zzj = zzalVar.zzad();
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long jZzt = this.zzl + zzgd.zzt(this.zzn, 1000000L, this.zze.zzc, RoundingMode.FLOOR);
        int iZze = zze(i);
        this.zzd.zzs(jZzt, 1, iZze, this.zzm - iZze, null);
        this.zzn += i;
        this.zzm -= iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final void zza(int i, long j) {
        this.zzc.zzO(new zzaqa(this.zze, this.zzf, i, j));
        this.zzd.zzl(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzapu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzadv zzadvVar, long j) throws IOException {
        int iZzd;
        int iZzd2 = this.zzi - zzd(this.zzm);
        int i = zzgd.zza;
        int i2 = (((iZzd2 + r3) - 1) / this.zzf) * this.zze.zzd;
        boolean z = j == 0;
        while (!z) {
            if (this.zzk >= i2) {
                break;
            }
            int iZza = zzadvVar.zza(this.zzg, this.zzk, (int) Math.min(i2 - r8, j));
            if (iZza == -1) {
                while (!z) {
                }
            } else {
                this.zzk += iZza;
            }
        }
        int i3 = this.zzk / this.zze.zzd;
        if (i3 > 0) {
            byte[] bArr = this.zzg;
            zzfu zzfuVar = this.zzh;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = 0;
                while (true) {
                    zzapx zzapxVar = this.zze;
                    int i6 = zzapxVar.zzb;
                    if (i5 < i6) {
                        byte[] bArrZzM = zzfuVar.zzM();
                        int i7 = zzapxVar.zzd;
                        int i8 = i4 * i7;
                        int i9 = (i7 / i6) - 4;
                        int i10 = i8 + (i5 * 4);
                        int i11 = bArr[i10 + 1] & 255;
                        int i12 = bArr[i10] & 255;
                        int iMin = Math.min(bArr[i10 + 2] & 255, 88);
                        int i13 = zzb[iMin];
                        int i14 = (this.zzf * i4 * i6) + i5;
                        int iMax = (short) ((i11 << 8) | i12);
                        int i15 = i14 + i14;
                        bArrZzM[i15] = (byte) (iMax & 255);
                        bArrZzM[i15 + 1] = (byte) (iMax >> 8);
                        int i16 = 0;
                        while (i16 < i9 + i9) {
                            byte b = bArr[(i6 * 4) + i10 + ((i16 / 8) * i6 * 4) + ((i16 / 2) % 4)];
                            byte[] bArr2 = bArr;
                            int i17 = i16 % 2 == 0 ? b & Ascii.SI : (b & 255) >> 4;
                            int i18 = i17 & 7;
                            int i19 = (((i18 + i18) + 1) * i13) >> 3;
                            if ((i17 & 8) != 0) {
                                i19 = -i19;
                            }
                            iMax = Math.max(-32768, Math.min(iMax + i19, 32767));
                            int i20 = i15 + i6 + i6;
                            bArrZzM[i20] = (byte) (iMax & 255);
                            bArrZzM[i20 + 1] = (byte) (iMax >> 8);
                            iMin = Math.max(0, Math.min(iMin + zza[i17], 88));
                            i13 = zzb[iMin];
                            i16++;
                            i15 = i20;
                            bArr = bArr2;
                        }
                        i5++;
                    }
                }
            }
            int iZze = zze(this.zzf * i3);
            zzfuVar.zzK(0);
            zzfuVar.zzJ(iZze);
            this.zzk -= i3 * this.zze.zzd;
            zzfu zzfuVar2 = this.zzh;
            zzafa zzafaVar = this.zzd;
            int iZze2 = zzfuVar2.zze();
            zzaey.zzb(zzafaVar, zzfuVar2, iZze2);
            int i21 = this.zzm + iZze2;
            this.zzm = i21;
            int iZzd3 = zzd(i21);
            int i22 = this.zzi;
            if (iZzd3 >= i22) {
                zzf(i22);
            }
        }
        if (z && (iZzd = zzd(this.zzm)) > 0) {
            zzf(iZzd);
        }
        return z;
    }
}
