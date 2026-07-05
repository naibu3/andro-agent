package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzglh {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgzeVarZzb = zzgra.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzgzeVarZzb;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgld
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzglh.zzd((zzglc) zzghxVar);
            }
        }, zzglc.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgle
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzglh.zzb((zzgqm) zzgqqVar);
            }
        }, zzgzeVarZzb, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzglf
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzglh.zzc((zzgla) zzghiVar, zzgicVar);
            }
        }, zzgla.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzglg
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzglh.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzgzeVarZzb, zzgql.class);
    }

    public static /* synthetic */ zzgla zza(zzgql zzgqlVar, zzgic zzgicVar) throws GeneralSecurityException {
        if (!zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzgxc zzgxcVarZze = zzgxc.zze(zzgqlVar.zze(), zzhay.zza());
            if (zzgxcVarZze.zza() == 0) {
                return zzgla.zza(zzglc.zzc(zzgxcVarZze.zzf().zzf(), zzf(zzgqlVar.zzc())), zzgqlVar.zzf());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(zzgxcVarZze));
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzglc zzb(zzgqm zzgqmVar) throws GeneralSecurityException {
        if (!zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
        }
        try {
            return zzglc.zzc(zzgxf.zze(zzgqmVar.zzc().zzh(), zzhay.zza()).zzf(), zzf(zzgqmVar.zzc().zzg()));
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ zzgql zzc(zzgla zzglaVar, zzgic zzgicVar) {
        zzgxb zzgxbVarZzc = zzgxc.zzc();
        zzgxe zzgxeVarZza = zzgxf.zza();
        zzgxeVarZza.zza(zzglaVar.zzb().zzd());
        zzgxbVarZzc.zza((zzgxf) zzgxeVarZza.zzbr());
        return zzgql.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzgxc) zzgxbVarZzc.zzbr()).zzaN(), zzgwg.REMOTE, zzg(zzglaVar.zzb().zzb()), zzglaVar.zzd());
    }

    public static /* synthetic */ zzgqm zzd(zzglc zzglcVar) {
        zzgwl zzgwlVarZza = zzgwm.zza();
        zzgwlVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzgxe zzgxeVarZza = zzgxf.zza();
        zzgxeVarZza.zza(zzglcVar.zzd());
        zzgwlVarZza.zzc(((zzgxf) zzgxeVarZza.zzbr()).zzaN());
        zzgwlVarZza.zza(zzg(zzglcVar.zzb()));
        return zzgqm.zzb((zzgwm) zzgwlVarZza.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzglb zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgxnVar.ordinal();
        if (iOrdinal == 1) {
            return zzglb.zza;
        }
        if (iOrdinal == 3) {
            return zzglb.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgxnVar.zza());
    }

    private static zzgxn zzg(zzglb zzglbVar) throws GeneralSecurityException {
        if (zzglb.zza.equals(zzglbVar)) {
            return zzgxn.TINK;
        }
        if (zzglb.zzb.equals(zzglbVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzglbVar.toString()));
    }
}
