package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzabm extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzabk zzd;
    private boolean zze;

    /* synthetic */ zzabm(zzabk zzabkVar, SurfaceTexture surfaceTexture, boolean z, zzabl zzablVar) {
        super(surfaceTexture);
        this.zzd = zzabkVar;
        this.zza = z;
    }

    public static zzabm zza(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzeq.zzf(z2);
        return new zzabk().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        if (!zzc) {
            zzb = zzez.zzb(context) ? zzez.zzc() ? 1 : 2 : 0;
            zzc = true;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
