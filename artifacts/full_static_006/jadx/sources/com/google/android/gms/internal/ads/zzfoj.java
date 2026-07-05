package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzfoj {
    public static zzfoj zza(zzfok zzfokVar, zzfol zzfolVar) {
        zzfqd.zza();
        return new zzfon(zzfokVar, zzfolVar, UUID.randomUUID().toString());
    }

    public abstract void zzb(View view, zzfoq zzfoqVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
