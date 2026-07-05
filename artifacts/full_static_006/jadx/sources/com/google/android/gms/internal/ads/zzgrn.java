package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgrn extends zzgsj {
    private final int zza;
    private final int zzb;
    private final zzgrl zzc;

    /* synthetic */ zzgrn(int i, int i2, zzgrl zzgrlVar, zzgrm zzgrmVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgrlVar;
    }

    public static zzgrk zze() {
        return new zzgrk(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgrn)) {
            return false;
        }
        zzgrn zzgrnVar = (zzgrn) obj;
        return zzgrnVar.zza == this.zza && zzgrnVar.zzd() == zzd() && zzgrnVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzgrn.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.zzc) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zzc != zzgrl.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgrl zzgrlVar = this.zzc;
        if (zzgrlVar == zzgrl.zzd) {
            return this.zzb;
        }
        if (zzgrlVar == zzgrl.zza || zzgrlVar == zzgrl.zzb || zzgrlVar == zzgrl.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgrl zzf() {
        return this.zzc;
    }
}
