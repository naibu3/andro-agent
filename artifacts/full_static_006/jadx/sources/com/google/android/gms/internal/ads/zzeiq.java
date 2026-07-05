package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeiq implements zzehr {
    private final Context zza;
    private final zzctg zzb;
    private final Executor zzc;

    public zzeiq(Context context, zzctg zzctgVar, Executor executor) {
        this.zza = context;
        this.zzb = zzctgVar;
        this.zzc = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, final zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv, zzelj {
        final View viewZza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && zzfgtVar.zzah) {
            zzbro zzbroVarZzc = ((zzfim) zzehoVar.zzb).zzc();
            if (zzbroVarZzc == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfhv(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbroVarZzc.zze());
                boolean zZzf = zzbroVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfhv(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeio
                            @Override // com.google.android.gms.internal.ads.zzgfa
                            public final ListenableFuture zza(Object obj) {
                                return this.zza.zzc(viewZza, zzfgtVar, obj);
                            }
                        }, zzcci.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfhv(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfhv(e2);
            }
        } else {
            viewZza = ((zzfim) zzehoVar.zzb).zza();
        }
        zzctg zzctgVar = this.zzb;
        zzcvf zzcvfVar = new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza);
        final zzfim zzfimVar = (zzfim) zzehoVar.zzb;
        Objects.requireNonNull(zzfimVar);
        zzcsg zzcsgVarZza = zzctgVar.zza(zzcvfVar, new zzcsm(viewZza, null, new zzcun() { // from class: com.google.android.gms.internal.ads.zzeip
            @Override // com.google.android.gms.internal.ads.zzcun
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzfimVar.zzb();
            }
        }, (zzfgu) zzfgtVar.zzv.get(0)));
        zzcsgVarZza.zzg().zza(viewZza);
        zzcsgVarZza.zzd().zzo(new zzcpt((zzfim) zzehoVar.zzb), this.zzc);
        ((zzejh) zzehoVar.zzc).zzc(zzcsgVarZza.zzk());
        return zzcsgVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzfhfVar.zza.zza.zze;
        if (zzqVar2.zzn) {
            zzqVar = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && zzfgtVar.zzah) ? new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : zzfhu.zza(this.zza, zzfgtVar.zzv);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar3 = zzqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && zzfgtVar.zzah) {
            Object obj = zzehoVar.zzb;
            ((zzfim) obj).zzn(this.zza, zzqVar3, zzfhfVar.zza.zza.zzd, zzfgtVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzm(zzfgtVar.zzt), (zzbrl) zzehoVar.zzc);
            return;
        }
        Object obj2 = zzehoVar.zzb;
        ((zzfim) obj2).zzm(this.zza, zzqVar3, zzfhfVar.zza.zza.zzd, zzfgtVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzm(zzfgtVar.zzt), (zzbrl) zzehoVar.zzc);
    }

    final /* synthetic */ ListenableFuture zzc(View view, zzfgt zzfgtVar, Object obj) throws Exception {
        return zzgft.zzh(zzcub.zza(this.zza, view, zzfgtVar));
    }
}
