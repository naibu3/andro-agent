package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgsa {
    private static final zzgpy zza = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgrw
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return new zzgtb((zzgrv) zzghiVar);
        }
    }, zzgrv.class, zzgro.class);
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgrx
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgzb.zzb((zzgrv) zzghiVar);
        }
    }, zzgrv.class, zzghw.class);
    private static final zzghj zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.HmacKey", zzghw.class, zzgwg.SYMMETRIC, zzgvw.zzi());
    private static final zzgpc zzd = new zzgpc() { // from class: com.google.android.gms.internal.ads.zzgry
    };
    private static final zzgpa zze = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgrz
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            zzgsg zzgsgVar = (zzgsg) zzghxVar;
            zzgrt zzgrtVar = new zzgrt(null);
            zzgrtVar.zzc(zzgsgVar);
            zzgrtVar.zzb(zzgzf.zzc(zzgsgVar.zzc()));
            zzgrtVar.zza(num);
            return zzgrtVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzgoc.zza(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzgtg.zza;
        zzgtg.zze(zzgpl.zzc());
        zzgpi.zza().zze(zza);
        zzgpi.zza().zze(zzb);
        zzgph zzgphVarZzb = zzgph.zzb();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzgst.zza);
        zzgsc zzgscVar = new zzgsc(null);
        zzgscVar.zzb(32);
        zzgscVar.zzc(16);
        zzgscVar.zzd(zzgse.zzd);
        zzgscVar.zza(zzgsd.zzc);
        map.put("HMAC_SHA256_128BITTAG_RAW", zzgscVar.zze());
        zzgsc zzgscVar2 = new zzgsc(null);
        zzgscVar2.zzb(32);
        zzgscVar2.zzc(32);
        zzgscVar2.zzd(zzgse.zza);
        zzgscVar2.zza(zzgsd.zzc);
        map.put("HMAC_SHA256_256BITTAG", zzgscVar2.zze());
        zzgsc zzgscVar3 = new zzgsc(null);
        zzgscVar3.zzb(32);
        zzgscVar3.zzc(32);
        zzgscVar3.zzd(zzgse.zzd);
        zzgscVar3.zza(zzgsd.zzc);
        map.put("HMAC_SHA256_256BITTAG_RAW", zzgscVar3.zze());
        zzgsc zzgscVar4 = new zzgsc(null);
        zzgscVar4.zzb(64);
        zzgscVar4.zzc(16);
        zzgscVar4.zzd(zzgse.zza);
        zzgscVar4.zza(zzgsd.zze);
        map.put("HMAC_SHA512_128BITTAG", zzgscVar4.zze());
        zzgsc zzgscVar5 = new zzgsc(null);
        zzgscVar5.zzb(64);
        zzgscVar5.zzc(16);
        zzgscVar5.zzd(zzgse.zzd);
        zzgscVar5.zza(zzgsd.zze);
        map.put("HMAC_SHA512_128BITTAG_RAW", zzgscVar5.zze());
        zzgsc zzgscVar6 = new zzgsc(null);
        zzgscVar6.zzb(64);
        zzgscVar6.zzc(32);
        zzgscVar6.zzd(zzgse.zza);
        zzgscVar6.zza(zzgsd.zze);
        map.put("HMAC_SHA512_256BITTAG", zzgscVar6.zze());
        zzgsc zzgscVar7 = new zzgsc(null);
        zzgscVar7.zzb(64);
        zzgscVar7.zzc(32);
        zzgscVar7.zzd(zzgse.zzd);
        zzgscVar7.zza(zzgsd.zze);
        map.put("HMAC_SHA512_256BITTAG_RAW", zzgscVar7.zze());
        map.put("HMAC_SHA512_512BITTAG", zzgst.zzd);
        zzgsc zzgscVar8 = new zzgsc(null);
        zzgscVar8.zzb(64);
        zzgscVar8.zzc(64);
        zzgscVar8.zzd(zzgse.zzd);
        zzgscVar8.zza(zzgsd.zze);
        map.put("HMAC_SHA512_512BITTAG_RAW", zzgscVar8.zze());
        zzgphVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgpb.zzb().zzc(zze, zzgsg.class);
        zzgpd.zza().zzb(zzd, zzgsg.class);
        zzgoj.zzc().zzf(zzc, i, true);
    }
}
