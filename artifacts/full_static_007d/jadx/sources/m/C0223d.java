package m;

import java.util.Iterator;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223d extends AbstractC0224e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0222c f2088a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2089b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0225f f2090c;

    public C0223d(C0225f c0225f) {
        this.f2090c = c0225f;
    }

    @Override // m.AbstractC0224e
    public final void a(C0222c c0222c) {
        C0222c c0222c2 = this.f2088a;
        if (c0222c == c0222c2) {
            C0222c c0222c3 = c0222c2.f2087d;
            this.f2088a = c0222c3;
            this.f2089b = c0222c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2089b) {
            return this.f2090c.f2091a != null;
        }
        C0222c c0222c = this.f2088a;
        return (c0222c == null || c0222c.f2086c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2089b) {
            this.f2089b = false;
            this.f2088a = this.f2090c.f2091a;
        } else {
            C0222c c0222c = this.f2088a;
            this.f2088a = c0222c != null ? c0222c.f2086c : null;
        }
        return this.f2088a;
    }
}
