package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgjc {

    @Nullable
    private zzgjm zza = null;

    @Nullable
    private zzgzf zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgjc() {
    }

    /* synthetic */ zzgjc(zzgjb zzgjbVar) {
    }

    public final zzgjc zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgjc zzb(zzgzf zzgzfVar) {
        this.zzb = zzgzfVar;
        return this;
    }

    public final zzgjc zzc(zzgjm zzgjmVar) {
        this.zza = zzgjmVar;
        return this;
    }

    public final zzgje zzd() throws GeneralSecurityException {
        zzgzf zzgzfVar;
        zzgze zzgzeVarZzb;
        zzgjm zzgjmVar = this.zza;
        if (zzgjmVar == null || (zzgzfVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgjmVar.zzc() != zzgzfVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgjmVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzgjk.zzc) {
            zzgzeVarZzb = zzgpm.zza;
        } else if (this.zza.zze() == zzgjk.zzb) {
            zzgzeVarZzb = zzgpm.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzgjk.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zze()))));
            }
            zzgzeVarZzb = zzgpm.zzb(this.zzc.intValue());
        }
        return new zzgje(this.zza, this.zzb, zzgzeVarZzb, this.zzc, null);
    }
}
