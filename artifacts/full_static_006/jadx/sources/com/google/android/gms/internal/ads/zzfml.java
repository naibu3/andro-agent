package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfml implements zzgfp {
    final /* synthetic */ zzfmn zza;
    final /* synthetic */ zzfmc zzb;

    zzfml(zzfmn zzfmnVar, zzfmc zzfmcVar) {
        this.zza = zzfmnVar;
        this.zzb = zzfmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfmc zzfmcVar = this.zzb;
        zzfmcVar.zzi(th);
        zzfmcVar.zzh(false);
        this.zza.zza(zzfmcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zzb(Object obj) {
    }
}
