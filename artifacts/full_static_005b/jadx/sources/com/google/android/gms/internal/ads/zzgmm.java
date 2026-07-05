package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgmm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgzeVarZzb = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzgzeVarZzb;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgmi
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgmm.zzd((zzgja) zzghxVar);
            }
        }, zzgja.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgmj
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgmm.zzb((zzgqm) zzgqqVar);
            }
        }, zzgzeVarZzb, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgmk
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgmm.zzc((zzgiq) zzghiVar, zzgicVar);
            }
        }, zzgiq.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgml
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgmm.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzgzeVarZzb, zzgql.class);
    }

    public static /* synthetic */ zzgiq zza(zzgql zzgqlVar, zzgic zzgicVar) throws GeneralSecurityException {
        if (!zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzgue zzgueVarZze = zzgue.zze(zzgqlVar.zze(), zzhay.zza());
            if (zzgueVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzgueVarZze.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzgueVarZze.zzg().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzgiw zzgiwVarZzf = zzgja.zzf();
            zzgiwVarZzf.zza(zzgueVarZze.zzf().zzg().zzd());
            zzgiwVarZzf.zzc(zzgueVarZze.zzg().zzh().zzd());
            zzgiwVarZzf.zzd(zzgueVarZze.zzf().zzf().zza());
            zzgiwVarZzf.zze(zzgueVarZze.zzg().zzg().zza());
            zzgiwVarZzf.zzb(zzf(zzgueVarZze.zzg().zzg().zzc()));
            zzgiwVarZzf.zzf(zzg(zzgqlVar.zzc()));
            zzgja zzgjaVarZzg = zzgiwVarZzf.zzg();
            zzgio zzgioVarZza = zzgiq.zza();
            zzgioVarZza.zzd(zzgjaVarZzg);
            zzgioVarZza.zza(zzgzf.zzb(zzgueVarZze.zzf().zzg().zzB(), zzgicVar));
            zzgioVarZza.zzb(zzgzf.zzb(zzgueVarZze.zzg().zzh().zzB(), zzgicVar));
            zzgioVarZza.zzc(zzgqlVar.zzf());
            return zzgioVarZza.zze();
        } catch (zzhcd unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzgja zzb(zzgqm zzgqmVar) throws GeneralSecurityException {
        if (!zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
        }
        try {
            zzguh zzguhVarZzd = zzguh.zzd(zzgqmVar.zzc().zzh(), zzhay.zza());
            if (zzguhVarZzd.zzf().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgiw zzgiwVarZzf = zzgja.zzf();
            zzgiwVarZzf.zza(zzguhVarZzd.zze().zza());
            zzgiwVarZzf.zzc(zzguhVarZzd.zzf().zza());
            zzgiwVarZzf.zzd(zzguhVarZzd.zze().zzf().zza());
            zzgiwVarZzf.zze(zzguhVarZzd.zzf().zzh().zza());
            zzgiwVarZzf.zzb(zzf(zzguhVarZzd.zzf().zzh().zzc()));
            zzgiwVarZzf.zzf(zzg(zzgqmVar.zzc().zzg()));
            return zzgiwVarZzf.zzg();
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgql zzc(zzgiq zzgiqVar, zzgic zzgicVar) {
        zzgud zzgudVarZzc = zzgue.zzc();
        zzguj zzgujVarZzc = zzguk.zzc();
        zzgup zzgupVarZzc = zzguq.zzc();
        zzgupVarZzc.zza(zzgiqVar.zzb().zzd());
        zzgujVarZzc.zzb((zzguq) zzgupVarZzc.zzbr());
        byte[] bArrZzd = zzgiqVar.zzd().zzd(zzgicVar);
        zzgujVarZzc.zza(zzhac.zzv(bArrZzd, 0, bArrZzd.length));
        zzgudVarZzc.zza((zzguk) zzgujVarZzc.zzbr());
        zzgvv zzgvvVarZzc = zzgvw.zzc();
        zzgvvVarZzc.zzb(zzh(zzgiqVar.zzb()));
        byte[] bArrZzd2 = zzgiqVar.zze().zzd(zzgicVar);
        zzgvvVarZzc.zza(zzhac.zzv(bArrZzd2, 0, bArrZzd2.length));
        zzgudVarZzc.zzb((zzgvw) zzgvvVarZzc.zzbr());
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgue) zzgudVarZzc.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzi(zzgiqVar.zzb().zzh()), zzgiqVar.zzf());
    }

    public static /* synthetic */ zzgqm zzd(zzgja zzgjaVar) {
        zzgwl zzgwlVarZza = zzgwm.zza();
        zzgwlVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgug zzgugVarZza = zzguh.zza();
        zzgum zzgumVarZzc = zzgun.zzc();
        zzgup zzgupVarZzc = zzguq.zzc();
        zzgupVarZzc.zza(zzgjaVar.zzd());
        zzgumVarZzc.zzb((zzguq) zzgupVarZzc.zzbr());
        zzgumVarZzc.zza(zzgjaVar.zzb());
        zzgugVarZza.zza((zzgun) zzgumVarZzc.zzbr());
        zzgvy zzgvyVarZzd = zzgvz.zzd();
        zzgvyVarZzd.zzb(zzh(zzgjaVar));
        zzgvyVarZzd.zza(zzgjaVar.zzc());
        zzgugVarZza.zzb((zzgvz) zzgvyVarZzd.zzbr());
        zzgwlVarZza.zzc(((zzguh) zzgugVarZza.zzbr()).zzaN());
        zzgwlVarZza.zza(zzi(zzgjaVar.zzh()));
        return zzgqm.zzb((zzgwm) zzgwlVarZza.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgix zzf(zzgvt zzgvtVar) throws GeneralSecurityException {
        zzgvt zzgvtVar2 = zzgvt.UNKNOWN_HASH;
        zzgxn zzgxnVar = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgvtVar.ordinal();
        if (iOrdinal == 1) {
            return zzgix.zza;
        }
        if (iOrdinal == 2) {
            return zzgix.zzd;
        }
        if (iOrdinal == 3) {
            return zzgix.zzc;
        }
        if (iOrdinal == 4) {
            return zzgix.zze;
        }
        if (iOrdinal == 5) {
            return zzgix.zzb;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzgvtVar.zza());
    }

    private static zzgiy zzg(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgvt zzgvtVar = zzgvt.UNKNOWN_HASH;
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgxnVar.ordinal();
        if (iOrdinal == 1) {
            return zzgiy.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgiy.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgxnVar.zza());
            }
        }
        return zzgiy.zzb;
    }

    private static zzgwc zzh(zzgja zzgjaVar) throws GeneralSecurityException {
        zzgvt zzgvtVar;
        zzgwb zzgwbVarZzd = zzgwc.zzd();
        zzgwbVarZzd.zzb(zzgjaVar.zze());
        zzgix zzgixVarZzg = zzgjaVar.zzg();
        if (zzgix.zza.equals(zzgixVarZzg)) {
            zzgvtVar = zzgvt.SHA1;
        } else if (zzgix.zzb.equals(zzgixVarZzg)) {
            zzgvtVar = zzgvt.SHA224;
        } else if (zzgix.zzc.equals(zzgixVarZzg)) {
            zzgvtVar = zzgvt.SHA256;
        } else if (zzgix.zzd.equals(zzgixVarZzg)) {
            zzgvtVar = zzgvt.SHA384;
        } else {
            if (!zzgix.zze.equals(zzgixVarZzg)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(zzgixVarZzg))));
            }
            zzgvtVar = zzgvt.SHA512;
        }
        zzgwbVarZzd.zza(zzgvtVar);
        return (zzgwc) zzgwbVarZzd.zzbr();
    }

    private static zzgxn zzi(zzgiy zzgiyVar) throws GeneralSecurityException {
        if (zzgiy.zza.equals(zzgiyVar)) {
            return zzgxn.TINK;
        }
        if (zzgiy.zzb.equals(zzgiyVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgiy.zzc.equals(zzgiyVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgiyVar))));
    }
}
