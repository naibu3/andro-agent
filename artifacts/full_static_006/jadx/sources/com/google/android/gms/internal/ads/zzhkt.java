package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhkt extends zzhkl {
    private static final zzhky zza = zzhkq.zza(Collections.emptyMap());

    /* synthetic */ zzhkt(Map map, zzhkr zzhkrVar) {
        super(map);
    }

    public static zzhks zzc(int i) {
        return new zzhks(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapZzb = zzhkm.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            linkedHashMapZzb.put(entry.getKey(), ((zzhky) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapZzb);
    }
}
