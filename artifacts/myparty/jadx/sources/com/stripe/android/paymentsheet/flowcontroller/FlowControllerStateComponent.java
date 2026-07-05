package com.stripe.android.paymentsheet.flowcontroller;

import android.app.Application;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.common.di.ApplicationIdModule;
import com.stripe.android.common.di.MobileSessionIdModule;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.verification.DefaultLinkInlineInteractor;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.injection.ExtendedPaymentElementConfirmationModule;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerComponent;
import com.stripe.android.paymentsheet.injection.LinkHoldbackExposureModule;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule;
import com.stripe.android.paymentsheet.ui.WalletButtonsContent;
import com.stripe.android.ui.core.di.CardScanModule;
import com.stripe.android.ui.core.forms.resources.injection.ResourceRepositoryModule;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: FlowControllerStateComponent.kt */
@Component(modules = {StripeRepositoryModule.class, ExtendedPaymentElementConfirmationModule.class, PaymentSheetCommonModule.class, FlowControllerModule.class, GooglePayLauncherModule.class, CoroutineContextModule.class, CoreCommonModule.class, ResourceRepositoryModule.class, ApplicationIdModule.class, MobileSessionIdModule.class, CardScanModule.class, LinkHoldbackExposureModule.class})
@Singleton
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\"J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "", "flowControllerComponentBuilder", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;", "getFlowControllerComponentBuilder", "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;", "confirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "getConfirmationHandler", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "linkHandler", "Lcom/stripe/android/paymentsheet/LinkHandler;", "getLinkHandler", "()Lcom/stripe/android/paymentsheet/LinkHandler;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "getErrorReporter", "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "walletButtonsContent", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;", "getWalletButtonsContent", "()Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;", "linkInlineInteractor", "Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;", "getLinkInlineInteractor", "()Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;", "linkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "getLinkAccountHolder", "()Lcom/stripe/android/link/account/LinkAccountHolder;", "inject", "", "paymentOptionsViewModel", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FlowControllerStateComponent {

    /* compiled from: FlowControllerStateComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00002\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0012\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH'J\b\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;", "", "statusBarColor", "", "(Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;", "application", "Landroid/app/Application;", "paymentElementCallbackIdentifier", "", "flowControllerViewModel", "viewModel", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        FlowControllerStateComponent build();

        @BindsInstance
        Builder flowControllerViewModel(FlowControllerViewModel viewModel);

        @BindsInstance
        Builder paymentElementCallbackIdentifier(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier);

        @BindsInstance
        Builder statusBarColor(@Named(NamedConstantsKt.STATUS_BAR_COLOR) Integer statusBarColor);
    }

    ConfirmationHandler getConfirmationHandler();

    ErrorReporter getErrorReporter();

    FlowControllerComponent.Builder getFlowControllerComponentBuilder();

    LinkAccountHolder getLinkAccountHolder();

    LinkHandler getLinkHandler();

    DefaultLinkInlineInteractor getLinkInlineInteractor();

    WalletButtonsContent getWalletButtonsContent();

    void inject(PaymentOptionsViewModel.Factory paymentOptionsViewModel);
}
