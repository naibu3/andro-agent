package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgov extends zzghx {
    private final zzgqm zza;

    public zzgov(zzgqm zzgqmVar) {
        this.zza = zzgqmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgov)) {
            return false;
        }
        zzgqm zzgqmVar = ((zzgov) obj).zza;
        return this.zza.zzc().zzg().equals(zzgqmVar.zzc().zzg()) && this.zza.zzc().zzi().equals(zzgqmVar.zzc().zzi()) && this.zza.zzc().zzh().equals(zzgqmVar.zzc().zzh());
    }

    public final int hashCode() {
        zzgqm zzgqmVar = this.zza;
        return Objects.hash(zzgqmVar.zzc(), zzgqmVar.zzd());
    }

    public final String toString() {
        String strZzi = this.zza.zzc().zzi();
        zzgxn zzgxnVarZzg = this.zza.zzc().zzg();
        zzgxn zzgxnVar = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgxnVarZzg.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strZzi, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgxn.RAW;
    }

    public final zzgqm zzb() {
        return this.zza;
    }
}
