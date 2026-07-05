package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgmw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgzeVarZzb = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzgzeVarZzb;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgms
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgmw.zzd((zzgjz) zzghxVar);
            }
        }, zzgjz.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgmt
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgmw.zzb((zzgqm) zzgqqVar);
            }
        }, zzgzeVarZzb, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgmu
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgmw.zzc((zzgjq) zzghiVar, zzgicVar);
            }
        }, zzgjq.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgmv
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgmw.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzgzeVarZzb, zzgql.class);
    }

    public static /* synthetic */ zzgjq zza(zzgql zzgqlVar, zzgic zzgicVar) throws GeneralSecurityException {
        if (!zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzgvc zzgvcVarZze = zzgvc.zze(zzgqlVar.zze(), zzhay.zza());
            if (zzgvcVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgjw zzgjwVarZzc = zzgjz.zzc();
            zzgjwVarZzc.zzb(zzgvcVarZze.zzf().zzd());
            zzgjwVarZzc.zza(12);
            zzgjwVarZzc.zzc(16);
            zzgjwVarZzc.zzd(zzf(zzgqlVar.zzc()));
            zzgjz zzgjzVarZze = zzgjwVarZzc.zze();
            zzgjo zzgjoVarZza = zzgjq.zza();
            zzgjoVarZza.zzc(zzgjzVarZze);
            zzgjoVarZza.zzb(zzgzf.zzb(zzgvcVarZze.zzf().zzB(), zzgicVar));
            zzgjoVarZza.zza(zzgqlVar.zzf());
            return zzgjoVarZza.zzd();
        } catch (zzhcd unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgjz zzb(zzgqm zzgqmVar) throws GeneralSecurityException {
        if (!zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
        }
        try {
            zzgvf zzgvfVarZzf = zzgvf.zzf(zzgqmVar.zzc().zzh(), zzhay.zza());
            if (zzgvfVarZzf.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgjw zzgjwVarZzc = zzgjz.zzc();
            zzgjwVarZzc.zzb(zzgvfVarZzf.zza());
            zzgjwVarZzc.zza(12);
            zzgjwVarZzc.zzc(16);
            zzgjwVarZzc.zzd(zzf(zzgqmVar.zzc().zzg()));
            return zzgjwVarZzc.zze();
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgql zzc(zzgjq zzgjqVar, zzgic zzgicVar) {
        zzgvb zzgvbVarZzc = zzgvc.zzc();
        byte[] bArrZzd = zzgjqVar.zzd().zzd(zzgicVar);
        zzgvbVarZzc.zza(zzhac.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgvc) zzgvbVarZzc.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzg(zzgjqVar.zzb().zzd()), zzgjqVar.zze());
    }

    public static /* synthetic */ zzgqm zzd(zzgjz zzgjzVar) {
        zzgwl zzgwlVarZza = zzgwm.zza();
        zzgwlVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgve zzgveVarZzd = zzgvf.zzd();
        zzgveVarZzd.zza(zzgjzVar.zzb());
        zzgwlVarZza.zzc(((zzgvf) zzgveVarZzd.zzbr()).zzaN());
        zzgwlVarZza.zza(zzg(zzgjzVar.zzd()));
        return zzgqm.zzb((zzgwm) zzgwlVarZza.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgjx zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgxnVar.ordinal();
        if (iOrdinal == 1) {
            return zzgjx.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgjx.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgxnVar.zza());
            }
        }
        return zzgjx.zzb;
    }

    private static zzgxn zzg(zzgjx zzgjxVar) throws GeneralSecurityException {
        if (zzgjx.zza.equals(zzgjxVar)) {
            return zzgxn.TINK;
        }
        if (zzgjx.zzb.equals(zzgjxVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgjx.zzc.equals(zzgjxVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgjxVar))));
    }
}
