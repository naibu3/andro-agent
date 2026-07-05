package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzany implements zzaoc {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzft zzc = new zzft(new byte[7], 7);
    private final zzfu zzd = new zzfu(Arrays.copyOf(zza, 10));
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzafa zzh;
    private zzafa zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private zzafa zzv;
    private long zzw;

    public zzany(boolean z, String str, int i) {
        zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzn = false;
        zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 256;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzafa zzafaVar, long j, int i, int i2) {
        this.zzj = 4;
        this.zzk = i;
        this.zzv = zzafaVar;
        this.zzw = j;
        this.zzt = i2;
    }

    private final boolean zzk(zzfu zzfuVar, byte[] bArr, int i) {
        int iMin = Math.min(zzfuVar.zzb(), i - this.zzk);
        zzfuVar.zzG(bArr, this.zzk, iMin);
        int i2 = this.zzk + iMin;
        this.zzk = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzfu zzfuVar, byte[] bArr, int i) {
        if (zzfuVar.zzb() < i) {
            return false;
        }
        zzfuVar.zzG(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x026e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x026f, code lost:
    
        r17.zzm = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0273, code lost:
    
        if (r17.zzn != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0275, code lost:
    
        r17.zzj = 1;
        r17.zzk = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x027b, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x027e, code lost:
    
        r18.zzK(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0261, code lost:
    
        r17.zzq = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026a, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x026c, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0261 A[EDGE_INSN: B:146:0x0261->B:97:0x0261 BREAK  A[LOOP:1: B:49:0x01ab->B:172:0x01ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0217  */
    @Override // com.google.android.gms.internal.ads.zzaoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfu zzfuVar) throws zzch {
        char c;
        int i;
        int i2;
        char c2;
        boolean z;
        int i3;
        int i4;
        int i5;
        this.zzh.getClass();
        int i6 = zzgd.zza;
        while (zzfuVar.zzb() > 0) {
            int i7 = this.zzj;
            int i8 = 13;
            char c3 = 7;
            int i9 = 2;
            if (i7 == 0) {
                byte[] bArrZzM = zzfuVar.zzM();
                int iZzd = zzfuVar.zzd();
                int iZze = zzfuVar.zze();
                while (true) {
                    if (iZzd >= iZze) {
                        zzfuVar.zzK(iZzd);
                        break;
                    }
                    int i10 = iZzd + 1;
                    byte b = bArrZzM[iZzd];
                    int i11 = b & 255;
                    if (this.zzl != 512 || !zzl((byte) -1, (byte) i11)) {
                        c = c3;
                        int i12 = this.zzl;
                        i = i12 | i11;
                        if (i != 329) {
                            i2 = 2;
                            c2 = 3;
                            z = false;
                            i3 = 768;
                        } else if (i == 511) {
                            i2 = 2;
                            c2 = 3;
                            z = false;
                            i3 = 512;
                        } else if (i == 836) {
                            i2 = 2;
                            c2 = 3;
                            z = false;
                            i3 = 1024;
                        } else {
                            if (i == 1075) {
                                this.zzj = 2;
                                this.zzk = 3;
                                this.zzt = 0;
                                this.zzd.zzK(0);
                                zzfuVar.zzK(i10);
                                break;
                            }
                            if (i12 != 256) {
                                this.zzl = 256;
                                c3 = c;
                                i8 = 13;
                                i9 = 2;
                            } else {
                                i2 = 2;
                                c2 = 3;
                                z = false;
                                iZzd = i10;
                                c3 = c;
                                i9 = i2;
                                i8 = 13;
                            }
                        }
                        this.zzl = i3;
                        iZzd = i10;
                        c3 = c;
                        i9 = i2;
                        i8 = 13;
                    } else {
                        if (this.zzn) {
                            break;
                        }
                        int i13 = iZzd - 1;
                        zzfuVar.zzK(iZzd);
                        if (zzm(zzfuVar, this.zzc.zza, 1)) {
                            this.zzc.zzk(4);
                            int iZzd2 = this.zzc.zzd(1);
                            int i14 = this.zzo;
                            if (i14 != -1 && iZzd2 != i14) {
                                c = 7;
                            } else if (this.zzp == -1) {
                                if (!zzm(zzfuVar, this.zzc.zza, 4)) {
                                    this.zzc.zzk(14);
                                    int iZzd3 = this.zzc.zzd(i8);
                                    c = 7;
                                    if (iZzd3 >= 7) {
                                        byte[] bArrZzM2 = zzfuVar.zzM();
                                        int iZze2 = zzfuVar.zze();
                                        int i15 = i13 + iZzd3;
                                        if (i15 < iZze2) {
                                            byte b2 = bArrZzM2[i15];
                                            if (b2 != -1) {
                                                if (b2 == 73 && ((i4 = i15 + 1) == iZze2 || (bArrZzM2[i4] == 68 && ((i5 = i15 + 2) == iZze2 || bArrZzM2[i5] == 51)))) {
                                                    break;
                                                }
                                            } else {
                                                int i16 = i15 + 1;
                                                if (i16 == iZze2) {
                                                    break;
                                                }
                                                byte b3 = bArrZzM2[i16];
                                                if (zzl((byte) -1, b3) && ((b3 & 8) >> 3) == iZzd2) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                if (!zzm(zzfuVar, this.zzc.zza, 1)) {
                                    break;
                                }
                                this.zzc.zzk(i9);
                                if (this.zzc.zzd(4) == this.zzp) {
                                    zzfuVar.zzK(iZzd + 1);
                                    if (!zzm(zzfuVar, this.zzc.zza, 4)) {
                                    }
                                }
                                c = 7;
                            }
                        }
                        int i122 = this.zzl;
                        i = i122 | i11;
                        if (i != 329) {
                        }
                        this.zzl = i3;
                        iZzd = i10;
                        c3 = c;
                        i9 = i2;
                        i8 = 13;
                    }
                }
            } else if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        int iMin = Math.min(zzfuVar.zzb(), this.zzt - this.zzk);
                        this.zzv.zzq(zzfuVar, iMin);
                        int i17 = this.zzk + iMin;
                        this.zzk = i17;
                        if (i17 == this.zzt) {
                            zzeq.zzf(this.zzu != -9223372036854775807L);
                            this.zzv.zzs(this.zzu, 1, this.zzt, 0, null);
                            this.zzu += this.zzw;
                            zzh();
                        }
                    } else {
                        if (zzk(zzfuVar, this.zzc.zza, true != this.zzm ? 5 : 7)) {
                            this.zzc.zzk(0);
                            if (this.zzr) {
                                this.zzc.zzm(10);
                            } else {
                                int iZzd4 = this.zzc.zzd(2) + 1;
                                if (iZzd4 != 2) {
                                    zzfk.zzf("AdtsReader", "Detected audio object type: " + iZzd4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzm(5);
                                int iZzd5 = this.zzc.zzd(3);
                                int i18 = this.zzp;
                                int i19 = zzacq.zza;
                                byte[] bArr = {(byte) (((i18 >> 1) & 7) | 16), (byte) (((iZzd5 << 3) & 120) | ((i18 << 7) & 128))};
                                zzacp zzacpVarZza = zzacq.zza(bArr);
                                zzal zzalVar = new zzal();
                                zzalVar.zzK(this.zzg);
                                zzalVar.zzX("audio/mp4a-latm");
                                zzalVar.zzz(zzacpVarZza.zzc);
                                zzalVar.zzy(zzacpVarZza.zzb);
                                zzalVar.zzY(zzacpVarZza.zza);
                                zzalVar.zzL(Collections.singletonList(bArr));
                                zzalVar.zzO(this.zze);
                                zzalVar.zzV(this.zzf);
                                zzan zzanVarZzad = zzalVar.zzad();
                                this.zzs = 1024000000 / zzanVarZzad.zzB;
                                this.zzh.zzl(zzanVarZzad);
                                this.zzr = true;
                            }
                            this.zzc.zzm(4);
                            int iZzd6 = this.zzc.zzd(13);
                            zzj(this.zzh, this.zzs, 0, this.zzm ? iZzd6 - 9 : iZzd6 - 7);
                        }
                    }
                } else if (zzk(zzfuVar, this.zzd.zzM(), 10)) {
                    this.zzi.zzq(this.zzd, 10);
                    this.zzd.zzK(6);
                    zzj(this.zzi, 0L, 10, this.zzd.zzl() + 10);
                }
            } else if (zzfuVar.zzb() != 0) {
                zzft zzftVar = this.zzc;
                zzftVar.zza[0] = zzfuVar.zzM()[zzfuVar.zzd()];
                zzftVar.zzk(2);
                int iZzd7 = this.zzc.zzd(4);
                int i20 = this.zzp;
                if (i20 == -1 || iZzd7 == i20) {
                    if (!this.zzn) {
                        this.zzn = true;
                        this.zzo = this.zzq;
                        this.zzp = iZzd7;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zzg = zzapoVar.zzb();
        zzafa zzafaVarZzw = zzadxVar.zzw(zzapoVar.zza(), 1);
        this.zzh = zzafaVarZzw;
        this.zzv = zzafaVarZzw;
        if (!this.zzb) {
            this.zzi = new zzadt();
            return;
        }
        zzapoVar.zzc();
        zzafa zzafaVarZzw2 = zzadxVar.zzw(zzapoVar.zza(), 5);
        this.zzi = zzafaVarZzw2;
        zzal zzalVar = new zzal();
        zzalVar.zzK(zzapoVar.zzb());
        zzalVar.zzX("application/id3");
        zzafaVarZzw2.zzl(zzalVar.zzad());
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j, int i) {
        this.zzu = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzu = -9223372036854775807L;
        zzg();
    }
}
