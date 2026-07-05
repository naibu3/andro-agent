package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzadf {
    public static void zza(long j, zzfu zzfuVar, zzafa[] zzafaVarArr) {
        int iZzg;
        while (true) {
            if (zzfuVar.zzb() <= 1) {
                return;
            }
            int iZzc = zzc(zzfuVar);
            int iZzc2 = zzc(zzfuVar);
            int iZzd = zzfuVar.zzd() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzfuVar.zzb()) {
                zzfk.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzd = zzfuVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzm = zzfuVar.zzm();
                int iZzq = zzfuVar.zzq();
                if (iZzq == 49) {
                    iZzg = zzfuVar.zzg();
                    iZzq = 49;
                } else {
                    iZzg = 0;
                }
                int iZzm2 = zzfuVar.zzm();
                if (iZzq == 47) {
                    zzfuVar.zzL(1);
                    iZzq = 47;
                }
                boolean z = iZzm == 181 && (iZzq == 49 || iZzq == 47) && iZzm2 == 3;
                if (iZzq == 49) {
                    z &= iZzg == 1195456820;
                }
                if (z) {
                    zzb(j, zzfuVar, zzafaVarArr);
                }
            }
            zzfuVar.zzK(iZzd);
        }
    }

    public static void zzb(long j, zzfu zzfuVar, zzafa[] zzafaVarArr) {
        int iZzm = zzfuVar.zzm();
        if ((iZzm & 64) != 0) {
            int i = iZzm & 31;
            zzfuVar.zzL(1);
            int iZzd = zzfuVar.zzd();
            for (zzafa zzafaVar : zzafaVarArr) {
                int i2 = i * 3;
                zzfuVar.zzK(iZzd);
                zzafaVar.zzq(zzfuVar, i2);
                zzeq.zzf(j != -9223372036854775807L);
                zzafaVar.zzs(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(zzfu zzfuVar) {
        int i = 0;
        while (zzfuVar.zzb() != 0) {
            int iZzm = zzfuVar.zzm();
            i += iZzm;
            if (iZzm != 255) {
                return i;
            }
        }
        return -1;
    }
}
