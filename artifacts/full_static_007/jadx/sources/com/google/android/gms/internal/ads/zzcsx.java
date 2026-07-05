package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcsx implements zzhkp {
    private final zzcsm zza;
    private final zzhlg zzb;

    public zzcsx(zzcsm zzcsmVar, zzhlg zzhlgVar) {
        this.zza = zzcsmVar;
        this.zzb = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdha((zzcue) this.zzb.zzb(), zzcci.zzf));
        zzhkx.zzb(setSingleton);
        return setSingleton;
    }
}
