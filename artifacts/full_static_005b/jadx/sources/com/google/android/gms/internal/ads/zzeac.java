package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeac {
    private final ScheduledExecutorService zza;
    private final zzgge zzb;
    private final zzgge zzc;
    private final zzeau zzd;
    private final zzhkj zze;

    public zzeac(ScheduledExecutorService scheduledExecutorService, zzgge zzggeVar, zzgge zzggeVar2, zzeau zzeauVar, zzhkj zzhkjVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzggeVar;
        this.zzc = zzggeVar2;
        this.zzd = zzeauVar;
        this.zze = zzhkjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzebi zza(zzbxu zzbxuVar) throws Exception {
        return (zzebi) this.zzd.zza(zzbxuVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfF)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ ListenableFuture zzb(final zzbxu zzbxuVar, int i, Throwable th) throws Exception {
        return zzgft.zzn(((zzedq) this.zze.zzb()).zzd(zzbxuVar, i), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdzz
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzgft.zzh(new zzebi((InputStream) obj, zzbxuVar));
            }
        }, this.zzb);
    }

    public final ListenableFuture zzc(final zzbxu zzbxuVar) {
        ListenableFuture listenableFutureZzb;
        String str = zzbxuVar.zzd;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzC(str)) {
            listenableFutureZzb = zzgft.zzg(new zzebh(1));
        } else {
            listenableFutureZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhH)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeaa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zza(zzbxuVar);
                }
            }) : this.zzd.zza(zzbxuVar);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgft.zzf((zzgfk) zzgft.zzo(zzgfk.zzu(listenableFutureZzb), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfF)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeab
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzbxuVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}
