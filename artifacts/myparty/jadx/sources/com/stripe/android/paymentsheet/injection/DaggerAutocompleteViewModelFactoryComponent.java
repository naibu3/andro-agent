package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.paymentsheet.addresselement.AutocompleteContract;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.addresselement.analytics.DefaultAddressLauncherEventReporter;
import com.stripe.android.paymentsheet.addresselement.analytics.DefaultAddressLauncherEventReporter_Factory;
import com.stripe.android.paymentsheet.injection.AutocompleteViewModelFactoryComponent;
import com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class DaggerAutocompleteViewModelFactoryComponent {
    private DaggerAutocompleteViewModelFactoryComponent() {
    }

    public static AutocompleteViewModelFactoryComponent.Factory factory() {
        return new Factory();
    }

    private static final class Factory implements AutocompleteViewModelFactoryComponent.Factory {
        private Factory() {
        }

        @Override // com.stripe.android.paymentsheet.injection.AutocompleteViewModelFactoryComponent.Factory
        public AutocompleteViewModelFactoryComponent build(Application application, AutocompleteContract.Args args) {
            Preconditions.checkNotNull(application);
            Preconditions.checkNotNull(args);
            return new AutocompleteViewModelFactoryComponentImpl(new CoreCommonModule(), new CoroutineContextModule(), application, args);
        }
    }

    private static final class AutocompleteViewModelFactoryComponentImpl implements AutocompleteViewModelFactoryComponent {
        private final Application application;
        private Provider<Application> applicationProvider;
        private Provider<AutocompleteContract.Args> argsProvider;
        private final AutocompleteViewModelFactoryComponentImpl autocompleteViewModelFactoryComponentImpl;
        private Provider<DefaultAddressLauncherEventReporter> defaultAddressLauncherEventReporterProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Provider<AddressLauncherEventReporter> provideEventReporterProvider;
        private Provider<PlacesClientProxy> provideGooglePlacesClient$paymentsheet_releaseProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private Provider<AutocompleteViewModel.Args> providesAutocompleteViewModelArgsProvider;
        private Provider<Context> providesContextProvider;
        private Provider<Set<String>> providesProductUsageProvider;
        private Provider<Function0<String>> providesPublishableKeyProvider;

        private AutocompleteViewModelFactoryComponentImpl(CoreCommonModule coreCommonModule, CoroutineContextModule coroutineContextModule, Application application, AutocompleteContract.Args args) {
            this.autocompleteViewModelFactoryComponentImpl = this;
            this.application = application;
            initialize(coreCommonModule, coroutineContextModule, application, args);
        }

        private void initialize(CoreCommonModule coreCommonModule, CoroutineContextModule coroutineContextModule, Application application, AutocompleteContract.Args args) {
            dagger.internal.Factory factoryCreate = InstanceFactory.create(application);
            this.applicationProvider = factoryCreate;
            this.providesContextProvider = DoubleCheck.provider((Provider) AutocompleteViewModelModule_Companion_ProvidesContextFactory.create((Provider<Application>) factoryCreate));
            dagger.internal.Factory factoryCreate2 = InstanceFactory.create(args);
            this.argsProvider = factoryCreate2;
            this.provideGooglePlacesClient$paymentsheet_releaseProvider = DoubleCheck.provider((Provider) AutocompleteViewModelModule_Companion_ProvideGooglePlacesClient$paymentsheet_releaseFactory.create(this.providesContextProvider, (Provider<AutocompleteContract.Args>) factoryCreate2));
            this.providesAutocompleteViewModelArgsProvider = DoubleCheck.provider((Provider) AutocompleteViewModelModule_Companion_ProvidesAutocompleteViewModelArgsFactory.create(this.argsProvider));
            this.provideLoggerProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, (Provider<Boolean>) AutocompleteViewModelModule_Companion_ProvidesEnableLoggingFactory.create()));
            Provider<CoroutineContext> provider = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideWorkContextProvider = provider;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, provider);
            this.providesPublishableKeyProvider = DoubleCheck.provider((Provider) AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory.create(this.providesContextProvider));
            Provider<Set<String>> provider2 = DoubleCheck.provider((Provider) AutocompleteViewModelModule_Companion_ProvidesProductUsageFactory.create());
            this.providesProductUsageProvider = provider2;
            PaymentAnalyticsRequestFactory_Factory paymentAnalyticsRequestFactory_FactoryCreate = PaymentAnalyticsRequestFactory_Factory.create(this.providesContextProvider, this.providesPublishableKeyProvider, provider2);
            this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactory_FactoryCreate;
            Provider<DefaultAddressLauncherEventReporter> provider3 = DoubleCheck.provider((Provider) DefaultAddressLauncherEventReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) paymentAnalyticsRequestFactory_FactoryCreate, this.provideWorkContextProvider));
            this.defaultAddressLauncherEventReporterProvider = provider3;
            this.provideEventReporterProvider = DoubleCheck.provider((Provider) AutocompleteViewModelModule_Companion_ProvideEventReporterFactory.create(provider3));
        }

        @Override // com.stripe.android.paymentsheet.injection.AutocompleteViewModelFactoryComponent
        public AutocompleteViewModel getAutocompleteViewModel() {
            return new AutocompleteViewModel(this.provideGooglePlacesClient$paymentsheet_releaseProvider.get(), this.providesAutocompleteViewModelArgsProvider.get(), this.provideEventReporterProvider.get(), this.application);
        }
    }
}
