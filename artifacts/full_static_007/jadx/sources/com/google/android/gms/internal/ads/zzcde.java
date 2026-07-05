package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcde implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcdi zzc;

    zzcde(zzcdi zzcdiVar, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdi zzcdiVar = this.zzc;
        if (zzcdiVar.zzq != null) {
            zzcdiVar.zzq.zzj(this.zza, this.zzb);
        }
    }
}
