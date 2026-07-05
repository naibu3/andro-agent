package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzejw implements zzehr {
    private final Context zza;
    private final zzdjh zzb;

    public zzejw(Context context, zzdjh zzdjhVar) {
        this.zza = context;
        this.zzb = zzdjhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv, zzelj {
        zzejq zzejqVar = new zzejq(zzfgtVar, (zzbte) zzehoVar.zzb, AdFormat.INTERSTITIAL);
        zzdih zzdihVarZze = this.zzb.zze(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdik(zzejqVar, null));
        zzejqVar.zzb(zzdihVarZze.zzc());
        ((zzejh) zzehoVar.zzc).zzc(zzdihVarZze.zzj());
        return zzdihVarZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        try {
            ((zzbte) zzehoVar.zzb).zzq(zzfgtVar.zzaa);
            ((zzbte) zzehoVar.zzb).zzl(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejv(this, zzehoVar, null), (zzbrl) zzehoVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfhv(e);
        }
    }
}
