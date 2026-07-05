package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzgor {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgor(Class cls, Class cls2, zzgoq zzgoqVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgor zzb(zzgop zzgopVar, Class cls, Class cls2) {
        return new zzgoo(cls, cls2, zzgopVar);
    }

    public abstract zzgqq zza(zzghi zzghiVar, @Nullable zzgic zzgicVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
