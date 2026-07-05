package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeup implements zzexw {
    private final zzgge zza;

    public zzeup(zzgge zzggeVar) {
        this.zza = zzggeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeuq(com.google.android.gms.ads.internal.zzu.zzs().zzb(), com.google.android.gms.ads.internal.zzu.zzs().zzm());
            }
        });
    }
}
