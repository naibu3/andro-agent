package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzggf implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzgeh zzb;

    zzggf(Executor executor, zzgeh zzgehVar) {
        this.zza = executor;
        this.zzb = zzgehVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }
}
