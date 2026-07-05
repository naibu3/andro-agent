package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzzj extends zzzm {
    private zzzi zza;

    protected abstract Pair zzd(zzzi zzziVar, int[][][] iArr, int[] iArr2, zzvo zzvoVar, zzdc zzdcVar) throws zzjh;

    @Override // com.google.android.gms.internal.ads.zzzm
    public final zzzn zzp(zzmp[] zzmpVarArr, zzxr zzxrVar, zzvo zzvoVar, zzdc zzdcVar) throws zzjh {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzde[][] zzdeVarArr = new zzde[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzxrVar.zzc;
            zzdeVarArr[i] = new zzde[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzmpVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzxrVar.zzc) {
            zzde zzdeVarZzb = zzxrVar.zzb(i5);
            int i6 = zzdeVarZzb.zzd;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zzmp zzmpVar = zzmpVarArr[i8];
                int iMax = 0;
                for (int i10 = 0; i10 < zzdeVarZzb.zzb; i10++) {
                    iMax = Math.max(iMax, zzmpVar.zzY(zzdeVarZzb.zzb(i10)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (iMax > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = iMax;
                } else if (iMax == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = iMax;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[zzdeVarZzb.zzb];
            } else {
                zzmp zzmpVar2 = zzmpVarArr[i7];
                int[] iArr5 = new int[zzdeVarZzb.zzb];
                for (int i11 = 0; i11 < zzdeVarZzb.zzb; i11++) {
                    iArr5[i11] = zzmpVar2.zzY(zzdeVarZzb.zzb(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i7];
            zzdeVarArr[i7][i12] = zzdeVarZzb;
            iArr3[i7][i12] = iArr;
            iArr2[i7] = i12 + 1;
            i5++;
            i3 = 2;
        }
        int i13 = i3;
        boolean z4 = true;
        zzxr[] zzxrVarArr = new zzxr[i13];
        String[] strArr = new String[i13];
        int[] iArr6 = new int[i13];
        int i14 = 0;
        while (i14 < i13) {
            int i15 = iArr2[i14];
            zzxrVarArr[i14] = new zzxr((zzde[]) zzgd.zzP(zzdeVarArr[i14], i15));
            iArr3[i14] = (int[][]) zzgd.zzP(iArr3[i14], i15);
            strArr[i14] = zzmpVarArr[i14].zzU();
            iArr6[i14] = zzmpVarArr[i14].zzb();
            i14++;
            i13 = 2;
        }
        int i16 = i13;
        zzzi zzziVar = new zzzi(strArr, iArr6, zzxrVarArr, iArr4, iArr3, new zzxr((zzde[]) zzgd.zzP(zzdeVarArr[i16], iArr2[i16])));
        Pair pairZzd = zzd(zzziVar, iArr3, iArr4, zzvoVar, zzdcVar);
        zzzk[] zzzkVarArr = (zzzk[]) pairZzd.second;
        List[] listArr = new List[zzzkVarArr.length];
        for (int i17 = 0; i17 < zzzkVarArr.length; i17++) {
            zzzk zzzkVar = zzzkVarArr[i17];
            listArr[i17] = zzzkVar != null ? zzgbc.zzn(zzzkVar) : zzgbc.zzm();
        }
        zzgaz zzgazVar = new zzgaz();
        int i18 = 0;
        while (i18 < 2) {
            zzxr zzxrVarZzd = zzziVar.zzd(i18);
            List list = listArr[i18];
            int i19 = 0;
            while (i19 < zzxrVarZzd.zzc) {
                zzde zzdeVarZzb2 = zzxrVarZzd.zzb(i19);
                boolean z5 = zzziVar.zza(i18, i19, false) != 0 ? z4 : false;
                int i20 = zzdeVarZzb2.zzb;
                int[] iArr7 = new int[i20];
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 < zzdeVarZzb2.zzb; i21++) {
                    iArr7[i21] = zzziVar.zzb(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzzk zzzkVar2 = (zzzk) list.get(i22);
                        if (zzzkVar2.zze().equals(zzdeVarZzb2) && zzzkVar2.zzb(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                    }
                    zArr[i21] = z;
                }
                zzgazVar.zzf(new zzdo(zzdeVarZzb2, z5, iArr7, zArr));
                i19++;
                z4 = true;
            }
            i18++;
            z4 = true;
        }
        zzxr zzxrVarZze = zzziVar.zze();
        for (int i23 = 0; i23 < zzxrVarZze.zzc; i23++) {
            zzde zzdeVarZzb3 = zzxrVarZze.zzb(i23);
            int[] iArr8 = new int[zzdeVarZzb3.zzb];
            Arrays.fill(iArr8, 0);
            zzgazVar.zzf(new zzdo(zzdeVarZzb3, false, iArr8, new boolean[zzdeVarZzb3.zzb]));
        }
        return new zzzn((zzmq[]) pairZzd.first, (zzzg[]) pairZzd.second, new zzdp(zzgazVar.zzi()), zzziVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final void zzq(Object obj) {
        this.zza = (zzzi) obj;
    }
}
