package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzevf implements zzexw {
    private final zzgge zza;
    private final zzdya zzb;

    zzevf(zzgge zzggeVar, zzdya zzdyaVar) {
        this.zza = zzggeVar;
        this.zzb = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeve
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzevg zzc() throws Exception {
        zzdya zzdyaVar = this.zzb;
        String strZzc = zzdyaVar.zzc();
        boolean zZzr = zzdyaVar.zzr();
        boolean zZzl = com.google.android.gms.ads.internal.zzu.zzs().zzl();
        zzdya zzdyaVar2 = this.zzb;
        return new zzevg(strZzc, zZzr, zZzl, zzdyaVar2.zzp(), zzdyaVar2.zzs());
    }
}
