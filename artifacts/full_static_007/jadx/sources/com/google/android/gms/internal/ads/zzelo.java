package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzelo {
    private zzelf zza;

    zzelo() {
    }

    private zzelo(zzelf zzelfVar) {
        this.zza = zzelfVar;
    }

    public static zzelo zzb(zzelf zzelfVar) {
        return new zzelo(zzelfVar);
    }

    public final zzelf zza(Clock clock, zzelh zzelhVar, zzehq zzehqVar, zzfoe zzfoeVar) {
        zzelf zzelfVar = this.zza;
        return zzelfVar != null ? zzelfVar : new zzelf(clock, zzelhVar, zzehqVar, zzfoeVar);
    }
}
