package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcvd implements zzgfp {
    final /* synthetic */ zzgfp zza;
    final /* synthetic */ zzcve zzb;

    zzcvd(zzcve zzcveVar, zzgfp zzgfpVar) {
        this.zza = zzgfpVar;
        this.zzb = zzcveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuy
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuy
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
        this.zza.zzb((zzcup) obj);
    }
}
