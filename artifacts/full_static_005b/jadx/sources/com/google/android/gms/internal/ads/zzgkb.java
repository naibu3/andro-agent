package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgkb {

    @Nullable
    private zzgkm zza = null;

    @Nullable
    private zzgzf zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgkb() {
    }

    /* synthetic */ zzgkb(zzgka zzgkaVar) {
    }

    public final zzgkb zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgkb zzb(zzgzf zzgzfVar) {
        this.zzb = zzgzfVar;
        return this;
    }

    public final zzgkb zzc(zzgkm zzgkmVar) {
        this.zza = zzgkmVar;
        return this;
    }

    public final zzgkd zzd() throws GeneralSecurityException {
        zzgzf zzgzfVar;
        zzgze zzgzeVarZzb;
        zzgkm zzgkmVar = this.zza;
        if (zzgkmVar == null || (zzgzfVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgkmVar.zzb() != zzgzfVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgkmVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgkk.zzc) {
            zzgzeVarZzb = zzgpm.zza;
        } else if (this.zza.zzd() == zzgkk.zzb) {
            zzgzeVarZzb = zzgpm.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzgkk.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzd()))));
            }
            zzgzeVarZzb = zzgpm.zzb(this.zzc.intValue());
        }
        return new zzgkd(this.zza, this.zzb, zzgzeVarZzb, this.zzc, null);
    }
}
