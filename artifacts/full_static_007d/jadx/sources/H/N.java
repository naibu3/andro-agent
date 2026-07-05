package H;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.C0207w;
import org.conscrypt.R;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f327a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f328b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f329c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final A f330d = new A();

    /* renamed from: e, reason: collision with root package name */
    public static final C f331e = new C();

    public static S a(View view) {
        if (f327a == null) {
            f327a = new WeakHashMap();
        }
        S s2 = (S) f327a.get(view);
        if (s2 != null) {
            return s2;
        }
        S s3 = new S(view);
        f327a.put(view, s3);
        return s3;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = M.f323d;
        M m2 = (M) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (m2 == null) {
            m2 = new M();
            m2.f324a = null;
            m2.f325b = null;
            m2.f326c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, m2);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = m2.f324a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = M.f323d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (m2.f324a == null) {
                            m2.f324a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = M.f323d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                m2.f324a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    m2.f324a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = m2.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (m2.f325b == null) {
                    m2.f325b = new SparseArray();
                }
                m2.f325b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return J.a(view);
        }
        if (f329c) {
            return null;
        }
        if (f328b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f328b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f329c = true;
                return null;
            }
        }
        try {
            Object obj = f328b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f329c = true;
            return null;
        }
    }

    public static String[] d(C0207w c0207w) {
        return Build.VERSION.SDK_INT >= 31 ? L.a(c0207w) : (String[]) c0207w.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i2) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i3 = Build.VERSION.SDK_INT;
            CharSequence charSequenceA = null;
            if (i3 >= 28) {
                tag = I.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z2 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z2) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i3 >= 28) {
                        charSequenceA = I.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequenceA = tag2;
                        }
                    }
                    text.add(charSequenceA);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i3 >= 28) {
                charSequenceA = I.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequenceA = tag3;
                }
            }
            text2.add(charSequenceA);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0013g f(View view, C0013g c0013g) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0013g + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return L.b(view, c0013g);
        }
        K.k kVar = (K.k) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0028w interfaceC0028w = f330d;
        if (kVar == null) {
            if (view instanceof InterfaceC0028w) {
                interfaceC0028w = (InterfaceC0028w) view;
            }
            return interfaceC0028w.a(c0013g);
        }
        C0013g c0013gA = K.k.a(view, c0013g);
        if (c0013gA == null) {
            return null;
        }
        if (view instanceof InterfaceC0028w) {
            interfaceC0028w = (InterfaceC0028w) view;
        }
        return interfaceC0028w.a(c0013gA);
    }

    public static void g(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            J.b(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    public static void h(View view, C0008b c0008b) {
        if (c0008b == null && (c(view) instanceof C0007a)) {
            c0008b = new C0008b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0008b == null ? null : c0008b.f355b);
    }

    public static void i(View view, CharSequence charSequence) {
        new B(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        C c2 = f331e;
        if (charSequence == null) {
            c2.f315a.remove(view);
            view.removeOnAttachStateChangeListener(c2);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(c2);
        } else {
            c2.f315a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(c2);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(c2);
            }
        }
    }
}
