package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgr {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzeq.zzf(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zzf(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zzf(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zzf(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    zzf(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static zzgo zzc(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iZzb;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        zzgs zzgsVar = new zzgs(bArr, i, i2);
        int i11 = 4;
        zzgsVar.zze(4);
        int iZza = zzgsVar.zza(3);
        zzgsVar.zzd();
        int iZza2 = zzgsVar.zza(2);
        boolean zZzf = zzgsVar.zzf();
        int iZza3 = zzgsVar.zza(5);
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            if (zzgsVar.zzf()) {
                i12 |= 1 << i13;
            }
        }
        int i14 = 6;
        int[] iArr2 = new int[6];
        for (int i15 = 0; i15 < 6; i15++) {
            iArr2[i15] = zzgsVar.zza(8);
        }
        int iZza4 = zzgsVar.zza(8);
        int i16 = 0;
        for (int i17 = 0; i17 < iZza; i17++) {
            if (zzgsVar.zzf()) {
                i16 += 89;
            }
            if (zzgsVar.zzf()) {
                i16 += 8;
            }
        }
        zzgsVar.zze(i16);
        if (iZza > 0) {
            int i18 = 8 - iZza;
            zzgsVar.zze(i18 + i18);
        }
        int iZzc = zzgsVar.zzc();
        int iZzc2 = zzgsVar.zzc();
        if (iZzc2 == 3) {
            zzgsVar.zzd();
            iZzc2 = 3;
        }
        int iZzc3 = zzgsVar.zzc();
        int iZzc4 = zzgsVar.zzc();
        if (zzgsVar.zzf()) {
            int iZzc5 = zzgsVar.zzc();
            int iZzc6 = zzgsVar.zzc();
            int iZzc7 = zzgsVar.zzc();
            int iZzc8 = zzgsVar.zzc();
            if (iZzc2 == 1) {
                i10 = 2;
            } else if (iZzc2 == 2) {
                iZzc2 = 2;
                i10 = 2;
            } else {
                i10 = 1;
            }
            iZzc3 -= i10 * (iZzc5 + iZzc6);
            iZzc4 -= (iZzc2 == 1 ? 2 : 1) * (iZzc7 + iZzc8);
        }
        int i19 = iZzc3;
        int i20 = iZzc2;
        int i21 = iZzc4;
        int iZzc9 = zzgsVar.zzc();
        int iZzc10 = zzgsVar.zzc();
        int iZzc11 = zzgsVar.zzc();
        for (int i22 = true != zzgsVar.zzf() ? iZza : 0; i22 <= iZza; i22++) {
            zzgsVar.zzc();
            zzgsVar.zzc();
            zzgsVar.zzc();
        }
        zzgsVar.zzc();
        zzgsVar.zzc();
        zzgsVar.zzc();
        zzgsVar.zzc();
        zzgsVar.zzc();
        zzgsVar.zzc();
        if (zzgsVar.zzf() && zzgsVar.zzf()) {
            int i23 = 0;
            while (i23 < i11) {
                int i24 = 0;
                while (i24 < i14) {
                    if (zzgsVar.zzf()) {
                        int iMin = Math.min(64, 1 << ((i23 + i23) + 4));
                        if (i23 > 1) {
                            zzgsVar.zzb();
                        }
                        for (int i25 = 0; i25 < iMin; i25++) {
                            zzgsVar.zzb();
                        }
                    } else {
                        zzgsVar.zzc();
                    }
                    i24 += i23 == 3 ? 3 : 1;
                    i14 = 6;
                }
                i23++;
                i11 = 4;
                i14 = 6;
            }
        }
        zzgsVar.zze(2);
        if (zzgsVar.zzf()) {
            zzgsVar.zze(8);
            zzgsVar.zzc();
            zzgsVar.zzc();
            zzgsVar.zzd();
        }
        int iZzc12 = zzgsVar.zzc();
        int i26 = 0;
        int[] iArr3 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        while (i26 < iZzc12) {
            if (i26 == 0 || !zzgsVar.zzf()) {
                i6 = iZzc12;
                i7 = i12;
                i8 = i20;
                iArr = iArr2;
                int iZzc13 = zzgsVar.zzc();
                int iZzc14 = zzgsVar.zzc();
                int[] iArr4 = new int[iZzc13];
                int i30 = 0;
                while (i30 < iZzc13) {
                    iArr4[i30] = (i30 > 0 ? iArr4[i30 - 1] : 0) - (zzgsVar.zzc() + 1);
                    zzgsVar.zzd();
                    i30++;
                }
                int[] iArr5 = new int[iZzc14];
                int i31 = 0;
                while (i31 < iZzc14) {
                    iArr5[i31] = (i31 > 0 ? iArr5[i31 - 1] : 0) + zzgsVar.zzc() + 1;
                    zzgsVar.zzd();
                    i31++;
                }
                i29 = iZzc14;
                iArrCopyOf = iArr5;
                i28 = iZzc13;
                iArr3 = iArr4;
            } else {
                int i32 = i28 + i29;
                boolean zZzf2 = zzgsVar.zzf();
                int iZzc15 = zzgsVar.zzc() + 1;
                int i33 = 1 - ((zZzf2 ? 1 : 0) + (zZzf2 ? 1 : 0));
                int i34 = i32 + 1;
                i6 = iZzc12;
                boolean[] zArr = new boolean[i34];
                iArr = iArr2;
                for (int i35 = 0; i35 <= i32; i35++) {
                    if (zzgsVar.zzf()) {
                        zArr[i35] = true;
                    } else {
                        zArr[i35] = zzgsVar.zzf();
                    }
                }
                int i36 = i29 - 1;
                int[] iArr6 = new int[i34];
                int[] iArr7 = new int[i34];
                int i37 = 0;
                while (true) {
                    i9 = i33 * iZzc15;
                    if (i36 < 0) {
                        break;
                    }
                    int i38 = iArrCopyOf[i36] + i9;
                    if (i38 < 0 && zArr[i28 + i36]) {
                        iArr6[i37] = i38;
                        i37++;
                    }
                    i36--;
                }
                if (i9 < 0 && zArr[i32]) {
                    iArr6[i37] = i9;
                    i37++;
                }
                i7 = i12;
                i8 = i20;
                int i39 = i37;
                for (int i40 = 0; i40 < i28; i40++) {
                    int i41 = iArr3[i40] + i9;
                    if (i41 < 0 && zArr[i40]) {
                        iArr6[i39] = i41;
                        i39++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr6, i39);
                int i42 = 0;
                for (int i43 = i28 - 1; i43 >= 0; i43--) {
                    int i44 = iArr3[i43] + i9;
                    if (i44 > 0 && zArr[i43]) {
                        iArr7[i42] = i44;
                        i42++;
                    }
                }
                if (i9 > 0 && zArr[i32]) {
                    iArr7[i42] = i9;
                    i42++;
                }
                int i45 = i42;
                for (int i46 = 0; i46 < i29; i46++) {
                    int i47 = iArrCopyOf[i46] + i9;
                    if (i47 > 0 && zArr[i28 + i46]) {
                        iArr7[i45] = i47;
                        i45++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr7, i45);
                i29 = i45;
                iArr3 = iArrCopyOf2;
                i28 = i39;
            }
            i26++;
            i20 = i8;
            i12 = i7;
            iZzc12 = i6;
            iArr2 = iArr;
        }
        int i48 = i12;
        int i49 = i20;
        int[] iArr8 = iArr2;
        if (zzgsVar.zzf()) {
            int iZzc16 = zzgsVar.zzc();
            for (int i50 = 0; i50 < iZzc16; i50++) {
                zzgsVar.zze(iZzc11 + 5);
            }
        }
        zzgsVar.zze(2);
        float f = 1.0f;
        if (zzgsVar.zzf()) {
            if (zzgsVar.zzf()) {
                int iZza5 = zzgsVar.zza(8);
                if (iZza5 == 255) {
                    int iZza6 = zzgsVar.zza(16);
                    int iZza7 = zzgsVar.zza(16);
                    if (iZza6 != 0 && iZza7 != 0) {
                        f = iZza6 / iZza7;
                    }
                } else if (iZza5 < 17) {
                    f = zzb[iZza5];
                } else {
                    zzfk.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iZza5);
                }
            }
            if (zzgsVar.zzf()) {
                zzgsVar.zzd();
            }
            if (zzgsVar.zzf()) {
                zzgsVar.zze(3);
                int i51 = true != zzgsVar.zzf() ? 2 : 1;
                if (zzgsVar.zzf()) {
                    int iZza8 = zzgsVar.zza(8);
                    int iZza9 = zzgsVar.zza(8);
                    zzgsVar.zze(8);
                    int iZza10 = zzt.zza(iZza8);
                    iZzb = zzt.zzb(iZza9);
                    i4 = iZza10;
                } else {
                    i4 = -1;
                    iZzb = -1;
                }
                i27 = i51;
            } else {
                i4 = -1;
                iZzb = -1;
            }
            if (zzgsVar.zzf()) {
                zzgsVar.zzc();
                zzgsVar.zzc();
            }
            zzgsVar.zzd();
            if (zzgsVar.zzf()) {
                i21 += i21;
            }
            i5 = iZzb;
            i3 = i21;
        } else {
            i3 = i21;
            i4 = -1;
            i5 = -1;
        }
        return new zzgo(iZza2, zZzf, iZza3, i48, i49, iZzc9, iZzc10, iArr8, iZza4, iZzc, i19, i3, f, i4, i27, i5);
    }

    public static zzgp zzd(byte[] bArr, int i, int i2) {
        zzgs zzgsVar = new zzgs(bArr, 4, i2);
        int iZzc = zzgsVar.zzc();
        int iZzc2 = zzgsVar.zzc();
        zzgsVar.zzd();
        return new zzgp(iZzc, iZzc2, zzgsVar.zzf());
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgq zze(byte[] bArr, int i, int i2) {
        int iZzc;
        int i3;
        boolean zZzf;
        int i4;
        int i5;
        boolean z;
        int i6;
        int iZzc2;
        boolean z2;
        boolean zZzf2;
        int iZza;
        int i7;
        int iZzb;
        float f;
        float f2;
        int i8;
        int i9;
        zzgs zzgsVar = new zzgs(bArr, i, i2);
        int i10 = 8;
        int iZza2 = zzgsVar.zza(8);
        int iZza3 = zzgsVar.zza(8);
        int iZza4 = zzgsVar.zza(8);
        int iZzc3 = zzgsVar.zzc();
        int i11 = 1;
        if (iZza2 == 100 || iZza2 == 110 || iZza2 == 122 || iZza2 == 244 || iZza2 == 44 || iZza2 == 83 || iZza2 == 86 || iZza2 == 118 || iZza2 == 128) {
            iZzc = zzgsVar.zzc();
            if (iZzc != 3) {
                zZzf = zzgsVar.zzf();
                i3 = 3;
            } else {
                i3 = iZzc;
                zZzf = false;
            }
            int iZzc4 = zzgsVar.zzc();
            int iZzc5 = zzgsVar.zzc();
            zzgsVar.zzd();
            if (zzgsVar.zzf()) {
                int i12 = i3 != 3 ? 8 : 12;
                int i13 = 0;
                while (i13 < i12) {
                    if (zzgsVar.zzf()) {
                        int i14 = i13 < 6 ? 16 : 64;
                        int iZzb2 = i10;
                        int i15 = iZzb2;
                        for (int i16 = 0; i16 < i14; i16++) {
                            if (iZzb2 != 0) {
                                iZzb2 = ((i15 + zzgsVar.zzb()) + 256) % 256;
                            }
                            if (iZzb2 != 0) {
                                i15 = iZzb2;
                            }
                        }
                    }
                    i13++;
                    i10 = 8;
                }
            }
            i4 = iZzc4;
            i5 = iZzc5;
            z = zZzf;
        } else if (iZza2 == 138) {
            iZza2 = 138;
            iZzc = zzgsVar.zzc();
            if (iZzc != 3) {
            }
            int iZzc42 = zzgsVar.zzc();
            int iZzc52 = zzgsVar.zzc();
            zzgsVar.zzd();
            if (zzgsVar.zzf()) {
            }
            i4 = iZzc42;
            i5 = iZzc52;
            z = zZzf;
        } else {
            iZzc = 1;
            i4 = 0;
            i5 = 0;
            z = false;
        }
        int iZzc6 = zzgsVar.zzc() + 4;
        int iZzc7 = zzgsVar.zzc();
        if (iZzc7 == 0) {
            i6 = iZza3;
            iZzc2 = zzgsVar.zzc() + 4;
        } else {
            if (iZzc7 == 1) {
                boolean zZzf3 = zzgsVar.zzf();
                zzgsVar.zzb();
                zzgsVar.zzb();
                long jZzc = zzgsVar.zzc();
                i6 = iZza3;
                for (int i17 = 0; i17 < jZzc; i17++) {
                    zzgsVar.zzc();
                }
                z2 = zZzf3;
                iZzc7 = 1;
                iZzc2 = 0;
                int iZzc8 = zzgsVar.zzc();
                zzgsVar.zzd();
                int iZzc9 = zzgsVar.zzc() + 1;
                int iZzc10 = zzgsVar.zzc() + 1;
                zZzf2 = zzgsVar.zzf();
                int i18 = 2 - (zZzf2 ? 1 : 0);
                if (!zZzf2) {
                    zzgsVar.zzd();
                }
                zzgsVar.zzd();
                int i19 = iZzc9 * 16;
                int i20 = iZzc10 * i18 * 16;
                if (zzgsVar.zzf()) {
                    int iZzc11 = zzgsVar.zzc();
                    int iZzc12 = zzgsVar.zzc();
                    int iZzc13 = zzgsVar.zzc();
                    int iZzc14 = zzgsVar.zzc();
                    if (iZzc != 0) {
                        if (iZzc == 3) {
                            i9 = 1;
                            i8 = 1;
                        } else {
                            i8 = 2;
                            i9 = 1;
                        }
                        i18 *= iZzc == i9 ? 2 : 1;
                        i11 = i8;
                    }
                    i19 -= (iZzc11 + iZzc12) * i11;
                    i20 -= (iZzc13 + iZzc14) * i18;
                }
                int i21 = i19;
                int i22 = i20;
                if (zzgsVar.zzf()) {
                    iZza = -1;
                    i7 = -1;
                    iZzb = -1;
                    f = 1.0f;
                } else if (zzgsVar.zzf()) {
                    int iZza5 = zzgsVar.zza(8);
                    if (iZza5 == 255) {
                        int iZza6 = zzgsVar.zza(16);
                        int iZza7 = zzgsVar.zza(16);
                        if (iZza6 != 0 && iZza7 != 0) {
                            f2 = iZza6 / iZza7;
                        }
                        if (zzgsVar.zzf()) {
                        }
                        if (zzgsVar.zzf()) {
                        }
                    } else if (iZza5 < 17) {
                        f2 = zzb[iZza5];
                        if (zzgsVar.zzf()) {
                        }
                        if (zzgsVar.zzf()) {
                        }
                    } else {
                        zzfk.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iZza5);
                        f2 = 1.0f;
                        if (zzgsVar.zzf()) {
                        }
                        if (zzgsVar.zzf()) {
                        }
                    }
                } else {
                    f2 = 1.0f;
                    if (zzgsVar.zzf()) {
                        zzgsVar.zzd();
                    }
                    if (zzgsVar.zzf()) {
                        f = f2;
                        iZza = -1;
                        i7 = -1;
                        iZzb = -1;
                    } else {
                        zzgsVar.zze(3);
                        i7 = true == zzgsVar.zzf() ? 1 : 2;
                        if (zzgsVar.zzf()) {
                            int iZza8 = zzgsVar.zza(8);
                            int iZza9 = zzgsVar.zza(8);
                            zzgsVar.zze(8);
                            iZza = zzt.zza(iZza8);
                            iZzb = zzt.zzb(iZza9);
                            f = f2;
                        } else {
                            f = f2;
                            iZza = -1;
                            iZzb = -1;
                        }
                    }
                }
                return new zzgq(iZza2, i6, iZza4, iZzc3, iZzc8, i21, i22, f, i4, i5, z, zZzf2, iZzc6, iZzc7, iZzc2, z2, iZza, i7, iZzb);
            }
            i6 = iZza3;
            iZzc2 = 0;
        }
        z2 = false;
        int iZzc82 = zzgsVar.zzc();
        zzgsVar.zzd();
        int iZzc92 = zzgsVar.zzc() + 1;
        int iZzc102 = zzgsVar.zzc() + 1;
        zZzf2 = zzgsVar.zzf();
        int i182 = 2 - (zZzf2 ? 1 : 0);
        if (!zZzf2) {
        }
        zzgsVar.zzd();
        int i192 = iZzc92 * 16;
        int i202 = iZzc102 * i182 * 16;
        if (zzgsVar.zzf()) {
        }
        int i212 = i192;
        int i222 = i202;
        if (zzgsVar.zzf()) {
        }
        return new zzgq(iZza2, i6, iZza4, iZzc3, iZzc82, i212, i222, f, i4, i5, z, zZzf2, iZzc6, iZzc7, iZzc2, z2, iZza, i7, iZzb);
    }

    public static void zzf(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = zzd[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }
}
