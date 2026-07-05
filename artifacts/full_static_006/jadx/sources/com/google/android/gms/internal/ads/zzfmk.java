package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfmk implements zzgfp {
    final /* synthetic */ zzfmn zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ boolean zzc;

    zzfmk(zzfmn zzfmnVar, zzfmc zzfmcVar, boolean z) {
        this.zza = zzfmnVar;
        this.zzb = zzfmcVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfmc zzfmcVar = this.zzb;
        if (zzfmcVar.zzl()) {
            zzfmn zzfmnVar = this.zza;
            zzfmcVar.zzi(th);
            zzfmcVar.zzh(false);
            zzfmnVar.zza(zzfmcVar);
            if (this.zzc) {
                this.zza.zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zzb(Object obj) {
        zzfmc zzfmcVar = this.zzb;
        zzfmcVar.zzh(true);
        this.zza.zza(zzfmcVar);
        if (this.zzc) {
            this.zza.zzi();
        }
    }
}
