package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzanr implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzanq
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzanr()};
        }
    };
    private final zzans zzb = new zzans(null, 0);
    private final zzfu zzc = new zzfu(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        int iZza = zzadvVar.zza(this.zzc.zzM(), 0, 2786);
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
        zzfu zzfuVar = new zzfu(10);
        int i = 0;
        while (true) {
            zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(zzfuVar.zzM(), 0, 10, false);
            zzfuVar.zzK(0);
            if (zzfuVar.zzo() != 4801587) {
                break;
            }
            zzfuVar.zzL(3);
            int iZzl = zzfuVar.zzl();
            i += iZzl + 10;
            zzadiVar.zzl(iZzl, false);
        }
        zzadvVar.zzj();
        zzadiVar.zzl(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzadiVar.zzm(zzfuVar.zzM(), 0, 6, false);
            zzfuVar.zzK(0);
            if (zzfuVar.zzq() != 2935) {
                zzadvVar.zzj();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzadiVar.zzl(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iZzb = zzact.zzb(zzfuVar.zzM());
                if (iZzb == -1) {
                    return false;
                }
                zzadiVar.zzl(iZzb - 6, false);
            }
        }
    }
}
