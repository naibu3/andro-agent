package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfvw extends zzfwp {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    /* synthetic */ zzfvw(IBinder iBinder, String str, int i, float f, int i2, int i3, String str2, int i4, String str3, String str4, String str5, zzfvv zzfvvVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i;
        this.zzd = f;
        this.zze = i4;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfwp) {
            zzfwp zzfwpVar = (zzfwp) obj;
            if (this.zza.equals(zzfwpVar.zzf()) && ((str = this.zzb) != null ? str.equals(zzfwpVar.zzh()) : zzfwpVar.zzh() == null) && this.zzc == zzfwpVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfwpVar.zza())) {
                zzfwpVar.zzb();
                zzfwpVar.zzd();
                zzfwpVar.zzj();
                if (this.zze == zzfwpVar.zze()) {
                    zzfwpVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzfwpVar.zzg()) : zzfwpVar.zzg() == null) {
                        zzfwpVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i = this.zze;
        String str2 = this.zzf;
        return ((((iHashCode2 * 1525764945) ^ i) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.zza.toString() + ", appId=" + this.zzb + ", layoutGravity=" + this.zzc + ", layoutVerticalMargin=" + this.zzd + ", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=" + this.zze + ", deeplinkUrl=null, adFieldEnifd=" + this.zzf + ", thirdPartyAuthCallerId=null}";
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final IBinder zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final String zzk() {
        return null;
    }
}
