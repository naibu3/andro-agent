package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgju {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgjr
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgyc.zzb((zzgjq) zzghiVar);
        }
    }, zzgjq.class, zzggy.class);
    private static final zzghj zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzggy.class, zzgwg.SYMMETRIC, zzgvc.zzg());
    private static final zzgpc zzd = new zzgpc() { // from class: com.google.android.gms.internal.ads.zzgjs
    };
    private static final zzgpa zze = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgjt
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) throws GeneralSecurityException {
            zzgjz zzgjzVar = (zzgjz) zzghxVar;
            int i = zzgju.zza;
            if (zzgjzVar.zzb() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzgjo zzgjoVar = new zzgjo(null);
            zzgjoVar.zzc(zzgjzVar);
            zzgjoVar.zza(num);
            zzgjoVar.zzb(zzgzf.zzc(zzgjzVar.zzb()));
            return zzgjoVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzgoc.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzgmw.zza;
        zzgmw.zze(zzgpl.zzc());
        zzgpi.zza().zze(zzb);
        zzgph zzgphVarZzb = zzgph.zzb();
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzgma.zza);
        zzgjw zzgjwVar = new zzgjw(null);
        zzgjwVar.zza(12);
        zzgjwVar.zzb(16);
        zzgjwVar.zzc(16);
        zzgjwVar.zzd(zzgjx.zzc);
        map.put("AES128_GCM_RAW", zzgjwVar.zze());
        map.put("AES256_GCM", zzgma.zzb);
        zzgjw zzgjwVar2 = new zzgjw(null);
        zzgjwVar2.zza(12);
        zzgjwVar2.zzb(32);
        zzgjwVar2.zzc(16);
        zzgjwVar2.zzd(zzgjx.zzc);
        map.put("AES256_GCM_RAW", zzgjwVar2.zze());
        zzgphVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgpd.zza().zzb(zzd, zzgjz.class);
        zzgpb.zzb().zzc(zze, zzgjz.class);
        zzgoj.zzc().zzf(zzc, i, true);
    }
}
