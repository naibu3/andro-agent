package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public class zzhkk {
    final LinkedHashMap zza;

    zzhkk(int i) {
        this.zza = zzhkm.zzb(i);
    }

    final zzhkk zza(Object obj, zzhky zzhkyVar) {
        zzhkx.zza(obj, "key");
        zzhkx.zza(zzhkyVar, "provider");
        this.zza.put(obj, zzhkyVar);
        return this;
    }
}
