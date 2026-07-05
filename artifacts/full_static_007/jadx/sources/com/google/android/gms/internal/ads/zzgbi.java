package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgbi {
    public static Object zza(Iterable iterable, Object obj) {
        zzgcx zzgcxVar = new zzgcx((zzgcy) iterable);
        return zzgcxVar.hasNext() ? zzgcxVar.next() : obj;
    }

    public static boolean zzb(Iterable iterable, zzfyh zzfyhVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfyhVar.getClass();
            return zzd((List) iterable, zzfyhVar);
        }
        Iterator it = iterable.iterator();
        zzfyhVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzfyhVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzc(List list, zzfyh zzfyhVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfyhVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    private static boolean zzd(List list, zzfyh zzfyhVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfyhVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzfyhVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzfyhVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
