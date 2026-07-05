package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzxe implements zzafa {
    private boolean zzB;
    private zzsu zzC;
    private final zzwy zza;
    private final zzst zzd;
    private final zzso zze;
    private zzxd zzf;
    private zzan zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzan zzy;
    private zzan zzz;
    private final zzxa zzb = new zzxa();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzaez[] zzn = new zzaez[1000];
    private final zzxl zzc = new zzxl(new zzev() { // from class: com.google.android.gms.internal.ads.zzwz
        @Override // com.google.android.gms.internal.ads.zzev
        public final void zza(Object obj) {
            zzss zzssVar = ((zzxc) obj).zzb;
        }
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzA = true;

    protected zzxe(zzzv zzzvVar, zzst zzstVar, zzso zzsoVar) {
        this.zzd = zzstVar;
        this.zze = zzsoVar;
        this.zza = new zzwy(zzzvVar);
    }

    private final int zzA(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzm[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.zzl[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.zzh) {
                i = 0;
            }
        }
        return i3;
    }

    private final int zzB(int i) {
        int i2 = this.zzq + i;
        int i3 = this.zzh;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int zzC(zzlj zzljVar, zzin zzinVar, boolean z, boolean z2, zzxa zzxaVar) {
        zzinVar.zzd = false;
        if (!zzK()) {
            if (!z2 && !this.zzv) {
                zzan zzanVar = this.zzz;
                if (zzanVar == null || (!z && zzanVar == this.zzg)) {
                    return -3;
                }
                zzH(zzanVar, zzljVar);
                return -5;
            }
            zzinVar.zzc(4);
            zzinVar.zze = Long.MIN_VALUE;
            return -4;
        }
        zzan zzanVar2 = ((zzxc) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z && zzanVar2 == this.zzg) {
            int iZzB = zzB(this.zzr);
            if (!zzL(iZzB)) {
                zzinVar.zzd = true;
                return -3;
            }
            zzinVar.zzc(this.zzl[iZzB]);
            if (this.zzr == this.zzo - 1 && (z2 || this.zzv)) {
                zzinVar.zza(536870912);
            }
            zzinVar.zze = this.zzm[iZzB];
            zzxaVar.zza = this.zzk[iZzB];
            zzxaVar.zzb = this.zzj[iZzB];
            zzxaVar.zzc = this.zzn[iZzB];
            return -4;
        }
        zzH(zzanVar2, zzljVar);
        return -5;
    }

    private final synchronized long zzD(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.zzo;
        if (i2 != 0) {
            long[] jArr = this.zzm;
            int i3 = this.zzq;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.zzr) != i2) {
                    i2 = i + 1;
                }
                int iZzA = zzA(i3, i2, j, false);
                if (iZzA != -1) {
                    return zzF(iZzA);
                }
            }
        }
        return -1L;
    }

    private final synchronized long zzE() {
        int i = this.zzo;
        if (i == 0) {
            return -1L;
        }
        return zzF(i);
    }

    private final synchronized void zzG(long j, int i, long j2, int i2, zzaez zzaezVar) {
        int i3 = this.zzo;
        if (i3 > 0) {
            int iZzB = zzB(i3 - 1);
            zzeq.zzd(this.zzj[iZzB] + ((long) this.zzk[iZzB]) <= j2);
        }
        this.zzv = (536870912 & i) != 0;
        this.zzu = Math.max(this.zzu, j);
        int iZzB2 = zzB(this.zzo);
        this.zzm[iZzB2] = j;
        this.zzj[iZzB2] = j2;
        this.zzk[iZzB2] = i2;
        this.zzl[iZzB2] = i;
        this.zzn[iZzB2] = zzaezVar;
        this.zzi[iZzB2] = 0;
        if (this.zzc.zzf() || !((zzxc) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzan zzanVar = this.zzz;
            if (zzanVar == null) {
                throw null;
            }
            this.zzc.zzc(this.zzp + this.zzo, new zzxc(zzanVar, zzss.zza, null));
        }
        int i4 = this.zzo + 1;
        this.zzo = i4;
        int i5 = this.zzh;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            zzaez[] zzaezVarArr = new zzaez[i6];
            int i7 = this.zzq;
            int i8 = i5 - i7;
            System.arraycopy(this.zzj, i7, jArr2, 0, i8);
            System.arraycopy(this.zzm, this.zzq, jArr3, 0, i8);
            System.arraycopy(this.zzl, this.zzq, iArr, 0, i8);
            System.arraycopy(this.zzk, this.zzq, iArr2, 0, i8);
            System.arraycopy(this.zzn, this.zzq, zzaezVarArr, 0, i8);
            System.arraycopy(this.zzi, this.zzq, jArr, 0, i8);
            int i9 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr2, i8, i9);
            System.arraycopy(this.zzm, 0, jArr3, i8, i9);
            System.arraycopy(this.zzl, 0, iArr, i8, i9);
            System.arraycopy(this.zzk, 0, iArr2, i8, i9);
            System.arraycopy(this.zzn, 0, zzaezVarArr, i8, i9);
            System.arraycopy(this.zzi, 0, jArr, i8, i9);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzaezVarArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i6;
        }
    }

    private final void zzH(zzan zzanVar, zzlj zzljVar) {
        zzan zzanVar2 = this.zzg;
        zzae zzaeVar = zzanVar2 == null ? null : zzanVar2.zzq;
        this.zzg = zzanVar;
        zzae zzaeVar2 = zzanVar.zzq;
        zzljVar.zza = zzanVar.zzc(this.zzd.zza(zzanVar));
        zzljVar.zzb = this.zzC;
        if (zzanVar2 == null || !zzgd.zzG(zzaeVar, zzaeVar2)) {
            zzsu zzsuVar = zzanVar.zzq != null ? new zzsu(new zzsm(new zzsw(1), 6001)) : null;
            this.zzC = zzsuVar;
            zzljVar.zzb = zzsuVar;
        }
    }

    private final void zzI() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzJ() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzK() {
        return this.zzr != this.zzo;
    }

    private final boolean zzL(int i) {
        if (this.zzC != null) {
            return (this.zzl[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzM(zzan zzanVar) {
        this.zzx = false;
        if (zzgd.zzG(zzanVar, this.zzz)) {
            return false;
        }
        if (this.zzc.zzf() || !((zzxc) this.zzc.zzb()).zza.equals(zzanVar)) {
            this.zzz = zzanVar;
        } else {
            this.zzz = ((zzxc) this.zzc.zzb()).zza;
        }
        boolean z = this.zzA;
        zzan zzanVar2 = this.zzz;
        this.zzA = z & zzcg.zzf(zzanVar2.zzn, zzanVar2.zzk);
        this.zzB = false;
        return true;
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j, boolean z) {
        int i = this.zzr;
        int iZzB = zzB(i);
        if (zzK() && j >= this.zzm[iZzB]) {
            if (j > this.zzu && z) {
                return this.zzo - i;
            }
            int iZzA = zzA(iZzB, this.zzo - i, j, true);
            if (iZzA == -1) {
                return 0;
            }
            return iZzA;
        }
        return 0;
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zze(zzlj zzljVar, zzin zzinVar, int i, boolean z) {
        int iZzC = zzC(zzljVar, zzinVar, (i & 2) != 0, z, this.zzb);
        if (iZzC != -4) {
            return iZzC;
        }
        if (!zzinVar.zzf()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 == 0) {
                    this.zza.zze(zzinVar, this.zzb);
                    this.zzr++;
                    return -4;
                }
                this.zza.zzd(zzinVar, this.zzb);
            }
        }
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ int zzf(zzu zzuVar, int i, boolean z) {
        return zzaey.zza(this, zzuVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final int zzg(zzu zzuVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zza(zzuVar, i, z);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    public final synchronized zzan zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzj(long j, boolean z, boolean z2) {
        this.zza.zzc(zzD(j, false, z2));
    }

    public final void zzk() {
        this.zza.zzc(zzE());
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzl(zzan zzanVar) {
        this.zzy = zzanVar;
        boolean zZzM = zzM(zzanVar);
        zzxd zzxdVar = this.zzf;
        if (zzxdVar == null || !zZzM) {
            return;
        }
        zzxdVar.zzM(zzanVar);
    }

    public final void zzm() throws IOException {
        zzsu zzsuVar = this.zzC;
        if (zzsuVar != null) {
            throw zzsuVar.zza();
        }
    }

    public final void zzn() {
        zzk();
        zzI();
    }

    public final void zzo() {
        zzp(true);
        zzI();
    }

    public final void zzp(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
            this.zzA = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ void zzq(zzfu zzfuVar, int i) {
        zzaey.zzb(this, zzfuVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzr(zzfu zzfuVar, int i, int i2) {
        this.zza.zzh(zzfuVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzs(long j, int i, int i2, int i3, zzaez zzaezVar) {
        if (this.zzw) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzA) {
            if (j < this.zzs) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzB) {
                    zzfk.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.zzz))));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        zzG(j, i, (this.zza.zzb() - i2) - i3, i2, zzaezVar);
    }

    public final void zzt(long j) {
        this.zzs = j;
    }

    public final void zzu(zzxd zzxdVar) {
        this.zzf = zzxdVar;
    }

    public final synchronized void zzv(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzr + i <= this.zzo) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzeq.zzd(z);
        this.zzr += i;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    public final synchronized boolean zzx(boolean z) {
        boolean z2 = true;
        if (zzK()) {
            if (((zzxc) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzL(zzB(this.zzr));
        }
        if (!z && !this.zzv) {
            zzan zzanVar = this.zzz;
            if (zzanVar == null) {
                z2 = false;
            } else if (zzanVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean zzy(int i) {
        zzJ();
        int i2 = this.zzp;
        if (i >= i2 && i <= this.zzo + i2) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzz(long j, boolean z) {
        int iZzA;
        zzJ();
        int i = this.zzr;
        int iZzB = zzB(i);
        if (zzK() && j >= this.zzm[iZzB]) {
            if (j > this.zzu) {
                if (z) {
                    z = true;
                }
            }
            if (this.zzA) {
                iZzA = this.zzo - i;
                int i2 = 0;
                while (true) {
                    if (i2 < iZzA) {
                        if (this.zzm[iZzB] >= j) {
                            iZzA = i2;
                            break;
                        }
                        iZzB++;
                        if (iZzB == this.zzh) {
                            iZzB = 0;
                        }
                        i2++;
                    } else if (!z) {
                        iZzA = -1;
                    }
                }
            } else {
                iZzA = zzA(iZzB, this.zzo - i, j, true);
            }
            if (iZzA != -1) {
                this.zzs = j;
                this.zzr += iZzA;
                return true;
            }
        }
        return false;
    }

    private final long zzF(int i) {
        long j = this.zzt;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iZzB = zzB(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                jMax = Math.max(jMax, this.zzm[iZzB]);
                if ((this.zzl[iZzB] & 1) != 0) {
                    break;
                }
                iZzB--;
                if (iZzB == -1) {
                    iZzB = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j, jMax);
        this.zzo -= i;
        int i3 = this.zzp + i;
        this.zzp = i3;
        int i4 = this.zzq + i;
        this.zzq = i4;
        int i5 = this.zzh;
        if (i4 >= i5) {
            this.zzq = i4 - i5;
        }
        int i6 = this.zzr - i;
        this.zzr = i6;
        if (i6 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i3);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i7 = this.zzq;
        if (i7 == 0) {
            i7 = this.zzh;
        }
        return this.zzj[i7 - 1] + this.zzk[r12];
    }
}
