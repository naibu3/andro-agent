package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzapz {
    public static Pair zza(zzadv zzadvVar) throws IOException {
        zzadvVar.zzj();
        zzapy zzapyVarZzd = zzd(1684108385, zzadvVar, new zzfu(8));
        ((zzadi) zzadvVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzadvVar.zzf()), Long.valueOf(zzapyVarZzd.zzb));
    }

    public static zzapx zzb(zzadv zzadvVar) throws IOException {
        byte[] bArr;
        zzfu zzfuVar = new zzfu(16);
        zzapy zzapyVarZzd = zzd(1718449184, zzadvVar, zzfuVar);
        zzeq.zzf(zzapyVarZzd.zzb >= 16);
        zzadi zzadiVar = (zzadi) zzadvVar;
        zzadiVar.zzm(zzfuVar.zzM(), 0, 16, false);
        zzfuVar.zzK(0);
        int iZzk = zzfuVar.zzk();
        int iZzk2 = zzfuVar.zzk();
        int iZzj = zzfuVar.zzj();
        int iZzj2 = zzfuVar.zzj();
        int iZzk3 = zzfuVar.zzk();
        int iZzk4 = zzfuVar.zzk();
        int i = ((int) zzapyVarZzd.zzb) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            zzadiVar.zzm(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = zzgd.zzf;
        }
        zzadiVar.zzo((int) (zzadvVar.zze() - zzadvVar.zzf()), false);
        return new zzapx(iZzk, iZzk2, iZzj, iZzj2, iZzk3, iZzk4, bArr);
    }

    public static boolean zzc(zzadv zzadvVar) throws IOException {
        zzfu zzfuVar = new zzfu(8);
        int i = zzapy.zza(zzadvVar, zzfuVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzadi) zzadvVar).zzm(zzfuVar.zzM(), 0, 4, false);
        zzfuVar.zzK(0);
        int iZzg = zzfuVar.zzg();
        if (iZzg == 1463899717) {
            return true;
        }
        zzfk.zzc("WavHeaderReader", "Unsupported form type: " + iZzg);
        return false;
    }

    private static zzapy zzd(int i, zzadv zzadvVar, zzfu zzfuVar) throws IOException {
        zzapy zzapyVarZza = zzapy.zza(zzadvVar, zzfuVar);
        while (true) {
            int i2 = zzapyVarZza.zza;
            if (i2 == i) {
                return zzapyVarZza;
            }
            zzfk.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zzapyVarZza.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = j + 9;
            }
            if (j2 > 2147483647L) {
                throw zzch.zzc("Chunk is too large (~2GB+) to skip; id: " + zzapyVarZza.zza);
            }
            ((zzadi) zzadvVar).zzo((int) j2, false);
            zzapyVarZza = zzapy.zza(zzadvVar, zzfuVar);
        }
    }
}
