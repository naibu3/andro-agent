package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzclk implements zzfbu {
    private final zzcla zza;
    private final zzclk zzb = this;
    private final zzhky zzc;
    private final zzhky zzd;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;

    /* synthetic */ zzclk(zzcla zzclaVar, Context context, String str, zzclj zzcljVar) {
        this.zza = zzclaVar;
        zzhkp zzhkpVarZza = zzhkq.zza(context);
        this.zzc = zzhkpVarZza;
        zzhkp zzhkpVarZza2 = zzhkq.zza(str);
        this.zzd = zzhkpVarZza2;
        zzfem zzfemVar = new zzfem(zzhkpVarZza, zzclaVar.zzaE, zzclaVar.zzaF);
        this.zze = zzfemVar;
        zzhky zzhkyVarZzc = zzhko.zzc(new zzfcs(zzclaVar.zzaE));
        this.zzf = zzhkyVarZzc;
        zzhky zzhkyVarZzc2 = zzhko.zzc(new zzfcu(zzhkpVarZza, zzclaVar.zzc, zzclaVar.zzO, zzfemVar, zzhkyVarZzc, zzfhq.zza(), zzclaVar.zzl));
        this.zzg = zzhkyVarZzc2;
        this.zzh = zzhko.zzc(new zzfda(zzclaVar.zzO, zzhkpVarZza, zzhkpVarZza2, zzhkyVarZzc2, zzhkyVarZzc, zzclaVar.zzl, zzclaVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzfbu
    public final zzfcz zza() {
        return (zzfcz) this.zzh.zzb();
    }
}
