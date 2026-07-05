package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgla extends zzgih {
    private final zzglc zza;
    private final zzgze zzb;

    @Nullable
    private final Integer zzc;

    private zzgla(zzglc zzglcVar, zzgze zzgzeVar, @Nullable Integer num) {
        this.zza = zzglcVar;
        this.zzb = zzgzeVar;
        this.zzc = num;
    }

    public static zzgla zza(zzglc zzglcVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgze zzgzeVarZzb;
        if (zzglcVar.zzb() == zzglb.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzgzeVarZzb = zzgze.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzglcVar.zzb() != zzglb.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzglcVar.zzb().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzgzeVarZzb = zzgze.zzb(new byte[0]);
        }
        return new zzgla(zzglcVar, zzgzeVarZzb, num);
    }

    public final zzglc zzb() {
        return this.zza;
    }

    public final zzgze zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
