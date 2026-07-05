package com.stripe.android.view;

import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthActivityStarterHost.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J$\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0014\u0010\n\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/AuthActivityStarterHost;", "", "startActivityForResult", "", TypedValues.AttributesType.S_TARGET, "Ljava/lang/Class;", "extras", "Landroid/os/Bundle;", "requestCode", "", "statusBarColor", "getStatusBarColor", "()Ljava/lang/Integer;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AuthActivityStarterHost {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Application getApplication();

    LifecycleOwner getLifecycleOwner();

    Integer getStatusBarColor();

    void startActivityForResult(Class<?> target, Bundle extras, int requestCode);

    /* compiled from: AuthActivityStarterHost.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/view/AuthActivityStarterHost$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/view/AuthActivityStarterHost;", "fragment", "Landroidx/fragment/app/Fragment;", "activity", "Landroidx/activity/ComponentActivity;", "statusBarColor", "", "(Landroidx/activity/ComponentActivity;Ljava/lang/Integer;)Lcom/stripe/android/view/AuthActivityStarterHost;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final /* synthetic */ AuthActivityStarterHost create(Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Window window = fragmentActivityRequireActivity.getWindow();
            return new FragmentHost(fragment, window != null ? Integer.valueOf(window.getStatusBarColor()) : null);
        }

        public static /* synthetic */ AuthActivityStarterHost create$default(Companion companion, ComponentActivity componentActivity, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                Window window = componentActivity.getWindow();
                num = window != null ? Integer.valueOf(window.getStatusBarColor()) : null;
            }
            return companion.create(componentActivity, num);
        }

        public final /* synthetic */ AuthActivityStarterHost create(ComponentActivity activity, Integer statusBarColor) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new ActivityHost(activity, statusBarColor);
        }
    }
}
