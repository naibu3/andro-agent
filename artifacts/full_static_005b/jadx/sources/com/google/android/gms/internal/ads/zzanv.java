package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzanv implements zzaoc {
    private final zzft zza;
    private final zzfu zzb;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzafa zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzan zzk;
    private int zzl;
    private long zzm;

    public zzanv() {
        throw null;
    }

    public zzanv(String str, int i) {
        zzft zzftVar = new zzft(new byte[16], 16);
        this.zza = zzftVar;
        this.zzb = new zzfu(zzftVar.zza);
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zza(zzfu zzfuVar) {
        zzeq.zzb(this.zzf);
        while (zzfuVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                while (zzfuVar.zzb() > 0) {
                    if (this.zzi) {
                        int iZzm = zzfuVar.zzm();
                        this.zzi = iZzm == 172;
                        byte b = SignedBytes.MAX_POWER_OF_TWO;
                        if (iZzm != 64) {
                            if (iZzm == 65) {
                                iZzm = 65;
                            }
                        }
                        this.zzg = 1;
                        zzfu zzfuVar2 = this.zzb;
                        zzfuVar2.zzM()[0] = -84;
                        if (iZzm == 65) {
                            b = 65;
                        }
                        zzfuVar2.zzM()[1] = b;
                        this.zzh = 2;
                    } else {
                        this.zzi = zzfuVar.zzm() == 172;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzfuVar.zzb(), this.zzl - this.zzh);
                this.zzf.zzq(zzfuVar, iMin);
                int i2 = this.zzh + iMin;
                this.zzh = i2;
                if (i2 == this.zzl) {
                    zzeq.zzf(this.zzm != -9223372036854775807L);
                    this.zzf.zzs(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzj;
                    this.zzg = 0;
                }
            } else {
                byte[] bArrZzM = this.zzb.zzM();
                int iMin2 = Math.min(zzfuVar.zzb(), 16 - this.zzh);
                zzfuVar.zzG(bArrZzM, this.zzh, iMin2);
                int i3 = this.zzh + iMin2;
                this.zzh = i3;
                if (i3 == 16) {
                    this.zza.zzk(0);
                    zzacv zzacvVarZza = zzacw.zza(this.zza);
                    zzan zzanVar = this.zzk;
                    if (zzanVar == null || zzanVar.zzA != 2 || zzacvVarZza.zza != zzanVar.zzB || !"audio/ac4".equals(zzanVar.zzn)) {
                        zzal zzalVar = new zzal();
                        zzalVar.zzK(this.zze);
                        zzalVar.zzX("audio/ac4");
                        zzalVar.zzy(2);
                        zzalVar.zzY(zzacvVarZza.zza);
                        zzalVar.zzO(this.zzc);
                        zzalVar.zzV(this.zzd);
                        zzan zzanVarZzad = zzalVar.zzad();
                        this.zzk = zzanVarZzad;
                        this.zzf.zzl(zzanVarZzad);
                    }
                    this.zzl = zzacvVarZza.zzb;
                    this.zzj = (zzacvVarZza.zzc * 1000000) / this.zzk.zzB;
                    this.zzb.zzK(0);
                    this.zzf.zzq(this.zzb, 16);
                    this.zzg = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zze = zzapoVar.zzb();
        this.zzf = zzadxVar.zzw(zzapoVar.zza(), 1);
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
        this.zzi = false;
        this.zzm = -9223372036854775807L;
    }
}
