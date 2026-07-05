package com.stripe.android.paymentsheet.flowcontroller;

import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.stripe.android.common.ui.PaymentElementActivityResultCaller;
import com.stripe.android.paymentsheet.PaymentOptionResultCallback;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetConstantsKt;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlowControllerFactory.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014B!\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0017B!\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;", "", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "statusBarColor", "Lkotlin/Function0;", "", "paymentOptionResultCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "paymentElementCallbackIdentifier", "", "initializedViaCompose", "", "<init>", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;Z)V", "activity", "Landroidx/activity/ComponentActivity;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "create", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlowControllerFactory {
    public static final int $stable = 8;
    private final ActivityResultRegistryOwner activityResultRegistryOwner;
    private final boolean initializedViaCompose;
    private final LifecycleOwner lifecycleOwner;
    private final String paymentElementCallbackIdentifier;
    private final PaymentOptionResultCallback paymentOptionResultCallback;
    private final PaymentSheetResultCallback paymentResultCallback;
    private final Function0<Integer> statusBarColor;
    private final ViewModelStoreOwner viewModelStoreOwner;

    public FlowControllerFactory(ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, ActivityResultRegistryOwner activityResultRegistryOwner, Function0<Integer> statusBarColor, PaymentOptionResultCallback paymentOptionResultCallback, PaymentSheetResultCallback paymentResultCallback, String paymentElementCallbackIdentifier, boolean z) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(statusBarColor, "statusBarColor");
        Intrinsics.checkNotNullParameter(paymentOptionResultCallback, "paymentOptionResultCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        this.viewModelStoreOwner = viewModelStoreOwner;
        this.lifecycleOwner = lifecycleOwner;
        this.activityResultRegistryOwner = activityResultRegistryOwner;
        this.statusBarColor = statusBarColor;
        this.paymentOptionResultCallback = paymentOptionResultCallback;
        this.paymentResultCallback = paymentResultCallback;
        this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
        this.initializedViaCompose = z;
    }

    public /* synthetic */ FlowControllerFactory(ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, ActivityResultRegistryOwner activityResultRegistryOwner, Function0 function0, PaymentOptionResultCallback paymentOptionResultCallback, PaymentSheetResultCallback paymentSheetResultCallback, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStoreOwner, lifecycleOwner, activityResultRegistryOwner, function0, paymentOptionResultCallback, paymentSheetResultCallback, (i & 64) != 0 ? PaymentSheetConstantsKt.FLOW_CONTROLLER_DEFAULT_CALLBACK_IDENTIFIER : str, (i & 128) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlowControllerFactory(final ComponentActivity activity, PaymentOptionResultCallback paymentOptionResultCallback, PaymentSheetResultCallback paymentResultCallback) {
        this(activity, activity, activity, new Function0() { // from class: com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FlowControllerFactory._init_$lambda$0(activity);
            }
        }, paymentOptionResultCallback, paymentResultCallback, null, false, 192, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(paymentOptionResultCallback, "paymentOptionResultCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _init_$lambda$0(ComponentActivity componentActivity) {
        return Integer.valueOf(componentActivity.getWindow().getStatusBarColor());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FlowControllerFactory(final Fragment fragment, PaymentOptionResultCallback paymentOptionResultCallback, PaymentSheetResultCallback paymentResultCallback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(paymentOptionResultCallback, "paymentOptionResultCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        Fragment fragment2 = fragment;
        Fragment fragment3 = fragment;
        Object host = fragment.getHost();
        FragmentActivity fragmentActivity = host instanceof ActivityResultRegistryOwner ? (ActivityResultRegistryOwner) host : null;
        if (fragmentActivity == null) {
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivity = fragmentActivityRequireActivity;
        }
        this(fragment2, fragment3, fragmentActivity, new Function0() { // from class: com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FlowControllerFactory._init_$lambda$1(fragment);
            }
        }, paymentOptionResultCallback, paymentResultCallback, null, false, 192, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _init_$lambda$1(Fragment fragment) {
        Window window;
        FragmentActivity activity = fragment.getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return Integer.valueOf(window.getStatusBarColor());
    }

    public final PaymentSheet.FlowController create() {
        return DefaultFlowController.INSTANCE.getInstance(this.viewModelStoreOwner, this.lifecycleOwner, new PaymentElementActivityResultCaller("FlowController(instance = " + this.paymentElementCallbackIdentifier + ")", this.activityResultRegistryOwner), this.statusBarColor, this.paymentOptionResultCallback, this.paymentResultCallback, this.paymentElementCallbackIdentifier, this.initializedViaCompose, this.activityResultRegistryOwner);
    }
}
