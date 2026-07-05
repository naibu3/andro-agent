package n;

import j0.AbstractC0150d;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f2102a;

    /* renamed from: b, reason: collision with root package name */
    public int f2103b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2104c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f2105d;

    public d(f fVar) {
        this.f2105d = fVar;
        this.f2102a = fVar.f2127c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f2104c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f2103b;
        f fVar = this.f2105d;
        return AbstractC0150d.a(key, fVar.e(i2)) && AbstractC0150d.a(entry.getValue(), fVar.h(this.f2103b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f2104c) {
            return this.f2105d.e(this.f2103b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f2104c) {
            return this.f2105d.h(this.f2103b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2103b < this.f2102a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f2104c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f2103b;
        f fVar = this.f2105d;
        Object objE = fVar.e(i2);
        Object objH = fVar.h(this.f2103b);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2103b++;
        this.f2104c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2104c) {
            throw new IllegalStateException();
        }
        this.f2105d.f(this.f2103b);
        this.f2103b--;
        this.f2102a--;
        this.f2104c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f2104c) {
            return this.f2105d.g(this.f2103b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
