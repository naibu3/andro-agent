package H0;

import j0.AbstractC0150d;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class v {

    /* renamed from: d, reason: collision with root package name */
    public static final u f448d = new u();

    /* renamed from: a, reason: collision with root package name */
    public boolean f449a;

    /* renamed from: b, reason: collision with root package name */
    public long f450b;

    /* renamed from: c, reason: collision with root package name */
    public long f451c;

    public v a() {
        this.f449a = false;
        return this;
    }

    public v b() {
        this.f451c = 0L;
        return this;
    }

    public long c() {
        if (this.f449a) {
            return this.f450b;
        }
        throw new IllegalStateException("No deadline");
    }

    public v d(long j2) {
        this.f449a = true;
        this.f450b = j2;
        return this;
    }

    public boolean e() {
        return this.f449a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f449a && this.f450b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public v g(long j2, TimeUnit timeUnit) {
        AbstractC0150d.e(timeUnit, "unit");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(AbstractC0150d.h(Long.valueOf(j2), "timeout < 0: ").toString());
        }
        this.f451c = timeUnit.toNanos(j2);
        return this;
    }
}
