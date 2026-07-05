package A;

import E.o;
import E.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k.U;
import z.C0260e;
import z.C0262g;
import z.InterfaceC0259d;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0.d f9a;

    /* renamed from: b, reason: collision with root package name */
    public static final n.j f10b;

    static {
        C0.f.c("TypefaceCompat static init");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f9a = new l();
        } else if (i2 >= 28) {
            f9a = new k();
        } else if (i2 >= 26) {
            f9a = new j();
        } else {
            Method method = i.f18c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f9a = new i();
            } else {
                f9a = new h();
            }
        }
        f10b = new n.j(16);
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, InterfaceC0259d interfaceC0259d, Resources resources, int i2, String str, int i3, int i4, U u2) throws InterruptedException {
        Typeface typefaceK;
        Typeface typefaceCreate;
        List listUnmodifiableList;
        int i5 = 1;
        int i6 = 0;
        if (interfaceC0259d instanceof C0262g) {
            C0262g c0262g = (C0262g) interfaceC0259d;
            String str2 = c0262g.f2949e;
            typefaceK = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
                if (typefaceCreate == null) {
                    new Handler(Looper.getMainLooper()).post(new Z.b(u2, typefaceCreate, 9));
                    return typefaceCreate;
                }
                boolean z2 = c0262g.f2948d == 0;
                int i7 = c0262g.f2947c;
                Handler handler = new Handler(Looper.getMainLooper());
                f fVar = new f(0);
                fVar.f8b = u2;
                E.g gVar = c0262g.f2946b;
                if (gVar != null) {
                    Object[] objArr = {c0262g.f2945a, gVar};
                    ArrayList arrayList = new ArrayList(2);
                    for (int i8 = 0; i8 < 2; i8++) {
                        Object obj = objArr[i8];
                        Objects.requireNonNull(obj);
                        arrayList.add(obj);
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                } else {
                    Object[] objArr2 = {c0262g.f2945a};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = objArr2[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                }
                List list = listUnmodifiableList;
                o oVar = new o(handler);
                E.c cVar = new E.c(fVar, oVar, i6);
                if (!z2) {
                    String strA = E.k.a(list, i4);
                    Typeface typeface = (Typeface) E.k.f292a.a(strA);
                    if (typeface != null) {
                        oVar.execute(new E.a(fVar, typeface, 0));
                        typefaceK = typeface;
                    } else {
                        E.i iVar = new E.i(i6, cVar);
                        synchronized (E.k.f294c) {
                            try {
                                n.k kVar = E.k.f295d;
                                ArrayList arrayList3 = (ArrayList) kVar.get(strA);
                                if (arrayList3 != null) {
                                    arrayList3.add(iVar);
                                } else {
                                    ArrayList arrayList4 = new ArrayList();
                                    arrayList4.add(iVar);
                                    kVar.put(strA, arrayList4);
                                    E.h hVar = new E.h(strA, context, list, i4, 1);
                                    ThreadPoolExecutor threadPoolExecutor = E.k.f293b;
                                    E.i iVar2 = new E.i(i5, strA);
                                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                    p pVar = new p();
                                    pVar.f303a = hVar;
                                    pVar.f304b = iVar2;
                                    pVar.f305c = handler2;
                                    threadPoolExecutor.execute(pVar);
                                }
                            } finally {
                            }
                        }
                    }
                } else {
                    if (list.size() > 1) {
                        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                    }
                    E.g gVar2 = (E.g) list.get(0);
                    n.j jVar = E.k.f292a;
                    ArrayList arrayList5 = new ArrayList(1);
                    Object obj3 = new Object[]{gVar2}[0];
                    Objects.requireNonNull(obj3);
                    arrayList5.add(obj3);
                    String strA2 = E.k.a(Collections.unmodifiableList(arrayList5), i4);
                    Typeface typeface2 = (Typeface) E.k.f292a.a(strA2);
                    if (typeface2 != null) {
                        oVar.execute(new E.a(fVar, typeface2, 0));
                        typefaceK = typeface2;
                    } else if (i7 == -1) {
                        ArrayList arrayList6 = new ArrayList(1);
                        Object obj4 = new Object[]{gVar2}[0];
                        Objects.requireNonNull(obj4);
                        arrayList6.add(obj4);
                        E.j jVarB = E.k.b(strA2, context, Collections.unmodifiableList(arrayList6), i4);
                        cVar.f(jVarB);
                        typefaceK = jVarB.f290a;
                    } else {
                        try {
                            try {
                                E.j jVar2 = (E.j) E.k.f293b.submit(new E.h(strA2, context, gVar2, i4, 0)).get(i7, TimeUnit.MILLISECONDS);
                                cVar.f(jVar2);
                                typefaceK = jVar2.f290a;
                            } catch (InterruptedException e2) {
                                throw e2;
                            } catch (ExecutionException e3) {
                                throw new RuntimeException(e3);
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException unused2) {
                            ((o) cVar.f272c).execute(new E.b((f) cVar.f271b, -3));
                        }
                    }
                }
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                }
                if (typefaceCreate == null) {
                }
            }
        } else {
            typefaceK = f9a.k(context, (C0260e) interfaceC0259d, resources, i4);
            if (typefaceK != null) {
                new Handler(Looper.getMainLooper()).post(new Z.b(u2, typefaceK, 9));
            } else {
                u2.a();
            }
        }
        if (typefaceK != null) {
            f10b.b(b(resources, i2, str, i3, i4), typefaceK);
        }
        return typefaceK;
    }

    public static String b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
