package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdiv implements zzhkp {
    private final zzdik zza;
    private final zzhlg zzb;

    public zzdiv(zzdik zzdikVar, zzhlg zzhlgVar) {
        this.zza = zzdikVar;
        this.zzb = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzf = this.zza.zzf((zzcyi) this.zzb.zzb());
        zzhkx.zzb(setZzf);
        return setZzf;
    }
}
