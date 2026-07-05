package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
abstract class zzfzv extends zzfzy implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    protected zzfzv(Map map) {
        zzfyg.zze(map.isEmpty());
        this.zza = map;
    }

    static /* bridge */ /* synthetic */ void zzo(zzfzv zzfzvVar, Object obj) {
        Object objRemove;
        try {
            objRemove = zzfzvVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfzvVar.zzb -= size;
        }
    }

    abstract Collection zza();

    Collection zzb(Collection collection) {
        throw null;
    }

    Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgca
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    final Collection zzf() {
        return new zzfzx(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    final Iterator zzg() {
        return new zzfzf(this);
    }

    final List zzh(Object obj, List list, @CheckForNull zzfzs zzfzsVar) {
        return list instanceof RandomAccess ? new zzfzo(this, obj, list, zzfzsVar) : new zzfzu(this, obj, list, zzfzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    Map zzj() {
        throw null;
    }

    final Map zzk() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfzm(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfzp(this, (SortedMap) map) : new zzfzi(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    Set zzl() {
        throw null;
    }

    final Set zzm() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfzn(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfzq(this, (SortedMap) map) : new zzfzl(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgca
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzy, com.google.android.gms.internal.ads.zzgca
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, collectionZza);
        return true;
    }
}
