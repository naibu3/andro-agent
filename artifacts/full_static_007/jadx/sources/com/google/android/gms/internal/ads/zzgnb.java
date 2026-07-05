package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgnb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgzeVarZzb = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzgzeVarZzb;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgmx
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgnb.zzd((zzgkm) zzghxVar);
            }
        }, zzgkm.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgmy
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgnb.zzb((zzgqm) zzgqqVar);
            }
        }, zzgzeVarZzb, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgmz
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgnb.zzc((zzgkd) zzghiVar, zzgicVar);
            }
        }, zzgkd.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgna
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgnb.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzgzeVarZzb, zzgql.class);
    }

    public static /* synthetic */ zzgkd zza(zzgql zzgqlVar, zzgic zzgicVar) throws GeneralSecurityException {
        if (!zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzgvi zzgviVarZze = zzgvi.zze(zzgqlVar.zze(), zzhay.zza());
            if (zzgviVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgkj zzgkjVarZzc = zzgkm.zzc();
            zzgkjVarZzc.zza(zzgviVarZze.zzf().zzd());
            zzgkjVarZzc.zzb(zzf(zzgqlVar.zzc()));
            zzgkm zzgkmVarZzc = zzgkjVarZzc.zzc();
            zzgkb zzgkbVarZza = zzgkd.zza();
            zzgkbVarZza.zzc(zzgkmVarZzc);
            zzgkbVarZza.zzb(zzgzf.zzb(zzgviVarZze.zzf().zzB(), zzgicVar));
            zzgkbVarZza.zza(zzgqlVar.zzf());
            return zzgkbVarZza.zzd();
        } catch (zzhcd unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzgkm zzb(zzgqm zzgqmVar) throws GeneralSecurityException {
        if (!zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
        }
        try {
            zzgvl zzgvlVarZzf = zzgvl.zzf(zzgqmVar.zzc().zzh(), zzhay.zza());
            if (zzgvlVarZzf.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgkj zzgkjVarZzc = zzgkm.zzc();
            zzgkjVarZzc.zza(zzgvlVarZzf.zza());
            zzgkjVarZzc.zzb(zzf(zzgqmVar.zzc().zzg()));
            return zzgkjVarZzc.zzc();
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgql zzc(zzgkd zzgkdVar, zzgic zzgicVar) {
        zzgvh zzgvhVarZzc = zzgvi.zzc();
        byte[] bArrZzd = zzgkdVar.zzd().zzd(zzgicVar);
        zzgvhVarZzc.zza(zzhac.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgvi) zzgvhVarZzc.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzg(zzgkdVar.zzb().zzd()), zzgkdVar.zze());
    }

    public static /* synthetic */ zzgqm zzd(zzgkm zzgkmVar) {
        zzgwl zzgwlVarZza = zzgwm.zza();
        zzgwlVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgvk zzgvkVarZzd = zzgvl.zzd();
        zzgvkVarZzd.zza(zzgkmVar.zzb());
        zzgwlVarZza.zzc(((zzgvl) zzgvkVarZzd.zzbr()).zzaN());
        zzgwlVarZza.zza(zzg(zzgkmVar.zzd()));
        return zzgqm.zzb((zzgwm) zzgwlVarZza.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgkk zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgxnVar.ordinal();
        if (iOrdinal == 1) {
            return zzgkk.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgkk.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgxnVar.zza());
            }
        }
        return zzgkk.zzb;
    }

    private static zzgxn zzg(zzgkk zzgkkVar) throws GeneralSecurityException {
        if (zzgkk.zza.equals(zzgkkVar)) {
            return zzgxn.TINK;
        }
        if (zzgkk.zzb.equals(zzgkkVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgkk.zzc.equals(zzgkkVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgkkVar))));
    }
}
