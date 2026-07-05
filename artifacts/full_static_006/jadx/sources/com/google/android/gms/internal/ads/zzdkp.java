package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzdkp implements zzblp {
    private final WeakReference zza;

    /* synthetic */ zzdkp(zzdkq zzdkqVar, zzdko zzdkoVar) {
        this.zza = new WeakReference(zzdkqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        zzdkq zzdkqVar = (zzdkq) this.zza.get();
        if (zzdkqVar == null) {
            return;
        }
        zzdkqVar.zzg.zza();
    }
}
