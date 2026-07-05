package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhde;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhbm<ContainingType extends zzhde, Type> extends zzhaw<ContainingType, Type> {
    final zzhde zza;
    final Object zzb;
    final zzhde zzc;
    final zzhbl zzd;

    zzhbm(zzhde zzhdeVar, Object obj, zzhde zzhdeVar2, zzhbl zzhblVar, Class cls) {
        if (zzhdeVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (zzhblVar.zzc == zzhfg.MESSAGE && zzhdeVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.zza = zzhdeVar;
        this.zzb = obj;
        this.zzc = zzhdeVar2;
        this.zzd = zzhblVar;
    }
}
