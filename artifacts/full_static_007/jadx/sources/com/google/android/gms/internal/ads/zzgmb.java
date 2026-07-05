package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgmb extends zzgih {
    private final zzgmh zza;
    private final zzgzf zzb;
    private final zzgze zzc;

    @Nullable
    private final Integer zzd;

    private zzgmb(zzgmh zzgmhVar, zzgzf zzgzfVar, zzgze zzgzeVar, @Nullable Integer num) {
        this.zza = zzgmhVar;
        this.zzb = zzgzfVar;
        this.zzc = zzgzeVar;
        this.zzd = num;
    }

    public static zzgmb zza(zzgmg zzgmgVar, zzgzf zzgzfVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgze zzgzeVarZzb;
        zzgmg zzgmgVar2 = zzgmg.zzc;
        if (zzgmgVar != zzgmgVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + zzgmgVar.toString() + " the value of idRequirement must be non-null");
        }
        if (zzgmgVar == zzgmgVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgzfVar.zza() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgzfVar.zza());
        }
        zzgmh zzgmhVarZzc = zzgmh.zzc(zzgmgVar);
        if (zzgmhVarZzc.zzb() == zzgmgVar2) {
            zzgzeVarZzb = zzgpm.zza;
        } else if (zzgmhVarZzc.zzb() == zzgmg.zzb) {
            zzgzeVarZzb = zzgpm.zza(num.intValue());
        } else {
            if (zzgmhVarZzc.zzb() != zzgmg.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgmhVarZzc.zzb().toString()));
            }
            zzgzeVarZzb = zzgpm.zzb(num.intValue());
        }
        return new zzgmb(zzgmhVarZzc, zzgzfVar, zzgzeVarZzb, num);
    }

    public final zzgmh zzb() {
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
