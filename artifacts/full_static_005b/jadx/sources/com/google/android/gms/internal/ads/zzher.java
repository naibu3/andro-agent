package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzher {
    private static final zzher zza = new zzher(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzher() {
        this(0, new int[8], new Object[8], true);
    }

    private zzher(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzher zzc() {
        return zza;
    }

    static zzher zze(zzher zzherVar, zzher zzherVar2) {
        int i = zzherVar.zzb + zzherVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzherVar.zzc, i);
        System.arraycopy(zzherVar2.zzc, 0, iArrCopyOf, zzherVar.zzb, zzherVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzherVar.zzd, i);
        System.arraycopy(zzherVar2.zzd, 0, objArrCopyOf, zzherVar.zzb, zzherVar2.zzb);
        return new zzher(i, iArrCopyOf, objArrCopyOf, true);
    }

    static zzher zzf() {
        return new zzher();
    }

    private final void zzn(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzher)) {
            return false;
        }
        zzher zzherVar = (zzher) obj;
        int i = this.zzb;
        if (i == zzherVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzherVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzherVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzD;
        int iZzE;
        int iZzD2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.zzd[i3]).longValue();
                    iZzD2 = zzhat.zzD(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzhac zzhacVar = (zzhac) this.zzd[i3];
                    int iZzD3 = zzhat.zzD(i7);
                    int iZzd = zzhacVar.zzd();
                    iZzD2 = iZzD3 + zzhat.zzD(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int iZzD4 = zzhat.zzD(i5 << 3);
                    iZzD = iZzD4 + iZzD4;
                    iZzE = ((zzher) this.zzd[i3]).zza();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(zzhcd.zza());
                    }
                    ((Integer) this.zzd[i3]).intValue();
                    iZzD2 = zzhat.zzD(i5 << 3) + 4;
                }
                i2 += iZzD2;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.zzd[i3]).longValue();
                iZzD = zzhat.zzD(i8);
                iZzE = zzhat.zzE(jLongValue);
            }
            iZzD2 = iZzD + iZzE;
            i2 += iZzD2;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzD = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzhac zzhacVar = (zzhac) this.zzd[i2];
            int iZzD2 = zzhat.zzD(8);
            int iZzD3 = zzhat.zzD(16) + zzhat.zzD(i3);
            int iZzD4 = zzhat.zzD(24);
            int iZzd = zzhacVar.zzd();
            iZzD += iZzD2 + iZzD2 + iZzD3 + iZzD4 + zzhat.zzD(iZzd) + iZzd;
        }
        this.zze = iZzD;
        return iZzD;
    }

    final zzher zzd(zzher zzherVar) {
        if (zzherVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzherVar.zzb;
        zzn(i);
        System.arraycopy(zzherVar.zzc, 0, this.zzc, this.zzb, zzherVar.zzb);
        System.arraycopy(zzherVar.zzd, 0, this.zzd, this.zzb, zzherVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzhdg.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final void zzk(zzhfi zzhfiVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzhfiVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzhfi zzhfiVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzhfiVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzhfiVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzhfiVar.zzd(i4, (zzhac) obj);
                } else if (i3 == 3) {
                    zzhfiVar.zzF(i4);
                    ((zzher) obj).zzl(zzhfiVar);
                    zzhfiVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzhcd.zza());
                    }
                    zzhfiVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    final boolean zzm(int i, zzham zzhamVar) throws IOException {
        int iZzm;
        zzg();
        int i2 = i & 7;
        if (i2 == 0) {
            zzj(i, Long.valueOf(zzhamVar.zzp()));
            return true;
        }
        if (i2 == 1) {
            zzj(i, Long.valueOf(zzhamVar.zzo()));
            return true;
        }
        if (i2 == 2) {
            zzj(i, zzhamVar.zzw());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhcd.zza();
            }
            zzj(i, Integer.valueOf(zzhamVar.zzg()));
            return true;
        }
        zzher zzherVar = new zzher();
        do {
            iZzm = zzhamVar.zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzherVar.zzm(iZzm, zzhamVar));
        zzhamVar.zzz(4 | ((i >>> 3) << 3));
        zzj(i, zzherVar);
        return true;
    }
}
