package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfyl extends zzfyb {
    private final Object zza;

    zzfyl(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfyl) {
            return this.zza.equals(((zzfyl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final zzfyb zza(zzfxu zzfxuVar) {
        Object objApply = zzfxuVar.apply(this.zza);
        zzfyg.zzc(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzfyl(objApply);
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
