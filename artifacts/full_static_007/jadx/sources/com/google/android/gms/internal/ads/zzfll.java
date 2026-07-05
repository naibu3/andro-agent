package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzfll {
    private static final ListenableFuture zza = zzgft.zzh(null);
    private final zzgge zzb;
    private final ScheduledExecutorService zzc;
    private final zzflm zzd;

    public zzfll(zzgge zzggeVar, ScheduledExecutorService scheduledExecutorService, zzflm zzflmVar) {
        this.zzb = zzggeVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzflmVar;
    }

    public final zzflb zza(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzflb(this, obj, Arrays.asList(listenableFutureArr), null);
    }

    public final zzflk zzb(Object obj, ListenableFuture listenableFuture) {
        return new zzflk(this, obj, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture);
    }

    protected abstract String zzf(Object obj);
}
