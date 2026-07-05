package androidx.lifecycle;

import a.C0038e;
import a0.C0049c;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import b0.AbstractC0094t;
import b0.C0092r;
import j0.AbstractC0150d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1152f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1153a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1154b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1155c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1156d;

    /* renamed from: e, reason: collision with root package name */
    public final U.d f1157e;

    public E(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1153a = linkedHashMap;
        this.f1154b = new LinkedHashMap();
        this.f1155c = new LinkedHashMap();
        this.f1156d = new LinkedHashMap();
        this.f1157e = new C0038e(1, this);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(E e2) {
        AbstractC0150d.e(e2, "this$0");
        LinkedHashMap linkedHashMap = e2.f1154b;
        AbstractC0150d.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        Iterator it = (size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap) : AbstractC0094t.F(linkedHashMap) : C0092r.f1235a).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap2 = e2.f1153a;
            int i2 = 0;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap2.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap2.get(str));
                }
                C0049c[] c0049cArr = {new C0049c("keys", arrayList), new C0049c("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i2 < 2) {
                    C0049c c0049c = c0049cArr[i2];
                    String str2 = (String) c0049c.f786a;
                    Object obj = c0049c.f787b;
                    if (obj == null) {
                        bundle.putString(str2, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str2, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str2, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        AbstractC0150d.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        bundle.putSize(str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        bundle.putSizeF(str2, (SizeF) obj);
                    }
                    i2++;
                }
                return bundle;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            Bundle bundleA = ((U.d) entry.getValue()).a();
            AbstractC0150d.e(str3, "key");
            if (bundleA != null) {
                Class[] clsArr = f1152f;
                while (i2 < 29) {
                    Class cls = clsArr[i2];
                    AbstractC0150d.b(cls);
                    if (!cls.isInstance(bundleA)) {
                        i2++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
            }
            e2.f1155c.get(str3);
            linkedHashMap2.put(str3, bundleA);
            r0.a aVar = (r0.a) e2.f1156d.get(str3);
            if (aVar != null) {
                ((r0.b) aVar).a(bundleA);
            }
        }
    }

    public E() {
        this.f1153a = new LinkedHashMap();
        this.f1154b = new LinkedHashMap();
        this.f1155c = new LinkedHashMap();
        this.f1156d = new LinkedHashMap();
        this.f1157e = new C0038e(1, this);
    }
}
