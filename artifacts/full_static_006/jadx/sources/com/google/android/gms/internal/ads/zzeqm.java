package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeqm implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;
    private final zzfid zzc;

    zzeqm(zzgge zzggeVar, zzfho zzfhoVar, zzfid zzfidVar) {
        this.zza = zzggeVar;
        this.zzb = zzfhoVar;
        this.zzc = zzfidVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeql
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzeqn zzc() throws Exception {
        String strZza = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhr)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzc(this.zzb.zzd))) {
            strZza = zzfid.zza();
        }
        return new zzeqn(strZza);
    }
}
