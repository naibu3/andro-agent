package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzccs implements zzgfp {
    final /* synthetic */ zzccu zza;

    zzccs(zzccu zzccuVar) {
        this.zza = zzccuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        this.zza.zzb.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zzb(Object obj) {
        this.zza.zzb.set(1);
    }
}
