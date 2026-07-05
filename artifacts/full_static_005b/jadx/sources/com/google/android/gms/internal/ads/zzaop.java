package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaop implements zzaoc {
    private final String zza;
    private final int zzb;
    private final zzfu zzc;
    private final zzft zzd;
    private zzafa zze;
    private String zzf;
    private zzan zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private String zzv;

    public zzaop(String str, int i) {
        this.zza = str;
        this.zzb = i;
        zzfu zzfuVar = new zzfu(1024);
        this.zzc = zzfuVar;
        byte[] bArrZzM = zzfuVar.zzM();
        this.zzd = new zzft(bArrZzM, bArrZzM.length);
        this.zzl = -9223372036854775807L;
    }

    private final int zzf(zzft zzftVar) throws zzch {
        int iZza = zzftVar.zza();
        zzacp zzacpVarZzb = zzacq.zzb(zzftVar, true);
        this.zzv = zzacpVarZzb.zzc;
        this.zzs = zzacpVarZzb.zza;
        this.zzu = zzacpVarZzb.zzb;
        return iZza - zzftVar.zza();
    }

    private static long zzg(zzft zzftVar) {
        return zzftVar.zzd((zzftVar.zzd(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zza(zzfu zzfuVar) throws zzch {
        int i;
        int i2;
        int iZzd;
        boolean zZzo;
        zzeq.zzb(this.zze);
        while (zzfuVar.zzb() > 0) {
            int i3 = this.zzh;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iZzm = zzfuVar.zzm();
                    if ((iZzm & 224) == 224) {
                        this.zzk = iZzm;
                        this.zzh = 2;
                    } else if (iZzm != 86) {
                        this.zzh = 0;
                    }
                } else if (i3 != 2) {
                    int iMin = Math.min(zzfuVar.zzb(), this.zzj - this.zzi);
                    zzfuVar.zzG(this.zzd.zza, this.zzi, iMin);
                    int i4 = this.zzi + iMin;
                    this.zzi = i4;
                    if (i4 == this.zzj) {
                        this.zzd.zzk(0);
                        zzft zzftVar = this.zzd;
                        if (zzftVar.zzo()) {
                            if (this.zzm) {
                            }
                            this.zzh = 0;
                        } else {
                            this.zzm = true;
                            int iZzd2 = zzftVar.zzd(1);
                            if (iZzd2 == 1) {
                                iZzd = zzftVar.zzd(1);
                                i2 = 1;
                            } else {
                                i2 = iZzd2;
                                iZzd = 0;
                            }
                            this.zzn = iZzd;
                            if (iZzd != 0) {
                                throw zzch.zza(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzftVar);
                                i2 = 1;
                            }
                            if (!zzftVar.zzo()) {
                                throw zzch.zza(null, null);
                            }
                            this.zzo = zzftVar.zzd(6);
                            int iZzd3 = zzftVar.zzd(4);
                            int iZzd4 = zzftVar.zzd(3);
                            if (iZzd3 != 0 || iZzd4 != 0) {
                                throw zzch.zza(null, null);
                            }
                            if (i2 == 0) {
                                int iZzc = zzftVar.zzc();
                                int iZzf = zzf(zzftVar);
                                zzftVar.zzk(iZzc);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzftVar.zzg(bArr, 0, iZzf);
                                zzal zzalVar = new zzal();
                                zzalVar.zzK(this.zzf);
                                zzalVar.zzX("audio/mp4a-latm");
                                zzalVar.zzz(this.zzv);
                                zzalVar.zzy(this.zzu);
                                zzalVar.zzY(this.zzs);
                                zzalVar.zzL(Collections.singletonList(bArr));
                                zzalVar.zzO(this.zza);
                                zzalVar.zzV(this.zzb);
                                zzan zzanVarZzad = zzalVar.zzad();
                                if (!zzanVarZzad.equals(this.zzg)) {
                                    this.zzg = zzanVarZzad;
                                    this.zzt = 1024000000 / zzanVarZzad.zzB;
                                    this.zze.zzl(zzanVarZzad);
                                }
                            } else {
                                zzftVar.zzm(((int) zzg(zzftVar)) - zzf(zzftVar));
                            }
                            int iZzd5 = zzftVar.zzd(3);
                            this.zzp = iZzd5;
                            if (iZzd5 == 0) {
                                zzftVar.zzm(8);
                            } else if (iZzd5 == 1) {
                                zzftVar.zzm(9);
                            } else if (iZzd5 == 3 || iZzd5 == 4 || iZzd5 == 5) {
                                zzftVar.zzm(6);
                            } else {
                                if (iZzd5 != 6 && iZzd5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzftVar.zzm(1);
                            }
                            boolean zZzo2 = zzftVar.zzo();
                            this.zzq = zZzo2;
                            this.zzr = 0L;
                            if (zZzo2) {
                                if (i2 != 1) {
                                    do {
                                        zZzo = zzftVar.zzo();
                                        this.zzr = (this.zzr << 8) + zzftVar.zzd(8);
                                    } while (zZzo);
                                } else {
                                    this.zzr = zzg(zzftVar);
                                }
                            }
                            if (zzftVar.zzo()) {
                                zzftVar.zzm(8);
                            }
                        }
                        if (this.zzn != 0) {
                            throw zzch.zza(null, null);
                        }
                        if (this.zzo != 0) {
                            throw zzch.zza(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzch.zza(null, null);
                        }
                        int i5 = 0;
                        while (true) {
                            int iZzd6 = zzftVar.zzd(8);
                            i = i5 + iZzd6;
                            if (iZzd6 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iZzc2 = zzftVar.zzc();
                        if ((iZzc2 & 7) == 0) {
                            this.zzc.zzK(iZzc2 >> 3);
                        } else {
                            zzftVar.zzg(this.zzc.zzM(), 0, i * 8);
                            this.zzc.zzK(0);
                        }
                        this.zze.zzq(this.zzc, i);
                        zzeq.zzf(this.zzl != -9223372036854775807L);
                        this.zze.zzs(this.zzl, 1, i, 0, null);
                        this.zzl += this.zzt;
                        if (this.zzq) {
                            zzftVar.zzm((int) this.zzr);
                        }
                        this.zzh = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzm2 = ((this.zzk & (-225)) << 8) | zzfuVar.zzm();
                    this.zzj = iZzm2;
                    zzfu zzfuVar2 = this.zzc;
                    if (iZzm2 > zzfuVar2.zzM().length) {
                        zzfuVar2.zzH(iZzm2);
                        zzft zzftVar2 = this.zzd;
                        byte[] bArrZzM = this.zzc.zzM();
                        zzftVar2.zzj(bArrZzM, bArrZzM.length);
                    }
                    this.zzi = 0;
                    this.zzh = 3;
                }
            } else if (zzfuVar.zzm() == 86) {
                this.zzh = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zze = zzadxVar.zzw(zzapoVar.zza(), 1);
        this.zzf = zzapoVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzh = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = false;
    }
}
