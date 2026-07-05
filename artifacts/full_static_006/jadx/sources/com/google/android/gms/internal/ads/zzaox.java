package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaox {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzgb zza = new zzgb(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfu zzb = new zzfu();

    zzaox() {
    }

    public static long zzc(zzfu zzfuVar) {
        int iZzd = zzfuVar.zzd();
        if (zzfuVar.zzb() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzfuVar.zzG(bArr, 0, 9);
        zzfuVar.zzK(iZzd);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    private final int zzf(zzadv zzadvVar) {
        byte[] bArr = zzgd.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzadvVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzd = zzadvVar.zzd();
            int iMin = (int) Math.min(20000L, jZzd);
            long j2 = jZzd - iMin;
            if (zzadvVar.zzf() != j2) {
                zzaeqVar.zza = j2;
                return 1;
            }
            this.zzb.zzH(iMin);
            zzadvVar.zzj();
            ((zzadi) zzadvVar).zzm(this.zzb.zzM(), 0, iMin, false);
            zzfu zzfuVar = this.zzb;
            int iZzd = zzfuVar.zzd();
            int iZze = zzfuVar.zze() - 4;
            while (true) {
                if (iZze < iZzd) {
                    break;
                }
                if (zzg(zzfuVar.zzM(), iZze) == 442) {
                    zzfuVar.zzK(iZze + 4);
                    long jZzc = zzc(zzfuVar);
                    if (jZzc != -9223372036854775807L) {
                        j = jZzc;
                        break;
                    }
                }
                iZze--;
            }
            this.zzg = j;
            this.zze = true;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zzf(zzadvVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zzf(zzadvVar);
                    return 0;
                }
                zzgb zzgbVar = this.zza;
                this.zzh = zzgbVar.zzc(this.zzg) - zzgbVar.zzb(j3);
                zzf(zzadvVar);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, zzadvVar.zzd());
            if (zzadvVar.zzf() != 0) {
                zzaeqVar.zza = 0L;
                return 1;
            }
            this.zzb.zzH(iMin2);
            zzadvVar.zzj();
            ((zzadi) zzadvVar).zzm(this.zzb.zzM(), 0, iMin2, false);
            zzfu zzfuVar2 = this.zzb;
            int iZzd2 = zzfuVar2.zzd();
            int iZze2 = zzfuVar2.zze();
            while (true) {
                if (iZzd2 >= iZze2 - 3) {
                    break;
                }
                if (zzg(zzfuVar2.zzM(), iZzd2) == 442) {
                    zzfuVar2.zzK(iZzd2 + 4);
                    long jZzc2 = zzc(zzfuVar2);
                    if (jZzc2 != -9223372036854775807L) {
                        j = jZzc2;
                        break;
                    }
                }
                iZzd2++;
            }
            this.zzf = j;
            this.zzd = true;
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzgb zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
