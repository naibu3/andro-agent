package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgsm implements zzghw {
    private final zzgqk zza;
    private final zzgtl zzb;
    private final zzgtl zzc;

    /* synthetic */ zzgsm(zzgqk zzgqkVar, zzgsl zzgslVar) {
        zzgtl zzgtlVarZza;
        this.zza = zzgqkVar;
        if (zzgqkVar.zzg()) {
            zzgtm zzgtmVarZzb = zzgpg.zza().zzb();
            zzgtr zzgtrVarZza = zzgoy.zza(zzgqkVar);
            this.zzb = zzgtmVarZzb.zza(zzgtrVarZza, "mac", "compute");
            zzgtlVarZza = zzgtmVarZzb.zza(zzgtrVarZza, "mac", "verify");
        } else {
            zzgtlVarZza = zzgoy.zza;
            this.zzb = zzgtlVarZza;
        }
        this.zzc = zzgtlVarZza;
    }
}
