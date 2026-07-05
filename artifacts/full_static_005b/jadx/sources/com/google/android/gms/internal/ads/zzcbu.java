package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcbu extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcby zza;

    zzcbu(zzcby zzcbyVar) {
        this.zza = zzcbyVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcby zzcbyVar = this.zza;
        zzbes zzbesVar = new zzbes(zzcbyVar.zze, zzcbyVar.zzf.afmaVersion);
        synchronized (this.zza.zza) {
            try {
                com.google.android.gms.ads.internal.zzu.zze();
                zzbev.zza(this.zza.zzh, zzbesVar);
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
