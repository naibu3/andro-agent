package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzepj implements zzepr {
    final /* synthetic */ zzepk zza;

    zzepj(zzepk zzepkVar) {
        this.zza = zzepkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdig zzdigVar = (zzdig) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdigVar;
            this.zza.zzj.zzj();
        }
    }
}
