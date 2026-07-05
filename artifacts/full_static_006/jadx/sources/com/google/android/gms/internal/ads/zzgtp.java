package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgtp {
    private final zzghk zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzgtp(zzghk zzghkVar, int i, String str, String str2, zzgto zzgtoVar) {
        this.zza = zzghkVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgtp)) {
            return false;
        }
        zzgtp zzgtpVar = (zzgtp) obj;
        return this.zza == zzgtpVar.zza && this.zzb == zzgtpVar.zzb && this.zzc.equals(zzgtpVar.zzc) && this.zzd.equals(zzgtpVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
