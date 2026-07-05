package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzggn implements Runnable {

    @CheckForNull
    zzggq zza;

    zzggn(zzggq zzggqVar) {
        this.zza = zzggqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture;
        zzggq zzggqVar = this.zza;
        if (zzggqVar == null || (listenableFuture = zzggqVar.zza) == null) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isDone()) {
            zzggqVar.zzs(listenableFuture);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzggqVar.zzb;
            zzggqVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzggqVar.zzd(new zzggp(str, null));
                    throw th;
                }
            }
            zzggqVar.zzd(new zzggp(str + ": " + listenableFuture.toString(), null));
        } finally {
            listenableFuture.cancel(true);
        }
    }
}
