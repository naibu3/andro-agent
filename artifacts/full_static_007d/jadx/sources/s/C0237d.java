package s;

import D0.h;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.conscrypt.BuildConfig;
import org.conscrypt.ct.CTConstants;
import q.C0231b;
import q.C0232c;
import t.C0240c;
import t.C0243f;
import t.C0248k;
import t.m;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0237d {

    /* renamed from: A, reason: collision with root package name */
    public int f2263A;

    /* renamed from: B, reason: collision with root package name */
    public float f2264B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f2265C;

    /* renamed from: D, reason: collision with root package name */
    public float f2266D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2267E;

    /* renamed from: F, reason: collision with root package name */
    public int f2268F;

    /* renamed from: G, reason: collision with root package name */
    public int f2269G;

    /* renamed from: H, reason: collision with root package name */
    public final C0236c f2270H;

    /* renamed from: I, reason: collision with root package name */
    public final C0236c f2271I;

    /* renamed from: J, reason: collision with root package name */
    public final C0236c f2272J;

    /* renamed from: K, reason: collision with root package name */
    public final C0236c f2273K;

    /* renamed from: L, reason: collision with root package name */
    public final C0236c f2274L;

    /* renamed from: M, reason: collision with root package name */
    public final C0236c f2275M;

    /* renamed from: N, reason: collision with root package name */
    public final C0236c f2276N;

    /* renamed from: O, reason: collision with root package name */
    public final C0236c f2277O;

    /* renamed from: P, reason: collision with root package name */
    public final C0236c[] f2278P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f2279Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean[] f2280R;

    /* renamed from: S, reason: collision with root package name */
    public C0237d f2281S;

    /* renamed from: T, reason: collision with root package name */
    public int f2282T;

    /* renamed from: U, reason: collision with root package name */
    public int f2283U;

    /* renamed from: V, reason: collision with root package name */
    public float f2284V;

    /* renamed from: W, reason: collision with root package name */
    public int f2285W;

    /* renamed from: X, reason: collision with root package name */
    public int f2286X;

    /* renamed from: Y, reason: collision with root package name */
    public int f2287Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f2288Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2290a0;

    /* renamed from: b, reason: collision with root package name */
    public C0240c f2291b;

    /* renamed from: b0, reason: collision with root package name */
    public int f2292b0;

    /* renamed from: c, reason: collision with root package name */
    public C0240c f2293c;

    /* renamed from: c0, reason: collision with root package name */
    public float f2294c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f2296d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f2298e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f2300f0;
    public String g0;
    public int h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f2303i0;

    /* renamed from: j, reason: collision with root package name */
    public String f2304j;

    /* renamed from: j0, reason: collision with root package name */
    public final float[] f2305j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2306k;

    /* renamed from: k0, reason: collision with root package name */
    public final C0237d[] f2307k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2308l;

    /* renamed from: l0, reason: collision with root package name */
    public final C0237d[] f2309l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2310m;

    /* renamed from: m0, reason: collision with root package name */
    public int f2311m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2312n;

    /* renamed from: n0, reason: collision with root package name */
    public int f2313n0;

    /* renamed from: o, reason: collision with root package name */
    public int f2314o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f2315o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2316p;

    /* renamed from: q, reason: collision with root package name */
    public int f2317q;

    /* renamed from: r, reason: collision with root package name */
    public int f2318r;

    /* renamed from: s, reason: collision with root package name */
    public int f2319s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f2320t;

    /* renamed from: u, reason: collision with root package name */
    public int f2321u;

    /* renamed from: v, reason: collision with root package name */
    public int f2322v;

    /* renamed from: w, reason: collision with root package name */
    public float f2323w;

    /* renamed from: x, reason: collision with root package name */
    public int f2324x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public float f2325z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2289a = false;

    /* renamed from: d, reason: collision with root package name */
    public C0248k f2295d = null;

    /* renamed from: e, reason: collision with root package name */
    public m f2297e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f2299f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f2301g = true;
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f2302i = -1;

    public C0237d() {
        new HashMap();
        this.f2306k = false;
        this.f2308l = false;
        this.f2310m = false;
        this.f2312n = false;
        this.f2314o = -1;
        this.f2316p = -1;
        this.f2317q = 0;
        this.f2318r = 0;
        this.f2319s = 0;
        this.f2320t = new int[2];
        this.f2321u = 0;
        this.f2322v = 0;
        this.f2323w = 1.0f;
        this.f2324x = 0;
        this.y = 0;
        this.f2325z = 1.0f;
        this.f2263A = -1;
        this.f2264B = 1.0f;
        this.f2265C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f2266D = 0.0f;
        this.f2267E = false;
        this.f2268F = 0;
        this.f2269G = 0;
        C0236c c0236c = new C0236c(this, 2);
        this.f2270H = c0236c;
        C0236c c0236c2 = new C0236c(this, 3);
        this.f2271I = c0236c2;
        C0236c c0236c3 = new C0236c(this, 4);
        this.f2272J = c0236c3;
        C0236c c0236c4 = new C0236c(this, 5);
        this.f2273K = c0236c4;
        C0236c c0236c5 = new C0236c(this, 6);
        this.f2274L = c0236c5;
        C0236c c0236c6 = new C0236c(this, 8);
        this.f2275M = c0236c6;
        C0236c c0236c7 = new C0236c(this, 9);
        this.f2276N = c0236c7;
        C0236c c0236c8 = new C0236c(this, 7);
        this.f2277O = c0236c8;
        this.f2278P = new C0236c[]{c0236c, c0236c3, c0236c2, c0236c4, c0236c5, c0236c8};
        ArrayList arrayList = new ArrayList();
        this.f2279Q = arrayList;
        this.f2280R = new boolean[2];
        this.f2315o0 = new int[]{1, 1};
        this.f2281S = null;
        this.f2282T = 0;
        this.f2283U = 0;
        this.f2284V = 0.0f;
        this.f2285W = -1;
        this.f2286X = 0;
        this.f2287Y = 0;
        this.f2288Z = 0;
        this.f2294c0 = 0.5f;
        this.f2296d0 = 0.5f;
        this.f2300f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.f2303i0 = 0;
        this.f2305j0 = new float[]{-1.0f, -1.0f};
        this.f2307k0 = new C0237d[]{null, null};
        this.f2309l0 = new C0237d[]{null, null};
        this.f2311m0 = -1;
        this.f2313n0 = -1;
        arrayList.add(c0236c);
        arrayList.add(c0236c2);
        arrayList.add(c0236c3);
        arrayList.add(c0236c4);
        arrayList.add(c0236c6);
        arrayList.add(c0236c7);
        arrayList.add(c0236c8);
        arrayList.add(c0236c5);
    }

    public static void D(int i2, int i3, String str, StringBuilder sb) {
        if (i2 == i3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i2);
        sb.append(",\n");
    }

    public static void E(StringBuilder sb, String str, float f2, float f3) {
        if (f2 == f3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f2);
        sb.append(",\n");
    }

    public static void m(StringBuilder sb, String str, int i2, int i3, int i4, int i5, int i6, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        D(i2, 0, "      size", sb);
        D(i3, 0, "      min", sb);
        D(i4, Integer.MAX_VALUE, "      max", sb);
        D(i5, 0, "      matchMin", sb);
        D(i6, 0, "      matchDef", sb);
        E(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    public static void n(StringBuilder sb, String str, C0236c c0236c) {
        if (c0236c.f2260f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(c0236c.f2260f);
        sb.append("'");
        if (c0236c.h != Integer.MIN_VALUE || c0236c.f2261g != 0) {
            sb.append(",");
            sb.append(c0236c.f2261g);
            if (c0236c.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(c0236c.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public void A() {
        this.f2270H.g();
        this.f2271I.g();
        this.f2272J.g();
        this.f2273K.g();
        this.f2274L.g();
        this.f2275M.g();
        this.f2276N.g();
        this.f2277O.g();
        this.f2281S = null;
        this.f2266D = 0.0f;
        this.f2282T = 0;
        this.f2283U = 0;
        this.f2284V = 0.0f;
        this.f2285W = -1;
        this.f2286X = 0;
        this.f2287Y = 0;
        this.f2288Z = 0;
        this.f2290a0 = 0;
        this.f2292b0 = 0;
        this.f2294c0 = 0.5f;
        this.f2296d0 = 0.5f;
        int[] iArr = this.f2315o0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f2298e0 = null;
        this.f2300f0 = 0;
        this.h0 = 0;
        this.f2303i0 = 0;
        float[] fArr = this.f2305j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2314o = -1;
        this.f2316p = -1;
        int[] iArr2 = this.f2265C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f2318r = 0;
        this.f2319s = 0;
        this.f2323w = 1.0f;
        this.f2325z = 1.0f;
        this.f2322v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.f2321u = 0;
        this.f2324x = 0;
        this.f2263A = -1;
        this.f2264B = 1.0f;
        boolean[] zArr = this.f2299f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.f2280R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2301g = true;
        int[] iArr3 = this.f2320t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.f2302i = -1;
    }

    public final void B() {
        this.f2306k = false;
        this.f2308l = false;
        this.f2310m = false;
        this.f2312n = false;
        ArrayList arrayList = this.f2279Q;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0236c c0236c = (C0236c) arrayList.get(i2);
            c0236c.f2257c = false;
            c0236c.f2256b = 0;
        }
    }

    public void C(h hVar) {
        this.f2270H.h();
        this.f2271I.h();
        this.f2272J.h();
        this.f2273K.h();
        this.f2274L.h();
        this.f2277O.h();
        this.f2275M.h();
        this.f2276N.h();
    }

    public final void F(int i2, int i3) {
        if (this.f2306k) {
            return;
        }
        this.f2270H.i(i2);
        this.f2272J.i(i3);
        this.f2286X = i2;
        this.f2282T = i3 - i2;
        this.f2306k = true;
    }

    public final void G(int i2, int i3) {
        if (this.f2308l) {
            return;
        }
        this.f2271I.i(i2);
        this.f2273K.i(i3);
        this.f2287Y = i2;
        this.f2283U = i3 - i2;
        if (this.f2267E) {
            this.f2274L.i(i2 + this.f2288Z);
        }
        this.f2308l = true;
    }

    public final void H(int i2) {
        this.f2283U = i2;
        int i3 = this.f2292b0;
        if (i2 < i3) {
            this.f2283U = i3;
        }
    }

    public final void I(int i2) {
        this.f2315o0[0] = i2;
    }

    public final void J(int i2) {
        this.f2315o0[1] = i2;
    }

    public final void K(int i2) {
        this.f2282T = i2;
        int i3 = this.f2290a0;
        if (i2 < i3) {
            this.f2282T = i3;
        }
    }

    public void L(boolean z2, boolean z3) {
        int i2;
        int i3;
        C0248k c0248k = this.f2295d;
        boolean z4 = z2 & c0248k.f2401g;
        m mVar = this.f2297e;
        boolean z5 = z3 & mVar.f2401g;
        int i4 = c0248k.h.f2377g;
        int i5 = mVar.h.f2377g;
        int i6 = c0248k.f2402i.f2377g;
        int i7 = mVar.f2402i.f2377g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.f2286X = i4;
        }
        if (z5) {
            this.f2287Y = i5;
        }
        if (this.f2300f0 == 8) {
            this.f2282T = 0;
            this.f2283U = 0;
            return;
        }
        int[] iArr = this.f2315o0;
        if (z4) {
            if (iArr[0] == 1 && i9 < (i3 = this.f2282T)) {
                i9 = i3;
            }
            this.f2282T = i9;
            int i11 = this.f2290a0;
            if (i9 < i11) {
                this.f2282T = i11;
            }
        }
        if (z5) {
            if (iArr[1] == 1 && i10 < (i2 = this.f2283U)) {
                i10 = i2;
            }
            this.f2283U = i10;
            int i12 = this.f2292b0;
            if (i10 < i12) {
                this.f2283U = i12;
            }
        }
    }

    public void M(C0232c c0232c, boolean z2) {
        int i2;
        int i3;
        m mVar;
        C0248k c0248k;
        C0236c c0236c = this.f2270H;
        c0232c.getClass();
        int iN = C0232c.n(c0236c);
        int iN2 = C0232c.n(this.f2271I);
        int iN3 = C0232c.n(this.f2272J);
        int iN4 = C0232c.n(this.f2273K);
        if (z2 && (c0248k = this.f2295d) != null) {
            C0243f c0243f = c0248k.h;
            if (c0243f.f2379j) {
                C0243f c0243f2 = c0248k.f2402i;
                if (c0243f2.f2379j) {
                    iN = c0243f.f2377g;
                    iN3 = c0243f2.f2377g;
                }
            }
        }
        if (z2 && (mVar = this.f2297e) != null) {
            C0243f c0243f3 = mVar.h;
            if (c0243f3.f2379j) {
                C0243f c0243f4 = mVar.f2402i;
                if (c0243f4.f2379j) {
                    iN2 = c0243f3.f2377g;
                    iN4 = c0243f4.f2377g;
                }
            }
        }
        int i4 = iN4 - iN2;
        if (iN3 - iN < 0 || i4 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i5 = iN3 - iN;
        int i6 = iN4 - iN2;
        this.f2286X = iN;
        this.f2287Y = iN2;
        if (this.f2300f0 == 8) {
            this.f2282T = 0;
            this.f2283U = 0;
            return;
        }
        int[] iArr = this.f2315o0;
        int i7 = iArr[0];
        if (i7 == 1 && i5 < (i3 = this.f2282T)) {
            i5 = i3;
        }
        if (iArr[1] == 1 && i6 < (i2 = this.f2283U)) {
            i6 = i2;
        }
        this.f2282T = i5;
        this.f2283U = i6;
        int i8 = this.f2292b0;
        if (i6 < i8) {
            this.f2283U = i8;
        }
        int i9 = this.f2290a0;
        if (i5 < i9) {
            this.f2282T = i9;
        }
        int i10 = this.f2322v;
        if (i10 > 0 && i7 == 3) {
            this.f2282T = Math.min(this.f2282T, i10);
        }
        int i11 = this.y;
        if (i11 > 0 && iArr[1] == 3) {
            this.f2283U = Math.min(this.f2283U, i11);
        }
        int i12 = this.f2282T;
        if (i5 != i12) {
            this.h = i12;
        }
        int i13 = this.f2283U;
        if (i6 != i13) {
            this.f2302i = i13;
        }
    }

    public final void a(e eVar, C0232c c0232c, HashSet hashSet, int i2, boolean z2) {
        if (z2) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.b(eVar, c0232c, this);
            hashSet.remove(this);
            b(c0232c, eVar.S(64));
        }
        if (i2 == 0) {
            HashSet hashSet2 = this.f2270H.f2255a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C0236c) it.next()).f2258d.a(eVar, c0232c, hashSet, i2, true);
                }
            }
            HashSet hashSet3 = this.f2272J.f2255a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C0236c) it2.next()).f2258d.a(eVar, c0232c, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f2271I.f2255a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C0236c) it3.next()).f2258d.a(eVar, c0232c, hashSet, i2, true);
            }
        }
        HashSet hashSet5 = this.f2273K.f2255a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C0236c) it4.next()).f2258d.a(eVar, c0232c, hashSet, i2, true);
            }
        }
        HashSet hashSet6 = this.f2274L.f2255a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C0236c) it5.next()).f2258d.a(eVar, c0232c, hashSet, i2, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0712  */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(C0232c c0232c, boolean z2) {
        boolean z3;
        boolean z4;
        C0237d c0237d;
        C0237d c0237d2;
        C0236c c0236c;
        boolean[] zArr;
        boolean z5;
        boolean z6;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z7;
        int i6;
        char c2;
        boolean z8;
        C0236c c0236c2;
        int i7;
        int[] iArr2;
        C0236c c0236c3;
        C0236c c0236c4;
        C0236c c0236c5;
        q.g gVar;
        q.g gVar2;
        q.g gVar3;
        q.g gVar4;
        q.g gVar5;
        int[] iArr3;
        int i8;
        int i9;
        int i10;
        C0237d c0237d3;
        C0232c c0232c2;
        q.g gVar6;
        q.g gVar7;
        q.g gVar8;
        int i11;
        q.g gVar9;
        q.g gVar10;
        C0232c c0232c3;
        boolean z9;
        C0248k c0248k;
        int i12;
        boolean zV;
        boolean zW;
        boolean z10;
        C0248k c0248k2;
        m mVar;
        boolean z11;
        boolean z12;
        ?? r10;
        C0236c c0236c6 = this.f2270H;
        q.g gVarK = c0232c.k(c0236c6);
        C0236c c0236c7 = this.f2272J;
        q.g gVarK2 = c0232c.k(c0236c7);
        C0236c c0236c8 = this.f2271I;
        q.g gVarK3 = c0232c.k(c0236c8);
        C0236c c0236c9 = this.f2273K;
        q.g gVarK4 = c0232c.k(c0236c9);
        C0236c c0236c10 = this.f2274L;
        q.g gVarK5 = c0232c.k(c0236c10);
        C0237d c0237d4 = this.f2281S;
        if (c0237d4 != null) {
            int[] iArr4 = c0237d4.f2315o0;
            if (iArr4[0] == 2) {
                r10 = 1;
                z12 = true;
            } else {
                z12 = false;
                r10 = 1;
            }
            boolean z13 = iArr4[r10] == 2 ? r10 : false;
            int i13 = this.f2317q;
            if (i13 == r10) {
                z4 = z12;
                z3 = false;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    z3 = z13;
                    z4 = z12;
                }
                z3 = false;
                z4 = false;
            } else {
                z3 = z13;
                z4 = false;
            }
        } else {
            z3 = false;
            z4 = false;
        }
        int i14 = this.f2300f0;
        boolean[] zArr2 = this.f2280R;
        if (i14 == 8) {
            ArrayList arrayList = this.f2279Q;
            int size = arrayList.size();
            int i15 = 0;
            while (true) {
                if (i15 < size) {
                    ArrayList arrayList2 = arrayList;
                    HashSet hashSet = ((C0236c) arrayList.get(i15)).f2255a;
                    if (hashSet != null && hashSet.size() > 0) {
                        break;
                    }
                    i15++;
                    arrayList = arrayList2;
                } else if (!zArr2[0] && !zArr2[1]) {
                    return;
                }
            }
        }
        boolean z14 = this.f2306k;
        if (z14 || this.f2308l) {
            if (z14) {
                c0232c.d(gVarK, this.f2286X);
                c0232c.d(gVarK2, this.f2286X + this.f2282T);
                if (z4 && (c0237d2 = this.f2281S) != null) {
                    e eVar = (e) c0237d2;
                    WeakReference weakReference = eVar.f2331G0;
                    if (weakReference == null || weakReference.get() == null || c0236c6.c() > ((C0236c) eVar.f2331G0.get()).c()) {
                        eVar.f2331G0 = new WeakReference(c0236c6);
                    }
                    WeakReference weakReference2 = eVar.f2333I0;
                    if (weakReference2 == null || weakReference2.get() == null || c0236c7.c() > ((C0236c) eVar.f2333I0.get()).c()) {
                        eVar.f2333I0 = new WeakReference(c0236c7);
                    }
                }
            }
            if (this.f2308l) {
                c0232c.d(gVarK3, this.f2287Y);
                c0232c.d(gVarK4, this.f2287Y + this.f2283U);
                HashSet hashSet2 = c0236c10.f2255a;
                if (hashSet2 != null && hashSet2.size() > 0) {
                    c0232c.d(gVarK5, this.f2287Y + this.f2288Z);
                }
                if (z3 && (c0237d = this.f2281S) != null) {
                    e eVar2 = (e) c0237d;
                    WeakReference weakReference3 = eVar2.F0;
                    if (weakReference3 == null || weakReference3.get() == null || c0236c8.c() > ((C0236c) eVar2.F0.get()).c()) {
                        eVar2.F0 = new WeakReference(c0236c8);
                    }
                    WeakReference weakReference4 = eVar2.f2332H0;
                    if (weakReference4 == null || weakReference4.get() == null || c0236c9.c() > ((C0236c) eVar2.f2332H0.get()).c()) {
                        eVar2.f2332H0 = new WeakReference(c0236c9);
                    }
                }
            }
            if (this.f2306k && this.f2308l) {
                this.f2306k = false;
                this.f2308l = false;
                return;
            }
        }
        boolean[] zArr3 = this.f2299f;
        if (!z2 || (c0248k2 = this.f2295d) == null || (mVar = this.f2297e) == null) {
            c0236c = c0236c10;
            zArr = zArr2;
        } else {
            zArr = zArr2;
            C0243f c0243f = c0248k2.h;
            c0236c = c0236c10;
            if (c0243f.f2379j && c0248k2.f2402i.f2379j && mVar.h.f2379j && mVar.f2402i.f2379j) {
                c0232c.d(gVarK, c0243f.f2377g);
                c0232c.d(gVarK2, this.f2295d.f2402i.f2377g);
                c0232c.d(gVarK3, this.f2297e.h.f2377g);
                c0232c.d(gVarK4, this.f2297e.f2402i.f2377g);
                c0232c.d(gVarK5, this.f2297e.f2387k.f2377g);
                if (this.f2281S == null) {
                    z11 = false;
                } else {
                    if (z4 && zArr3[0] && !v()) {
                        c0232c.f(c0232c.k(this.f2281S.f2272J), gVarK2, 0, 8);
                    }
                    if (z3 && zArr3[1] && !w()) {
                        z11 = false;
                        c0232c.f(c0232c.k(this.f2281S.f2273K), gVarK4, 0, 8);
                    }
                }
                this.f2306k = z11;
                this.f2308l = z11;
                return;
            }
        }
        if (this.f2281S != null) {
            if (u(0)) {
                ((e) this.f2281S).N(this, 0);
                zV = true;
            } else {
                zV = v();
            }
            if (u(1)) {
                ((e) this.f2281S).N(this, 1);
                zW = true;
            } else {
                zW = w();
            }
            if (!zV && z4 && this.f2300f0 != 8 && c0236c6.f2260f == null && c0236c7.f2260f == null) {
                z10 = zV;
                c0232c.f(c0232c.k(this.f2281S.f2272J), gVarK2, 0, 1);
            } else {
                z10 = zV;
            }
            if (!zW && z3 && this.f2300f0 != 8 && c0236c8.f2260f == null && c0236c9.f2260f == null && c0236c == null) {
                c0232c.f(c0232c.k(this.f2281S.f2273K), gVarK4, 0, 1);
            }
            z5 = zW;
            z6 = z10;
        } else {
            z5 = false;
            z6 = false;
        }
        int i16 = this.f2282T;
        int i17 = this.f2290a0;
        if (i16 >= i17) {
            i17 = i16;
        }
        int i18 = this.f2283U;
        int i19 = this.f2292b0;
        if (i18 >= i19) {
            i19 = i18;
        }
        int[] iArr5 = this.f2315o0;
        int i20 = iArr5[0];
        int i21 = i17;
        boolean z15 = i20 != 3;
        int i22 = iArr5[1];
        int i23 = i19;
        boolean z16 = i22 != 3;
        int i24 = this.f2285W;
        this.f2263A = i24;
        float f2 = this.f2284V;
        this.f2264B = f2;
        int i25 = this.f2318r;
        int i26 = this.f2319s;
        if (f2 > 0.0f) {
            iArr = iArr5;
            if (this.f2300f0 != 8) {
                if (i20 == 3 && i25 == 0) {
                    i25 = 3;
                }
                if (i22 == 3 && i26 == 0) {
                    i26 = 3;
                }
                if (i20 == 3 && i22 == 3 && i25 == 3 && i26 == 3) {
                    if (i24 == -1) {
                        if (z15 && !z16) {
                            this.f2263A = 0;
                        } else if (!z15 && z16) {
                            this.f2263A = 1;
                            if (i24 == -1) {
                                this.f2264B = 1.0f / f2;
                            }
                        }
                    }
                    if (this.f2263A == 0 && (!c0236c8.f() || !c0236c9.f())) {
                        this.f2263A = 1;
                    } else if (this.f2263A == 1 && (!c0236c6.f() || !c0236c7.f())) {
                        this.f2263A = 0;
                    }
                    if (this.f2263A == -1 && (!c0236c8.f() || !c0236c9.f() || !c0236c6.f() || !c0236c7.f())) {
                        if (c0236c8.f() && c0236c9.f()) {
                            this.f2263A = 0;
                        } else if (c0236c6.f() && c0236c7.f()) {
                            this.f2264B = 1.0f / this.f2264B;
                            this.f2263A = 1;
                        }
                    }
                    if (this.f2263A == -1) {
                        int i27 = this.f2321u;
                        if (i27 > 0 && this.f2324x == 0) {
                            this.f2263A = 0;
                        } else if (i27 == 0 && this.f2324x > 0) {
                            this.f2264B = 1.0f / this.f2264B;
                            this.f2263A = 1;
                        }
                    }
                } else if (i20 == 3 && i25 == 3) {
                    this.f2263A = 0;
                    i4 = (int) (f2 * i18);
                    if (i22 != 3) {
                        i3 = i26;
                        i5 = i23;
                        z7 = false;
                        i2 = 4;
                    } else {
                        i2 = i25;
                        i3 = i26;
                        i5 = i23;
                        z7 = true;
                    }
                } else {
                    if (i22 == 3 && i26 == 3) {
                        this.f2263A = 1;
                        if (i24 == -1) {
                            this.f2264B = 1.0f / f2;
                        }
                        i5 = (int) (this.f2264B * i16);
                        i2 = i25;
                        if (i20 != 3) {
                            i4 = i21;
                            z7 = false;
                            i3 = 4;
                        } else {
                            i3 = i26;
                            i4 = i21;
                        }
                    }
                    z7 = true;
                }
                i2 = i25;
                i3 = i26;
                i4 = i21;
                i5 = i23;
                z7 = true;
            }
            int[] iArr6 = this.f2320t;
            iArr6[0] = i2;
            iArr6[1] = i3;
            if (!z7) {
                int i28 = this.f2263A;
                i6 = -1;
                boolean z17 = i28 == 0 || i28 == -1;
                if (z7 && ((i12 = this.f2263A) == 1 || i12 == i6)) {
                    c2 = 0;
                    z8 = true;
                } else {
                    c2 = 0;
                    z8 = false;
                }
                boolean z18 = iArr[c2] == 2 && (this instanceof e);
                int i29 = z18 ? 0 : i4;
                c0236c2 = this.f2277O;
                boolean z19 = !c0236c2.f();
                boolean z20 = zArr[0];
                boolean z21 = zArr[1];
                i7 = this.f2314o;
                iArr2 = this.f2265C;
                if (i7 == 2 || this.f2306k) {
                    c0236c3 = c0236c9;
                    c0236c4 = c0236c2;
                    c0236c5 = c0236c;
                    gVar = gVarK3;
                    gVar2 = gVarK5;
                    gVar3 = gVarK4;
                    gVar4 = gVarK2;
                    gVar5 = gVarK;
                    iArr3 = iArr2;
                } else {
                    if (z2 && (c0248k = this.f2295d) != null) {
                        C0243f c0243f2 = c0248k.h;
                        if (c0243f2.f2379j && c0248k.f2402i.f2379j) {
                            if (z2) {
                                c0232c.d(gVarK, c0243f2.f2377g);
                                c0232c.d(gVarK2, this.f2295d.f2402i.f2377g);
                                if (this.f2281S != null && z4 && zArr3[0] && !v()) {
                                    c0232c.f(c0232c.k(this.f2281S.f2272J), gVarK2, 0, 8);
                                }
                                gVar4 = gVarK2;
                                gVar5 = gVarK;
                                c0236c3 = c0236c9;
                                c0236c4 = c0236c2;
                                c0236c5 = c0236c;
                                gVar = gVarK3;
                                gVar2 = gVarK5;
                                gVar3 = gVarK4;
                                iArr3 = iArr2;
                            } else {
                                c0236c3 = c0236c9;
                                c0236c4 = c0236c2;
                                c0236c5 = c0236c;
                                gVar = gVarK3;
                                gVar2 = gVarK5;
                                gVar3 = gVarK4;
                                gVar4 = gVarK2;
                                gVar5 = gVarK;
                                iArr3 = iArr2;
                            }
                        }
                    }
                    C0237d c0237d5 = this.f2281S;
                    q.g gVarK6 = c0237d5 != null ? c0232c.k(c0237d5.f2272J) : null;
                    C0237d c0237d6 = this.f2281S;
                    gVar2 = gVarK5;
                    c0236c5 = c0236c;
                    gVar3 = gVarK4;
                    iArr3 = iArr2;
                    c0236c3 = c0236c9;
                    gVar = gVarK3;
                    gVar4 = gVarK2;
                    c0236c4 = c0236c2;
                    gVar5 = gVarK;
                    d(c0232c, true, z4, z3, zArr3[0], c0237d6 != null ? c0232c.k(c0237d6.f2270H) : null, gVarK6, iArr[0], z18, this.f2270H, this.f2272J, this.f2286X, i29, this.f2290a0, iArr2[0], this.f2294c0, z17, iArr[1] == 3, z6, z5, z20, i2, i3, this.f2321u, this.f2322v, this.f2323w, z19);
                }
                if (z2) {
                    c0237d3 = this;
                    m mVar2 = c0237d3.f2297e;
                    if (mVar2 != null) {
                        C0243f c0243f3 = mVar2.h;
                        if (c0243f3.f2379j && mVar2.f2402i.f2379j) {
                            c0232c2 = c0232c;
                            gVar8 = gVar;
                            c0232c2.d(gVar8, c0243f3.f2377g);
                            gVar7 = gVar3;
                            c0232c2.d(gVar7, c0237d3.f2297e.f2402i.f2377g);
                            gVar6 = gVar2;
                            c0232c2.d(gVar6, c0237d3.f2297e.f2387k.f2377g);
                            C0237d c0237d7 = c0237d3.f2281S;
                            if (c0237d7 == null || z5 || !z3) {
                                i8 = 8;
                                i9 = 0;
                                i10 = 1;
                            } else {
                                i10 = 1;
                                if (zArr3[1]) {
                                    i8 = 8;
                                    i9 = 0;
                                    c0232c2.f(c0232c2.k(c0237d7.f2273K), gVar7, 0, 8);
                                } else {
                                    i8 = 8;
                                    i9 = 0;
                                }
                            }
                            i11 = i9;
                            if ((c0237d3.f2316p != 2 ? i9 : i11) != 0 || c0237d3.f2308l) {
                                gVar9 = gVar7;
                                gVar10 = gVar8;
                            } else {
                                boolean z22 = (iArr[i10] == 2 && (c0237d3 instanceof e)) ? i10 : i9;
                                if (z22) {
                                    i5 = i9;
                                }
                                C0237d c0237d8 = c0237d3.f2281S;
                                q.g gVarK7 = c0237d8 != null ? c0232c2.k(c0237d8.f2273K) : null;
                                C0237d c0237d9 = c0237d3.f2281S;
                                q.g gVarK8 = c0237d9 != null ? c0232c2.k(c0237d9.f2271I) : null;
                                int i30 = c0237d3.f2288Z;
                                if (i30 > 0 || c0237d3.f2300f0 == i8) {
                                    C0236c c0236c11 = c0236c5;
                                    if (c0236c11.f2260f != null) {
                                        c0232c2.e(gVar6, gVar8, i30, i8);
                                        c0232c2.e(gVar6, c0232c2.k(c0236c11.f2260f), c0236c11.d(), i8);
                                        if (z3) {
                                            c0232c2.f(gVarK7, c0232c2.k(c0236c3), i9, 5);
                                        }
                                        z9 = i9;
                                        gVar9 = gVar7;
                                        gVar10 = gVar8;
                                        d(c0232c, false, z3, z4, zArr3[i10], gVarK8, gVarK7, iArr[i10], z22, c0237d3.f2271I, c0237d3.f2273K, c0237d3.f2287Y, i5, c0237d3.f2292b0, iArr3[i10], c0237d3.f2296d0, z8, iArr[i9] == 3 ? i10 : i9, z5, z6, z21, i3, i2, c0237d3.f2324x, c0237d3.y, c0237d3.f2325z, z9);
                                    } else {
                                        if (c0237d3.f2300f0 == i8) {
                                            c0232c2.e(gVar6, gVar8, c0236c11.d(), i8);
                                        } else {
                                            c0232c2.e(gVar6, gVar8, i30, i8);
                                        }
                                        z9 = z19;
                                        gVar9 = gVar7;
                                        gVar10 = gVar8;
                                        d(c0232c, false, z3, z4, zArr3[i10], gVarK8, gVarK7, iArr[i10], z22, c0237d3.f2271I, c0237d3.f2273K, c0237d3.f2287Y, i5, c0237d3.f2292b0, iArr3[i10], c0237d3.f2296d0, z8, iArr[i9] == 3 ? i10 : i9, z5, z6, z21, i3, i2, c0237d3.f2324x, c0237d3.y, c0237d3.f2325z, z9);
                                    }
                                } else {
                                    z9 = z19;
                                    gVar9 = gVar7;
                                    gVar10 = gVar8;
                                    d(c0232c, false, z3, z4, zArr3[i10], gVarK8, gVarK7, iArr[i10], z22, c0237d3.f2271I, c0237d3.f2273K, c0237d3.f2287Y, i5, c0237d3.f2292b0, iArr3[i10], c0237d3.f2296d0, z8, iArr[i9] == 3 ? i10 : i9, z5, z6, z21, i3, i2, c0237d3.f2324x, c0237d3.y, c0237d3.f2325z, z9);
                                }
                            }
                            if (z7) {
                                c0232c3 = c0232c;
                            } else if (this.f2263A == 1) {
                                float f3 = this.f2264B;
                                C0231b c0231bL = c0232c.l();
                                c0231bL.f2187d.g(gVar9, -1.0f);
                                c0231bL.f2187d.g(gVar10, 1.0f);
                                c0231bL.f2187d.g(gVar4, f3);
                                c0231bL.f2187d.g(gVar5, -f3);
                                c0232c3 = c0232c;
                                c0232c3.c(c0231bL);
                            } else {
                                c0232c3 = c0232c;
                                float f4 = this.f2264B;
                                C0231b c0231bL2 = c0232c.l();
                                c0231bL2.f2187d.g(gVar4, -1.0f);
                                c0231bL2.f2187d.g(gVar5, 1.0f);
                                c0231bL2.f2187d.g(gVar9, f4);
                                c0231bL2.f2187d.g(gVar10, -f4);
                                c0232c3.c(c0231bL2);
                            }
                            if (c0236c4.f()) {
                                C0236c c0236c12 = c0236c4;
                                C0237d c0237d10 = c0236c12.f2260f.f2258d;
                                float radians = (float) Math.toRadians(this.f2266D + 90.0f);
                                int iD = c0236c12.d();
                                q.g gVarK9 = c0232c3.k(g(2));
                                q.g gVarK10 = c0232c3.k(g(3));
                                q.g gVarK11 = c0232c3.k(g(4));
                                q.g gVarK12 = c0232c3.k(g(5));
                                q.g gVarK13 = c0232c3.k(c0237d10.g(2));
                                q.g gVarK14 = c0232c3.k(c0237d10.g(3));
                                q.g gVarK15 = c0232c3.k(c0237d10.g(4));
                                q.g gVarK16 = c0232c3.k(c0237d10.g(5));
                                C0231b c0231bL3 = c0232c.l();
                                double d2 = radians;
                                double d3 = iD;
                                float fSin = (float) (Math.sin(d2) * d3);
                                c0231bL3.f2187d.g(gVarK14, 0.5f);
                                c0231bL3.f2187d.g(gVarK16, 0.5f);
                                c0231bL3.f2187d.g(gVarK10, -0.5f);
                                c0231bL3.f2187d.g(gVarK12, -0.5f);
                                c0231bL3.f2185b = -fSin;
                                c0232c3.c(c0231bL3);
                                C0231b c0231bL4 = c0232c.l();
                                float fCos = (float) (Math.cos(d2) * d3);
                                c0231bL4.f2187d.g(gVarK13, 0.5f);
                                c0231bL4.f2187d.g(gVarK15, 0.5f);
                                c0231bL4.f2187d.g(gVarK9, -0.5f);
                                c0231bL4.f2187d.g(gVarK11, -0.5f);
                                c0231bL4.f2185b = -fCos;
                                c0232c3.c(c0231bL4);
                            }
                            this.f2306k = false;
                            this.f2308l = false;
                        }
                    }
                    c0232c2 = c0232c;
                    gVar6 = gVar2;
                    gVar7 = gVar3;
                    gVar8 = gVar;
                    i8 = 8;
                    i9 = 0;
                    i10 = 1;
                } else {
                    i8 = 8;
                    i9 = 0;
                    i10 = 1;
                    c0237d3 = this;
                    c0232c2 = c0232c;
                    gVar6 = gVar2;
                    gVar7 = gVar3;
                    gVar8 = gVar;
                }
                i11 = i10;
                if ((c0237d3.f2316p != 2 ? i9 : i11) != 0) {
                    gVar9 = gVar7;
                    gVar10 = gVar8;
                }
                if (z7) {
                }
                if (c0236c4.f()) {
                }
                this.f2306k = false;
                this.f2308l = false;
            }
            i6 = -1;
            if (z7) {
                c2 = 0;
                z8 = false;
            }
            if (iArr[c2] == 2) {
            }
            if (z18) {
            }
            c0236c2 = this.f2277O;
            boolean z192 = !c0236c2.f();
            boolean z202 = zArr[0];
            boolean z212 = zArr[1];
            i7 = this.f2314o;
            iArr2 = this.f2265C;
            if (i7 == 2) {
                c0236c3 = c0236c9;
                c0236c4 = c0236c2;
                c0236c5 = c0236c;
                gVar = gVarK3;
                gVar2 = gVarK5;
                gVar3 = gVarK4;
                gVar4 = gVarK2;
                gVar5 = gVarK;
                iArr3 = iArr2;
            }
            if (z2) {
            }
            i11 = i10;
            if ((c0237d3.f2316p != 2 ? i9 : i11) != 0) {
            }
            if (z7) {
            }
            if (c0236c4.f()) {
            }
            this.f2306k = false;
            this.f2308l = false;
        }
        iArr = iArr5;
        i2 = i25;
        i3 = i26;
        i4 = i21;
        i5 = i23;
        z7 = false;
        int[] iArr62 = this.f2320t;
        iArr62[0] = i2;
        iArr62[1] = i3;
        if (!z7) {
        }
        if (z7) {
        }
        if (iArr[c2] == 2) {
        }
        if (z18) {
        }
        c0236c2 = this.f2277O;
        boolean z1922 = !c0236c2.f();
        boolean z2022 = zArr[0];
        boolean z2122 = zArr[1];
        i7 = this.f2314o;
        iArr2 = this.f2265C;
        if (i7 == 2) {
        }
        if (z2) {
        }
        i11 = i10;
        if ((c0237d3.f2316p != 2 ? i9 : i11) != 0) {
        }
        if (z7) {
        }
        if (c0236c4.f()) {
        }
        this.f2306k = false;
        this.f2308l = false;
    }

    public boolean c() {
        return this.f2300f0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:353:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(C0232c c0232c, boolean z2, boolean z3, boolean z4, boolean z5, q.g gVar, q.g gVar2, int i2, boolean z6, C0236c c0236c, C0236c c0236c2, int i3, int i4, int i5, int i6, float f2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i7, int i8, int i9, int i10, float f3, boolean z12) {
        boolean z13;
        boolean z14;
        int iMin;
        boolean z15;
        int i11;
        int i12;
        int i13;
        boolean z16;
        boolean z17;
        q.g gVarK;
        q.g gVarK2;
        q.g gVar3;
        q.g gVar4;
        q.g gVar5;
        q.g gVar6;
        boolean z18;
        int i14;
        char c2;
        int i15;
        C0236c c0236c3;
        q.g gVar7;
        int i16;
        boolean z19;
        q.g gVar8;
        boolean z20;
        boolean z21;
        int i17;
        int i18;
        q.g gVar9;
        int iD;
        boolean z22;
        int i19;
        boolean z23;
        C0236c c0236c4;
        q.g gVar10;
        q.g gVar11;
        boolean z24;
        int i20;
        C0237d c0237d;
        boolean z25;
        int i21;
        C0237d c0237d2;
        C0237d c0237d3;
        q.g gVar12;
        q.g gVar13;
        boolean z26;
        boolean z27;
        q.g gVar14;
        q.g gVar15;
        C0237d c0237d4;
        int iMax;
        int i22;
        HashSet hashSet;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z28;
        boolean z29;
        boolean z30;
        int i27;
        int i28;
        q.g gVar16;
        int iD2;
        int i29 = i9;
        int i30 = i10;
        q.g gVarK3 = c0232c.k(c0236c);
        q.g gVarK4 = c0232c.k(c0236c2);
        q.g gVarK5 = c0232c.k(c0236c.f2260f);
        q.g gVarK6 = c0232c.k(c0236c2.f2260f);
        boolean zF = c0236c.f();
        boolean zF2 = c0236c2.f();
        boolean zF3 = this.f2277O.f();
        int i31 = zF2 ? (zF ? 1 : 0) + 1 : zF ? 1 : 0;
        if (zF3) {
            i31++;
        }
        int i32 = i31;
        int i33 = z7 ? 3 : i7;
        int iA = q.f.a(i2);
        boolean z31 = (iA == 0 || iA == 1 || iA != 2 || i33 == 4) ? false : true;
        int i34 = this.h;
        if (i34 == -1 || !z2) {
            i34 = i4;
            z13 = z31;
        } else {
            this.h = -1;
            z13 = false;
        }
        int i35 = this.f2302i;
        if (i35 == -1 || z2) {
            z14 = z13;
        } else {
            this.f2302i = -1;
            i34 = i35;
            z14 = false;
        }
        int i36 = i34;
        if (this.f2300f0 == 8) {
            iMin = 0;
            z14 = false;
        } else {
            iMin = i36;
        }
        if (z12) {
            if (!zF && !zF2 && !zF3) {
                c0232c.d(gVarK3, i3);
            } else if (zF && !zF2) {
                z15 = zF3;
                i11 = 8;
                c0232c.e(gVarK3, gVarK5, c0236c.d(), 8);
            }
            z15 = zF3;
            i11 = 8;
        } else {
            z15 = zF3;
            i11 = 8;
        }
        if (z14) {
            if (i32 == 2 || z7 || !(i33 == 1 || i33 == 0)) {
                if (i29 == -2) {
                    i29 = iMin;
                }
                if (i30 == -2) {
                    i30 = iMin;
                }
                if (iMin > 0 && i33 != 1) {
                    iMin = 0;
                }
                if (i29 > 0) {
                    c0232c.f(gVarK4, gVarK3, i29, 8);
                    iMin = Math.max(iMin, i29);
                }
                if (i30 > 0) {
                    if (!z3 || i33 != 1) {
                        c0232c.g(gVarK4, gVarK3, i30, 8);
                    }
                    iMin = Math.min(iMin, i30);
                }
                if (i33 == 1) {
                    if (z3) {
                        c0232c.e(gVarK4, gVarK3, iMin, 8);
                    } else if (z9) {
                        c0232c.e(gVarK4, gVarK3, iMin, 5);
                        c0232c.g(gVarK4, gVarK3, iMin, 8);
                    } else {
                        c0232c.e(gVarK4, gVarK3, iMin, 5);
                        c0232c.g(gVarK4, gVarK3, iMin, 8);
                    }
                } else if (i33 == 2) {
                    int i37 = c0236c.f2259e;
                    if (i37 == 3 || i37 == 5) {
                        gVarK = c0232c.k(this.f2281S.g(3));
                        gVarK2 = c0232c.k(this.f2281S.g(5));
                    } else {
                        gVarK = c0232c.k(this.f2281S.g(2));
                        gVarK2 = c0232c.k(this.f2281S.g(4));
                    }
                    C0231b c0231bL = c0232c.l();
                    i12 = i32;
                    c0231bL.f2187d.g(gVarK4, -1.0f);
                    c0231bL.f2187d.g(gVarK3, 1.0f);
                    c0231bL.f2187d.g(gVarK2, f3);
                    c0231bL.f2187d.g(gVarK, -f3);
                    c0232c.c(c0231bL);
                    z17 = z5;
                    i13 = i29;
                    z16 = z3 ? false : z14;
                } else {
                    i12 = i32;
                    i13 = i29;
                    z16 = z14;
                    z17 = true;
                }
            } else {
                int iMax2 = Math.max(i29, iMin);
                if (i30 > 0) {
                    iMax2 = Math.min(i30, iMax2);
                }
                c0232c.e(gVarK4, gVarK3, iMax2, 8);
                z17 = z5;
                i12 = i32;
                z16 = false;
                i13 = i29;
            }
            if (z12) {
                gVar3 = gVar;
                gVar4 = gVar2;
                gVar5 = gVarK4;
                gVar6 = gVarK3;
                z18 = z17;
                i14 = i12;
                c2 = 1;
                i15 = 2;
            } else if (z9) {
                gVar3 = gVar;
                gVar4 = gVar2;
                gVar5 = gVarK4;
                gVar6 = gVarK3;
                z18 = z17;
                i14 = i12;
                i15 = 2;
                c2 = 1;
            } else {
                if (!zF && !zF2 && !z15) {
                    c0236c4 = c0236c2;
                    gVar15 = gVarK4;
                    z24 = z17;
                    gVar14 = gVarK6;
                } else if (!zF || zF2) {
                    if (zF || !zF2) {
                        gVar7 = gVarK6;
                        if (zF && zF2) {
                            C0237d c0237d5 = c0236c.f2260f.f2258d;
                            C0237d c0237d6 = c0236c2.f2260f.f2258d;
                            C0237d c0237d7 = this.f2281S;
                            int i38 = 6;
                            if (z16) {
                                if (i33 != 0) {
                                    if (i33 == 2) {
                                        if ((c0237d5 instanceof C0234a) || (c0237d6 instanceof C0234a)) {
                                            i16 = i33;
                                            i17 = 6;
                                            i18 = 5;
                                            z19 = true;
                                            z20 = true;
                                            z21 = true;
                                            z22 = false;
                                            i19 = 4;
                                        } else {
                                            i16 = i33;
                                            i17 = 6;
                                            i18 = 5;
                                            z19 = true;
                                            z20 = true;
                                            z21 = true;
                                            z22 = false;
                                            i19 = 5;
                                        }
                                    } else if (i33 == 1) {
                                        i16 = i33;
                                        i17 = 6;
                                        i18 = 8;
                                        z19 = true;
                                        z20 = true;
                                        z21 = true;
                                        z22 = false;
                                        i19 = 4;
                                    } else if (i33 == 3) {
                                        i16 = i33;
                                        if (this.f2263A == -1) {
                                            if (z10) {
                                                gVar8 = gVar2;
                                                i18 = 8;
                                                z19 = true;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                                i17 = z3 ? 5 : 4;
                                            } else {
                                                gVar8 = gVar2;
                                                i18 = 8;
                                                z19 = true;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                                i17 = 8;
                                            }
                                        } else if (z7) {
                                            if (i8 != 2) {
                                                z19 = true;
                                                if (i8 != 1) {
                                                    i18 = 8;
                                                    i25 = 5;
                                                }
                                                i19 = i25;
                                                z20 = z19;
                                                z21 = z20;
                                                z22 = z21;
                                                i17 = 6;
                                            } else {
                                                z19 = true;
                                            }
                                            i18 = 5;
                                            i25 = 4;
                                            i19 = i25;
                                            z20 = z19;
                                            z21 = z20;
                                            z22 = z21;
                                            i17 = 6;
                                        } else {
                                            z19 = true;
                                            if (i30 > 0) {
                                                gVar8 = gVar2;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                                i17 = 6;
                                                i18 = 5;
                                            } else {
                                                if (i30 != 0 || i13 != 0) {
                                                    gVar8 = gVar2;
                                                    z20 = true;
                                                    z21 = true;
                                                    z22 = true;
                                                    i17 = 6;
                                                    i18 = 5;
                                                } else if (z10) {
                                                    i18 = (c0237d5 == c0237d7 || c0237d6 == c0237d7) ? 5 : 4;
                                                    gVar8 = gVar2;
                                                    z20 = true;
                                                    z21 = true;
                                                    z22 = true;
                                                    i17 = 6;
                                                } else {
                                                    gVar8 = gVar2;
                                                    z20 = true;
                                                    z21 = true;
                                                    z22 = true;
                                                    i17 = 6;
                                                    i18 = 5;
                                                    i19 = 8;
                                                    if (z21 && gVarK5 == gVar7 && c0237d5 != c0237d7) {
                                                        z21 = false;
                                                        z23 = false;
                                                    } else {
                                                        z23 = z19;
                                                    }
                                                    if (z20) {
                                                        c0236c4 = c0236c2;
                                                        gVar10 = gVar7;
                                                        gVar11 = gVarK4;
                                                        z24 = z17;
                                                        i20 = i13;
                                                        c0237d = c0237d7;
                                                        z25 = z19;
                                                        i21 = 4;
                                                        c0237d2 = c0237d6;
                                                        c0237d3 = c0237d5;
                                                        gVar12 = gVarK5;
                                                        gVar13 = gVarK3;
                                                        z26 = z3;
                                                    } else {
                                                        if (z16 || z8 || z10 || gVarK5 != gVar || gVar7 != gVar8) {
                                                            z26 = z3;
                                                            i23 = i17;
                                                            i24 = i18;
                                                        } else {
                                                            z26 = false;
                                                            i24 = 8;
                                                            z23 = false;
                                                            i23 = 8;
                                                        }
                                                        c0237d2 = c0237d6;
                                                        c0236c4 = c0236c2;
                                                        z24 = z17;
                                                        c0237d3 = c0237d5;
                                                        i20 = i13;
                                                        gVar10 = gVar7;
                                                        i21 = 4;
                                                        z25 = true;
                                                        gVar12 = gVarK5;
                                                        c0237d = c0237d7;
                                                        gVar11 = gVarK4;
                                                        gVar13 = gVarK3;
                                                        c0232c.b(gVarK3, gVarK5, c0236c.d(), f2, gVar7, gVarK4, c0236c2.d(), i23);
                                                        i18 = i24;
                                                    }
                                                    z27 = z23;
                                                    if (this.f2300f0 != 8 && ((hashSet = c0236c4.f2255a) == null || hashSet.size() <= 0)) {
                                                        return;
                                                    }
                                                    gVar14 = gVar10;
                                                    if (z21) {
                                                        gVar15 = gVar11;
                                                    } else {
                                                        if (z26 && gVar12 != gVar14 && !z16 && ((c0237d3 instanceof C0234a) || (c0237d2 instanceof C0234a))) {
                                                            i18 = 6;
                                                        }
                                                        c0232c.f(gVar13, gVar12, c0236c.d(), i18);
                                                        gVar15 = gVar11;
                                                        c0232c.g(gVar15, gVar14, -c0236c2.d(), i18);
                                                    }
                                                    if (z26 || !z11 || (c0237d3 instanceof C0234a) || (c0237d2 instanceof C0234a)) {
                                                        c0237d4 = c0237d;
                                                    } else {
                                                        c0237d4 = c0237d;
                                                        if (c0237d2 != c0237d4) {
                                                            i18 = 6;
                                                            iMax = 6;
                                                            z27 = z25;
                                                        }
                                                        if (z27) {
                                                            if (z22 && (!z10 || z4)) {
                                                                if (c0237d3 != c0237d4 && c0237d2 != c0237d4) {
                                                                    i38 = iMax;
                                                                }
                                                                if ((c0237d3 instanceof f) || (c0237d2 instanceof f)) {
                                                                    i38 = 5;
                                                                }
                                                                if ((c0237d3 instanceof C0234a) || (c0237d2 instanceof C0234a)) {
                                                                    i38 = 5;
                                                                }
                                                                iMax = Math.max(z10 ? 5 : i38, iMax);
                                                            }
                                                            int iMin2 = iMax;
                                                            if (z26) {
                                                                iMin2 = Math.min(i18, iMin2);
                                                                if (z7 && !z10 && (c0237d3 == c0237d4 || c0237d2 == c0237d4)) {
                                                                    iMin2 = i21;
                                                                }
                                                            }
                                                            c0232c.e(gVar13, gVar12, c0236c.d(), iMin2);
                                                            c0232c.e(gVar15, gVar14, -c0236c2.d(), iMin2);
                                                        }
                                                        if (z26) {
                                                            q.g gVar17 = gVar12;
                                                            int iD3 = gVar == gVar17 ? c0236c.d() : 0;
                                                            if (gVar17 != gVar) {
                                                                c0232c.f(gVar13, gVar, iD3, 5);
                                                            }
                                                        }
                                                        if (!z26 || !z16 || i5 != 0 || i20 != 0) {
                                                            i22 = 5;
                                                            i28 = i22;
                                                        } else if (z16 && i16 == 3) {
                                                            c0232c.f(gVar15, gVar13, 0, 8);
                                                            i22 = 5;
                                                            i28 = i22;
                                                        } else {
                                                            i22 = 5;
                                                            c0232c.f(gVar15, gVar13, 0, 5);
                                                            i28 = i22;
                                                        }
                                                    }
                                                    iMax = i19;
                                                    if (z27) {
                                                    }
                                                    if (z26) {
                                                    }
                                                    if (!z26) {
                                                        i22 = 5;
                                                        i28 = i22;
                                                    }
                                                }
                                                i19 = 4;
                                                if (z21) {
                                                    z23 = z19;
                                                    if (z20) {
                                                    }
                                                    z27 = z23;
                                                    if (this.f2300f0 != 8) {
                                                    }
                                                    gVar14 = gVar10;
                                                    if (z21) {
                                                    }
                                                    if (z26) {
                                                        c0237d4 = c0237d;
                                                        iMax = i19;
                                                        if (z27) {
                                                        }
                                                        if (z26) {
                                                        }
                                                        if (!z26) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i19 = 5;
                                        if (z21) {
                                        }
                                    } else {
                                        i16 = i33;
                                        z19 = true;
                                        gVar8 = gVar2;
                                        i17 = 6;
                                        i18 = 5;
                                        z20 = false;
                                        z21 = false;
                                    }
                                    if (z26 || !z24) {
                                        return;
                                    }
                                    if (c0236c4.f2260f != null) {
                                        iD2 = c0236c2.d();
                                        gVar16 = gVar2;
                                    } else {
                                        gVar16 = gVar2;
                                        iD2 = 0;
                                    }
                                    if (gVar14 != gVar16) {
                                        c0232c.f(gVar16, gVar15, iD2, i28);
                                        return;
                                    }
                                    return;
                                }
                                if (i30 != 0 || i13 != 0) {
                                    i26 = 5;
                                    z28 = true;
                                    z29 = false;
                                    z30 = true;
                                    i27 = 5;
                                } else if (gVarK5.f2213f && gVar7.f2213f) {
                                    c0232c.e(gVarK3, gVarK5, c0236c.d(), 8);
                                    c0232c.e(gVarK4, gVar7, -c0236c2.d(), 8);
                                    return;
                                } else {
                                    i26 = 8;
                                    z28 = false;
                                    z29 = true;
                                    z30 = false;
                                    i27 = 8;
                                }
                                if ((c0237d5 instanceof C0234a) || (c0237d6 instanceof C0234a)) {
                                    i18 = i26;
                                    i17 = 6;
                                    z21 = z30;
                                    z19 = true;
                                    i19 = 4;
                                } else {
                                    i18 = i26;
                                    z21 = z30;
                                    i19 = i27;
                                    z19 = true;
                                    i17 = 6;
                                }
                                z22 = z29;
                                z20 = z28;
                                i16 = i33;
                                gVar8 = gVar2;
                                if (z21) {
                                }
                                if (z26) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            i16 = i33;
                            z19 = true;
                            if (gVarK5.f2213f && gVar7.f2213f) {
                                c0232c.b(gVarK3, gVarK5, c0236c.d(), f2, gVar7, gVarK4, c0236c2.d(), 8);
                                if (z3 && z17) {
                                    if (c0236c2.f2260f != null) {
                                        iD = c0236c2.d();
                                        gVar9 = gVar2;
                                    } else {
                                        gVar9 = gVar2;
                                        iD = 0;
                                    }
                                    if (gVar7 != gVar9) {
                                        c0232c.f(gVar9, gVarK4, iD, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            gVar8 = gVar2;
                            z20 = true;
                            z21 = true;
                            i17 = 6;
                            i18 = 5;
                            z22 = false;
                            i19 = 4;
                            if (z21) {
                            }
                            if (z26) {
                            }
                        }
                    } else {
                        gVar7 = gVarK6;
                        c0232c.e(gVarK4, gVar7, -c0236c2.d(), 8);
                        if (z3) {
                            c0232c.f(gVarK3, gVar, 0, 5);
                            c0236c4 = c0236c2;
                            i22 = 5;
                            gVar14 = gVar7;
                            gVar15 = gVarK4;
                            z24 = z17;
                            z26 = z3;
                            i28 = i22;
                            if (z26) {
                            }
                        }
                    }
                    c0236c4 = c0236c2;
                    gVar14 = gVar7;
                    gVar15 = gVarK4;
                    z24 = z17;
                } else {
                    c0236c4 = c0236c2;
                    gVar15 = gVarK4;
                    z24 = z17;
                    i28 = (z3 && (c0236c.f2260f.f2258d instanceof C0234a)) ? 8 : 5;
                    gVar14 = gVarK6;
                    z26 = z3;
                    if (z26) {
                    }
                }
                i22 = 5;
                z26 = z3;
                i28 = i22;
                if (z26) {
                }
            }
            if (i14 >= i15 && z3 && z18) {
                c0232c.f(gVar6, gVar3, 0, 8);
                C0236c c0236c5 = this.f2274L;
                char c3 = (z2 || c0236c5.f2260f == null) ? c2 : (char) 0;
                if (!z2 && (c0236c3 = c0236c5.f2260f) != null) {
                    C0237d c0237d8 = c0236c3.f2258d;
                    if (c0237d8.f2284V != 0.0f) {
                        int[] iArr = c0237d8.f2315o0;
                        c3 = (iArr[0] == 3 && iArr[c2] == 3) ? c2 : (char) 0;
                    }
                }
                if (c3 != 0) {
                    c0232c.f(gVar4, gVar5, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (z6) {
            c0232c.e(gVarK4, gVarK3, 0, 3);
            if (i5 > 0) {
                c0232c.f(gVarK4, gVarK3, i5, 8);
            }
            if (i6 < Integer.MAX_VALUE) {
                c0232c.g(gVarK4, gVarK3, i6, 8);
            }
        } else {
            c0232c.e(gVarK4, gVarK3, iMin, i11);
        }
        z17 = z5;
        i12 = i32;
        i13 = i29;
        z16 = z14;
        if (z12) {
        }
        if (i14 >= i15) {
        }
    }

    public final void e(C0232c c0232c) {
        c0232c.k(this.f2270H);
        c0232c.k(this.f2271I);
        c0232c.k(this.f2272J);
        c0232c.k(this.f2273K);
        if (this.f2288Z > 0) {
            c0232c.k(this.f2274L);
        }
    }

    public final void f() {
        if (this.f2295d == null) {
            C0248k c0248k = new C0248k(this);
            c0248k.h.f2375e = 4;
            c0248k.f2402i.f2375e = 5;
            c0248k.f2400f = 0;
            this.f2295d = c0248k;
        }
        if (this.f2297e == null) {
            m mVar = new m(this);
            C0243f c0243f = new C0243f(mVar);
            mVar.f2387k = c0243f;
            mVar.f2388l = null;
            mVar.h.f2375e = 6;
            mVar.f2402i.f2375e = 7;
            c0243f.f2375e = 8;
            mVar.f2400f = 1;
            this.f2297e = mVar;
        }
    }

    public C0236c g(int i2) {
        switch (q.f.a(i2)) {
            case 0:
                return null;
            case 1:
                return this.f2270H;
            case 2:
                return this.f2271I;
            case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
                return this.f2272J;
            case 4:
                return this.f2273K;
            case 5:
                return this.f2274L;
            case 6:
                return this.f2277O;
            case 7:
                return this.f2275M;
            case CTConstants.TIMESTAMP_LENGTH /* 8 */:
                return this.f2276N;
            default:
                throw new AssertionError(A.e.h(i2));
        }
    }

    public final int h(int i2) {
        int[] iArr = this.f2315o0;
        if (i2 == 0) {
            return iArr[0];
        }
        if (i2 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int i() {
        if (this.f2300f0 == 8) {
            return 0;
        }
        return this.f2283U;
    }

    public final C0237d j(int i2) {
        C0236c c0236c;
        C0236c c0236c2;
        if (i2 != 0) {
            if (i2 == 1 && (c0236c2 = (c0236c = this.f2273K).f2260f) != null && c0236c2.f2260f == c0236c) {
                return c0236c2.f2258d;
            }
            return null;
        }
        C0236c c0236c3 = this.f2272J;
        C0236c c0236c4 = c0236c3.f2260f;
        if (c0236c4 == null || c0236c4.f2260f != c0236c3) {
            return null;
        }
        return c0236c4.f2258d;
    }

    public final C0237d k(int i2) {
        C0236c c0236c;
        C0236c c0236c2;
        if (i2 != 0) {
            if (i2 == 1 && (c0236c2 = (c0236c = this.f2271I).f2260f) != null && c0236c2.f2260f == c0236c) {
                return c0236c2.f2258d;
            }
            return null;
        }
        C0236c c0236c3 = this.f2270H;
        C0236c c0236c4 = c0236c3.f2260f;
        if (c0236c4 == null || c0236c4.f2260f != c0236c3) {
            return null;
        }
        return c0236c4.f2258d;
    }

    public void l(StringBuilder sb) {
        sb.append("  " + this.f2304j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f2282T);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f2283U);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f2286X);
        sb.append("\n");
        sb.append("    actualTop:" + this.f2287Y);
        sb.append("\n");
        n(sb, "left", this.f2270H);
        n(sb, "top", this.f2271I);
        n(sb, "right", this.f2272J);
        n(sb, "bottom", this.f2273K);
        n(sb, "baseline", this.f2274L);
        n(sb, "centerX", this.f2275M);
        n(sb, "centerY", this.f2276N);
        int i2 = this.f2282T;
        int i3 = this.f2290a0;
        int[] iArr = this.f2265C;
        int i4 = iArr[0];
        int i5 = this.f2321u;
        int i6 = this.f2318r;
        float f2 = this.f2323w;
        float[] fArr = this.f2305j0;
        float f3 = fArr[0];
        m(sb, "    width", i2, i3, i4, i5, i6, f2);
        int i7 = this.f2283U;
        int i8 = this.f2292b0;
        int i9 = iArr[1];
        int i10 = this.f2324x;
        int i11 = this.f2319s;
        float f4 = this.f2325z;
        float f5 = fArr[1];
        m(sb, "    height", i7, i8, i9, i10, i11, f4);
        float f6 = this.f2284V;
        int i12 = this.f2285W;
        if (f6 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f6);
            sb.append(",");
            sb.append(i12);
            sb.append(BuildConfig.FLAVOR);
            sb.append("],\n");
        }
        E(sb, "    horizontalBias", this.f2294c0, 0.5f);
        E(sb, "    verticalBias", this.f2296d0, 0.5f);
        D(this.h0, 0, "    horizontalChainStyle", sb);
        D(this.f2303i0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int o() {
        if (this.f2300f0 == 8) {
            return 0;
        }
        return this.f2282T;
    }

    public final int p() {
        C0237d c0237d = this.f2281S;
        return (c0237d == null || !(c0237d instanceof e)) ? this.f2286X : ((e) c0237d).f2342w0 + this.f2286X;
    }

    public final int q() {
        C0237d c0237d = this.f2281S;
        return (c0237d == null || !(c0237d instanceof e)) ? this.f2287Y : ((e) c0237d).f2343x0 + this.f2287Y;
    }

    public final boolean r(int i2) {
        if (i2 == 0) {
            return (this.f2270H.f2260f != null ? 1 : 0) + (this.f2272J.f2260f != null ? 1 : 0) < 2;
        }
        return ((this.f2271I.f2260f != null ? 1 : 0) + (this.f2273K.f2260f != null ? 1 : 0)) + (this.f2274L.f2260f != null ? 1 : 0) < 2;
    }

    public final boolean s(int i2, int i3) {
        C0236c c0236c;
        C0236c c0236c2;
        C0236c c0236c3;
        C0236c c0236c4;
        if (i2 == 0) {
            C0236c c0236c5 = this.f2270H;
            C0236c c0236c6 = c0236c5.f2260f;
            if (c0236c6 != null && c0236c6.f2257c && (c0236c4 = (c0236c3 = this.f2272J).f2260f) != null && c0236c4.f2257c) {
                return (c0236c4.c() - c0236c3.d()) - (c0236c5.d() + c0236c5.f2260f.c()) >= i3;
            }
        } else {
            C0236c c0236c7 = this.f2271I;
            C0236c c0236c8 = c0236c7.f2260f;
            if (c0236c8 != null && c0236c8.f2257c && (c0236c2 = (c0236c = this.f2273K).f2260f) != null && c0236c2.f2257c) {
                return (c0236c2.c() - c0236c.d()) - (c0236c7.d() + c0236c7.f2260f.c()) >= i3;
            }
        }
        return false;
    }

    public final void t(int i2, int i3, int i4, int i5, C0237d c0237d) {
        g(i2).a(c0237d.g(i3), i4, i5);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = BuildConfig.FLAVOR;
        sb.append(BuildConfig.FLAVOR);
        if (this.g0 != null) {
            str = "id: " + this.g0 + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f2286X);
        sb.append(", ");
        sb.append(this.f2287Y);
        sb.append(") - (");
        sb.append(this.f2282T);
        sb.append(" x ");
        sb.append(this.f2283U);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i2) {
        C0236c c0236c;
        C0236c c0236c2;
        int i3 = i2 * 2;
        C0236c[] c0236cArr = this.f2278P;
        C0236c c0236c3 = c0236cArr[i3];
        C0236c c0236c4 = c0236c3.f2260f;
        return (c0236c4 == null || c0236c4.f2260f == c0236c3 || (c0236c2 = (c0236c = c0236cArr[i3 + 1]).f2260f) == null || c0236c2.f2260f != c0236c) ? false : true;
    }

    public final boolean v() {
        C0236c c0236c = this.f2270H;
        C0236c c0236c2 = c0236c.f2260f;
        if (c0236c2 != null && c0236c2.f2260f == c0236c) {
            return true;
        }
        C0236c c0236c3 = this.f2272J;
        C0236c c0236c4 = c0236c3.f2260f;
        return c0236c4 != null && c0236c4.f2260f == c0236c3;
    }

    public final boolean w() {
        C0236c c0236c = this.f2271I;
        C0236c c0236c2 = c0236c.f2260f;
        if (c0236c2 != null && c0236c2.f2260f == c0236c) {
            return true;
        }
        C0236c c0236c3 = this.f2273K;
        C0236c c0236c4 = c0236c3.f2260f;
        return c0236c4 != null && c0236c4.f2260f == c0236c3;
    }

    public final boolean x() {
        return this.f2301g && this.f2300f0 != 8;
    }

    public boolean y() {
        return this.f2306k || (this.f2270H.f2257c && this.f2272J.f2257c);
    }

    public boolean z() {
        return this.f2308l || (this.f2271I.f2257c && this.f2273K.f2257c);
    }
}
