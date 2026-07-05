package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzeoh implements zzepr {
    final /* synthetic */ zzeoi zza;

    zzeoh(zzeoi zzeoiVar) {
        this.zza = zzeoiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcsf zzcsfVar = (zzcsf) obj;
        synchronized (this.zza) {
            zzeoi zzeoiVar = this.zza;
            if (zzeoiVar.zzi != null) {
                zzeoiVar.zzi.zzb();
            }
            this.zza.zzi = zzcsfVar;
            this.zza.zzi.zzj();
        }
    }
}
