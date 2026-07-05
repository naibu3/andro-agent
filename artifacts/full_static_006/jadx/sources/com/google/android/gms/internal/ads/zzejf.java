package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzejf implements zzehl {
    private final zzctg zza;
    private final zzeim zzb;
    private final zzgge zzc;
    private final zzczn zzd;
    private final ScheduledExecutorService zze;
    private final zzdux zzf;

    public zzejf(zzctg zzctgVar, zzeim zzeimVar, zzczn zzcznVar, ScheduledExecutorService scheduledExecutorService, zzgge zzggeVar, zzdux zzduxVar) {
        this.zza = zzctgVar;
        this.zzb = zzeimVar;
        this.zzd = zzcznVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzggeVar;
        this.zzf = zzduxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final ListenableFuture zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzejd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(zzfhfVar, zzfgtVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzbjm zzbjmVarZza = zzfhfVar.zza.zza.zza();
        boolean zZzb = this.zzb.zzb(zzfhfVar, zzfgtVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlV)).booleanValue()) {
            this.zzf.zzb().put("has_dbl", zzbjmVarZza != null ? "1" : "0");
            this.zzf.zzb().put("crdb", true != zZzb ? "0" : "1");
        }
        return zzbjmVarZza != null && zZzb;
    }

    final /* synthetic */ zzcsf zzc(final zzfhf zzfhfVar, final zzfgt zzfgtVar) throws Exception {
        return this.zza.zzb(new zzcvf(zzfhfVar, zzfgtVar, null), new zzctx(zzfhfVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzejc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(zzfhfVar, zzfgtVar);
            }
        })).zza();
    }

    final /* synthetic */ void zzf(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzgft.zzr(zzgft.zzo(this.zzb.zza(zzfhfVar, zzfgtVar), zzfgtVar.zzS, TimeUnit.SECONDS, this.zze), new zzeje(this), this.zzc);
    }
}
