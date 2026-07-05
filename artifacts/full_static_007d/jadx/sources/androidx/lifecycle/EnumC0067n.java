package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0067n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0067n f1196a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0067n f1197b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0067n f1198c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0067n f1199d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0067n f1200e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0067n[] f1201f;

    static {
        EnumC0067n enumC0067n = new EnumC0067n("DESTROYED", 0);
        f1196a = enumC0067n;
        EnumC0067n enumC0067n2 = new EnumC0067n("INITIALIZED", 1);
        f1197b = enumC0067n2;
        EnumC0067n enumC0067n3 = new EnumC0067n("CREATED", 2);
        f1198c = enumC0067n3;
        EnumC0067n enumC0067n4 = new EnumC0067n("STARTED", 3);
        f1199d = enumC0067n4;
        EnumC0067n enumC0067n5 = new EnumC0067n("RESUMED", 4);
        f1200e = enumC0067n5;
        f1201f = new EnumC0067n[]{enumC0067n, enumC0067n2, enumC0067n3, enumC0067n4, enumC0067n5};
    }

    public static EnumC0067n valueOf(String str) {
        return (EnumC0067n) Enum.valueOf(EnumC0067n.class, str);
    }

    public static EnumC0067n[] values() {
        return (EnumC0067n[]) f1201f.clone();
    }
}
