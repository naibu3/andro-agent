package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzflb {
    final /* synthetic */ zzfll zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzflb(zzfll zzfllVar, Object obj, List list, zzfla zzflaVar) {
        this.zza = zzfllVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzflk zza(Callable callable) {
        zzgfs zzgfsVarZzb = zzgft.zzb(this.zzc);
        ListenableFuture listenableFutureZza = zzgfsVarZzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfkz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcci.zzf);
        ListenableFuture listenableFutureZza2 = zzgfsVarZzb.zza(callable, this.zza.zzb);
        return new zzflk(this.zza, this.zzb, listenableFutureZza, this.zzc, listenableFutureZza2);
    }
}
