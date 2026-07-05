package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
class zzfzr implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfzs zzc;

    zzfzr(zzfzs zzfzsVar) {
        this.zzc = zzfzsVar;
        this.zzb = zzfzsVar.zzb;
        Collection collection = zzfzsVar.zzb;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    zzfzr(zzfzs zzfzsVar, Iterator it) {
        this.zzc = zzfzsVar;
        this.zzb = zzfzsVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzfzv zzfzvVar = this.zzc.zze;
        zzfzvVar.zzb--;
        this.zzc.zzc();
    }

    final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
