package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgdy implements Serializable {
    private static final zzgdy zza = new zzgdy(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzgdy(int[] iArr, int i, int i2) {
        this.zzb = iArr;
        this.zzc = i2;
    }

    public static zzgdy zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgdy(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public static zzgdy zzc() {
        return zza;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgdy)) {
            return false;
        }
        zzgdy zzgdyVar = (zzgdy) obj;
        if (this.zzc != zzgdyVar.zzc) {
            return false;
        }
        for (int i = 0; i < this.zzc; i++) {
            if (zza(i) != zzgdyVar.zza(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zzb[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.zzc;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        sb.append(this.zzb[0]);
        for (int i2 = 1; i2 < this.zzc; i2++) {
            sb.append(", ");
            sb.append(this.zzb[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zza(int i) {
        zzfyg.zza(i, this.zzc, "index");
        return this.zzb[i];
    }
}
