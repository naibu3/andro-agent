package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzafx implements zzadd {
    private final zzaeg zza;
    private final int zzb;
    private final zzaeb zzc = new zzaeb();

    /* synthetic */ zzafx(zzaeg zzaegVar, int i, zzafw zzafwVar) {
        this.zza = zzaegVar;
        this.zzb = i;
    }

    private final long zzc(zzadv zzadvVar) throws IOException {
        while (zzadvVar.zze() < zzadvVar.zzd() - 6) {
            zzaeg zzaegVar = this.zza;
            int i = this.zzb;
            zzaeb zzaebVar = this.zzc;
            long jZze = zzadvVar.zze();
            byte[] bArr = new byte[2];
            zzadi zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzadvVar.zzj();
                zzadiVar.zzl((int) (jZze - zzadvVar.zzf()), false);
            } else {
                zzfu zzfuVar = new zzfu(16);
                System.arraycopy(bArr, 0, zzfuVar.zzM(), 0, 2);
                zzfuVar.zzJ(zzady.zza(zzadvVar, zzfuVar.zzM(), 2, 14));
                zzadvVar.zzj();
                zzadiVar.zzl((int) (jZze - zzadvVar.zzf()), false);
                if (zzaec.zzc(zzfuVar, zzaegVar, i, zzaebVar)) {
                    break;
                }
            }
            zzadiVar.zzl(1, false);
        }
        if (zzadvVar.zze() < zzadvVar.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzadi) zzadvVar).zzl((int) (zzadvVar.zzd() - zzadvVar.zze()), false);
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final zzadc zza(zzadv zzadvVar, long j) throws IOException {
        int i = this.zza.zzc;
        long jZzf = zzadvVar.zzf();
        long jZzc = zzc(zzadvVar);
        long jZze = zzadvVar.zze();
        ((zzadi) zzadvVar).zzl(Math.max(6, i), false);
        long jZzc2 = zzc(zzadvVar);
        return (jZzc > j || jZzc2 <= j) ? jZzc2 <= j ? zzadc.zzf(jZzc2, zzadvVar.zze()) : zzadc.zzd(jZzc, jZzf) : zzadc.zze(jZze);
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final /* synthetic */ void zzb() {
    }
}
