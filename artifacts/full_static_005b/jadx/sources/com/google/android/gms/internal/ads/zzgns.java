package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgns implements zzggy {
    private final zzggy zza;
    private final byte[] zzb;

    private zzgns(zzggy zzggyVar, byte[] bArr) {
        this.zza = zzggyVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzggy zzb(zzgou zzgouVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzgql zzgqlVarZza = zzgouVar.zza(zzghh.zza());
        zzgwe zzgweVarZza = zzgwh.zza();
        zzgweVarZza.zzb(zzgqlVarZza.zzg());
        zzgweVarZza.zzc(zzgqlVarZza.zze());
        zzgweVarZza.zza(zzgqlVarZza.zzb());
        zzggy zzggyVar = (zzggy) zzgib.zzb((zzgwh) zzgweVarZza.zzbr(), zzggy.class);
        zzgxn zzgxnVarZzc = zzgqlVarZza.zzc();
        zzgxn zzgxnVar = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgxnVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzgpm.zzb(zzgouVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzgpm.zza(zzgouVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(zzgxnVarZzc))));
            }
            bArrZzc = zzgpm.zza(zzgouVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzgpm.zza.zzc();
        }
        return new zzgns(zzggyVar, bArrZzc);
    }

    public static zzggy zzc(zzggy zzggyVar, zzgze zzgzeVar) {
        return new zzgns(zzggyVar, zzgzeVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzggy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgra.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
