package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import org.conscrypt.R;

/* loaded from: classes.dex */
public final class h1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public static h1 f1914k;

    /* renamed from: l, reason: collision with root package name */
    public static h1 f1915l;

    /* renamed from: a, reason: collision with root package name */
    public final View f1916a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f1917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1918c;

    /* renamed from: d, reason: collision with root package name */
    public final g1 f1919d;

    /* renamed from: e, reason: collision with root package name */
    public final g1 f1920e;

    /* renamed from: f, reason: collision with root package name */
    public int f1921f;

    /* renamed from: g, reason: collision with root package name */
    public int f1922g;
    public i1 h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1923i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1924j;

    /* JADX WARN: Type inference failed for: r0v0, types: [k.g1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [k.g1] */
    public h1(View view, CharSequence charSequence) {
        final int i2 = 0;
        this.f1919d = new Runnable(this) { // from class: k.g1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h1 f1912b;

            {
                this.f1912b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i2) {
                    case 0:
                        this.f1912b.c(false);
                        break;
                    default:
                        this.f1912b.a();
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f1920e = new Runnable(this) { // from class: k.g1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h1 f1912b;

            {
                this.f1912b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i3) {
                    case 0:
                        this.f1912b.c(false);
                        break;
                    default:
                        this.f1912b.a();
                        break;
                }
            }
        };
        this.f1916a = view;
        this.f1917b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        int i4 = H.O.f332a;
        this.f1918c = Build.VERSION.SDK_INT >= 28 ? B.a.c(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f1924j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(h1 h1Var) {
        h1 h1Var2 = f1914k;
        if (h1Var2 != null) {
            h1Var2.f1916a.removeCallbacks(h1Var2.f1919d);
        }
        f1914k = h1Var;
        if (h1Var != null) {
            h1Var.f1916a.postDelayed(h1Var.f1919d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        h1 h1Var = f1915l;
        View view = this.f1916a;
        if (h1Var == this) {
            f1915l = null;
            i1 i1Var = this.h;
            if (i1Var != null) {
                View view2 = i1Var.f1940b;
                if (view2.getParent() != null) {
                    ((WindowManager) i1Var.f1939a.getSystemService("window")).removeView(view2);
                }
                this.h = null;
                this.f1924j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1914k == this) {
            b(null);
        }
        view.removeCallbacks(this.f1920e);
    }

    public final void c(boolean z2) throws Resources.NotFoundException {
        int height;
        int i2;
        String str;
        int i3;
        String str2;
        long longPressTimeout;
        long j2;
        long j3;
        View view = this.f1916a;
        if (view.isAttachedToWindow()) {
            b(null);
            h1 h1Var = f1915l;
            if (h1Var != null) {
                h1Var.a();
            }
            f1915l = this;
            this.f1923i = z2;
            i1 i1Var = new i1(view.getContext());
            this.h = i1Var;
            int width = this.f1921f;
            int i4 = this.f1922g;
            boolean z3 = this.f1923i;
            View view2 = i1Var.f1940b;
            ViewParent parent = view2.getParent();
            Context context = i1Var.f1939a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            i1Var.f1941c.setText(this.f1917b);
            WindowManager.LayoutParams layoutParams = i1Var.f1942d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i2 = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str2 = "window";
            } else {
                Rect rect = i1Var.f1943e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i3 = 0;
                } else {
                    Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = i1Var.f1945g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = i1Var.f1944f;
                view.getLocationOnScreen(iArr2);
                int i5 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i5;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i5 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i6 = iArr2[1];
                int i7 = ((i2 + i6) - dimensionPixelOffset3) - measuredHeight;
                int i8 = i6 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i7 >= 0) {
                        layoutParams.y = i7;
                    } else {
                        layoutParams.y = i8;
                    }
                } else if (measuredHeight + i8 <= rect.height()) {
                    layoutParams.y = i8;
                } else {
                    layoutParams.y = i7;
                }
                str2 = str;
            }
            ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f1923i) {
                j3 = 2500;
            } else {
                WeakHashMap weakHashMap = H.N.f327a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            g1 g1Var = this.f1920e;
            view.removeCallbacks(g1Var);
            view.postDelayed(g1Var, j3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.h != null && this.f1923i) {
            return false;
        }
        View view2 = this.f1916a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f1924j = true;
                a();
            }
        } else if (view2.isEnabled() && this.h == null) {
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!this.f1924j) {
                int iAbs = Math.abs(x2 - this.f1921f);
                int i2 = this.f1918c;
                if (iAbs > i2 || Math.abs(y - this.f1922g) > i2) {
                    this.f1921f = x2;
                    this.f1922g = y;
                    this.f1924j = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f1921f = view.getWidth() / 2;
        this.f1922g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
