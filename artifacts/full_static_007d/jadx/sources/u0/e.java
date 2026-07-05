package u0;

import b0.AbstractC0094t;
import b0.C0093s;
import j0.AbstractC0150d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f2430c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f2431a;

    /* renamed from: b, reason: collision with root package name */
    public final C0.f f2432b;

    static {
        ArrayList arrayList = new ArrayList();
        Set setSingleton = C0093s.f1236a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                setSingleton = new LinkedHashSet(AbstractC0094t.D(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    setSingleton.add(it.next());
                }
            } else {
                setSingleton = Collections.singleton(arrayList.get(0));
                AbstractC0150d.d(setSingleton, "singleton(...)");
            }
        }
        f2430c = new e(setSingleton, null);
    }

    public e(Set set, C0.f fVar) {
        this.f2431a = set;
        this.f2432b = fVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (AbstractC0150d.a(eVar.f2431a, this.f2431a) && AbstractC0150d.a(eVar.f2432b, this.f2432b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f2431a.hashCode() + 1517) * 41;
        C0.f fVar = this.f2432b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }
}
