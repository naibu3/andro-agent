package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfoi {
    private boolean zza;

    final void zza(Context context) {
        zzfqd.zzc(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfpm.zzb().zzd(context);
        zzfpd.zza().zzd(context);
        zzfpx.zzb(context);
        zzfpy.zzd(context);
        zzfqb.zza(context);
        zzfpj.zzb().zzc(context);
        zzfpc.zza().zzd(context);
    }

    final boolean zzb() {
        return this.zza;
    }
}
