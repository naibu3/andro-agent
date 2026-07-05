package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgee extends zzgef {
    zzgee(ListenableFuture listenableFuture, Class cls, zzfxu zzfxuVar) {
        super(listenableFuture, cls, zzfxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgef
    final /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        return ((zzfxu) obj).apply(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgef
    final void zzf(Object obj) {
        zzc(obj);
    }
}
