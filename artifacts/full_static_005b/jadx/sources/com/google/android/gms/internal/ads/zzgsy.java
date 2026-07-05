package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgsy {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgzeVarZzb = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzgzeVarZzb;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgsu
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgsy.zzb((zzgrn) zzghxVar);
            }
        }, zzgrn.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgsv
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgsy.zzd((zzgqm) zzgqqVar);
            }
        }, zzgzeVarZzb, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgsw
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgsy.zza((zzgre) zzghiVar, zzgicVar);
            }
        }, zzgre.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgsx
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgsy.zzc((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzgzeVarZzb, zzgql.class);
    }

    public static /* synthetic */ zzgql zza(zzgre zzgreVar, zzgic zzgicVar) {
        zzgtu zzgtuVarZzc = zzgtv.zzc();
        zzgtuVarZzc.zzb(zzg(zzgreVar.zzb()));
        byte[] bArrZzd = zzgreVar.zzd().zzd(zzgicVar);
        zzgtuVarZzc.zza(zzhac.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgtv) zzgtuVarZzc.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzh(zzgreVar.zzb().zzf()), zzgreVar.zze());
    }

    public static /* synthetic */ zzgqm zzb(zzgrn zzgrnVar) {
        zzgwl zzgwlVarZza = zzgwm.zza();
        zzgwlVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgtx zzgtxVarZzc = zzgty.zzc();
        zzgtxVarZzc.zzb(zzg(zzgrnVar));
        zzgtxVarZzc.zza(zzgrnVar.zzc());
        zzgwlVarZza.zzc(((zzgty) zzgtxVarZzc.zzbr()).zzaN());
        zzgwlVarZza.zza(zzh(zzgrnVar.zzf()));
        return zzgqm.zzb((zzgwm) zzgwlVarZza.zzbr());
    }

    public static /* synthetic */ zzgre zzc(zzgql zzgqlVar, zzgic zzgicVar) throws GeneralSecurityException {
        if (!zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzgtv zzgtvVarZze = zzgtv.zze(zzgqlVar.zze(), zzhay.zza());
            if (zzgtvVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgrk zzgrkVarZze = zzgrn.zze();
            zzgrkVarZze.zza(zzgtvVarZze.zzg().zzd());
            zzgrkVarZze.zzb(zzgtvVarZze.zzf().zza());
            zzgrkVarZze.zzc(zzf(zzgqlVar.zzc()));
            zzgrn zzgrnVarZzd = zzgrkVarZze.zzd();
            zzgrc zzgrcVarZza = zzgre.zza();
            zzgrcVarZza.zzc(zzgrnVarZzd);
            zzgrcVarZza.zza(zzgzf.zzb(zzgtvVarZze.zzg().zzB(), zzgicVar));
            zzgrcVarZza.zzb(zzgqlVar.zzf());
            return zzgrcVarZza.zzd();
        } catch (zzhcd | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzgrn zzd(zzgqm zzgqmVar) throws GeneralSecurityException {
        if (!zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
        }
        try {
            zzgty zzgtyVarZze = zzgty.zze(zzgqmVar.zzc().zzh(), zzhay.zza());
            zzgrk zzgrkVarZze = zzgrn.zze();
            zzgrkVarZze.zza(zzgtyVarZze.zza());
            zzgrkVarZze.zzb(zzgtyVarZze.zzf().zza());
            zzgrkVarZze.zzc(zzf(zzgqmVar.zzc().zzg()));
            return zzgrkVarZze.zzd();
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgrl zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgxnVar.ordinal();
        if (iOrdinal == 1) {
            return zzgrl.zza;
        }
        if (iOrdinal == 2) {
            return zzgrl.zzc;
        }
        if (iOrdinal == 3) {
            return zzgrl.zzd;
        }
        if (iOrdinal == 4) {
            return zzgrl.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgxnVar.zza());
    }

    private static zzgub zzg(zzgrn zzgrnVar) {
        zzgua zzguaVarZzc = zzgub.zzc();
        zzguaVarZzc.zza(zzgrnVar.zzb());
        return (zzgub) zzguaVarZzc.zzbr();
    }

    private static zzgxn zzh(zzgrl zzgrlVar) throws GeneralSecurityException {
        if (zzgrl.zza.equals(zzgrlVar)) {
            return zzgxn.TINK;
        }
        if (zzgrl.zzb.equals(zzgrlVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgrl.zzd.equals(zzgrlVar)) {
            return zzgxn.RAW;
        }
        if (zzgrl.zzc.equals(zzgrlVar)) {
            return zzgxn.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgrlVar))));
    }
}
