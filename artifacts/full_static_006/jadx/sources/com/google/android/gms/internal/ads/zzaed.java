package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaed {
    public static zzaef zzb(zzfu zzfuVar) {
        zzfuVar.zzL(1);
        int iZzo = zzfuVar.zzo();
        long jZzd = zzfuVar.zzd();
        long j = iZzo;
        int i = iZzo / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jZzt = zzfuVar.zzt();
            if (jZzt == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jZzt;
            jArrCopyOf2[i2] = zzfuVar.zzt();
            zzfuVar.zzL(2);
            i2++;
        }
        zzfuVar.zzL((int) ((jZzd + j) - zzfuVar.zzd()));
        return new zzaef(jArrCopyOf, jArrCopyOf2);
    }

    public static zzcd zza(zzadv zzadvVar, boolean z) throws IOException {
        zzcd zzcdVarZza = new zzael().zza(zzadvVar, z ? null : zzahq.zza);
        if (zzcdVarZza == null || zzcdVarZza.zza() == 0) {
            return null;
        }
        return zzcdVarZza;
    }
}
