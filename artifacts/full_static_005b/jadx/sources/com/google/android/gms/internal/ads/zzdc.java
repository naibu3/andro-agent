package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzdc {
    public static final zzdc zza = new zzcx();
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(2, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcw
    };

    protected zzdc() {
    }

    public final boolean equals(Object obj) {
        int iZzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdc)) {
            return false;
        }
        zzdc zzdcVar = (zzdc) obj;
        if (zzdcVar.zzc() == zzc() && zzdcVar.zzb() == zzb()) {
            zzdb zzdbVar = new zzdb();
            zzcz zzczVar = new zzcz();
            zzdb zzdbVar2 = new zzdb();
            zzcz zzczVar2 = new zzcz();
            for (int i = 0; i < zzc(); i++) {
                if (!zze(i, zzdbVar, 0L).equals(zzdcVar.zze(i, zzdbVar2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < zzb(); i2++) {
                if (!zzd(i2, zzczVar, true).equals(zzdcVar.zzd(i2, zzczVar2, true))) {
                    return false;
                }
            }
            int iZzg = zzg(true);
            if (iZzg == zzdcVar.zzg(true) && (iZzh = zzh(true)) == zzdcVar.zzh(true)) {
                while (iZzg != iZzh) {
                    int iZzj = zzj(iZzg, 0, true);
                    if (iZzj != zzdcVar.zzj(iZzg, 0, true)) {
                        return false;
                    }
                    iZzg = iZzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        zzdb zzdbVar = new zzdb();
        zzcz zzczVar = new zzcz();
        int iZzc = zzc() + 217;
        int i2 = 0;
        while (true) {
            i = iZzc * 31;
            if (i2 >= zzc()) {
                break;
            }
            iZzc = i + zze(i2, zzdbVar, 0L).hashCode();
            i2++;
        }
        int iZzb = i + zzb();
        for (int i3 = 0; i3 < zzb(); i3++) {
            iZzb = (iZzb * 31) + zzd(i3, zzczVar, true).hashCode();
        }
        int iZzg = zzg(true);
        while (iZzg != -1) {
            iZzb = (iZzb * 31) + iZzg;
            iZzg = zzj(iZzg, 0, true);
        }
        return iZzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzcz zzd(int i, zzcz zzczVar, boolean z);

    public abstract zzdb zze(int i, zzdb zzdbVar, long j);

    public abstract Object zzf(int i);

    public int zzg(boolean z) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzcz zzczVar, zzdb zzdbVar, int i2, boolean z) {
        int i3 = zzd(i, zzczVar, false).zzd;
        if (zze(i3, zzdbVar, 0L).zzq != i) {
            return i + 1;
        }
        int iZzj = zzj(i3, i2, z);
        if (iZzj == -1) {
            return -1;
        }
        return zze(iZzj, zzdbVar, 0L).zzp;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == zzh(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == zzh(z) ? zzg(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzdb zzdbVar, zzcz zzczVar, int i, long j) {
        Pair pairZzm = zzm(zzdbVar, zzczVar, i, j, 0L);
        pairZzm.getClass();
        return pairZzm;
    }

    public final Pair zzm(zzdb zzdbVar, zzcz zzczVar, int i, long j, long j2) {
        zzeq.zza(i, 0, zzc());
        zze(i, zzdbVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzdbVar.zzn;
            j = 0;
        }
        int i2 = zzdbVar.zzp;
        zzd(i2, zzczVar, false);
        while (i2 < zzdbVar.zzq) {
            long j4 = zzczVar.zzf;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = zzd(i3, zzczVar, false).zzf;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        zzd(i2, zzczVar, true);
        long j6 = zzczVar.zzf;
        long j7 = zzczVar.zze;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = zzczVar.zzc;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzcz zzn(Object obj, zzcz zzczVar) {
        return zzd(zza(obj), zzczVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
