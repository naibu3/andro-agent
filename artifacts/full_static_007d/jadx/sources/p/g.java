package p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2161d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f2162e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final C0.d f2163f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2164g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2165a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f2166b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f2167c;

    static {
        C0.d eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f2163f = eVar;
        if (th != null) {
            f2162e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2164g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f2167c;
        } while (!f2163f.i(gVar, fVar, f.f2158c));
        while (fVar != null) {
            Thread thread = fVar.f2159a;
            if (thread != null) {
                fVar.f2159a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f2160b;
        }
        do {
            cVar = gVar.f2166b;
        } while (!f2163f.g(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f2152a;
            cVar.f2152a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f2152a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f2162e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof C0229a) {
            CancellationException cancellationException = ((C0229a) obj).f2150a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            ((b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f2164g) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f2165a;
        if (obj != null) {
            return false;
        }
        if (!f2163f.h(this, obj, f2161d ? new C0229a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0229a.f2148b : C0229a.f2149c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f2159a = null;
        while (true) {
            f fVar2 = this.f2167c;
            if (fVar2 == f.f2158c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f2160b;
                if (fVar2.f2159a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f2160b = fVar4;
                    if (fVar3.f2159a == null) {
                        break;
                    }
                } else if (!f2163f.i(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f2165a;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f2167c;
            f fVar2 = f.f2158c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    C0.d dVar = f2163f;
                    dVar.D(fVar3, fVar);
                    if (dVar.i(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2165a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar = this.f2167c;
                    }
                } while (fVar != fVar2);
            }
            return c(this.f2165a);
        }
        while (nanos > 0) {
            Object obj3 = this.f2165a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strC = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strC2 = A.e.c(strC, " (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strC3 = strC2 + jConvert + " " + lowerCase;
                if (z2) {
                    strC3 = A.e.c(strC3, ",");
                }
                strC2 = A.e.c(strC3, " ");
            }
            if (z2) {
                strC2 = strC2 + nanos2 + " nanoseconds ";
            }
            strC = A.e.c(strC2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(A.e.c(strC, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strC + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2165a instanceof C0229a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2165a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2165a instanceof C0229a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2165a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f2167c;
            f fVar2 = f.f2158c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    C0.d dVar = f2163f;
                    dVar.D(fVar3, fVar);
                    if (dVar.i(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2165a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f2167c;
                } while (fVar != fVar2);
            }
            return c(this.f2165a);
        }
        throw new InterruptedException();
    }
}
