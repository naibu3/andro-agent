package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcmw implements zzfgn {
    private final zzcla zza;
    private final zzcmw zzb = this;
    private final zzhky zzc;
    private final zzhky zzd;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;
    private final zzhky zzi;
    private final zzhky zzj;

    /* synthetic */ zzcmw(zzcla zzclaVar, Context context, String str, zzcmv zzcmvVar) {
        this.zza = zzclaVar;
        zzhkp zzhkpVarZza = zzhkq.zza(context);
        this.zzc = zzhkpVarZza;
        zzfen zzfenVar = new zzfen(zzhkpVarZza, zzclaVar.zzaE, zzclaVar.zzaF);
        this.zzd = zzfenVar;
        zzhky zzhkyVarZzc = zzhko.zzc(new zzffx(zzclaVar.zzaE));
        this.zze = zzhkyVarZzc;
        zzhky zzhkyVarZzc2 = zzhko.zzc(zzfhl.zza());
        this.zzf = zzhkyVarZzc2;
        zzhky zzhkyVarZzc3 = zzhko.zzc(new zzfgh(zzhkpVarZza, zzclaVar.zzc, zzclaVar.zzO, zzfenVar, zzhkyVarZzc, zzfhq.zza(), zzhkyVarZzc2));
        this.zzg = zzhkyVarZzc3;
        this.zzh = zzhko.zzc(new zzfgr(zzhkyVarZzc3, zzhkyVarZzc, zzhkyVarZzc2));
        zzhkp zzhkpVarZzc = zzhkq.zzc(str);
        this.zzi = zzhkpVarZzc;
        this.zzj = zzhko.zzc(new zzfgl(zzhkpVarZzc, zzhkyVarZzc3, zzhkpVarZza, zzhkyVarZzc, zzhkyVarZzc2, zzclaVar.zzl, zzclaVar.zzQ, zzclaVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzfgn
    public final zzfgk zza() {
        return (zzfgk) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfgn
    public final zzfgq zzb() {
        return (zzfgq) this.zzh.zzb();
    }
}
