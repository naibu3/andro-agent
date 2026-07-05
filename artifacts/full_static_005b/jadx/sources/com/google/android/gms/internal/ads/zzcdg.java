package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcdg implements Runnable {
    final /* synthetic */ zzcdi zza;

    zzcdg(zzcdi zzcdiVar) {
        this.zza = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdi zzcdiVar = this.zza;
        if (zzcdiVar.zzq != null) {
            if (!zzcdiVar.zzr) {
                zzcdiVar.zzq.zzg();
                this.zza.zzr = true;
            }
            this.zza.zzq.zze();
        }
    }
}
