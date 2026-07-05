package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaek {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private zzaek(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = f;
        this.zzi = str;
    }

    public static zzaek zza(zzfu zzfuVar) throws zzch {
        int i;
        int i2;
        int i3;
        try {
            zzfuVar.zzL(21);
            int iZzm = zzfuVar.zzm() & 3;
            int iZzm2 = zzfuVar.zzm();
            int iZzd = zzfuVar.zzd();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iZzm2; i6++) {
                zzfuVar.zzL(1);
                int iZzq = zzfuVar.zzq();
                for (int i7 = 0; i7 < iZzq; i7++) {
                    int iZzq2 = zzfuVar.zzq();
                    i5 += iZzq2 + 4;
                    zzfuVar.zzL(iZzq2);
                }
            }
            zzfuVar.zzK(iZzd);
            byte[] bArr = new byte[i5];
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            String strZzb = null;
            float f = 1.0f;
            int i15 = 0;
            int i16 = 0;
            while (i15 < iZzm2) {
                int iZzm3 = zzfuVar.zzm() & 63;
                int iZzq3 = zzfuVar.zzq();
                int i17 = i4;
                while (i17 < iZzq3) {
                    int iZzq4 = zzfuVar.zzq();
                    int i18 = iZzm2;
                    System.arraycopy(zzgr.zza, i4, bArr, i16, 4);
                    int i19 = i16 + 4;
                    System.arraycopy(zzfuVar.zzM(), zzfuVar.zzd(), bArr, i19, iZzq4);
                    int i20 = i19 + iZzq4;
                    if (iZzm3 == 33 && i17 == 0) {
                        zzgo zzgoVarZzc = zzgr.zzc(bArr, i16 + 6, i20);
                        i8 = zzgoVarZzc.zzi;
                        i9 = zzgoVarZzc.zzj;
                        i10 = zzgoVarZzc.zze + 8;
                        i11 = zzgoVarZzc.zzf + 8;
                        int i21 = zzgoVarZzc.zzl;
                        int i22 = zzgoVarZzc.zzm;
                        int i23 = zzgoVarZzc.zzn;
                        i = i20;
                        float f2 = zzgoVarZzc.zzk;
                        i2 = iZzm3;
                        i3 = iZzq3;
                        strZzb = zzes.zzb(zzgoVarZzc.zza, zzgoVarZzc.zzb, zzgoVarZzc.zzc, zzgoVarZzc.zzd, zzgoVarZzc.zzg, zzgoVarZzc.zzh);
                        f = f2;
                        i12 = i21;
                        i13 = i22;
                        i14 = i23;
                        i17 = 0;
                    } else {
                        i = i20;
                        i2 = iZzm3;
                        i3 = iZzq3;
                    }
                    zzfuVar.zzL(iZzq4);
                    i17++;
                    iZzm2 = i18;
                    i16 = i;
                    iZzm3 = i2;
                    iZzq3 = i3;
                    i4 = 0;
                }
                i15++;
                i4 = 0;
            }
            return new zzaek(i5 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iZzm + 1, i8, i9, i10, i11, i12, i13, i14, f, strZzb);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzch.zza("Error parsing HEVC config", e);
        }
    }
}
