package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcur implements zzcus {
    private final Map zza;

    zzcur(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final zzehl zza(int i, String str) {
        return (zzehl) this.zza.get(str);
    }
}
