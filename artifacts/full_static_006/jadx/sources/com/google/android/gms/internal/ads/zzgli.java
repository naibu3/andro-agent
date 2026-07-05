package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgli extends zzgih {
    private final zzglo zza;
    private final zzgze zzb;

    @Nullable
    private final Integer zzc;

    private zzgli(zzglo zzgloVar, zzgze zzgzeVar, @Nullable Integer num) {
        this.zza = zzgloVar;
        this.zzb = zzgzeVar;
        this.zzc = num;
    }

    public static zzgli zza(zzglo zzgloVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgze zzgzeVarZzb;
        if (zzgloVar.zzc() == zzglm.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzgzeVarZzb = zzgpm.zza;
        } else {
            if (zzgloVar.zzc() != zzglm.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(String.valueOf(zzgloVar.zzc()))));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzgzeVarZzb = zzgpm.zzb(num.intValue());
        }
        return new zzgli(zzgloVar, zzgzeVarZzb, num);
    }

    public final zzglo zzb() {
        return this.zza;
    }

    public final zzgze zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
