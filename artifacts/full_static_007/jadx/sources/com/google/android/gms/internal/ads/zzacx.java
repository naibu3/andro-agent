package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzacx {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final String zzk;

    private zzacx(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = f;
        this.zzk = str;
    }

    public static zzacx zza(zzfu zzfuVar) throws zzch {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String strZza;
        float f;
        try {
            zzfuVar.zzL(4);
            int iZzm = zzfuVar.zzm() & 3;
            int i8 = iZzm + 1;
            if (i8 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzm2 = zzfuVar.zzm() & 31;
            for (int i9 = 0; i9 < iZzm2; i9++) {
                arrayList.add(zzb(zzfuVar));
            }
            int iZzm3 = zzfuVar.zzm();
            for (int i10 = 0; i10 < iZzm3; i10++) {
                arrayList.add(zzb(zzfuVar));
            }
            if (iZzm2 > 0) {
                zzgq zzgqVarZze = zzgr.zze((byte[]) arrayList.get(0), iZzm + 2, ((byte[]) arrayList.get(0)).length);
                int i11 = zzgqVarZze.zze;
                int i12 = zzgqVarZze.zzf;
                int i13 = zzgqVarZze.zzh + 8;
                int i14 = zzgqVarZze.zzi + 8;
                int i15 = zzgqVarZze.zzj;
                int i16 = zzgqVarZze.zzk;
                int i17 = zzgqVarZze.zzl;
                float f2 = zzgqVarZze.zzg;
                strZza = zzes.zza(zzgqVarZze.zza, zzgqVarZze.zzb, zzgqVarZze.zzc);
                i6 = i16;
                i7 = i17;
                f = f2;
                i3 = i13;
                i4 = i14;
                i5 = i15;
                i = i11;
                i2 = i12;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                strZza = null;
                f = 1.0f;
            }
            return new zzacx(arrayList, i8, i, i2, i3, i4, i5, i6, i7, f, strZza);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzch.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzfu zzfuVar) {
        int iZzq = zzfuVar.zzq();
        int iZzd = zzfuVar.zzd();
        zzfuVar.zzL(iZzq);
        return zzes.zzc(zzfuVar.zzM(), iZzd, iZzq);
    }
}
