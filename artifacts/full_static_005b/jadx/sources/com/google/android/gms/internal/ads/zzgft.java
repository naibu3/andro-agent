package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgft extends zzgfv {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzgfs zza(Iterable iterable) {
        return new zzgfs(false, zzgbc.zzk(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgfs zzb(Iterable iterable) {
        int i = zzgbc.zzd;
        iterable.getClass();
        return new zzgfs(true, zzgbc.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgfs zzc(ListenableFuture... listenableFutureArr) {
        return new zzgfs(true, zzgbc.zzl(listenableFutureArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ListenableFuture zzd(Iterable iterable) {
        return new zzgfb(zzgbc.zzk(iterable), true);
    }

    public static ListenableFuture zze(ListenableFuture listenableFuture, Class cls, zzfxu zzfxuVar, Executor executor) {
        zzgee zzgeeVar = new zzgee(listenableFuture, cls, zzfxuVar);
        listenableFuture.addListener(zzgeeVar, zzggk.zzc(executor, zzgeeVar));
        return zzgeeVar;
    }

    public static ListenableFuture zzf(ListenableFuture listenableFuture, Class cls, zzgfa zzgfaVar, Executor executor) {
        zzged zzgedVar = new zzged(listenableFuture, cls, zzgfaVar);
        listenableFuture.addListener(zzgedVar, zzggk.zzc(executor, zzgedVar));
        return zzgedVar;
    }

    public static ListenableFuture zzh(Object obj) {
        return obj == null ? zzgfx.zza : new zzgfx(obj);
    }

    public static ListenableFuture zzi() {
        return zzgfx.zza;
    }

    public static ListenableFuture zzj(Callable callable, Executor executor) {
        zzggt zzggtVar = new zzggt(callable);
        executor.execute(zzggtVar);
        return zzggtVar;
    }

    public static ListenableFuture zzk(zzgez zzgezVar, Executor executor) {
        zzggt zzggtVar = new zzggt(zzgezVar);
        executor.execute(zzggtVar);
        return zzggtVar;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzgfb(zzgbc.zzl(listenableFutureArr), false);
    }

    public static ListenableFuture zzm(ListenableFuture listenableFuture, zzfxu zzfxuVar, Executor executor) {
        zzgeo zzgeoVar = new zzgeo(listenableFuture, zzfxuVar);
        listenableFuture.addListener(zzgeoVar, zzggk.zzc(executor, zzgeoVar));
        return zzgeoVar;
    }

    public static ListenableFuture zzn(ListenableFuture listenableFuture, zzgfa zzgfaVar, Executor executor) {
        int i = zzgep.zzc;
        executor.getClass();
        zzgen zzgenVar = new zzgen(listenableFuture, zzgfaVar);
        listenableFuture.addListener(zzgenVar, zzggk.zzc(executor, zzgenVar));
        return zzgenVar;
    }

    public static ListenableFuture zzo(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : zzggq.zzf(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzggv.zza(future);
        }
        throw new IllegalStateException(zzfyv.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzggv.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzgfi((Error) cause);
            }
            throw new zzggu(cause);
        }
    }

    public static ListenableFuture zzg(Throwable th) {
        th.getClass();
        return new zzgfw(th);
    }

    public static void zzr(ListenableFuture listenableFuture, zzgfp zzgfpVar, Executor executor) {
        zzgfpVar.getClass();
        listenableFuture.addListener(new zzgfq(listenableFuture, zzgfpVar), executor);
    }
}
