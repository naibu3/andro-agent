package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcyx implements zzhkp {
    private final zzcyv zza;
    private final zzhlg zzb;

    public zzcyx(zzcyv zzcyvVar, zzhlg zzhlgVar) {
        this.zza = zzcyvVar;
        this.zzb = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = this.zza.zza(((zzcjj) this.zzb).zza());
        zzhkx.zzb(contextZza);
        return contextZza;
    }
}
