package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzewe implements zzexw {
    private final zzexw zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzewe(zzexw zzexwVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzexwVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzci)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            listenableFutureZzb = zzgft.zzo(listenableFutureZzb, j, timeUnit, this.zzc);
        }
        return zzgft.zzf(listenableFutureZzb, Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzewd
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, zzcci.zzf);
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzch)).booleanValue()) {
            zzexw zzexwVar = this.zza;
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "OptionalSignalTimeout:" + zzexwVar.zza());
        }
        return zzgft.zzh(null);
    }
}
