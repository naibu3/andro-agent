package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzagh extends zzagg {
    private final zzfu zzb;
    private final zzfu zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzagh(zzafa zzafaVar) {
        super(zzafaVar);
        this.zzb = new zzfu(zzgr.zza);
        this.zzc = new zzfu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    protected final boolean zza(zzfu zzfuVar) throws zzagf {
        int iZzm = zzfuVar.zzm();
        int i = iZzm >> 4;
        int i2 = iZzm & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzagf("Video format not supported: " + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    protected final boolean zzb(zzfu zzfuVar, long j) throws zzch {
        int i;
        int iZzm = zzfuVar.zzm();
        long jZzh = zzfuVar.zzh();
        if (iZzm == 0) {
            if (!this.zze) {
                zzfu zzfuVar2 = new zzfu(new byte[zzfuVar.zzb()]);
                zzfuVar.zzG(zzfuVar2.zzM(), 0, zzfuVar.zzb());
                zzacx zzacxVarZza = zzacx.zza(zzfuVar2);
                this.zzd = zzacxVarZza.zzb;
                zzal zzalVar = new zzal();
                zzalVar.zzX("video/avc");
                zzalVar.zzz(zzacxVarZza.zzk);
                zzalVar.zzac(zzacxVarZza.zzc);
                zzalVar.zzI(zzacxVarZza.zzd);
                zzalVar.zzT(zzacxVarZza.zzj);
                zzalVar.zzL(zzacxVarZza.zza);
                this.zza.zzl(zzalVar.zzad());
                this.zze = true;
                return false;
            }
        } else if (iZzm == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            byte[] bArrZzM = this.zzc.zzM();
            bArrZzM[0] = 0;
            bArrZzM[1] = 0;
            bArrZzM[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzfuVar.zzb() > 0) {
                zzfuVar.zzG(this.zzc.zzM(), i3, this.zzd);
                this.zzc.zzK(0);
                zzfu zzfuVar3 = this.zzc;
                zzfu zzfuVar4 = this.zzb;
                int iZzp = zzfuVar3.zzp();
                zzfuVar4.zzK(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzfuVar, iZzp);
                i4 = i4 + 4 + iZzp;
            }
            this.zza.zzs(j + (jZzh * 1000), i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
