package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgzs implements Comparator {
    zzgzs() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzhac zzhacVar = (zzhac) obj;
        zzhac zzhacVar2 = (zzhac) obj2;
        zzgzv it = zzhacVar.iterator();
        zzgzv it2 = zzhacVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzhacVar.zzd()).compareTo(Integer.valueOf(zzhacVar2.zzd()));
    }
}
