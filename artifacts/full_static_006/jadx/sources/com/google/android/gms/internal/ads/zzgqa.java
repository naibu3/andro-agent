package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgqa {
    private final Map zza;
    private final Map zzb;

    private zzgqa() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgqa zza(zzgpy zzgpyVar) throws GeneralSecurityException {
        if (zzgpyVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzgqc zzgqcVar = new zzgqc(zzgpyVar.zzc(), zzgpyVar.zzd(), null);
        if (this.zza.containsKey(zzgqcVar)) {
            zzgpy zzgpyVar2 = (zzgpy) this.zza.get(zzgqcVar);
            if (!zzgpyVar2.equals(zzgpyVar) || !zzgpyVar.equals(zzgpyVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgqcVar.toString()));
            }
        } else {
            this.zza.put(zzgqcVar, zzgpyVar);
        }
        return this;
    }

    public final zzgqa zzb(zzghy zzghyVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZzb = zzghyVar.zzb();
        if (map.containsKey(clsZzb)) {
            zzghy zzghyVar2 = (zzghy) this.zzb.get(clsZzb);
            if (!zzghyVar2.equals(zzghyVar) || !zzghyVar.equals(zzghyVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            this.zzb.put(clsZzb, zzghyVar);
        }
        return this;
    }

    /* synthetic */ zzgqa(zzgpz zzgpzVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    /* synthetic */ zzgqa(zzgqe zzgqeVar, zzgpz zzgpzVar) {
        this.zza = new HashMap(zzgqeVar.zza);
        this.zzb = new HashMap(zzgqeVar.zzb);
    }
}
