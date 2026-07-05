package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcdf implements Runnable {
    final /* synthetic */ zzcdi zza;

    zzcdf(zzcdi zzcdiVar) {
        this.zza = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdi zzcdiVar = this.zza;
        if (zzcdiVar.zzq != null) {
            zzcdiVar.zzq.zzd();
            this.zza.zzq.zzi();
        }
    }
}
