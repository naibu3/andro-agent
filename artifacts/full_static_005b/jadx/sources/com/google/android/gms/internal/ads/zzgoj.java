package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgoj {
    private static final Logger zza = Logger.getLogger(zzgoj.class.getName());
    private static final zzgoj zzb = new zzgoj();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    public static zzgoj zzc() {
        return zzb;
    }

    private final synchronized zzghj zzg(String str) throws GeneralSecurityException {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzghj) this.zzc.get(str);
    }

    private final synchronized void zzh(zzghj zzghjVar, boolean z, boolean z2) throws GeneralSecurityException {
        String str = ((zzgos) zzghjVar).zza;
        if (this.zzd.containsKey(str) && !((Boolean) this.zzd.get(str)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
        }
        zzghj zzghjVar2 = (zzghj) this.zzc.get(str);
        if (zzghjVar2 != null && !zzghjVar2.getClass().equals(zzghjVar.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzghjVar2.getClass().getName(), zzghjVar.getClass().getName()));
        }
        this.zzc.putIfAbsent(str, zzghjVar);
        this.zzd.put(str, true);
    }

    public final zzghj zza(String str, Class cls) throws GeneralSecurityException {
        zzghj zzghjVarZzg = zzg(str);
        if (zzghjVarZzg.zzb().equals(cls)) {
            return zzghjVarZzg;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(zzghjVarZzg.getClass()) + ", which only supports: " + zzghjVarZzg.zzb().toString());
    }

    public final zzghj zzb(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final synchronized void zzd(zzghj zzghjVar, boolean z) throws GeneralSecurityException {
        zzf(zzghjVar, 1, true);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzd.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzghj zzghjVar, int i, boolean z) throws GeneralSecurityException {
        if (!zzgoc.zza(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzghjVar, false, true);
    }
}
