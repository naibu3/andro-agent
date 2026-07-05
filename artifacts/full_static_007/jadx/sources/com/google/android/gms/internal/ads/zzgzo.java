package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgzo {
    static int zza(byte[] bArr, int i, zzgzn zzgznVar) throws zzhcd {
        int iZzh = zzh(bArr, i, zzgznVar);
        int i2 = zzgznVar.zza;
        if (i2 < 0) {
            throw zzhcd.zzf();
        }
        if (i2 > bArr.length - iZzh) {
            throw zzhcd.zzj();
        }
        if (i2 == 0) {
            zzgznVar.zzc = zzhac.zzb;
            return iZzh;
        }
        zzgznVar.zzc = zzhac.zzv(bArr, iZzh, i2);
        return iZzh + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(zzhdz zzhdzVar, byte[] bArr, int i, int i2, int i3, zzgzn zzgznVar) throws IOException {
        Object objZze = zzhdzVar.zze();
        int iZzl = zzl(objZze, zzhdzVar, bArr, i, i2, i3, zzgznVar);
        zzhdzVar.zzf(objZze);
        zzgznVar.zzc = objZze;
        return iZzl;
    }

    static int zzd(zzhdz zzhdzVar, byte[] bArr, int i, int i2, zzgzn zzgznVar) throws IOException {
        Object objZze = zzhdzVar.zze();
        int iZzm = zzm(objZze, zzhdzVar, bArr, i, i2, zzgznVar);
        zzhdzVar.zzf(objZze);
        zzgznVar.zzc = objZze;
        return iZzm;
    }

    static int zze(zzhdz zzhdzVar, int i, byte[] bArr, int i2, int i3, zzhca zzhcaVar, zzgzn zzgznVar) throws IOException {
        int iZzd = zzd(zzhdzVar, bArr, i2, i3, zzgznVar);
        zzhcaVar.add(zzgznVar.zzc);
        while (iZzd < i3) {
            int iZzh = zzh(bArr, iZzd, zzgznVar);
            if (i != zzgznVar.zza) {
                break;
            }
            iZzd = zzd(zzhdzVar, bArr, iZzh, i3, zzgznVar);
            zzhcaVar.add(zzgznVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i, zzhca zzhcaVar, zzgzn zzgznVar) throws IOException {
        zzhbp zzhbpVar = (zzhbp) zzhcaVar;
        int iZzh = zzh(bArr, i, zzgznVar);
        int i2 = zzgznVar.zza + iZzh;
        while (iZzh < i2) {
            iZzh = zzh(bArr, iZzh, zzgznVar);
            zzhbpVar.zzi(zzgznVar.zza);
        }
        if (iZzh == i2) {
            return iZzh;
        }
        throw zzhcd.zzj();
    }

    static int zzg(int i, byte[] bArr, int i2, int i3, zzher zzherVar, zzgzn zzgznVar) throws zzhcd {
        if ((i >>> 3) == 0) {
            throw zzhcd.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzk = zzk(bArr, i2, zzgznVar);
            zzherVar.zzj(i, Long.valueOf(zzgznVar.zzb));
            return iZzk;
        }
        if (i4 == 1) {
            zzherVar.zzj(i, Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzh = zzh(bArr, i2, zzgznVar);
            int i5 = zzgznVar.zza;
            if (i5 < 0) {
                throw zzhcd.zzf();
            }
            if (i5 > bArr.length - iZzh) {
                throw zzhcd.zzj();
            }
            if (i5 == 0) {
                zzherVar.zzj(i, zzhac.zzb);
            } else {
                zzherVar.zzj(i, zzhac.zzv(bArr, iZzh, i5));
            }
            return iZzh + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzhcd.zzc();
            }
            zzherVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzher zzherVarZzf = zzher.zzf();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iZzh2 = zzh(bArr, i2, zzgznVar);
            int i8 = zzgznVar.zza;
            i7 = i8;
            if (i8 == i6) {
                i2 = iZzh2;
                break;
            }
            int iZzg = zzg(i7, bArr, iZzh2, i3, zzherVarZzf, zzgznVar);
            i7 = i8;
            i2 = iZzg;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzhcd.zzg();
        }
        zzherVar.zzj(i, zzherVarZzf);
        return i2;
    }

    static int zzh(byte[] bArr, int i, zzgzn zzgznVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzi(b, bArr, i2, zzgznVar);
        }
        zzgznVar.zza = b;
        return i2;
    }

    static int zzi(int i, byte[] bArr, int i2, zzgzn zzgznVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & WorkQueueKt.MASK;
        if (b >= 0) {
            zzgznVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzgznVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgznVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgznVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgznVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzj(int i, byte[] bArr, int i2, int i3, zzhca zzhcaVar, zzgzn zzgznVar) {
        zzhbp zzhbpVar = (zzhbp) zzhcaVar;
        int iZzh = zzh(bArr, i2, zzgznVar);
        zzhbpVar.zzi(zzgznVar.zza);
        while (iZzh < i3) {
            int iZzh2 = zzh(bArr, iZzh, zzgznVar);
            if (i != zzgznVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzgznVar);
            zzhbpVar.zzi(zzgznVar.zza);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i, zzgzn zzgznVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzgznVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzgznVar.zzb = j2;
        return i3;
    }

    static int zzl(Object obj, zzhdz zzhdzVar, byte[] bArr, int i, int i2, int i3, zzgzn zzgznVar) throws IOException {
        int iZzc = ((zzhdh) zzhdzVar).zzc(obj, bArr, i, i2, i3, zzgznVar);
        zzgznVar.zzc = obj;
        return iZzc;
    }

    static int zzm(Object obj, zzhdz zzhdzVar, byte[] bArr, int i, int i2, zzgzn zzgznVar) throws IOException {
        int iZzi = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzi = zzi(i3, bArr, iZzi, zzgznVar);
            i3 = zzgznVar.zza;
        }
        int i4 = iZzi;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzhcd.zzj();
        }
        int i5 = i3 + i4;
        zzhdzVar.zzi(obj, bArr, i4, i5, zzgznVar);
        zzgznVar.zzc = obj;
        return i5;
    }

    static long zzn(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
