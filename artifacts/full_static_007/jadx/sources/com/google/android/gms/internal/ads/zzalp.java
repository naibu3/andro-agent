package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzalp {
    public static void zza(zzalq zzalqVar, zzalu zzaluVar, zzev zzevVar) {
        for (int i = 0; i < zzalqVar.zza(); i++) {
            long jZzb = zzalqVar.zzb(i);
            List listZzc = zzalqVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i == zzalqVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzalqVar.zzb(i + 1) - zzalqVar.zzb(i);
                if (jZzb2 > 0) {
                    zzevVar.zza(new zzaln(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
