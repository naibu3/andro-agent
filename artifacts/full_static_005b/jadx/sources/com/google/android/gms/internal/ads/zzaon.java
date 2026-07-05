package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaon implements zzaoc {
    private final zzapd zza;
    private String zzb;
    private zzafa zzc;
    private zzaom zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaor zzg = new zzaor(32, 128);
    private final zzaor zzh = new zzaor(33, 128);
    private final zzaor zzi = new zzaor(34, 128);
    private final zzaor zzj = new zzaor(39, 128);
    private final zzaor zzk = new zzaor(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzfu zzn = new zzfu();

    public zzaon(zzapd zzapdVar) {
        this.zza = zzapdVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzb(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0139  */
    @Override // com.google.android.gms.internal.ads.zzaoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfu zzfuVar) {
        int i;
        byte[] bArr;
        int i2;
        long j;
        int i3;
        zzeq.zzb(this.zzc);
        int i4 = zzgd.zza;
        while (zzfuVar.zzb() > 0) {
            int iZzd = zzfuVar.zzd();
            int iZze = zzfuVar.zze();
            byte[] bArrZzM = zzfuVar.zzM();
            this.zzl += zzfuVar.zzb();
            this.zzc.zzq(zzfuVar, zzfuVar.zzb());
            while (iZzd < iZze) {
                int iZza = zzgr.zza(bArrZzM, iZzd, iZze, this.zzf);
                if (iZza == iZze) {
                    zzf(bArrZzM, iZzd, iZze);
                    return;
                }
                int i5 = iZza + 3;
                int i6 = bArrZzM[i5] & 126;
                int i7 = iZza - iZzd;
                if (i7 > 0) {
                    zzf(bArrZzM, iZzd, iZza);
                }
                int i8 = iZze - iZza;
                long j2 = this.zzl - i8;
                int i9 = i7 < 0 ? -i7 : 0;
                long j3 = this.zzm;
                this.zzd.zza(j2, i8, this.zze);
                if (!this.zze) {
                    this.zzg.zzd(i9);
                    this.zzh.zzd(i9);
                    this.zzi.zzd(i9);
                    zzaor zzaorVar = this.zzg;
                    if (zzaorVar.zze()) {
                        zzaor zzaorVar2 = this.zzh;
                        if (zzaorVar2.zze()) {
                            zzaor zzaorVar3 = this.zzi;
                            if (zzaorVar3.zze()) {
                                zzafa zzafaVar = this.zzc;
                                i2 = i5;
                                String str = this.zzb;
                                int i10 = zzaorVar.zzb;
                                i = iZze;
                                bArr = bArrZzM;
                                byte[] bArr2 = new byte[zzaorVar2.zzb + i10 + zzaorVar3.zzb];
                                i3 = i8;
                                System.arraycopy(zzaorVar.zza, 0, bArr2, 0, i10);
                                j = j2;
                                System.arraycopy(zzaorVar2.zza, 0, bArr2, zzaorVar.zzb, zzaorVar2.zzb);
                                System.arraycopy(zzaorVar3.zza, 0, bArr2, zzaorVar.zzb + zzaorVar2.zzb, zzaorVar3.zzb);
                                zzgo zzgoVarZzc = zzgr.zzc(zzaorVar2.zza, 5, zzaorVar2.zzb);
                                String strZzb = zzes.zzb(zzgoVarZzc.zza, zzgoVarZzc.zzb, zzgoVarZzc.zzc, zzgoVarZzc.zzd, zzgoVarZzc.zzg, zzgoVarZzc.zzh);
                                zzal zzalVar = new zzal();
                                zzalVar.zzK(str);
                                zzalVar.zzX("video/hevc");
                                zzalVar.zzz(strZzb);
                                zzalVar.zzac(zzgoVarZzc.zzi);
                                zzalVar.zzI(zzgoVarZzc.zzj);
                                zzr zzrVar = new zzr();
                                zzrVar.zzc(zzgoVarZzc.zzl);
                                zzrVar.zzb(zzgoVarZzc.zzm);
                                zzrVar.zzd(zzgoVarZzc.zzn);
                                zzrVar.zzf(zzgoVarZzc.zze + 8);
                                zzrVar.zza(zzgoVarZzc.zzf + 8);
                                zzalVar.zzA(zzrVar.zzg());
                                zzalVar.zzT(zzgoVarZzc.zzk);
                                zzalVar.zzL(Collections.singletonList(bArr2));
                                zzafaVar.zzl(zzalVar.zzad());
                                this.zze = true;
                            } else {
                                i = iZze;
                                bArr = bArrZzM;
                                i2 = i5;
                                j = j2;
                                i3 = i8;
                            }
                        }
                    }
                }
                if (this.zzj.zzd(i9)) {
                    zzaor zzaorVar4 = this.zzj;
                    this.zzn.zzI(this.zzj.zza, zzgr.zzb(zzaorVar4.zza, zzaorVar4.zzb));
                    this.zzn.zzL(5);
                    this.zza.zza(j3, this.zzn);
                }
                if (this.zzk.zzd(i9)) {
                    zzaor zzaorVar5 = this.zzk;
                    this.zzn.zzI(this.zzk.zza, zzgr.zzb(zzaorVar5.zza, zzaorVar5.zzb));
                    this.zzn.zzL(5);
                    this.zza.zza(j3, this.zzn);
                }
                int i11 = i6 >> 1;
                this.zzd.zzd(j, i3, i11, this.zzm, this.zze);
                if (!this.zze) {
                    this.zzg.zzc(i11);
                    this.zzh.zzc(i11);
                    this.zzi.zzc(i11);
                }
                this.zzj.zzc(i11);
                this.zzk.zzc(i11);
                iZzd = i2;
                iZze = i;
                bArrZzM = bArr;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zzb = zzapoVar.zzb();
        this.zzc = zzadxVar.zzw(zzapoVar.zza(), 2);
        this.zzd = new zzaom(this.zzc);
        this.zza.zzb(zzadxVar, zzapoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgr.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzaom zzaomVar = this.zzd;
        if (zzaomVar != null) {
            zzaomVar.zzc();
        }
    }
}
