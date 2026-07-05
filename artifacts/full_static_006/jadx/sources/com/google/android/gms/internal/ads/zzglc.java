package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzglc extends zzgii {
    private final String zza;
    private final zzglb zzb;

    private zzglc(String str, zzglb zzglbVar) {
        this.zza = str;
        this.zzb = zzglbVar;
    }

    public static zzglc zzc(String str, zzglb zzglbVar) {
        return new zzglc(str, zzglbVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzglc)) {
            return false;
        }
        zzglc zzglcVar = (zzglc) obj;
        return zzglcVar.zza.equals(this.zza) && zzglcVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzglc.class, this.zza, this.zzb);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + this.zzb.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zzb != zzglb.zzb;
    }

    public final zzglb zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}
