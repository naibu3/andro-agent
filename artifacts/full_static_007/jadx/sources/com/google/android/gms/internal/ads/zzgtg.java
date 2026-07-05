package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgtg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgze zzb;
    private static final zzgoh zzc;
    private static final zzgoh zzd;
    private static final zzgpu zze;
    private static final zzgpq zzf;
    private static final zzgor zzg;
    private static final zzgon zzh;

    static {
        zzgze zzgzeVarZzb = zzgra.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzgzeVarZzb;
        zzgof zzgofVarZza = zzgoh.zza();
        zzgofVarZza.zza(zzgxn.RAW, zzgse.zzd);
        zzgofVarZza.zza(zzgxn.TINK, zzgse.zza);
        zzgofVarZza.zza(zzgxn.LEGACY, zzgse.zzc);
        zzgofVarZza.zza(zzgxn.CRUNCHY, zzgse.zzb);
        zzc = zzgofVarZza.zzb();
        zzgof zzgofVarZza2 = zzgoh.zza();
        zzgofVarZza2.zza(zzgvt.SHA1, zzgsd.zza);
        zzgofVarZza2.zza(zzgvt.SHA224, zzgsd.zzb);
        zzgofVarZza2.zza(zzgvt.SHA256, zzgsd.zzc);
        zzgofVarZza2.zza(zzgvt.SHA384, zzgsd.zzd);
        zzgofVarZza2.zza(zzgvt.SHA512, zzgsd.zze);
        zzd = zzgofVarZza2.zzb();
        zze = zzgpu.zzb(new zzgps() { // from class: com.google.android.gms.internal.ads.zzgtc
            @Override // com.google.android.gms.internal.ads.zzgps
            public final zzgqq zza(zzghx zzghxVar) {
                return zzgtg.zzb((zzgsg) zzghxVar);
            }
        }, zzgsg.class, zzgqm.class);
        zzf = zzgpq.zzb(new zzgpo() { // from class: com.google.android.gms.internal.ads.zzgtd
            @Override // com.google.android.gms.internal.ads.zzgpo
            public final zzghx zza(zzgqq zzgqqVar) {
                return zzgtg.zzd((zzgqm) zzgqqVar);
            }
        }, zzgzeVarZzb, zzgqm.class);
        zzg = zzgor.zzb(new zzgop() { // from class: com.google.android.gms.internal.ads.zzgte
            @Override // com.google.android.gms.internal.ads.zzgop
            public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                return zzgtg.zza((zzgrv) zzghiVar, zzgicVar);
            }
        }, zzgrv.class, zzgql.class);
        zzh = zzgon.zzb(new zzgol() { // from class: com.google.android.gms.internal.ads.zzgtf
            @Override // com.google.android.gms.internal.ads.zzgol
            public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) {
                return zzgtg.zzc((zzgql) zzgqqVar, zzgicVar);
            }
        }, zzgzeVarZzb, zzgql.class);
    }

    public static /* synthetic */ zzgql zza(zzgrv zzgrvVar, zzgic zzgicVar) {
        zzgvv zzgvvVarZzc = zzgvw.zzc();
        zzgvvVarZzc.zzb(zzf(zzgrvVar.zzb()));
        byte[] bArrZzd = zzgrvVar.zzd().zzd(zzgicVar);
        zzgvvVarZzc.zza(zzhac.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgql.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgvw) zzgvvVarZzc.zzbr()).zzaN(), zzgwg.SYMMETRIC, (zzgxn) zzc.zzb(zzgrvVar.zzb().zzg()), zzgrvVar.zze());
    }

    public static /* synthetic */ zzgqm zzb(zzgsg zzgsgVar) {
        zzgwl zzgwlVarZza = zzgwm.zza();
        zzgwlVarZza.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgvy zzgvyVarZzd = zzgvz.zzd();
        zzgvyVarZzd.zzb(zzf(zzgsgVar));
        zzgvyVarZzd.zza(zzgsgVar.zzc());
        zzgwlVarZza.zzc(((zzgvz) zzgvyVarZzd.zzbr()).zzaN());
        zzgwlVarZza.zza((zzgxn) zzc.zzb(zzgsgVar.zzg()));
        return zzgqm.zzb((zzgwm) zzgwlVarZza.zzbr());
    }

    public static /* synthetic */ zzgrv zzc(zzgql zzgqlVar, zzgic zzgicVar) throws GeneralSecurityException {
        if (!zzgqlVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzgvw zzgvwVarZzf = zzgvw.zzf(zzgqlVar.zze(), zzhay.zza());
            if (zzgvwVarZzf.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgsc zzgscVarZze = zzgsg.zze();
            zzgscVarZze.zzb(zzgvwVarZzf.zzh().zzd());
            zzgscVarZze.zzc(zzgvwVarZzf.zzg().zza());
            zzgscVarZze.zza((zzgsd) zzd.zzc(zzgvwVarZzf.zzg().zzc()));
            zzgscVarZze.zzd((zzgse) zzc.zzc(zzgqlVar.zzc()));
            zzgsg zzgsgVarZze = zzgscVarZze.zze();
            zzgrt zzgrtVarZza = zzgrv.zza();
            zzgrtVarZza.zzc(zzgsgVarZze);
            zzgrtVarZza.zzb(zzgzf.zzb(zzgvwVarZzf.zzh().zzB(), zzgicVar));
            zzgrtVarZza.zza(zzgqlVar.zzf());
            return zzgrtVarZza.zzd();
        } catch (zzhcd | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzgsg zzd(zzgqm zzgqmVar) throws GeneralSecurityException {
        if (!zzgqmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgqmVar.zzc().zzi())));
        }
        try {
            zzgvz zzgvzVarZzg = zzgvz.zzg(zzgqmVar.zzc().zzh(), zzhay.zza());
            if (zzgvzVarZzg.zzc() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzgvzVarZzg.zzc());
            }
            zzgsc zzgscVarZze = zzgsg.zze();
            zzgscVarZze.zzb(zzgvzVarZzg.zza());
            zzgscVarZze.zzc(zzgvzVarZzg.zzh().zza());
            zzgscVarZze.zza((zzgsd) zzd.zzc(zzgvzVarZzg.zzh().zzc()));
            zzgscVarZze.zzd((zzgse) zzc.zzc(zzgqmVar.zzc().zzg()));
            return zzgscVarZze.zze();
        } catch (zzhcd e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    public static void zze(zzgpl zzgplVar) throws GeneralSecurityException {
        zzgplVar.zzi(zze);
        zzgplVar.zzh(zzf);
        zzgplVar.zzg(zzg);
        zzgplVar.zzf(zzh);
    }

    private static zzgwc zzf(zzgsg zzgsgVar) throws GeneralSecurityException {
        zzgwb zzgwbVarZzd = zzgwc.zzd();
        zzgwbVarZzd.zzb(zzgsgVar.zzb());
        zzgwbVarZzd.zza((zzgvt) zzd.zzb(zzgsgVar.zzf()));
        return (zzgwc) zzgwbVarZzd.zzbr();
    }
}
