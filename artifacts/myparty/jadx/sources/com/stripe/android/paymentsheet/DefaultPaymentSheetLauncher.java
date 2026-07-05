package com.stripe.android.paymentsheet;

import android.app.Activity;
import android.app.Application;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackReferences;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.uicore.utils.AnimationConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultPaymentSheetLauncher.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0013\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0017B!\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;", "Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "activity", "Landroid/app/Activity;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "application", "Landroid/app/Application;", "callback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "paymentElementCallbackIdentifier", "", "initializedViaCompose", "", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;Z)V", "Landroidx/activity/ComponentActivity;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "present", "", "mode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultPaymentSheetLauncher implements PaymentSheetLauncher {
    public static final int $stable = 8;
    private final Activity activity;
    private final ActivityResultLauncher<PaymentSheetContractV2.Args> activityResultLauncher;
    private final Application application;
    private final PaymentSheetResultCallback callback;
    private final boolean initializedViaCompose;
    private final LifecycleOwner lifecycleOwner;
    private final String paymentElementCallbackIdentifier;

    public DefaultPaymentSheetLauncher(ActivityResultLauncher<PaymentSheetContractV2.Args> activityResultLauncher, Activity activity, LifecycleOwner lifecycleOwner, Application application, PaymentSheetResultCallback callback, String paymentElementCallbackIdentifier, boolean z) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        this.activityResultLauncher = activityResultLauncher;
        this.activity = activity;
        this.lifecycleOwner = lifecycleOwner;
        this.application = application;
        this.callback = callback;
        this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
        this.initializedViaCompose = z;
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                PaymentElementCallbackReferences.INSTANCE.remove(DefaultPaymentSheetLauncher.this.paymentElementCallbackIdentifier);
                super.onDestroy(owner);
            }
        });
    }

    public /* synthetic */ DefaultPaymentSheetLauncher(ActivityResultLauncher activityResultLauncher, Activity activity, LifecycleOwner lifecycleOwner, Application application, PaymentSheetResultCallback paymentSheetResultCallback, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activityResultLauncher, activity, lifecycleOwner, application, paymentSheetResultCallback, (i & 32) != 0 ? PaymentSheetConstantsKt.PAYMENT_SHEET_DEFAULT_CALLBACK_IDENTIFIER : str, (i & 64) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultPaymentSheetLauncher(ComponentActivity activity, final PaymentSheetResultCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Application application = activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        this(activity.registerForActivityResult(new PaymentSheetContractV2(), new ActivityResultCallback() { // from class: com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$$ExternalSyntheticLambda2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DefaultPaymentSheetLauncher._init_$lambda$0(callback, (PaymentSheetResult) obj);
            }
        }), activity, activity, application, callback, null, false, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PaymentSheetResultCallback paymentSheetResultCallback, PaymentSheetResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        paymentSheetResultCallback.onPaymentSheetResult(it);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultPaymentSheetLauncher(Fragment fragment, final PaymentSheetResultCallback callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new PaymentSheetContractV2(), new ActivityResultCallback() { // from class: com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DefaultPaymentSheetLauncher._init_$lambda$1(callback, (PaymentSheetResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Application application = fragment.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        this(activityResultLauncherRegisterForActivityResult, fragmentActivityRequireActivity, fragment, application, callback, null, false, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(PaymentSheetResultCallback paymentSheetResultCallback, PaymentSheetResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        paymentSheetResultCallback.onPaymentSheetResult(it);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultPaymentSheetLauncher(Fragment fragment, ActivityResultRegistry registry, final PaymentSheetResultCallback callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new PaymentSheetContractV2(), registry, new ActivityResultCallback() { // from class: com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DefaultPaymentSheetLauncher._init_$lambda$2(callback, (PaymentSheetResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Application application = fragment.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        this(activityResultLauncherRegisterForActivityResult, fragmentActivityRequireActivity, fragment, application, callback, null, false, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(PaymentSheetResultCallback paymentSheetResultCallback, PaymentSheetResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        paymentSheetResultCallback.onPaymentSheetResult(it);
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheetLauncher
    public void present(PaymentElementLoader.InitializationMode mode, PaymentSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (configuration == null) {
            configuration = PaymentSheet.Configuration.INSTANCE.m8222default(this.activity);
        }
        PaymentSheet.Configuration configuration2 = configuration;
        Window window = this.activity.getWindow();
        PaymentSheetContractV2.Args args = new PaymentSheetContractV2.Args(mode, configuration2, this.paymentElementCallbackIdentifier, window != null ? Integer.valueOf(window.getStatusBarColor()) : null, this.initializedViaCompose);
        ActivityOptionsCompat activityOptionsCompatMakeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(this.application.getApplicationContext(), AnimationConstants.INSTANCE.getFADE_IN(), AnimationConstants.INSTANCE.getFADE_OUT());
        Intrinsics.checkNotNullExpressionValue(activityOptionsCompatMakeCustomAnimation, "makeCustomAnimation(...)");
        try {
            this.activityResultLauncher.launch(args, activityOptionsCompatMakeCustomAnimation);
        } catch (IllegalStateException e) {
            this.callback.onPaymentSheetResult(new PaymentSheetResult.Failed(new IllegalStateException("The host activity is not in a valid state (" + this.lifecycleOwner.getLifecycle().getState() + ").", e)));
        }
    }
}
