package com.stripe.android.financialconnections.di;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.Logger;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.AnalyticsRequestV2Executor;
import com.stripe.android.core.networking.AnalyticsRequestV2Storage;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor_Factory;
import com.stripe.android.core.networking.RealAnalyticsRequestV2Storage;
import com.stripe.android.core.networking.RealAnalyticsRequestV2Storage_Factory;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.utils.IsWorkManagerAvailable;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter_Factory;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsResponseEventEmitter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsResponseEventEmitter_Factory;
import com.stripe.android.financialconnections.browser.BrowserManager;
import com.stripe.android.financialconnections.debug.DebugConfiguration;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken;
import com.stripe.android.financialconnections.domain.FetchPaginatedAccountsForSession;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.GetOrFetchSync_Factory;
import com.stripe.android.financialconnections.domain.IntegrityVerdictManager;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator_Factory;
import com.stripe.android.financialconnections.domain.NativeAuthFlowRouter;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor_Factory;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl_Factory;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;

/* loaded from: classes5.dex */
public final class DaggerFinancialConnectionsSheetComponent {
    private DaggerFinancialConnectionsSheetComponent() {
    }

    public static FinancialConnectionsSheetComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements FinancialConnectionsSheetComponent.Builder {
        private Application application;
        private FinancialConnectionsSheetConfiguration configuration;
        private FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent;
        private FinancialConnectionsSheetState initialState;
        private SavedStateHandle savedStateHandle;

        private Builder() {
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent.Builder
        public Builder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent.Builder
        public Builder initialState(FinancialConnectionsSheetState financialConnectionsSheetState) {
            this.initialState = (FinancialConnectionsSheetState) Preconditions.checkNotNull(financialConnectionsSheetState);
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent.Builder
        public Builder configuration(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            this.configuration = (FinancialConnectionsSheetConfiguration) Preconditions.checkNotNull(financialConnectionsSheetConfiguration);
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent.Builder
        public Builder sharedComponent(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent) {
            this.financialConnectionsSingletonSharedComponent = (FinancialConnectionsSingletonSharedComponent) Preconditions.checkNotNull(financialConnectionsSingletonSharedComponent);
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent.Builder
        public FinancialConnectionsSheetComponent build() {
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.initialState, FinancialConnectionsSheetState.class);
            Preconditions.checkBuilderRequirement(this.configuration, FinancialConnectionsSheetConfiguration.class);
            Preconditions.checkBuilderRequirement(this.financialConnectionsSingletonSharedComponent, FinancialConnectionsSingletonSharedComponent.class);
            return new FinancialConnectionsSheetComponentImpl(this.financialConnectionsSingletonSharedComponent, this.application, this.savedStateHandle, this.initialState, this.configuration);
        }
    }

    private static final class FinancialConnectionsSheetComponentImpl implements FinancialConnectionsSheetComponent {
        private final Application application;
        private Provider<Application> applicationProvider;
        private Provider<AnalyticsRequestV2Executor> bindsAnalyticsRequestV2ExecutorProvider;
        private Provider<AnalyticsRequestV2Storage> bindsAnalyticsRequestV2StorageProvider;
        private final FinancialConnectionsSheetConfiguration configuration;
        private Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<DefaultAnalyticsRequestV2Executor> defaultAnalyticsRequestV2ExecutorProvider;
        private Provider<DefaultFinancialConnectionsEventReporter> defaultFinancialConnectionsEventReporterProvider;
        private Provider<FinancialConnectionsRepositoryImpl> financialConnectionsRepositoryImplProvider;
        private Provider<FinancialConnectionsRequestExecutor> financialConnectionsRequestExecutorProvider;
        private Provider<FinancialConnectionsResponseEventEmitter> financialConnectionsResponseEventEmitterProvider;
        private final FinancialConnectionsSheetComponentImpl financialConnectionsSheetComponentImpl;
        private final FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent;
        private Provider<GetOrFetchSync> getOrFetchSyncProvider;
        private final FinancialConnectionsSheetState initialState;
        private Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
        private Provider<AnalyticsRequestFactory> provideAnalyticsRequestFactory$financial_connections_releaseProvider;
        private Provider<FinancialConnectionsRepository> provideConnectionsRepositoryProvider;
        private Provider<FinancialConnectionsEventReporter> provideEventReporterProvider;
        private Provider<FraudDetectionDataRepository> provideFraudDetectionDataRepository$financial_connections_releaseProvider;
        private Provider<Locale> provideLocale$financial_connections_releaseProvider;
        private Provider<Logger> provideLogger$financial_connections_releaseProvider;
        private Provider<StripeNetworkClient> provideStripeNetworkClientProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private Provider<AnalyticsRequestExecutor> providesAnalyticsRequestExecutor$financial_connections_releaseProvider;
        private Provider<FinancialConnectionsAnalyticsTracker> providesAnalyticsTrackerProvider;
        private Provider<ApiRequest.Options> providesApiOptions$financial_connections_releaseProvider;
        private Provider<ApiRequest.Factory> providesApiRequestFactoryProvider;
        private Provider<ApiVersion> providesApiVersionProvider;
        private Provider<String> providesApplicationIdProvider;
        private Provider<Boolean> providesEnableLoggingProvider;
        private Provider<FinancialConnectionsManifestRepository> providesFinancialConnectionsManifestRepositoryProvider;
        private Provider<CoroutineDispatcher> providesIoDispatcher$financial_connections_releaseProvider;
        private Provider<IsWorkManagerAvailable> providesIsWorkManagerAvailable$financial_connections_releaseProvider;
        private Provider<Json> providesJson$financial_connections_releaseProvider;
        private Provider<ProvideApiRequestOptions> providesProvideApiRequestOptions$financial_connections_releaseProvider;
        private Provider<String> providesPublishableKeyProvider;
        private Provider<String> providesStripeAccountIdProvider;
        private Provider<RealAnalyticsRequestV2Storage> realAnalyticsRequestV2StorageProvider;
        private final SavedStateHandle savedStateHandle;

        private FinancialConnectionsSheetComponentImpl(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent, Application application, SavedStateHandle savedStateHandle, FinancialConnectionsSheetState financialConnectionsSheetState, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            this.financialConnectionsSheetComponentImpl = this;
            this.savedStateHandle = savedStateHandle;
            this.configuration = financialConnectionsSheetConfiguration;
            this.financialConnectionsSingletonSharedComponent = financialConnectionsSingletonSharedComponent;
            this.application = application;
            this.initialState = financialConnectionsSheetState;
            initialize(financialConnectionsSingletonSharedComponent, application, savedStateHandle, financialConnectionsSheetState, financialConnectionsSheetConfiguration);
            initialize2(financialConnectionsSingletonSharedComponent, application, savedStateHandle, financialConnectionsSheetState, financialConnectionsSheetConfiguration);
        }

        private GetOrFetchSync getOrFetchSync() {
            return new GetOrFetchSync(this.providesFinancialConnectionsManifestRepositoryProvider.get(), this.configuration, this.providesApplicationIdProvider.get());
        }

        private FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession() {
            return new FetchPaginatedAccountsForSession(this.provideConnectionsRepositoryProvider.get());
        }

        private FetchFinancialConnectionsSession fetchFinancialConnectionsSession() {
            return new FetchFinancialConnectionsSession(fetchPaginatedAccountsForSession(), this.provideConnectionsRepositoryProvider.get());
        }

        private FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken() {
            return new FetchFinancialConnectionsSessionForToken(this.provideConnectionsRepositoryProvider.get());
        }

        private BrowserManager browserManager() {
            return new BrowserManager(this.application);
        }

        private DebugConfiguration debugConfiguration() {
            return new DebugConfiguration(this.application);
        }

        private NativeAuthFlowRouter nativeAuthFlowRouter() {
            return new NativeAuthFlowRouter(this.providesAnalyticsTrackerProvider.get(), debugConfiguration());
        }

        private void initialize(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent, Application application, SavedStateHandle savedStateHandle, FinancialConnectionsSheetState financialConnectionsSheetState, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            Factory factoryCreate = InstanceFactory.create(application);
            this.applicationProvider = factoryCreate;
            this.providesApplicationIdProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory.create((Provider<Application>) factoryCreate));
            this.provideWorkContextProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvideWorkContextFactory.create());
            Provider<Boolean> provider = DoubleCheck.provider((Provider) FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory.create());
            this.providesEnableLoggingProvider = provider;
            Provider<Logger> provider2 = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvideLogger$financial_connections_releaseFactory.create(provider));
            this.provideLogger$financial_connections_releaseProvider = provider2;
            this.provideStripeNetworkClientProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvideStripeNetworkClientFactory.create(this.provideWorkContextProvider, provider2));
            Provider<Json> provider3 = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvidesJson$financial_connections_releaseFactory.create());
            this.providesJson$financial_connections_releaseProvider = provider3;
            FinancialConnectionsResponseEventEmitter_Factory financialConnectionsResponseEventEmitter_FactoryCreate = FinancialConnectionsResponseEventEmitter_Factory.create(provider3, this.provideLogger$financial_connections_releaseProvider);
            this.financialConnectionsResponseEventEmitterProvider = financialConnectionsResponseEventEmitter_FactoryCreate;
            this.financialConnectionsRequestExecutorProvider = FinancialConnectionsRequestExecutor_Factory.create(this.provideStripeNetworkClientProvider, (Provider<FinancialConnectionsResponseEventEmitter>) financialConnectionsResponseEventEmitter_FactoryCreate, this.providesJson$financial_connections_releaseProvider, this.provideLogger$financial_connections_releaseProvider);
            Provider<ApiVersion> provider4 = DoubleCheck.provider((Provider) FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory.create());
            this.providesApiVersionProvider = provider4;
            this.providesApiRequestFactoryProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvidesApiRequestFactoryFactory.create(provider4));
            Factory factoryCreate2 = InstanceFactory.create(financialConnectionsSheetConfiguration);
            this.configurationProvider = factoryCreate2;
            this.providesPublishableKeyProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory.create((Provider<FinancialConnectionsSheetConfiguration>) factoryCreate2));
            Provider<String> provider5 = DoubleCheck.provider((Provider) FinancialConnectionsSheetConfigurationModule_ProvidesStripeAccountIdFactory.create(this.configurationProvider));
            this.providesStripeAccountIdProvider = provider5;
            Provider<ApiRequest.Options> provider6 = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvidesApiOptions$financial_connections_releaseFactory.create(this.providesPublishableKeyProvider, provider5));
            this.providesApiOptions$financial_connections_releaseProvider = provider6;
            this.providesProvideApiRequestOptions$financial_connections_releaseProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetModule_ProvidesProvideApiRequestOptions$financial_connections_releaseFactory.create(provider6));
            Provider<Locale> provider7 = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvideLocale$financial_connections_releaseFactory.create());
            this.provideLocale$financial_connections_releaseProvider = provider7;
            this.providesFinancialConnectionsManifestRepositoryProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory.create(this.financialConnectionsRequestExecutorProvider, this.providesApiRequestFactoryProvider, this.providesProvideApiRequestOptions$financial_connections_releaseProvider, provider7, this.provideLogger$financial_connections_releaseProvider));
            FinancialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactory financialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactoryCreate = FinancialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactory.create(this.applicationProvider);
            this.provideFraudDetectionDataRepository$financial_connections_releaseProvider = financialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactoryCreate;
            FinancialConnectionsRepositoryImpl_Factory financialConnectionsRepositoryImpl_FactoryCreate = FinancialConnectionsRepositoryImpl_Factory.create(this.financialConnectionsRequestExecutorProvider, this.providesProvideApiRequestOptions$financial_connections_releaseProvider, (Provider<FraudDetectionDataRepository>) financialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactoryCreate, this.providesApiRequestFactoryProvider);
            this.financialConnectionsRepositoryImplProvider = financialConnectionsRepositoryImpl_FactoryCreate;
            this.provideConnectionsRepositoryProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvideConnectionsRepositoryFactory.create((Provider<FinancialConnectionsRepositoryImpl>) financialConnectionsRepositoryImpl_FactoryCreate));
            DefaultAnalyticsRequestExecutor_Factory defaultAnalyticsRequestExecutor_FactoryCreate = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLogger$financial_connections_releaseProvider, this.provideWorkContextProvider);
            this.defaultAnalyticsRequestExecutorProvider = defaultAnalyticsRequestExecutor_FactoryCreate;
            this.providesAnalyticsRequestExecutor$financial_connections_releaseProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory.create((Provider<DefaultAnalyticsRequestExecutor>) defaultAnalyticsRequestExecutor_FactoryCreate));
            Provider<AnalyticsRequestFactory> provider8 = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory.create(this.applicationProvider, this.providesPublishableKeyProvider));
            this.provideAnalyticsRequestFactory$financial_connections_releaseProvider = provider8;
            this.defaultFinancialConnectionsEventReporterProvider = DefaultFinancialConnectionsEventReporter_Factory.create(this.providesAnalyticsRequestExecutor$financial_connections_releaseProvider, provider8, this.provideWorkContextProvider);
        }

        private void initialize2(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent, Application application, SavedStateHandle savedStateHandle, FinancialConnectionsSheetState financialConnectionsSheetState, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            this.provideEventReporterProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvideEventReporterFactory.create(this.defaultFinancialConnectionsEventReporterProvider));
            this.getOrFetchSyncProvider = GetOrFetchSync_Factory.create(this.providesFinancialConnectionsManifestRepositoryProvider, this.configurationProvider, this.providesApplicationIdProvider);
            RealAnalyticsRequestV2Storage_Factory realAnalyticsRequestV2Storage_FactoryCreate = RealAnalyticsRequestV2Storage_Factory.create((Provider<Context>) this.applicationProvider);
            this.realAnalyticsRequestV2StorageProvider = realAnalyticsRequestV2Storage_FactoryCreate;
            this.bindsAnalyticsRequestV2StorageProvider = DoubleCheck.provider((Provider) realAnalyticsRequestV2Storage_FactoryCreate);
            Provider<IsWorkManagerAvailable> provider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvidesIsWorkManagerAvailable$financial_connections_releaseFactory.create(this.getOrFetchSyncProvider));
            this.providesIsWorkManagerAvailable$financial_connections_releaseProvider = provider;
            DefaultAnalyticsRequestV2Executor_Factory defaultAnalyticsRequestV2Executor_FactoryCreate = DefaultAnalyticsRequestV2Executor_Factory.create((Provider<Context>) this.applicationProvider, this.provideStripeNetworkClientProvider, this.provideLogger$financial_connections_releaseProvider, this.bindsAnalyticsRequestV2StorageProvider, provider);
            this.defaultAnalyticsRequestV2ExecutorProvider = defaultAnalyticsRequestV2Executor_FactoryCreate;
            Provider<AnalyticsRequestV2Executor> provider2 = DoubleCheck.provider((Provider) defaultAnalyticsRequestV2Executor_FactoryCreate);
            this.bindsAnalyticsRequestV2ExecutorProvider = provider2;
            this.providesAnalyticsTrackerProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsTrackerFactory.create(this.applicationProvider, this.getOrFetchSyncProvider, this.provideLocale$financial_connections_releaseProvider, this.configurationProvider, provider2));
            this.nativeAuthFlowCoordinatorProvider = DoubleCheck.provider((Provider) NativeAuthFlowCoordinator_Factory.create());
            this.providesIoDispatcher$financial_connections_releaseProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvidesIoDispatcher$financial_connections_releaseFactory.create());
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent
        public FinancialConnectionsSheetViewModel getViewModel() {
            return new FinancialConnectionsSheetViewModel(this.providesApplicationIdProvider.get(), this.savedStateHandle, getOrFetchSync(), (IntegrityRequestManager) Preconditions.checkNotNullFromComponent(this.financialConnectionsSingletonSharedComponent.integrityRequestManager()), (IntegrityVerdictManager) Preconditions.checkNotNullFromComponent(this.financialConnectionsSingletonSharedComponent.integrityVerdictManager()), fetchFinancialConnectionsSession(), fetchFinancialConnectionsSessionForToken(), this.provideLogger$financial_connections_releaseProvider.get(), browserManager(), this.provideEventReporterProvider.get(), this.providesAnalyticsTrackerProvider.get(), nativeAuthFlowRouter(), this.nativeAuthFlowCoordinatorProvider.get(), this.initialState, this.providesIoDispatcher$financial_connections_releaseProvider.get());
        }
    }
}
