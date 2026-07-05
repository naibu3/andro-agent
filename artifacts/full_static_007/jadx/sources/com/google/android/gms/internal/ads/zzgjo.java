package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgjo {

    @Nullable
    private zzgjz zza = null;

    @Nullable
    private zzgzf zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgjo() {
    }

    /* synthetic */ zzgjo(zzgjn zzgjnVar) {
    }

    public final zzgjo zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgjo zzb(zzgzf zzgzfVar) {
        this.zzb = zzgzfVar;
        return this;
    }

    public final zzgjo zzc(zzgjz zzgjzVar) {
        this.zza = zzgjzVar;
        return this;
    }

    public final zzgjq zzd() throws GeneralSecurityException {
        zzgzf zzgzfVar;
        zzgze zzgzeVarZzb;
        zzgjz zzgjzVar = this.zza;
        if (zzgjzVar == null || (zzgzfVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgjzVar.zzb() != zzgzfVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgjzVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgjx.zzc) {
            zzgzeVarZzb = zzgpm.zza;
        } else if (this.zza.zzd() == zzgjx.zzb) {
            zzgzeVarZzb = zzgpm.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzgjx.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzd()))));
            }
            zzgzeVarZzb = zzgpm.zzb(this.zzc.intValue());
        }
        return new zzgjq(this.zza, this.zzb, zzgzeVarZzb, this.zzc, null);
    }
}
