package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaev implements zzadu {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzadx zzf;
    private zzafa zzg;

    public zzaev(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzafa zzafaVar = this.zzg;
        zzafaVar.getClass();
        int iZza = zzaey.zza(zzafaVar, zzadvVar, 1024, true);
        if (iZza == -1) {
            this.zze = 2;
            this.zzg.zzs(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzf = zzadxVar;
        zzafa zzafaVarZzw = zzadxVar.zzw(1024, 4);
        this.zzg = zzafaVarZzw;
        zzal zzalVar = new zzal();
        zzalVar.zzX(this.zzc);
        zzafaVarZzw.zzl(zzalVar.zzad());
        this.zzf.zzD();
        this.zzf.zzO(new zzaew(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        zzeq.zzf((this.zza == -1 || this.zzb == -1) ? false : true);
        zzfu zzfuVar = new zzfu(this.zzb);
        ((zzadi) zzadvVar).zzm(zzfuVar.zzM(), 0, this.zzb, false);
        return zzfuVar.zzq() == this.zza;
    }
}
