package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgak extends AbstractCollection {
    final /* synthetic */ zzgal zza;

    zzgak(zzgal zzgalVar) {
        this.zza = zzgalVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzgal zzgalVar = this.zza;
        Map mapZzl = zzgalVar.zzl();
        return mapZzl != null ? mapZzl.values().iterator() : new zzgae(zzgalVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
