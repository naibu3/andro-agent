package com.stripe.android.financialconnections.di;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.Logger;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.domain.AttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.domain.CreateInstantDebitsResult;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.domain.RealAttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.domain.RealCreateInstantDebitsResult;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForNetworking;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.features.notice.RealPresentSheet;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.repository.ConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import com.stripe.android.financialconnections.repository.api.FinancialConnectionsConsumersApiService;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.financialconnections.repository.api.RealProvideApiRequestOptions;
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.repository.ConsumersApiServiceImpl;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.android.uicore.navigation.NavigationManager;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import java.util.Locale;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetNativeModule.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H'¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;", "", "bindsPresentNoticeSheet", "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;", "impl", "Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;", "bindsNavigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;", "bindsHandleError", "Lcom/stripe/android/financialconnections/domain/HandleError;", "Lcom/stripe/android/financialconnections/domain/RealHandleError;", "bindsProvideApiRequestOptions", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;", "bindsAttachConsumerToLinkAccountSession", "Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;", "Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession;", "bindsCreateInstantDebitsPaymentMethod", "Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;", "Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface FinancialConnectionsSheetNativeModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    AttachConsumerToLinkAccountSession bindsAttachConsumerToLinkAccountSession(RealAttachConsumerToLinkAccountSession impl);

    @Binds
    CreateInstantDebitsResult bindsCreateInstantDebitsPaymentMethod(RealCreateInstantDebitsResult impl);

    @Binds
    HandleError bindsHandleError(RealHandleError impl);

    @ActivityRetainedScope
    @Binds
    NavigationManager bindsNavigationManager(NavigationManagerImpl impl);

    @Binds
    PresentSheet bindsPresentNoticeSheet(RealPresentSheet impl);

    @ActivityRetainedScope
    @Binds
    ProvideApiRequestOptions bindsProvideApiRequestOptions(RealProvideApiRequestOptions impl);

    /* compiled from: FinancialConnectionsSheetNativeModule.kt */
    @Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J>\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007JT\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0007J0\u0010)\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,H\u0007J \u0010-\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J%\u0010/\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00100\u001a\u0002012\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b2J1\u00103\u001a\u0002042\u0006\u0010#\u001a\u00020$2\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\f\u00108\u001a\b\u0012\u0004\u0012\u00020906H\u0001¢\u0006\u0002\b:J\u0017\u0010;\u001a\u0004\u0018\u00010(2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>J\u0017\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\bA¨\u0006B"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;", "", "<init>", "()V", "provideConsumersApiService", "Lcom/stripe/android/repository/ConsumersApiService;", "apiVersion", "Lcom/stripe/android/core/ApiVersion;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "providesImageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "context", "Landroid/app/Application;", "providesFinancialConnectionsManifestRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "provideApiRequestOptions", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "locale", "Ljava/util/Locale;", "logger", "Lcom/stripe/android/core/Logger;", "initialSynchronizeSessionResponse", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "providesFinancialConnectionsConsumerSessionRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;", "consumersApiService", "financialConnectionsConsumersApiService", "Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;", "consumerSessionRepository", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;", "isLinkWithStripe", "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;", "fraudDetectionDataRepository", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "providesFinancialConnectionsAccountsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "providesFinancialConnectionsInstitutionsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;", "provideFinancialConnectionsConsumersApiService", "apiOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "provideFinancialConnectionsConsumersApiService$financial_connections_release", "provideLinkSignupHandler", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;", "linkSignupHandlerForInstantDebits", "Ljavax/inject/Provider;", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;", "linkSignupHandlerForNetworking", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;", "provideLinkSignupHandler$financial_connections_release", "provideElementsSessionContext", "initialState", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "provideElementsSessionContext$financial_connections_release", "providePrefillDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;", "providePrefillDetails$financial_connections_release", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @ActivityRetainedScope
        public final ConsumersApiService provideConsumersApiService(ApiVersion apiVersion, StripeNetworkClient stripeNetworkClient) {
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
            return new ConsumersApiServiceImpl(stripeNetworkClient, apiVersion.getCode(), "AndroidBindings/21.22.2", null);
        }

        @Provides
        @ActivityRetainedScope
        public final StripeImageLoader providesImageLoader(Application context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new StripeImageLoader(context, null, null, null, null, 14, null);
        }

        @Provides
        @ActivityRetainedScope
        public final FinancialConnectionsManifestRepository providesFinancialConnectionsManifestRepository(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Factory apiRequestFactory, ProvideApiRequestOptions provideApiRequestOptions, Locale locale, Logger logger, @Named(NamedConstantsKt.INITIAL_SYNC_RESPONSE) SynchronizeSessionResponse initialSynchronizeSessionResponse) {
            Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
            Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
            Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
            Intrinsics.checkNotNullParameter(logger, "logger");
            FinancialConnectionsManifestRepository.Companion companion = FinancialConnectionsManifestRepository.INSTANCE;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            Locale locale2 = locale;
            Intrinsics.checkNotNull(locale2);
            return companion.invoke(requestExecutor, apiRequestFactory, provideApiRequestOptions, logger, locale2, initialSynchronizeSessionResponse);
        }

        @Provides
        @ActivityRetainedScope
        public final FinancialConnectionsConsumerSessionRepository providesFinancialConnectionsConsumerSessionRepository(ConsumersApiService consumersApiService, ProvideApiRequestOptions provideApiRequestOptions, FinancialConnectionsConsumersApiService financialConnectionsConsumersApiService, ConsumerSessionRepository consumerSessionRepository, Locale locale, Logger logger, IsLinkWithStripe isLinkWithStripe, FraudDetectionDataRepository fraudDetectionDataRepository, ElementsSessionContext elementsSessionContext) {
            Intrinsics.checkNotNullParameter(consumersApiService, "consumersApiService");
            Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
            Intrinsics.checkNotNullParameter(financialConnectionsConsumersApiService, "financialConnectionsConsumersApiService");
            Intrinsics.checkNotNullParameter(consumerSessionRepository, "consumerSessionRepository");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(isLinkWithStripe, "isLinkWithStripe");
            Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
            return FinancialConnectionsConsumerSessionRepository.INSTANCE.invoke(consumersApiService, provideApiRequestOptions, consumerSessionRepository, financialConnectionsConsumersApiService, locale == null ? Locale.getDefault() : locale, logger, isLinkWithStripe, fraudDetectionDataRepository, elementsSessionContext);
        }

        @Provides
        @ActivityRetainedScope
        public final FinancialConnectionsAccountsRepository providesFinancialConnectionsAccountsRepository(FinancialConnectionsRequestExecutor requestExecutor, ProvideApiRequestOptions provideApiRequestOptions, ApiRequest.Factory apiRequestFactory, Logger logger, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
            Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
            Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return FinancialConnectionsAccountsRepository.INSTANCE.invoke(requestExecutor, provideApiRequestOptions, apiRequestFactory, logger, savedStateHandle);
        }

        @Provides
        @ActivityRetainedScope
        public final FinancialConnectionsInstitutionsRepository providesFinancialConnectionsInstitutionsRepository(FinancialConnectionsRequestExecutor requestExecutor, ProvideApiRequestOptions provideApiRequestOptions, ApiRequest.Factory apiRequestFactory) {
            Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
            Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
            Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
            return FinancialConnectionsInstitutionsRepository.INSTANCE.invoke(requestExecutor, provideApiRequestOptions, apiRequestFactory);
        }

        @Provides
        public final FinancialConnectionsConsumersApiService provideFinancialConnectionsConsumersApiService$financial_connections_release(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Options apiOptions, ApiRequest.Factory apiRequestFactory) {
            Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
            Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
            Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
            return FinancialConnectionsConsumersApiService.INSTANCE.invoke(requestExecutor, apiOptions, apiRequestFactory);
        }

        @Provides
        public final LinkSignupHandler provideLinkSignupHandler$financial_connections_release(IsLinkWithStripe isLinkWithStripe, Provider<LinkSignupHandlerForInstantDebits> linkSignupHandlerForInstantDebits, Provider<LinkSignupHandlerForNetworking> linkSignupHandlerForNetworking) {
            Intrinsics.checkNotNullParameter(isLinkWithStripe, "isLinkWithStripe");
            Intrinsics.checkNotNullParameter(linkSignupHandlerForInstantDebits, "linkSignupHandlerForInstantDebits");
            Intrinsics.checkNotNullParameter(linkSignupHandlerForNetworking, "linkSignupHandlerForNetworking");
            if (isLinkWithStripe.invoke()) {
                LinkSignupHandlerForInstantDebits linkSignupHandlerForInstantDebits2 = linkSignupHandlerForInstantDebits.get();
                Intrinsics.checkNotNull(linkSignupHandlerForInstantDebits2);
                return linkSignupHandlerForInstantDebits2;
            }
            LinkSignupHandlerForNetworking linkSignupHandlerForNetworking2 = linkSignupHandlerForNetworking.get();
            Intrinsics.checkNotNull(linkSignupHandlerForNetworking2);
            return linkSignupHandlerForNetworking2;
        }

        @Provides
        public final ElementsSessionContext provideElementsSessionContext$financial_connections_release(FinancialConnectionsSheetNativeState initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            return initialState.getElementsSessionContext();
        }

        @Provides
        public final ElementsSessionContext.PrefillDetails providePrefillDetails$financial_connections_release(FinancialConnectionsSheetNativeState initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            ElementsSessionContext elementsSessionContext = initialState.getElementsSessionContext();
            if (elementsSessionContext != null) {
                return elementsSessionContext.getPrefillDetails();
            }
            return null;
        }
    }
}
