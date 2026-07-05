package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzekh implements zzehr {
    private final Context zza;
    private final zzdkd zzb;
    private final Executor zzc;

    public zzekh(Context context, zzdkd zzdkdVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdkdVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfhf zzfhfVar, int i) {
        return zzfhfVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv, zzelj {
        zzdlt zzdltVarZzah;
        zzbrq zzbrqVarZzD = ((zzfim) zzehoVar.zzb).zzD();
        zzbrr zzbrrVarZzE = ((zzfim) zzehoVar.zzb).zzE();
        zzbru zzbruVarZzd = ((zzfim) zzehoVar.zzb).zzd();
        if (zzbruVarZzd != null && zzc(zzfhfVar, 6)) {
            zzdltVarZzah = zzdlt.zzt(zzbruVarZzd);
        } else if (zzbrqVarZzD != null && zzc(zzfhfVar, 6)) {
            zzdltVarZzah = zzdlt.zzai(zzbrqVarZzD);
        } else if (zzbrqVarZzD != null && zzc(zzfhfVar, 2)) {
            zzdltVarZzah = zzdlt.zzag(zzbrqVarZzD);
        } else if (zzbrrVarZzE != null && zzc(zzfhfVar, 6)) {
            zzdltVarZzah = zzdlt.zzaj(zzbrrVarZzE);
        } else {
            if (zzbrrVarZzE == null || !zzc(zzfhfVar, 1)) {
                throw new zzelj(1, "No native ad mappers");
            }
            zzdltVarZzah = zzdlt.zzah(zzbrrVarZzE);
        }
        zzfho zzfhoVar = zzfhfVar.zza.zza;
        if (!zzfhoVar.zzg.contains(Integer.toString(zzdltVarZzah.zzc()))) {
            throw new zzelj(1, "No corresponding native ad listener");
        }
        zzdlv zzdlvVarZze = this.zzb.zze(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdmf(zzdltVarZzah), new zzdnw(zzbrrVarZzE, zzbrqVarZzD, zzbruVarZzd));
        ((zzejh) zzehoVar.zzc).zzc(zzdlvVarZze.zzk());
        zzdlvVarZze.zzd().zzo(new zzcpt((zzfim) zzehoVar.zzb), this.zzc);
        return zzdlvVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws JSONException, zzfhv, IOException {
        zzfim zzfimVar = (zzfim) zzehoVar.zzb;
        zzfho zzfhoVar = zzfhfVar.zza.zza;
        String string = zzfgtVar.zzw.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbw.zzm(zzfgtVar.zzt);
        zzbrl zzbrlVar = (zzbrl) zzehoVar.zzc;
        zzfho zzfhoVar2 = zzfhfVar.zza.zza;
        zzfimVar.zzp(this.zza, zzfhoVar.zzd, string, strZzm, zzbrlVar, zzfhoVar2.zzi, zzfhoVar2.zzg);
    }
}
