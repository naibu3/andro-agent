package j0;

import a0.C0049c;
import b0.AbstractC0084j;
import b0.AbstractC0094t;
import i0.InterfaceC0131a;
import i0.InterfaceC0132b;
import i0.k;
import i0.l;
import i0.m;
import i0.n;
import i0.o;
import i0.p;
import i0.q;
import i0.r;
import i0.s;
import i0.t;
import i0.u;
import i0.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148b implements o0.a, InterfaceC0147a {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1733b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f1734c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f1735a;

    static {
        List listAsList = Arrays.asList(InterfaceC0131a.class, l.class, q0.l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, InterfaceC0132b.class, i0.c.class, i0.d.class, i0.e.class, i0.f.class, i0.g.class, i0.h.class, i0.i.class, i0.j.class, k.class, m.class, n.class, o.class);
        AbstractC0150d.d(listAsList, "asList(...)");
        ArrayList arrayList = new ArrayList(AbstractC0084j.I(listAsList));
        int i2 = 0;
        for (Object obj : listAsList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C0049c((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f1733b = AbstractC0094t.E(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC0150d.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC0150d.b(str);
            sb.append(q0.d.N(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f1733b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f1734c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0094t.D(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), q0.d.N((String) entry2.getValue()));
        }
    }

    public C0148b(Class cls) {
        this.f1735a = cls;
    }

    @Override // j0.InterfaceC0147a
    public final Class a() {
        return this.f1735a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0148b) && C0.f.r(this).equals(C0.f.r((o0.a) obj));
    }

    public final int hashCode() {
        return C0.f.r(this).hashCode();
    }

    public final String toString() {
        return this.f1735a.toString() + " (Kotlin reflection is not available)";
    }
}
