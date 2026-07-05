package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaqp implements Runnable {
    final /* synthetic */ zzare zza;
    final /* synthetic */ zzaqq zzb;

    zzaqp(zzaqq zzaqqVar, zzare zzareVar) {
        this.zza = zzareVar;
        this.zzb = zzaqqVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
