package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzagn extends zzaeh {
    private final long zza;

    public zzagn(zzadv zzadvVar, long j) {
        super(zzadvVar);
        zzeq.zzd(zzadvVar.zzf() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaeh, com.google.android.gms.internal.ads.zzadv
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeh, com.google.android.gms.internal.ads.zzadv
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeh, com.google.android.gms.internal.ads.zzadv
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
