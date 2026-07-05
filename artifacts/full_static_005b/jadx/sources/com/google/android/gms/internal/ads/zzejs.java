package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzejs implements zzehr {
    private final Context zza;
    private final zzdjh zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzejs(Context context, VersionInfoParcel versionInfoParcel, zzdjh zzdjhVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdjhVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, final zzeho zzehoVar) throws zzfhv, zzelj {
        zzdih zzdihVarZze = this.zzb.zze(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdik(new zzdjp() { // from class: com.google.android.gms.internal.ads.zzejr
            @Override // com.google.android.gms.internal.ads.zzdjp
            public final void zza(boolean z, Context context, zzczy zzczyVar) throws zzdjo {
                this.zza.zzc(zzehoVar, z, context, zzczyVar);
            }
        }, null));
        zzdihVarZze.zzd().zzo(new zzcpt((zzfim) zzehoVar.zzb), this.zzd);
        ((zzejh) zzehoVar.zzc).zzc(zzdihVarZze.zzk());
        return zzdihVarZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws JSONException, zzfhv, IOException {
        zzfim zzfimVar = (zzfim) zzehoVar.zzb;
        zzfho zzfhoVar = zzfhfVar.zza.zza;
        zzfimVar.zzo(this.zza, zzfhoVar.zzd, zzfgtVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzm(zzfgtVar.zzt), (zzbrl) zzehoVar.zzc);
    }

    final /* synthetic */ void zzc(zzeho zzehoVar, boolean z, Context context, zzczy zzczyVar) throws zzdjo {
        try {
            ((zzfim) zzehoVar.zzb).zzv(z);
            if (this.zzc.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaI)).intValue()) {
                ((zzfim) zzehoVar.zzb).zzx();
            } else {
                ((zzfim) zzehoVar.zzb).zzy(context);
            }
        } catch (zzfhv e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Cannot show interstitial.");
            throw new zzdjo(e.getCause());
        }
    }
}
