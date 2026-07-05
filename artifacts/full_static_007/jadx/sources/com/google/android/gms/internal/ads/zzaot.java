package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaot implements zzapp {
    private final zzaoc zza;
    private final zzft zzb = new zzft(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzgb zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaot(zzaoc zzaocVar) {
        this.zza = zzaocVar;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzfu zzfuVar, byte[] bArr, int i) {
        int iMin = Math.min(zzfuVar.zzb(), i - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzfuVar.zzL(iMin);
        } else {
            zzfuVar.zzG(bArr, this.zzd, iMin);
        }
        int i2 = this.zzd + iMin;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zza(zzfu zzfuVar, int i) throws zzch {
        int i2;
        long jZzb;
        int i3;
        zzeq.zzb(this.zze);
        int i4 = -1;
        int i5 = 2;
        int i6 = 1;
        if ((i & 1) != 0) {
            int i7 = this.zzc;
            if (i7 != 0 && i7 != 1) {
                if (i7 != 2) {
                    int i8 = this.zzj;
                    if (i8 != -1) {
                        zzfk.zzf("PesReader", "Unexpected start indicator: expected " + i8 + " more bytes");
                    }
                    this.zza.zzc();
                } else {
                    zzfk.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i9 = i;
        while (zzfuVar.zzb() > 0) {
            int i10 = this.zzc;
            if (i10 != 0) {
                if (i10 != i6) {
                    if (i10 != i5) {
                        int iZzb = zzfuVar.zzb();
                        int i11 = this.zzj;
                        int i12 = i11 != i4 ? iZzb - i11 : 0;
                        if (i12 > 0) {
                            iZzb -= i12;
                            zzfuVar.zzJ(zzfuVar.zzd() + iZzb);
                        }
                        this.zza.zza(zzfuVar);
                        int i13 = this.zzj;
                        if (i13 != i4) {
                            int i14 = i13 - iZzb;
                            this.zzj = i14;
                            if (i14 == 0) {
                                this.zza.zzc();
                                zzd(i6);
                            }
                        }
                    } else {
                        if (zze(zzfuVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzfuVar, null, this.zzi)) {
                            this.zzb.zzk(0);
                            if (this.zzf) {
                                this.zzb.zzm(4);
                                long jZzd = this.zzb.zzd(3);
                                this.zzb.zzm(i6);
                                int iZzd = this.zzb.zzd(15) << 15;
                                this.zzb.zzm(i6);
                                long jZzd2 = this.zzb.zzd(15);
                                this.zzb.zzm(i6);
                                if (this.zzh || !this.zzg) {
                                    i3 = iZzd;
                                } else {
                                    this.zzb.zzm(4);
                                    this.zzb.zzm(i6);
                                    int iZzd2 = this.zzb.zzd(15) << 15;
                                    this.zzb.zzm(i6);
                                    long jZzd3 = this.zzb.zzd(15);
                                    this.zzb.zzm(i6);
                                    i3 = iZzd;
                                    this.zze.zzb((this.zzb.zzd(3) << 30) | iZzd2 | jZzd3);
                                    this.zzh = true;
                                }
                                jZzb = this.zze.zzb((jZzd << 30) | i3 | jZzd2);
                            } else {
                                jZzb = -9223372036854775807L;
                            }
                            i9 |= true != this.zzk ? 0 : 4;
                            this.zza.zzd(jZzb, i9);
                            zzd(3);
                            i4 = -1;
                            i5 = 2;
                            i6 = 1;
                        }
                    }
                    i2 = i5;
                } else if (zze(zzfuVar, this.zzb.zza, 9)) {
                    int i15 = 0;
                    this.zzb.zzk(0);
                    int iZzd3 = this.zzb.zzd(24);
                    i6 = 1;
                    if (iZzd3 != 1) {
                        zzfk.zzf("PesReader", "Unexpected start code prefix: " + iZzd3);
                        i4 = -1;
                        this.zzj = -1;
                        i2 = 2;
                    } else {
                        this.zzb.zzm(8);
                        zzft zzftVar = this.zzb;
                        int iZzd4 = zzftVar.zzd(16);
                        zzftVar.zzm(5);
                        this.zzk = this.zzb.zzo();
                        i2 = 2;
                        this.zzb.zzm(2);
                        this.zzf = this.zzb.zzo();
                        this.zzg = this.zzb.zzo();
                        this.zzb.zzm(6);
                        int iZzd5 = this.zzb.zzd(8);
                        this.zzi = iZzd5;
                        if (iZzd4 == 0) {
                            this.zzj = -1;
                            i4 = -1;
                        } else {
                            int i16 = (iZzd4 - 3) - iZzd5;
                            this.zzj = i16;
                            if (i16 < 0) {
                                zzfk.zzf("PesReader", "Found negative packet payload size: " + i16);
                                i4 = -1;
                                this.zzj = -1;
                            } else {
                                i4 = -1;
                            }
                        }
                        i15 = 2;
                    }
                    zzd(i15);
                } else {
                    i4 = -1;
                    i6 = 1;
                    i2 = 2;
                }
            } else {
                i2 = i5;
                zzfuVar.zzL(zzfuVar.zzb());
            }
            i5 = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzb(zzgb zzgbVar, zzadx zzadxVar, zzapo zzapoVar) {
        this.zze = zzgbVar;
        this.zza.zzb(zzadxVar, zzapoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
