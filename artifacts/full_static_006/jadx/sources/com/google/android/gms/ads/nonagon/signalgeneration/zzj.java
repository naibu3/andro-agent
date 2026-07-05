package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
final class zzj extends LinkedHashMap {
    final /* synthetic */ zzk zza;

    zzj(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.zza) {
            int size = size();
            zzk zzkVar = this.zza;
            if (size <= zzkVar.zza) {
                return false;
            }
            zzkVar.zzf.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            return size() > this.zza.zza;
        }
    }
}
