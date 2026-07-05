package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgth implements zzghw {
    private final zzghw zza;
    private final zzgxn zzb;
    private final byte[] zzc;

    private zzgth(zzghw zzghwVar, zzgxn zzgxnVar, byte[] bArr) {
        this.zza = zzghwVar;
        this.zzb = zzgxnVar;
        this.zzc = bArr;
    }

    public static zzghw zza(zzgou zzgouVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzgql zzgqlVarZza = zzgouVar.zza(zzghh.zza());
        zzgwe zzgweVarZza = zzgwh.zza();
        zzgweVarZza.zzb(zzgqlVarZza.zzg());
        zzgweVarZza.zzc(zzgqlVarZza.zze());
        zzgweVarZza.zza(zzgqlVarZza.zzb());
        zzghw zzghwVar = (zzghw) zzgib.zzb((zzgwh) zzgweVarZza.zzbr(), zzghw.class);
        zzgxn zzgxnVarZzc = zzgqlVarZza.zzc();
        zzgxn zzgxnVar = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgxnVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzgpm.zzb(zzgouVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzgpm.zza(zzgouVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = zzgpm.zza(zzgouVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzgpm.zza.zzc();
        }
        return new zzgth(zzghwVar, zzgxnVarZzc, bArrZzc);
    }
}
