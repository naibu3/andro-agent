package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfju implements zzgfp {
    final /* synthetic */ zzfjx zza;
    final /* synthetic */ zzfjy zzb;

    zzfju(zzfjy zzfjyVar, zzfjx zzfjxVar) {
        this.zza = zzfjxVar;
        this.zzb = zzfjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            zzfjy zzfjyVar = this.zzb;
            if (zzfjyVar.zzf == 1) {
                zzfjyVar.zzh();
            }
        }
    }
}
