package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzapv implements zzapu {
    private final zzadx zza;
    private final zzafa zzb;
    private final zzapx zzc;
    private final zzan zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzapv(zzadx zzadxVar, zzafa zzafaVar, zzapx zzapxVar, String str, int i) throws zzch {
        this.zza = zzadxVar;
        this.zzb = zzafaVar;
        this.zzc = zzapxVar;
        int i2 = zzapxVar.zzb * zzapxVar.zze;
        int i3 = zzapxVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw zzch.zza("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = zzapxVar.zzc * i4;
        int i6 = i5 * 8;
        int iMax = Math.max(i4, i5 / 10);
        this.zze = iMax;
        zzal zzalVar = new zzal();
        zzalVar.zzX(str);
        zzalVar.zzx(i6);
        zzalVar.zzS(i6);
        zzalVar.zzP(iMax);
        zzalVar.zzy(zzapxVar.zzb);
        zzalVar.zzY(zzapxVar.zzc);
        zzalVar.zzR(i);
        this.zzd = zzalVar.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final void zza(int i, long j) {
        this.zza.zzO(new zzaqa(this.zzc, 1, i, j));
        this.zzb.zzl(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final boolean zzc(zzadv zzadvVar, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int iZza = zzaey.zza(this.zzb, zzadvVar, (int) Math.min(i2 - i, j2), true);
            if (iZza == -1) {
                j2 = 0;
            } else {
                this.zzg += iZza;
                j2 -= iZza;
            }
        }
        zzapx zzapxVar = this.zzc;
        int i3 = this.zzg;
        int i4 = zzapxVar.zzd;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jZzt = this.zzf + zzgd.zzt(this.zzh, 1000000L, zzapxVar.zzc, RoundingMode.FLOOR);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zzs(jZzt, 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
        }
        return j2 <= 0;
    }
}
