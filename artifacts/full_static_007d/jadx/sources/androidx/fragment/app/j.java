package androidx.fragment.app;

import H.E;
import H.N;
import H.f0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import j0.AbstractC0150d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.conscrypt.BuildConfig;
import org.conscrypt.R;

/* loaded from: classes.dex */
public final class j extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1056a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1057b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1058c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, AttributeSet attributeSet, t tVar) {
        super(context, attributeSet);
        AbstractC0150d.e(context, "context");
        AbstractC0150d.e(attributeSet, "attrs");
        AbstractC0150d.e(tVar, "fm");
        this.f1056a = new ArrayList();
        this.f1057b = new ArrayList();
        this.f1059d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P.a.f608b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        tVar.g();
        if (classAttribute == null) {
            Iterator it = tVar.f1085c.b().iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            return;
        }
        if (id == -1) {
            throw new IllegalStateException(A.e.d("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : BuildConfig.FLAVOR));
        }
        context.getClassLoader();
        tVar.f1102u.a(classAttribute);
        AbstractC0150d.d(null, "fm.fragmentFactory.insta…ontext.classLoader, name)");
        throw null;
    }

    public final void a(View view) {
        if (this.f1057b.contains(view)) {
            this.f1056a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        AbstractC0150d.e(view, "child");
        view.getTag(R.id.fragment_container_view_tag);
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        f0 f0VarC;
        AbstractC0150d.e(windowInsets, "insets");
        f0 f0VarC2 = f0.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1058c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC0150d.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            f0VarC = f0.c(windowInsetsOnApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = N.f327a;
            WindowInsets windowInsetsB = f0VarC2.b();
            if (windowInsetsB != null) {
                WindowInsets windowInsetsB2 = E.b(this, windowInsetsB);
                if (!windowInsetsB2.equals(windowInsetsB)) {
                    f0VarC2 = f0.c(windowInsetsB2, this);
                }
            }
            f0VarC = f0VarC2;
        }
        if (!f0VarC.f366a.i()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                WeakHashMap weakHashMap2 = N.f327a;
                WindowInsets windowInsetsB3 = f0VarC.b();
                if (windowInsetsB3 != null) {
                    WindowInsets windowInsetsA = E.a(childAt, windowInsetsB3);
                    if (!windowInsetsA.equals(windowInsetsB3)) {
                        f0.c(windowInsetsA, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC0150d.e(canvas, "canvas");
        if (this.f1059d) {
            Iterator it = this.f1056a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC0150d.e(canvas, "canvas");
        AbstractC0150d.e(view, "child");
        if (this.f1059d) {
            ArrayList arrayList = this.f1056a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC0150d.e(view, "view");
        this.f1057b.remove(view);
        if (this.f1056a.remove(view)) {
            this.f1059d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends d> F getFragment() {
        i iVar;
        View view = this;
        while (view != null) {
            view.getTag(R.id.fragment_container_view_tag);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                iVar = null;
                break;
            }
            if (context instanceof i) {
                iVar = (i) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (iVar != null) {
            t supportFragmentManager = iVar.getSupportFragmentManager();
            getId();
            supportFragmentManager.g();
            return null;
        }
        throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC0150d.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                AbstractC0150d.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC0150d.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i2) {
        View childAt = getChildAt(i2);
        AbstractC0150d.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC0150d.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            AbstractC0150d.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            AbstractC0150d.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i2, i3);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.f1059d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC0150d.e(onApplyWindowInsetsListener, "listener");
        this.f1058c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC0150d.e(view, "view");
        if (view.getParent() == this) {
            this.f1057b.add(view);
        }
        super.startViewTransition(view);
    }
}
