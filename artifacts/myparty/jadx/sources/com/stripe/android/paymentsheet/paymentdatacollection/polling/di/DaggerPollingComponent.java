package com.stripe.android.paymentsheet.paymentdatacollection.polling.di;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.DefaultTimeProvider;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingComponent;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelSubcomponent;
import com.stripe.android.polling.DefaultIntentStatusPoller;
import com.stripe.android.polling.IntentStatusPoller;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes6.dex */
public final class DaggerPollingComponent {
    private DaggerPollingComponent() {
    }

    public static PollingComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements PollingComponent.Builder {
        private Application application;
        private IntentStatusPoller.Config config;
        private CoroutineDispatcher ioDispatcher;

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingComponent.Builder
        public Builder config(IntentStatusPoller.Config config) {
            this.config = (IntentStatusPoller.Config) Preconditions.checkNotNull(config);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingComponent.Builder
        public Builder ioDispatcher(CoroutineDispatcher coroutineDispatcher) {
            this.ioDispatcher = (CoroutineDispatcher) Preconditions.checkNotNull(coroutineDispatcher);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingComponent.Builder
        public PollingComponent build() {
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.config, IntentStatusPoller.Config.class);
            Preconditions.checkBuilderRequirement(this.ioDispatcher, CoroutineDispatcher.class);
            return new PollingComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), this.application, this.config, this.ioDispatcher);
        }
    }

    private static final class PollingViewModelSubcomponentBuilder implements PollingViewModelSubcomponent.Builder {
        private PollingViewModel.Args args;
        private final PollingComponentImpl pollingComponentImpl;
        private SavedStateHandle savedStateHandle;

        private PollingViewModelSubcomponentBuilder(PollingComponentImpl pollingComponentImpl) {
            this.pollingComponentImpl = pollingComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelSubcomponent.Builder
        public PollingViewModelSubcomponentBuilder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelSubcomponent.Builder
        public PollingViewModelSubcomponentBuilder args(PollingViewModel.Args args) {
            this.args = (PollingViewModel.Args) Preconditions.checkNotNull(args);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelSubcomponent.Builder
        public PollingViewModelSubcomponent build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.args, PollingViewModel.Args.class);
            return new PollingViewModelSubcomponentImpl(this.pollingComponentImpl, this.savedStateHandle, this.args);
        }
    }

    private static final class PollingViewModelSubcomponentImpl implements PollingViewModelSubcomponent {
        private final PollingViewModel.Args args;
        private final PollingComponentImpl pollingComponentImpl;
        private final PollingViewModelSubcomponentImpl pollingViewModelSubcomponentImpl;
        private final SavedStateHandle savedStateHandle;

        private PollingViewModelSubcomponentImpl(PollingComponentImpl pollingComponentImpl, SavedStateHandle savedStateHandle, PollingViewModel.Args args) {
            this.pollingViewModelSubcomponentImpl = this;
            this.pollingComponentImpl = pollingComponentImpl;
            this.args = args;
            this.savedStateHandle = savedStateHandle;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelSubcomponent
        public PollingViewModel getViewModel() {
            return new PollingViewModel(this.args, this.pollingComponentImpl.defaultIntentStatusPoller(), new DefaultTimeProvider(), this.savedStateHandle);
        }
    }

    private static final class PollingComponentImpl implements PollingComponent {
        private final Application application;
        private Provider<Application> applicationProvider;
        private final IntentStatusPoller.Config config;
        private final CoroutineDispatcher ioDispatcher;
        private final PollingComponentImpl pollingComponentImpl;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private Provider<Context> providesAppContextProvider;

        private PollingComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Application application, IntentStatusPoller.Config config, CoroutineDispatcher coroutineDispatcher) {
            this.pollingComponentImpl = this;
            this.application = application;
            this.config = config;
            this.ioDispatcher = coroutineDispatcher;
            initialize(coroutineContextModule, coreCommonModule, application, config, coroutineDispatcher);
        }

        private Context context() {
            return PollingViewModelModule_Companion_ProvidesAppContextFactory.providesAppContext(this.application);
        }

        private Function0<String> namedFunction0OfString() {
            return PollingViewModelModule_Companion_ProvidePublishableKeyFactory.providePublishableKey(context());
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(context(), namedFunction0OfString(), PollingViewModelModule_Companion_ProvidesProductUsageFactory.providesProductUsage());
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        private StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(context(), namedFunction0OfString(), this.provideWorkContextProvider.get(), PollingViewModelModule_Companion_ProvidesProductUsageFactory.providesProductUsage(), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DefaultIntentStatusPoller defaultIntentStatusPoller() {
            return new DefaultIntentStatusPoller(stripeApiRepository(), this.providePaymentConfigurationProvider, this.config, this.ioDispatcher);
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Application application, IntentStatusPoller.Config config, CoroutineDispatcher coroutineDispatcher) {
            this.provideWorkContextProvider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideLoggerProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, (Provider<Boolean>) PollingViewModelModule_Companion_ProvidesEnableLoggingFactory.create()));
            Factory factoryCreate = InstanceFactory.create(application);
            this.applicationProvider = factoryCreate;
            PollingViewModelModule_Companion_ProvidesAppContextFactory pollingViewModelModule_Companion_ProvidesAppContextFactoryCreate = PollingViewModelModule_Companion_ProvidesAppContextFactory.create((Provider<Application>) factoryCreate);
            this.providesAppContextProvider = pollingViewModelModule_Companion_ProvidesAppContextFactoryCreate;
            this.providePaymentConfigurationProvider = PollingViewModelModule_Companion_ProvidePaymentConfigurationFactory.create((Provider<Context>) pollingViewModelModule_Companion_ProvidesAppContextFactoryCreate);
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingComponent
        public PollingViewModelSubcomponent.Builder getSubcomponentBuilder() {
            return new PollingViewModelSubcomponentBuilder(this.pollingComponentImpl);
        }
    }
}
