package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzblv implements zzblp {
    private final Context zza;
    private final Map zzb;

    public zzblv(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzblp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Object obj, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        char c;
        if (com.google.android.gms.ads.internal.zzu.zzn().zzp(this.zza)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    c = (iHashCode == 94407 && str.equals("_ai")) ? (char) 1 : (char) 65535;
                } else if (str.equals("_ac")) {
                    c = 0;
                }
            } else if (str.equals("_aa")) {
                c = 2;
            }
            if (c == 0) {
                com.google.android.gms.ads.internal.zzu.zzn().zzj(this.zza, str2, (Map) this.zzb.get("_ac"));
                return;
            }
            if (c == 1) {
                com.google.android.gms.ads.internal.zzu.zzn().zzk(this.zza, str2, (Map) this.zzb.get("_ai"));
            } else if (c != 2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("logScionEvent gmsg contained unsupported eventName");
            } else {
                com.google.android.gms.ads.internal.zzu.zzn().zzh(this.zza, str2);
            }
        }
    }
}
