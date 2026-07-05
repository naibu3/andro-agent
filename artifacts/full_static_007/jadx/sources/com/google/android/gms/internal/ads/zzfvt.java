package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfvt extends zzfwe {
    private final String zza;
    private final String zzb;

    /* synthetic */ zzfvt(String str, String str2, zzfvs zzfvsVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfwe) {
            zzfwe zzfweVar = (zzfwe) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfweVar.zzb()) : zzfweVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfweVar.zza()) : zzfweVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.zza + ", appId=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final String zzb() {
        return this.zza;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
