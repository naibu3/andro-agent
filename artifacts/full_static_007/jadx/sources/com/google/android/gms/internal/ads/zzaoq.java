package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaoq implements zzaoc {
    private final zzfu zza;
    private final zzaen zzb;
    private final String zzc;
    private final int zzd;
    private zzafa zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzaoq() {
        throw null;
    }

    public zzaoq(String str, int i) {
        this.zzg = 0;
        zzfu zzfuVar = new zzfu(4);
        this.zza = zzfuVar;
        zzfuVar.zzM()[0] = -1;
        this.zzb = new zzaen();
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zza(zzfu zzfuVar) {
        zzeq.zzb(this.zze);
        while (zzfuVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                byte[] bArrZzM = zzfuVar.zzM();
                int iZzd = zzfuVar.zzd();
                int iZze = zzfuVar.zze();
                while (true) {
                    if (iZzd >= iZze) {
                        zzfuVar.zzK(iZze);
                        break;
                    }
                    int i2 = iZzd + 1;
                    byte b = bArrZzM[iZzd];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.zzj && (b & 224) == 224;
                    this.zzj = z;
                    if (z2) {
                        zzfuVar.zzK(i2);
                        this.zzj = false;
                        this.zza.zzM()[1] = bArrZzM[iZzd];
                        this.zzh = 2;
                        this.zzg = 1;
                        break;
                    }
                    iZzd = i2;
                }
            } else if (i != 1) {
                int iMin = Math.min(zzfuVar.zzb(), this.zzl - this.zzh);
                this.zze.zzq(zzfuVar, iMin);
                int i3 = this.zzh + iMin;
                this.zzh = i3;
                if (i3 >= this.zzl) {
                    zzeq.zzf(this.zzm != -9223372036854775807L);
                    this.zze.zzs(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzk;
                    this.zzh = 0;
                    this.zzg = 0;
                }
            } else {
                int iMin2 = Math.min(zzfuVar.zzb(), 4 - this.zzh);
                zzfuVar.zzG(this.zza.zzM(), this.zzh, iMin2);
                int i4 = this.zzh + iMin2;
                this.zzh = i4;
                if (i4 >= 4) {
                    this.zza.zzK(0);
                    if (this.zzb.zza(this.zza.zzg())) {
                        this.zzl = this.zzb.zzc;
                        if (!this.zzi) {
                            this.zzk = (r0.zzg * 1000000) / r0.zzd;
                            zzal zzalVar = new zzal();
                            zzalVar.zzK(this.zzf);
                            zzalVar.zzX(this.zzb.zzb);
                            zzalVar.zzP(4096);
                            zzalVar.zzy(this.zzb.zze);
                            zzalVar.zzY(this.zzb.zzd);
                            zzalVar.zzO(this.zzc);
                            zzalVar.zzV(this.zzd);
                            this.zze.zzl(zzalVar.zzad());
                            this.zzi = true;
                        }
                        this.zza.zzK(0);
                        this.zze.zzq(this.zza, 4);
                        this.zzg = 2;
                    } else {
                        this.zzh = 0;
                        this.zzg = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zzf = zzapoVar.zzb();
        this.zze = zzadxVar.zzw(zzapoVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
    }
}
