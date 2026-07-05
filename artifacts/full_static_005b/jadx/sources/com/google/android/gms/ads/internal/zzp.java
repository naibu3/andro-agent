package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzaxd;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
final class zzp implements Callable {
    final /* synthetic */ zzt zza;

    zzp(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzt zztVar = this.zza;
        return new zzaxd(zzaxc.zzt(zztVar.zza.afmaVersion, zztVar.zzd, false));
    }
}
