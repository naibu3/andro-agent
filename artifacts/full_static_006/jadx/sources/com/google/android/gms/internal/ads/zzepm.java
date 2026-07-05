package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzepm implements zzepr {
    final /* synthetic */ zzepn zza;

    zzepm(zzepn zzepnVar) {
        this.zza = zzepnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzc = ((zzcup) obj).zzl();
            ((zzcup) obj).zzj();
        }
    }
}
