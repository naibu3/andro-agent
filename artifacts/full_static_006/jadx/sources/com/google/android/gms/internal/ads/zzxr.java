package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzxr {
    public final int zzc;
    private final zzgbc zze;
    private int zzf;
    public static final zzxr zza = new zzxr(new zzde[0]);
    private static final String zzd = Integer.toString(0, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzxp
    };

    /* JADX WARN: Multi-variable type inference failed */
    public zzxr(zzde... zzdeVarArr) {
        this.zze = zzgbc.zzl(zzdeVarArr);
        this.zzc = zzdeVarArr.length;
        int i = 0;
        while (i < this.zze.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zze.size(); i3++) {
                if (((zzde) this.zze.get(i)).equals(this.zze.get(i3))) {
                    zzfk.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzxr zzxrVar = (zzxr) obj;
            if (this.zzc == zzxrVar.zzc && this.zze.equals(zzxrVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zze.hashCode();
        this.zzf = iHashCode;
        return iHashCode;
    }

    public final int zza(zzde zzdeVar) {
        int iIndexOf = this.zze.indexOf(zzdeVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzde zzb(int i) {
        return (zzde) this.zze.get(i);
    }

    public final zzgbc zzc() {
        return zzgbc.zzk(zzgbs.zzb(this.zze, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzxq
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                zzxr zzxrVar = zzxr.zza;
                return Integer.valueOf(((zzde) obj).zzd);
            }
        }));
    }
}
