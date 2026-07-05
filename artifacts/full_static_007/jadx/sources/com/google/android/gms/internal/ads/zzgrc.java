package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgrc {

    @Nullable
    private zzgrn zza = null;

    @Nullable
    private zzgzf zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgrc() {
    }

    /* synthetic */ zzgrc(zzgrb zzgrbVar) {
    }

    public final zzgrc zza(zzgzf zzgzfVar) throws GeneralSecurityException {
        this.zzb = zzgzfVar;
        return this;
    }

    public final zzgrc zzb(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgrc zzc(zzgrn zzgrnVar) {
        this.zza = zzgrnVar;
        return this;
    }

    public final zzgre zzd() throws GeneralSecurityException {
        zzgzf zzgzfVar;
        zzgze zzgzeVarZza;
        zzgrn zzgrnVar = this.zza;
        if (zzgrnVar == null || (zzgzfVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgrnVar.zzc() != zzgzfVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgrnVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzgrl.zzd) {
            zzgzeVarZza = zzgpm.zza;
        } else if (this.zza.zzf() == zzgrl.zzc || this.zza.zzf() == zzgrl.zzb) {
            zzgzeVarZza = zzgpm.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzgrl.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzf()))));
            }
            zzgzeVarZza = zzgpm.zzb(this.zzc.intValue());
        }
        return new zzgre(this.zza, this.zzb, zzgzeVarZza, this.zzc, null);
    }
}
