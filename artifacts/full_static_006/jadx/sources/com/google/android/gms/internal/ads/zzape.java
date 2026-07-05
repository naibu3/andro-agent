package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzape implements zzadd {
    private final zzgb zza;
    private final zzfu zzb = new zzfu();
    private final int zzc;

    public zzape(int i, zzgb zzgbVar, int i2) {
        this.zzc = i;
        this.zza = zzgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final zzadc zza(zzadv zzadvVar, long j) throws IOException {
        int iZza;
        int iZza2;
        long jZzf = zzadvVar.zzf();
        int iMin = (int) Math.min(112800L, zzadvVar.zzd() - jZzf);
        this.zzb.zzH(iMin);
        ((zzadi) zzadvVar).zzm(this.zzb.zzM(), 0, iMin, false);
        zzfu zzfuVar = this.zzb;
        int iZze = zzfuVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzfuVar.zzb() >= 188 && (iZza2 = (iZza = zzapq.zza(zzfuVar.zzM(), zzfuVar.zzd(), iZze)) + 188) <= iZze) {
            long jZzb = zzapq.zzb(zzfuVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZzb2 = this.zza.zzb(jZzb);
                if (jZzb2 <= j) {
                    j4 = iZza;
                    if (100000 + jZzb2 <= j) {
                        j3 = jZzb2;
                    }
                } else if (j3 == -9223372036854775807L) {
                    return zzadc.zzd(jZzb2, jZzf);
                }
                return zzadc.zze(jZzf + j4);
            }
            zzfuVar.zzK(iZza2);
            j2 = iZza2;
        }
        return j3 != -9223372036854775807L ? zzadc.zzf(j3, jZzf + j2) : zzadc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final void zzb() {
        byte[] bArr = zzgd.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
    }
}
