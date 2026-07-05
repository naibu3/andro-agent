package com.stripe.android.paymentelement.embedded.content;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.common.di.ApplicationIdModule;
import com.stripe.android.common.di.MobileSessionIdModule;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.confirmation.injection.ExtendedPaymentElementConfirmationModule;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule;
import com.stripe.android.paymentelement.embedded.EmbeddedLinkExtrasModule;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.injection.LinkHoldbackExposureModule;
import com.stripe.android.ui.core.di.CardScanModule;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: EmbeddedPaymentElementViewModelComponent.kt */
@Component(modules = {EmbeddedPaymentElementViewModelModule.class, GooglePayLauncherModule.class, ExtendedPaymentElementConfirmationModule.class, EmbeddedCommonModule.class, ApplicationIdModule.class, MobileSessionIdModule.class, CardScanModule.class, EmbeddedLinkExtrasModule.class, LinkHoldbackExposureModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelComponent;", "", "viewModel", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModel;", "getViewModel", "()Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModel;", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EmbeddedPaymentElementViewModelComponent {

    /* compiled from: EmbeddedPaymentElementViewModelComponent.kt */
    @Component.Factory
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelComponent$Factory;", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelComponent;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "application", "Landroid/app/Application;", "paymentElementCallbackIdentifier", "", "statusBarColor", "", "(Landroidx/lifecycle/SavedStateHandle;Landroid/app/Application;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        EmbeddedPaymentElementViewModelComponent build(@BindsInstance SavedStateHandle savedStateHandle, @BindsInstance Application application, @BindsInstance @PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier, @BindsInstance @Named(NamedConstantsKt.STATUS_BAR_COLOR) Integer statusBarColor);
    }

    EmbeddedPaymentElementViewModel getViewModel();
}
