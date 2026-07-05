package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgri {
    private static final zzgpa zza = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgrf
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            return zzgri.zzb((zzgrn) zzghxVar, num);
        }
    };
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgrg
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgri.zzc((zzgre) zzghiVar);
        }
    }, zzgre.class, zzgro.class);
    private static final zzgpy zzc = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgrh
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgri.zza((zzgre) zzghiVar);
        }
    }, zzgre.class, zzghw.class);
    private static final zzghj zzd = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzghw.class, zzgwg.SYMMETRIC, zzgtv.zzh());

    public static /* synthetic */ zzghw zza(zzgre zzgreVar) throws GeneralSecurityException {
        zze(zzgreVar.zzb());
        return zzgzb.zza(zzgreVar);
    }

    public static /* synthetic */ zzgre zzb(zzgrn zzgrnVar, Integer num) throws GeneralSecurityException {
        zze(zzgrnVar);
        zzgrc zzgrcVar = new zzgrc(null);
        zzgrcVar.zzc(zzgrnVar);
        zzgrcVar.zza(zzgzf.zzc(zzgrnVar.zzc()));
        zzgrcVar.zzb(num);
        return zzgrcVar.zzd();
    }

    public static /* synthetic */ zzgro zzc(zzgre zzgreVar) throws GeneralSecurityException {
        zze(zzgreVar.zzb());
        return new zzgta(zzgreVar);
    }

    public static void zzd(boolean z) throws GeneralSecurityException {
        if (!zzgoc.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i = zzgsy.zza;
        zzgsy.zze(zzgpl.zzc());
        zzgpb.zzb().zzc(zza, zzgrn.class);
        zzgpi.zza().zze(zzb);
        zzgpi.zza().zze(zzc);
        zzgph zzgphVarZzb = zzgph.zzb();
        HashMap map = new HashMap();
        map.put("AES_CMAC", zzgst.zze);
        map.put("AES256_CMAC", zzgst.zze);
        zzgrk zzgrkVar = new zzgrk(null);
        zzgrkVar.zza(32);
        zzgrkVar.zzb(16);
        zzgrkVar.zzc(zzgrl.zzd);
        map.put("AES256_CMAC_RAW", zzgrkVar.zzd());
        zzgphVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgoj.zzc().zzd(zzd, true);
    }

    private static void zze(zzgrn zzgrnVar) throws GeneralSecurityException {
        if (zzgrnVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
