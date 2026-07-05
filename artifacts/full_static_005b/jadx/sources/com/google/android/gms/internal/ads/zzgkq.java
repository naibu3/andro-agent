package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgkq {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgko
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            zzgkn zzgknVar = (zzgkn) zzghiVar;
            int i = zzgkq.zza;
            return zzgnd.zze() ? zzgnd.zzb(zzgknVar) : zzgye.zzb(zzgknVar);
        }
    }, zzgkn.class, zzggy.class);
    private static final zzgpa zzc = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgkp
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) {
            int i = zzgkq.zza;
            return zzgkn.zza(((zzgks) zzghxVar).zzb(), zzgzf.zzc(32), num);
        }
    };
    private static final zzghj zzd = zzgos.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzggy.class, zzgwg.SYMMETRIC, zzgvo.zzg());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgoc.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzgni.zza;
        zzgni.zze(zzgpl.zzc());
        zzgpi.zza().zze(zzb);
        zzgpb.zzb().zzc(zzc, zzgks.class);
        zzgph zzgphVarZzb = zzgph.zzb();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", zzgks.zzc(zzgkr.zza));
        map.put("CHACHA20_POLY1305_RAW", zzgks.zzc(zzgkr.zzc));
        zzgphVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgoj.zzc().zzd(zzd, true);
    }
}
