package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcdd implements Runnable {
    final /* synthetic */ zzcdi zza;

    zzcdd(zzcdi zzcdiVar) {
        this.zza = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdi zzcdiVar = this.zza;
        if (zzcdiVar.zzq != null) {
            zzcdiVar.zzq.zzh();
        }
    }
}
