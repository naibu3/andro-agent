package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdwo implements zzdwc {
    private final long zza;
    private final zzepk zzb;

    zzdwo(long j, Context context, zzdwh zzdwhVar, zzcjd zzcjdVar, String str) {
        this.zza = j;
        zzfey zzfeyVarZzv = zzcjdVar.zzv();
        zzfeyVarZzv.zzc(context);
        zzfeyVarZzv.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzfeyVarZzv.zzb(str);
        zzepk zzepkVarZza = zzfeyVarZzv.zzd().zza();
        this.zzb = zzepkVarZza;
        zzepkVarZza.zzD(new zzdwn(this, zzdwhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdwc
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdwc
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzab(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwc
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
