package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfvz extends zzfwr {
    private final int zza;
    private final String zzb;

    /* synthetic */ zzfvz(int i, String str, zzfvy zzfvyVar) {
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfwr) {
            zzfwr zzfwrVar = (zzfwr) obj;
            if (this.zza == zzfwrVar.zza() && ((str = this.zzb) != null ? str.equals(zzfwrVar.zzb()) : zzfwrVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.zza + ", sessionToken=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final String zzb() {
        return this.zzb;
    }
}
