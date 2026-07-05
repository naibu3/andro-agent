package y0;

import B0.z;
import C0.o;
import M.v;
import b0.AbstractC0088n;
import j0.AbstractC0150d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.conscrypt.BuildConfig;
import u0.q;
import u0.u;

/* loaded from: classes.dex */
public final class h implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final q f2885a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.h f2886b;

    /* renamed from: c, reason: collision with root package name */
    public final l f2887c;

    /* renamed from: d, reason: collision with root package name */
    public final z f2888d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2889e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2890f;

    /* renamed from: g, reason: collision with root package name */
    public e f2891g;
    public k h;

    /* renamed from: i, reason: collision with root package name */
    public v f2892i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2893j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2894k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2895l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f2896m;

    /* renamed from: n, reason: collision with root package name */
    public volatile v f2897n;

    /* renamed from: o, reason: collision with root package name */
    public volatile k f2898o;

    public h(q qVar, B0.h hVar) {
        AbstractC0150d.e(qVar, "client");
        this.f2885a = qVar;
        this.f2886b = hVar;
        this.f2887c = (l) qVar.f2520b.f8b;
        qVar.f2523e.getClass();
        z zVar = new z(2, this);
        zVar.g(0, TimeUnit.MILLISECONDS);
        this.f2888d = zVar;
        this.f2889e = new AtomicBoolean();
        this.f2895l = true;
    }

    public static final String a(h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(hVar.f2896m ? "canceled " : BuildConfig.FLAVOR);
        sb.append("call");
        sb.append(" to ");
        sb.append(((u0.m) hVar.f2886b.f118b).f());
        return sb.toString();
    }

    public final void b(k kVar) {
        byte[] bArr = v0.b.f2808a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = kVar;
        kVar.f2916p.add(new g(this, this.f2890f));
    }

    public final IOException c(IOException iOException) throws IOException {
        IOException interruptedIOException;
        Socket socketJ;
        byte[] bArr = v0.b.f2808a;
        k kVar = this.h;
        if (kVar != null) {
            synchronized (kVar) {
                socketJ = j();
            }
            if (this.h == null) {
                if (socketJ != null) {
                    v0.b.d(socketJ);
                }
            } else if (socketJ != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f2888d.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            AbstractC0150d.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new h(this.f2885a, this.f2886b);
    }

    public final void d() {
        Socket socket;
        if (this.f2896m) {
            return;
        }
        this.f2896m = true;
        v vVar = this.f2897n;
        if (vVar != null) {
            ((z0.d) vVar.f572c).cancel();
        }
        k kVar = this.f2898o;
        if (kVar == null || (socket = kVar.f2904c) == null) {
            return;
        }
        v0.b.d(socket);
    }

    public final void e(u0.d dVar) {
        f fVar;
        if (!this.f2889e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        o oVar = o.f236a;
        this.f2890f = o.f236a.g();
        v vVar = this.f2885a.f2519a;
        f fVar2 = new f(this, dVar);
        vVar.getClass();
        synchronized (vVar) {
            ((ArrayDeque) vVar.f571b).add(fVar2);
            String str = ((u0.m) this.f2886b.f118b).f2486d;
            Iterator it = ((ArrayDeque) vVar.f572c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) vVar.f571b).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            fVar = null;
                            break;
                        } else {
                            fVar = (f) it2.next();
                            if (AbstractC0150d.a(((u0.m) fVar.f2883c.f2886b.f118b).f2486d, str)) {
                                break;
                            }
                        }
                    }
                } else {
                    fVar = (f) it.next();
                    if (AbstractC0150d.a(((u0.m) fVar.f2883c.f2886b.f118b).f2486d, str)) {
                        break;
                    }
                }
            }
            if (fVar != null) {
                fVar2.f2882b = fVar.f2882b;
            }
        }
        vVar.h();
    }

    public final void f(boolean z2) {
        v vVar;
        synchronized (this) {
            if (!this.f2895l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (vVar = this.f2897n) != null) {
            ((z0.d) vVar.f572c).cancel();
            ((h) vVar.f570a).h(vVar, true, true, null);
        }
        this.f2892i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u g() throws Throwable {
        ArrayList arrayList = new ArrayList();
        AbstractC0088n.J(arrayList, this.f2885a.f2521c);
        arrayList.add(new z0.a(this.f2885a));
        arrayList.add(new z0.a(this.f2885a.f2527j));
        this.f2885a.getClass();
        arrayList.add(new w0.b());
        arrayList.add(a.f2855a);
        AbstractC0088n.J(arrayList, this.f2885a.f2522d);
        arrayList.add(new z0.b());
        B0.h hVar = this.f2886b;
        q qVar = this.f2885a;
        boolean z2 = false;
        try {
            u uVarB = new z0.f(this, arrayList, 0, null, hVar, qVar.f2539v, qVar.f2540w, qVar.f2541x).b(this.f2886b);
            if (this.f2896m) {
                v0.b.c(uVarB);
                throw new IOException("Canceled");
            }
            i(null);
            return uVarB;
        } catch (IOException e2) {
            try {
                IOException iOExceptionI = i(e2);
                if (iOExceptionI == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionI;
            } catch (Throwable th) {
                th = th;
                z2 = true;
                if (!z2) {
                    i(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z2) {
            }
            throw th;
        }
    }

    public final IOException h(v vVar, boolean z2, boolean z3, IOException iOException) {
        boolean z4;
        boolean z5;
        AbstractC0150d.e(vVar, "exchange");
        if (!vVar.equals(this.f2897n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f2893j) {
                        if (z3 || !this.f2894k) {
                            z5 = false;
                        }
                    }
                    if (z2) {
                        this.f2893j = false;
                    }
                    if (z3) {
                        this.f2894k = false;
                    }
                    boolean z6 = this.f2893j;
                    boolean z7 = (z6 || this.f2894k) ? false : true;
                    if (!z6 && !this.f2894k) {
                        if (!this.f2895l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z3) {
                }
                z5 = false;
            }
        }
        if (z4) {
            this.f2897n = null;
            k kVar = this.h;
            if (kVar != null) {
                synchronized (kVar) {
                    kVar.f2913m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException i(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f2895l) {
                this.f2895l = false;
                if (!this.f2893j) {
                    if (!this.f2894k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket j() {
        k kVar = this.h;
        AbstractC0150d.b(kVar);
        byte[] bArr = v0.b.f2808a;
        ArrayList arrayList = kVar.f2916p;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (AbstractC0150d.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i2);
        this.h = null;
        if (arrayList.isEmpty()) {
            kVar.f2917q = System.nanoTime();
            l lVar = this.f2887c;
            lVar.getClass();
            byte[] bArr2 = v0.b.f2808a;
            boolean z2 = kVar.f2910j;
            x0.b bVar = lVar.f2919b;
            if (z2) {
                kVar.f2910j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = lVar.f2921d;
                concurrentLinkedQueue.remove(kVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    bVar.a();
                }
                Socket socket = kVar.f2905d;
                AbstractC0150d.b(socket);
                return socket;
            }
            bVar.c(lVar.f2920c, 0L);
        }
        return null;
    }
}
