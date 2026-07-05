package A0;

import java.io.IOException;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: d, reason: collision with root package name */
    public boolean f45d;

    @Override // A0.b, H0.t
    public final long b(long j2, H0.e eVar) throws IOException {
        if (this.f31b) {
            throw new IllegalStateException("closed");
        }
        if (this.f45d) {
            return -1L;
        }
        long jB = super.b(8192L, eVar);
        if (jB != -1) {
            return jB;
        }
        this.f45d = true;
        f();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f31b) {
            return;
        }
        if (!this.f45d) {
            f();
        }
        this.f31b = true;
    }
}
