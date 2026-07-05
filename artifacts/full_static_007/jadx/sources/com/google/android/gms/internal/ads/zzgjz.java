package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgjz extends zzgii {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgjx zzd;

    /* synthetic */ zzgjz(int i, int i2, int i3, zzgjx zzgjxVar, zzgjy zzgjyVar) {
        this.zza = i;
        this.zzd = zzgjxVar;
    }

    public static zzgjw zzc() {
        return new zzgjw(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjz)) {
            return false;
        }
        zzgjz zzgjzVar = (zzgjz) obj;
        if (zzgjzVar.zza == this.zza) {
            int i = zzgjzVar.zzb;
            int i2 = zzgjzVar.zzc;
            if (zzgjzVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzgjz.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.zzd) + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zzd != zzgjx.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgjx zzd() {
        return this.zzd;
    }
}
