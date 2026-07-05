package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgde {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static zzgdd zzb(Set set, Set set2) {
        zzfyg.zzc(set, "set1");
        zzfyg.zzc(set2, "set2");
        return new zzgcy(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzc(Set set, zzfyh zzfyhVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzgcz)) {
                set.getClass();
                return new zzgcz(set, zzfyhVar);
            }
            zzgcz zzgczVar = (zzgcz) set;
            return new zzgcz(zzgczVar.zza, zzfyk.zza(zzgczVar.zzb, zzfyhVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzgcz)) {
            sortedSet.getClass();
            return new zzgda(sortedSet, zzfyhVar);
        }
        zzgcz zzgczVar2 = (zzgcz) sortedSet;
        return new zzgda((SortedSet) zzgczVar2.zza, zzfyk.zza(zzgczVar2.zzb, zzfyhVar));
    }

    static boolean zzd(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean zzf(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean zze(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzgck) {
            collection = ((zzgck) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzf(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
