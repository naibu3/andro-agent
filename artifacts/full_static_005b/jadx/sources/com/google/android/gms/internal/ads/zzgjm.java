package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgjm extends zzgii {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgjk zzd;

    /* synthetic */ zzgjm(int i, int i2, int i3, zzgjk zzgjkVar, zzgjl zzgjlVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzgjkVar;
    }

    public static zzgjj zzd() {
        return new zzgjj(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjm)) {
            return false;
        }
        zzgjm zzgjmVar = (zzgjm) obj;
        if (zzgjmVar.zza == this.zza && zzgjmVar.zzb == this.zzb) {
            int i = zzgjmVar.zzc;
            if (zzgjmVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzgjm.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zzd != zzgjk.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgjk zze() {
        return this.zzd;
    }
}
