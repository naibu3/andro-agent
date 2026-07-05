package com.reactnativestripesdk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativestripesdk.utils.ExtensionsKt;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayPaymentMethodLauncherFragment.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "isTestEnv", "", "paymentMethodRequired", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", ViewHierarchyConstants.VIEW_KEY, "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayPaymentMethodLauncherFragment extends Fragment {
    public static final String TAG = "google_pay_support_fragment";
    private ReactApplicationContext context;
    private boolean isTestEnv;
    private boolean paymentMethodRequired;
    private Promise promise;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        new GooglePayPaymentMethodLauncher(this, new GooglePayPaymentMethodLauncher.Config(this.isTestEnv ? GooglePayEnvironment.Test : GooglePayEnvironment.Production, "", "", false, null, this.paymentMethodRequired, false, 88, null), new GooglePayPaymentMethodLauncher.ReadyCallback() { // from class: com.reactnativestripesdk.GooglePayPaymentMethodLauncherFragment$$ExternalSyntheticLambda0
            @Override // com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback
            public final void onReady(boolean z) {
                GooglePayPaymentMethodLauncherFragment.onViewCreated$lambda$1(this.f$0, z);
            }
        }, new GooglePayPaymentMethodLauncher.ResultCallback() { // from class: com.reactnativestripesdk.GooglePayPaymentMethodLauncherFragment$$ExternalSyntheticLambda1
            @Override // com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ResultCallback
            public final void onResult(GooglePayPaymentMethodLauncher.Result result) {
                Intrinsics.checkNotNullParameter(result, "it");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(GooglePayPaymentMethodLauncherFragment googlePayPaymentMethodLauncherFragment, boolean z) {
        Promise promise = googlePayPaymentMethodLauncherFragment.promise;
        ReactApplicationContext reactApplicationContext = null;
        if (promise == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
            promise = null;
        }
        promise.resolve(Boolean.valueOf(z));
        GooglePayPaymentMethodLauncherFragment googlePayPaymentMethodLauncherFragment2 = googlePayPaymentMethodLauncherFragment;
        ReactApplicationContext reactApplicationContext2 = googlePayPaymentMethodLauncherFragment.context;
        if (reactApplicationContext2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            reactApplicationContext = reactApplicationContext2;
        }
        ExtensionsKt.removeFragment(googlePayPaymentMethodLauncherFragment2, reactApplicationContext);
    }

    /* compiled from: GooglePayPaymentMethodLauncherFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$Companion;", "", "<init>", "()V", "TAG", "", "create", "Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "isTestEnv", "", "paymentMethodRequired", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GooglePayPaymentMethodLauncherFragment create(ReactApplicationContext context, boolean isTestEnv, boolean paymentMethodRequired, Promise promise) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(promise, "promise");
            GooglePayPaymentMethodLauncherFragment googlePayPaymentMethodLauncherFragment = new GooglePayPaymentMethodLauncherFragment();
            googlePayPaymentMethodLauncherFragment.context = context;
            googlePayPaymentMethodLauncherFragment.isTestEnv = isTestEnv;
            googlePayPaymentMethodLauncherFragment.paymentMethodRequired = paymentMethodRequired;
            googlePayPaymentMethodLauncherFragment.promise = promise;
            return googlePayPaymentMethodLauncherFragment;
        }
    }
}
