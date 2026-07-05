package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfld {
    public static final zzflk zza(Callable callable, Object obj, zzfll zzfllVar) {
        return zzb(callable, zzfllVar.zzb, obj, zzfllVar);
    }

    public static final zzflk zzb(Callable callable, zzgge zzggeVar, Object obj, zzfll zzfllVar) {
        return new zzflk(zzfllVar, obj, zzfll.zza, Collections.emptyList(), zzggeVar.zzb(callable));
    }

    public static final zzflk zzc(ListenableFuture listenableFuture, Object obj, zzfll zzfllVar) {
        return new zzflk(zzfllVar, obj, zzfll.zza, Collections.emptyList(), listenableFuture);
    }

    public static final zzflk zzd(final zzfkx zzfkxVar, zzgge zzggeVar, Object obj, zzfll zzfllVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzflc
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzfkxVar.zza();
                return null;
            }
        }, zzggeVar, obj, zzfllVar);
    }
}
