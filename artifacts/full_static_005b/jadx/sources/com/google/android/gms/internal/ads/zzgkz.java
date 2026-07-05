package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgkz {
    public static final /* synthetic */ int zza = 0;
    private static final zzghj zzb = zzgos.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzggy.class, zzgwg.SYMMETRIC, zzgxi.zzg());
    private static final zzgpa zzc = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgkx
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            return zzgli.zza((zzglo) zzghxVar, num);
        }
    };
    private static final zzgpy zzd = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgky
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) throws GeneralSecurityException {
            zzgli zzgliVar = (zzgli) zzghiVar;
            int i = zzgkz.zza;
            String strZzd = zzgliVar.zzb().zzd();
            zzgii zzgiiVarZzb = zzgliVar.zzb().zzb();
            zzggy zzggyVarZzb = zzghv.zza(strZzd).zzb();
            int i2 = zzgkw.zza;
            try {
                return zzgns.zzc(new zzgkw(zzgwm.zzf(zzgie.zzb(zzgiiVarZzb), zzhay.zza()), zzggyVarZzb), zzgliVar.zzc());
            } catch (zzhcd e) {
                throw new GeneralSecurityException(e);
            }
        }
    }, zzgli.class, zzggy.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgoc.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i = zzglt.zza;
        zzglt.zze(zzgpl.zzc());
        zzgpb.zzb().zzc(zzc, zzglo.class);
        zzgpi.zza().zze(zzd);
        zzgoj.zzc().zzd(zzb, true);
    }
}
