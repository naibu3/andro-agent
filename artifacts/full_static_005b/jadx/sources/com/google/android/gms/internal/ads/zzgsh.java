package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgsh {

    @Deprecated
    static final zzgxq zza;

    @Deprecated
    static final zzgxq zzb;

    @Deprecated
    static final zzgxq zzc;

    static {
        zzgxq zzgxqVarZzc = zzgxq.zzc();
        zza = zzgxqVarZzc;
        zzb = zzgxqVarZzc;
        zzc = zzgxqVarZzc;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgsn.zzd();
        zzgrr.zzd();
        zzgsa.zza(true);
        if (zzgod.zzb()) {
            return;
        }
        zzgri.zzd(true);
    }
}
