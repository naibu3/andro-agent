package com.stripe.android.link.injection;

import android.app.Application;
import android.content.Context;
import androidx.core.os.LocaleListCompat;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.Stripe;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.utils.DefaultDurationProvider;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.core.utils.RealUserFacingLogger;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkDismissalCoordinator;
import com.stripe.android.link.RealLinkDismissalCoordinator;
import com.stripe.android.link.account.DefaultLinkAccountManager;
import com.stripe.android.link.account.DefaultLinkAuth;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAuth;
import com.stripe.android.link.analytics.DefaultLinkEventsReporter;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.attestation.DefaultLinkAttestationCheck;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.confirmation.DefaultLinkConfirmationHandler;
import com.stripe.android.link.confirmation.LinkConfirmationHandler;
import com.stripe.android.link.gate.DefaultLinkGate;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.link.repositories.LinkApiRepository;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackReferences;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbacks;
import com.stripe.android.paymentelement.confirmation.ConfirmationConstantsKt;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.link.LinkPassthroughConfirmationDefinition;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.PaymentSheetConstantsKt;
import com.stripe.android.paymentsheet.addresselement.AutocompleteActivityLauncher;
import com.stripe.android.paymentsheet.addresselement.AutocompleteAppearanceContext;
import com.stripe.android.paymentsheet.addresselement.AutocompleteLauncher;
import com.stripe.android.paymentsheet.addresselement.DefaultAutocompleteLauncher;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.repository.ConsumersApiServiceImpl;
import com.stripe.android.uicore.navigation.NavigationManager;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import java.util.Locale;
import java.util.Set;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;

/* compiled from: NativeLinkModule.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 72\u00020\u0001:\u00017J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH'J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H'J\u0010\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020$H'J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H'J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020+H'J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020.H'J\u0010\u0010/\u001a\u0002002\u0006\u0010\u0010\u001a\u000201H'J\u0010\u00102\u001a\u0002032\u0006\u0010\u0010\u001a\u000204H'J\u0010\u00105\u001a\u0002062\u0006\u0010\u0010\u001a\u000204H'¨\u00068"}, d2 = {"Lcom/stripe/android/link/injection/NativeLinkModule;", "", "bindLinkRepository", "Lcom/stripe/android/link/repositories/LinkRepository;", "linkApiRepository", "Lcom/stripe/android/link/repositories/LinkApiRepository;", "bindLinkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;", "bindLinkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkAccountManager", "Lcom/stripe/android/link/account/DefaultLinkAccountManager;", "bindsNavigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "impl", "Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;", "bindsErrorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/RealErrorReporter;", "bindsCardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "defaultCardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;", "bindsEventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;", "bindsLinkGate", "Lcom/stripe/android/link/gate/LinkGate;", "linkGate", "Lcom/stripe/android/link/gate/DefaultLinkGate;", "bindsLinkAuth", "Lcom/stripe/android/link/account/LinkAuth;", "Lcom/stripe/android/link/account/DefaultLinkAuth;", "bindsLinkAttestationCheck", "Lcom/stripe/android/link/attestation/LinkAttestationCheck;", "linkAttestationCheck", "Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;", "bindsUserFacingLogger", "Lcom/stripe/android/core/utils/UserFacingLogger;", "Lcom/stripe/android/core/utils/RealUserFacingLogger;", "bindsAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "bindsDismissalCoordinator", "Lcom/stripe/android/link/LinkDismissalCoordinator;", "Lcom/stripe/android/link/RealLinkDismissalCoordinator;", "bindsAutocompleteActivityLauncher", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;", "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;", "bindsAutocompleteLauncher", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(includes = {StripeRepositoryModule.class})
/* loaded from: classes5.dex */
public interface NativeLinkModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NativeLinkScope
    @Binds
    LinkAccountManager bindLinkAccountManager(DefaultLinkAccountManager linkAccountManager);

    @NativeLinkScope
    @Binds
    LinkEventsReporter bindLinkEventsReporter(DefaultLinkEventsReporter linkEventsReporter);

    @NativeLinkScope
    @Binds
    LinkRepository bindLinkRepository(LinkApiRepository linkApiRepository);

    @Binds
    AnalyticsRequestFactory bindsAnalyticsRequestFactory(PaymentAnalyticsRequestFactory impl);

    @NativeLinkScope
    @Binds
    AutocompleteActivityLauncher bindsAutocompleteActivityLauncher(DefaultAutocompleteLauncher impl);

    @NativeLinkScope
    @Binds
    AutocompleteLauncher bindsAutocompleteLauncher(DefaultAutocompleteLauncher impl);

    @NativeLinkScope
    @Binds
    CardAccountRangeRepository.Factory bindsCardAccountRangeRepositoryFactory(DefaultCardAccountRangeRepositoryFactory defaultCardAccountRangeRepositoryFactory);

    @NativeLinkScope
    @Binds
    LinkDismissalCoordinator bindsDismissalCoordinator(RealLinkDismissalCoordinator impl);

    @NativeLinkScope
    @Binds
    ErrorReporter bindsErrorReporter(RealErrorReporter errorReporter);

    @NativeLinkScope
    @Binds
    EventReporter bindsEventReporter(DefaultEventReporter eventReporter);

    @NativeLinkScope
    @Binds
    LinkAttestationCheck bindsLinkAttestationCheck(DefaultLinkAttestationCheck linkAttestationCheck);

    @NativeLinkScope
    @Binds
    LinkAuth bindsLinkAuth(DefaultLinkAuth linkGate);

    @NativeLinkScope
    @Binds
    LinkGate bindsLinkGate(DefaultLinkGate linkGate);

    @NativeLinkScope
    @Binds
    NavigationManager bindsNavigationManager(NavigationManagerImpl impl);

    @Binds
    UserFacingLogger bindsUserFacingLogger(RealUserFacingLogger impl);

    /* compiled from: NativeLinkModule.kt */
    @Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0012\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0007J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u000fH\u0007J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007J\b\u0010\u001b\u001a\u00020\u0014H\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020\u0014H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J\b\u0010%\u001a\u00020&H\u0007J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0007J \u0010+\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030,2\u0006\u0010-\u001a\u00020.H\u0007J\u0014\u0010/\u001a\u0004\u0018\u0001002\b\b\u0001\u00101\u001a\u00020\u001aH\u0007J\b\u00102\u001a\u000203H\u0007¨\u00064"}, d2 = {"Lcom/stripe/android/link/injection/NativeLinkModule$Companion;", "", "<init>", "()V", "providesLinkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "linkAccountInfo", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", "provideConsumersApiService", "Lcom/stripe/android/repository/ConsumersApiService;", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "provideDurationProvider", "Lcom/stripe/android/core/utils/DurationProvider;", "provideLogger", NamedConstantsKt.ENABLE_LOGGING, "", "provideLocale", "Ljava/util/Locale;", "ioContext", "provideProductUsageTokens", "", "", "providesEnableLogging", "providePaymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "appContext", "Landroid/content/Context;", "provideAllowsManualConfirmation", "provideLinkConfirmationHandlerFactory", "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;", "factory", "Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "provideIntegrityStandardRequestManager", "Lcom/stripe/attestation/IntegrityRequestManager;", "context", "Landroid/app/Application;", "providesLinkPassthroughConfirmationDefinition", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "linkAccountManager", "Lcom/stripe/android/link/account/DefaultLinkAccountManager;", "providesAnalyticEventCallback", "Lcom/stripe/android/paymentelement/AnalyticEventCallback;", "paymentElementCallbackIdentifier", "provideAutocompleteLauncher", "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NativeLinkScope
        @Provides
        @Named(ConfirmationConstantsKt.ALLOWS_MANUAL_CONFIRMATION)
        public final boolean provideAllowsManualConfirmation() {
            return true;
        }

        @NativeLinkScope
        @Provides
        @Named(NamedConstantsKt.ENABLE_LOGGING)
        public final boolean providesEnableLogging() {
            return false;
        }

        private Companion() {
        }

        @NativeLinkScope
        @Provides
        public final LinkAccountHolder providesLinkAccountHolder(SavedStateHandle savedStateHandle, LinkAccountUpdate.Value linkAccountInfo) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
            LinkAccountHolder linkAccountHolder = new LinkAccountHolder(savedStateHandle);
            linkAccountHolder.set(linkAccountInfo);
            return linkAccountHolder;
        }

        @NativeLinkScope
        @Provides
        public final ConsumersApiService provideConsumersApiService(Logger logger, @IOContext CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            AppInfo appInfo = Stripe.INSTANCE.getAppInfo();
            return new ConsumersApiServiceImpl(new DefaultStripeNetworkClient(workContext, null, null, 0, logger, 14, null), Stripe.API_VERSION, "AndroidBindings/21.22.2", appInfo);
        }

        @NativeLinkScope
        @Provides
        public final DurationProvider provideDurationProvider() {
            return DefaultDurationProvider.INSTANCE.getInstance();
        }

        @NativeLinkScope
        @Provides
        public final Logger provideLogger(@Named(NamedConstantsKt.ENABLE_LOGGING) boolean enableLogging) {
            return Logger.INSTANCE.getInstance(enableLogging);
        }

        @NativeLinkScope
        @Provides
        public final Locale provideLocale() {
            LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
            if (adjustedDefault.isEmpty()) {
                adjustedDefault = null;
            }
            if (adjustedDefault != null) {
                return adjustedDefault.get(0);
            }
            return null;
        }

        @NativeLinkScope
        @Provides
        @IOContext
        public final CoroutineContext ioContext() {
            return Dispatchers.getIO();
        }

        @NativeLinkScope
        @Provides
        @Named(com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE)
        public final Set<String> provideProductUsageTokens() {
            return SetsKt.setOf(PaymentSheetConstantsKt.PAYMENT_SHEET_DEFAULT_CALLBACK_IDENTIFIER);
        }

        @NativeLinkScope
        @Provides
        public final PaymentConfiguration providePaymentConfiguration(Context appContext) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            return PaymentConfiguration.INSTANCE.getInstance(appContext);
        }

        @NativeLinkScope
        @Provides
        public final LinkConfirmationHandler.Factory provideLinkConfirmationHandlerFactory(DefaultLinkConfirmationHandler.Factory factory) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory;
        }

        @NativeLinkScope
        @Provides
        public final EventReporter.Mode provideEventReporterMode() {
            return EventReporter.Mode.Custom;
        }

        @NativeLinkScope
        @Provides
        public final IntegrityRequestManager provideIntegrityStandardRequestManager(Application context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return IntegrityRequestManagerModuleKt.createIntegrityStandardRequestManager(context);
        }

        @Provides
        @IntoSet
        public final ConfirmationDefinition<?, ?, ?, ?> providesLinkPassthroughConfirmationDefinition(DefaultLinkAccountManager linkAccountManager) {
            Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
            return new LinkPassthroughConfirmationDefinition(linkAccountManager);
        }

        @Provides
        public final AnalyticEventCallback providesAnalyticEventCallback(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier) {
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            PaymentElementCallbacks paymentElementCallbacks = PaymentElementCallbackReferences.INSTANCE.get(paymentElementCallbackIdentifier);
            if (paymentElementCallbacks != null) {
                return paymentElementCallbacks.getAnalyticEventCallback();
            }
            return null;
        }

        @NativeLinkScope
        @Provides
        public final DefaultAutocompleteLauncher provideAutocompleteLauncher() {
            return new DefaultAutocompleteLauncher(AutocompleteAppearanceContext.Link.INSTANCE);
        }
    }
}
