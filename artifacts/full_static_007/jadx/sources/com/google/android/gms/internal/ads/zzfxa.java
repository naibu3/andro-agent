package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfxa extends zzfww {
    final /* synthetic */ zzfxg zza;

    zzfxa(zzfxg zzfxgVar) {
        this.zza = zzfxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final void zza() {
        synchronized (this.zza.zzg) {
            if (this.zza.zzl.get() > 0 && this.zza.zzl.decrementAndGet() > 0) {
                this.zza.zzc.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            zzfxg zzfxgVar = this.zza;
            if (zzfxgVar.zzn != null) {
                zzfxgVar.zzc.zzc("Unbind from service.", new Object[0]);
                zzfxg zzfxgVar2 = this.zza;
                zzfxgVar2.zzb.unbindService(zzfxgVar2.zzm);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
