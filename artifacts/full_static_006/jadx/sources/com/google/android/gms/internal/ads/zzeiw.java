package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeiw implements zzehr {
    private final Context zza;
    private final zzctg zzb;
    private View zzc;
    private zzbro zzd;

    public zzeiw(Context context, zzctg zzctgVar) {
        this.zza = context;
        this.zzb = zzctgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, final zzfgt zzfgtVar, final zzeho zzehoVar) throws zzfhv, zzelj {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && zzfgtVar.zzah) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfhv(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeit
                            @Override // com.google.android.gms.internal.ads.zzgfa
                            public final ListenableFuture zza(Object obj) {
                                return this.zza.zzc(view, zzfgtVar, obj);
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
            view = this.zzc;
        }
        zzcsg zzcsgVarZza = this.zzb.zza(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzcsm(view, null, new zzcun() { // from class: com.google.android.gms.internal.ads.zzeis
            @Override // com.google.android.gms.internal.ads.zzcun
            public final com.google.android.gms.ads.internal.client.zzdq zza() throws zzfhv {
                try {
                    return ((zzbte) zzehoVar.zzb).zze();
                } catch (RemoteException e3) {
                    throw new zzfhv(e3);
                }
            }
        }, (zzfgu) zzfgtVar.zzv.get(0)));
        zzcsgVarZza.zzg().zza(view);
        ((zzejh) zzehoVar.zzc).zzc(zzcsgVarZza.zzj());
        return zzcsgVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        try {
            ((zzbte) zzehoVar.zzb).zzq(zzfgtVar.zzaa);
            zzeiu zzeiuVar = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && zzfgtVar.zzah) {
                ((zzbte) zzehoVar.zzb).zzk(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeiv(this, zzehoVar, zzeiuVar), (zzbrl) zzehoVar.zzc, zzfhfVar.zza.zza.zze);
            } else {
                ((zzbte) zzehoVar.zzb).zzj(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeiv(this, zzehoVar, zzeiuVar), (zzbrl) zzehoVar.zzc, zzfhfVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfhv(e);
        }
    }

    final /* synthetic */ ListenableFuture zzc(View view, zzfgt zzfgtVar, Object obj) throws Exception {
        return zzgft.zzh(zzcub.zza(this.zza, view, zzfgtVar));
    }
}
