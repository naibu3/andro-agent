package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzako {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzaex zza(zzadv zzadvVar) throws IOException {
        return zzc(zzadvVar, true, false);
    }

    public static zzaex zzb(zzadv zzadvVar, boolean z) throws IOException {
        return zzc(zzadvVar, false, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return com.google.android.gms.internal.ads.zzake.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0122, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0125, code lost:
    
        if (r11 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0129, code lost:
    
        return com.google.android.gms.internal.ads.zzakk.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012c, code lost:
    
        if (r25 == r8) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012e, code lost:
    
        if (r8 == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0135, code lost:
    
        return com.google.android.gms.internal.ads.zzake.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0136, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzaex zzc(zzadv zzadvVar, boolean z, boolean z2) throws IOException {
        zzfu zzfuVar;
        int i;
        zzfu zzfuVar2;
        int i2;
        int[] iArr;
        long jZzd = zzadvVar.zzd();
        long j = -1;
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (jZzd != -1 && jZzd <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = jZzd;
        }
        zzfu zzfuVar3 = new zzfu(64);
        int i3 = (int) j2;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            zzfuVar3.zzH(8);
            boolean z4 = true;
            if (!zzadvVar.zzm(zzfuVar3.zzM(), i4, 8, true)) {
                break;
            }
            long jZzu = zzfuVar3.zzu();
            int iZzg = zzfuVar3.zzg();
            if (jZzu == 1) {
                zzadvVar.zzh(zzfuVar3.zzM(), 8, 8);
                i = 16;
                zzfuVar3.zzJ(16);
                jZzu = zzfuVar3.zzt();
                zzfuVar = zzfuVar3;
            } else {
                if (jZzu == 0) {
                    long jZzd2 = zzadvVar.zzd();
                    if (jZzd2 != j) {
                        jZzu = (jZzd2 - zzadvVar.zze()) + 8;
                    }
                }
                zzfuVar = zzfuVar3;
                i = 8;
            }
            long j3 = jZzu;
            long j4 = i;
            if (j3 < j4) {
                return new zzajx(iZzg, j3, i);
            }
            i5 += i;
            if (iZzg == 1836019574) {
                i3 += (int) j3;
                if (jZzd != -1 && i3 > jZzd) {
                    i3 = (int) jZzd;
                }
                zzfuVar3 = zzfuVar;
                j = -1;
                i4 = 0;
            } else {
                if (iZzg == 1836019558 || iZzg == 1836475768) {
                    break;
                }
                z3 |= !(iZzg != 1835295092);
                long j5 = jZzd;
                if ((i5 + j3) - j4 >= i3) {
                    i4 = 0;
                    break;
                }
                int i6 = (int) (j3 - j4);
                i5 += i6;
                if (iZzg != 1718909296) {
                    zzfuVar2 = zzfuVar;
                    i2 = 0;
                    if (i6 != 0) {
                        zzadvVar.zzg(i6);
                    }
                } else {
                    if (i6 < 8) {
                        return new zzajx(1718909296, i6, 8);
                    }
                    zzfuVar2 = zzfuVar;
                    zzfuVar2.zzH(i6);
                    i2 = 0;
                    zzadvVar.zzh(zzfuVar2.zzM(), 0, i6);
                    int iZzg2 = zzfuVar2.zzg();
                    boolean zZzd = zzd(iZzg2, z2) | z3;
                    zzfuVar2.zzL(4);
                    int iZzb = zzfuVar2.zzb() / 4;
                    if (!zZzd && iZzb > 0) {
                        iArr = new int[iZzb];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= iZzb) {
                                z4 = zZzd;
                                break;
                            }
                            int iZzg3 = zzfuVar2.zzg();
                            iArr[i7] = iZzg3;
                            if (zzd(iZzg3, z2)) {
                                break;
                            }
                            i7++;
                        }
                    } else {
                        z4 = zZzd;
                        iArr = null;
                    }
                    if (!z4) {
                        return new zzakt(iZzg2, iArr);
                    }
                    z3 = z4;
                }
                zzfuVar3 = zzfuVar2;
                i4 = i2;
                jZzd = j5;
                j = -1;
            }
        }
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
