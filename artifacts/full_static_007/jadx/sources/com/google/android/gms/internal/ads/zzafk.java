package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzafk implements zzaet {
    final /* synthetic */ zzafn zza;
    private final long zzb;

    public zzafk(zzafn zzafnVar, long j) {
        this.zza = zzafnVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j) {
        zzaer zzaerVarZza = this.zza.zzh[0].zza(j);
        int i = 1;
        while (true) {
            zzafn zzafnVar = this.zza;
            if (i >= zzafnVar.zzh.length) {
                return zzaerVarZza;
            }
            zzaer zzaerVarZza2 = zzafnVar.zzh[i].zza(j);
            if (zzaerVarZza2.zza.zzc < zzaerVarZza.zza.zzc) {
                zzaerVarZza = zzaerVarZza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
