package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhag extends zzham {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* synthetic */ zzhag(Iterable iterable, int i, boolean z, zzhaf zzhafVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = i;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i != 0) {
            zzO();
            return;
        }
        this.zzg = zzhcb.zze;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final int zzK() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzL() throws zzhcd {
        if (!this.zzf.hasNext()) {
            throw zzhcd.zzj();
        }
        zzO();
    }

    private final void zzM(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > zzK()) {
            if (i2 > 0) {
                throw zzhcd.zzj();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzL();
            }
            int iMin = Math.min(i3, (int) (this.zzo - this.zzm));
            long j = iMin;
            zzhfa.zzo(this.zzm, bArr, i2 - i3, j);
            i3 -= iMin;
            this.zzm += j;
        }
    }

    private final void zzN() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzj;
        if (i <= i2) {
            this.zzi = 0;
            return;
        }
        int i3 = i - i2;
        this.zzi = i3;
        this.zzh = i - i3;
    }

    private final void zzO() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long jPosition = byteBuffer.position();
        this.zzm = jPosition;
        this.zzn = jPosition;
        this.zzo = this.zzg.limit();
        long jZze = zzhfa.zze(this.zzg);
        this.zzm += jZze;
        this.zzn += jZze;
        this.zzo += jZze;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final void zzA(int i) {
        this.zzj = i;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final boolean zzC() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    public final byte zza() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzL();
        }
        long j = this.zzm;
        this.zzm = 1 + j;
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
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zze(int i) throws zzhcd {
        if (i < 0) {
            throw zzhcd.zzf();
        }
        int iZzd = i + zzd();
        int i2 = this.zzj;
        if (iZzd > i2) {
            throw zzhcd.zzj();
        }
        this.zzj = iZzd;
        zzN();
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
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 4) {
            int iZza = zza() & 255;
            int iZza2 = (zza() & 255) << 8;
            return iZza | iZza2 | ((zza() & 255) << 16) | ((zza() & 255) << 24);
        }
        this.zzm = 4 + j2;
        int iZza3 = zzhfa.zza(j2) & 255;
        int iZza4 = (zzhfa.zza(1 + j2) & 255) << 8;
        return iZza3 | iZza4 | ((zzhfa.zza(2 + j2) & 255) << 16) | ((zzhfa.zza(j2 + 3) & 255) << 24);
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
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 8) {
            return (zza() & 255) | ((zza() & 255) << 8) | ((zza() & 255) << 16) | ((zza() & 255) << 24) | ((zza() & 255) << 32) | ((zza() & 255) << 40) | ((zza() & 255) << 48) | ((zza() & 255) << 56);
        }
        this.zzm = 8 + j2;
        long jZza = zzhfa.zza(j2) & 255;
        long jZza2 = (zzhfa.zza(1 + j2) & 255) << 8;
        long jZza3 = (zzhfa.zza(j2 + 2) & 255) << 16;
        long jZza4 = (zzhfa.zza(3 + j2) & 255) << 24;
        long jZza5 = (zzhfa.zza(j2 + 4) & 255) << 32;
        return jZza5 | jZza | jZza2 | jZza3 | jZza4 | ((zzhfa.zza(j2 + 5) & 255) << 40) | ((zzhfa.zza(j2 + 6) & 255) << 48) | ((zzhfa.zza(j2 + 7) & 255) << 56);
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
        if (iZzj > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = iZzj;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iZzj];
                zzhfa.zzo(j2, bArr, 0L, j3);
                this.zzm += j3;
                return new zzgzy(bArr);
            }
        }
        if (iZzj > 0 && iZzj <= zzK()) {
            byte[] bArr2 = new byte[iZzj];
            zzM(bArr2, 0, iZzj);
            return new zzgzy(bArr2);
        }
        if (iZzj == 0) {
            return zzhac.zzb;
        }
        if (iZzj < 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = iZzj;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iZzj];
                zzhfa.zzo(j2, bArr, 0L, j3);
                String str = new String(bArr, zzhcb.zzb);
                this.zzm += j3;
                return str;
            }
        }
        if (iZzj > 0 && iZzj <= zzK()) {
            byte[] bArr2 = new byte[iZzj];
            zzM(bArr2, 0, iZzj);
            return new String(bArr2, zzhcb.zzb);
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = iZzj;
            if (j3 <= j - j2) {
                String strZzg = zzhff.zzg(this.zzg, (int) (j2 - this.zzn), iZzj);
                this.zzm += j3;
                return strZzg;
            }
        }
        if (iZzj >= 0 && iZzj <= zzK()) {
            byte[] bArr = new byte[iZzj];
            zzM(bArr, 0, iZzj);
            return zzhff.zzh(bArr, 0, iZzj);
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

    public final void zzB(int i) throws IOException {
        if (i >= 0) {
            if (i <= ((this.zzh - this.zzl) - this.zzm) + this.zzn) {
                while (i > 0) {
                    if (this.zzo - this.zzm == 0) {
                        zzL();
                    }
                    int iMin = Math.min(i, (int) (this.zzo - this.zzm));
                    i -= iMin;
                    this.zzm += iMin;
                }
                return;
            }
        }
        if (i >= 0) {
            throw zzhcd.zzj();
        }
        throw zzhcd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final boolean zzE(int i) throws IOException {
        int iZzm;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (zza() >= 0) {
                    return true;
                }
            }
            throw zzhcd.zze();
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

    public final int zzj() throws IOException {
        int i;
        long j = this.zzm;
        if (this.zzo != j) {
            long j2 = j + 1;
            byte bZza = zzhfa.zza(j);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j3 = 2 + j;
                int iZza = (zzhfa.zza(j2) << 7) ^ bZza;
                if (iZza < 0) {
                    i = iZza ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iZza2 = (zzhfa.zza(j3) << Ascii.SO) ^ iZza;
                    if (iZza2 >= 0) {
                        i = iZza2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iZza3 = iZza2 ^ (zzhfa.zza(j4) << Ascii.NAK);
                        if (iZza3 < 0) {
                            i = (-2080896) ^ iZza3;
                        } else {
                            j4 = 5 + j;
                            byte bZza2 = zzhfa.zza(j5);
                            int i2 = (iZza3 ^ (bZza2 << Ascii.FS)) ^ 266354560;
                            if (bZza2 < 0) {
                                j5 = 6 + j;
                                if (zzhfa.zza(j4) < 0) {
                                    j4 = 7 + j;
                                    if (zzhfa.zza(j5) < 0) {
                                        j5 = 8 + j;
                                        if (zzhfa.zza(j4) < 0) {
                                            j4 = 9 + j;
                                            if (zzhfa.zza(j5) < 0) {
                                                long j6 = j + 10;
                                                if (zzhfa.zza(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.zzm = j3;
                return i;
            }
        }
        return (int) zzs();
    }

    public final long zzr() throws IOException {
        long j;
        long j2;
        long j3 = this.zzm;
        if (this.zzo != j3) {
            long j4 = j3 + 1;
            byte bZza = zzhfa.zza(j3);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j5 = 2 + j3;
                int iZza = (zzhfa.zza(j4) << 7) ^ bZza;
                if (iZza < 0) {
                    j = iZza ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int iZza2 = (zzhfa.zza(j5) << Ascii.SO) ^ iZza;
                    if (iZza2 >= 0) {
                        j = iZza2 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int iZza3 = iZza2 ^ (zzhfa.zza(j6) << Ascii.NAK);
                        if (iZza3 < 0) {
                            j = (-2080896) ^ iZza3;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long jZza = (zzhfa.zza(j7) << 28) ^ iZza3;
                            if (jZza >= 0) {
                                j = 266354560 ^ jZza;
                            } else {
                                long j8 = 6 + j3;
                                long jZza2 = jZza ^ (zzhfa.zza(j6) << 35);
                                if (jZza2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long jZza3 = jZza2 ^ (zzhfa.zza(j8) << 42);
                                    if (jZza3 >= 0) {
                                        j = 4363953127296L ^ jZza3;
                                    } else {
                                        j8 = 8 + j3;
                                        jZza2 = jZza3 ^ (zzhfa.zza(j9) << 49);
                                        if (jZza2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long jZza4 = (jZza2 ^ (zzhfa.zza(j8) << 56)) ^ 71499008037633920L;
                                            if (jZza4 < 0) {
                                                long j10 = j3 + 10;
                                                if (zzhfa.zza(j9) >= 0) {
                                                    j = jZza4;
                                                    j5 = j10;
                                                }
                                            } else {
                                                j = jZza4;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ jZza2;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.zzm = j5;
                return j;
            }
        }
        return zzs();
    }
}
