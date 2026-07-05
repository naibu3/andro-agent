package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaju implements zzajr {
    private final zzfu zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaju(zzajn zzajnVar) {
        zzfu zzfuVar = zzajnVar.zza;
        this.zza = zzfuVar;
        zzfuVar.zzK(12);
        this.zzc = zzfuVar.zzp() & 255;
        this.zzb = zzfuVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzm();
        }
        if (i == 16) {
            return this.zza.zzq();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzm = this.zza.zzm();
        this.zze = iZzm;
        return (iZzm & 240) >> 4;
    }
}
