package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcdy {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzD)).longValue());
    private boolean zzc = true;

    zzcdy() {
    }

    public final void zza(SurfaceTexture surfaceTexture, final zzcdj zzcdjVar) {
        if (zzcdjVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j = timestamp - this.zzb;
            if (Math.abs(j) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        zzfuv zzfuvVar = com.google.android.gms.ads.internal.util.zzt.zza;
        Objects.requireNonNull(zzcdjVar);
        zzfuvVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdx
            @Override // java.lang.Runnable
            public final void run() {
                zzcdjVar.zzk();
            }
        });
    }

    public final void zzb() {
        this.zzc = true;
    }
}
