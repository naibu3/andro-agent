package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zziy {
    public final String zza;
    public final zzan zzb;
    public final zzan zzc;
    public final int zzd;
    public final int zze;

    public zziy(String str, zzan zzanVar, zzan zzanVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        zzeq.zzd(z);
        zzeq.zzc(str);
        this.zza = str;
        this.zzb = zzanVar;
        zzanVar2.getClass();
        this.zzc = zzanVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zziy zziyVar = (zziy) obj;
            if (this.zzd == zziyVar.zzd && this.zze == zziyVar.zze && this.zza.equals(zziyVar.zza) && this.zzb.equals(zziyVar.zzb) && this.zzc.equals(zziyVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
