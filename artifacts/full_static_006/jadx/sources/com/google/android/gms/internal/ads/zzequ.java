package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzequ implements zzexw {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzequ(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzn = zzgft.zzn(this.zza, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeqq
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                final String str = (String) obj;
                return zzgft.zzh(new zzexv() { // from class: com.google.android.gms.internal.ads.zzeqp
                    @Override // com.google.android.gms.internal.ads.zzexv
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmv)).intValue() > 0) {
            listenableFutureZzn = zzgft.zzo(listenableFutureZzn, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmv)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgft.zzf(listenableFutureZzn, Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeqr
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? zzgft.zzh(new zzexv() { // from class: com.google.android.gms.internal.ads.zzeqs
                    @Override // com.google.android.gms.internal.ads.zzexv
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", Integer.toString(17));
                    }
                }) : zzgft.zzh(new zzexv() { // from class: com.google.android.gms.internal.ads.zzeqt
                    @Override // com.google.android.gms.internal.ads.zzexv
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", null);
                    }
                });
            }
        }, this.zzb);
    }
}
