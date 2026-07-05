package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfis implements zzhkp {
    private final zzfir zza;

    public zzfis(zzfir zzfirVar) {
        this.zza = zzfirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzhkx.zzb(defaultClock);
        return defaultClock;
    }
}
