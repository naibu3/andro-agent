package x0;

import j0.AbstractC0150d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class d {
    public static final d h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f2847i;

    /* renamed from: a, reason: collision with root package name */
    public final c f2848a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2850c;

    /* renamed from: d, reason: collision with root package name */
    public long f2851d;

    /* renamed from: b, reason: collision with root package name */
    public int f2849b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2852e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2853f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final E.b f2854g = new E.b(11, this);

    static {
        String strH = AbstractC0150d.h(" TaskRunner", v0.b.h);
        AbstractC0150d.e(strH, "name");
        h = new d(new c(new v0.a(true, strH)));
        Logger logger = Logger.getLogger(d.class.getName());
        AbstractC0150d.d(logger, "getLogger(TaskRunner::class.java.name)");
        f2847i = logger;
    }

    public d(c cVar) {
        this.f2848a = cVar;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = v0.b.f2808a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f2836a);
        try {
            long jA = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, jA);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j2) {
        byte[] bArr = v0.b.f2808a;
        b bVar = aVar.f2838c;
        AbstractC0150d.b(bVar);
        if (bVar.f2843d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = bVar.f2845f;
        bVar.f2845f = false;
        bVar.f2843d = null;
        this.f2852e.remove(bVar);
        if (j2 != -1 && !z2 && !bVar.f2842c) {
            bVar.d(aVar, j2, true);
        }
        if (bVar.f2844e.isEmpty()) {
            return;
        }
        this.f2853f.add(bVar);
    }

    public final a c() {
        boolean z2;
        byte[] bArr = v0.b.f2808a;
        while (true) {
            ArrayList arrayList = this.f2853f;
            if (arrayList.isEmpty()) {
                return null;
            }
            c cVar = this.f2848a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                a aVar2 = (a) ((b) it.next()).f2844e.get(0);
                long jMax = Math.max(0L, aVar2.f2839d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z2 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.f2852e;
            if (aVar != null) {
                byte[] bArr2 = v0.b.f2808a;
                aVar.f2839d = -1L;
                b bVar = aVar.f2838c;
                AbstractC0150d.b(bVar);
                bVar.f2844e.remove(aVar);
                arrayList.remove(bVar);
                bVar.f2843d = aVar;
                arrayList2.add(bVar);
                if (z2 || (!this.f2850c && !arrayList.isEmpty())) {
                    E.b bVar2 = this.f2854g;
                    AbstractC0150d.e(bVar2, "runnable");
                    ((ThreadPoolExecutor) cVar.f2846a).execute(bVar2);
                }
                return aVar;
            }
            if (this.f2850c) {
                if (jMin < this.f2851d - jNanoTime) {
                    notify();
                }
                return null;
            }
            this.f2850c = true;
            this.f2851d = jNanoTime + jMin;
            try {
                try {
                    long j2 = jMin / 1000000;
                    long j3 = jMin - (1000000 * j2);
                    if (j2 > 0 || jMin > 0) {
                        wait(j2, (int) j3);
                    }
                } catch (InterruptedException unused) {
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i2 = size - 1;
                            ((b) arrayList2.get(size)).b();
                            if (i2 < 0) {
                                break;
                            }
                            size = i2;
                        }
                    }
                    int size2 = arrayList.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i3 = size2 - 1;
                            b bVar3 = (b) arrayList.get(size2);
                            bVar3.b();
                            if (bVar3.f2844e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        }
                    }
                }
                this.f2850c = false;
            } catch (Throwable th) {
                this.f2850c = false;
                throw th;
            }
        }
    }

    public final void d(b bVar) {
        AbstractC0150d.e(bVar, "taskQueue");
        byte[] bArr = v0.b.f2808a;
        if (bVar.f2843d == null) {
            boolean zIsEmpty = bVar.f2844e.isEmpty();
            ArrayList arrayList = this.f2853f;
            if (zIsEmpty) {
                arrayList.remove(bVar);
            } else {
                AbstractC0150d.e(arrayList, "<this>");
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
            }
        }
        boolean z2 = this.f2850c;
        c cVar = this.f2848a;
        if (z2) {
            notify();
            return;
        }
        E.b bVar2 = this.f2854g;
        AbstractC0150d.e(bVar2, "runnable");
        ((ThreadPoolExecutor) cVar.f2846a).execute(bVar2);
    }

    public final b e() {
        int i2;
        synchronized (this) {
            i2 = this.f2849b;
            this.f2849b = i2 + 1;
        }
        return new b(this, AbstractC0150d.h(Integer.valueOf(i2), "Q"));
    }
}
