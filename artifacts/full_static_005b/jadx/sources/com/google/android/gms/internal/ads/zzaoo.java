package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaoo implements zzaoc {
    private zzafa zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzfu zza = new zzfu(10);
    private long zzd = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zza(zzfu zzfuVar) {
        zzeq.zzb(this.zzb);
        if (this.zzc) {
            int iZzb = zzfuVar.zzb();
            int i = this.zzf;
            if (i < 10) {
                int iMin = Math.min(iZzb, 10 - i);
                System.arraycopy(zzfuVar.zzM(), zzfuVar.zzd(), this.zza.zzM(), this.zzf, iMin);
                if (this.zzf + iMin == 10) {
                    this.zza.zzK(0);
                    if (this.zza.zzm() != 73 || this.zza.zzm() != 68 || this.zza.zzm() != 51) {
                        zzfk.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    } else {
                        this.zza.zzL(3);
                        this.zze = this.zza.zzl() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZzb, this.zze - this.zzf);
            this.zzb.zzq(zzfuVar, iMin2);
            this.zzf += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        zzafa zzafaVarZzw = zzadxVar.zzw(zzapoVar.zza(), 5);
        this.zzb = zzafaVarZzw;
        zzal zzalVar = new zzal();
        zzalVar.zzK(zzapoVar.zzb());
        zzalVar.zzX("application/id3");
        zzafaVarZzw.zzl(zzalVar.zzad());
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
        int i;
        zzeq.zzb(this.zzb);
        if (this.zzc && (i = this.zze) != 0 && this.zzf == i) {
            zzeq.zzf(this.zzd != -9223372036854775807L);
            this.zzb.zzs(this.zzd, 1, this.zze, 0, null);
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzd = j;
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
