package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzawv implements Runnable {
    final /* synthetic */ zzaww zza;

    zzawv(zzaww zzawwVar) {
        this.zza = zzawwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzp) {
            if (this.zza.zzq) {
                return;
            }
            this.zza.zzq = true;
            try {
                zzaww.zzj(this.zza);
            } catch (Exception e) {
                this.zza.zzh.zzc(2023, -1L, e);
            }
            synchronized (this.zza.zzp) {
                this.zza.zzq = false;
            }
        }
    }
}
