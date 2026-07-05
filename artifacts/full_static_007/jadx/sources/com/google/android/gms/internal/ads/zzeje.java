package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzeje implements zzgfp {
    final /* synthetic */ zzejf zza;

    zzeje(zzejf zzejfVar) {
        this.zza = zzejfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zzdB(zzeVarZza);
        zzfil.zzb(zzeVarZza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcsf) obj).zzj();
    }
}
