package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzggk {
    public static zzgge zza(ExecutorService executorService) {
        if (executorService instanceof zzgge) {
            return (zzgge) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzggj((ScheduledExecutorService) executorService) : new zzggg(executorService);
    }

    public static Executor zzb() {
        return zzgfh.INSTANCE;
    }

    static Executor zzc(Executor executor, zzgeh zzgehVar) {
        executor.getClass();
        return executor == zzgfh.INSTANCE ? executor : new zzggf(executor, zzgehVar);
    }
}
