package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzxy extends zzya {
    private final zzzu zzd;
    private final zzgbc zze;
    private final zzer zzf;

    protected zzxy(zzde zzdeVar, int[] iArr, int i, zzzu zzzuVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzer zzerVar) {
        super(zzdeVar, iArr, 0);
        this.zzd = zzzuVar;
        this.zze = zzgbc.zzk(list);
        this.zzf = zzerVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ zzgbc zzf(zzzf[] zzzfVarArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= 2) {
                break;
            }
            zzzf zzzfVar = zzzfVarArr[i4];
            if (zzzfVar == null || zzzfVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzgaz zzgazVar = new zzgaz();
                zzgazVar.zzf(new zzxw(0L, 0L));
                arrayList.add(zzgazVar);
            }
            i4++;
        }
        long[][] jArr = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            zzzf zzzfVar2 = zzzfVarArr[i5];
            if (zzzfVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                jArr[i5] = new long[zzzfVar2.zzb.length];
                int i6 = 0;
                while (true) {
                    int[] iArr = zzzfVar2.zzb;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    long j = zzzfVar2.zza.zzb(iArr[i6]).zzj;
                    long[] jArr2 = jArr[i5];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i6] = j;
                    i6++;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr4 = jArr[i7];
            jArr3[i7] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzg(arrayList, jArr3);
        zzgbn zzgbnVarZza = zzgci.zzc(zzgcn.zzc()).zzb(2).zza();
        int i8 = 0;
        while (i8 < i) {
            int length = jArr[i8].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i9 = i3;
                while (true) {
                    long[] jArr5 = jArr[i8];
                    double dLog = 0.0d;
                    if (i9 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i9];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i9] = dLog;
                    i9++;
                }
                int i10 = length - 1;
                double d = dArr[i10] - dArr[i3];
                int i11 = i3;
                while (i11 < i10) {
                    double d2 = dArr[i11];
                    i11++;
                    zzgbnVarZza.zzq(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i11]) * 0.5d) - dArr[i3]) / d), Integer.valueOf(i8));
                    i3 = 0;
                }
            }
            i8++;
            i3 = 0;
            i = 2;
            i2 = 1;
        }
        zzgbc zzgbcVarZzk = zzgbc.zzk(zzgbnVarZza.zzr());
        for (int i12 = 0; i12 < zzgbcVarZzk.size(); i12++) {
            int iIntValue = ((Integer) zzgbcVarZzk.get(i12)).intValue();
            int i13 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i13;
            jArr3[iIntValue] = jArr[iIntValue][i13];
            zzg(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j3 = jArr3[i14];
                jArr3[i14] = j3 + j3;
            }
        }
        zzg(arrayList, jArr3);
        zzgaz zzgazVar2 = new zzgaz();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            zzgaz zzgazVar3 = (zzgaz) arrayList.get(i15);
            zzgazVar2.zzf(zzgazVar3 == null ? zzgbc.zzm() : zzgazVar3.zzi());
        }
        return zzgazVar2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgaz zzgazVar = (zzgaz) list.get(i2);
            if (zzgazVar != null) {
                zzgazVar.zzf(new zzxw(j, jArr[i2]));
            }
        }
    }
}
