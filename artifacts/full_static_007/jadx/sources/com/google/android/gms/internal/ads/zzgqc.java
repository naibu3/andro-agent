package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgqc {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgqc(Class cls, Class cls2, zzgqb zzgqbVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgqc)) {
            return false;
        }
        zzgqc zzgqcVar = (zzgqc) obj;
        return zzgqcVar.zza.equals(this.zza) && zzgqcVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Class cls = this.zzb;
        return this.zza.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
