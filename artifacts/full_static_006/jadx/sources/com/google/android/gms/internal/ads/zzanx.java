package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzanx implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzanw
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzanx(0)};
        }
    };
    private final zzany zzb;
    private final zzfu zzc;
    private final zzfu zzd;
    private final zzft zze;
    private zzadx zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzanx() {
        throw null;
    }

    public zzanx(int i) {
        this.zzb = new zzany(true, null, 0);
        this.zzc = new zzfu(2048);
        this.zzh = -1L;
        zzfu zzfuVar = new zzfu(10);
        this.zzd = zzfuVar;
        byte[] bArrZzM = zzfuVar.zzM();
        this.zze = new zzft(bArrZzM, bArrZzM.length);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        zzeq.zzb(this.zzf);
        int iZza = zzadvVar.zza(this.zzc.zzM(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzO(new zzaes(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (iZza == -1) {
            return -1;
        }
        this.zzc.zzK(0);
        this.zzc.zzJ(iZza);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
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
        this.zzf = zzadxVar;
        this.zzb.zzb(zzadxVar, new zzapo(Integer.MIN_VALUE, 0, 1));
        zzadxVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        zzadi zzadiVar;
        int i = 0;
        while (true) {
            zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(this.zzd.zzM(), 0, 10, false);
            this.zzd.zzK(0);
            if (this.zzd.zzo() != 4801587) {
                break;
            }
            this.zzd.zzL(3);
            int iZzl = this.zzd.zzl();
            i += iZzl + 10;
            zzadiVar.zzl(iZzl, false);
        }
        zzadvVar.zzj();
        zzadiVar.zzl(i, false);
        if (this.zzh == -1) {
            this.zzh = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzadiVar.zzm(this.zzd.zzM(), 0, 2, false);
            this.zzd.zzK(0);
            if (zzany.zzf(this.zzd.zzq())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzadiVar.zzm(this.zzd.zzM(), 0, 4, false);
                this.zze.zzk(14);
                int iZzd = this.zze.zzd(13);
                if (iZzd <= 6) {
                    i4++;
                    zzadvVar.zzj();
                    zzadiVar.zzl(i4, false);
                } else {
                    zzadiVar.zzl(iZzd - 6, false);
                    i3 += iZzd;
                }
            } else {
                i4++;
                zzadvVar.zzj();
                zzadiVar.zzl(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }
}
