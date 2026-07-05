package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaee implements zzaet {
    private final zzaeg zza;
    private final long zzb;

    public zzaee(zzaeg zzaegVar, long j) {
        this.zza = zzaegVar;
        this.zzb = j;
    }

    private final zzaeu zzb(long j, long j2) {
        return new zzaeu((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j) {
        zzeq.zzb(this.zza.zzk);
        zzaeg zzaegVar = this.zza;
        zzaef zzaefVar = zzaegVar.zzk;
        long[] jArr = zzaefVar.zza;
        long[] jArr2 = zzaefVar.zzb;
        int iZzc = zzgd.zzc(jArr, zzaegVar.zzb(j), true, false);
        zzaeu zzaeuVarZzb = zzb(iZzc == -1 ? 0L : jArr[iZzc], iZzc != -1 ? jArr2[iZzc] : 0L);
        if (zzaeuVarZzb.zzb == j || iZzc == jArr.length - 1) {
            return new zzaer(zzaeuVarZzb, zzaeuVarZzb);
        }
        int i = iZzc + 1;
        return new zzaer(zzaeuVarZzb, zzb(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
