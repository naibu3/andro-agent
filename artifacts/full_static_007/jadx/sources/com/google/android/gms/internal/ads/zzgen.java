package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgen extends zzgep {
    zzgen(ListenableFuture listenableFuture, zzgfa zzgfaVar) {
        super(listenableFuture, zzgfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzgfa zzgfaVar = (zzgfa) obj;
        ListenableFuture listenableFutureZza = zzgfaVar.zza(obj2);
        zzfyg.zzd(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgfaVar);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}
