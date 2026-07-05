package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzqa {
    public static final zzqa zza = new zzpy().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ zzqa(zzpy zzpyVar, zzpz zzpzVar) {
        this.zzb = zzpyVar.zza;
        this.zzc = zzpyVar.zzb;
        this.zzd = zzpyVar.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzqa zzqaVar = (zzqa) obj;
            if (this.zzb == zzqaVar.zzb && this.zzc == zzqaVar.zzc && this.zzd == zzqaVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
