package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzftt extends zzftz {
    private final String zzb;
    private final int zzc;

    /* synthetic */ zzftt(String str, boolean z, boolean z2, zzftp zzftpVar, zzftq zzftqVar, int i, zzfts zzftsVar) {
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftz) {
            zzftz zzftzVar = (zzftz) obj;
            if (this.zzb.equals(zzftzVar.zzc())) {
                zzftzVar.zzd();
                zzftzVar.zze();
                zzftzVar.zza();
                zzftzVar.zzb();
                int i = this.zzc;
                int iZzf = zzftzVar.zzf();
                if (i == 0) {
                    throw null;
                }
                if (iZzf == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        if (this.zzc != 0) {
            return (((((iHashCode * 1000003) ^ 1237) * 1000003) ^ 1237) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str = this.zzc != 1 ? "null" : "READ_AND_WRITE";
        return "FileComplianceOptions{fileOwner=" + this.zzb + ", hasDifferentDmaOwner=false, skipChecks=false, dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final zzftp zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final zzftq zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final int zzf() {
        return this.zzc;
    }
}
