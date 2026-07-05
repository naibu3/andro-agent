package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public class zzaes implements zzaet {
    private final long zza;
    private final zzaer zzb;

    public zzaes(long j, long j2) {
        this.zza = j;
        zzaeu zzaeuVar = j2 == 0 ? zzaeu.zza : new zzaeu(0L, j2);
        this.zzb = new zzaer(zzaeuVar, zzaeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return false;
    }
}
