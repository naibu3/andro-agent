package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzgbc<E> extends zzgax<E> implements List<E>, RandomAccess {
    private static final zzgdj zza = new zzgba(zzgco.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzgbc() {
    }

    public static zzgaz zzi(int i) {
        return new zzgaz(i);
    }

    static zzgbc zzj(Object[] objArr, int i) {
        return i == 0 ? zzgco.zza : new zzgco(objArr, i);
    }

    public static zzgbc zzk(Collection collection) {
        if (!(collection instanceof zzgax)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgcm.zzb(array, length);
            return zzj(array, length);
        }
        zzgbc zzgbcVarZzd = ((zzgax) collection).zzd();
        if (!zzgbcVarZzd.zzf()) {
            return zzgbcVarZzd;
        }
        Object[] array2 = zzgbcVarZzd.toArray();
        return zzj(array2, array2.length);
    }

    public static zzgbc zzl(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgco.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgcm.zzb(objArr2, length);
        return zzj(objArr2, length);
    }

    public static zzgbc zzm() {
        return zzgco.zza;
    }

    public static zzgbc zzn(Object obj) {
        Object[] objArr = {obj};
        zzgcm.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zzgbc zzo(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgcm.zzb(objArr, 2);
        return zzj(objArr, 2);
    }

    public static zzgbc zzp(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgcm.zzb(objArr, 3);
        return zzj(objArr, 3);
    }

    public static zzgbc zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgcm.zzb(objArr, 5);
        return zzj(objArr, 5);
    }

    public static zzgbc zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzgcm.zzb(objArr, 6);
        return zzj(objArr, 6);
    }

    public static zzgbc zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
        zzgcm.zzb(objArr, 9);
        return zzj(objArr, 9);
    }

    public static zzgbc zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10};
        zzgcm.zzb(objArr, 10);
        return zzj(objArr, 10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzfya.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzfya.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @Deprecated
    public final zzgbc zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    /* renamed from: zze */
    public final zzgdi iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzgbc subList(int i, int i2) {
        zzfyg.zzi(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzgco.zza : new zzgbb(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzgdj listIterator(int i) {
        zzfyg.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzgba(this, i);
    }
}
