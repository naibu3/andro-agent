package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzlo {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* synthetic */ zzlo(zzlm zzlmVar, zzln zzlnVar) {
        this.zza = zzlmVar.zza;
        this.zzb = zzlmVar.zzb;
        this.zzc = zzlmVar.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlo)) {
            return false;
        }
        zzlo zzloVar = (zzlo) obj;
        return this.zza == zzloVar.zza && this.zzb == zzloVar.zzb && this.zzc == zzloVar.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzlm zza() {
        return new zzlm(this, null);
    }
}
