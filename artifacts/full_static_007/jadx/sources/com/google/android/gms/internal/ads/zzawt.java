package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzawt implements zzfsl {
    final /* synthetic */ zzfre zza;

    zzawt(zzfre zzfreVar) {
        this.zza = zzfreVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}
