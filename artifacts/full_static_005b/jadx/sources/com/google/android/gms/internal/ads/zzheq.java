package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
abstract class zzheq {
    zzheq() {
    }

    abstract int zza(Object obj);

    abstract int zzb(Object obj);

    abstract Object zzc(Object obj);

    abstract Object zzd(Object obj);

    abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i, int i2);

    abstract void zzi(Object obj, int i, long j);

    abstract void zzj(Object obj, int i, Object obj2);

    abstract void zzk(Object obj, int i, zzhac zzhacVar);

    abstract void zzl(Object obj, int i, long j);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, Object obj2);

    abstract void zzo(Object obj, Object obj2);

    abstract void zzp(Object obj, zzhfi zzhfiVar) throws IOException;

    abstract void zzq(Object obj, zzhfi zzhfiVar) throws IOException;

    abstract boolean zzs(zzhdr zzhdrVar);

    final boolean zzr(Object obj, zzhdr zzhdrVar) throws IOException {
        int iZzd = zzhdrVar.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzhdrVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zzi(obj, i, zzhdrVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzk(obj, i, zzhdrVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhcd.zza();
            }
            zzh(obj, i, zzhdrVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i3 = i << 3;
        while (zzhdrVar.zzc() != Integer.MAX_VALUE && zzr(objZzf, zzhdrVar)) {
        }
        if ((4 | i3) != zzhdrVar.zzd()) {
            throw zzhcd.zzb();
        }
        zzg(objZzf);
        zzj(obj, i, objZzf);
        return true;
    }
}
