package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcms implements zzfez {
    private final zzcla zza;
    private final zzcms zzb = this;
    private final zzhky zzc;
    private final zzhky zzd;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;
    private final zzhky zzi;

    /* synthetic */ zzcms(zzcla zzclaVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcmr zzcmrVar) {
        this.zza = zzclaVar;
        zzhkp zzhkpVarZza = zzhkq.zza(context);
        this.zzc = zzhkpVarZza;
        zzhkp zzhkpVarZza2 = zzhkq.zza(zzqVar);
        this.zzd = zzhkpVarZza2;
        zzhkp zzhkpVarZza3 = zzhkq.zza(str);
        this.zze = zzhkpVarZza3;
        zzhky zzhkyVarZzc = zzhko.zzc(new zzepd(zzclaVar.zzM));
        this.zzf = zzhkyVarZzc;
        zzhky zzhkyVarZzc2 = zzhko.zzc(new zzffx(zzclaVar.zzaE));
        this.zzg = zzhkyVarZzc2;
        zzhky zzhkyVarZzc3 = zzhko.zzc(new zzfex(zzhkpVarZza, zzclaVar.zzc, zzclaVar.zzO, zzhkyVarZzc, zzhkyVarZzc2, zzfhq.zza()));
        this.zzh = zzhkyVarZzc3;
        this.zzi = zzhko.zzc(new zzepl(zzhkpVarZza, zzhkpVarZza2, zzhkpVarZza3, zzhkyVarZzc3, zzhkyVarZzc, zzhkyVarZzc2, zzclaVar.zzl, zzclaVar.zzQ, zzclaVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzfez
    public final zzepk zza() {
        return (zzepk) this.zzi.zzb();
    }
}
