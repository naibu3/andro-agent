package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgfs {
    private final boolean zza;
    private final zzgbc zzb;

    /* synthetic */ zzgfs(boolean z, zzgbc zzgbcVar, zzgfr zzgfrVar) {
        this.zza = z;
        this.zzb = zzgbcVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzgfg(this.zzb, this.zza, executor, callable);
    }
}
