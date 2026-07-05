package androidx.lifecycle;

import android.os.Looper;
import j0.AbstractC0150d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import l.C0216a;
import m.AbstractC0224e;
import m.C0220a;
import m.C0221b;
import m.C0222c;
import m.C0223d;

/* loaded from: classes.dex */
public final class v extends AbstractC0068o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1205a;

    /* renamed from: b, reason: collision with root package name */
    public C0220a f1206b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0067n f1207c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1208d;

    /* renamed from: e, reason: collision with root package name */
    public int f1209e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1210f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1211g;
    public final ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public final r0.b f1212i;

    public v(InterfaceC0072t interfaceC0072t) {
        new AtomicReference(null);
        this.f1205a = true;
        this.f1206b = new C0220a();
        EnumC0067n enumC0067n = EnumC0067n.f1197b;
        this.f1207c = enumC0067n;
        this.h = new ArrayList();
        this.f1208d = new WeakReference(interfaceC0072t);
        this.f1212i = new r0.b(enumC0067n);
    }

    @Override // androidx.lifecycle.AbstractC0068o
    public final void a(InterfaceC0071s interfaceC0071s) {
        r c0059f;
        InterfaceC0072t interfaceC0072t;
        ArrayList arrayList = this.h;
        int i2 = 2;
        d("addObserver");
        EnumC0067n enumC0067n = this.f1207c;
        EnumC0067n enumC0067n2 = EnumC0067n.f1196a;
        if (enumC0067n != enumC0067n2) {
            enumC0067n2 = EnumC0067n.f1197b;
        }
        u uVar = new u();
        HashMap map = w.f1213a;
        boolean z2 = interfaceC0071s instanceof r;
        boolean z3 = interfaceC0071s instanceof M.k;
        Object obj = null;
        if (z2 && z3) {
            c0059f = new C0059f((M.k) interfaceC0071s, (r) interfaceC0071s, i);
        } else if (z3) {
            c0059f = new C0059f((M.k) interfaceC0071s, obj, i);
        } else if (z2) {
            c0059f = (r) interfaceC0071s;
        } else {
            Class<?> cls = interfaceC0071s.getClass();
            if (w.b(cls) == 2) {
                Object obj2 = w.f1214b.get(cls);
                AbstractC0150d.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    w.a((Constructor) list.get(0), interfaceC0071s);
                    throw null;
                }
                int size = list.size();
                InterfaceC0061h[] interfaceC0061hArr = new InterfaceC0061h[size];
                if (size > 0) {
                    w.a((Constructor) list.get(0), interfaceC0071s);
                    throw null;
                }
                c0059f = new U.b(i2, interfaceC0061hArr);
            } else {
                c0059f = new C0059f(interfaceC0071s);
            }
        }
        uVar.f1204b = c0059f;
        uVar.f1203a = enumC0067n2;
        C0220a c0220a = this.f1206b;
        C0222c c0222cA = c0220a.a(interfaceC0071s);
        if (c0222cA != null) {
            obj = c0222cA.f2085b;
        } else {
            HashMap map2 = c0220a.f2080e;
            C0222c c0222c = new C0222c(interfaceC0071s, uVar);
            c0220a.f2094d++;
            C0222c c0222c2 = c0220a.f2092b;
            if (c0222c2 == null) {
                c0220a.f2091a = c0222c;
                c0220a.f2092b = c0222c;
            } else {
                c0222c2.f2086c = c0222c;
                c0222c.f2087d = c0222c2;
                c0220a.f2092b = c0222c;
            }
            map2.put(interfaceC0071s, c0222c);
        }
        if (((u) obj) == null && (interfaceC0072t = (InterfaceC0072t) this.f1208d.get()) != null) {
            i = (this.f1209e != 0 || this.f1210f) ? 1 : 0;
            EnumC0067n enumC0067nC = c(interfaceC0071s);
            this.f1209e++;
            while (uVar.f1203a.compareTo(enumC0067nC) < 0 && this.f1206b.f2080e.containsKey(interfaceC0071s)) {
                arrayList.add(uVar.f1203a);
                C0064k c0064k = EnumC0066m.Companion;
                EnumC0067n enumC0067n3 = uVar.f1203a;
                c0064k.getClass();
                EnumC0066m enumC0066mB = C0064k.b(enumC0067n3);
                if (enumC0066mB == null) {
                    throw new IllegalStateException("no event up from " + uVar.f1203a);
                }
                uVar.a(interfaceC0072t, enumC0066mB);
                arrayList.remove(arrayList.size() - 1);
                enumC0067nC = c(interfaceC0071s);
            }
            if (i == 0) {
                g();
            }
            this.f1209e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0068o
    public final void b(InterfaceC0071s interfaceC0071s) {
        AbstractC0150d.e(interfaceC0071s, "observer");
        d("removeObserver");
        C0220a c0220a = this.f1206b;
        C0222c c0222cA = c0220a.a(interfaceC0071s);
        if (c0222cA != null) {
            c0220a.f2094d--;
            WeakHashMap weakHashMap = c0220a.f2093c;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((AbstractC0224e) it.next()).a(c0222cA);
                }
            }
            C0222c c0222c = c0222cA.f2087d;
            if (c0222c != null) {
                c0222c.f2086c = c0222cA.f2086c;
            } else {
                c0220a.f2091a = c0222cA.f2086c;
            }
            C0222c c0222c2 = c0222cA.f2086c;
            if (c0222c2 != null) {
                c0222c2.f2087d = c0222c;
            } else {
                c0220a.f2092b = c0222c;
            }
            c0222cA.f2086c = null;
            c0222cA.f2087d = null;
        }
        c0220a.f2080e.remove(interfaceC0071s);
    }

    public final EnumC0067n c(InterfaceC0071s interfaceC0071s) {
        u uVar;
        HashMap map = this.f1206b.f2080e;
        C0222c c0222c = map.containsKey(interfaceC0071s) ? ((C0222c) map.get(interfaceC0071s)).f2087d : null;
        EnumC0067n enumC0067n = (c0222c == null || (uVar = (u) c0222c.f2085b) == null) ? null : uVar.f1203a;
        ArrayList arrayList = this.h;
        EnumC0067n enumC0067n2 = arrayList.isEmpty() ? null : (EnumC0067n) arrayList.get(arrayList.size() - 1);
        EnumC0067n enumC0067n3 = this.f1207c;
        AbstractC0150d.e(enumC0067n3, "state1");
        if (enumC0067n == null || enumC0067n.compareTo(enumC0067n3) >= 0) {
            enumC0067n = enumC0067n3;
        }
        return (enumC0067n2 == null || enumC0067n2.compareTo(enumC0067n) >= 0) ? enumC0067n : enumC0067n2;
    }

    public final void d(String str) {
        C0216a c0216a;
        if (this.f1205a) {
            if (C0216a.f2073l != null) {
                c0216a = C0216a.f2073l;
            } else {
                synchronized (C0216a.class) {
                    try {
                        if (C0216a.f2073l == null) {
                            C0216a.f2073l = new C0216a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0216a = C0216a.f2073l;
            }
            ((C0216a) c0216a.f2074k).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(A.e.d("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0066m enumC0066m) {
        AbstractC0150d.e(enumC0066m, "event");
        d("handleLifecycleEvent");
        f(enumC0066m.a());
    }

    public final void f(EnumC0067n enumC0067n) {
        EnumC0067n enumC0067n2 = this.f1207c;
        if (enumC0067n2 == enumC0067n) {
            return;
        }
        EnumC0067n enumC0067n3 = EnumC0067n.f1197b;
        EnumC0067n enumC0067n4 = EnumC0067n.f1196a;
        if (enumC0067n2 == enumC0067n3 && enumC0067n == enumC0067n4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0067n + ", but was " + this.f1207c + " in component " + this.f1208d.get()).toString());
        }
        this.f1207c = enumC0067n;
        if (this.f1210f || this.f1209e != 0) {
            this.f1211g = true;
            return;
        }
        this.f1210f = true;
        g();
        this.f1210f = false;
        if (this.f1207c == enumC0067n4) {
            this.f1206b = new C0220a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7.f1211g = false;
        r7.f1212i.a(r7.f1207c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        InterfaceC0072t interfaceC0072t = (InterfaceC0072t) this.f1208d.get();
        if (interfaceC0072t == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0220a c0220a = this.f1206b;
            if (c0220a.f2094d != 0) {
                C0222c c0222c = c0220a.f2091a;
                AbstractC0150d.b(c0222c);
                EnumC0067n enumC0067n = ((u) c0222c.f2085b).f1203a;
                C0222c c0222c2 = this.f1206b.f2092b;
                AbstractC0150d.b(c0222c2);
                EnumC0067n enumC0067n2 = ((u) c0222c2.f2085b).f1203a;
                if (enumC0067n == enumC0067n2 && this.f1207c == enumC0067n2) {
                    break;
                }
                this.f1211g = false;
                EnumC0067n enumC0067n3 = this.f1207c;
                C0222c c0222c3 = this.f1206b.f2091a;
                AbstractC0150d.b(c0222c3);
                if (enumC0067n3.compareTo(((u) c0222c3.f2085b).f1203a) < 0) {
                    C0220a c0220a2 = this.f1206b;
                    C0221b c0221b = new C0221b(c0220a2.f2092b, c0220a2.f2091a, 1);
                    c0220a2.f2093c.put(c0221b, Boolean.FALSE);
                    while (c0221b.hasNext() && !this.f1211g) {
                        Map.Entry entry = (Map.Entry) c0221b.next();
                        AbstractC0150d.d(entry, "next()");
                        InterfaceC0071s interfaceC0071s = (InterfaceC0071s) entry.getKey();
                        u uVar = (u) entry.getValue();
                        while (uVar.f1203a.compareTo(this.f1207c) > 0 && !this.f1211g && this.f1206b.f2080e.containsKey(interfaceC0071s)) {
                            C0064k c0064k = EnumC0066m.Companion;
                            EnumC0067n enumC0067n4 = uVar.f1203a;
                            c0064k.getClass();
                            EnumC0066m enumC0066mA = C0064k.a(enumC0067n4);
                            if (enumC0066mA == null) {
                                throw new IllegalStateException("no event down from " + uVar.f1203a);
                            }
                            this.h.add(enumC0066mA.a());
                            uVar.a(interfaceC0072t, enumC0066mA);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
                C0222c c0222c4 = this.f1206b.f2092b;
                if (!this.f1211g && c0222c4 != null && this.f1207c.compareTo(((u) c0222c4.f2085b).f1203a) > 0) {
                    C0220a c0220a3 = this.f1206b;
                    c0220a3.getClass();
                    C0223d c0223d = new C0223d(c0220a3);
                    c0220a3.f2093c.put(c0223d, Boolean.FALSE);
                    while (c0223d.hasNext() && !this.f1211g) {
                        Map.Entry entry2 = (Map.Entry) c0223d.next();
                        InterfaceC0071s interfaceC0071s2 = (InterfaceC0071s) entry2.getKey();
                        u uVar2 = (u) entry2.getValue();
                        while (uVar2.f1203a.compareTo(this.f1207c) < 0 && !this.f1211g && this.f1206b.f2080e.containsKey(interfaceC0071s2)) {
                            this.h.add(uVar2.f1203a);
                            C0064k c0064k2 = EnumC0066m.Companion;
                            EnumC0067n enumC0067n5 = uVar2.f1203a;
                            c0064k2.getClass();
                            EnumC0066m enumC0066mB = C0064k.b(enumC0067n5);
                            if (enumC0066mB == null) {
                                throw new IllegalStateException("no event up from " + uVar2.f1203a);
                            }
                            uVar2.a(interfaceC0072t, enumC0066mB);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
