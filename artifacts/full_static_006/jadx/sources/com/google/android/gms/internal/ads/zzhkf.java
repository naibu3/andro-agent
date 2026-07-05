package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhkf implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhkg zzb;

    zzhkf(zzhkg zzhkgVar) {
        this.zzb = zzhkgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzhkg zzhkgVar = this.zzb;
            zzhkgVar.zza.add(zzhkgVar.zzb.next());
            return next();
        }
        zzhkg zzhkgVar2 = this.zzb;
        int i = this.zza;
        this.zza = i + 1;
        return zzhkgVar2.zza.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
