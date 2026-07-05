package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.conscrypt.R;

/* renamed from: k.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0202t0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f2018a;

    /* renamed from: b, reason: collision with root package name */
    public int f2019b;

    /* renamed from: c, reason: collision with root package name */
    public int f2020c;

    /* renamed from: d, reason: collision with root package name */
    public int f2021d;

    /* renamed from: e, reason: collision with root package name */
    public int f2022e;

    /* renamed from: f, reason: collision with root package name */
    public int f2023f;

    /* renamed from: g, reason: collision with root package name */
    public C0198r0 f2024g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2025i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2026j;

    /* renamed from: k, reason: collision with root package name */
    public K.d f2027k;

    /* renamed from: l, reason: collision with root package name */
    public E.b f2028l;

    public C0202t0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2018a = new Rect();
        this.f2019b = 0;
        this.f2020c = 0;
        this.f2021d = 0;
        this.f2022e = 0;
        this.f2025i = z2;
        setCacheColorHint(0);
    }

    public final int a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i2, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i3) {
                return i3;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i2) throws IllegalAccessException, IllegalArgumentException {
        boolean z2;
        boolean zA;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            z2 = false;
        } else {
            if (actionMasked != 2) {
                z2 = actionMasked != 3;
                if (z2 || z3) {
                    this.f2026j = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f2023f - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z2) {
                    K.d dVar = this.f2027k;
                    if (dVar != null) {
                        if (dVar.f505p) {
                            dVar.d();
                        }
                        dVar.f505p = false;
                    }
                } else {
                    if (this.f2027k == null) {
                        this.f2027k = new K.d(this);
                    }
                    K.d dVar2 = this.f2027k;
                    boolean z4 = dVar2.f505p;
                    dVar2.f505p = true;
                    dVar2.onTouch(this, motionEvent);
                }
                return z2;
            }
            z2 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        if (iFindPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x2, y);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f2 = x2;
                float f3 = y;
                this.f2026j = true;
                int i3 = Build.VERSION.SDK_INT;
                AbstractC0193o0.a(this, f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i4 = this.f2023f;
                if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f2023f = iPointToPosition;
                AbstractC0193o0.a(childAt3, f2 - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f2018a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f2019b;
                rect.top -= this.f2020c;
                rect.right += this.f2021d;
                rect.bottom += this.f2022e;
                if (i3 >= 33) {
                    zA = AbstractC0197q0.a(this);
                } else {
                    Field field = AbstractC0200s0.f2011a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z6 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC0197q0.b(this, z6);
                    } else {
                        Field field2 = AbstractC0200s0.f2011a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z5) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f2, f3);
                }
                C0198r0 c0198r0 = this.f2024g;
                if (c0198r0 != null) {
                    c0198r0.f2006b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = true;
                z3 = false;
            }
        }
        if (z2) {
            this.f2026j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2023f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2018a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2028l != null) {
            return;
        }
        super.drawableStateChanged();
        C0198r0 c0198r0 = this.f2024g;
        if (c0198r0 != null) {
            c0198r0.f2006b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2026j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2025i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2025i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2025i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2025i && this.h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2028l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2028l == null) {
            E.b bVar = new E.b(8, this);
            this.f2028l = bVar;
            post(bVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i2 < 30 || !AbstractC0195p0.f1997d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC0195p0.f1994a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0195p0.f1995b.invoke(this, Integer.valueOf(iPointToPosition));
                            AbstractC0195p0.f1996c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f2026j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2023f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        E.b bVar = this.f2028l;
        if (bVar != null) {
            C0202t0 c0202t0 = (C0202t0) bVar.f269b;
            c0202t0.f2028l = null;
            c0202t0.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0198r0 c0198r0 = null;
        if (drawable != null) {
            C0198r0 c0198r02 = new C0198r0();
            Drawable drawable2 = c0198r02.f2005a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0198r02.f2005a = drawable;
            drawable.setCallback(c0198r02);
            c0198r02.f2006b = true;
            c0198r0 = c0198r02;
        }
        this.f2024g = c0198r0;
        super.setSelector(c0198r0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2019b = rect.left;
        this.f2020c = rect.top;
        this.f2021d = rect.right;
        this.f2022e = rect.bottom;
    }
}
