package u0;

import j0.AbstractC0150d;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final B0.h f2566a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2567b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2568c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2569d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2570e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2571f;

    /* renamed from: g, reason: collision with root package name */
    public final w f2572g;
    public final u h;

    /* renamed from: i, reason: collision with root package name */
    public final u f2573i;

    /* renamed from: j, reason: collision with root package name */
    public final u f2574j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2575k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2576l;

    /* renamed from: m, reason: collision with root package name */
    public final M.v f2577m;

    public u(B0.h hVar, r rVar, String str, int i2, j jVar, k kVar, w wVar, u uVar, u uVar2, u uVar3, long j2, long j3, M.v vVar) {
        AbstractC0150d.e(hVar, "request");
        AbstractC0150d.e(rVar, "protocol");
        AbstractC0150d.e(str, "message");
        this.f2566a = hVar;
        this.f2567b = rVar;
        this.f2568c = str;
        this.f2569d = i2;
        this.f2570e = jVar;
        this.f2571f = kVar;
        this.f2572g = wVar;
        this.h = uVar;
        this.f2573i = uVar2;
        this.f2574j = uVar3;
        this.f2575k = j2;
        this.f2576l = j3;
        this.f2577m = vVar;
    }

    public static String f(String str, u uVar) {
        uVar.getClass();
        String strA = uVar.f2571f.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.f2572g;
        if (wVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        wVar.close();
    }

    public final boolean h() {
        int i2 = this.f2569d;
        return 200 <= i2 && i2 < 300;
    }

    public final t i() {
        t tVar = new t();
        tVar.f2554a = this.f2566a;
        tVar.f2555b = this.f2567b;
        tVar.f2556c = this.f2569d;
        tVar.f2557d = this.f2568c;
        tVar.f2558e = this.f2570e;
        tVar.f2559f = this.f2571f.c();
        tVar.f2560g = this.f2572g;
        tVar.h = this.h;
        tVar.f2561i = this.f2573i;
        tVar.f2562j = this.f2574j;
        tVar.f2563k = this.f2575k;
        tVar.f2564l = this.f2576l;
        tVar.f2565m = this.f2577m;
        return tVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2567b + ", code=" + this.f2569d + ", message=" + this.f2568c + ", url=" + ((m) this.f2566a.f118b) + '}';
    }
}
