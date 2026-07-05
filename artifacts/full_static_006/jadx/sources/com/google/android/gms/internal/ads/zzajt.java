package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzajt implements zzajr {
    private final int zza;
    private final int zzb;
    private final zzfu zzc;

    public zzajt(zzajn zzajnVar, zzan zzanVar) {
        zzfu zzfuVar = zzajnVar.zza;
        this.zzc = zzfuVar;
        zzfuVar.zzK(12);
        int iZzp = zzfuVar.zzp();
        if ("audio/raw".equals(zzanVar.zzn)) {
            int iZzm = zzgd.zzm(zzanVar.zzC, zzanVar.zzA);
            if (iZzp == 0 || iZzp % iZzm != 0) {
                zzfk.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iZzm + ", stsz sample size: " + iZzp);
                iZzp = iZzm;
            }
        }
        this.zza = iZzp == 0 ? -1 : iZzp;
        this.zzb = zzfuVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzp() : i;
    }
}
