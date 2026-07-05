package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgim implements zzghy {
    private static final zzgim zza = new zzgim();
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgij
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgns.zzb((zzgou) zzghiVar);
        }
    }, zzgou.class, zzggy.class);

    zzgim() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzgpi.zza().zzf(zza);
        zzgpi.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final Class zza() {
        return zzggy.class;
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final Class zzb() {
        return zzggy.class;
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final /* synthetic */ Object zzc(zzgqk zzgqkVar) throws GeneralSecurityException {
        return new zzgil(zzgqkVar, null);
    }
}
