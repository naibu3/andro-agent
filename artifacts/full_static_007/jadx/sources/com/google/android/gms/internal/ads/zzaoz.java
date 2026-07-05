package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaoz {
    private final zzaoc zza;
    private final zzgb zzb;
    private final zzft zzc = new zzft(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzaoz(zzaoc zzaocVar, zzgb zzgbVar) {
        this.zza = zzaocVar;
        this.zzb = zzgbVar;
    }

    public final void zza(zzfu zzfuVar) throws zzch {
        long jZzb;
        char c;
        zzfuVar.zzG(this.zzc.zza, 0, 3);
        this.zzc.zzk(0);
        this.zzc.zzm(8);
        this.zzd = this.zzc.zzo();
        this.zze = this.zzc.zzo();
        this.zzc.zzm(6);
        zzft zzftVar = this.zzc;
        zzfuVar.zzG(zzftVar.zza, 0, zzftVar.zzd(8));
        this.zzc.zzk(0);
        if (this.zzd) {
            this.zzc.zzm(4);
            long jZzd = this.zzc.zzd(3);
            this.zzc.zzm(1);
            int iZzd = this.zzc.zzd(15) << 15;
            this.zzc.zzm(1);
            long jZzd2 = this.zzc.zzd(15);
            this.zzc.zzm(1);
            if (this.zzf || !this.zze) {
                c = 30;
            } else {
                this.zzc.zzm(4);
                this.zzc.zzm(1);
                int iZzd2 = this.zzc.zzd(15) << 15;
                this.zzc.zzm(1);
                long jZzd3 = this.zzc.zzd(15);
                this.zzc.zzm(1);
                this.zzb.zzb(iZzd2 | (this.zzc.zzd(3) << 30) | jZzd3);
                this.zzf = true;
                c = 30;
            }
            jZzb = this.zzb.zzb((jZzd << c) | iZzd | jZzd2);
        } else {
            jZzb = 0;
        }
        this.zza.zzd(jZzb, 4);
        this.zza.zza(zzfuVar);
        this.zza.zzc();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
