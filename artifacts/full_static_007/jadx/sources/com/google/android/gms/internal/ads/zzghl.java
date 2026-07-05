package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzghl {
    public static final zzghx zza(zzghx zzghxVar) throws GeneralSecurityException {
        return zzghxVar != null ? zzghxVar : zzgie.zza(zzb(null).zzaV());
    }

    static final zzgwm zzb(zzghx zzghxVar) {
        try {
            return ((zzgqm) zzgpl.zzc().zze(null, zzgqm.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzgqz("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }
}
