package n;

import A.m;
import j0.AbstractC0150d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f2119a;

    /* renamed from: b, reason: collision with root package name */
    public final A.f f2120b;

    /* renamed from: c, reason: collision with root package name */
    public final m f2121c;

    /* renamed from: d, reason: collision with root package name */
    public int f2122d;

    /* renamed from: e, reason: collision with root package name */
    public int f2123e;

    /* renamed from: f, reason: collision with root package name */
    public int f2124f;

    public j(int i2) {
        this.f2119a = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2120b = new A.f(27);
        this.f2121c = new m(21);
    }

    public final Object a(Object obj) {
        AbstractC0150d.e(obj, "key");
        synchronized (this.f2121c) {
            A.f fVar = this.f2120b;
            fVar.getClass();
            Object obj2 = ((LinkedHashMap) fVar.f8b).get(obj);
            if (obj2 != null) {
                this.f2123e++;
                return obj2;
            }
            this.f2124f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        Object objPut;
        AbstractC0150d.e(obj, "key");
        synchronized (this.f2121c) {
            this.f2122d++;
            A.f fVar = this.f2120b;
            fVar.getClass();
            objPut = ((LinkedHashMap) fVar.f8b).put(obj, obj2);
            if (objPut != null) {
                this.f2122d--;
            }
        }
        int i2 = this.f2119a;
        while (true) {
            synchronized (this.f2121c) {
                try {
                    if (this.f2122d < 0 || (((LinkedHashMap) this.f2120b.f8b).isEmpty() && this.f2122d != 0)) {
                        break;
                    }
                    if (this.f2122d <= i2 || ((LinkedHashMap) this.f2120b.f8b).isEmpty()) {
                        break;
                    }
                    Set setEntrySet = ((LinkedHashMap) this.f2120b.f8b).entrySet();
                    AbstractC0150d.d(setEntrySet, "map.entries");
                    Object next = null;
                    if (setEntrySet instanceof List) {
                        List list = (List) setEntrySet;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                        }
                    } else {
                        Iterator it = setEntrySet.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry != null) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        A.f fVar2 = this.f2120b;
                        fVar2.getClass();
                        AbstractC0150d.e(key, "key");
                        ((LinkedHashMap) fVar2.f8b).remove(key);
                        int i3 = this.f2122d;
                        AbstractC0150d.e(value, "value");
                        this.f2122d = i3 - 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return objPut;
    }

    public final String toString() {
        String str;
        synchronized (this.f2121c) {
            try {
                int i2 = this.f2123e;
                int i3 = this.f2124f + i2;
                str = "LruCache[maxSize=" + this.f2119a + ",hits=" + this.f2123e + ",misses=" + this.f2124f + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
