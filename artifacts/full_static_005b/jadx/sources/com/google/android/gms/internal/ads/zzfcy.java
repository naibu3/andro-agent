package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfcy implements zzepr {
    final /* synthetic */ zzfcz zza;

    zzfcy(zzfcz zzfczVar) {
        this.zza = zzfczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrz zzcrzVar = (zzcrz) obj;
        synchronized (this.zza) {
            zzcrz zzcrzVar2 = this.zza.zza;
            if (zzcrzVar2 != null) {
                zzcrzVar2.zzb();
            }
            zzfcz zzfczVar = this.zza;
            zzfczVar.zza = zzcrzVar;
            zzcrzVar.zzc(zzfczVar);
            zzfcz zzfczVar2 = this.zza;
            zzfczVar2.zzg.zzk(new zzcsa(zzcrzVar, zzfczVar2, zzfczVar2.zzg, zzfczVar2.zzi));
            zzcrzVar.zzj();
        }
    }
}
