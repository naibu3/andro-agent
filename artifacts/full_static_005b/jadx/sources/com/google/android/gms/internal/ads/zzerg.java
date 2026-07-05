package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzerg {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzerf zzb;

    final zzerf zza() {
        return this.zzb;
    }

    final void zzb(zzerf zzerfVar) {
        this.zzb = zzerfVar;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
