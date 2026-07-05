package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgnz {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgzeVarZzb = zzgra.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzgzeVarZzb;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgnv
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgnz.zzd((zzgmh) zzghxVar);
            }
        }, zzgmh.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgnw
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgnz.zzb((zzgqm) zzgqqVar);
            }
        }, zzgzeVarZzb, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgnx
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgnz.zzc((zzgmb) zzghiVar, zzgicVar);
            }
        }, zzgmb.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgny
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgnz.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzgzeVarZzb, zzgql.class);
    }

    public static /* synthetic */ zzgmb zza(zzgql zzgqlVar, zzgic zzgicVar) throws GeneralSecurityException {
        if (!zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgxt zzgxtVarZze = zzgxt.zze(zzgqlVar.zze(), zzhay.zza());
            if (zzgxtVarZze.zza() == 0) {
                return zzgmb.zza(zzf(zzgqlVar.zzc()), zzgzf.zzb(zzgxtVarZze.zzf().zzB(), zzgicVar), zzgqlVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhcd unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgmh zzb(zzgqm zzgqmVar) throws GeneralSecurityException {
        if (!zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
        }
        try {
            if (zzgxw.zze(zzgqmVar.zzc().zzh(), zzhay.zza()).zza() == 0) {
                return zzgmh.zzc(zzf(zzgqmVar.zzc().zzg()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgql zzc(zzgmb zzgmbVar, zzgic zzgicVar) {
        zzgxs zzgxsVarZzc = zzgxt.zzc();
        byte[] bArrZzd = zzgmbVar.zzd().zzd(zzgicVar);
        zzgxsVarZzc.zza(zzhac.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgxt) zzgxsVarZzc.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzg(zzgmbVar.zzb().zzb()), zzgmbVar.zze());
    }

    public static /* synthetic */ zzgqm zzd(zzgmh zzgmhVar) {
        zzgwl zzgwlVarZza = zzgwm.zza();
        zzgwlVarZza.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzgwlVarZza.zzc(zzgxw.zzd().zzaN());
        zzgwlVarZza.zza(zzg(zzgmhVar.zzb()));
        return zzgqm.zzb((zzgwm) zzgwlVarZza.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgmg zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgxnVar.ordinal();
        if (iOrdinal == 1) {
            return zzgmg.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgmg.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgxnVar.zza());
            }
        }
        return zzgmg.zzb;
    }

    private static zzgxn zzg(zzgmg zzgmgVar) throws GeneralSecurityException {
        if (zzgmg.zza.equals(zzgmgVar)) {
            return zzgxn.TINK;
        }
        if (zzgmg.zzb.equals(zzgmgVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgmg.zzc.equals(zzgmgVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgmgVar.toString()));
    }
}
