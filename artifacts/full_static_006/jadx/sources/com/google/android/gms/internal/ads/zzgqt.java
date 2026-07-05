package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgqt {
    private final Class zza;
    private final zzgze zzb;

    /* synthetic */ zzgqt(Class cls, zzgze zzgzeVar, zzgqs zzgqsVar) {
        this.zza = cls;
        this.zzb = zzgzeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgqt)) {
            return false;
        }
        zzgqt zzgqtVar = (zzgqt) obj;
        return zzgqtVar.zza.equals(this.zza) && zzgqtVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzgze zzgzeVar = this.zzb;
        return this.zza.getSimpleName() + ", object identifier: " + String.valueOf(zzgzeVar);
    }
}
