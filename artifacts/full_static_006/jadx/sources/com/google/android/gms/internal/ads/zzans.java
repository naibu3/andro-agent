package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzans implements zzaoc {
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

    public zzans() {
        throw null;
    }

    public zzans(String str, int i) {
        zzft zzftVar = new zzft(new byte[128], 128);
        this.zza = zzftVar;
        this.zzb = new zzfu(zzftVar.zza);
        this.zzg = 0;
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
                while (true) {
                    if (zzfuVar.zzb() <= 0) {
                        break;
                    }
                    if (this.zzi) {
                        int iZzm = zzfuVar.zzm();
                        if (iZzm == 119) {
                            this.zzi = false;
                            this.zzg = 1;
                            zzfu zzfuVar2 = this.zzb;
                            zzfuVar2.zzM()[0] = Ascii.VT;
                            zzfuVar2.zzM()[1] = 119;
                            this.zzh = 2;
                            break;
                        }
                        this.zzi = iZzm == 11;
                    } else {
                        this.zzi = zzfuVar.zzm() == 11;
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
                int iMin2 = Math.min(zzfuVar.zzb(), 128 - this.zzh);
                zzfuVar.zzG(bArrZzM, this.zzh, iMin2);
                int i3 = this.zzh + iMin2;
                this.zzh = i3;
                if (i3 == 128) {
                    this.zza.zzk(0);
                    zzacs zzacsVarZze = zzact.zze(this.zza);
                    zzan zzanVar = this.zzk;
                    if (zzanVar == null || zzacsVarZze.zzc != zzanVar.zzA || zzacsVarZze.zzb != zzanVar.zzB || !zzgd.zzG(zzacsVarZze.zza, zzanVar.zzn)) {
                        zzal zzalVar = new zzal();
                        zzalVar.zzK(this.zze);
                        zzalVar.zzX(zzacsVarZze.zza);
                        zzalVar.zzy(zzacsVarZze.zzc);
                        zzalVar.zzY(zzacsVarZze.zzb);
                        zzalVar.zzO(this.zzc);
                        zzalVar.zzV(this.zzd);
                        zzalVar.zzS(zzacsVarZze.zzf);
                        if ("audio/ac3".equals(zzacsVarZze.zza)) {
                            zzalVar.zzx(zzacsVarZze.zzf);
                        }
                        zzan zzanVarZzad = zzalVar.zzad();
                        this.zzk = zzanVarZzad;
                        this.zzf.zzl(zzanVarZzad);
                    }
                    this.zzl = zzacsVarZze.zzd;
                    this.zzj = (zzacsVarZze.zze * 1000000) / this.zzk.zzB;
                    this.zzb.zzK(0);
                    this.zzf.zzq(this.zzb, 128);
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
