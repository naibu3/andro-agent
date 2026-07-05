package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgni {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgzeVarZzb = zzgra.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzgzeVarZzb;
        zzc = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgne
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgni.zzd((zzgks) zzghxVar);
            }
        }, zzgks.class, zzgqm.class);
        zzd = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgnf
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgni.zzb((zzgqm) zzgqqVar);
            }
        }, zzgzeVarZzb, zzgqm.class);
        zze = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgng
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgni.zzc((zzgkn) zzghiVar, zzgicVar);
            }
        }, zzgkn.class, zzgql.class);
        zzf = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgnh
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgni.zza((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzgzeVarZzb, zzgql.class);
    }

    public static /* synthetic */ zzgkn zza(zzgql zzgqlVar, zzgic zzgicVar) throws GeneralSecurityException {
        if (!zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgvo zzgvoVarZze = zzgvo.zze(zzgqlVar.zze(), zzhay.zza());
            if (zzgvoVarZze.zza() == 0) {
                return zzgkn.zza(zzf(zzgqlVar.zzc()), zzgzf.zzb(zzgvoVarZze.zzf().zzB(), zzgicVar), zzgqlVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhcd unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgks zzb(zzgqm zzgqmVar) throws GeneralSecurityException {
        if (!zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
        }
        try {
            zzgvr.zzd(zzgqmVar.zzc().zzh(), zzhay.zza());
            return zzgks.zzc(zzf(zzgqmVar.zzc().zzg()));
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgql zzc(zzgkn zzgknVar, zzgic zzgicVar) {
        zzgvn zzgvnVarZzc = zzgvo.zzc();
        byte[] bArrZzd = zzgknVar.zzd().zzd(zzgicVar);
        zzgvnVarZzc.zza(zzhac.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzgvo) zzgvnVarZzc.zzbr()).zzaN(), zzgwg.SYMMETRIC, zzg(zzgknVar.zzb().zzb()), zzgknVar.zze());
    }

    public static /* synthetic */ zzgqm zzd(zzgks zzgksVar) {
        zzgwl zzgwlVarZza = zzgwm.zza();
        zzgwlVarZza.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzgwlVarZza.zzc(zzgvr.zzc().zzaN());
        zzgwlVarZza.zza(zzg(zzgksVar.zzb()));
        return zzgqm.zzb((zzgwm) zzgwlVarZza.zzbr());
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zzc);
        zzgplVar.zzh(zzd);
        zzgplVar.zzg(zze);
        zzgplVar.zzf(zzf);
    }

    private static zzgkr zzf(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgxn zzgxnVar2 = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgxnVar.ordinal();
        if (iOrdinal == 1) {
            return zzgkr.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgkr.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgxnVar.zza());
            }
        }
        return zzgkr.zzb;
    }

    private static zzgxn zzg(zzgkr zzgkrVar) throws GeneralSecurityException {
        if (zzgkr.zza.equals(zzgkrVar)) {
            return zzgxn.TINK;
        }
        if (zzgkr.zzb.equals(zzgkrVar)) {
            return zzgxn.CRUNCHY;
        }
        if (zzgkr.zzc.equals(zzgkrVar)) {
            return zzgxn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgkrVar.toString()));
    }
}
