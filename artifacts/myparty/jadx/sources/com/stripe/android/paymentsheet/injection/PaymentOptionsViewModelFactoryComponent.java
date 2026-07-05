package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
import com.stripe.android.ui.core.di.CardScanModule;
import com.stripe.android.ui.core.forms.resources.injection.ResourceRepositoryModule;
import dagger.BindsInstance;
import dagger.Component;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: PaymentOptionsViewModelFactoryComponent.kt */
@Component(modules = {StripeRepositoryModule.class, PaymentSheetCommonModule.class, PaymentOptionsViewModelModule.class, CoroutineContextModule.class, CoreCommonModule.class, ResourceRepositoryModule.class, CardScanModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent;", "", "paymentOptionsViewModelSubcomponentBuilder", "Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelSubcomponent$Builder;", "getPaymentOptionsViewModelSubcomponentBuilder", "()Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelSubcomponent$Builder;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PaymentOptionsViewModelFactoryComponent {

    /* compiled from: PaymentOptionsViewModelFactoryComponent.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH'J\u0018\u0010\t\u001a\u00020\u00002\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u0012\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000bH'J\b\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent$Builder;", "", "context", "Landroid/content/Context;", "application", "Landroid/app/Application;", "savedStateHandle", "handle", "Landroidx/lifecycle/SavedStateHandle;", NamedConstantsKt.PRODUCT_USAGE, "", "", "paymentElementCallbackIdentifier", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        PaymentOptionsViewModelFactoryComponent build();

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder paymentElementCallbackIdentifier(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier);

        @BindsInstance
        Builder productUsage(@Named(NamedConstantsKt.PRODUCT_USAGE) Set<String> productUsage);

        @BindsInstance
        Builder savedStateHandle(SavedStateHandle handle);
    }

    PaymentOptionsViewModelSubcomponent.Builder getPaymentOptionsViewModelSubcomponentBuilder();
}
