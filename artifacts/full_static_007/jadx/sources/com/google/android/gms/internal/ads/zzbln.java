package com.google.android.gms.internal.ads;

import admob.plus.cordova.Generated;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbln implements zzblp {
    zzbln() {
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        if (map.keySet().contains(Generated.Actions.START)) {
            zzchdVar.zzax(true);
        }
        if (map.keySet().contains("stop")) {
            zzchdVar.zzax(false);
        }
    }
}
