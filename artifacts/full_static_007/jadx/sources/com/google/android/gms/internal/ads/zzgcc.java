package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgcc extends zzgcg {
    final /* synthetic */ Comparator zza;

    zzgcc(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    final Map zza() {
        return new TreeMap(this.zza);
    }
}
