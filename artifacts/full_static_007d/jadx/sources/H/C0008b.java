package H;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import org.conscrypt.R;

/* renamed from: H.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0008b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f353c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f354a;

    /* renamed from: b, reason: collision with root package name */
    public final C0007a f355b;

    public C0008b() {
        this(f353c);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f354a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, I.e eVar) {
        this.f354a.onInitializeAccessibilityNodeInfo(view, eVar.f463a);
    }

    public boolean c(View view, int i2, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < listEmptyList.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((I.d) listEmptyList.get(i3)).f460a).getId() != i2; i3++) {
        }
        boolean zPerformAccessibilityAction = this.f354a.performAccessibilityAction(view, i2, bundle);
        if (zPerformAccessibilityAction || i2 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i5 = 0;
            while (true) {
                if (clickableSpanArr == null || i5 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i5++;
            }
        }
        return z2;
    }

    public C0008b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f354a = accessibilityDelegate;
        this.f355b = new C0007a(this);
    }
}
