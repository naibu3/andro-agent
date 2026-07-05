package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzblb implements zzblp {
    zzblb() {
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        try {
            zzfvg.zzj(zzchdVar.getContext()).zzk();
            zzfvh.zzi(zzchdVar.getContext()).zzj();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
