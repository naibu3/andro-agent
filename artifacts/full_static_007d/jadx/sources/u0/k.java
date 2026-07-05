package u0;

import a0.C0049c;
import b0.C0075a;
import j0.AbstractC0150d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k0.InterfaceC0215a;

/* loaded from: classes.dex */
public final class k implements Iterable, InterfaceC0215a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f2474a;

    public k(String[] strArr) {
        this.f2474a = strArr;
    }

    public final String a(String str) {
        AbstractC0150d.e(str, "name");
        String[] strArr = this.f2474a;
        int length = strArr.length - 2;
        int iK = C0.m.k(length, 0, -2);
        if (iK <= length) {
            while (true) {
                int i2 = length - 2;
                if (str.equalsIgnoreCase(strArr[length])) {
                    return strArr[length + 1];
                }
                if (length == iK) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    public final String b(int i2) {
        return this.f2474a[i2 * 2];
    }

    public final A.f c() {
        A.f fVar = new A.f(29);
        ArrayList arrayList = (ArrayList) fVar.f8b;
        AbstractC0150d.e(arrayList, "<this>");
        List listAsList = Arrays.asList(this.f2474a);
        AbstractC0150d.d(listAsList, "asList(...)");
        arrayList.addAll(listAsList);
        return fVar;
    }

    public final String d(int i2) {
        return this.f2474a[(i2 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (Arrays.equals(this.f2474a, ((k) obj).f2474a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2474a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C0049c[] c0049cArr = new C0049c[size];
        for (int i2 = 0; i2 < size; i2++) {
            c0049cArr[i2] = new C0049c(b(i2), d(i2));
        }
        return new C0075a(c0049cArr);
    }

    public final int size() {
        return this.f2474a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            String strB = b(i2);
            String strD = d(i2);
            sb.append(strB);
            sb.append(": ");
            if (v0.b.p(strB)) {
                strD = "██";
            }
            sb.append(strD);
            sb.append("\n");
            i2 = i3;
        }
        String string = sb.toString();
        AbstractC0150d.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
