package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfea implements zzfek {
    private final zzfek zza;
    private zzcys zzb;

    public zzfea(zzfek zzfekVar) {
        this.zza = zzfekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcys zzd() {
        return this.zzb;
    }

    public final synchronized ListenableFuture zzb(zzfel zzfelVar, zzfej zzfejVar, zzcys zzcysVar) {
        this.zzb = zzcysVar;
        if (zzfelVar.zza == null) {
            return ((zzfdz) this.zza).zzb(zzfelVar, zzfejVar, zzcysVar);
        }
        zzcvx zzcvxVarZzb = this.zzb.zzb();
        return zzcvxVarZzb.zzi(zzcvxVarZzb.zzk(zzgft.zzh(zzfelVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfel zzfelVar, zzfej zzfejVar, Object obj) {
        return zzb(zzfelVar, zzfejVar, null);
    }
}
