package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0225f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C0222c f2091a;

    /* renamed from: b, reason: collision with root package name */
    public C0222c f2092b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f2093c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f2094d = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((m.C0221b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0225f)) {
            return false;
        }
        C0225f c0225f = (C0225f) obj;
        if (this.f2094d != c0225f.f2094d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0225f.iterator();
        while (true) {
            C0221b c0221b = (C0221b) it;
            if (!c0221b.hasNext()) {
                break;
            }
            C0221b c0221b2 = (C0221b) it2;
            if (!c0221b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0221b.next();
            Object next = c0221b2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C0221b c0221b = (C0221b) it;
            if (!c0221b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c0221b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0221b c0221b = new C0221b(this.f2091a, this.f2092b, 0);
        this.f2093c.put(c0221b, Boolean.FALSE);
        return c0221b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0221b c0221b = (C0221b) it;
            if (!c0221b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0221b.next()).toString());
            if (c0221b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
