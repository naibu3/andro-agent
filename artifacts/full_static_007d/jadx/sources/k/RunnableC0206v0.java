package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: k.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0206v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0208w0 f2034b;

    public /* synthetic */ RunnableC0206v0(AbstractViewOnTouchListenerC0208w0 abstractViewOnTouchListenerC0208w0, int i2) {
        this.f2033a = i2;
        this.f2034b = abstractViewOnTouchListenerC0208w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2033a) {
            case 0:
                ViewParent parent = this.f2034b.f2044d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0208w0 abstractViewOnTouchListenerC0208w0 = this.f2034b;
                abstractViewOnTouchListenerC0208w0.a();
                View view = abstractViewOnTouchListenerC0208w0.f2044d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0208w0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0208w0.f2047g = true;
                    break;
                }
                break;
        }
    }
}
