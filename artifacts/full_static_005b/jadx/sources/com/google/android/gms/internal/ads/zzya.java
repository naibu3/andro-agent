package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public class zzya implements zzzg {
    protected final zzde zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzan[] zzd;
    private int zze;

    public zzya(zzde zzdeVar, int[] iArr, int i) {
        int length = iArr.length;
        zzeq.zzf(length > 0);
        zzdeVar.getClass();
        this.zza = zzdeVar;
        this.zzb = length;
        this.zzd = new zzan[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzdeVar.zzb(iArr[i2]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzan) obj2).zzj - ((zzan) obj).zzj;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzdeVar.zza(this.zzd[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzya zzyaVar = (zzya) obj;
            if (this.zza.equals(zzyaVar.zza) && Arrays.equals(this.zzc, zzyaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final int zza(int i) {
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzan zzd(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzde zze() {
        return this.zza;
    }
}
