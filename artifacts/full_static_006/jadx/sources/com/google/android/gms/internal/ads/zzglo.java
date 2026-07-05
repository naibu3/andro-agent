package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzglo extends zzgii {
    private final zzglm zza;
    private final String zzb;
    private final zzgll zzc;
    private final zzgii zzd;

    /* synthetic */ zzglo(zzglm zzglmVar, String str, zzgll zzgllVar, zzgii zzgiiVar, zzgln zzglnVar) {
        this.zza = zzglmVar;
        this.zzb = str;
        this.zzc = zzgllVar;
        this.zzd = zzgiiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzglo)) {
            return false;
        }
        zzglo zzgloVar = (zzglo) obj;
        return zzgloVar.zzc.equals(this.zzc) && zzgloVar.zzd.equals(this.zzd) && zzgloVar.zzb.equals(this.zzb) && zzgloVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzglo.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzglm zzglmVar = this.zza;
        zzgii zzgiiVar = this.zzd;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zzb + ", dekParsingStrategy: " + String.valueOf(this.zzc) + ", dekParametersForNewKeys: " + String.valueOf(zzgiiVar) + ", variant: " + String.valueOf(zzglmVar) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zza != zzglm.zzb;
    }

    public final zzgii zzb() {
        return this.zzd;
    }

    public final zzglm zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}
