package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfap implements zzexw {
    final zzgge zza;
    final List zzb;
    final zzbdy zzc;

    public zzfap(zzbdy zzbdyVar, zzgge zzggeVar, List list) {
        this.zzc = zzbdyVar;
        this.zza = zzggeVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzfaq(this.zza.zzb);
            }
        });
    }
}
