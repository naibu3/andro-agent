package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzemo implements zzehr {
    private final Context zza;
    private final Executor zzb;
    private final zzdrm zzc;

    public zzemo(Context context, Executor executor, zzdrm zzdrmVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdrmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) {
        try {
            ((zzfim) zzehoVar.zzb).zzk(zzfhfVar.zza.zza.zzd, zzfgtVar.zzw.toString());
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzehoVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, final zzeho zzehoVar) throws zzfhv, zzelj {
        zzdri zzdriVarZze = this.zzc.zze(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdrj(new zzdjp() { // from class: com.google.android.gms.internal.ads.zzemk
            @Override // com.google.android.gms.internal.ads.zzdjp
            public final void zza(boolean z, Context context, zzczy zzczyVar) throws zzdjo {
                zzeho zzehoVar2 = zzehoVar;
                try {
                    ((zzfim) zzehoVar2.zzb).zzv(z);
                    ((zzfim) zzehoVar2.zzb).zzA();
                } catch (zzfhv e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot show rewarded video.", e);
                    throw new zzdjo(e.getCause());
                }
            }
        }));
        zzdriVarZze.zzd().zzo(new zzcpt((zzfim) zzehoVar.zzb), this.zzb);
        zzdas zzdasVarZze = zzdriVarZze.zze();
        zzczj zzczjVarZzb = zzdriVarZze.zzb();
        ((zzeji) zzehoVar.zzc).zzc(new zzemn(this, zzdriVarZze.zza(), zzczjVarZzb, zzdasVarZze, zzdriVarZze.zzg()));
        return zzdriVarZze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        if (((zzfim) zzehoVar.zzb).zzC()) {
            zze(zzfhfVar, zzfgtVar, zzehoVar);
            return;
        }
        ((zzeji) zzehoVar.zzc).zzd(new zzemm(this, zzfhfVar, zzfgtVar, zzehoVar));
        Object obj = zzehoVar.zzb;
        Context context = this.zza;
        zzfho zzfhoVar = zzfhfVar.zza.zza;
        ((zzfim) obj).zzh(context, zzfhoVar.zzd, null, (zzbys) zzehoVar.zzc, zzfgtVar.zzw.toString());
    }
}
