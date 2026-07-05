package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeim implements zzehl {
    private final zzctg zza;
    private final Context zzb;
    private final zzdsd zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final zzfxu zzf;

    public zzeim(zzctg zzctgVar, Context context, Executor executor, zzdsd zzdsdVar, zzfho zzfhoVar, zzfxu zzfxuVar) {
        this.zzb = context;
        this.zza = zzctgVar;
        this.zze = executor;
        this.zzc = zzdsdVar;
        this.zzd = zzfhoVar;
        this.zzf = zzfxuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final ListenableFuture zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        return zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeil
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfhfVar, zzfgtVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzfgy zzfgyVar = zzfgtVar.zzt;
        return (zzfgyVar == null || zzfgyVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ListenableFuture zzc(zzfhf zzfhfVar, zzfgt zzfgtVar, Object obj) throws Exception {
        com.google.android.gms.ads.internal.client.zzq zzqVarZza = zzfhu.zza(this.zzb, zzfgtVar.zzv);
        final zzchd zzchdVarZza = this.zzc.zza(zzqVarZza, zzfgtVar, zzfhfVar.zzb.zzb);
        zzchdVarZza.zzac(zzfgtVar.zzX);
        View viewZza = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && zzfgtVar.zzah) ? zzcub.zza(this.zzb, (View) zzchdVarZza, zzfgtVar) : new zzdsg(this.zzb, (View) zzchdVarZza, (com.google.android.gms.ads.internal.util.zzau) this.zzf.apply(zzfgtVar));
        zzctg zzctgVar = this.zza;
        zzcvf zzcvfVar = new zzcvf(zzfhfVar, zzfgtVar, null);
        Objects.requireNonNull(zzchdVarZza);
        final zzcsg zzcsgVarZza = zzctgVar.zza(zzcvfVar, new zzcsm(viewZza, zzchdVarZza, new zzcun() { // from class: com.google.android.gms.internal.ads.zzeig
            @Override // com.google.android.gms.internal.ads.zzcun
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzchdVarZza.zzq();
            }
        }, zzfhu.zzb(zzqVarZza)));
        zzcsgVarZza.zzh().zzi(zzchdVarZza, false, null);
        zzcsgVarZza.zzc().zzo(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzeih
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zzr() {
                zzchd zzchdVar = zzchdVarZza;
                if (zzchdVar.zzN() != null) {
                    zzchdVar.zzN().zzr();
                }
            }
        }, zzcci.zzf);
        String strZzb = zzfgtVar.zzt.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && zzcsgVarZza.zzi().zze(true)) {
            strZzb = zzcio.zzb(strZzb, zzcio.zza(zzfgtVar));
        }
        zzcsgVarZza.zzh();
        ListenableFuture listenableFutureZzj = zzdsc.zzj(zzchdVarZza, zzfgtVar.zzt.zzb, strZzb);
        if (zzfgtVar.zzN) {
            Objects.requireNonNull(zzchdVarZza);
            listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeii
                @Override // java.lang.Runnable
                public final void run() {
                    zzchdVarZza.zzah();
                }
            }, this.zze);
        }
        listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeij
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(zzchdVarZza);
            }
        }, this.zze);
        return zzgft.zzm(listenableFutureZzj, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeik
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj2) {
                return zzcsgVarZza.zza();
            }
        }, zzcci.zzf);
    }

    final /* synthetic */ void zzd(zzchd zzchdVar) {
        zzchdVar.zzab();
        zzcif zzcifVarZzq = zzchdVar.zzq();
        com.google.android.gms.ads.internal.client.zzfk zzfkVar = this.zzd.zza;
        if (zzfkVar != null && zzcifVarZzq != null) {
            zzcifVarZzq.zzs(zzfkVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbj)).booleanValue() || zzchdVar.isAttachedToWindow()) {
            return;
        }
        zzchdVar.onPause();
        zzchdVar.zzav(true);
    }
}
