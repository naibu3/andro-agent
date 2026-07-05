package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgos implements zzghj {
    final String zza;
    final Class zzb;
    final zzgwg zzc;
    final zzhdm zzd;

    zzgos(String str, Class cls, zzgwg zzgwgVar, zzhdm zzhdmVar) {
        this.zzd = zzhdmVar;
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgwgVar;
    }

    public static zzghj zzd(String str, Class cls, zzgwg zzgwgVar, zzhdm zzhdmVar) {
        return new zzgos(str, cls, zzgwgVar, zzhdmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzghj
    public final zzgwh zza(zzhac zzhacVar) throws GeneralSecurityException {
        zzgwl zzgwlVarZza = zzgwm.zza();
        zzgwlVarZza.zzb(this.zza);
        zzgwlVarZza.zzc(zzhacVar);
        zzgwlVarZza.zza(zzgxn.RAW);
        zzgqq zzgqqVarZzd = zzgpl.zzc().zzd(zzgpb.zzb().zza(zzgpl.zzc().zzb(zzgqm.zza((zzgwm) zzgwlVarZza.zzbr())), null), zzgql.class, zzghh.zza());
        zzgwe zzgweVarZza = zzgwh.zza();
        zzgql zzgqlVar = (zzgql) zzgqqVarZzd;
        zzgweVarZza.zzb(zzgqlVar.zzg());
        zzgweVarZza.zzc(zzgqlVar.zze());
        zzgweVarZza.zza(zzgqlVar.zzb());
        return (zzgwh) zzgweVarZza.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzghj
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzghj
    public final Object zzc(zzhac zzhacVar) throws GeneralSecurityException {
        return zzgpi.zza().zzc(zzgpl.zzc().zza(zzgql.zza(this.zza, zzhacVar, this.zzc, zzgxn.RAW, null), zzghh.zza()), this.zzb);
    }
}
