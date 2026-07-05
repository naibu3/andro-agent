package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgja extends zzgii {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgiy zze;
    private final zzgix zzf;

    /* synthetic */ zzgja(int i, int i2, int i3, int i4, zzgiy zzgiyVar, zzgix zzgixVar, zzgiz zzgizVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzgiyVar;
        this.zzf = zzgixVar;
    }

    public static zzgiw zzf() {
        return new zzgiw(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgja)) {
            return false;
        }
        zzgja zzgjaVar = (zzgja) obj;
        return zzgjaVar.zza == this.zza && zzgjaVar.zzb == this.zzb && zzgjaVar.zzc == this.zzc && zzgjaVar.zzd == this.zzd && zzgjaVar.zze == this.zze && zzgjaVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzgja.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzgix zzgixVar = this.zzf;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.zze) + ", hashType: " + String.valueOf(zzgixVar) + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zze != zzgiy.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzgix zzg() {
        return this.zzf;
    }

    public final zzgiy zzh() {
        return this.zze;
    }
}
