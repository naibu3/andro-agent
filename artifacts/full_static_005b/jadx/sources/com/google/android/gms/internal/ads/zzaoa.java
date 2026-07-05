package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaoa implements zzaoc {
    private final zzfu zza;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzafa zzf;
    private int zzh;
    private int zzi;
    private long zzj;
    private zzan zzk;
    private int zzl;
    private int zzm;
    private int zzg = 0;
    private long zzp = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzn = -1;
    private int zzo = -1;

    public zzaoa(String str, int i, int i2) {
        this.zza = new zzfu(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    @RequiresNonNull({"output"})
    private final void zzf(zzadq zzadqVar) {
        int i;
        int i2 = zzadqVar.zzb;
        if (i2 == -2147483647 || (i = zzadqVar.zzc) == -1) {
            return;
        }
        zzan zzanVar = this.zzk;
        if (zzanVar != null && i == zzanVar.zzA && i2 == zzanVar.zzB && zzgd.zzG(zzadqVar.zza, zzanVar.zzn)) {
            return;
        }
        zzan zzanVar2 = this.zzk;
        zzal zzalVar = zzanVar2 == null ? new zzal() : zzanVar2.zzb();
        zzalVar.zzK(this.zze);
        zzalVar.zzX(zzadqVar.zza);
        zzalVar.zzy(zzadqVar.zzc);
        zzalVar.zzY(zzadqVar.zzb);
        zzalVar.zzO(this.zzc);
        zzalVar.zzV(this.zzd);
        zzan zzanVarZzad = zzalVar.zzad();
        this.zzk = zzanVarZzad;
        this.zzf.zzl(zzanVarZzad);
    }

    private final boolean zzg(zzfu zzfuVar, byte[] bArr, int i) {
        int iMin = Math.min(zzfuVar.zzb(), i - this.zzh);
        zzfuVar.zzG(bArr, this.zzh, iMin);
        int i2 = this.zzh + iMin;
        this.zzh = i2;
        return i2 == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    @Override // com.google.android.gms.internal.ads.zzaoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfu zzfuVar) throws zzch {
        int i;
        int i2;
        byte b;
        boolean z;
        int i3;
        int i4;
        byte b2;
        int i5;
        byte b3;
        int i6;
        zzeq.zzb(this.zzf);
        while (zzfuVar.zzb() > 0) {
            int i7 = this.zzg;
            if (i7 == 0) {
                while (true) {
                    if (zzfuVar.zzb() > 0) {
                        int i8 = this.zzi << 8;
                        this.zzi = i8;
                        int iZzm = i8 | zzfuVar.zzm();
                        this.zzi = iZzm;
                        int i9 = zzadr.zza;
                        int i10 = (iZzm == 2147385345 || iZzm == -25230976 || iZzm == 536864768 || iZzm == -14745368) ? 1 : (iZzm == 1683496997 || iZzm == 622876772) ? 2 : (iZzm == 1078008818 || iZzm == -233094848) ? 3 : (iZzm == 1908687592 || iZzm == -398277519) ? 4 : 0;
                        this.zzm = i10;
                        if (i10 != 0) {
                            byte[] bArrZzM = this.zza.zzM();
                            int i11 = this.zzi;
                            bArrZzM[0] = (byte) ((i11 >> 24) & 255);
                            bArrZzM[1] = (byte) ((i11 >> 16) & 255);
                            bArrZzM[2] = (byte) ((i11 >> 8) & 255);
                            bArrZzM[3] = (byte) (i11 & 255);
                            this.zzh = 4;
                            this.zzi = 0;
                            if (i10 == 3 || i10 == 4) {
                                this.zzg = 4;
                            } else if (i10 == 1) {
                                this.zzg = 1;
                            } else {
                                this.zzg = 2;
                            }
                        }
                    }
                }
            } else if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                int iMin = Math.min(zzfuVar.zzb(), this.zzl - this.zzh);
                                this.zzf.zzq(zzfuVar, iMin);
                                int i12 = this.zzh + iMin;
                                this.zzh = i12;
                                if (i12 == this.zzl) {
                                    zzeq.zzf(this.zzp != -9223372036854775807L);
                                    this.zzf.zzs(this.zzp, this.zzm == 4 ? 0 : 1, this.zzl, 0, null);
                                    this.zzp += this.zzj;
                                    this.zzg = 0;
                                }
                            } else if (zzg(zzfuVar, this.zza.zzM(), this.zzo)) {
                                zzadq zzadqVarZze = zzadr.zze(this.zza.zzM(), this.zzb);
                                if (this.zzm == 3) {
                                    zzf(zzadqVarZze);
                                }
                                this.zzl = zzadqVarZze.zzd;
                                long j = zzadqVarZze.zze;
                                this.zzj = j != -9223372036854775807L ? j : 0L;
                                this.zza.zzK(0);
                                this.zzf.zzq(this.zza, this.zzo);
                                this.zzg = 6;
                            }
                        } else if (zzg(zzfuVar, this.zza.zzM(), 6)) {
                            int iZzb = zzadr.zzb(this.zza.zzM());
                            this.zzo = iZzb;
                            int i13 = this.zzh;
                            if (i13 > iZzb) {
                                int i14 = i13 - iZzb;
                                this.zzh = i13 - i14;
                                zzfuVar.zzK(zzfuVar.zzd() - i14);
                            }
                            this.zzg = 5;
                        }
                    } else if (zzg(zzfuVar, this.zza.zzM(), this.zzn)) {
                        zzadq zzadqVarZzd = zzadr.zzd(this.zza.zzM());
                        zzf(zzadqVarZzd);
                        this.zzl = zzadqVarZzd.zzd;
                        long j2 = zzadqVarZzd.zze;
                        this.zzj = j2 != -9223372036854775807L ? j2 : 0L;
                        this.zza.zzK(0);
                        this.zzf.zzq(this.zza, this.zzn);
                        this.zzg = 6;
                    }
                } else if (zzg(zzfuVar, this.zza.zzM(), 7)) {
                    this.zzn = zzadr.zza(this.zza.zzM());
                    this.zzg = 3;
                }
            } else if (zzg(zzfuVar, this.zza.zzM(), 18)) {
                byte[] bArrZzM2 = this.zza.zzM();
                if (this.zzk == null) {
                    zzan zzanVarZzc = zzadr.zzc(bArrZzM2, this.zze, this.zzc, this.zzd, null);
                    this.zzk = zzanVarZzc;
                    this.zzf.zzl(zzanVarZzc);
                }
                int i15 = zzadr.zza;
                byte b4 = bArrZzM2[0];
                if (b4 != -2) {
                    if (b4 == -1) {
                        i6 = ((bArrZzM2[7] & 3) << 12) | ((bArrZzM2[6] & 255) << 4) | ((bArrZzM2[9] & 60) >> 2);
                    } else if (b4 != 31) {
                        i = (bArrZzM2[5] & 3) << 12;
                        i2 = (bArrZzM2[6] & 255) << 4;
                        b = bArrZzM2[7];
                    } else {
                        i6 = ((bArrZzM2[8] & 60) >> 2) | ((3 & bArrZzM2[6]) << 12) | ((bArrZzM2[7] & 255) << 4);
                    }
                    i3 = i6 + 1;
                    z = true;
                    if (z) {
                        i3 = (i3 * 16) / 14;
                    }
                    this.zzl = i3;
                    if (b4 == -2) {
                        if (b4 == -1) {
                            i4 = (bArrZzM2[4] & 7) << 4;
                            b3 = bArrZzM2[7];
                        } else if (b4 != 31) {
                            i4 = (bArrZzM2[4] & 1) << 6;
                            b2 = bArrZzM2[5];
                        } else {
                            i4 = (bArrZzM2[5] & 7) << 4;
                            b3 = bArrZzM2[6];
                        }
                        i5 = b3 & 60;
                        this.zzj = zzgea.zzb(zzgd.zzs((((i5 >> 2) | i4) + 1) * 32, this.zzk.zzB));
                        this.zza.zzK(0);
                        this.zzf.zzq(this.zza, 18);
                        this.zzg = 6;
                    } else {
                        i4 = (bArrZzM2[5] & 1) << 6;
                        b2 = bArrZzM2[4];
                    }
                    i5 = b2 & 252;
                    this.zzj = zzgea.zzb(zzgd.zzs((((i5 >> 2) | i4) + 1) * 32, this.zzk.zzB));
                    this.zza.zzK(0);
                    this.zzf.zzq(this.zza, 18);
                    this.zzg = 6;
                } else {
                    i = (bArrZzM2[4] & 3) << 12;
                    i2 = (bArrZzM2[7] & 255) << 4;
                    b = bArrZzM2[6];
                }
                i3 = (i | i2 | ((b & 240) >> 4)) + 1;
                z = false;
                if (z) {
                }
                this.zzl = i3;
                if (b4 == -2) {
                }
                i5 = b2 & 252;
                this.zzj = zzgea.zzb(zzgd.zzs((((i5 >> 2) | i4) + 1) * 32, this.zzk.zzB));
                this.zza.zzK(0);
                this.zzf.zzq(this.zza, 18);
                this.zzg = 6;
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
        this.zzp = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzp = -9223372036854775807L;
        this.zzb.set(0);
    }
}
