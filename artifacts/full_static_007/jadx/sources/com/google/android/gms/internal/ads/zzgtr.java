package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgtr {
    private final zzgtk zza;
    private final List zzb;

    @Nullable
    private final Integer zzc;

    /* synthetic */ zzgtr(zzgtk zzgtkVar, List list, Integer num, zzgtq zzgtqVar) {
        this.zza = zzgtkVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgtr)) {
            return false;
        }
        zzgtr zzgtrVar = (zzgtr) obj;
        return this.zza.equals(zzgtrVar.zza) && this.zzb.equals(zzgtrVar.zzb) && Objects.equals(this.zzc, zzgtrVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
