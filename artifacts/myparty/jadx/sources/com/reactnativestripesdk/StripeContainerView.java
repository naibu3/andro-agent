package com.reactnativestripesdk;

import android.app.Activity;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeContainerView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/reactnativestripesdk/StripeContainerView;", "Landroid/widget/FrameLayout;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "keyboardShouldPersistTapsValue", "", "setKeyboardShouldPersistTaps", "", "value", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeContainerView extends FrameLayout {
    public static final int $stable = 8;
    private final ThemedReactContext context;
    private boolean keyboardShouldPersistTapsValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeContainerView(ThemedReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.keyboardShouldPersistTapsValue = true;
        getRootView().setFocusable(true);
        getRootView().setFocusableInTouchMode(true);
        getRootView().setClickable(true);
    }

    public final void setKeyboardShouldPersistTaps(boolean value) {
        this.keyboardShouldPersistTapsValue = value;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNull(event);
        if (event.getAction() == 0 && !this.keyboardShouldPersistTapsValue) {
            Activity currentActivity = this.context.getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity);
            View currentFocus = currentActivity.getCurrentFocus();
            if (currentFocus instanceof EditText) {
                Rect rect = new Rect();
                EditText editText = (EditText) currentFocus;
                editText.getGlobalVisibleRect(rect);
                if (!rect.contains((int) event.getRawX(), (int) event.getRawY())) {
                    Object systemService = this.context.getSystemService("input_method");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    getRootView().requestFocus();
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }
}
