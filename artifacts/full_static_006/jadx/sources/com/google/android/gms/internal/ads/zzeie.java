package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeie implements zzehr {
    private final Context zza;
    private final zzcrt zzb;

    zzeie(Context context, zzcrt zzcrtVar) {
        this.zza = context;
        this.zzb = zzcrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv, zzelj {
        zzejq zzejqVar = new zzejq(zzfgtVar, (zzbte) zzehoVar.zzb, AdFormat.APP_OPEN_AD);
        zzcrq zzcrqVarZza = this.zzb.zza(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdik(zzejqVar, null), new zzcrr(zzfgtVar.zzab));
        zzejqVar.zzb(zzcrqVarZza.zzc());
        ((zzejh) zzehoVar.zzc).zzc(zzcrqVarZza.zzj());
        return zzcrqVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        try {
            ((zzbte) zzehoVar.zzb).zzq(zzfgtVar.zzaa);
            ((zzbte) zzehoVar.zzb).zzi(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeid(zzehoVar, null), (zzbrl) zzehoVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfhv(e);
        }
    }
}
