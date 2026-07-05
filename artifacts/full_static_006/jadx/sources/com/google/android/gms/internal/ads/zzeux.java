package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeux implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;

    zzeux(zzgge zzggeVar, zzfho zzfhoVar) {
        this.zza = zzggeVar;
        this.zzb = zzfhoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzeuy zzc() throws Exception {
        return new zzeuy("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzc(this.zzb.zzd)));
    }
}
