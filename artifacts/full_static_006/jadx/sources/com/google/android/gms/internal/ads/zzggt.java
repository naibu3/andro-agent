package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzggt extends zzgfj implements RunnableFuture {

    @CheckForNull
    private volatile zzggc zza;

    zzggt(zzgez zzgezVar) {
        this.zza = new zzggr(this, zzgezVar);
    }

    static zzggt zze(Runnable runnable, Object obj) {
        return new zzggt(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzggc zzggcVar = this.zza;
        if (zzggcVar != null) {
            zzggcVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    @CheckForNull
    protected final String zza() {
        zzggc zzggcVar = this.zza;
        if (zzggcVar == null) {
            return super.zza();
        }
        return "task=[" + zzggcVar.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    protected final void zzb() {
        zzggc zzggcVar;
        if (zzt() && (zzggcVar = this.zza) != null) {
            zzggcVar.zzh();
        }
        this.zza = null;
    }

    zzggt(Callable callable) {
        this.zza = new zzggs(this, callable);
    }
}
