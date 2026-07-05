package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzapw implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzaps
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzapw()};
        }
    };
    private zzadx zzb;
    private zzafa zzc;
    private zzapu zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        int i;
        zzeq.zzb(this.zzc);
        int i2 = zzgd.zza;
        int i3 = this.zzd;
        int iZzl = 4;
        if (i3 == 0) {
            zzeq.zzf(zzadvVar.zzf() == 0);
            int i4 = this.zzg;
            if (i4 != -1) {
                ((zzadi) zzadvVar).zzo(i4, false);
                this.zzd = 4;
            } else {
                if (!zzapz.zzc(zzadvVar)) {
                    throw zzch.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((zzadi) zzadvVar).zzo((int) (zzadvVar.zze() - zzadvVar.zzf()), false);
                this.zzd = 1;
            }
            return 0;
        }
        long jZzr = -1;
        if (i3 == 1) {
            zzfu zzfuVar = new zzfu(8);
            zzapy zzapyVarZza = zzapy.zza(zzadvVar, zzfuVar);
            if (zzapyVarZza.zza != 1685272116) {
                zzadvVar.zzj();
            } else {
                zzadi zzadiVar = (zzadi) zzadvVar;
                zzadiVar.zzl(8, false);
                zzfuVar.zzK(0);
                zzadiVar.zzm(zzfuVar.zzM(), 0, 8, false);
                jZzr = zzfuVar.zzr();
                zzadiVar.zzo(((int) zzapyVarZza.zzb) + 8, false);
            }
            this.zze = jZzr;
            this.zzd = 2;
            return 0;
        }
        if (i3 == 2) {
            zzapx zzapxVarZzb = zzapz.zzb(zzadvVar);
            int i5 = zzapxVarZzb.zza;
            if (i5 == 17) {
                this.zzf = new zzapt(this.zzb, this.zzc, zzapxVarZzb);
            } else if (i5 == 6) {
                this.zzf = new zzapv(this.zzb, this.zzc, zzapxVarZzb, "audio/g711-alaw", -1);
            } else if (i5 == 7) {
                this.zzf = new zzapv(this.zzb, this.zzc, zzapxVarZzb, "audio/g711-mlaw", -1);
            } else {
                int i6 = zzapxVarZzb.zze;
                if (i5 == 1) {
                    iZzl = zzgd.zzl(i6);
                    i = iZzl;
                    if (i == 0) {
                        throw zzch.zzc("Unsupported WAV format type: " + i5);
                    }
                    this.zzf = new zzapv(this.zzb, this.zzc, zzapxVarZzb, "audio/raw", i);
                } else {
                    if (i5 == 3) {
                        if (i6 == 32) {
                            i = iZzl;
                        }
                        if (i == 0) {
                        }
                    }
                    i = 0;
                    if (i == 0) {
                    }
                }
            }
            this.zzd = 3;
            return 0;
        }
        if (i3 != 3) {
            zzeq.zzf(this.zzh != -1);
            long jZzf = this.zzh - zzadvVar.zzf();
            zzapu zzapuVar = this.zzf;
            zzapuVar.getClass();
            return zzapuVar.zzc(zzadvVar, jZzf) ? -1 : 0;
        }
        Pair pairZza = zzapz.zza(zzadvVar);
        this.zzg = ((Long) pairZza.first).intValue();
        long jLongValue = ((Long) pairZza.second).longValue();
        long j = this.zze;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        long j2 = this.zzg + jLongValue;
        this.zzh = j2;
        long jZzd = zzadvVar.zzd();
        if (jZzd != -1 && j2 > jZzd) {
            zzfk.zzf("WavExtractor", "Data exceeds input length: " + j2 + ", " + jZzd);
            this.zzh = jZzd;
            j2 = jZzd;
        }
        zzapu zzapuVar2 = this.zzf;
        zzapuVar2.getClass();
        zzapuVar2.zza(this.zzg, j2);
        this.zzd = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzb = zzadxVar;
        this.zzc = zzadxVar.zzw(0, 1);
        zzadxVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        this.zzd = j == 0 ? 0 : 4;
        zzapu zzapuVar = this.zzf;
        if (zzapuVar != null) {
            zzapuVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        return zzapz.zzc(zzadvVar);
    }
}
