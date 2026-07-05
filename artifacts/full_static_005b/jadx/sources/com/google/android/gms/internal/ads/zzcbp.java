package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcbp {
    public final ListenableFuture zza(Context context, int i) {
        zzccn zzccnVar = new zzccn();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzu(context)) {
            zzcci.zza.execute(new zzcbo(this, context, zzccnVar));
        }
        return zzccnVar;
    }
}
