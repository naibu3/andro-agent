package M;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f549a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f550b;

    /* renamed from: c, reason: collision with root package name */
    public u f551c;

    /* renamed from: d, reason: collision with root package name */
    public u f552d;

    /* renamed from: e, reason: collision with root package name */
    public int f553e;

    /* renamed from: f, reason: collision with root package name */
    public int f554f;

    public q(u uVar) {
        this.f550b = uVar;
        this.f551c = uVar;
    }

    public final void a() {
        this.f549a = 1;
        this.f551c = this.f550b;
        this.f554f = 0;
    }

    public final boolean b() {
        N.a aVarC = this.f551c.f569b.c();
        int iA = aVarC.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarC.f319d).get(iA + aVarC.f316a) == 0) || this.f553e == 65039;
    }
}
