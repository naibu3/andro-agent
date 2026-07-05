package a0;

import j0.AbstractC0150d;
import java.io.Serializable;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f786a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f787b;

    public C0049c(Object obj, Object obj2) {
        this.f786a = obj;
        this.f787b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0049c)) {
            return false;
        }
        C0049c c0049c = (C0049c) obj;
        return AbstractC0150d.a(this.f786a, c0049c.f786a) && AbstractC0150d.a(this.f787b, c0049c.f787b);
    }

    public final int hashCode() {
        Object obj = this.f786a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f787b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f786a + ", " + this.f787b + ')';
    }
}
