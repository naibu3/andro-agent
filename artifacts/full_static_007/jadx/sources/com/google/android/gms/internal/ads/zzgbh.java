package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzgbh<E> extends zzgax<E> implements Set<E> {

    @CheckForNull
    private transient zzgbc zza;

    zzgbh() {
    }

    static int zzh(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zzfyg.zzf(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzgbg zzj(int i) {
        return new zzgbg(i);
    }

    public static zzgbh zzl(Collection collection) {
        if ((collection instanceof zzgbh) && !(collection instanceof SortedSet)) {
            zzgbh zzgbhVar = (zzgbh) collection;
            if (!zzgbhVar.zzf()) {
                return zzgbhVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzgbh zzm(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgdf(objArr[0]) : zzgcu.zza;
    }

    public static zzgbh zzn() {
        return zzgcu.zza;
    }

    public static zzgbh zzo(Object obj) {
        return new zzgdf(obj);
    }

    public static zzgbh zzp(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzgbh zzq(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzgbh zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgbh zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzv(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgbh) && zzu() && ((zzgbh) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgde.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgde.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public zzgbc zzd() {
        zzgbc zzgbcVar = this.zza;
        if (zzgbcVar != null) {
            return zzgbcVar;
        }
        zzgbc zzgbcVarZzi = zzi();
        this.zza = zzgbcVarZzi;
        return zzgbcVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzgdi iterator();

    zzgbc zzi() {
        Object[] array = toArray();
        int i = zzgbc.zzd;
        return zzgbc.zzj(array, array.length);
    }

    boolean zzu() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgbh zzv(int i, Object... objArr) {
        if (i == 0) {
            return zzgcu.zza;
        }
        if (i == 1) {
            return new zzgdf(Objects.requireNonNull(objArr[0]));
        }
        int iZzh = zzh(i);
        Object[] objArr2 = new Object[iZzh];
        int i2 = iZzh - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            zzgcm.zza(obj, i5);
            int iHashCode = obj.hashCode();
            int iZza = zzgau.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj2.equals(obj)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new zzgdf(Objects.requireNonNull(objArr[0]));
        }
        if (zzh(i4) < iZzh / 2) {
            return zzv(i4, objArr);
        }
        if (zzw(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzgcu(objArr, i3, objArr2, i2, i4);
    }
}
