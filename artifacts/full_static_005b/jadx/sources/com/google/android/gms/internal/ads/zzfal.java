package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfal implements zzexw {
    final zzgge zza;
    final String zzb;
    final zzcbm zzc;

    public zzfal(zzcbm zzcbmVar, zzgge zzggeVar, String str) {
        this.zzc = zzcbmVar;
        this.zza = zzggeVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        final ListenableFuture listenableFutureZzh = zzgft.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfX)).booleanValue()) {
            listenableFutureZzh = zzgft.zzh(null);
        }
        final ListenableFuture listenableFutureZzh2 = zzgft.zzh(null);
        return zzgft.zzc(listenableFutureZzh, listenableFutureZzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfak
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzfam((String) listenableFutureZzh.get(), (String) listenableFutureZzh2.get());
            }
        }, zzcci.zza);
    }
}
