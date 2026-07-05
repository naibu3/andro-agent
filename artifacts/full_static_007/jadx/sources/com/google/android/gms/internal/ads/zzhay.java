package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhay {
    static final zzhay zza = new zzhay(true);
    private static volatile boolean zzb = false;
    private static volatile zzhay zzc;
    private final Map zzd;

    zzhay() {
        this.zzd = new HashMap();
    }

    public static zzhay zza() {
        return zza;
    }

    public final zzhbm zzc(zzhde zzhdeVar, int i) {
        return (zzhbm) this.zzd.get(new zzhax(zzhdeVar, i));
    }

    zzhay(boolean z) {
        this.zzd = Collections.emptyMap();
    }

    public static zzhay zzb() {
        zzhay zzhayVar = zzc;
        if (zzhayVar != null) {
            return zzhayVar;
        }
        synchronized (zzhay.class) {
            zzhay zzhayVar2 = zzc;
            if (zzhayVar2 != null) {
                return zzhayVar2;
            }
            zzhay zzhayVarZzb = zzhbg.zzb(zzhay.class);
            zzc = zzhayVarZzb;
            return zzhayVarZzb;
        }
    }
}
