package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzabw {
    private final zzabv zza;
    private final zzabq zzb;
    private zzdv zzg;
    private long zzi;
    private final zzabo zzc = new zzabo();
    private final zzga zzd = new zzga(10);
    private final zzga zze = new zzga(10);
    private final zzfm zzf = new zzfm(16);
    private zzdv zzh = zzdv.zza;
    private long zzj = -9223372036854775807L;

    public zzabw(zzabv zzabvVar, zzabq zzabqVar) {
        this.zza = zzabvVar;
        this.zzb = zzabqVar;
    }

    private static Object zzf(zzga zzgaVar) {
        zzeq.zzd(zzgaVar.zza() > 0);
        while (zzgaVar.zza() > 1) {
            zzgaVar.zzb();
        }
        Object objZzb = zzgaVar.zzb();
        objZzb.getClass();
        return objZzb;
    }

    public final void zza() {
        this.zzf.zzc();
        this.zzj = -9223372036854775807L;
        zzga zzgaVar = this.zze;
        if (zzgaVar.zza() > 0) {
            this.zze.zzd(0L, Long.valueOf(((Long) zzf(zzgaVar)).longValue()));
        }
        if (this.zzg != null) {
            this.zzd.zze();
            return;
        }
        zzga zzgaVar2 = this.zzd;
        if (zzgaVar2.zza() > 0) {
            this.zzg = (zzdv) zzf(zzgaVar2);
        }
    }

    public final void zzb(long j, long j2) {
        this.zze.zzd(j, Long.valueOf(j2));
    }

    public final void zzc(long j, long j2) throws zzjh {
        while (true) {
            zzfm zzfmVar = this.zzf;
            if (zzfmVar.zzd()) {
                return;
            }
            zzga zzgaVar = this.zze;
            long jZza = zzfmVar.zza();
            Long l = (Long) zzgaVar.zzc(jZza);
            if (l != null && l.longValue() != this.zzi) {
                this.zzi = l.longValue();
                this.zzb.zzf();
            }
            int iZza = this.zzb.zza(jZza, j, j2, this.zzi, false, this.zzc);
            if (iZza == 0 || iZza == 1) {
                this.zzj = jZza;
                long jLongValue = Long.valueOf(this.zzf.zzb()).longValue();
                zzdv zzdvVar = (zzdv) this.zzd.zzc(jLongValue);
                if (zzdvVar != null && !zzdvVar.equals(zzdv.zza) && !zzdvVar.equals(this.zzh)) {
                    this.zzh = zzdvVar;
                    this.zza.zzm(zzdvVar);
                }
                this.zza.zzp(iZza == 0 ? -1L : this.zzc.zzd(), jLongValue, this.zzi, this.zzb.zzp());
            } else {
                if (iZza != 2 && iZza != 3 && iZza != 4) {
                    return;
                }
                this.zzj = jZza;
                this.zzf.zzb();
                this.zza.zzl();
            }
        }
    }

    public final void zzd(float f) {
        zzeq.zzd(f > 0.0f);
        this.zzb.zzn(f);
    }

    public final boolean zze(long j) {
        long j2 = this.zzj;
        return j2 != -9223372036854775807L && j2 >= j;
    }
}
