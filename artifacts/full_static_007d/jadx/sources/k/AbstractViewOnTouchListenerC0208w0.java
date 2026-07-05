package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import j.InterfaceC0136D;

/* renamed from: k.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0208w0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f2041a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2042b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2043c;

    /* renamed from: d, reason: collision with root package name */
    public final View f2044d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0206v0 f2045e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0206v0 f2046f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2047g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f2048i = new int[2];

    public AbstractViewOnTouchListenerC0208w0(View view) {
        this.f2044d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2041a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2042b = tapTimeout;
        this.f2043c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0206v0 runnableC0206v0 = this.f2046f;
        View view = this.f2044d;
        if (runnableC0206v0 != null) {
            view.removeCallbacks(runnableC0206v0);
        }
        RunnableC0206v0 runnableC0206v02 = this.f2045e;
        if (runnableC0206v02 != null) {
            view.removeCallbacks(runnableC0206v02);
        }
    }

    public abstract InterfaceC0136D b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0136D interfaceC0136DB = b();
        if (interfaceC0136DB == null || !interfaceC0136DB.b()) {
            return true;
        }
        interfaceC0136DB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        boolean z2;
        C0202t0 c0202t0E;
        boolean z3 = this.f2047g;
        View view2 = this.f2044d;
        if (z3) {
            InterfaceC0136D interfaceC0136DB = b();
            if (interfaceC0136DB == null || !interfaceC0136DB.b() || (c0202t0E = interfaceC0136DB.e()) == null || !c0202t0E.isShown()) {
                z2 = !d();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f2048i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c0202t0E.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = c0202t0E.b(motionEventObtainNoHistory, this.h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zB || !z4) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.h = motionEvent.getPointerId(0);
                if (this.f2045e == null) {
                    this.f2045e = new RunnableC0206v0(this, 0);
                }
                view2.postDelayed(this.f2045e, this.f2042b);
                if (this.f2046f == null) {
                    this.f2046f = new RunnableC0206v0(this, 1);
                }
                view2.postDelayed(this.f2046f, this.f2043c);
            } else if (actionMasked2 == 1) {
                a();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.h);
                if (iFindPointerIndex >= 0) {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f2 = this.f2041a;
                    float f3 = -f2;
                    if (x2 < f3 || y < f3 || x2 >= (view2.getRight() - view2.getLeft()) + f2 || y >= (view2.getBottom() - view2.getTop()) + f2) {
                        a();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (c()) {
                            z2 = true;
                        }
                        if (z2) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                            view2.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                    }
                }
            } else if (actionMasked2 == 3) {
            }
            z2 = false;
            if (z2) {
            }
        } else {
            z2 = false;
            if (z2) {
            }
        }
        this.f2047g = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2047g = false;
        this.h = -1;
        RunnableC0206v0 runnableC0206v0 = this.f2045e;
        if (runnableC0206v0 != null) {
            this.f2044d.removeCallbacks(runnableC0206v0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
