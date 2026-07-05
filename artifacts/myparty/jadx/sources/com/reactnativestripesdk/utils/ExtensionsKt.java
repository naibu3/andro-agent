package com.reactnativestripesdk.utils;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001a\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\n*\u00020\u000f¨\u0006\u0010"}, d2 = {"showSoftKeyboard", "", "Landroid/view/View;", "hideSoftKeyboard", "removeFragment", "Landroidx/fragment/app/Fragment;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getBooleanOr", "", "Lcom/facebook/react/bridge/ReadableMap;", SDKConstants.PARAM_KEY, "", Constants.COLLATION_DEFAULT, "asMapOrNull", "Lcom/facebook/react/bridge/Dynamic;", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExtensionsKt {
    public static final void showSoftKeyboard(final View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.post(new Runnable() { // from class: com.reactnativestripesdk.utils.ExtensionsKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ExtensionsKt.showSoftKeyboard$lambda$0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSoftKeyboard$lambda$0(View view) {
        InputMethodManager inputMethodManager;
        if (!view.requestFocus() || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }

    public static final void hideSoftKeyboard(View view) {
        InputMethodManager inputMethodManager;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!view.requestFocus() || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void removeFragment(Fragment fragment, ReactApplicationContext context) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Activity currentActivity = context.getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || supportFragmentManager.findFragmentByTag(fragment.getTag()) == null) {
            return;
        }
        supportFragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss();
    }

    public static final boolean getBooleanOr(ReadableMap readableMap, String key, boolean z) {
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return readableMap.hasKey(key) ? readableMap.getBoolean(key) : z;
    }

    public static final ReadableMap asMapOrNull(Dynamic dynamic) {
        Intrinsics.checkNotNullParameter(dynamic, "<this>");
        if (dynamic.getType() == ReadableType.Map) {
            return dynamic.asMap();
        }
        return null;
    }
}
