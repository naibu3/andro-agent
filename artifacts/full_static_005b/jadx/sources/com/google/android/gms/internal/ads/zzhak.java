package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhak extends zzham {
    private final ByteBuffer zze;
    private final long zzf;
    private long zzg;
    private long zzh;
    private final long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzhak(ByteBuffer byteBuffer, boolean z, zzhaj zzhajVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zze = byteBuffer;
        long jZze = zzhfa.zze(byteBuffer);
        this.zzf = jZze;
        this.zzg = byteBuffer.limit() + jZze;
        long jPosition = jZze + byteBuffer.position();
        this.zzh = jPosition;
        this.zzi = jPosition;
    }

    private final int zzK() {
        return (int) (this.zzg - this.zzh);
    }

    private final void zzL() {
        long j = this.zzg + this.zzj;
        this.zzg = j;
        int i = (int) (j - this.zzi);
        int i2 = this.zzl;
        if (i <= i2) {
            this.zzj = 0;
            return;
        }
        int i3 = i - i2;
        this.zzj = i3;
        this.zzg = j - i3;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final void zzA(int i) {
        this.zzl = i;
        zzL();
    }

    public final void zzB(int i) throws IOException {
        if (i >= 0 && i <= zzK()) {
            this.zzh += i;
        } else {
            if (i >= 0) {
                throw zzhcd.zzj();
            }
            throw zzhcd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    public final byte zza() throws IOException {
        long j = this.zzh;
        if (j == this.zzg) {
            throw zzhcd.zzj();
        }
        this.zzh = 1 + j;
        return zzhfa.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzd() {
        return (int) (this.zzh - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zze(int i) throws zzhcd {
        if (i < 0) {
            throw zzhcd.zzf();
        }
        int iZzd = i + zzd();
        int i2 = this.zzl;
        if (iZzd > i2) {
            throw zzhcd.zzj();
        }
        this.zzl = iZzd;
        zzL();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        long j = this.zzh;
        if (this.zzg - j < 4) {
            throw zzhcd.zzj();
        }
        this.zzh = 4 + j;
        int iZza = zzhfa.zza(j) & 255;
        int iZza2 = zzhfa.zza(1 + j) & 255;
        int iZza3 = zzhfa.zza(2 + j) & 255;
        return ((zzhfa.zza(j + 3) & 255) << 24) | (iZza2 << 8) | iZza | (iZza3 << 16);
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzl() throws IOException {
        return zzF(zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzk = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzk = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw zzhcd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        long j = this.zzh;
        if (this.zzg - j < 8) {
            throw zzhcd.zzj();
        }
        this.zzh = 8 + j;
        long jZza = zzhfa.zza(j);
        long jZza2 = zzhfa.zza(1 + j);
        long jZza3 = zzhfa.zza(2 + j);
        long jZza4 = zzhfa.zza(3 + j);
        long jZza5 = zzhfa.zza(4 + j);
        return ((zzhfa.zza(j + 7) & 255) << 56) | (jZza & 255) | ((jZza2 & 255) << 8) | ((jZza3 & 255) << 16) | ((jZza4 & 255) << 24) | ((jZza5 & 255) << 32) | ((zzhfa.zza(5 + j) & 255) << 40) | ((zzhfa.zza(6 + j) & 255) << 48);
    }

    final long zzs() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((zza() & 128) == 0) {
                return j;
            }
        }
        throw zzhcd.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final long zzu() throws IOException {
        return zzH(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final zzhac zzw() throws IOException {
        int iZzj = zzj();
        if (iZzj <= 0 || iZzj > zzK()) {
            if (iZzj == 0) {
                return zzhac.zzb;
            }
            if (iZzj < 0) {
                throw zzhcd.zzf();
            }
            throw zzhcd.zzj();
        }
        byte[] bArr = new byte[iZzj];
        long j = iZzj;
        zzhfa.zzo(this.zzh, bArr, 0L, j);
        this.zzh += j;
        return new zzgzy(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj <= 0 || iZzj > zzK()) {
            if (iZzj == 0) {
                return "";
            }
            if (iZzj < 0) {
                throw zzhcd.zzf();
            }
            throw zzhcd.zzj();
        }
        byte[] bArr = new byte[iZzj];
        long j = iZzj;
        zzhfa.zzo(this.zzh, bArr, 0L, j);
        String str = new String(bArr, zzhcb.zzb);
        this.zzh += j;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0 && iZzj <= zzK()) {
            String strZzg = zzhff.zzg(this.zze, (int) (this.zzh - this.zzf), iZzj);
            this.zzh += iZzj;
            return strZzg;
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final void zzz(int i) throws zzhcd {
        if (this.zzk != i) {
            throw zzhcd.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final boolean zzE(int i) throws IOException {
        int iZzm;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (zzK() < 10) {
                while (i3 < 10) {
                    if (zza() < 0) {
                        i3++;
                    }
                }
                throw zzhcd.zze();
            }
            while (i3 < 10) {
                long j = this.zzh;
                this.zzh = 1 + j;
                if (zzhfa.zza(j) < 0) {
                    i3++;
                }
            }
            throw zzhcd.zze();
            return true;
        }
        if (i2 == 1) {
            zzB(8);
            return true;
        }
        if (i2 == 2) {
            zzB(zzj());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhcd.zza();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i >>> 3) << 3) | 4);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (com.google.android.gms.internal.ads.zzhfa.zza(r3) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzj() throws IOException {
        int i;
        long j = this.zzh;
        if (this.zzg != j) {
            long j2 = 1 + j;
            byte bZza = zzhfa.zza(j);
            if (bZza >= 0) {
                this.zzh = j2;
                return bZza;
            }
            if (this.zzg - j2 >= 9) {
                long j3 = 2 + j;
                int iZza = (zzhfa.zza(j2) << 7) ^ bZza;
                if (iZza < 0) {
                    i = iZza ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iZza2 = iZza ^ (zzhfa.zza(j3) << Ascii.SO);
                    if (iZza2 >= 0) {
                        i = iZza2 ^ 16256;
                    } else {
                        j3 = 4 + j;
                        int iZza3 = iZza2 ^ (zzhfa.zza(j4) << Ascii.NAK);
                        if (iZza3 < 0) {
                            i = (-2080896) ^ iZza3;
                        } else {
                            j4 = 5 + j;
                            byte bZza2 = zzhfa.zza(j3);
                            int i2 = (iZza3 ^ (bZza2 << Ascii.FS)) ^ 266354560;
                            if (bZza2 < 0) {
                                j3 = 6 + j;
                                if (zzhfa.zza(j4) < 0) {
                                    j4 = 7 + j;
                                    if (zzhfa.zza(j3) < 0) {
                                        j3 = 8 + j;
                                        if (zzhfa.zza(j4) < 0) {
                                            j4 = j + 9;
                                            if (zzhfa.zza(j3) < 0) {
                                                j3 = 10 + j;
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                    }
                    j3 = j4;
                }
                this.zzh = j3;
                return i;
            }
        }
        return (int) zzs();
    }

    public final long zzr() throws IOException {
        long j;
        long j2;
        int i;
        long j3 = this.zzh;
        if (this.zzg != j3) {
            long j4 = 1 + j3;
            byte bZza = zzhfa.zza(j3);
            if (bZza >= 0) {
                this.zzh = j4;
                return bZza;
            }
            if (this.zzg - j4 >= 9) {
                long j5 = 2 + j3;
                int iZza = (zzhfa.zza(j4) << 7) ^ bZza;
                if (iZza >= 0) {
                    long j6 = 3 + j3;
                    int iZza2 = iZza ^ (zzhfa.zza(j5) << Ascii.SO);
                    if (iZza2 >= 0) {
                        j = iZza2 ^ 16256;
                    } else {
                        j5 = 4 + j3;
                        int iZza3 = iZza2 ^ (zzhfa.zza(j6) << Ascii.NAK);
                        if (iZza3 < 0) {
                            i = (-2080896) ^ iZza3;
                        } else {
                            j6 = 5 + j3;
                            long jZza = (zzhfa.zza(j5) << 28) ^ iZza3;
                            if (jZza < 0) {
                                long j7 = 6 + j3;
                                long jZza2 = (zzhfa.zza(j6) << 35) ^ jZza;
                                if (jZza2 >= 0) {
                                    j5 = j3 + 7;
                                    long jZza3 = jZza2 ^ (zzhfa.zza(j7) << 42);
                                    if (jZza3 >= 0) {
                                        j = 4363953127296L ^ jZza3;
                                    } else {
                                        j7 = 8 + j3;
                                        jZza2 = jZza3 ^ (zzhfa.zza(j5) << 49);
                                        if (jZza2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j5 = j3 + 9;
                                            long jZza4 = (jZza2 ^ (zzhfa.zza(j7) << 56)) ^ 71499008037633920L;
                                            if (jZza4 < 0) {
                                                long j8 = j3 + 10;
                                                if (zzhfa.zza(j5) >= 0) {
                                                    j5 = j8;
                                                }
                                            }
                                            j = jZza4;
                                        }
                                    }
                                    this.zzh = j5;
                                    return j;
                                }
                                j2 = -34093383808L;
                                j = j2 ^ jZza2;
                                j5 = j7;
                                this.zzh = j5;
                                return j;
                            }
                            j = 266354560 ^ jZza;
                        }
                    }
                    j5 = j6;
                    this.zzh = j5;
                    return j;
                }
                i = iZza ^ (-128);
                j = i;
                this.zzh = j5;
                return j;
            }
        }
        return zzs();
    }
}
