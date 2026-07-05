package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzakx implements zzald {
    private final zzaeg zza;
    private final zzaef zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzakx(zzaeg zzaegVar, zzaef zzaefVar) {
        this.zza = zzaegVar;
        this.zzb = zzaefVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final long zzd(zzadv zzadvVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final zzaet zze() {
        zzeq.zzf(this.zzc != -1);
        return new zzaee(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzgd.zzc(jArr, j, true, true)];
    }
}
