package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaqa implements zzaet {
    private final zzapx zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaqa(zzapx zzapxVar, int i, long j, long j2) {
        this.zza = zzapxVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzapxVar.zzd;
        this.zzd = j3;
        this.zze = zzb(j3);
    }

    private final long zzb(long j) {
        return zzgd.zzt(j * this.zzb, 1000000L, this.zza.zzc, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j) {
        long jMax = Math.max(0L, Math.min((this.zza.zzc * j) / (this.zzb * 1000000), this.zzd - 1));
        long jZzb = zzb(jMax);
        zzaeu zzaeuVar = new zzaeu(jZzb, this.zzc + (this.zza.zzd * jMax));
        if (jZzb >= j || jMax == this.zzd - 1) {
            return new zzaer(zzaeuVar, zzaeuVar);
        }
        long j2 = jMax + 1;
        return new zzaer(zzaeuVar, new zzaeu(zzb(j2), this.zzc + (j2 * this.zza.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
