package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzglt {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgzeVarZzb = zzgra.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzgzeVarZzb;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzglp
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzglt.zzd((zzglo) zzghxVar);
            }
        }, zzglo.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzglq
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzglt.zzb((zzgqm) zzgqqVar);
            }
        }, zzgzeVarZzb, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzglr
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzglt.zzc((zzgli) zzghiVar, zzgicVar);
            }
        }, zzgli.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgls
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzglt.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzgzeVarZzb, zzgql.class);
    }

    public static /* synthetic */ zzgli zza(zzgql zzgqlVar, zzgic zzgicVar) throws GeneralSecurityException {
        if (!zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzgxi zzgxiVarZze = zzgxi.zze(zzgqlVar.zze(), zzhay.zza());
            if (zzgxiVarZze.zza() == 0) {
                return zzgli.zza(zzf(zzgxiVarZze.zzf(), zzgqlVar.zzc()), zzgqlVar.zzf());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(zzgxiVarZze));
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzglo zzb(zzgqm zzgqmVar) throws GeneralSecurityException {
        if (!zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
        }
        try {
            return zzf(zzgxl.zzf(zzgqmVar.zzc().zzh(), zzhay.zza()), zzgqmVar.zzc().zzg());
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ zzgql zzc(zzgli zzgliVar, zzgic zzgicVar) {
        zzgxh zzgxhVarZzc = zzgxi.zzc();
        zzgxhVarZzc.zza(zzg(zzgliVar.zzb()));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgxi) zzgxhVarZzc.zzbr()).zzaN(), zzgwg.REMOTE, zzh(zzgliVar.zzb().zzc()), zzgliVar.zzd());
    }

    public static /* synthetic */ zzgqm zzd(zzglo zzgloVar) {
        zzgwl zzgwlVarZza = zzgwm.zza();
        zzgwlVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzgwlVarZza.zzc(zzg(zzgloVar).zzaN());
        zzgwlVarZza.zza(zzh(zzgloVar.zzc()));
        return zzgqm.zzb((zzgwm) zzgwlVarZza.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzglo zzf(zzgxl zzgxlVar, zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgll zzgllVar;
        zzglm zzglmVar;
        zzgwl zzgwlVarZza = zzgwm.zza();
        zzgwlVarZza.zzb(zzgxlVar.zza().zzi());
        zzgwlVarZza.zzc(zzgxlVar.zza().zzh());
        zzgwlVarZza.zza(zzgxn.RAW);
        zzghx zzghxVarZza = zzgie.zza(((zzgwm) zzgwlVarZza.zzbr()).zzaV());
        if (zzghxVarZza instanceof zzgjz) {
            zzgllVar = zzgll.zza;
        } else if (zzghxVarZza instanceof zzgks) {
            zzgllVar = zzgll.zzc;
        } else if (zzghxVarZza instanceof zzgmh) {
            zzgllVar = zzgll.zzb;
        } else if (zzghxVarZza instanceof zzgja) {
            zzgllVar = zzgll.zzd;
        } else if (zzghxVarZza instanceof zzgjm) {
            zzgllVar = zzgll.zze;
        } else {
            if (!(zzghxVarZza instanceof zzgkm)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzghxVarZza.toString()));
            }
            zzgllVar = zzgll.zzf;
        }
        zzglk zzglkVar = new zzglk(null);
        int iOrdinal = zzgxnVar.ordinal();
        if (iOrdinal == 1) {
            zzglmVar = zzglm.zza;
        } else {
            if (iOrdinal != 3) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgxnVar.zza());
            }
            zzglmVar = zzglm.zzb;
        }
        zzglkVar.zzd(zzglmVar);
        zzglkVar.zzc(zzgxlVar.zzg());
        zzglkVar.zza((zzgii) zzghxVarZza);
        zzglkVar.zzb(zzgllVar);
        return zzglkVar.zze();
    }

    private static zzgxl zzg(zzglo zzgloVar) throws GeneralSecurityException {
        try {
            zzgwm zzgwmVarZzf = zzgwm.zzf(zzgie.zzb(zzgloVar.zzb()), zzhay.zza());
            zzgxk zzgxkVarZzc = zzgxl.zzc();
            zzgxkVarZzc.zzb(zzgloVar.zzd());
            zzgxkVarZzc.zza(zzgwmVarZzf);
            return (zzgxl) zzgxkVarZzc.zzbr();
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzgxn zzh(zzglm zzglmVar) throws GeneralSecurityException {
        if (zzglm.zza.equals(zzglmVar)) {
            return zzgxn.TINK;
        }
        if (zzglm.zzb.equals(zzglmVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzglmVar))));
    }
}
