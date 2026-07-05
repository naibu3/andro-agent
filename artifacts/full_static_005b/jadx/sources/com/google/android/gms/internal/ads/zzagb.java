package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzagb extends zzagg {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzagb(zzafa zzafaVar) {
        super(zzafaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    protected final boolean zza(zzfu zzfuVar) throws zzagf {
        if (this.zzc) {
            zzfuVar.zzL(1);
        } else {
            int iZzm = zzfuVar.zzm();
            int i = iZzm >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(iZzm >> 2) & 3];
                zzal zzalVar = new zzal();
                zzalVar.zzX("audio/mpeg");
                zzalVar.zzy(1);
                zzalVar.zzY(i2);
                this.zza.zzl(zzalVar.zzad());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzal zzalVar2 = new zzal();
                zzalVar2.zzX(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzalVar2.zzy(1);
                zzalVar2.zzY(8000);
                this.zza.zzl(zzalVar2.zzad());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzagf("Audio format not supported: " + i);
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    protected final boolean zzb(zzfu zzfuVar, long j) throws zzch {
        if (this.zze == 2) {
            int iZzb = zzfuVar.zzb();
            this.zza.zzq(zzfuVar, iZzb);
            this.zza.zzs(j, 1, iZzb, 0, null);
            return true;
        }
        int iZzm = zzfuVar.zzm();
        if (iZzm != 0 || this.zzd) {
            if (this.zze == 10 && iZzm != 1) {
                return false;
            }
            int iZzb2 = zzfuVar.zzb();
            this.zza.zzq(zzfuVar, iZzb2);
            this.zza.zzs(j, 1, iZzb2, 0, null);
            return true;
        }
        int iZzb3 = zzfuVar.zzb();
        byte[] bArr = new byte[iZzb3];
        zzfuVar.zzG(bArr, 0, iZzb3);
        zzacp zzacpVarZza = zzacq.zza(bArr);
        zzal zzalVar = new zzal();
        zzalVar.zzX("audio/mp4a-latm");
        zzalVar.zzz(zzacpVarZza.zzc);
        zzalVar.zzy(zzacpVarZza.zzb);
        zzalVar.zzY(zzacpVarZza.zza);
        zzalVar.zzL(Collections.singletonList(bArr));
        this.zza.zzl(zzalVar.zzad());
        this.zzd = true;
        return false;
    }
}
