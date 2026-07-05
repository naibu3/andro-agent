package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzajb extends zzadh implements zzaji {
    private final int zza;

    public zzajb(long j, long j2, zzaen zzaenVar, boolean z) {
        super(j, j2, zzaenVar.zzf, zzaenVar.zzc, false);
        this.zza = zzaenVar.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final long zze(long j) {
        return zzb(j);
    }
}
