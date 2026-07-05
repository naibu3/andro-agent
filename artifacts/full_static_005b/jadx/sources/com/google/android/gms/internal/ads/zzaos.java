package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaos implements zzapb {
    private zzan zza;
    private zzgb zzb;
    private zzafa zzc;

    public zzaos(String str) {
        zzal zzalVar = new zzal();
        zzalVar.zzX(str);
        this.zza = zzalVar.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zza(zzfu zzfuVar) {
        zzeq.zzb(this.zzb);
        int i = zzgd.zza;
        long jZze = this.zzb.zze();
        long jZzf = this.zzb.zzf();
        if (jZze == -9223372036854775807L || jZzf == -9223372036854775807L) {
            return;
        }
        zzan zzanVar = this.zza;
        if (jZzf != zzanVar.zzr) {
            zzal zzalVarZzb = zzanVar.zzb();
            zzalVarZzb.zzab(jZzf);
            zzan zzanVarZzad = zzalVarZzb.zzad();
            this.zza = zzanVarZzad;
            this.zzc.zzl(zzanVarZzad);
        }
        int iZzb = zzfuVar.zzb();
        this.zzc.zzq(zzfuVar, iZzb);
        this.zzc.zzs(jZze, 1, iZzb, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzb(zzgb zzgbVar, zzadx zzadxVar, zzapo zzapoVar) {
        this.zzb = zzgbVar;
        zzapoVar.zzc();
        zzafa zzafaVarZzw = zzadxVar.zzw(zzapoVar.zza(), 5);
        this.zzc = zzafaVarZzw;
        zzafaVarZzw.zzl(this.zza);
    }
}
