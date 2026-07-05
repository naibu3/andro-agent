package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzapi implements zzapb {
    final /* synthetic */ zzapk zza;
    private final zzft zzb = new zzft(new byte[4], 4);

    public zzapi(zzapk zzapkVar) {
        this.zza = zzapkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zza(zzfu zzfuVar) {
        if (zzfuVar.zzm() == 0 && (zzfuVar.zzm() & 128) != 0) {
            zzfuVar.zzL(6);
            int iZzb = zzfuVar.zzb() / 4;
            for (int i = 0; i < iZzb; i++) {
                zzfuVar.zzF(this.zzb, 4);
                zzft zzftVar = this.zzb;
                int iZzd = zzftVar.zzd(16);
                zzftVar.zzm(3);
                if (iZzd == 0) {
                    this.zzb.zzm(13);
                } else {
                    int iZzd2 = this.zzb.zzd(13);
                    if (this.zza.zzg.get(iZzd2) == null) {
                        zzapk zzapkVar = this.zza;
                        zzapkVar.zzg.put(iZzd2, new zzapc(new zzapj(zzapkVar, iZzd2)));
                        this.zza.zzm++;
                    }
                }
            }
            this.zza.zzg.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzb(zzgb zzgbVar, zzadx zzadxVar, zzapo zzapoVar) {
    }
}
