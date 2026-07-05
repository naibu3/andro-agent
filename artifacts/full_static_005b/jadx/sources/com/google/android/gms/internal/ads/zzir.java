package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzir {
    private final Context zza;
    private final zzip zzb;

    public zzir(Context context, Handler handler, zziq zziqVar) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzip(this, handler, zziqVar);
    }
}
