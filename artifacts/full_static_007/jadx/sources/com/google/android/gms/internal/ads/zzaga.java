package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaga implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzafz
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzaga(0)};
        }
    };
    private final byte[] zzb;
    private final zzfu zzc;
    private final zzaeb zzd;
    private zzadx zze;
    private zzafa zzf;
    private int zzg;
    private zzcd zzh;
    private zzaeg zzi;
    private int zzj;
    private int zzk;
    private zzafy zzl;
    private int zzm;
    private long zzn;

    public zzaga() {
        throw null;
    }

    public zzaga(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzfu(new byte[32768], 0);
        this.zzd = new zzaeb();
        this.zzg = 0;
    }

    private final long zza(zzfu zzfuVar, boolean z) {
        boolean zZzc;
        this.zzi.getClass();
        int iZzd = zzfuVar.zzd();
        while (iZzd <= zzfuVar.zze() - 16) {
            zzfuVar.zzK(iZzd);
            if (zzaec.zzc(zzfuVar, this.zzi, this.zzk, this.zzd)) {
                zzfuVar.zzK(iZzd);
                return this.zzd.zza;
            }
            iZzd++;
        }
        if (!z) {
            zzfuVar.zzK(iZzd);
            return -1L;
        }
        while (iZzd <= zzfuVar.zze() - this.zzj) {
            zzfuVar.zzK(iZzd);
            try {
                zZzc = zzaec.zzc(zzfuVar, this.zzi, this.zzk, this.zzd);
            } catch (IndexOutOfBoundsException unused) {
                zZzc = false;
            }
            if (zzfuVar.zzd() <= zzfuVar.zze() && zZzc) {
                zzfuVar.zzK(iZzd);
                return this.zzd.zza;
            }
            iZzd++;
        }
        zzfuVar.zzK(zzfuVar.zze());
        return -1L;
    }

    private final void zzg() {
        long j = this.zzn * 1000000;
        zzaeg zzaegVar = this.zzi;
        int i = zzgd.zza;
        this.zzf.zzs(j / zzaegVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zze = zzadxVar;
        this.zzf = zzadxVar.zzw(0, 1);
        zzadxVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        zzaed.zza(zzadvVar, false);
        zzfu zzfuVar = new zzfu(4);
        ((zzadi) zzadvVar).zzm(zzfuVar.zzM(), 0, 4, false);
        return zzfuVar.zzu() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzafy zzafyVar = this.zzl;
            if (zzafyVar != null) {
                zzafyVar.zzd(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzH(0);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        boolean zZzo;
        zzaet zzaesVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zzadvVar.zzj();
            long jZze = zzadvVar.zze();
            zzcd zzcdVarZza = zzaed.zza(zzadvVar, true);
            ((zzadi) zzadvVar).zzo((int) (zzadvVar.zze() - jZze), false);
            this.zzh = zzcdVarZza;
            this.zzg = 1;
            return 0;
        }
        if (i == 1) {
            ((zzadi) zzadvVar).zzm(this.zzb, 0, 42, false);
            zzadvVar.zzj();
            this.zzg = 2;
            return 0;
        }
        if (i == 2) {
            zzfu zzfuVar = new zzfu(4);
            ((zzadi) zzadvVar).zzn(zzfuVar.zzM(), 0, 4, false);
            if (zzfuVar.zzu() != 1716281667) {
                throw zzch.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzg = 3;
            return 0;
        }
        if (i == 3) {
            zzaeg zzaegVarZze = this.zzi;
            do {
                zzadvVar.zzj();
                zzft zzftVar = new zzft(new byte[4], 4);
                zzadi zzadiVar = (zzadi) zzadvVar;
                zzadiVar.zzm(zzftVar.zza, 0, 4, false);
                zZzo = zzftVar.zzo();
                int iZzd = zzftVar.zzd(7);
                int iZzd2 = zzftVar.zzd(24) + 4;
                if (iZzd == 0) {
                    byte[] bArr = new byte[38];
                    zzadiVar.zzn(bArr, 0, 38, false);
                    zzaegVarZze = new zzaeg(bArr, 4);
                } else {
                    if (zzaegVarZze == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iZzd == 3) {
                        zzfu zzfuVar2 = new zzfu(iZzd2);
                        zzadiVar.zzn(zzfuVar2.zzM(), 0, iZzd2, false);
                        zzaegVarZze = zzaegVarZze.zzf(zzaed.zzb(zzfuVar2));
                    } else if (iZzd == 4) {
                        zzfu zzfuVar3 = new zzfu(iZzd2);
                        zzadiVar.zzn(zzfuVar3.zzM(), 0, iZzd2, false);
                        zzfuVar3.zzL(4);
                        zzaegVarZze = zzaegVarZze.zzg(Arrays.asList(zzafg.zzc(zzfuVar3, false, false).zzb));
                    } else if (iZzd == 6) {
                        zzfu zzfuVar4 = new zzfu(iZzd2);
                        zzadiVar.zzn(zzfuVar4.zzM(), 0, iZzd2, false);
                        zzfuVar4.zzL(4);
                        zzaegVarZze = zzaegVarZze.zze(zzgbc.zzn(zzagw.zzb(zzfuVar4)));
                    } else {
                        zzadiVar.zzo(iZzd2, false);
                    }
                }
                int i2 = zzgd.zza;
                this.zzi = zzaegVarZze;
            } while (!zZzo);
            zzaegVarZze.getClass();
            this.zzj = Math.max(zzaegVarZze.zzc, 6);
            this.zzf.zzl(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        }
        if (i == 4) {
            zzadvVar.zzj();
            zzfu zzfuVar5 = new zzfu(2);
            ((zzadi) zzadvVar).zzm(zzfuVar5.zzM(), 0, 2, false);
            int iZzq = zzfuVar5.zzq();
            if ((iZzq >> 2) != 16382) {
                zzadvVar.zzj();
                throw zzch.zza("First frame does not start with sync code.", null);
            }
            zzadvVar.zzj();
            this.zzk = iZzq;
            zzadx zzadxVar = this.zze;
            int i3 = zzgd.zza;
            long jZzf = zzadvVar.zzf();
            long jZzd = zzadvVar.zzd();
            zzaeg zzaegVar = this.zzi;
            zzaegVar.getClass();
            if (zzaegVar.zzk != null) {
                zzaesVar = new zzaee(zzaegVar, jZzf);
            } else if (jZzd == -1 || zzaegVar.zzj <= 0) {
                zzaesVar = new zzaes(zzaegVar.zza(), 0L);
            } else {
                zzafy zzafyVar = new zzafy(zzaegVar, this.zzk, jZzf, jZzd);
                this.zzl = zzafyVar;
                zzaesVar = zzafyVar.zzb();
            }
            zzadxVar.zzO(zzaesVar);
            this.zzg = 5;
            return 0;
        }
        this.zzf.getClass();
        zzaeg zzaegVar2 = this.zzi;
        zzaegVar2.getClass();
        zzafy zzafyVar2 = this.zzl;
        if (zzafyVar2 != null && zzafyVar2.zze()) {
            return zzafyVar2.zza(zzadvVar, zzaeqVar);
        }
        if (this.zzn == -1) {
            this.zzn = zzaec.zzb(zzadvVar, zzaegVar2);
            return 0;
        }
        zzfu zzfuVar6 = this.zzc;
        int iZze = zzfuVar6.zze();
        if (iZze < 32768) {
            int iZza = zzadvVar.zza(zzfuVar6.zzM(), iZze, 32768 - iZze);
            z = iZza == -1;
            if (!z) {
                this.zzc.zzJ(iZze + iZza);
            } else if (this.zzc.zzb() == 0) {
                zzg();
                return -1;
            }
        } else {
            z = false;
        }
        zzfu zzfuVar7 = this.zzc;
        int iZzd3 = zzfuVar7.zzd();
        int i4 = this.zzm;
        int i5 = this.zzj;
        if (i4 < i5) {
            zzfuVar7.zzL(Math.min(i5 - i4, zzfuVar7.zzb()));
        }
        long jZza = zza(this.zzc, z);
        zzfu zzfuVar8 = this.zzc;
        int iZzd4 = zzfuVar8.zzd() - iZzd3;
        zzfuVar8.zzK(iZzd3);
        zzaey.zzb(this.zzf, this.zzc, iZzd4);
        this.zzm += iZzd4;
        if (jZza != -1) {
            zzg();
            this.zzm = 0;
            this.zzn = jZza;
        }
        zzfu zzfuVar9 = this.zzc;
        if (zzfuVar9.zzb() >= 16) {
            return 0;
        }
        int iZzb = zzfuVar9.zzb();
        System.arraycopy(zzfuVar9.zzM(), zzfuVar9.zzd(), zzfuVar9.zzM(), 0, iZzb);
        this.zzc.zzK(0);
        this.zzc.zzJ(iZzb);
        return 0;
    }
}
