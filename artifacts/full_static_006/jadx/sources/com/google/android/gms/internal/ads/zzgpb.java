package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgpb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpa zzb = new zzgpa() { // from class: com.google.android.gms.internal.ads.zzgoz
        @Override // com.google.android.gms.internal.ads.zzgpa
        public final zzghi zza(zzghx zzghxVar, Integer num) throws GeneralSecurityException {
            int i = zzgpb.zza;
            zzgwm zzgwmVarZzc = ((zzgov) zzghxVar).zzb().zzc();
            zzghj zzghjVarZzb = zzgoj.zzc().zzb(zzgwmVarZzc.zzi());
            if (!zzgoj.zzc().zze(zzgwmVarZzc.zzi())) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            zzgwh zzgwhVarZza = zzghjVarZzb.zza(zzgwmVarZzc.zzh());
            return new zzgou(zzgql.zza(zzgwhVarZza.zzg(), zzgwhVarZza.zzf(), zzgwhVarZza.zzc(), zzgwmVarZzc.zzg(), num), zzghh.zza());
        }
    };
    private static final zzgpb zzc = zze();
    private final Map zzd = new HashMap();

    public static zzgpb zzb() {
        return zzc;
    }

    private final synchronized zzghi zzd(zzghx zzghxVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgpa zzgpaVar;
        zzgpaVar = (zzgpa) this.zzd.get(zzghxVar.getClass());
        if (zzgpaVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + zzghxVar.toString() + ": no key creator for this class was registered.");
        }
        return zzgpaVar.zza(zzghxVar, num);
    }

    private static zzgpb zze() {
        zzgpb zzgpbVar = new zzgpb();
        try {
            zzgpbVar.zzc(zzb, zzgov.class);
            return zzgpbVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final zzghi zza(zzghx zzghxVar, @Nullable Integer num) throws GeneralSecurityException {
        return zzd(zzghxVar, num);
    }

    public final synchronized void zzc(zzgpa zzgpaVar, Class cls) throws GeneralSecurityException {
        zzgpa zzgpaVar2 = (zzgpa) this.zzd.get(cls);
        if (zzgpaVar2 != null && !zzgpaVar2.equals(zzgpaVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
        }
        this.zzd.put(cls, zzgpaVar);
    }
}
