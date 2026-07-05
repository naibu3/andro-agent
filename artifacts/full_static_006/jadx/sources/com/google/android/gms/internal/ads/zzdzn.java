package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdzn implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzdzn(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzaxd zzaxdVar = (zzaxd) this.zza.zzb();
        final Context contextZza = ((zzcjj) this.zzb).zza();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        ListenableFuture listenableFutureZzb = zzggeVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzaxdVar.zzc().zzg(contextZza);
            }
        });
        zzhkx.zzb(listenableFutureZzb);
        return listenableFutureZzb;
    }
}
