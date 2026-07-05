package com.stripe.android.paymentsheet.flowcontroller;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkStore;
import com.stripe.android.link.injection.LinkAnalyticsComponent;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.confirmation.ConfirmationConstantsKt;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
import com.stripe.android.paymentsheet.ui.DefaultWalletButtonsInteractor;
import com.stripe.android.paymentsheet.ui.WalletButtonsContent;
import com.stripe.android.uicore.image.StripeImageLoader;
import dagger.Module;
import dagger.Provides;
import expo.modules.notifications.service.NotificationsService;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FlowControllerModule.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J*\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J*\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u001a\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010#\u001a\u00020\u000bH\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u0007J\b\u0010'\u001a\u00020(H\u0007J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020(0*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0007¨\u0006."}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule;", "", "<init>", "()V", "providesAppContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "provideFlowControllerLinkLauncher", "Lcom/stripe/android/link/LinkPaymentLauncher;", "linkAnalyticsComponentBuilder", "Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;", "linkActivityContract", "Lcom/stripe/android/link/LinkActivityContract;", NotificationsService.IDENTIFIER_KEY, "", "linkStore", "Lcom/stripe/android/link/account/LinkStore;", "provideWalletsButtonLinkLauncher", "provideProductUsageTokens", "", "provideViewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModel", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "providesSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "providesConfirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "confirmationHandlerFactory", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;", "providesWalletButtonsContent", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;", "walletsButtonLinkLauncher", "provideStripeImageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "context", "provideAllowsManualConfirmation", "", "provideIsLiveMode", "Lkotlin/Function0;", "paymentConfiguration", "Ljavax/inject/Provider;", "Lcom/stripe/android/PaymentConfiguration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(subcomponents = {PaymentOptionsViewModelSubcomponent.class})
/* loaded from: classes6.dex */
public final class FlowControllerModule {
    public static final int $stable = 0;
    public static final FlowControllerModule INSTANCE = new FlowControllerModule();

    @Provides
    @Singleton
    @Named(ConfirmationConstantsKt.ALLOWS_MANUAL_CONFIRMATION)
    public final boolean provideAllowsManualConfirmation() {
        return true;
    }

    private FlowControllerModule() {
    }

    @Provides
    @Singleton
    public final Context providesAppContext(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @Provides
    @Singleton
    public final EventReporter.Mode provideEventReporterMode() {
        return EventReporter.Mode.Custom;
    }

    @Provides
    @Singleton
    @Named(DefaultFlowController.FLOW_CONTROLLER_LINK_LAUNCHER)
    public final LinkPaymentLauncher provideFlowControllerLinkLauncher(LinkAnalyticsComponent.Builder linkAnalyticsComponentBuilder, LinkActivityContract linkActivityContract, @PaymentElementCallbackIdentifier String identifier, LinkStore linkStore) {
        Intrinsics.checkNotNullParameter(linkAnalyticsComponentBuilder, "linkAnalyticsComponentBuilder");
        Intrinsics.checkNotNullParameter(linkActivityContract, "linkActivityContract");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(linkStore, "linkStore");
        return new LinkPaymentLauncher(linkAnalyticsComponentBuilder, identifier, linkActivityContract, linkStore);
    }

    @Provides
    @Singleton
    @Named(DefaultFlowController.WALLETS_BUTTON_LINK_LAUNCHER)
    public final LinkPaymentLauncher provideWalletsButtonLinkLauncher(LinkAnalyticsComponent.Builder linkAnalyticsComponentBuilder, LinkActivityContract linkActivityContract, @PaymentElementCallbackIdentifier String identifier, LinkStore linkStore) {
        Intrinsics.checkNotNullParameter(linkAnalyticsComponentBuilder, "linkAnalyticsComponentBuilder");
        Intrinsics.checkNotNullParameter(linkActivityContract, "linkActivityContract");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(linkStore, "linkStore");
        return new LinkPaymentLauncher(linkAnalyticsComponentBuilder, identifier, linkActivityContract, linkStore);
    }

    @Provides
    @Singleton
    @Named(NamedConstantsKt.PRODUCT_USAGE)
    public final Set<String> provideProductUsageTokens() {
        return SetsKt.setOf("PaymentSheet.FlowController");
    }

    @Provides
    @Singleton
    public final CoroutineScope provideViewModelScope(FlowControllerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        return ViewModelKt.getViewModelScope(viewModel);
    }

    @Provides
    @Singleton
    public final SavedStateHandle providesSavedStateHandle(FlowControllerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        return viewModel.getHandle();
    }

    @Provides
    @Singleton
    public final ConfirmationHandler providesConfirmationHandler(ConfirmationHandler.Factory confirmationHandlerFactory, FlowControllerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(confirmationHandlerFactory, "confirmationHandlerFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        return confirmationHandlerFactory.create(ViewModelKt.getViewModelScope(viewModel));
    }

    @Provides
    @Singleton
    public final WalletButtonsContent providesWalletButtonsContent(FlowControllerViewModel viewModel, @Named(DefaultFlowController.WALLETS_BUTTON_LINK_LAUNCHER) LinkPaymentLauncher walletsButtonLinkLauncher) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(walletsButtonLinkLauncher, "walletsButtonLinkLauncher");
        return new WalletButtonsContent(DefaultWalletButtonsInteractor.INSTANCE.create(viewModel, walletsButtonLinkLauncher));
    }

    @Provides
    @Singleton
    public final StripeImageLoader provideStripeImageLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new StripeImageLoader(context, null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideIsLiveMode$lambda$0(Provider provider) {
        return StringsKt.startsWith$default(((PaymentConfiguration) provider.get()).getPublishableKey(), "pk_live", false, 2, (Object) null);
    }

    @Provides
    @Singleton
    @Named(com.stripe.android.core.injection.NamedConstantsKt.IS_LIVE_MODE)
    public final Function0<Boolean> provideIsLiveMode(final Provider<PaymentConfiguration> paymentConfiguration) {
        Intrinsics.checkNotNullParameter(paymentConfiguration, "paymentConfiguration");
        return new Function0() { // from class: com.stripe.android.paymentsheet.flowcontroller.FlowControllerModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(FlowControllerModule.provideIsLiveMode$lambda$0(paymentConfiguration));
            }
        };
    }
}
