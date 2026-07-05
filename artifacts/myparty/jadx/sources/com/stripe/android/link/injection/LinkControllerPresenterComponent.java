package com.stripe.android.link.injection;

import android.app.Activity;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.link.LinkController;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;

/* compiled from: LinkControllerPresenterComponent.kt */
@LinkControllerPresenterScope
@Subcomponent
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/link/injection/LinkControllerPresenterComponent;", "", "presenter", "Lcom/stripe/android/link/LinkController$Presenter;", "getPresenter", "()Lcom/stripe/android/link/LinkController$Presenter;", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkControllerPresenterComponent {

    /* compiled from: LinkControllerPresenterComponent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/link/injection/LinkControllerPresenterComponent$Factory;", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/link/injection/LinkControllerPresenterComponent;", "activity", "Landroid/app/Activity;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "presentPaymentMethodsCallback", "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;", "authenticationCallback", "Lcom/stripe/android/link/LinkController$AuthenticationCallback;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Subcomponent.Factory
    public interface Factory {
        LinkControllerPresenterComponent build(@BindsInstance Activity activity, @BindsInstance LifecycleOwner lifecycleOwner, @BindsInstance ActivityResultRegistryOwner activityResultRegistryOwner, @BindsInstance LinkController.PresentPaymentMethodsCallback presentPaymentMethodsCallback, @BindsInstance LinkController.AuthenticationCallback authenticationCallback);
    }

    LinkController.Presenter getPresenter();
}
