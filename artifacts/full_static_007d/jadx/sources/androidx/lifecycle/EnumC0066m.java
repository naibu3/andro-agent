package androidx.lifecycle;

import org.conscrypt.ct.CTConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0066m {
    private static final /* synthetic */ EnumC0066m[] $VALUES;
    public static final C0064k Companion;
    public static final EnumC0066m ON_ANY;
    public static final EnumC0066m ON_CREATE;
    public static final EnumC0066m ON_DESTROY;
    public static final EnumC0066m ON_PAUSE;
    public static final EnumC0066m ON_RESUME;
    public static final EnumC0066m ON_START;
    public static final EnumC0066m ON_STOP;

    static {
        EnumC0066m enumC0066m = new EnumC0066m("ON_CREATE", 0);
        ON_CREATE = enumC0066m;
        EnumC0066m enumC0066m2 = new EnumC0066m("ON_START", 1);
        ON_START = enumC0066m2;
        EnumC0066m enumC0066m3 = new EnumC0066m("ON_RESUME", 2);
        ON_RESUME = enumC0066m3;
        EnumC0066m enumC0066m4 = new EnumC0066m("ON_PAUSE", 3);
        ON_PAUSE = enumC0066m4;
        EnumC0066m enumC0066m5 = new EnumC0066m("ON_STOP", 4);
        ON_STOP = enumC0066m5;
        EnumC0066m enumC0066m6 = new EnumC0066m("ON_DESTROY", 5);
        ON_DESTROY = enumC0066m6;
        EnumC0066m enumC0066m7 = new EnumC0066m("ON_ANY", 6);
        ON_ANY = enumC0066m7;
        $VALUES = new EnumC0066m[]{enumC0066m, enumC0066m2, enumC0066m3, enumC0066m4, enumC0066m5, enumC0066m6, enumC0066m7};
        Companion = new C0064k();
    }

    public static EnumC0066m valueOf(String str) {
        return (EnumC0066m) Enum.valueOf(EnumC0066m.class, str);
    }

    public static EnumC0066m[] values() {
        return (EnumC0066m[]) $VALUES.clone();
    }

    public final EnumC0067n a() {
        switch (AbstractC0065l.f1195a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0067n.f1198c;
            case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
            case 4:
                return EnumC0067n.f1199d;
            case 5:
                return EnumC0067n.f1200e;
            case 6:
                return EnumC0067n.f1196a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
