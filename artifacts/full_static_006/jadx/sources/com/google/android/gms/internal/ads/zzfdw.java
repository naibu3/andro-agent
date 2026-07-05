package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfdw implements zzfek {
    private final zzfjc zza;
    private final Executor zzb;
    private final zzgfp zzc = new zzfdu(this);

    public zzfdw(zzfjc zzfjcVar, Executor executor) {
        this.zza = zzfjcVar;
        this.zzb = executor;
    }

    final /* synthetic */ ListenableFuture zza(zzcys zzcysVar, zzfef zzfefVar) throws Exception {
        zzfjc zzfjcVar = this.zza;
        zzfjm zzfjmVar = zzfefVar.zzb;
        zzbxu zzbxuVar = zzfefVar.zza;
        zzfjl zzfjlVarZzb = zzfjcVar.zzb(zzfjmVar);
        if (zzfjlVarZzb != null && zzbxuVar != null) {
            zzgft.zzr(zzcysVar.zzb().zzh(zzbxuVar), this.zzc, this.zzb);
        }
        return zzgft.zzh(new zzfdv(zzfjmVar, zzbxuVar, zzfjlVarZzb));
    }

    public final ListenableFuture zzb(zzfel zzfelVar, zzfej zzfejVar, final zzcys zzcysVar) {
        return zzgft.zze(zzgft.zzn(zzgfk.zzu(new zzfeg(this.zza, zzcysVar, this.zzb).zzc()), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfds
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zza(zzcysVar, (zzfef) obj);
            }
        }, this.zzb), Exception.class, new zzfdt(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfel zzfelVar, zzfej zzfejVar, Object obj) {
        return zzb(zzfelVar, zzfejVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
