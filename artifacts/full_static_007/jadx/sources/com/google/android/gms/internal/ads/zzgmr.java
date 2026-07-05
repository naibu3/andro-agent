package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgmr {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgzeVarZzb = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzgzeVarZzb;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgmn
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgmr.zzd((zzgjm) zzghxVar);
            }
        }, zzgjm.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgmo
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgmr.zzb((zzgqm) zzgqqVar);
            }
        }, zzgzeVarZzb, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgmp
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgmr.zzc((zzgje) zzghiVar, zzgicVar);
            }
        }, zzgje.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgmq
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgmr.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzgzeVarZzb, zzgql.class);
    }

    public static /* synthetic */ zzgje zza(zzgql zzgqlVar, zzgic zzgicVar) throws GeneralSecurityException {
        if (!zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzgut zzgutVarZze = zzgut.zze(zzgqlVar.zze(), zzhay.zza());
            if (zzgutVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgjj zzgjjVarZzd = zzgjm.zzd();
            zzgjjVarZzd.zzb(zzgutVarZze.zzg().zzd());
            zzgjjVarZzd.zza(zzgutVarZze.zzf().zza());
            zzgjjVarZzd.zzc(16);
            zzgjjVarZzd.zzd(zzf(zzgqlVar.zzc()));
            zzgjm zzgjmVarZze = zzgjjVarZzd.zze();
            zzgjc zzgjcVarZza = zzgje.zza();
            zzgjcVarZza.zzc(zzgjmVarZze);
            zzgjcVarZza.zzb(zzgzf.zzb(zzgutVarZze.zzg().zzB(), zzgicVar));
            zzgjcVarZza.zza(zzgqlVar.zzf());
            return zzgjcVarZza.zzd();
        } catch (zzhcd unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzgjm zzb(zzgqm zzgqmVar) throws GeneralSecurityException {
        if (!zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
        }
        try {
            zzguw zzguwVarZze = zzguw.zze(zzgqmVar.zzc().zzh(), zzhay.zza());
            zzgjj zzgjjVarZzd = zzgjm.zzd();
            zzgjjVarZzd.zzb(zzguwVarZze.zza());
            zzgjjVarZzd.zza(zzguwVarZze.zzf().zza());
            zzgjjVarZzd.zzc(16);
            zzgjjVarZzd.zzd(zzf(zzgqmVar.zzc().zzg()));
            return zzgjjVarZzd.zze();
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgql zzc(zzgje zzgjeVar, zzgic zzgicVar) {
        zzgus zzgusVarZzc = zzgut.zzc();
        zzgusVarZzc.zzb(zzg(zzgjeVar.zzb()));
        byte[] bArrZzd = zzgjeVar.zzd().zzd(zzgicVar);
        zzgusVarZzc.zza(zzhac.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgut) zzgusVarZzc.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzh(zzgjeVar.zzb().zze()), zzgjeVar.zze());
    }

    public static /* synthetic */ zzgqm zzd(zzgjm zzgjmVar) {
        zzgwl zzgwlVarZza = zzgwm.zza();
        zzgwlVarZza.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzguv zzguvVarZzc = zzguw.zzc();
        zzguvVarZzc.zzb(zzg(zzgjmVar));
        zzguvVarZzc.zza(zzgjmVar.zzc());
        zzgwlVarZza.zzc(((zzguw) zzguvVarZzc.zzbr()).zzaN());
        zzgwlVarZza.zza(zzh(zzgjmVar.zze()));
        return zzgqm.zzb((zzgwm) zzgwlVarZza.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgjk zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgxnVar.ordinal();
        if (iOrdinal == 1) {
            return zzgjk.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgjk.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgxnVar.zza());
            }
        }
        return zzgjk.zzb;
    }

    private static zzguz zzg(zzgjm zzgjmVar) throws GeneralSecurityException {
        zzguy zzguyVarZzc = zzguz.zzc();
        zzguyVarZzc.zza(zzgjmVar.zzb());
        return (zzguz) zzguyVarZzc.zzbr();
    }

    private static zzgxn zzh(zzgjk zzgjkVar) throws GeneralSecurityException {
        if (zzgjk.zza.equals(zzgjkVar)) {
            return zzgxn.TINK;
        }
        if (zzgjk.zzb.equals(zzgjkVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgjk.zzc.equals(zzgjkVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgjkVar))));
    }
}
