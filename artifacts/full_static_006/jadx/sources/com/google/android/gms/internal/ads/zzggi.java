package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzggi extends zzgeh.zzi implements Runnable {
    private final Runnable zza;

    public zzggi(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    protected final String zza() {
        return "task=[" + this.zza.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }
}
