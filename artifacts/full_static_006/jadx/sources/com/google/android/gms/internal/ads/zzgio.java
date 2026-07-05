package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgio {

    @Nullable
    private zzgja zza = null;

    @Nullable
    private zzgzf zzb = null;

    @Nullable
    private zzgzf zzc = null;

    @Nullable
    private Integer zzd = null;

    private zzgio() {
    }

    /* synthetic */ zzgio(zzgin zzginVar) {
    }

    public final zzgio zza(zzgzf zzgzfVar) {
        this.zzb = zzgzfVar;
        return this;
    }

    public final zzgio zzb(zzgzf zzgzfVar) {
        this.zzc = zzgzfVar;
        return this;
    }

    public final zzgio zzc(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgio zzd(zzgja zzgjaVar) {
        this.zza = zzgjaVar;
        return this;
    }

    public final zzgiq zze() throws GeneralSecurityException {
        zzgze zzgzeVarZzb;
        zzgja zzgjaVar = this.zza;
        if (zzgjaVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzgzf zzgzfVar = this.zzb;
        if (zzgzfVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzgjaVar.zzb() != zzgzfVar.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzgjaVar.zzc() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzh() == zzgiy.zzc) {
            zzgzeVarZzb = zzgpm.zza;
        } else if (this.zza.zzh() == zzgiy.zzb) {
            zzgzeVarZzb = zzgpm.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzh() != zzgiy.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzh()))));
            }
            zzgzeVarZzb = zzgpm.zzb(this.zzd.intValue());
        }
        return new zzgiq(this.zza, this.zzb, this.zzc, zzgzeVarZzb, this.zzd, null);
    }
}
