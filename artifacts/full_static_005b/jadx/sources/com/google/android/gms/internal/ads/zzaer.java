package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaer {
    public final zzaeu zza;
    public final zzaeu zzb;

    public zzaer(zzaeu zzaeuVar, zzaeu zzaeuVar2) {
        this.zza = zzaeuVar;
        this.zzb = zzaeuVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaer zzaerVar = (zzaer) obj;
            if (this.zza.equals(zzaerVar.zza) && this.zzb.equals(zzaerVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzaeu zzaeuVar = this.zza;
        zzaeu zzaeuVar2 = this.zzb;
        return "[" + zzaeuVar.toString() + (zzaeuVar.equals(zzaeuVar2) ? "" : ", ".concat(this.zzb.toString())) + "]";
    }
}
