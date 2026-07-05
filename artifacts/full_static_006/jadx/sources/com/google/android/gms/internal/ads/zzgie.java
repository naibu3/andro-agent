package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgie {
    public static zzghx zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgwm zzgwmVarZzf = zzgwm.zzf(bArr, zzhay.zza());
            zzgpl zzgplVarZzc = zzgpl.zzc();
            zzgqm zzgqmVarZza = zzgqm.zza(zzgwmVarZzf);
            return !zzgplVarZzc.zzk(zzgqmVarZza) ? new zzgov(zzgqmVarZza) : zzgplVarZzc.zzb(zzgqmVarZza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zzb(zzghx zzghxVar) throws GeneralSecurityException {
        return ((zzgqm) zzgpl.zzc().zze(zzghxVar, zzgqm.class)).zzc().zzaV();
    }
}
