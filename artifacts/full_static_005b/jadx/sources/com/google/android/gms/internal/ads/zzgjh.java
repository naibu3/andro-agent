package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgjh {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgjf
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgyb.zzb((zzgje) zzghiVar);
        }
    }, zzgje.class, zzggy.class);
    private static final zzghj zzc = zzgos.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzggy.class, zzgwg.SYMMETRIC, zzgut.zzh());
    private static final zzgpa zzd = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgjg
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) throws GeneralSecurityException {
            zzgjm zzgjmVar = (zzgjm) zzghxVar;
            int i = zzgjh.zza;
            if (zzgjmVar.zzc() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzgjc zzgjcVar = new zzgjc(null);
            zzgjcVar.zzc(zzgjmVar);
            zzgjcVar.zza(num);
            zzgjcVar.zzb(zzgzf.zzc(zzgjmVar.zzc()));
            return zzgjcVar.zzd();
        }
    };

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgoc.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i = zzgmr.zza;
        zzgmr.zze(zzgpl.zzc());
        zzgpi.zza().zze(zzb);
        zzgph zzgphVarZzb = zzgph.zzb();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzgma.zzc);
        zzgjj zzgjjVar = new zzgjj(null);
        zzgjjVar.zza(16);
        zzgjjVar.zzb(16);
        zzgjjVar.zzc(16);
        zzgjjVar.zzd(zzgjk.zzc);
        map.put("AES128_EAX_RAW", zzgjjVar.zze());
        map.put("AES256_EAX", zzgma.zzd);
        zzgjj zzgjjVar2 = new zzgjj(null);
        zzgjjVar2.zza(16);
        zzgjjVar2.zzb(32);
        zzgjjVar2.zzc(16);
        zzgjjVar2.zzd(zzgjk.zzc);
        map.put("AES256_EAX_RAW", zzgjjVar2.zze());
        zzgphVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgpb.zzb().zzc(zzd, zzgjm.class);
        zzgoj.zzc().zzd(zzc, true);
    }
}
