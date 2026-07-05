package com.stripe.android.link.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.common.di.ApplicationIdModule;
import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkDismissalCoordinator;
import com.stripe.android.link.LinkExpressMode;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.WebLinkActivityContract;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAuth;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.confirmation.LinkConfirmationHandler;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.confirmation.injection.DefaultConfirmationModule;
import com.stripe.android.paymentelement.confirmation.link.LinkPassthroughConfirmationModule;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.addresselement.AutocompleteLauncher;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.ui.core.di.CardScanModule;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: NativeLinkComponent.kt */
@NativeLinkScope
@Component(modules = {NativeLinkModule.class, LinkViewModelModule.class, ApplicationIdModule.class, DefaultConfirmationModule.class, LinkPassthroughConfirmationModule.class, CardScanModule.class})
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001BR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0012\u0010\"\u001a\u00020#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0012\u0010*\u001a\u00020+X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0012\u0010.\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0012\u00102\u001a\u000203X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0012\u00106\u001a\u000207X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0012\u0010:\u001a\u00020;X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0012\u0010>\u001a\u00020?X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/stripe/android/link/injection/NativeLinkComponent;", "", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "getLinkAccountManager", "()Lcom/stripe/android/link/account/LinkAccountManager;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "getConfiguration", "()Lcom/stripe/android/link/LinkConfiguration;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "getLinkEventsReporter", "()Lcom/stripe/android/link/analytics/LinkEventsReporter;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "getErrorReporter", "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "logger", "Lcom/stripe/android/core/Logger;", "getLogger", "()Lcom/stripe/android/core/Logger;", "linkConfirmationHandlerFactory", "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;", "getLinkConfirmationHandlerFactory", "()Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;", "webLinkActivityContract", "Lcom/stripe/android/link/WebLinkActivityContract;", "getWebLinkActivityContract", "()Lcom/stripe/android/link/WebLinkActivityContract;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "getCardAccountRangeRepositoryFactory", "()Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "linkAuth", "Lcom/stripe/android/link/account/LinkAuth;", "getLinkAuth", "()Lcom/stripe/android/link/account/LinkAuth;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "viewModel", "Lcom/stripe/android/link/LinkActivityViewModel;", "getViewModel", "()Lcom/stripe/android/link/LinkActivityViewModel;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "getEventReporter", "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "getNavigationManager", "()Lcom/stripe/android/uicore/navigation/NavigationManager;", "dismissalCoordinator", "Lcom/stripe/android/link/LinkDismissalCoordinator;", "getDismissalCoordinator", "()Lcom/stripe/android/link/LinkDismissalCoordinator;", "linkLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "getLinkLaunchMode", "()Lcom/stripe/android/link/LinkLaunchMode;", "autocompleteLauncher", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;", "getAutocompleteLauncher", "()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface NativeLinkComponent {

    /* compiled from: NativeLinkComponent.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0018\u0010\u0004\u001a\u00020\u00002\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u001a\u0010\u0007\u001a\u00020\u00002\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H'J\u0012\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0006H'J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH'J\u0019\u0010\r\u001a\u00020\u00002\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000eH'¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H'J\u0012\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H'J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H'J\b\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;", "", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "paymentElementCallbackIdentifier", "context", "Landroid/content/Context;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "statusBarColor", "", "(Ljava/lang/Integer;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;", "application", "Landroid/app/Application;", "linkExpressMode", "Lcom/stripe/android/link/LinkExpressMode;", "linkLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "linkAccountUpdate", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/link/injection/NativeLinkComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        NativeLinkComponent build();

        @BindsInstance
        Builder configuration(LinkConfiguration configuration);

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder linkAccountUpdate(LinkAccountUpdate.Value linkAccountUpdate);

        @BindsInstance
        Builder linkExpressMode(@Named(NativeLinkDIConstsKt.LINK_EXPRESS_MODE) LinkExpressMode linkExpressMode);

        @BindsInstance
        Builder linkLaunchMode(LinkLaunchMode linkLaunchMode);

        @BindsInstance
        Builder paymentElementCallbackIdentifier(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier);

        @BindsInstance
        Builder publishableKeyProvider(@Named("publishableKey") Function0<String> publishableKeyProvider);

        @BindsInstance
        Builder savedStateHandle(SavedStateHandle savedStateHandle);

        @BindsInstance
        Builder statusBarColor(@Named(NamedConstantsKt.STATUS_BAR_COLOR) Integer statusBarColor);

        @BindsInstance
        Builder stripeAccountIdProvider(@Named(com.stripe.android.core.injection.NamedConstantsKt.STRIPE_ACCOUNT_ID) Function0<String> stripeAccountIdProvider);
    }

    AutocompleteLauncher getAutocompleteLauncher();

    CardAccountRangeRepository.Factory getCardAccountRangeRepositoryFactory();

    LinkConfiguration getConfiguration();

    LinkDismissalCoordinator getDismissalCoordinator();

    ErrorReporter getErrorReporter();

    EventReporter getEventReporter();

    LinkAccountManager getLinkAccountManager();

    LinkAuth getLinkAuth();

    LinkConfirmationHandler.Factory getLinkConfirmationHandlerFactory();

    LinkEventsReporter getLinkEventsReporter();

    LinkLaunchMode getLinkLaunchMode();

    Logger getLogger();

    NavigationManager getNavigationManager();

    SavedStateHandle getSavedStateHandle();

    LinkActivityViewModel getViewModel();

    WebLinkActivityContract getWebLinkActivityContract();
}
