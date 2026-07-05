package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcox implements zzcot {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcox(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcot
    public final void zza(Map map) {
        this.zza.zzA(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
