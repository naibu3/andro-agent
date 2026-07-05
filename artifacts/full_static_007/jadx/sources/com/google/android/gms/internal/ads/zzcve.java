package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcve {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcve(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    static /* bridge */ /* synthetic */ void zzb(final zzcve zzcveVar, List list, final zzgfp zzgfpVar) {
        if (list == null || list.isEmpty()) {
            zzcveVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuz
                @Override // java.lang.Runnable
                public final void run() {
                    zzgfpVar.zza(new zzdzd(3));
                }
            });
            return;
        }
        ListenableFuture listenableFutureZzh = zzgft.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it.next();
            listenableFutureZzh = zzgft.zzn(zzgft.zzf(listenableFutureZzh, Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcva
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final ListenableFuture zza(Object obj) {
                    zzgfpVar.zza((Throwable) obj);
                    return zzgft.zzh(null);
                }
            }, zzcveVar.zza), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcvb
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zza(zzgfpVar, listenableFuture, (zzcup) obj);
                }
            }, zzcveVar.zza);
        }
        zzgft.zzr(listenableFutureZzh, new zzcvd(zzcveVar, zzgfpVar), zzcveVar.zza);
    }

    final /* synthetic */ ListenableFuture zza(zzgfp zzgfpVar, ListenableFuture listenableFuture, zzcup zzcupVar) throws Exception {
        if (zzcupVar != null) {
            zzgfpVar.zzb(zzcupVar);
        }
        return zzgft.zzo(listenableFuture, ((Long) zzbgx.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgfp zzgfpVar) {
        zzgft.zzr(this.zzc, new zzcvc(this, zzgfpVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
