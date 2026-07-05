package androidx.lifecycle;

import j0.AbstractC0150d;

/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064k {
    public static EnumC0066m a(EnumC0067n enumC0067n) {
        AbstractC0150d.e(enumC0067n, "state");
        int iOrdinal = enumC0067n.ordinal();
        if (iOrdinal == 2) {
            return EnumC0066m.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return EnumC0066m.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC0066m.ON_PAUSE;
    }

    public static EnumC0066m b(EnumC0067n enumC0067n) {
        AbstractC0150d.e(enumC0067n, "state");
        int iOrdinal = enumC0067n.ordinal();
        if (iOrdinal == 1) {
            return EnumC0066m.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC0066m.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC0066m.ON_RESUME;
    }
}
