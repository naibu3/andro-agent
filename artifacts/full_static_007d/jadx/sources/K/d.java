package K;

import H.N;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import k.C0202t0;

/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f490r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f491a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f492b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f493c;

    /* renamed from: d, reason: collision with root package name */
    public E.b f494d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f495e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f496f;

    /* renamed from: g, reason: collision with root package name */
    public final int f497g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f498i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f499j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f500k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f501l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f502m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f503n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f504o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f505p;

    /* renamed from: q, reason: collision with root package name */
    public final C0202t0 f506q;

    public d(C0202t0 c0202t0) {
        a aVar = new a();
        aVar.f486e = Long.MIN_VALUE;
        aVar.f488g = -1L;
        aVar.f487f = 0L;
        this.f491a = aVar;
        this.f492b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f495e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f496f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f498i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f499j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f500k = fArr5;
        this.f493c = c0202t0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f497g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = f490r;
        aVar.f482a = 500;
        aVar.f483b = 500;
        this.f506q = c0202t0;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i2, float f2, float f3, float f4) {
        float fB;
        float interpolation;
        float fB2 = b(this.f495e[i2] * f3, 0.0f, this.f496f[i2]);
        float fC = c(f3 - f2, fB2) - c(f2, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f492b;
        if (fC < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fC);
        } else {
            if (fC <= 0.0f) {
                fB = 0.0f;
                if (fB != 0.0f) {
                    return 0.0f;
                }
                float f5 = this.f498i[i2];
                float f6 = this.f499j[i2];
                float f7 = this.f500k[i2];
                float f8 = f5 * f4;
                return fB > 0.0f ? b(fB * f8, f6, f7) : -b((-fB) * f8, f6, f7);
            }
            interpolation = accelerateInterpolator.getInterpolation(fC);
        }
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB != 0.0f) {
        }
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f497g;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f504o && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f502m) {
            this.f504o = false;
            return;
        }
        a aVar = this.f491a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (jCurrentAnimationTimeMillis - aVar.f486e);
        int i4 = aVar.f483b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f489i = i2;
        aVar.h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f488g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        C0202t0 c0202t0;
        int count;
        a aVar = this.f491a;
        float f2 = aVar.f485d;
        int iAbs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f484c);
        if (iAbs == 0 || (count = (c0202t0 = this.f506q).getCount()) == 0) {
            return false;
        }
        int childCount = c0202t0.getChildCount();
        int firstVisiblePosition = c0202t0.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i2 >= count && c0202t0.getChildAt(childCount - 1).getBottom() <= c0202t0.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c0202t0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        int i3 = 1;
        if (!this.f505p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                d();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            }
            return false;
        }
        this.f503n = true;
        this.f501l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f493c;
        float fA = a(0, x2, width, listView.getWidth());
        float fA2 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f491a;
        aVar.f484c = fA;
        aVar.f485d = fA2;
        if (!this.f504o && e()) {
            if (this.f494d == null) {
                this.f494d = new E.b(i3, this);
            }
            this.f504o = true;
            this.f502m = true;
            if (this.f501l || (i2 = this.h) <= 0) {
                this.f494d.run();
            } else {
                E.b bVar = this.f494d;
                long j2 = i2;
                WeakHashMap weakHashMap = N.f327a;
                listView.postOnAnimationDelayed(bVar, j2);
            }
            this.f501l = true;
        }
        return false;
    }
}
