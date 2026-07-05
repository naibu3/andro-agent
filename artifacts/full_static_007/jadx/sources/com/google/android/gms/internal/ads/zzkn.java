package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzkn {
    public static zzpj zza(Context context, zzkw zzkwVar, boolean z, String str) {
        zzpf zzpfVarZzb = zzpf.zzb(context);
        if (zzpfVarZzb == null) {
            zzfk.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzpj(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z) {
            zzkwVar.zzz(zzpfVarZzb);
        }
        return new zzpj(zzpfVarZzb.zza(), str);
    }
}
