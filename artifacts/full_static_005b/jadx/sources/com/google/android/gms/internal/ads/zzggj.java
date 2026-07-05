package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzggj extends zzggg implements ScheduledExecutorService, zzgge {
    final ScheduledExecutorService zza;

    zzggj(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzggt zzggtVarZze = zzggt.zze(runnable, null);
        return new zzggh(zzggtVarZze, scheduledExecutorService.schedule(zzggtVarZze, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzggi zzggiVar = new zzggi(runnable);
        return new zzggh(zzggiVar, this.zza.scheduleAtFixedRate(zzggiVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzggi zzggiVar = new zzggi(runnable);
        return new zzggh(zzggiVar, this.zza.scheduleWithFixedDelay(zzggiVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzggt zzggtVar = new zzggt(callable);
        return new zzggh(zzggtVar, this.zza.schedule(zzggtVar, j, timeUnit));
    }
}
