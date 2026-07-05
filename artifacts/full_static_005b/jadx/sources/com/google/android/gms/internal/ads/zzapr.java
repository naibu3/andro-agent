package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzapr {
    private final List zza;
    private final zzafa[] zzb;

    public zzapr(List list) {
        this.zza = list;
        this.zzb = new zzafa[list.size()];
    }

    public final void zza(long j, zzfu zzfuVar) {
        if (zzfuVar.zzb() < 9) {
            return;
        }
        int iZzg = zzfuVar.zzg();
        int iZzg2 = zzfuVar.zzg();
        int iZzm = zzfuVar.zzm();
        if (iZzg == 434 && iZzg2 == 1195456820 && iZzm == 3) {
            zzadf.zzb(j, zzfuVar, this.zzb);
        }
    }

    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzapoVar.zzc();
            zzafa zzafaVarZzw = zzadxVar.zzw(zzapoVar.zza(), 3);
            zzan zzanVar = (zzan) this.zza.get(i);
            String str = zzanVar.zzn;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzeq.zze(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzal zzalVar = new zzal();
            zzalVar.zzK(zzapoVar.zzb());
            zzalVar.zzX(str);
            zzalVar.zzZ(zzanVar.zzf);
            zzalVar.zzO(zzanVar.zze);
            zzalVar.zzw(zzanVar.zzF);
            zzalVar.zzL(zzanVar.zzp);
            zzafaVarZzw.zzl(zzalVar.zzad());
            this.zzb[i] = zzafaVarZzw;
        }
    }
}
