package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfdz implements zzfek {
    private zzcys zza;

    @Override // com.google.android.gms.internal.ads.zzfek
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcys zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfel zzfelVar, zzfej zzfejVar, Object obj) {
        return zzb(zzfelVar, zzfejVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfel zzfelVar, zzfej zzfejVar, zzcys zzcysVar) {
        zzcvx zzcvxVarZzb;
        if (zzcysVar != null) {
            this.zza = zzcysVar;
        } else {
            this.zza = (zzcys) zzfejVar.zza(zzfelVar.zzb).zzh();
        }
        zzcvxVarZzb = this.zza.zzb();
        return zzcvxVarZzb.zzi(zzcvxVarZzb.zzj());
    }
}
