package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhdo {
    private static final zzhdo zza = new zzhdo();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzhea zzb = new zzhcw();

    private zzhdo() {
    }

    public static zzhdo zza() {
        return zza;
    }

    public final zzhdz zzb(Class cls) {
        zzhcb.zzc(cls, "messageType");
        zzhdz zzhdzVarZza = (zzhdz) this.zzc.get(cls);
        if (zzhdzVarZza == null) {
            zzhdzVarZza = this.zzb.zza(cls);
            zzhcb.zzc(cls, "messageType");
            zzhdz zzhdzVar = (zzhdz) this.zzc.putIfAbsent(cls, zzhdzVarZza);
            if (zzhdzVar != null) {
                return zzhdzVar;
            }
        }
        return zzhdzVarZza;
    }
}
