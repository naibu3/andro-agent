package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzanu implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzant
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzanu()};
        }
    };
    private final zzanv zzb = new zzanv(null, 0);
    private final zzfu zzc = new zzfu(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        int iZza = zzadvVar.zza(this.zzc.zzM(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        this.zzc.zzK(0);
        this.zzc.zzJ(iZza);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzb.zzb(zzadxVar, new zzapo(Integer.MIN_VALUE, 0, 1));
        zzadxVar.zzD();
        zzadxVar.zzO(new zzaes(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        zzadi zzadiVar;
        int i;
        zzfu zzfuVar = new zzfu(10);
        int i2 = 0;
        while (true) {
            zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(zzfuVar.zzM(), 0, 10, false);
            zzfuVar.zzK(0);
            if (zzfuVar.zzo() != 4801587) {
                break;
            }
            zzfuVar.zzL(3);
            int iZzl = zzfuVar.zzl();
            i2 += iZzl + 10;
            zzadiVar.zzl(iZzl, false);
        }
        zzadvVar.zzj();
        zzadiVar.zzl(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzadiVar.zzm(zzfuVar.zzM(), 0, 7, false);
            zzfuVar.zzK(0);
            int iZzq = zzfuVar.zzq();
            if (iZzq == 44096 || iZzq == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArrZzM = zzfuVar.zzM();
                int i6 = zzacw.zza;
                if (bArrZzM.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((bArrZzM[2] & 255) << 8) | (bArrZzM[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((bArrZzM[4] & 255) << 16) | ((bArrZzM[5] & 255) << 8) | (bArrZzM[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iZzq == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzadiVar.zzl(i - 7, false);
            } else {
                zzadvVar.zzj();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzadiVar.zzl(i4, false);
                i3 = 0;
            }
        }
    }
}
