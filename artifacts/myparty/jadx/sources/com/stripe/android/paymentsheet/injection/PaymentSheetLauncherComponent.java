package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.common.di.ApplicationIdModule;
import com.stripe.android.common.di.MobileSessionIdModule;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent;
import com.stripe.android.ui.core.di.CardScanModule;
import com.stripe.android.ui.core.forms.resources.injection.ResourceRepositoryModule;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: PaymentSheetLauncherComponent.kt */
@Component(modules = {StripeRepositoryModule.class, PaymentSheetCommonModule.class, PaymentSheetLauncherModule.class, GooglePayLauncherModule.class, CoroutineContextModule.class, CoreCommonModule.class, ResourceRepositoryModule.class, ApplicationIdModule.class, MobileSessionIdModule.class, CardScanModule.class, LinkHoldbackExposureModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;", "", "paymentSheetViewModelSubcomponentBuilder", "Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;", "getPaymentSheetViewModelSubcomponentBuilder", "()Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PaymentSheetLauncherComponent {

    /* compiled from: PaymentSheetLauncherComponent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0012\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;", "", "application", "Landroid/app/Application;", "savedStateHandle", "handle", "Landroidx/lifecycle/SavedStateHandle;", "paymentElementCallbackIdentifier", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        PaymentSheetLauncherComponent build();

        @BindsInstance
        Builder paymentElementCallbackIdentifier(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier);

        @BindsInstance
        Builder savedStateHandle(SavedStateHandle handle);
    }

    PaymentSheetViewModelSubcomponent.Builder getPaymentSheetViewModelSubcomponentBuilder();
}
