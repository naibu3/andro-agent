package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzekp {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcus zzc;
    private final zzelf zzd;
    private final zzfoa zze;
    private final zzggm zzf = zzggm.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzekq zzh;
    private zzfhf zzi;

    zzekp(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcus zzcusVar, zzelf zzelfVar, zzfoa zzfoaVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcusVar;
        this.zzd = zzelfVar;
        this.zze = zzfoaVar;
    }

    private final synchronized ListenableFuture zzd(zzfgt zzfgtVar) {
        Iterator it = zzfgtVar.zza.iterator();
        while (it.hasNext()) {
            zzehl zzehlVarZza = this.zzc.zza(zzfgtVar.zzb, (String) it.next());
            if (zzehlVarZza != null && zzehlVarZza.zzb(this.zzi, zzfgtVar)) {
                return zzgft.zzo(zzehlVarZza.zza(this.zzi, zzfgtVar), zzfgtVar.zzS, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgft.zzg(new zzdzd(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(zzfgt zzfgtVar) {
        ListenableFuture listenableFutureZzd = zzd(zzfgtVar);
        this.zzd.zzf(this.zzi, zzfgtVar, listenableFutureZzd, this.zze);
        zzgft.zzr(listenableFutureZzd, new zzeko(this, zzfgtVar), this.zza);
    }

    public final synchronized ListenableFuture zzb(zzfhf zzfhfVar) {
        if (!this.zzg.getAndSet(true)) {
            if (zzfhfVar.zzb.zza.isEmpty()) {
                this.zzf.zzd(new zzelj(3, zzelm.zzc(zzfhfVar)));
            } else {
                this.zzi = zzfhfVar;
                this.zzh = new zzekq(zzfhfVar, this.zzd, this.zzf);
                this.zzd.zzk(zzfhfVar.zzb.zza);
                zzfgt zzfgtVarZza = this.zzh.zza();
                while (zzfgtVarZza != null) {
                    zze(zzfgtVarZza);
                    zzfgtVarZza = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }
}
