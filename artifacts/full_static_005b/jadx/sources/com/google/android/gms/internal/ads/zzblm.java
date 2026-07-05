package com.google.android.gms.internal.ads;

import admob.plus.cordova.Generated;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzblm implements zzblp {
    zzblm() {
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        if (map.keySet().contains(Generated.Actions.START)) {
            zzchdVar.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            zzchdVar.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            zzchdVar.zzN().zzk();
        }
    }
}
