package q0;

import C0.m;
import a0.C0049c;
import j0.AbstractC0150d;
import j0.AbstractC0151e;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k0.InterfaceC0215a;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC0215a {

    /* renamed from: a, reason: collision with root package name */
    public int f2222a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2223b;

    /* renamed from: c, reason: collision with root package name */
    public int f2224c;

    /* renamed from: d, reason: collision with root package name */
    public n0.c f2225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f2226e;

    public b(c cVar) {
        this.f2226e = cVar;
        cVar.getClass();
        int length = cVar.f2227a.length();
        if (length < 0) {
            throw new IllegalArgumentException(A.e.b("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f2223b = length;
        this.f2224c = length;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C0049c c0049c;
        int i2;
        int i3;
        Object next;
        C0049c c0049c2;
        Object next2;
        int i4 = this.f2224c;
        if (i4 < 0) {
            this.f2222a = 0;
            this.f2225d = null;
            return;
        }
        c cVar = this.f2226e;
        cVar.getClass();
        CharSequence charSequence = cVar.f2227a;
        if (i4 > charSequence.length()) {
            this.f2225d = new n0.c(this.f2223b, d.E(charSequence), 1);
            this.f2224c = -1;
        } else {
            AbstractC0151e abstractC0151e = cVar.f2228b;
            Integer numValueOf = Integer.valueOf(this.f2224c);
            l lVar = (l) abstractC0151e;
            switch (lVar.f2229b) {
                case 0:
                    CharSequence charSequence2 = charSequence;
                    int iIntValue = numValueOf.intValue();
                    AbstractC0150d.e(charSequence2, "$this$$receiver");
                    int I2 = d.I(charSequence2, (char[]) lVar.f2230c, iIntValue, false);
                    if (I2 >= 0) {
                        c0049c = new C0049c(Integer.valueOf(I2), 1);
                        break;
                    } else {
                        c0049c = null;
                        break;
                    }
                default:
                    CharSequence charSequence3 = charSequence;
                    int iIntValue2 = numValueOf.intValue();
                    AbstractC0150d.e(charSequence3, "$this$$receiver");
                    List list = (List) lVar.f2230c;
                    c0049c = null;
                    if (list.size() == 1) {
                        int size = list.size();
                        if (size == 0) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        if (size != 1) {
                            throw new IllegalArgumentException("List has more than one element.");
                        }
                        String str = (String) list.get(0);
                        int iH = d.H(charSequence3, str, iIntValue2, 4);
                        c0049c2 = iH < 0 ? null : new C0049c(Integer.valueOf(iH), str);
                        if (c0049c2 != null) {
                            c0049c = new C0049c(c0049c2.f786a, Integer.valueOf(((String) c0049c2.f787b).length()));
                            break;
                        }
                    } else {
                        if (iIntValue2 < 0) {
                            iIntValue2 = 0;
                        }
                        n0.c cVar2 = new n0.c(iIntValue2, charSequence3.length(), 1);
                        boolean z2 = charSequence3 instanceof String;
                        int i5 = cVar2.f2133c;
                        int i6 = cVar2.f2132b;
                        if (z2) {
                            if ((i5 > 0 && iIntValue2 <= i6) || (i5 < 0 && i6 <= iIntValue2)) {
                                while (true) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next2 = it.next();
                                            String str2 = (String) next2;
                                            if (k.y(0, iIntValue2, str2.length(), str2, (String) charSequence3, false)) {
                                            }
                                        } else {
                                            next2 = null;
                                        }
                                    }
                                    String str3 = (String) next2;
                                    if (str3 != null) {
                                        c0049c2 = new C0049c(Integer.valueOf(iIntValue2), str3);
                                    } else if (iIntValue2 != i6) {
                                        iIntValue2 += i5;
                                    }
                                }
                                if (c0049c2 != null) {
                                }
                            }
                        } else if ((i5 > 0 && iIntValue2 <= i6) || (i5 < 0 && i6 <= iIntValue2)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        String str4 = (String) next;
                                        i2 = i6;
                                        i3 = i5;
                                        if (!d.K(str4, 0, charSequence3, iIntValue2, str4.length(), false)) {
                                            i6 = i2;
                                            i5 = i3;
                                        }
                                    } else {
                                        i2 = i6;
                                        i3 = i5;
                                        next = null;
                                    }
                                }
                                String str5 = (String) next;
                                if (str5 != null) {
                                    c0049c2 = new C0049c(Integer.valueOf(iIntValue2), str5);
                                } else if (iIntValue2 != i2) {
                                    iIntValue2 += i3;
                                    i6 = i2;
                                    i5 = i3;
                                }
                            }
                            if (c0049c2 != null) {
                            }
                        }
                    }
                    break;
            }
            if (c0049c == null) {
                this.f2225d = new n0.c(this.f2223b, d.E(charSequence), 1);
                this.f2224c = -1;
            } else {
                int iIntValue3 = ((Number) c0049c.f786a).intValue();
                int iIntValue4 = ((Number) c0049c.f787b).intValue();
                this.f2225d = m.v(this.f2223b, iIntValue3);
                int i7 = iIntValue3 + iIntValue4;
                this.f2223b = i7;
                this.f2224c = i7 + (iIntValue4 == 0 ? 1 : 0);
            }
        }
        this.f2222a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2222a == -1) {
            a();
        }
        return this.f2222a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2222a == -1) {
            a();
        }
        if (this.f2222a == 0) {
            throw new NoSuchElementException();
        }
        n0.c cVar = this.f2225d;
        AbstractC0150d.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f2225d = null;
        this.f2222a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
