package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhcz {
    zzhcz() {
    }

    public static final boolean zza(Object obj) {
        return !((zzhcy) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzhcy zzhcyVarZzb = (zzhcy) obj;
        zzhcy zzhcyVar = (zzhcy) obj2;
        if (!zzhcyVar.isEmpty()) {
            if (!zzhcyVarZzb.zze()) {
                zzhcyVarZzb = zzhcyVarZzb.zzb();
            }
            zzhcyVarZzb.zzd(zzhcyVar);
        }
        return zzhcyVarZzb;
    }
}
