package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaob implements zzaoc {
    private final List zza;
    private final zzafa[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzaob(List list) {
        this.zza = list;
        this.zzb = new zzafa[list.size()];
    }

    private final boolean zzf(zzfu zzfuVar, int i) {
        if (zzfuVar.zzb() == 0) {
            return false;
        }
        if (zzfuVar.zzm() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zza(zzfu zzfuVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzfuVar, 32)) {
                if (this.zzd != 1 || zzf(zzfuVar, 0)) {
                    int iZzd = zzfuVar.zzd();
                    int iZzb = zzfuVar.zzb();
                    for (zzafa zzafaVar : this.zzb) {
                        zzfuVar.zzK(iZzd);
                        zzafaVar.zzq(zzfuVar, iZzb);
                    }
                    this.zze += iZzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzapl zzaplVar = (zzapl) this.zza.get(i);
            zzapoVar.zzc();
            zzafa zzafaVarZzw = zzadxVar.zzw(zzapoVar.zza(), 3);
            zzal zzalVar = new zzal();
            zzalVar.zzK(zzapoVar.zzb());
            zzalVar.zzX("application/dvbsubs");
            zzalVar.zzL(Collections.singletonList(zzaplVar.zzb));
            zzalVar.zzO(zzaplVar.zza);
            zzafaVarZzw.zzl(zzalVar.zzad());
            this.zzb[i] = zzafaVarZzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
        if (this.zzc) {
            zzeq.zzf(this.zzf != -9223372036854775807L);
            for (zzafa zzafaVar : this.zzb) {
                zzafaVar.zzs(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = j;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
