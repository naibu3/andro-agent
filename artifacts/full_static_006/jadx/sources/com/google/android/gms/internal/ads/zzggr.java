package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzggr extends zzggc {
    final /* synthetic */ zzggt zza;
    private final zzgez zzb;

    zzggr(zzggt zzggtVar, zzgez zzgezVar) {
        this.zza = zzggtVar;
        this.zzb = zzgezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgez zzgezVar = this.zzb;
        ListenableFuture listenableFutureZza = zzgezVar.zza();
        zzfyg.zzd(listenableFutureZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgezVar);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    final boolean zzg() {
        return this.zza.isDone();
    }
}
