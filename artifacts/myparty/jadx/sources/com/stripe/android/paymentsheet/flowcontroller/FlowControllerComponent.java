package com.stripe.android.paymentsheet.flowcontroller;

import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.paymentsheet.InitializedViaCompose;
import com.stripe.android.paymentsheet.PaymentOptionResultCallback;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;

/* compiled from: FlowControllerComponent.kt */
@FlowControllerScope
@Subcomponent
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;", "", "flowController", "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "getFlowController", "()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "stateComponent", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "getStateComponent", "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FlowControllerComponent {

    /* compiled from: FlowControllerComponent.kt */
    @Subcomponent.Builder
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H'J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH'J\u0012\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;", "", "lifeCycleOwner", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "paymentOptionResultCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "initializedViaCompose", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        @BindsInstance
        Builder activityResultCaller(ActivityResultCaller activityResultCaller);

        @BindsInstance
        Builder activityResultRegistryOwner(ActivityResultRegistryOwner activityResultRegistryOwner);

        FlowControllerComponent build();

        @BindsInstance
        Builder initializedViaCompose(@InitializedViaCompose boolean initializedViaCompose);

        @BindsInstance
        Builder lifeCycleOwner(LifecycleOwner lifecycleOwner);

        @BindsInstance
        Builder paymentOptionResultCallback(PaymentOptionResultCallback paymentOptionResultCallback);

        @BindsInstance
        Builder paymentResultCallback(PaymentSheetResultCallback paymentResultCallback);
    }

    DefaultFlowController getFlowController();

    FlowControllerStateComponent getStateComponent();
}
