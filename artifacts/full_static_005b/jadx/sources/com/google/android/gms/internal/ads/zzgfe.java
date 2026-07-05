package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgfe extends zzgff {
    final /* synthetic */ zzgfg zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgfe(zzgfg zzgfgVar, Callable callable, Executor executor) {
        super(zzgfgVar, executor);
        this.zza = zzgfgVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgff
    final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
