package n;

import j0.AbstractC0150d;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f extends k implements Map {

    /* renamed from: d, reason: collision with root package name */
    public C0226a f2107d;

    /* renamed from: e, reason: collision with root package name */
    public c f2108e;

    /* renamed from: f, reason: collision with root package name */
    public e f2109f;

    @Override // java.util.Map
    public final Set entrySet() {
        C0226a c0226a = this.f2107d;
        if (c0226a != null) {
            return c0226a;
        }
        C0226a c0226a2 = new C0226a(this);
        this.f2107d = c0226a2;
        return c0226a2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i2 = this.f2127c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i2 != this.f2127c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f2108e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f2108e = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f2127c;
        int i2 = this.f2127c;
        int[] iArr = this.f2125a;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            AbstractC0150d.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f2125a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f2126b, size * 2);
            AbstractC0150d.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f2126b = objArrCopyOf;
        }
        if (this.f2127c != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f2109f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f2109f = eVar2;
        return eVar2;
    }
}
