package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcmi implements zzdwm {
    private final Context zza;
    private final zzbmo zzb;
    private final zzcla zzc;
    private final zzcmi zzd = this;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;

    /* synthetic */ zzcmi(zzcla zzclaVar, Context context, zzbmo zzbmoVar, zzcmh zzcmhVar) {
        this.zzc = zzclaVar;
        this.zza = context;
        this.zzb = zzbmoVar;
        zzhkp zzhkpVarZza = zzhkq.zza(this);
        this.zze = zzhkpVarZza;
        zzhkp zzhkpVarZza2 = zzhkq.zza(zzbmoVar);
        this.zzf = zzhkpVarZza2;
        zzdwi zzdwiVar = new zzdwi(zzhkpVarZza2);
        this.zzg = zzdwiVar;
        this.zzh = zzhko.zzc(new zzdwk(zzhkpVarZza, zzdwiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdwm
    public final zzdwd zzb() {
        return new zzcmc(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdwm
    public final zzdwj zzd() {
        return (zzdwj) this.zzh.zzb();
    }
}
