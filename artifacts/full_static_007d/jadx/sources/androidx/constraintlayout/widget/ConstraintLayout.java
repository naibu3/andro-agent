package androidx.constraintlayout.widget;

import B0.C;
import D0.h;
import E.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.ct.CTConstants;
import org.xmlpull.v1.XmlPullParserException;
import q.C0232c;
import s.C0234a;
import s.C0235b;
import s.C0237d;
import s.e;
import t.C0239b;
import t.C0240c;
import t.C0242e;
import t.C0246i;
import t.C0248k;
import t.m;
import t.o;
import v.AbstractC0253c;
import v.C0251a;
import v.C0252b;
import v.d;
import v.f;
import v.g;
import v.i;
import v.j;
import v.l;
import v.n;
import v.p;
import v.r;
import v.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static s f953r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f954a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f955b;

    /* renamed from: c, reason: collision with root package name */
    public final e f956c;

    /* renamed from: d, reason: collision with root package name */
    public int f957d;

    /* renamed from: e, reason: collision with root package name */
    public int f958e;

    /* renamed from: f, reason: collision with root package name */
    public int f959f;

    /* renamed from: g, reason: collision with root package name */
    public int f960g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f961i;

    /* renamed from: j, reason: collision with root package name */
    public n f962j;

    /* renamed from: k, reason: collision with root package name */
    public c f963k;

    /* renamed from: l, reason: collision with root package name */
    public final int f964l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f965m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f966n;

    /* renamed from: o, reason: collision with root package name */
    public final f f967o;

    /* renamed from: p, reason: collision with root package name */
    public int f968p;

    /* renamed from: q, reason: collision with root package name */
    public int f969q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.f954a = sparseArray;
        this.f955b = new ArrayList(4);
        e eVar = new e();
        eVar.f2336p0 = new ArrayList();
        eVar.f2337q0 = new h(eVar);
        C0242e c0242e = new C0242e();
        c0242e.f2365b = true;
        c0242e.f2366c = true;
        c0242e.f2368e = new ArrayList();
        new ArrayList();
        c0242e.f2369f = null;
        c0242e.f2370g = new C0239b();
        c0242e.h = new ArrayList();
        c0242e.f2364a = eVar;
        c0242e.f2367d = eVar;
        eVar.f2338r0 = c0242e;
        eVar.t0 = null;
        eVar.f2340u0 = false;
        eVar.f2341v0 = new C0232c();
        eVar.f2344y0 = 0;
        eVar.f2345z0 = 0;
        eVar.f2326A0 = new C0235b[4];
        eVar.f2327B0 = new C0235b[4];
        eVar.f2328C0 = 257;
        eVar.f2329D0 = false;
        eVar.f2330E0 = false;
        eVar.F0 = null;
        eVar.f2331G0 = null;
        eVar.f2332H0 = null;
        eVar.f2333I0 = null;
        eVar.f2334J0 = new HashSet();
        eVar.f2335K0 = new C0239b();
        this.f956c = eVar;
        this.f957d = 0;
        this.f958e = 0;
        this.f959f = Integer.MAX_VALUE;
        this.f960g = Integer.MAX_VALUE;
        this.h = true;
        this.f961i = 257;
        this.f962j = null;
        this.f963k = null;
        this.f964l = -1;
        this.f965m = new HashMap();
        this.f966n = new SparseArray();
        f fVar = new f(this, this);
        this.f967o = fVar;
        this.f968p = 0;
        this.f969q = 0;
        eVar.f2298e0 = this;
        eVar.t0 = fVar;
        c0242e.f2369f = fVar;
        sparseArray.put(getId(), this);
        this.f962j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f2798b, 0, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f957d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f957d);
                } else if (index == 17) {
                    this.f958e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f958e);
                } else if (index == 14) {
                    this.f959f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f959f);
                } else if (index == 15) {
                    this.f960g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f960g);
                } else if (index == 113) {
                    this.f961i = typedArrayObtainStyledAttributes.getInt(index, this.f961i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f963k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f962j = nVar;
                        nVar.d(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f962j = null;
                    }
                    this.f964l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.f2328C0 = this.f961i;
        C0232c.f2189p = eVar.S(512);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static s getSharedValues() {
        if (f953r == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f953r = sVar;
        }
        return f953r;
    }

    public static v.e h() {
        v.e eVar = new v.e(-2, -2);
        eVar.f2633a = -1;
        eVar.f2635b = -1;
        eVar.f2637c = -1.0f;
        eVar.f2639d = true;
        eVar.f2641e = -1;
        eVar.f2643f = -1;
        eVar.f2645g = -1;
        eVar.h = -1;
        eVar.f2646i = -1;
        eVar.f2648j = -1;
        eVar.f2650k = -1;
        eVar.f2652l = -1;
        eVar.f2654m = -1;
        eVar.f2656n = -1;
        eVar.f2658o = -1;
        eVar.f2660p = -1;
        eVar.f2662q = 0;
        eVar.f2663r = 0.0f;
        eVar.f2664s = -1;
        eVar.f2665t = -1;
        eVar.f2666u = -1;
        eVar.f2667v = -1;
        eVar.f2668w = Integer.MIN_VALUE;
        eVar.f2669x = Integer.MIN_VALUE;
        eVar.y = Integer.MIN_VALUE;
        eVar.f2670z = Integer.MIN_VALUE;
        eVar.f2607A = Integer.MIN_VALUE;
        eVar.f2608B = Integer.MIN_VALUE;
        eVar.f2609C = Integer.MIN_VALUE;
        eVar.f2610D = 0;
        eVar.f2611E = 0.5f;
        eVar.f2612F = 0.5f;
        eVar.f2613G = null;
        eVar.f2614H = -1.0f;
        eVar.f2615I = -1.0f;
        eVar.f2616J = 0;
        eVar.f2617K = 0;
        eVar.f2618L = 0;
        eVar.f2619M = 0;
        eVar.f2620N = 0;
        eVar.f2621O = 0;
        eVar.f2622P = 0;
        eVar.f2623Q = 0;
        eVar.f2624R = 1.0f;
        eVar.f2625S = 1.0f;
        eVar.f2626T = -1;
        eVar.f2627U = -1;
        eVar.f2628V = -1;
        eVar.f2629W = false;
        eVar.f2630X = false;
        eVar.f2631Y = null;
        eVar.f2632Z = 0;
        eVar.f2634a0 = true;
        eVar.f2636b0 = true;
        eVar.f2638c0 = false;
        eVar.f2640d0 = false;
        eVar.f2642e0 = false;
        eVar.f2644f0 = -1;
        eVar.g0 = -1;
        eVar.h0 = -1;
        eVar.f2647i0 = -1;
        eVar.f2649j0 = Integer.MIN_VALUE;
        eVar.f2651k0 = Integer.MIN_VALUE;
        eVar.f2653l0 = 0.5f;
        eVar.f2661p0 = new C0237d();
        return eVar;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f955b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC0253c) arrayList.get(i2)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i4 = Integer.parseInt(strArrSplit[0]);
                        int i5 = Integer.parseInt(strArrSplit[1]);
                        int i6 = Integer.parseInt(strArrSplit[2]);
                        int i7 = (int) ((i4 / 1080.0f) * width);
                        int i8 = (int) ((i5 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i7;
                        float f3 = i8;
                        float f4 = i7 + ((int) ((i6 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i8 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x02e9 -> B:157:0x02d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(boolean z2, View view, C0237d c0237d, v.e eVar, SparseArray sparseArray) throws NumberFormatException {
        int i2;
        float f2;
        C0237d c0237d2;
        C0237d c0237d3;
        C0237d c0237d4;
        C0237d c0237d5;
        int i3;
        int i4;
        float fAbs;
        int i5;
        int i6;
        eVar.a();
        c0237d.f2300f0 = view.getVisibility();
        c0237d.f2298e0 = view;
        if (view instanceof AbstractC0253c) {
            boolean z3 = this.f956c.f2340u0;
            C0251a c0251a = (C0251a) ((AbstractC0253c) view);
            int i7 = c0251a.h;
            c0251a.f2590i = i7;
            if (z3) {
                if (i7 == 5) {
                    c0251a.f2590i = 1;
                } else if (i7 == 6) {
                    c0251a.f2590i = 0;
                }
            } else if (i7 == 5) {
                c0251a.f2590i = 0;
            } else if (i7 == 6) {
                c0251a.f2590i = 1;
            }
            if (c0237d instanceof C0234a) {
                ((C0234a) c0237d).f2236r0 = c0251a.f2590i;
            }
        }
        int i8 = -1;
        if (eVar.f2640d0) {
            s.f fVar = (s.f) c0237d;
            int i9 = eVar.f2655m0;
            int i10 = eVar.f2657n0;
            float f3 = eVar.f2659o0;
            if (f3 != -1.0f) {
                if (f3 > -1.0f) {
                    fVar.f2346p0 = f3;
                    fVar.f2347q0 = -1;
                    fVar.f2348r0 = -1;
                    return;
                }
                return;
            }
            if (i9 != -1) {
                if (i9 > -1) {
                    fVar.f2346p0 = -1.0f;
                    fVar.f2347q0 = i9;
                    fVar.f2348r0 = -1;
                    return;
                }
                return;
            }
            if (i10 == -1 || i10 <= -1) {
                return;
            }
            fVar.f2346p0 = -1.0f;
            fVar.f2347q0 = -1;
            fVar.f2348r0 = i10;
            return;
        }
        int i11 = eVar.f2644f0;
        int i12 = eVar.g0;
        int i13 = eVar.h0;
        int i14 = eVar.f2647i0;
        int i15 = eVar.f2649j0;
        int i16 = eVar.f2651k0;
        float f4 = eVar.f2653l0;
        int i17 = eVar.f2660p;
        if (i17 != -1) {
            C0237d c0237d6 = (C0237d) sparseArray.get(i17);
            if (c0237d6 != null) {
                float f5 = eVar.f2663r;
                i6 = 4;
                c0237d.t(7, 7, eVar.f2662q, 0, c0237d6);
                c0237d.f2266D = f5;
            } else {
                i6 = 4;
            }
            i2 = i6;
        } else {
            if (i11 != -1) {
                C0237d c0237d7 = (C0237d) sparseArray.get(i11);
                if (c0237d7 != null) {
                    i2 = 4;
                    f2 = f4;
                    c0237d.t(2, 2, ((ViewGroup.MarginLayoutParams) eVar).leftMargin, i15, c0237d7);
                } else {
                    i2 = 4;
                    f2 = f4;
                }
            } else {
                i2 = 4;
                f2 = f4;
                if (i12 != -1 && (c0237d2 = (C0237d) sparseArray.get(i12)) != null) {
                    c0237d.t(2, 4, ((ViewGroup.MarginLayoutParams) eVar).leftMargin, i15, c0237d2);
                }
            }
            if (i13 != -1) {
                C0237d c0237d8 = (C0237d) sparseArray.get(i13);
                if (c0237d8 != null) {
                    c0237d.t(i2, 2, ((ViewGroup.MarginLayoutParams) eVar).rightMargin, i16, c0237d8);
                }
            } else if (i14 != -1 && (c0237d3 = (C0237d) sparseArray.get(i14)) != null) {
                c0237d.t(i2, i2, ((ViewGroup.MarginLayoutParams) eVar).rightMargin, i16, c0237d3);
            }
            int i18 = eVar.f2646i;
            if (i18 != -1) {
                C0237d c0237d9 = (C0237d) sparseArray.get(i18);
                if (c0237d9 != null) {
                    c0237d.t(3, 3, ((ViewGroup.MarginLayoutParams) eVar).topMargin, eVar.f2669x, c0237d9);
                }
            } else {
                int i19 = eVar.f2648j;
                if (i19 != -1 && (c0237d4 = (C0237d) sparseArray.get(i19)) != null) {
                    c0237d.t(3, 5, ((ViewGroup.MarginLayoutParams) eVar).topMargin, eVar.f2669x, c0237d4);
                }
            }
            int i20 = eVar.f2650k;
            if (i20 != -1) {
                C0237d c0237d10 = (C0237d) sparseArray.get(i20);
                if (c0237d10 != null) {
                    c0237d.t(5, 3, ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, eVar.f2670z, c0237d10);
                }
            } else {
                int i21 = eVar.f2652l;
                if (i21 != -1 && (c0237d5 = (C0237d) sparseArray.get(i21)) != null) {
                    c0237d.t(5, 5, ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, eVar.f2670z, c0237d5);
                }
            }
            int i22 = eVar.f2654m;
            if (i22 != -1) {
                l(c0237d, eVar, sparseArray, i22, 6);
            } else {
                int i23 = eVar.f2656n;
                if (i23 != -1) {
                    l(c0237d, eVar, sparseArray, i23, 3);
                } else {
                    int i24 = eVar.f2658o;
                    if (i24 != -1) {
                        l(c0237d, eVar, sparseArray, i24, 5);
                    }
                }
            }
            float f6 = f2;
            if (f6 >= 0.0f) {
                c0237d.f2294c0 = f6;
            }
            float f7 = eVar.f2612F;
            if (f7 >= 0.0f) {
                c0237d.f2296d0 = f7;
            }
        }
        if (z2 && ((i5 = eVar.f2626T) != -1 || eVar.f2627U != -1)) {
            int i25 = eVar.f2627U;
            c0237d.f2286X = i5;
            c0237d.f2287Y = i25;
        }
        if (eVar.f2634a0) {
            c0237d.I(1);
            c0237d.K(((ViewGroup.MarginLayoutParams) eVar).width);
            if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                c0237d.I(2);
            }
        } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
            if (eVar.f2629W) {
                c0237d.I(3);
            } else {
                c0237d.I(4);
            }
            c0237d.g(2).f2261g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            c0237d.g(i2).f2261g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        } else {
            c0237d.I(3);
            c0237d.K(0);
        }
        if (eVar.f2636b0) {
            c0237d.J(1);
            c0237d.H(((ViewGroup.MarginLayoutParams) eVar).height);
            if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                c0237d.J(2);
            }
        } else if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
            if (eVar.f2630X) {
                c0237d.J(3);
            } else {
                c0237d.J(4);
            }
            c0237d.g(3).f2261g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            c0237d.g(5).f2261g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
        } else {
            c0237d.J(3);
            c0237d.H(0);
        }
        String str = eVar.f2613G;
        if (str == null || str.length() == 0) {
            c0237d.f2284V = 0.0f;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i3 = 1;
                i4 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i3 = 1;
                    i8 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i3 = 1;
                    i8 = 1;
                } else {
                    i3 = 1;
                }
                i4 = iIndexOf + i3;
            }
            int iIndexOf2 = str.indexOf(58);
            if (iIndexOf2 < 0 || iIndexOf2 >= length - i3) {
                String strSubstring2 = str.substring(i4);
                fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
                if (fAbs > 0.0f) {
                    c0237d.f2284V = fAbs;
                    c0237d.f2285W = i8;
                }
            } else {
                String strSubstring3 = str.substring(i4, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + i3);
                if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                    float f8 = Float.parseFloat(strSubstring3);
                    float f9 = Float.parseFloat(strSubstring4);
                    if (f8 > 0.0f && f9 > 0.0f) {
                        fAbs = i8 == 1 ? Math.abs(f9 / f8) : Math.abs(f8 / f9);
                    }
                    if (fAbs > 0.0f) {
                    }
                }
            }
        }
        float f10 = eVar.f2614H;
        float[] fArr = c0237d.f2305j0;
        fArr[0] = f10;
        fArr[1] = eVar.f2615I;
        c0237d.h0 = eVar.f2616J;
        c0237d.f2303i0 = eVar.f2617K;
        int i26 = eVar.f2632Z;
        if (i26 >= 0 && i26 <= 3) {
            c0237d.f2317q = i26;
        }
        int i27 = eVar.f2618L;
        int i28 = eVar.f2620N;
        int i29 = eVar.f2622P;
        float f11 = eVar.f2624R;
        c0237d.f2318r = i27;
        c0237d.f2321u = i28;
        if (i29 == Integer.MAX_VALUE) {
            i29 = 0;
        }
        c0237d.f2322v = i29;
        c0237d.f2323w = f11;
        if (f11 > 0.0f && f11 < 1.0f && i27 == 0) {
            c0237d.f2318r = 2;
        }
        int i30 = eVar.f2619M;
        int i31 = eVar.f2621O;
        int i32 = eVar.f2623Q;
        float f12 = eVar.f2625S;
        c0237d.f2319s = i30;
        c0237d.f2324x = i31;
        c0237d.y = i32 == Integer.MAX_VALUE ? 0 : i32;
        c0237d.f2325z = f12;
        if (f12 <= 0.0f || f12 >= 1.0f || i30 != 0) {
            return;
        }
        c0237d.f2319s = 2;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) throws NumberFormatException {
        Context context = getContext();
        v.e eVar = new v.e(context, attributeSet);
        eVar.f2633a = -1;
        eVar.f2635b = -1;
        eVar.f2637c = -1.0f;
        eVar.f2639d = true;
        eVar.f2641e = -1;
        eVar.f2643f = -1;
        eVar.f2645g = -1;
        eVar.h = -1;
        eVar.f2646i = -1;
        eVar.f2648j = -1;
        eVar.f2650k = -1;
        eVar.f2652l = -1;
        eVar.f2654m = -1;
        eVar.f2656n = -1;
        eVar.f2658o = -1;
        eVar.f2660p = -1;
        eVar.f2662q = 0;
        eVar.f2663r = 0.0f;
        eVar.f2664s = -1;
        eVar.f2665t = -1;
        eVar.f2666u = -1;
        eVar.f2667v = -1;
        eVar.f2668w = Integer.MIN_VALUE;
        eVar.f2669x = Integer.MIN_VALUE;
        eVar.y = Integer.MIN_VALUE;
        eVar.f2670z = Integer.MIN_VALUE;
        eVar.f2607A = Integer.MIN_VALUE;
        eVar.f2608B = Integer.MIN_VALUE;
        eVar.f2609C = Integer.MIN_VALUE;
        eVar.f2610D = 0;
        eVar.f2611E = 0.5f;
        eVar.f2612F = 0.5f;
        eVar.f2613G = null;
        eVar.f2614H = -1.0f;
        eVar.f2615I = -1.0f;
        eVar.f2616J = 0;
        eVar.f2617K = 0;
        eVar.f2618L = 0;
        eVar.f2619M = 0;
        eVar.f2620N = 0;
        eVar.f2621O = 0;
        eVar.f2622P = 0;
        eVar.f2623Q = 0;
        eVar.f2624R = 1.0f;
        eVar.f2625S = 1.0f;
        eVar.f2626T = -1;
        eVar.f2627U = -1;
        eVar.f2628V = -1;
        eVar.f2629W = false;
        eVar.f2630X = false;
        eVar.f2631Y = null;
        eVar.f2632Z = 0;
        eVar.f2634a0 = true;
        eVar.f2636b0 = true;
        eVar.f2638c0 = false;
        eVar.f2640d0 = false;
        eVar.f2642e0 = false;
        eVar.f2644f0 = -1;
        eVar.g0 = -1;
        eVar.h0 = -1;
        eVar.f2647i0 = -1;
        eVar.f2649j0 = Integer.MIN_VALUE;
        eVar.f2651k0 = Integer.MIN_VALUE;
        eVar.f2653l0 = 0.5f;
        eVar.f2661p0 = new C0237d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f2798b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = d.f2606a.get(index);
            switch (i3) {
                case 1:
                    eVar.f2628V = typedArrayObtainStyledAttributes.getInt(index, eVar.f2628V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2660p);
                    eVar.f2660p = resourceId;
                    if (resourceId == -1) {
                        eVar.f2660p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
                    eVar.f2662q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f2662q);
                    break;
                case 4:
                    float f2 = typedArrayObtainStyledAttributes.getFloat(index, eVar.f2663r) % 360.0f;
                    eVar.f2663r = f2;
                    if (f2 < 0.0f) {
                        eVar.f2663r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    eVar.f2633a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f2633a);
                    break;
                case 6:
                    eVar.f2635b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f2635b);
                    break;
                case 7:
                    eVar.f2637c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f2637c);
                    break;
                case CTConstants.TIMESTAMP_LENGTH /* 8 */:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2641e);
                    eVar.f2641e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f2641e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2643f);
                    eVar.f2643f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f2643f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2645g);
                    eVar.f2645g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f2645g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.h);
                    eVar.h = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2646i);
                    eVar.f2646i = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.f2646i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2648j);
                    eVar.f2648j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f2648j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2650k);
                    eVar.f2650k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f2650k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2652l);
                    eVar.f2652l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f2652l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2654m);
                    eVar.f2654m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f2654m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2664s);
                    eVar.f2664s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f2664s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2665t);
                    eVar.f2665t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f2665t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2666u);
                    eVar.f2666u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f2666u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2667v);
                    eVar.f2667v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f2667v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    eVar.f2668w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f2668w);
                    break;
                case 22:
                    eVar.f2669x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f2669x);
                    break;
                case 23:
                    eVar.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.y);
                    break;
                case 24:
                    eVar.f2670z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f2670z);
                    break;
                case 25:
                    eVar.f2607A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f2607A);
                    break;
                case 26:
                    eVar.f2608B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f2608B);
                    break;
                case 27:
                    eVar.f2629W = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f2629W);
                    break;
                case 28:
                    eVar.f2630X = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f2630X);
                    break;
                case 29:
                    eVar.f2611E = typedArrayObtainStyledAttributes.getFloat(index, eVar.f2611E);
                    break;
                case 30:
                    eVar.f2612F = typedArrayObtainStyledAttributes.getFloat(index, eVar.f2612F);
                    break;
                case 31:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.f2618L = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.f2619M = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        eVar.f2620N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f2620N);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f2620N) == -2) {
                            eVar.f2620N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        eVar.f2622P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f2622P);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f2622P) == -2) {
                            eVar.f2622P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    eVar.f2624R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.f2624R));
                    eVar.f2618L = 2;
                    break;
                case 36:
                    try {
                        eVar.f2621O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f2621O);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f2621O) == -2) {
                            eVar.f2621O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        eVar.f2623Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f2623Q);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f2623Q) == -2) {
                            eVar.f2623Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    eVar.f2625S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.f2625S));
                    eVar.f2619M = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            n.g(eVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            eVar.f2614H = typedArrayObtainStyledAttributes.getFloat(index, eVar.f2614H);
                            break;
                        case 46:
                            eVar.f2615I = typedArrayObtainStyledAttributes.getFloat(index, eVar.f2615I);
                            break;
                        case 47:
                            eVar.f2616J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            eVar.f2617K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            eVar.f2626T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f2626T);
                            break;
                        case 50:
                            eVar.f2627U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f2627U);
                            break;
                        case 51:
                            eVar.f2631Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2656n);
                            eVar.f2656n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f2656n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f2658o);
                            eVar.f2658o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f2658o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            eVar.f2610D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f2610D);
                            break;
                        case 55:
                            eVar.f2609C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f2609C);
                            break;
                        default:
                            switch (i3) {
                                case 64:
                                    n.f(eVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.f(eVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.f2632Z = typedArrayObtainStyledAttributes.getInt(index, eVar.f2632Z);
                                    break;
                                case 67:
                                    eVar.f2639d = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f2639d);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getMaxHeight() {
        return this.f960g;
    }

    public int getMaxWidth() {
        return this.f959f;
    }

    public int getMinHeight() {
        return this.f958e;
    }

    public int getMinWidth() {
        return this.f957d;
    }

    public int getOptimizationLevel() {
        return this.f956c.f2328C0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f956c;
        if (eVar.f2304j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f2304j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f2304j = "parent";
            }
        }
        if (eVar.g0 == null) {
            eVar.g0 = eVar.f2304j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.g0);
        }
        Iterator it = eVar.f2336p0.iterator();
        while (it.hasNext()) {
            C0237d c0237d = (C0237d) it.next();
            View view = c0237d.f2298e0;
            if (view != null) {
                if (c0237d.f2304j == null && (id = view.getId()) != -1) {
                    c0237d.f2304j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0237d.g0 == null) {
                    c0237d.g0 = c0237d.f2304j;
                    Log.v("ConstraintLayout", " setDebugName " + c0237d.g0);
                }
            }
        }
        eVar.l(sb);
        return sb.toString();
    }

    public final C0237d i(View view) {
        if (view == this) {
            return this.f956c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof v.e) {
            return ((v.e) view.getLayoutParams()).f2661p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof v.e) {
            return ((v.e) view.getLayoutParams()).f2661p0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int eventType;
        C c2;
        Context context = getContext();
        c cVar = new c();
        cVar.f271b = new SparseArray();
        cVar.f272c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            eventType = xml.getEventType();
            c2 = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        while (true) {
            char c3 = 1;
            if (eventType == 1) {
                this.f963k = cVar;
                return;
            }
            if (eventType == 0) {
                xml.getName();
            } else if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (!name.equals("ConstraintSet")) {
                            c3 = 65535;
                            break;
                        } else {
                            c3 = 4;
                            break;
                        }
                    case 80204913:
                        if (name.equals("State")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                if (c3 == 2) {
                    c2 = new C(context, xml);
                    ((SparseArray) cVar.f271b).put(c2.f72a, c2);
                } else if (c3 == 3) {
                    g gVar = new g(context, xml);
                    if (c2 != null) {
                        ((ArrayList) c2.f74c).add(gVar);
                    }
                } else if (c3 == 4) {
                    cVar.g(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(e eVar, int i2, int i3, int i4) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i5;
        int i6;
        boolean z2;
        f fVar;
        int i7;
        int i8;
        int i9;
        boolean zP;
        ArrayList arrayList;
        int i10;
        int i11;
        f fVar2;
        boolean z3;
        C0248k c0248k;
        m mVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        boolean z4;
        Iterator it;
        Iterator it2;
        boolean z5;
        e eVar2 = eVar;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i18 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        f fVar3 = this.f967o;
        fVar3.f2672b = iMax3;
        fVar3.f2673c = iMax4;
        fVar3.f2674d = paddingWidth;
        fVar3.f2675e = i18;
        fVar3.f2676f = i3;
        fVar3.f2677g = i4;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i19 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i20 = size - paddingWidth;
        int i21 = size2 - i18;
        int i22 = fVar3.f2675e;
        int i23 = fVar3.f2674d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    iMin = 0;
                } else {
                    iMin = Math.min(this.f959f - i23, i20);
                    i19 = 1;
                }
            } else if (childCount == 0) {
                iMax = Math.max(0, this.f957d);
                iMin = iMax;
                i19 = 2;
            } else {
                iMin = 0;
                i19 = 2;
            }
        } else if (childCount == 0) {
            iMax = Math.max(0, this.f957d);
            iMin = iMax;
            i19 = 2;
        } else {
            iMin = i20;
            i19 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f960g - i22, i21);
                i5 = 1;
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.f958e);
                iMin2 = iMax2;
                i5 = 2;
            } else {
                iMin2 = 0;
                i5 = 2;
            }
        } else if (childCount == 0) {
            iMax2 = Math.max(0, this.f958e);
            iMin2 = iMax2;
            i5 = 2;
        } else {
            iMin2 = i21;
            i5 = 2;
        }
        int iO = eVar.o();
        C0242e c0242e = eVar2.f2338r0;
        int i24 = iMin;
        if (i24 != iO || iMin2 != eVar.i()) {
            c0242e.f2366c = true;
        }
        eVar2.f2286X = 0;
        eVar2.f2287Y = 0;
        int i25 = this.f959f - i23;
        int[] iArr2 = eVar2.f2265C;
        iArr2[0] = i25;
        iArr2[1] = this.f960g - i22;
        eVar2.f2290a0 = 0;
        eVar2.f2292b0 = 0;
        eVar2.I(i19);
        eVar2.K(i24);
        eVar2.J(i5);
        eVar2.H(iMin2);
        int i26 = this.f957d - i23;
        if (i26 < 0) {
            eVar2.f2290a0 = 0;
        } else {
            eVar2.f2290a0 = i26;
        }
        int i27 = this.f958e - i22;
        if (i27 < 0) {
            eVar2.f2292b0 = 0;
        } else {
            eVar2.f2292b0 = i27;
        }
        eVar2.f2342w0 = iMax5;
        eVar2.f2343x0 = iMax3;
        h hVar = eVar2.f2337q0;
        hVar.getClass();
        f fVar4 = eVar2.t0;
        int size3 = eVar2.f2336p0.size();
        int iO2 = eVar.o();
        int i28 = eVar.i();
        boolean zC = s.g.c(i2, 128);
        boolean z6 = zC || s.g.c(i2, 64);
        if (z6) {
            for (int i29 = 0; i29 < size3; i29++) {
                C0237d c0237d = (C0237d) eVar2.f2336p0.get(i29);
                int[] iArr3 = c0237d.f2315o0;
                boolean z7 = (iArr3[0] == 3) && (iArr3[1] == 3) && c0237d.f2284V > 0.0f;
                if ((c0237d.v() && z7) || ((c0237d.w() && z7) || c0237d.v() || c0237d.w())) {
                    i6 = 1073741824;
                    z6 = false;
                    break;
                }
            }
            i6 = 1073741824;
        } else {
            i6 = 1073741824;
        }
        boolean z8 = ((mode == i6 && mode2 == i6) || zC) & z6;
        if (z8) {
            int iMin3 = Math.min(iArr2[0], i20);
            int iMin4 = Math.min(iArr2[1], i21);
            if (mode == 1073741824 && eVar.o() != iMin3) {
                eVar2.K(iMin3);
                eVar2.f2338r0.f2365b = true;
            }
            if (mode2 == 1073741824 && eVar.i() != iMin4) {
                eVar2.H(iMin4);
                eVar2.f2338r0.f2365b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z9 = c0242e.f2365b;
                e eVar3 = c0242e.f2364a;
                if (z9 || c0242e.f2366c) {
                    Iterator it3 = eVar3.f2336p0.iterator();
                    while (it3.hasNext()) {
                        C0237d c0237d2 = (C0237d) it3.next();
                        c0237d2.f();
                        c0237d2.f2289a = false;
                        c0237d2.f2295d.n();
                        c0237d2.f2297e.m();
                    }
                    i14 = 0;
                    eVar3.f();
                    eVar3.f2289a = false;
                    eVar3.f2295d.n();
                    eVar3.f2297e.m();
                    c0242e.f2366c = false;
                } else {
                    i14 = 0;
                }
                c0242e.b(c0242e.f2367d);
                eVar3.f2286X = i14;
                eVar3.f2287Y = i14;
                int iH = eVar3.h(i14);
                int iH2 = eVar3.h(1);
                if (c0242e.f2365b) {
                    c0242e.c();
                }
                int iP = eVar3.p();
                int iQ = eVar3.q();
                fVar = fVar4;
                eVar3.f2295d.h.d(iP);
                eVar3.f2297e.h.d(iQ);
                c0242e.g();
                ArrayList arrayList2 = c0242e.f2368e;
                z2 = z8;
                if (iH == 2 || iH2 == 2) {
                    if (zC) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((o) it4.next()).k()) {
                                    zC = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (zC && iH == 2) {
                        eVar3.I(1);
                        i7 = iO2;
                        eVar3.K(c0242e.d(eVar3, 0));
                        eVar3.f2295d.f2399e.d(eVar3.o());
                    } else {
                        i7 = iO2;
                    }
                    if (zC && iH2 == 2) {
                        i15 = 1;
                        eVar3.J(1);
                        eVar3.H(c0242e.d(eVar3, 1));
                        eVar3.f2297e.f2399e.d(eVar3.i());
                    }
                    iArr = eVar3.f2315o0;
                    i8 = i28;
                    i16 = iArr[0];
                    if (i16 != i15 || i16 == 4) {
                        int iO3 = eVar3.o() + iP;
                        eVar3.f2295d.f2402i.d(iO3);
                        eVar3.f2295d.f2399e.d(iO3 - iP);
                        c0242e.g();
                        i17 = iArr[1];
                        if (i17 != 1 || i17 == 4) {
                            int i30 = eVar3.i() + iQ;
                            eVar3.f2297e.f2402i.d(i30);
                            eVar3.f2297e.f2399e.d(i30 - iQ);
                        }
                        c0242e.g();
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        o oVar = (o) it.next();
                        if (oVar.f2396b != eVar3 || oVar.f2401g) {
                            oVar.e();
                        }
                    }
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        o oVar2 = (o) it2.next();
                        if (z4 || oVar2.f2396b != eVar3) {
                            if (!oVar2.h.f2379j || ((!oVar2.f2402i.f2379j && !(oVar2 instanceof C0246i)) || (!oVar2.f2399e.f2379j && !(oVar2 instanceof C0240c) && !(oVar2 instanceof C0246i)))) {
                                z5 = false;
                                break;
                            }
                        }
                    }
                    z5 = true;
                    eVar3.I(iH);
                    eVar3.J(iH2);
                    zP = z5;
                    i13 = 1073741824;
                    i9 = 2;
                } else {
                    i7 = iO2;
                }
                i15 = 1;
                iArr = eVar3.f2315o0;
                i8 = i28;
                i16 = iArr[0];
                if (i16 != i15) {
                    int iO32 = eVar3.o() + iP;
                    eVar3.f2295d.f2402i.d(iO32);
                    eVar3.f2295d.f2399e.d(iO32 - iP);
                    c0242e.g();
                    i17 = iArr[1];
                    if (i17 != 1) {
                        int i302 = eVar3.i() + iQ;
                        eVar3.f2297e.f2402i.d(i302);
                        eVar3.f2297e.f2399e.d(i302 - iQ);
                        c0242e.g();
                        z4 = true;
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                        }
                        z5 = true;
                        eVar3.I(iH);
                        eVar3.J(iH2);
                        zP = z5;
                        i13 = 1073741824;
                        i9 = 2;
                    }
                }
            } else {
                z2 = z8;
                fVar = fVar4;
                i7 = iO2;
                i8 = i28;
                boolean z10 = c0242e.f2365b;
                e eVar4 = c0242e.f2364a;
                if (z10) {
                    Iterator it5 = eVar4.f2336p0.iterator();
                    while (it5.hasNext()) {
                        C0237d c0237d3 = (C0237d) it5.next();
                        c0237d3.f();
                        c0237d3.f2289a = false;
                        C0248k c0248k2 = c0237d3.f2295d;
                        c0248k2.f2399e.f2379j = false;
                        c0248k2.f2401g = false;
                        c0248k2.n();
                        m mVar2 = c0237d3.f2297e;
                        mVar2.f2399e.f2379j = false;
                        mVar2.f2401g = false;
                        mVar2.m();
                    }
                    i12 = 0;
                    eVar4.f();
                    eVar4.f2289a = false;
                    C0248k c0248k3 = eVar4.f2295d;
                    c0248k3.f2399e.f2379j = false;
                    c0248k3.f2401g = false;
                    c0248k3.n();
                    m mVar3 = eVar4.f2297e;
                    mVar3.f2399e.f2379j = false;
                    mVar3.f2401g = false;
                    mVar3.m();
                    c0242e.c();
                } else {
                    i12 = 0;
                }
                c0242e.b(c0242e.f2367d);
                eVar4.f2286X = i12;
                eVar4.f2287Y = i12;
                eVar4.f2295d.h.d(i12);
                eVar4.f2297e.h.d(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    zP = eVar2.P(i12, zC);
                    i9 = 1;
                } else {
                    i9 = 0;
                    zP = true;
                }
                if (mode2 == 1073741824) {
                    zP &= eVar2.P(1, zC);
                    i9++;
                }
            }
            if (zP) {
                eVar2.L(mode == i13, mode2 == i13);
            }
        } else {
            z2 = z8;
            fVar = fVar4;
            i7 = iO2;
            i8 = i28;
            i9 = 0;
            zP = false;
        }
        if (zP && i9 == 2) {
            return;
        }
        int i31 = eVar2.f2328C0;
        if (size3 > 0) {
            int size4 = eVar2.f2336p0.size();
            boolean zS = eVar2.S(64);
            f fVar5 = eVar2.t0;
            for (int i32 = 0; i32 < size4; i32++) {
                C0237d c0237d4 = (C0237d) eVar2.f2336p0.get(i32);
                if (!(c0237d4 instanceof s.f) && !(c0237d4 instanceof C0234a)) {
                    c0237d4.getClass();
                    if (!zS || (c0248k = c0237d4.f2295d) == null || (mVar = c0237d4.f2297e) == null || !c0248k.f2399e.f2379j || !mVar.f2399e.f2379j) {
                        int iH3 = c0237d4.h(0);
                        int iH4 = c0237d4.h(1);
                        boolean z11 = iH3 == 3 && c0237d4.f2318r != 1 && iH4 == 3 && c0237d4.f2319s != 1;
                        if (!z11 && eVar2.S(1)) {
                            if (iH3 == 3 && c0237d4.f2318r == 0 && iH4 != 3 && !c0237d4.v()) {
                                z11 = true;
                            }
                            if (iH4 == 3 && c0237d4.f2319s == 0 && iH3 != 3 && !c0237d4.v()) {
                                z11 = true;
                            }
                            if (iH3 == 3 || iH4 == 3) {
                                if (c0237d4.f2284V > 0.0f) {
                                    z11 = true;
                                }
                            }
                            if (z11) {
                                hVar.o(0, c0237d4, fVar5);
                            }
                        }
                        if (z11) {
                        }
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar5.f2671a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i33 = 0; i33 < childCount2; i33++) {
                constraintLayout.getChildAt(i33);
            }
            ArrayList arrayList3 = constraintLayout.f955b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i34 = 0; i34 < size5; i34++) {
                    ((AbstractC0253c) arrayList3.get(i34)).getClass();
                }
            }
        }
        hVar.u(eVar2);
        ArrayList arrayList4 = (ArrayList) hVar.f258b;
        int size6 = arrayList4.size();
        int i35 = i7;
        int i36 = i8;
        boolean z12 = false;
        if (size3 > 0) {
            hVar.t(eVar2, 0, i35, i36);
        }
        if (size6 > 0) {
            int[] iArr4 = eVar2.f2315o0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int iO4 = eVar.o();
            e eVar5 = (e) hVar.f260d;
            int iMax7 = Math.max(iO4, eVar5.f2290a0);
            int iMax8 = Math.max(eVar.i(), eVar5.f2292b0);
            for (int i37 = 0; i37 < size6; i37++) {
            }
            int i38 = 0;
            int i39 = 2;
            ArrayList arrayList5 = arrayList4;
            while (true) {
                if (i38 >= i39) {
                    break;
                }
                boolean z15 = z12;
                boolean z16 = z15;
                ?? r2 = arrayList5;
                for (?? r13 = z15; r13 < size6; r13++) {
                    C0237d c0237d5 = (C0237d) r2.get(r13);
                    if ((c0237d5 instanceof C0234a) || (c0237d5 instanceof s.f)) {
                        arrayList = r2;
                    } else {
                        arrayList = r2;
                        if (c0237d5.f2300f0 != 8 && (!z2 || !c0237d5.f2295d.f2399e.f2379j || !c0237d5.f2297e.f2399e.f2379j)) {
                            int iO5 = c0237d5.o();
                            int i40 = c0237d5.i();
                            i10 = size6;
                            int i41 = c0237d5.f2288Z;
                            i11 = i31;
                            fVar2 = fVar;
                            boolean zO = hVar.o(i38 == 1 ? 2 : 1, c0237d5, fVar2) | z16;
                            int iO6 = c0237d5.o();
                            boolean z17 = zO;
                            int i42 = c0237d5.i();
                            if (iO6 != iO5) {
                                c0237d5.K(iO6);
                                if (z13 && c0237d5.p() + c0237d5.f2282T > iMax7) {
                                    iMax7 = Math.max(iMax7, c0237d5.g(4).d() + c0237d5.p() + c0237d5.f2282T);
                                }
                                z17 = true;
                            }
                            if (i42 != i40) {
                                c0237d5.H(i42);
                                if (z14 && c0237d5.q() + c0237d5.f2283U > iMax8) {
                                    iMax8 = Math.max(iMax8, c0237d5.g(5).d() + c0237d5.q() + c0237d5.f2283U);
                                }
                                z3 = true;
                            } else {
                                z3 = z17;
                            }
                            if (c0237d5.f2267E && i41 != c0237d5.f2288Z) {
                                z3 = true;
                            }
                        }
                        r2 = arrayList;
                        fVar = fVar2;
                        z16 = z3;
                        size6 = i10;
                        i31 = i11;
                    }
                    i11 = i31;
                    i10 = size6;
                    z3 = z16;
                    fVar2 = fVar;
                    r2 = arrayList;
                    fVar = fVar2;
                    z16 = z3;
                    size6 = i10;
                    i31 = i11;
                }
                int i43 = i31;
                ArrayList arrayList6 = r2;
                int i44 = size6;
                f fVar6 = fVar;
                if (!z16) {
                    eVar2 = eVar;
                    i31 = i43;
                    break;
                }
                i38++;
                eVar2 = eVar;
                hVar.t(eVar2, i38, i35, i36);
                fVar = fVar6;
                size6 = i44;
                i31 = i43;
                i39 = 2;
                z12 = false;
                arrayList5 = arrayList6;
            }
        }
        eVar2.f2328C0 = i31;
        C0232c.f2189p = eVar2.S(512);
    }

    public final void l(C0237d c0237d, v.e eVar, SparseArray sparseArray, int i2, int i3) {
        View view = (View) this.f954a.get(i2);
        C0237d c0237d2 = (C0237d) sparseArray.get(i2);
        if (c0237d2 == null || view == null || !(view.getLayoutParams() instanceof v.e)) {
            return;
        }
        eVar.f2638c0 = true;
        if (i3 == 6) {
            v.e eVar2 = (v.e) view.getLayoutParams();
            eVar2.f2638c0 = true;
            eVar2.f2661p0.f2267E = true;
        }
        c0237d.g(6).a(c0237d2.g(i3), eVar.f2610D, eVar.f2609C);
        c0237d.f2267E = true;
        c0237d.g(3).g();
        c0237d.g(5).g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            v.e eVar = (v.e) childAt.getLayoutParams();
            C0237d c0237d = eVar.f2661p0;
            if (childAt.getVisibility() != 8 || eVar.f2640d0 || eVar.f2642e0 || zIsInEditMode) {
                int iP = c0237d.p();
                int iQ = c0237d.q();
                childAt.layout(iP, iQ, c0237d.o() + iP, c0237d.i() + iQ);
            }
        }
        ArrayList arrayList = this.f955b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC0253c) arrayList.get(i7)).getClass();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0611  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e eVar;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        n nVar;
        int i6;
        e eVar2;
        boolean z5;
        boolean z6;
        int i7;
        int i8;
        e eVar3;
        String str;
        int i9;
        String resourceEntryName;
        C0237d c0237d;
        if (this.f968p == i2) {
            int i10 = this.f969q;
        }
        if (!this.h) {
            int childCount = getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                if (getChildAt(i11).isLayoutRequested()) {
                    this.h = true;
                    break;
                }
                i11++;
            }
        }
        this.f968p = i2;
        this.f969q = i3;
        boolean z7 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        e eVar4 = this.f956c;
        eVar4.f2340u0 = z7;
        if (this.h) {
            this.h = false;
            int childCount2 = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount2) {
                    z2 = false;
                    break;
                } else {
                    if (getChildAt(i12).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i12++;
                }
            }
            if (z2) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i13 = 0; i13 < childCount3; i13++) {
                    C0237d c0237dI = i(getChildAt(i13));
                    if (c0237dI != null) {
                        c0237dI.A();
                    }
                }
                if (zIsInEditMode) {
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt = getChildAt(i14);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.f965m == null) {
                                    this.f965m = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                this.f965m.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) this.f954a.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                if (viewFindViewById == this) {
                                    c0237d = eVar4;
                                    c0237d.g0 = resourceName;
                                } else {
                                    c0237d = viewFindViewById == null ? null : ((v.e) viewFindViewById.getLayoutParams()).f2661p0;
                                    c0237d.g0 = resourceName;
                                }
                            } else {
                                c0237d = eVar4;
                                c0237d.g0 = resourceName;
                            }
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.f964l != -1) {
                    for (int i15 = 0; i15 < childCount3; i15++) {
                        getChildAt(i15).getId();
                    }
                }
                n nVar2 = this.f962j;
                if (nVar2 != null) {
                    int childCount4 = getChildCount();
                    HashMap map = nVar2.f2795c;
                    HashSet hashSet = new HashSet(map.keySet());
                    int i16 = 0;
                    while (i16 < childCount4) {
                        View childAt2 = getChildAt(i16);
                        int id2 = childAt2.getId();
                        if (map.containsKey(Integer.valueOf(id2))) {
                            if (nVar2.f2794b) {
                                i5 = -1;
                                if (id2 == -1) {
                                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                                }
                            } else {
                                i5 = -1;
                            }
                            if (id2 == i5) {
                                nVar = nVar2;
                                i6 = childCount4;
                                eVar2 = eVar4;
                                z5 = z2;
                                z6 = zIsInEditMode;
                                i7 = childCount3;
                                i8 = i5;
                            } else if (map.containsKey(Integer.valueOf(id2))) {
                                hashSet.remove(Integer.valueOf(id2));
                                i iVar = (i) map.get(Integer.valueOf(id2));
                                if (iVar != null) {
                                    if (childAt2 instanceof C0251a) {
                                        j jVar = iVar.f2697d;
                                        nVar = nVar2;
                                        jVar.h0 = 1;
                                        C0251a c0251a = (C0251a) childAt2;
                                        c0251a.setId(id2);
                                        c0251a.setType(jVar.f2738f0);
                                        c0251a.setMargin(jVar.g0);
                                        c0251a.setAllowsGoneWidget(jVar.f2751n0);
                                        int[] iArr = jVar.f2741i0;
                                        if (iArr != null) {
                                            c0251a.setReferencedIds(iArr);
                                        } else {
                                            String str2 = jVar.f2743j0;
                                            if (str2 != null) {
                                                int[] iArrB = n.b(c0251a, str2);
                                                jVar.f2741i0 = iArrB;
                                                c0251a.setReferencedIds(iArrB);
                                            }
                                        }
                                    } else {
                                        nVar = nVar2;
                                    }
                                    v.e eVar5 = (v.e) childAt2.getLayoutParams();
                                    eVar5.a();
                                    iVar.a(eVar5);
                                    HashMap map2 = iVar.f2699f;
                                    z5 = z2;
                                    z6 = zIsInEditMode;
                                    Class<?> cls = childAt2.getClass();
                                    for (String str3 : map2.keySet()) {
                                        int i17 = childCount3;
                                        C0252b c0252b = (C0252b) map2.get(str3);
                                        HashMap map3 = map2;
                                        if (c0252b.f2592a) {
                                            eVar3 = eVar4;
                                            str = str3;
                                        } else {
                                            eVar3 = eVar4;
                                            str = "set" + str3;
                                        }
                                        try {
                                            switch (q.f.a(c0252b.f2593b)) {
                                                case 0:
                                                    i9 = childCount4;
                                                    cls.getMethod(str, Integer.TYPE).invoke(childAt2, Integer.valueOf(c0252b.f2594c));
                                                    break;
                                                case 1:
                                                    i9 = childCount4;
                                                    cls.getMethod(str, Float.TYPE).invoke(childAt2, Float.valueOf(c0252b.f2595d));
                                                    break;
                                                case 2:
                                                    i9 = childCount4;
                                                    cls.getMethod(str, Integer.TYPE).invoke(childAt2, Integer.valueOf(c0252b.f2598g));
                                                    break;
                                                case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
                                                    Method method = cls.getMethod(str, Drawable.class);
                                                    i9 = childCount4;
                                                    try {
                                                        ColorDrawable colorDrawable = new ColorDrawable();
                                                        colorDrawable.setColor(c0252b.f2598g);
                                                        method.invoke(childAt2, colorDrawable);
                                                    } catch (IllegalAccessException e2) {
                                                        e = e2;
                                                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                        e.printStackTrace();
                                                        childCount3 = i17;
                                                        map2 = map3;
                                                        eVar4 = eVar3;
                                                        childCount4 = i9;
                                                    } catch (NoSuchMethodException e3) {
                                                        e = e3;
                                                        Log.e("TransitionLayout", e.getMessage());
                                                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                                        childCount3 = i17;
                                                        map2 = map3;
                                                        eVar4 = eVar3;
                                                        childCount4 = i9;
                                                    } catch (InvocationTargetException e4) {
                                                        e = e4;
                                                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                        e.printStackTrace();
                                                        childCount3 = i17;
                                                        map2 = map3;
                                                        eVar4 = eVar3;
                                                        childCount4 = i9;
                                                    }
                                                case 4:
                                                    cls.getMethod(str, CharSequence.class).invoke(childAt2, c0252b.f2596e);
                                                    i9 = childCount4;
                                                    break;
                                                case 5:
                                                    cls.getMethod(str, Boolean.TYPE).invoke(childAt2, Boolean.valueOf(c0252b.f2597f));
                                                    i9 = childCount4;
                                                    break;
                                                case 6:
                                                    cls.getMethod(str, Float.TYPE).invoke(childAt2, Float.valueOf(c0252b.f2595d));
                                                    i9 = childCount4;
                                                    break;
                                                case 7:
                                                    cls.getMethod(str, Integer.TYPE).invoke(childAt2, Integer.valueOf(c0252b.f2594c));
                                                    i9 = childCount4;
                                                    break;
                                                default:
                                                    i9 = childCount4;
                                                    break;
                                            }
                                        } catch (IllegalAccessException e5) {
                                            e = e5;
                                            i9 = childCount4;
                                        } catch (NoSuchMethodException e6) {
                                            e = e6;
                                            i9 = childCount4;
                                        } catch (InvocationTargetException e7) {
                                            e = e7;
                                            i9 = childCount4;
                                        }
                                        childCount3 = i17;
                                        map2 = map3;
                                        eVar4 = eVar3;
                                        childCount4 = i9;
                                    }
                                    i6 = childCount4;
                                    eVar2 = eVar4;
                                    i7 = childCount3;
                                    childAt2.setLayoutParams(eVar5);
                                    l lVar = iVar.f2695b;
                                    if (lVar.f2774b == 0) {
                                        childAt2.setVisibility(lVar.f2773a);
                                    }
                                    childAt2.setAlpha(lVar.f2775c);
                                    v.m mVar = iVar.f2698e;
                                    childAt2.setRotation(mVar.f2778a);
                                    childAt2.setRotationX(mVar.f2779b);
                                    childAt2.setRotationY(mVar.f2780c);
                                    childAt2.setScaleX(mVar.f2781d);
                                    childAt2.setScaleY(mVar.f2782e);
                                    i8 = -1;
                                    if (mVar.h != -1) {
                                        if (((View) childAt2.getParent()).findViewById(mVar.h) != null) {
                                            float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                            float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                            if (childAt2.getRight() - childAt2.getLeft() > 0 && childAt2.getBottom() - childAt2.getTop() > 0) {
                                                childAt2.setPivotX(right - childAt2.getLeft());
                                                childAt2.setPivotY(bottom - childAt2.getTop());
                                            }
                                        }
                                    } else {
                                        if (!Float.isNaN(mVar.f2783f)) {
                                            childAt2.setPivotX(mVar.f2783f);
                                        }
                                        if (!Float.isNaN(mVar.f2784g)) {
                                            childAt2.setPivotY(mVar.f2784g);
                                        }
                                    }
                                    childAt2.setTranslationX(mVar.f2785i);
                                    childAt2.setTranslationY(mVar.f2786j);
                                    childAt2.setTranslationZ(mVar.f2787k);
                                    if (mVar.f2788l) {
                                        childAt2.setElevation(mVar.f2789m);
                                    }
                                }
                            } else {
                                nVar = nVar2;
                                i6 = childCount4;
                                eVar2 = eVar4;
                                z5 = z2;
                                z6 = zIsInEditMode;
                                i7 = childCount3;
                                i8 = -1;
                                Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                            }
                            i16++;
                            nVar2 = nVar;
                            z2 = z5;
                            zIsInEditMode = z6;
                            childCount3 = i7;
                            eVar4 = eVar2;
                            childCount4 = i6;
                        } else {
                            StringBuilder sb = new StringBuilder("id unknown ");
                            try {
                                resourceEntryName = childAt2.getContext().getResources().getResourceEntryName(childAt2.getId());
                            } catch (Exception unused2) {
                                resourceEntryName = "UNKNOWN";
                            }
                            sb.append(resourceEntryName);
                            Log.w("ConstraintSet", sb.toString());
                        }
                        nVar = nVar2;
                        i6 = childCount4;
                        eVar2 = eVar4;
                        z5 = z2;
                        z6 = zIsInEditMode;
                        i7 = childCount3;
                        i8 = -1;
                        i16++;
                        nVar2 = nVar;
                        z2 = z5;
                        zIsInEditMode = z6;
                        childCount3 = i7;
                        eVar4 = eVar2;
                        childCount4 = i6;
                    }
                    int i18 = childCount4;
                    e eVar6 = eVar4;
                    z3 = z2;
                    z4 = zIsInEditMode;
                    i4 = childCount3;
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        i iVar2 = (i) map.get(num);
                        if (iVar2 != null) {
                            j jVar2 = iVar2.f2697d;
                            if (jVar2.h0 == 1) {
                                Context context = getContext();
                                C0251a c0251a2 = new C0251a(context);
                                c0251a2.f2599a = new int[32];
                                c0251a2.f2605g = new HashMap();
                                c0251a2.f2601c = context;
                                C0234a c0234a = new C0234a();
                                c0234a.f2234p0 = new C0237d[4];
                                c0234a.f2235q0 = 0;
                                c0234a.f2236r0 = 0;
                                c0234a.f2237s0 = true;
                                c0234a.t0 = 0;
                                c0234a.f2238u0 = false;
                                c0251a2.f2591j = c0234a;
                                c0251a2.f2602d = c0234a;
                                c0251a2.e();
                                c0251a2.setVisibility(8);
                                c0251a2.setId(num.intValue());
                                int[] iArr2 = jVar2.f2741i0;
                                if (iArr2 != null) {
                                    c0251a2.setReferencedIds(iArr2);
                                } else {
                                    String str4 = jVar2.f2743j0;
                                    if (str4 != null) {
                                        int[] iArrB2 = n.b(c0251a2, str4);
                                        jVar2.f2741i0 = iArrB2;
                                        c0251a2.setReferencedIds(iArrB2);
                                    }
                                }
                                c0251a2.setType(jVar2.f2738f0);
                                c0251a2.setMargin(jVar2.g0);
                                v.e eVarH = h();
                                c0251a2.e();
                                iVar2.a(eVarH);
                                addView(c0251a2, eVarH);
                            }
                            if (jVar2.f2727a) {
                                View pVar = new p(getContext());
                                pVar.setId(num.intValue());
                                v.e eVarH2 = h();
                                iVar2.a(eVarH2);
                                addView(pVar, eVarH2);
                            }
                        }
                    }
                    for (int i19 = 0; i19 < i18; i19++) {
                        View childAt3 = getChildAt(i19);
                        if (childAt3 instanceof AbstractC0253c) {
                            ((AbstractC0253c) childAt3).getClass();
                        }
                    }
                    eVar = eVar6;
                } else {
                    z3 = z2;
                    z4 = zIsInEditMode;
                    i4 = childCount3;
                    eVar = eVar4;
                }
                eVar.f2336p0.clear();
                ArrayList arrayList = this.f955b;
                int size = arrayList.size();
                if (size > 0) {
                    for (int i20 = 0; i20 < size; i20++) {
                        AbstractC0253c abstractC0253c = (AbstractC0253c) arrayList.get(i20);
                        if (abstractC0253c.isInEditMode()) {
                            abstractC0253c.setIds(abstractC0253c.f2603e);
                        }
                        C0234a c0234a2 = abstractC0253c.f2602d;
                        if (c0234a2 != null) {
                            c0234a2.f2235q0 = 0;
                            Arrays.fill(c0234a2.f2234p0, (Object) null);
                            for (int i21 = 0; i21 < abstractC0253c.f2600b; i21++) {
                                int i22 = abstractC0253c.f2599a[i21];
                                View view = (View) this.f954a.get(i22);
                                if (view == null) {
                                    HashMap map4 = abstractC0253c.f2605g;
                                    String str5 = (String) map4.get(Integer.valueOf(i22));
                                    int iD = abstractC0253c.d(this, str5);
                                    if (iD != 0) {
                                        abstractC0253c.f2599a[i21] = iD;
                                        map4.put(Integer.valueOf(iD), str5);
                                        view = (View) this.f954a.get(iD);
                                    }
                                }
                                if (view != null) {
                                    C0234a c0234a3 = abstractC0253c.f2602d;
                                    C0237d c0237dI2 = i(view);
                                    c0234a3.getClass();
                                    if (c0237dI2 != c0234a3 && c0237dI2 != null) {
                                        int i23 = c0234a3.f2235q0 + 1;
                                        C0237d[] c0237dArr = c0234a3.f2234p0;
                                        if (i23 > c0237dArr.length) {
                                            c0234a3.f2234p0 = (C0237d[]) Arrays.copyOf(c0237dArr, c0237dArr.length * 2);
                                        }
                                        C0237d[] c0237dArr2 = c0234a3.f2234p0;
                                        int i24 = c0234a3.f2235q0;
                                        c0237dArr2[i24] = c0237dI2;
                                        c0234a3.f2235q0 = i24 + 1;
                                    }
                                }
                            }
                            abstractC0253c.f2602d.getClass();
                        }
                    }
                }
                int i25 = i4;
                for (int i26 = 0; i26 < i25; i26++) {
                    getChildAt(i26);
                }
                SparseArray sparseArray = this.f966n;
                sparseArray.clear();
                sparseArray.put(0, eVar);
                sparseArray.put(getId(), eVar);
                for (int i27 = 0; i27 < i25; i27++) {
                    View childAt4 = getChildAt(i27);
                    sparseArray.put(childAt4.getId(), i(childAt4));
                }
                for (int i28 = 0; i28 < i25; i28++) {
                    View childAt5 = getChildAt(i28);
                    C0237d c0237dI3 = i(childAt5);
                    if (c0237dI3 != null) {
                        v.e eVar7 = (v.e) childAt5.getLayoutParams();
                        eVar.f2336p0.add(c0237dI3);
                        C0237d c0237d2 = c0237dI3.f2281S;
                        if (c0237d2 != null) {
                            ((e) c0237d2).f2336p0.remove(c0237dI3);
                            c0237dI3.A();
                        }
                        c0237dI3.f2281S = eVar;
                        g(z4, childAt5, c0237dI3, eVar7, sparseArray);
                    }
                }
            } else {
                eVar = eVar4;
                z3 = z2;
            }
            if (z3) {
                eVar.f2337q0.u(eVar);
            }
        } else {
            eVar = eVar4;
        }
        k(eVar, this.f961i, i2, i3);
        int iO = eVar.o();
        int i29 = eVar.i();
        boolean z8 = eVar.f2329D0;
        boolean z9 = eVar.f2330E0;
        f fVar = this.f967o;
        int i30 = fVar.f2675e;
        int iResolveSizeAndState = View.resolveSizeAndState(iO + fVar.f2674d, i2, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i29 + i30, i3, 0) & 16777215;
        int iMin = Math.min(this.f959f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f960g, iResolveSizeAndState2);
        if (z8) {
            iMin |= 16777216;
        }
        if (z9) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0237d c0237dI = i(view);
        if ((view instanceof p) && !(c0237dI instanceof s.f)) {
            v.e eVar = (v.e) view.getLayoutParams();
            s.f fVar = new s.f();
            eVar.f2661p0 = fVar;
            eVar.f2640d0 = true;
            fVar.O(eVar.f2628V);
        }
        if (view instanceof AbstractC0253c) {
            AbstractC0253c abstractC0253c = (AbstractC0253c) view;
            abstractC0253c.e();
            ((v.e) view.getLayoutParams()).f2642e0 = true;
            ArrayList arrayList = this.f955b;
            if (!arrayList.contains(abstractC0253c)) {
                arrayList.add(abstractC0253c);
            }
        }
        this.f954a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f954a.remove(view.getId());
        C0237d c0237dI = i(view);
        this.f956c.f2336p0.remove(c0237dI);
        c0237dI.A();
        this.f955b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f962j = nVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        SparseArray sparseArray = this.f954a;
        sparseArray.remove(getId());
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f960g) {
            return;
        }
        this.f960g = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f959f) {
            return;
        }
        this.f959f = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f958e) {
            return;
        }
        this.f958e = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f957d) {
            return;
        }
        this.f957d = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(v.o oVar) {
        c cVar = this.f963k;
        if (cVar != null) {
            cVar.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f961i = i2;
        e eVar = this.f956c;
        eVar.f2328C0 = i2;
        C0232c.f2189p = eVar.S(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        v.e eVar = new v.e(layoutParams);
        eVar.f2633a = -1;
        eVar.f2635b = -1;
        eVar.f2637c = -1.0f;
        eVar.f2639d = true;
        eVar.f2641e = -1;
        eVar.f2643f = -1;
        eVar.f2645g = -1;
        eVar.h = -1;
        eVar.f2646i = -1;
        eVar.f2648j = -1;
        eVar.f2650k = -1;
        eVar.f2652l = -1;
        eVar.f2654m = -1;
        eVar.f2656n = -1;
        eVar.f2658o = -1;
        eVar.f2660p = -1;
        eVar.f2662q = 0;
        eVar.f2663r = 0.0f;
        eVar.f2664s = -1;
        eVar.f2665t = -1;
        eVar.f2666u = -1;
        eVar.f2667v = -1;
        eVar.f2668w = Integer.MIN_VALUE;
        eVar.f2669x = Integer.MIN_VALUE;
        eVar.y = Integer.MIN_VALUE;
        eVar.f2670z = Integer.MIN_VALUE;
        eVar.f2607A = Integer.MIN_VALUE;
        eVar.f2608B = Integer.MIN_VALUE;
        eVar.f2609C = Integer.MIN_VALUE;
        eVar.f2610D = 0;
        eVar.f2611E = 0.5f;
        eVar.f2612F = 0.5f;
        eVar.f2613G = null;
        eVar.f2614H = -1.0f;
        eVar.f2615I = -1.0f;
        eVar.f2616J = 0;
        eVar.f2617K = 0;
        eVar.f2618L = 0;
        eVar.f2619M = 0;
        eVar.f2620N = 0;
        eVar.f2621O = 0;
        eVar.f2622P = 0;
        eVar.f2623Q = 0;
        eVar.f2624R = 1.0f;
        eVar.f2625S = 1.0f;
        eVar.f2626T = -1;
        eVar.f2627U = -1;
        eVar.f2628V = -1;
        eVar.f2629W = false;
        eVar.f2630X = false;
        eVar.f2631Y = null;
        eVar.f2632Z = 0;
        eVar.f2634a0 = true;
        eVar.f2636b0 = true;
        eVar.f2638c0 = false;
        eVar.f2640d0 = false;
        eVar.f2642e0 = false;
        eVar.f2644f0 = -1;
        eVar.g0 = -1;
        eVar.h0 = -1;
        eVar.f2647i0 = -1;
        eVar.f2649j0 = Integer.MIN_VALUE;
        eVar.f2651k0 = Integer.MIN_VALUE;
        eVar.f2653l0 = 0.5f;
        eVar.f2661p0 = new C0237d();
        return eVar;
    }
}
