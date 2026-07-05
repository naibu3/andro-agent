package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeia implements zzehr {
    private final Context zza;
    private final zzcrt zzb;
    private final Executor zzc;

    zzeia(Context context, zzcrt zzcrtVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcrtVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, final zzeho zzehoVar) throws zzfhv, zzelj {
        zzcrq zzcrqVarZza = this.zzb.zza(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdik(new zzdjp() { // from class: com.google.android.gms.internal.ads.zzehz
            @Override // com.google.android.gms.internal.ads.zzdjp
            public final void zza(boolean z, Context context, zzczy zzczyVar) throws zzdjo {
                zzeho zzehoVar2 = zzehoVar;
                try {
                    ((zzfim) zzehoVar2.zzb).zzv(z);
                    ((zzfim) zzehoVar2.zzb).zzw(context);
                } catch (zzfhv e) {
                    throw new zzdjo(e.getCause());
                }
            }
        }, null), new zzcrr(zzfgtVar.zzab));
        zzcrqVarZza.zzd().zzo(new zzcpt((zzfim) zzehoVar.zzb), this.zzc);
        ((zzejh) zzehoVar.zzc).zzc(zzcrqVarZza.zzk());
        return zzcrqVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        zzfim zzfimVar = (zzfim) zzehoVar.zzb;
        zzfho zzfhoVar = zzfhfVar.zza.zza;
        zzfimVar.zzl(this.zza, zzfhoVar.zzd, zzfgtVar.zzw.toString(), (zzbrl) zzehoVar.zzc);
    }
}
