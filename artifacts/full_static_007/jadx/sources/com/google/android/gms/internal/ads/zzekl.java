package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzekl implements zzehr {
    private final Context zza;
    private final zzdkd zzb;
    private zzbru zzc;
    private final VersionInfoParcel zzd;

    public zzekl(Context context, zzdkd zzdkdVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdkdVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv, zzelj {
        if (!zzfhfVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzelj(2, "Unified must be used for RTB.");
        }
        zzdlt zzdltVarZzt = zzdlt.zzt(this.zzc);
        zzfho zzfhoVar = zzfhfVar.zza.zza;
        if (!zzfhoVar.zzg.contains(Integer.toString(zzdltVarZzt.zzc()))) {
            throw new zzelj(1, "No corresponding native ad listener");
        }
        zzdlv zzdlvVarZze = this.zzb.zze(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdmf(zzdltVarZzt), new zzdnw(null, null, this.zzc));
        ((zzejh) zzehoVar.zzc).zzc(zzdlvVarZze.zzj());
        return zzdlvVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        try {
            ((zzbte) zzehoVar.zzb).zzq(zzfgtVar.zzaa);
            zzekj zzekjVar = null;
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbI)).intValue()) {
                ((zzbte) zzehoVar.zzb).zzm(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzekk(this, zzehoVar, zzekjVar), (zzbrl) zzehoVar.zzc);
            } else {
                ((zzbte) zzehoVar.zzb).zzn(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzekk(this, zzehoVar, zzekjVar), (zzbrl) zzehoVar.zzc, zzfhfVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfhv(e);
        }
    }
}
