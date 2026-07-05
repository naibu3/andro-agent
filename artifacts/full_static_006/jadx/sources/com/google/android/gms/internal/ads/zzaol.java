package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaol implements zzaoc {
    private final zzapd zza;
    private long zze;
    private String zzg;
    private zzafa zzh;
    private zzaok zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaor zzb = new zzaor(7, 128);
    private final zzaor zzc = new zzaor(8, 128);
    private final zzaor zzd = new zzaor(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzfu zzm = new zzfu();

    public zzaol(zzapd zzapdVar, boolean z, boolean z2) {
        this.zza = zzapdVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    @Override // com.google.android.gms.internal.ads.zzaoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfu zzfuVar) {
        int i;
        int i2;
        zzeq.zzb(this.zzh);
        int i3 = zzgd.zza;
        int iZzd = zzfuVar.zzd();
        int iZze = zzfuVar.zze();
        byte[] bArrZzM = zzfuVar.zzM();
        this.zze += zzfuVar.zzb();
        this.zzh.zzq(zzfuVar, zzfuVar.zzb());
        while (true) {
            int iZza = zzgr.zza(bArrZzM, iZzd, iZze, this.zzf);
            if (iZza == iZze) {
                zzf(bArrZzM, iZzd, iZze);
                return;
            }
            int i4 = iZza + 3;
            int i5 = bArrZzM[i4] & Ascii.US;
            int i6 = iZza - iZzd;
            if (i6 > 0) {
                zzf(bArrZzM, iZzd, iZza);
            }
            int i7 = iZze - iZza;
            long j = this.zze - i7;
            int i8 = i6 < 0 ? -i6 : 0;
            long j2 = this.zzk;
            if (this.zzj) {
                i = iZze;
                i2 = i4;
            } else {
                this.zzb.zzd(i8);
                this.zzc.zzd(i8);
                if (this.zzj) {
                    i = iZze;
                    i2 = i4;
                    zzaor zzaorVar = this.zzb;
                    if (zzaorVar.zze()) {
                        this.zzi.zzb(zzgr.zze(zzaorVar.zza, 4, zzaorVar.zzb));
                        this.zzb.zzb();
                    } else {
                        zzaor zzaorVar2 = this.zzc;
                        if (zzaorVar2.zze()) {
                            this.zzi.zza(zzgr.zzd(zzaorVar2.zza, 4, zzaorVar2.zzb));
                            this.zzc.zzb();
                        }
                    }
                } else if (this.zzb.zze() && this.zzc.zze()) {
                    ArrayList arrayList = new ArrayList();
                    zzaor zzaorVar3 = this.zzb;
                    arrayList.add(Arrays.copyOf(zzaorVar3.zza, zzaorVar3.zzb));
                    zzaor zzaorVar4 = this.zzc;
                    arrayList.add(Arrays.copyOf(zzaorVar4.zza, zzaorVar4.zzb));
                    zzaor zzaorVar5 = this.zzb;
                    zzgq zzgqVarZze = zzgr.zze(zzaorVar5.zza, 4, zzaorVar5.zzb);
                    zzaor zzaorVar6 = this.zzc;
                    zzgp zzgpVarZzd = zzgr.zzd(zzaorVar6.zza, 4, zzaorVar6.zzb);
                    i2 = i4;
                    String strZza = zzes.zza(zzgqVarZze.zza, zzgqVarZze.zzb, zzgqVarZze.zzc);
                    zzafa zzafaVar = this.zzh;
                    zzal zzalVar = new zzal();
                    i = iZze;
                    zzalVar.zzK(this.zzg);
                    zzalVar.zzX("video/avc");
                    zzalVar.zzz(strZza);
                    zzalVar.zzac(zzgqVarZze.zze);
                    zzalVar.zzI(zzgqVarZze.zzf);
                    zzr zzrVar = new zzr();
                    zzrVar.zzc(zzgqVarZze.zzj);
                    zzrVar.zzb(zzgqVarZze.zzk);
                    zzrVar.zzd(zzgqVarZze.zzl);
                    zzrVar.zzf(zzgqVarZze.zzh + 8);
                    zzrVar.zza(zzgqVarZze.zzi + 8);
                    zzalVar.zzA(zzrVar.zzg());
                    zzalVar.zzT(zzgqVarZze.zzg);
                    zzalVar.zzL(arrayList);
                    zzafaVar.zzl(zzalVar.zzad());
                    this.zzj = true;
                    this.zzi.zzb(zzgqVarZze);
                    this.zzi.zza(zzgpVarZzd);
                    this.zzb.zzb();
                    this.zzc.zzb();
                }
            }
            if (this.zzd.zzd(i8)) {
                zzaor zzaorVar7 = this.zzd;
                this.zzm.zzI(this.zzd.zza, zzgr.zzb(zzaorVar7.zza, zzaorVar7.zzb));
                this.zzm.zzK(4);
                this.zza.zza(j2, this.zzm);
            }
            if (this.zzi.zze(j, i7, this.zzj)) {
                this.zzl = false;
            }
            long j3 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzc(i5);
                this.zzc.zzc(i5);
            }
            this.zzd.zzc(i5);
            this.zzi.zzd(j, i5, j3, this.zzl);
            iZzd = i2;
            iZze = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zzg = zzapoVar.zzb();
        this.zzh = zzadxVar.zzw(zzapoVar.zza(), 2);
        this.zzi = new zzaok(this.zzh, false, false);
        this.zza.zzb(zzadxVar, zzapoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j, int i) {
        this.zzk = j;
        int i2 = i & 2;
        this.zzl = (i2 != 0) | this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzgr.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzaok zzaokVar = this.zzi;
        if (zzaokVar != null) {
            zzaokVar.zzc();
        }
    }
}
