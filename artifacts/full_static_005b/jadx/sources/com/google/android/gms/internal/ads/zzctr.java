package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzctr implements zzban {
    private final zzchd zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    zzctr(zzchd zzchdVar, Executor executor) {
        this.zza = zzchdVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final synchronized void zzdp(zzbam zzbamVar) {
        if (this.zza != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmA)).booleanValue()) {
                if (zzbamVar.zzj) {
                    if (!Boolean.TRUE.equals(this.zzc.getAndSet(true))) {
                        Executor executor = this.zzb;
                        final zzchd zzchdVar = this.zza;
                        Objects.requireNonNull(zzchdVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctp
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzchdVar.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!zzbamVar.zzj) {
                    if (!Boolean.FALSE.equals(this.zzc.getAndSet(false))) {
                        Executor executor2 = this.zzb;
                        final zzchd zzchdVar2 = this.zza;
                        Objects.requireNonNull(zzchdVar2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctq
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzchdVar2.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
