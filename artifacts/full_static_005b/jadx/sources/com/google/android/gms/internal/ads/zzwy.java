package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzwy {
    private final zzfu zza = new zzfu(32);
    private zzwx zzb;
    private zzwx zzc;
    private zzwx zzd;
    private long zze;
    private final zzzv zzf;

    public zzwy(zzzv zzzvVar) {
        this.zzf = zzzvVar;
        zzwx zzwxVar = new zzwx(0L, 65536);
        this.zzb = zzwxVar;
        this.zzc = zzwxVar;
        this.zzd = zzwxVar;
    }

    private final int zzi(int i) {
        zzwx zzwxVar = this.zzd;
        if (zzwxVar.zzc == null) {
            zzzo zzzoVarZzb = this.zzf.zzb();
            zzwx zzwxVar2 = new zzwx(this.zzd.zzb, 65536);
            zzwxVar.zzc = zzzoVarZzb;
            zzwxVar.zzd = zzwxVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzwx zzj(zzwx zzwxVar, long j) {
        while (j >= zzwxVar.zzb) {
            zzwxVar = zzwxVar.zzd;
        }
        return zzwxVar;
    }

    private static zzwx zzk(zzwx zzwxVar, long j, ByteBuffer byteBuffer, int i) {
        zzwx zzwxVarZzj = zzj(zzwxVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (zzwxVarZzj.zzb - j));
            byteBuffer.put(zzwxVarZzj.zzc.zza, zzwxVarZzj.zza(j), iMin);
            i -= iMin;
            j += iMin;
            if (j == zzwxVarZzj.zzb) {
                zzwxVarZzj = zzwxVarZzj.zzd;
            }
        }
        return zzwxVarZzj;
    }

    private static zzwx zzl(zzwx zzwxVar, long j, byte[] bArr, int i) {
        zzwx zzwxVarZzj = zzj(zzwxVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (zzwxVarZzj.zzb - j));
            System.arraycopy(zzwxVarZzj.zzc.zza, zzwxVarZzj.zza(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == zzwxVarZzj.zzb) {
                zzwxVarZzj = zzwxVarZzj.zzd;
            }
        }
        return zzwxVarZzj;
    }

    private static zzwx zzm(zzwx zzwxVar, zzin zzinVar, zzxa zzxaVar, zzfu zzfuVar) {
        zzwx zzwxVarZzl;
        if (zzinVar.zzk()) {
            long j = zzxaVar.zzb;
            int iZzq = 1;
            zzfuVar.zzH(1);
            zzwx zzwxVarZzl2 = zzl(zzwxVar, j, zzfuVar.zzM(), 1);
            long j2 = j + 1;
            byte b = zzfuVar.zzM()[0];
            int i = b & 128;
            int i2 = b & 127;
            zzik zzikVar = zzinVar.zzb;
            byte[] bArr = zzikVar.zza;
            if (bArr == null) {
                zzikVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            zzwxVarZzl = zzl(zzwxVarZzl2, j2, zzikVar.zza, i2);
            long j3 = j2 + i2;
            if (z) {
                zzfuVar.zzH(2);
                zzwxVarZzl = zzl(zzwxVarZzl, j3, zzfuVar.zzM(), 2);
                j3 += 2;
                iZzq = zzfuVar.zzq();
            }
            int i3 = iZzq;
            int[] iArr = zzikVar.zzd;
            if (iArr == null || iArr.length < i3) {
                iArr = new int[i3];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzikVar.zze;
            if (iArr3 == null || iArr3.length < i3) {
                iArr3 = new int[i3];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i3 * 6;
                zzfuVar.zzH(i4);
                zzwxVarZzl = zzl(zzwxVarZzl, j3, zzfuVar.zzM(), i4);
                j3 += i4;
                zzfuVar.zzK(0);
                for (int i5 = 0; i5 < i3; i5++) {
                    iArr2[i5] = zzfuVar.zzq();
                    iArr4[i5] = zzfuVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzxaVar.zza - ((int) (j3 - zzxaVar.zzb));
            }
            zzaez zzaezVar = zzxaVar.zzc;
            int i6 = zzgd.zza;
            zzikVar.zzc(i3, iArr2, iArr4, zzaezVar.zzb, zzikVar.zza, zzaezVar.zza, zzaezVar.zzc, zzaezVar.zzd);
            long j4 = zzxaVar.zzb;
            int i7 = (int) (j3 - j4);
            zzxaVar.zzb = j4 + i7;
            zzxaVar.zza -= i7;
        } else {
            zzwxVarZzl = zzwxVar;
        }
        if (!zzinVar.zze()) {
            zzinVar.zzi(zzxaVar.zza);
            return zzk(zzwxVarZzl, zzxaVar.zzb, zzinVar.zzc, zzxaVar.zza);
        }
        zzfuVar.zzH(4);
        zzwx zzwxVarZzl3 = zzl(zzwxVarZzl, zzxaVar.zzb, zzfuVar.zzM(), 4);
        int iZzp = zzfuVar.zzp();
        zzxaVar.zzb += 4;
        zzxaVar.zza -= 4;
        zzinVar.zzi(iZzp);
        zzwx zzwxVarZzk = zzk(zzwxVarZzl3, zzxaVar.zzb, zzinVar.zzc, iZzp);
        zzxaVar.zzb += iZzp;
        int i8 = zzxaVar.zza - iZzp;
        zzxaVar.zza = i8;
        ByteBuffer byteBuffer = zzinVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            zzinVar.zzf = ByteBuffer.allocate(i8);
        } else {
            zzinVar.zzf.clear();
        }
        return zzk(zzwxVarZzk, zzxaVar.zzb, zzinVar.zzf, zzxaVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + i;
        this.zze = j;
        zzwx zzwxVar = this.zzd;
        if (j == zzwxVar.zzb) {
            this.zzd = zzwxVar.zzd;
        }
    }

    public final int zza(zzu zzuVar, int i, boolean z) throws IOException {
        int iZzi = zzi(i);
        zzwx zzwxVar = this.zzd;
        int iZza = zzuVar.zza(zzwxVar.zzc.zza, zzwxVar.zza(this.zze), iZzi);
        if (iZza != -1) {
            zzn(iZza);
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzwx zzwxVar;
        if (j != -1) {
            while (true) {
                zzwxVar = this.zzb;
                if (j < zzwxVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzwxVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzwxVar.zza) {
                this.zzc = zzwxVar;
            }
        }
    }

    public final void zzd(zzin zzinVar, zzxa zzxaVar) {
        zzm(this.zzc, zzinVar, zzxaVar, this.zza);
    }

    public final void zze(zzin zzinVar, zzxa zzxaVar) {
        this.zzc = zzm(this.zzc, zzinVar, zzxaVar, this.zza);
    }

    public final void zzf() {
        zzwx zzwxVar = this.zzb;
        if (zzwxVar.zzc != null) {
            this.zzf.zzd(zzwxVar);
            zzwxVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzwx zzwxVar2 = this.zzb;
        this.zzc = zzwxVar2;
        this.zzd = zzwxVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzfu zzfuVar, int i) {
        while (i > 0) {
            int iZzi = zzi(i);
            zzwx zzwxVar = this.zzd;
            zzfuVar.zzG(zzwxVar.zzc.zza, zzwxVar.zza(this.zze), iZzi);
            i -= iZzi;
            zzn(iZzi);
        }
    }
}
