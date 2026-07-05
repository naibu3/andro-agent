package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzakc {
    public final zzafa zza;
    public zzaks zzd;
    public zzajy zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzakr zzb = new zzakr();
    public final zzfu zzc = new zzfu();
    private final zzfu zzj = new zzfu(1);
    private final zzfu zzk = new zzfu();

    public zzakc(zzafa zzafaVar, zzaks zzaksVar, zzajy zzajyVar) {
        this.zza = zzafaVar;
        this.zzd = zzaksVar;
        this.zze = zzajyVar;
        zzh(zzaksVar, zzajyVar);
    }

    public final int zza() {
        int i = !this.zzl ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzfu zzfuVar;
        zzakq zzakqVarZzf = zzf();
        if (zzakqVarZzf == null) {
            return 0;
        }
        int i3 = zzakqVarZzf.zzd;
        if (i3 != 0) {
            zzfuVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzakqVarZzf.zze;
            int i4 = zzgd.zza;
            zzfu zzfuVar2 = this.zzk;
            int length = bArr.length;
            zzfuVar2.zzI(bArr, length);
            zzfuVar = this.zzk;
            i3 = length;
        }
        boolean zZzb = this.zzb.zzb(this.zzf);
        boolean z = zZzb || i2 != 0;
        zzfu zzfuVar3 = this.zzj;
        zzfuVar3.zzM()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzfuVar3.zzK(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzfuVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zZzb) {
            this.zzc.zzH(8);
            zzfu zzfuVar4 = this.zzc;
            byte[] bArrZzM = zzfuVar4.zzM();
            bArrZzM[0] = 0;
            bArrZzM[1] = 1;
            bArrZzM[2] = 0;
            bArrZzM[3] = (byte) i2;
            bArrZzM[4] = (byte) ((i >> 24) & 255);
            bArrZzM[5] = (byte) ((i >> 16) & 255);
            bArrZzM[6] = (byte) ((i >> 8) & 255);
            bArrZzM[7] = (byte) (i & 255);
            this.zza.zzr(zzfuVar4, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        zzfu zzfuVar5 = this.zzb.zzn;
        int iZzq = zzfuVar5.zzq();
        zzfuVar5.zzL(-2);
        int i6 = (iZzq * 6) + 2;
        if (i2 != 0) {
            this.zzc.zzH(i6);
            byte[] bArrZzM2 = this.zzc.zzM();
            zzfuVar5.zzG(bArrZzM2, 0, i6);
            int i7 = (((bArrZzM2[2] & 255) << 8) | (bArrZzM2[3] & 255)) + i2;
            bArrZzM2[2] = (byte) ((i7 >> 8) & 255);
            bArrZzM2[3] = (byte) (i7 & 255);
            zzfuVar5 = this.zzc;
        }
        this.zza.zzr(zzfuVar5, i6, 1);
        return i5 + i6;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzakr zzakrVar = this.zzb;
        return zzakrVar.zzi[this.zzf];
    }

    public final zzakq zzf() {
        if (!this.zzl) {
            return null;
        }
        zzajy zzajyVar = this.zzb.zza;
        int i = zzgd.zza;
        int i2 = zzajyVar.zza;
        zzakq zzakqVarZza = this.zzb.zzm;
        if (zzakqVarZza == null) {
            zzakqVarZza = this.zzd.zza.zza(i2);
        }
        if (zzakqVarZza == null || !zzakqVarZza.zza) {
            return null;
        }
        return zzakqVarZza;
    }

    public final void zzh(zzaks zzaksVar, zzajy zzajyVar) {
        this.zzd = zzaksVar;
        this.zze = zzajyVar;
        this.zza.zzl(zzaksVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzakr zzakrVar = this.zzb;
        zzakrVar.zzd = 0;
        zzakrVar.zzp = 0L;
        zzakrVar.zzq = false;
        zzakrVar.zzk = false;
        zzakrVar.zzo = false;
        zzakrVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }
}
