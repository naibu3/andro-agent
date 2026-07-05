package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdke implements zzhkp {
    private final zzhlg zza;

    public zzdke(zzhlg zzhlgVar) {
        this.zza = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdkb) this.zza).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzhkx.zzb(setSingleton);
        return setSingleton;
    }
}
