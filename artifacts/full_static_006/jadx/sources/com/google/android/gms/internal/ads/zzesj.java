package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzesj implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;

    zzesj(zzgge zzggeVar, zzfho zzfhoVar) {
        this.zza = zzggeVar;
        this.zzb = zzfhoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 58;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return zzgft.zzh(new zzesk(this.zzb.zzp));
    }
}
