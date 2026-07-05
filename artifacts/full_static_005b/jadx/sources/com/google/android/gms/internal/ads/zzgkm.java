package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgkm extends zzgii {
    private final int zza;
    private final zzgkk zzb;

    /* synthetic */ zzgkm(int i, zzgkk zzgkkVar, zzgkl zzgklVar) {
        this.zza = i;
        this.zzb = zzgkkVar;
    }

    public static zzgkj zzc() {
        return new zzgkj(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgkm)) {
            return false;
        }
        zzgkm zzgkmVar = (zzgkm) obj;
        return zzgkmVar.zza == this.zza && zzgkmVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgkm.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zzb != zzgkk.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgkk zzd() {
        return this.zzb;
    }
}
