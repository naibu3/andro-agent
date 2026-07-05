package M;

import B0.C0000a;
import B0.EnumC0001b;
import B0.G;
import android.content.Context;
import android.graphics.Typeface;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import i.AbstractC0120b;
import i.C0124f;
import i.InterfaceC0119a;
import j.MenuC0135C;
import j0.AbstractC0150d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v implements InterfaceC0119a {

    /* renamed from: a, reason: collision with root package name */
    public Object f570a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f571b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f572c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f573d;

    public v() {
        this.f571b = new ArrayDeque();
        this.f572c = new ArrayDeque();
        this.f573d = new ArrayDeque();
    }

    @Override // i.InterfaceC0119a
    public boolean a(AbstractC0120b abstractC0120b, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f570a).onActionItemClicked(g(abstractC0120b), new j.u((Context) this.f571b, (C.a) menuItem));
    }

    @Override // i.InterfaceC0119a
    public boolean b(AbstractC0120b abstractC0120b, j.n nVar) {
        C0124f c0124fG = g(abstractC0120b);
        n.k kVar = (n.k) this.f573d;
        Menu menuC0135C = (Menu) kVar.get(nVar);
        if (menuC0135C == null) {
            menuC0135C = new MenuC0135C((Context) this.f571b, nVar);
            kVar.put(nVar, menuC0135C);
        }
        return ((ActionMode.Callback) this.f570a).onPrepareActionMode(c0124fG, menuC0135C);
    }

    @Override // i.InterfaceC0119a
    public boolean c(AbstractC0120b abstractC0120b, j.n nVar) {
        C0124f c0124fG = g(abstractC0120b);
        n.k kVar = (n.k) this.f573d;
        Menu menuC0135C = (Menu) kVar.get(nVar);
        if (menuC0135C == null) {
            menuC0135C = new MenuC0135C((Context) this.f571b, nVar);
            kVar.put(nVar, menuC0135C);
        }
        return ((ActionMode.Callback) this.f570a).onCreateActionMode(c0124fG, menuC0135C);
    }

    @Override // i.InterfaceC0119a
    public void d(AbstractC0120b abstractC0120b) {
        ((ActionMode.Callback) this.f570a).onDestroyActionMode(g(abstractC0120b));
    }

    public IOException e(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            j(iOException);
        }
        y0.h hVar = (y0.h) this.f570a;
        if (z3) {
            if (iOException != null) {
                AbstractC0150d.e(hVar, "call");
            } else {
                AbstractC0150d.e(hVar, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                AbstractC0150d.e(hVar, "call");
            } else {
                AbstractC0150d.e(hVar, "call");
            }
        }
        return hVar.h(this, z3, z2, iOException);
    }

    public void f(y0.f fVar) {
        fVar.f2882b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f572c;
        synchronized (this) {
            if (!arrayDeque.remove(fVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            synchronized (this) {
            }
            h();
        }
        h();
    }

    public C0124f g(AbstractC0120b abstractC0120b) {
        ArrayList arrayList = (ArrayList) this.f572c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0124f c0124f = (C0124f) arrayList.get(i2);
            if (c0124f != null && c0124f.f1523b == abstractC0120b) {
                return c0124f;
            }
        }
        C0124f c0124f2 = new C0124f((Context) this.f571b, abstractC0120b);
        arrayList.add(c0124f2);
        return c0124f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r3 < 5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        r1.remove();
        r2.f2882b.incrementAndGet();
        r0.add(r2);
        ((java.util.ArrayDeque) r14.f572c).add(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h() {
        int size;
        int i2;
        int i3;
        y0.f fVar;
        byte[] bArr = v0.b.f2808a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f571b).iterator();
                AbstractC0150d.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    y0.f fVar2 = (y0.f) it.next();
                    int size2 = ((ArrayDeque) this.f572c).size();
                    synchronized (this) {
                        if (size2 < 64) {
                            int i4 = fVar2.f2882b.get();
                            synchronized (this) {
                            }
                            fVar.getClass();
                            y0.h hVar = fVar.f2883c;
                            v vVar = hVar.f2885a.f2519a;
                            byte[] bArr2 = v0.b.f2808a;
                            try {
                                try {
                                    threadPoolExecutor.execute(fVar);
                                } catch (RejectedExecutionException e2) {
                                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                                    interruptedIOException.initCause(e2);
                                    hVar.i(interruptedIOException);
                                    fVar.f2881a.w(interruptedIOException);
                                    hVar.f2885a.f2519a.f(fVar);
                                }
                                i2 = i3;
                            } catch (Throwable th) {
                                hVar.f2885a.f2519a.f(fVar);
                                throw th;
                            }
                        }
                    }
                    size = arrayList.size();
                    i2 = 0;
                    while (i2 < size) {
                        i3 = i2 + 1;
                        fVar = (y0.f) arrayList.get(i2);
                        synchronized (this) {
                            try {
                                if (((ThreadPoolExecutor) this.f570a) == null) {
                                    TimeUnit timeUnit = TimeUnit.SECONDS;
                                    SynchronousQueue synchronousQueue = new SynchronousQueue();
                                    String strH = AbstractC0150d.h(" Dispatcher", v0.b.h);
                                    AbstractC0150d.e(strH, "name");
                                    this.f570a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new v0.a(false, strH));
                                }
                                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f570a;
                                AbstractC0150d.b(threadPoolExecutor);
                                fVar.getClass();
                                y0.h hVar2 = fVar.f2883c;
                                v vVar2 = hVar2.f2885a.f2519a;
                                byte[] bArr22 = v0.b.f2808a;
                                threadPoolExecutor.execute(fVar);
                                i2 = i3;
                            } finally {
                            }
                        }
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f572c).size();
                    ((ArrayDeque) this.f573d).size();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        size = arrayList.size();
        i2 = 0;
        while (i2 < size) {
        }
    }

    public u0.t i(boolean z2) throws IOException {
        try {
            u0.t tVarF = ((z0.d) this.f572c).f(z2);
            if (tVarF != null) {
                tVarF.f2565m = this;
            }
            return tVarF;
        } catch (IOException e2) {
            AbstractC0150d.e((y0.h) this.f570a, "call");
            j(e2);
            throw e2;
        }
    }

    public void j(IOException iOException) {
        ((y0.e) this.f571b).c(iOException);
        y0.k kVarG = ((z0.d) this.f572c).g();
        y0.h hVar = (y0.h) this.f570a;
        synchronized (kVarG) {
            try {
                AbstractC0150d.e(hVar, "call");
                if (!(iOException instanceof G)) {
                    if (!(kVarG.f2908g != null) || (iOException instanceof C0000a)) {
                        kVarG.f2910j = true;
                        if (kVarG.f2913m == 0) {
                            y0.k.d(hVar.f2885a, kVarG.f2903b, iOException);
                            kVarG.f2912l++;
                        }
                    }
                } else if (((G) iOException).f81a == EnumC0001b.REFUSED_STREAM) {
                    int i2 = kVarG.f2914n + 1;
                    kVarG.f2914n = i2;
                    if (i2 > 1) {
                        kVarG.f2910j = true;
                        kVarG.f2912l++;
                    }
                } else if (((G) iOException).f81a != EnumC0001b.CANCEL || !hVar.f2896m) {
                    kVarG.f2910j = true;
                    kVarG.f2912l++;
                }
            } finally {
            }
        }
    }

    public v(y0.h hVar, y0.e eVar, z0.d dVar) {
        AbstractC0150d.e(hVar, "call");
        AbstractC0150d.e(eVar, "finder");
        this.f570a = hVar;
        this.f571b = eVar;
        this.f572c = dVar;
        this.f573d = dVar.g();
    }

    public v(Typeface typeface, N.b bVar) {
        int i2;
        int i3;
        this.f573d = typeface;
        this.f570a = bVar;
        this.f572c = new u(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i4 = iA + bVar.f316a;
            i2 = ((ByteBuffer) bVar.f319d).getInt(((ByteBuffer) bVar.f319d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        this.f571b = new char[i2 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i5 = iA2 + bVar.f316a;
            i3 = ((ByteBuffer) bVar.f319d).getInt(((ByteBuffer) bVar.f319d).getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            y yVar = new y(this, i6);
            N.a aVarC = yVar.c();
            int iA3 = aVarC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarC.f319d).getInt(iA3 + aVarC.f316a) : 0, (char[]) this.f571b, i6 * 2);
            if (yVar.b() > 0) {
                ((u) this.f572c).a(yVar, 0, yVar.b() - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public v(Context context, ActionMode.Callback callback) {
        this.f571b = context;
        this.f570a = callback;
        this.f572c = new ArrayList();
        this.f573d = new n.k(0);
    }
}
