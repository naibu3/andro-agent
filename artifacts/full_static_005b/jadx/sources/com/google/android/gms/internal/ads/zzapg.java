package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzapg {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzgb zza = new zzgb(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfu zzb = new zzfu();

    zzapg(int i) {
    }

    private final int zze(zzadv zzadvVar) {
        byte[] bArr = zzgd.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzadvVar.zzj();
        return 0;
    }

    public final int zza(zzadv zzadvVar, zzaeq zzaeqVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzadvVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzd = zzadvVar.zzd();
            int iMin = (int) Math.min(112800L, jZzd);
            long j2 = jZzd - iMin;
            if (zzadvVar.zzf() == j2) {
                this.zzb.zzH(iMin);
                zzadvVar.zzj();
                ((zzadi) zzadvVar).zzm(this.zzb.zzM(), 0, iMin, false);
                zzfu zzfuVar = this.zzb;
                int iZzd = zzfuVar.zzd();
                int iZze = zzfuVar.zze();
                int i2 = iZze - 188;
                while (true) {
                    if (i2 < iZzd) {
                        break;
                    }
                    byte[] bArrZzM = zzfuVar.zzM();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * 188) + i2;
                        if (i5 < iZzd || i5 >= iZze || bArrZzM[i5] != 71) {
                            i4 = 0;
                        } else {
                            i4++;
                            if (i4 == 5) {
                                long jZzb = zzapq.zzb(zzfuVar, i2, i);
                                if (jZzb != -9223372036854775807L) {
                                    j = jZzb;
                                    break;
                                }
                            }
                        }
                        i3++;
                    }
                    i2--;
                }
                this.zzg = j;
                this.zze = true;
                return 0;
            }
            zzaeqVar.zza = j2;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzadvVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zze(zzadvVar);
                    return 0;
                }
                zzgb zzgbVar = this.zza;
                this.zzh = zzgbVar.zzc(this.zzg) - zzgbVar.zzb(j3);
                zze(zzadvVar);
                return 0;
            }
            int iMin2 = (int) Math.min(112800L, zzadvVar.zzd());
            if (zzadvVar.zzf() == 0) {
                this.zzb.zzH(iMin2);
                zzadvVar.zzj();
                ((zzadi) zzadvVar).zzm(this.zzb.zzM(), 0, iMin2, false);
                zzfu zzfuVar2 = this.zzb;
                int iZzd2 = zzfuVar2.zzd();
                int iZze2 = zzfuVar2.zze();
                while (true) {
                    if (iZzd2 >= iZze2) {
                        break;
                    }
                    if (zzfuVar2.zzM()[iZzd2] == 71) {
                        long jZzb2 = zzapq.zzb(zzfuVar2, iZzd2, i);
                        if (jZzb2 != -9223372036854775807L) {
                            j = jZzb2;
                            break;
                        }
                    }
                    iZzd2++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
            zzaeqVar.zza = 0L;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzgb zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
