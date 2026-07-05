package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgou extends zzghi {
    private final zzgql zza;

    public zzgou(zzgql zzgqlVar, @Nullable zzgic zzgicVar) throws GeneralSecurityException {
        zzc(zzgqlVar, zzgicVar);
        this.zza = zzgqlVar;
    }

    private static void zzc(zzgql zzgqlVar, @Nullable zzgic zzgicVar) throws GeneralSecurityException {
        int i = zzgot.zzb[zzgqlVar.zzb().ordinal()];
    }

    public final zzgql zza(@Nullable zzgic zzgicVar) throws GeneralSecurityException {
        zzc(this.zza, zzgicVar);
        return this.zza;
    }

    @Nullable
    public final Integer zzb() {
        return this.zza.zzf();
    }
}
