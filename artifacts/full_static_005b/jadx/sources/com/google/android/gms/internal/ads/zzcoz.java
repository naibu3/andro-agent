package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcoz implements zzcot {
    private final zzdya zza;

    zzcoz(zzdya zzdyaVar) {
        this.zza = zzdyaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // com.google.android.gms.internal.ads.zzcot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Map map) {
        char c;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            c = (iHashCode == 109399814 && str.equals("shake")) ? (char) 0 : (char) 65535;
        } else if (str.equals("flick")) {
            c = 1;
        }
        if (c == 0) {
            this.zza.zzm(zzdxw.SHAKE);
        } else if (c != 1) {
            this.zza.zzm(zzdxw.NONE);
        } else {
            this.zza.zzm(zzdxw.FLICK);
        }
    }
}
