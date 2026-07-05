package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfbh {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzexw zza(zzfal zzfalVar, zzevw zzevwVar, ScheduledExecutorService scheduledExecutorService, int i) {
        if (i == 0) {
            zzfalVar = zzevwVar;
        }
        return new zzewe(zzfalVar, 0L, scheduledExecutorService);
    }

    public static zzexw zzb(zzfav zzfavVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzewe(zzfavVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzee)).longValue(), scheduledExecutorService);
    }

    public static zzexw zzc(zzfbq zzfbqVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzewe(zzfbqVar, 0L, scheduledExecutorService);
    }
}
