package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgkn extends zzgih {
    private final zzgks zza;
    private final zzgzf zzb;
    private final zzgze zzc;

    @Nullable
    private final Integer zzd;

    private zzgkn(zzgks zzgksVar, zzgzf zzgzfVar, zzgze zzgzeVar, @Nullable Integer num) {
        this.zza = zzgksVar;
        this.zzb = zzgzfVar;
        this.zzc = zzgzeVar;
        this.zzd = num;
    }

    public static zzgkn zza(zzgkr zzgkrVar, zzgzf zzgzfVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgze zzgzeVarZzb;
        zzgkr zzgkrVar2 = zzgkr.zzc;
        if (zzgkrVar != zzgkrVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + zzgkrVar.toString() + " the value of idRequirement must be non-null");
        }
        if (zzgkrVar == zzgkrVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgzfVar.zza() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgzfVar.zza());
        }
        zzgks zzgksVarZzc = zzgks.zzc(zzgkrVar);
        if (zzgksVarZzc.zzb() == zzgkrVar2) {
            zzgzeVarZzb = zzgpm.zza;
        } else if (zzgksVarZzc.zzb() == zzgkr.zzb) {
            zzgzeVarZzb = zzgpm.zza(num.intValue());
        } else {
            if (zzgksVarZzc.zzb() != zzgkr.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgksVarZzc.zzb().toString()));
            }
            zzgzeVarZzb = zzgpm.zzb(num.intValue());
        }
        return new zzgkn(zzgksVarZzc, zzgzfVar, zzgzeVarZzb, num);
    }

    public final zzgks zzb() {
        return this.zza;
    }

    public final zzgze zzc() {
        return this.zzc;
    }

    public final zzgzf zzd() {
        return this.zzb;
    }

    @Nullable
    public final Integer zze() {
        return this.zzd;
    }
}
