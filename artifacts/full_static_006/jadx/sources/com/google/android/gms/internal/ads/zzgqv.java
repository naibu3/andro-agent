package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgqv {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgqv(Class cls, Class cls2, zzgqu zzgquVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgqv)) {
            return false;
        }
        zzgqv zzgqvVar = (zzgqv) obj;
        return zzgqvVar.zza.equals(this.zza) && zzgqvVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Class cls = this.zzb;
        return this.zza.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
