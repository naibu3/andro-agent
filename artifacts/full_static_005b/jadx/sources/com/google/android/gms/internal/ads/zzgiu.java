package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgiu {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgir
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgyf.zzb((zzgiq) zzghiVar);
        }
    }, zzgiq.class, zzggy.class);
    private static final zzghj zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzggy.class, zzgwg.SYMMETRIC, zzgue.zzh());
    private static final zzgpc zzd = new zzgpc() { // from class: com.google.android.gms.internal.ads.zzgis
    };
    private static final zzgpa zze = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgit
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) throws GeneralSecurityException {
            zzgja zzgjaVar = (zzgja) zzghxVar;
            int i = zzgiu.zza;
            if (zzgjaVar.zzb() != 16 && zzgjaVar.zzb() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            zzgio zzgioVar = new zzgio(null);
            zzgioVar.zzd(zzgjaVar);
            zzgioVar.zzc(num);
            zzgioVar.zza(zzgzf.zzc(zzgjaVar.zzb()));
            zzgioVar.zzb(zzgzf.zzc(zzgjaVar.zzc()));
            return zzgioVar.zze();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzgoc.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzgmm.zza;
        zzgmm.zze(zzgpl.zzc());
        zzgpi.zza().zze(zzb);
        zzgph zzgphVarZzb = zzgph.zzb();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzgma.zze);
        zzgiw zzgiwVar = new zzgiw(null);
        zzgiwVar.zza(16);
        zzgiwVar.zzc(32);
        zzgiwVar.zze(16);
        zzgiwVar.zzd(16);
        zzgiwVar.zzb(zzgix.zzc);
        zzgiwVar.zzf(zzgiy.zzc);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzgiwVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", zzgma.zzf);
        zzgiw zzgiwVar2 = new zzgiw(null);
        zzgiwVar2.zza(32);
        zzgiwVar2.zzc(32);
        zzgiwVar2.zze(32);
        zzgiwVar2.zzd(16);
        zzgiwVar2.zzb(zzgix.zzc);
        zzgiwVar2.zzf(zzgiy.zzc);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzgiwVar2.zzg());
        zzgphVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgpd.zza().zzb(zzd, zzgja.class);
        zzgpb.zzb().zzc(zze, zzgja.class);
        zzgoj.zzc().zzf(zzc, i, true);
    }
}
