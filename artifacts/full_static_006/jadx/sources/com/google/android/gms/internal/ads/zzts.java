package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzts {
    public static void zza(zztk zztkVar, zzpj zzpjVar) {
        LogSessionId logSessionIdZza = zzpjVar.zza();
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zztkVar.zzb.setString("log-session-id", logSessionIdZza.getStringId());
    }
}
