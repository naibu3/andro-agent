package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcxp implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzcxp(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcws zzcwsVar = (zzcws) this.zza.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        zzgbh zzgbhVarZzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfK)).booleanValue() ? zzgbh.zzo(new zzdha(zzcwsVar, zzggeVar)) : zzgbh.zzn();
        zzhkx.zzb(zzgbhVarZzo);
        return zzgbhVarZzo;
    }
}
