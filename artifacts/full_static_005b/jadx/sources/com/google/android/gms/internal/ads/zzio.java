package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzio extends zzdc {
    private final int zzc;
    private final zzxi zzd;

    public zzio(boolean z, zzxi zzxiVar) {
        this.zzd = zzxiVar;
        this.zzc = zzxiVar.zzc();
    }

    private final int zzw(int i, boolean z) {
        if (z) {
            return this.zzd.zzd(i);
        }
        if (i >= this.zzc - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzd.zze(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zza(Object obj) {
        int iZza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iZzp = zzp(obj2);
            if (iZzp != -1 && (iZza = zzu(iZzp).zza(obj3)) != -1) {
                return zzs(iZzp) + iZza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzcz zzd(int i, zzcz zzczVar, boolean z) {
        int iZzq = zzq(i);
        int iZzt = zzt(iZzq);
        zzu(iZzq).zzd(i - zzs(iZzq), zzczVar, z);
        zzczVar.zzd += iZzt;
        if (z) {
            Object objZzv = zzv(iZzq);
            Object obj = zzczVar.zzc;
            obj.getClass();
            zzczVar.zzc = Pair.create(objZzv, obj);
        }
        return zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzdb zze(int i, zzdb zzdbVar, long j) {
        int iZzr = zzr(i);
        int iZzt = zzt(iZzr);
        int iZzs = zzs(iZzr);
        zzu(iZzr).zze(i - iZzt, zzdbVar, j);
        Object objZzv = zzv(iZzr);
        if (!zzdb.zza.equals(zzdbVar.zzc)) {
            objZzv = Pair.create(objZzv, zzdbVar.zzc);
        }
        zzdbVar.zzc = objZzv;
        zzdbVar.zzp += iZzs;
        zzdbVar.zzq += iZzs;
        return zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final Object zzf(int i) {
        int iZzq = zzq(i);
        return Pair.create(zzv(iZzq), zzu(iZzq).zzf(i - zzs(iZzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzg(boolean z) {
        if (this.zzc != 0) {
            int iZza = z ? this.zzd.zza() : 0;
            while (zzu(iZza).zzo()) {
                iZza = zzw(iZza, z);
                if (iZza == -1) {
                }
            }
            return zzt(iZza) + zzu(iZza).zzg(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzh(boolean z) {
        int i = this.zzc;
        if (i != 0) {
            int iZzb = z ? this.zzd.zzb() : i - 1;
            while (zzu(iZzb).zzo()) {
                iZzb = zzx(iZzb, z);
                if (iZzb == -1) {
                }
            }
            return zzt(iZzb) + zzu(iZzb).zzh(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzj(int i, int i2, boolean z) {
        int iZzr = zzr(i);
        int iZzt = zzt(iZzr);
        int iZzj = zzu(iZzr).zzj(i - iZzt, i2 == 2 ? 0 : i2, z);
        if (iZzj != -1) {
            return iZzt + iZzj;
        }
        int iZzw = zzw(iZzr, z);
        while (iZzw != -1 && zzu(iZzw).zzo()) {
            iZzw = zzw(iZzw, z);
        }
        if (iZzw != -1) {
            return zzt(iZzw) + zzu(iZzw).zzg(z);
        }
        if (i2 == 2) {
            return zzg(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzk(int i, int i2, boolean z) {
        int iZzr = zzr(i);
        int iZzt = zzt(iZzr);
        int iZzk = zzu(iZzr).zzk(i - iZzt, 0, false);
        if (iZzk != -1) {
            return iZzt + iZzk;
        }
        int iZzx = zzx(iZzr, false);
        while (iZzx != -1 && zzu(iZzx).zzo()) {
            iZzx = zzx(iZzx, false);
        }
        if (iZzx != -1) {
            return zzt(iZzx) + zzu(iZzx).zzh(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzcz zzn(Object obj, zzcz zzczVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzp = zzp(obj2);
        int iZzt = zzt(iZzp);
        zzu(iZzp).zzn(obj3, zzczVar);
        zzczVar.zzd += iZzt;
        zzczVar.zzc = obj;
        return zzczVar;
    }

    protected abstract int zzp(Object obj);

    protected abstract int zzq(int i);

    protected abstract int zzr(int i);

    protected abstract int zzs(int i);

    protected abstract int zzt(int i);

    protected abstract zzdc zzu(int i);

    protected abstract Object zzv(int i);
}
