package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgqe {
    private final Map zza;
    private final Map zzb;

    /* synthetic */ zzgqe(zzgqa zzgqaVar, zzgqd zzgqdVar) {
        this.zza = new HashMap(zzgqaVar.zza);
        this.zzb = new HashMap(zzgqaVar.zzb);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzghy) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final Object zzb(zzghi zzghiVar, Class cls) throws GeneralSecurityException {
        zzgqc zzgqcVar = new zzgqc(zzghiVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgqcVar)) {
            return ((zzgpy) this.zza.get(zzgqcVar)).zza(zzghiVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + zzgqcVar.toString() + " available");
    }

    public final Object zzc(zzgqk zzgqkVar, Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzghy zzghyVar = (zzghy) this.zzb.get(cls);
        if (zzgqkVar.zzd().equals(zzghyVar.zza()) && zzghyVar.zza().equals(zzgqkVar.zzd())) {
            return zzghyVar.zzc(zzgqkVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
