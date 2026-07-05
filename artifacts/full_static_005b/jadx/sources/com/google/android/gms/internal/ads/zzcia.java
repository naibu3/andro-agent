package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcia implements zzblp {
    final /* synthetic */ zzcic zza;

    zzcia(zzcic zzcicVar) {
        this.zza = zzcicVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzcic zzcicVar = this.zza;
                    if (zzcicVar.zzI != i) {
                        zzcicVar.zzI = i;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
