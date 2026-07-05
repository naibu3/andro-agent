package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzesu implements zzexw {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzexw zzc;
    private final long zzd;

    public zzesu(zzexw zzexwVar, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzexwVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        zzest zzestVar = (zzest) this.zza.get();
        if (zzestVar == null || zzestVar.zza()) {
            zzexw zzexwVar = this.zzc;
            zzest zzestVar2 = new zzest(zzexwVar.zzb(), this.zzd, this.zzb);
            this.zza.set(zzestVar2);
            zzestVar = zzestVar2;
        }
        return zzestVar.zza;
    }
}
