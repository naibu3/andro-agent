package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbfc {
    private final Map zza = new HashMap();
    private final zzbfe zzb;

    public zzbfc(zzbfe zzbfeVar) {
        this.zzb = zzbfeVar;
    }

    public final zzbfe zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbfb zzbfbVar) {
        this.zza.put(str, zzbfbVar);
    }

    public final void zzc(String str, String str2, long j) {
        zzbfb zzbfbVar = (zzbfb) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbfbVar != null) {
            this.zzb.zze(zzbfbVar, j, strArr);
        }
        this.zza.put(str, new zzbfb(j, null, null));
    }
}
