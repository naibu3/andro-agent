package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import com.stripe.android.PaymentConfiguration;
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
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressElementNavigator;
import com.stripe.android.paymentsheet.addresselement.AddressElementViewModel;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import com.stripe.android.paymentsheet.addresselement.InputAddressViewModel;
import com.stripe.android.paymentsheet.addresselement.NavHostAddressElementNavigator;
import com.stripe.android.paymentsheet.addresselement.NavHostAddressElementNavigator_Factory;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.addresselement.analytics.DefaultAddressLauncherEventReporter;
import com.stripe.android.paymentsheet.addresselement.analytics.DefaultAddressLauncherEventReporter_Factory;
import com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent;
import com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent;
import com.stripe.android.paymentsheet.injection.InputAddressViewModelSubcomponent;
import com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class DaggerAddressElementViewModelFactoryComponent {
    private DaggerAddressElementViewModelFactoryComponent() {
    }

    public static AddressElementViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements AddressElementViewModelFactoryComponent.Builder {
        private Context context;
        private AddressElementActivityContract.Args starterArgs;

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent.Builder
        public Builder starterArgs(AddressElementActivityContract.Args args) {
            this.starterArgs = (AddressElementActivityContract.Args) Preconditions.checkNotNull(args);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent.Builder
        public AddressElementViewModelFactoryComponent build() {
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.starterArgs, AddressElementActivityContract.Args.class);
            return new AddressElementViewModelFactoryComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), new AddressElementViewModelModule(), this.context, this.starterArgs);
        }
    }

    private static final class InputAddressViewModelSubcomponentBuilder implements InputAddressViewModelSubcomponent.Builder {
        private final AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl;

        private InputAddressViewModelSubcomponentBuilder(AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl) {
            this.addressElementViewModelFactoryComponentImpl = addressElementViewModelFactoryComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.injection.InputAddressViewModelSubcomponent.Builder
        public InputAddressViewModelSubcomponent build() {
            return new InputAddressViewModelSubcomponentImpl(this.addressElementViewModelFactoryComponentImpl);
        }
    }

    private static final class AutocompleteViewModelSubcomponentBuilder implements AutocompleteViewModelSubcomponent.Builder {
        private final AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl;
        private Application application;
        private AutocompleteViewModel.Args configuration;

        private AutocompleteViewModelSubcomponentBuilder(AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl) {
            this.addressElementViewModelFactoryComponentImpl = addressElementViewModelFactoryComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent.Builder
        public AutocompleteViewModelSubcomponentBuilder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent.Builder
        public AutocompleteViewModelSubcomponentBuilder configuration(AutocompleteViewModel.Args args) {
            this.configuration = (AutocompleteViewModel.Args) Preconditions.checkNotNull(args);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent.Builder
        public AutocompleteViewModelSubcomponent build() {
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.configuration, AutocompleteViewModel.Args.class);
            return new AutocompleteViewModelSubcomponentImpl(this.addressElementViewModelFactoryComponentImpl, this.application, this.configuration);
        }
    }

    private static final class InputAddressViewModelSubcomponentImpl implements InputAddressViewModelSubcomponent {
        private final AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl;
        private final InputAddressViewModelSubcomponentImpl inputAddressViewModelSubcomponentImpl;

        private InputAddressViewModelSubcomponentImpl(AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl) {
            this.inputAddressViewModelSubcomponentImpl = this;
            this.addressElementViewModelFactoryComponentImpl = addressElementViewModelFactoryComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.injection.InputAddressViewModelSubcomponent
        public InputAddressViewModel getInputAddressViewModel() {
            return new InputAddressViewModel(this.addressElementViewModelFactoryComponentImpl.starterArgs, (AddressElementNavigator) this.addressElementViewModelFactoryComponentImpl.navHostAddressElementNavigatorProvider.get(), (AddressLauncherEventReporter) this.addressElementViewModelFactoryComponentImpl.provideEventReporterProvider.get());
        }
    }

    private static final class AutocompleteViewModelSubcomponentImpl implements AutocompleteViewModelSubcomponent {
        private final AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl;
        private final Application application;
        private final AutocompleteViewModelSubcomponentImpl autocompleteViewModelSubcomponentImpl;
        private final AutocompleteViewModel.Args configuration;

        private AutocompleteViewModelSubcomponentImpl(AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl, Application application, AutocompleteViewModel.Args args) {
            this.autocompleteViewModelSubcomponentImpl = this;
            this.addressElementViewModelFactoryComponentImpl = addressElementViewModelFactoryComponentImpl;
            this.configuration = args;
            this.application = application;
        }

        @Override // com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent
        public AutocompleteViewModel getAutoCompleteViewModel() {
            return new AutocompleteViewModel((PlacesClientProxy) this.addressElementViewModelFactoryComponentImpl.provideGooglePlacesClient$paymentsheet_releaseProvider.get(), this.configuration, (AddressLauncherEventReporter) this.addressElementViewModelFactoryComponentImpl.provideEventReporterProvider.get(), this.application);
        }
    }

    private static final class AddressElementViewModelFactoryComponentImpl implements AddressElementViewModelFactoryComponent {
        private final AddressElementViewModelFactoryComponentImpl addressElementViewModelFactoryComponentImpl;
        private Provider<AutocompleteViewModelSubcomponent.Builder> autocompleteViewModelSubcomponentBuilderProvider;
        private Provider<Context> contextProvider;
        private Provider<DefaultAddressLauncherEventReporter> defaultAddressLauncherEventReporterProvider;
        private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
        private Provider<InputAddressViewModelSubcomponent.Builder> inputAddressViewModelSubcomponentBuilderProvider;
        private Provider<NavHostAddressElementNavigator> navHostAddressElementNavigatorProvider;
        private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
        private Provider<Boolean> provideEnabledLoggingProvider;
        private Provider<AddressLauncherEventReporter> provideEventReporterProvider;
        private Provider<PlacesClientProxy> provideGooglePlacesClient$paymentsheet_releaseProvider;
        private Provider<Logger> provideLoggerProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<Function0<String>> providePublishableKeyProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private Provider<Set<String>> providesProductUsageProvider;
        private final AddressElementActivityContract.Args starterArgs;
        private Provider<AddressElementActivityContract.Args> starterArgsProvider;

        private AddressElementViewModelFactoryComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, AddressElementViewModelModule addressElementViewModelModule, Context context, AddressElementActivityContract.Args args) {
            this.addressElementViewModelFactoryComponentImpl = this;
            this.starterArgs = args;
            initialize(coroutineContextModule, coreCommonModule, addressElementViewModelModule, context, args);
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, AddressElementViewModelModule addressElementViewModelModule, Context context, AddressElementActivityContract.Args args) {
            this.navHostAddressElementNavigatorProvider = DoubleCheck.provider((Provider) NavHostAddressElementNavigator_Factory.create());
            this.inputAddressViewModelSubcomponentBuilderProvider = new Provider<InputAddressViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerAddressElementViewModelFactoryComponent.AddressElementViewModelFactoryComponentImpl.1
                @Override // javax.inject.Provider
                public InputAddressViewModelSubcomponent.Builder get() {
                    return new InputAddressViewModelSubcomponentBuilder(AddressElementViewModelFactoryComponentImpl.this.addressElementViewModelFactoryComponentImpl);
                }
            };
            this.autocompleteViewModelSubcomponentBuilderProvider = new Provider<AutocompleteViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerAddressElementViewModelFactoryComponent.AddressElementViewModelFactoryComponentImpl.2
                @Override // javax.inject.Provider
                public AutocompleteViewModelSubcomponent.Builder get() {
                    return new AutocompleteViewModelSubcomponentBuilder(AddressElementViewModelFactoryComponentImpl.this.addressElementViewModelFactoryComponentImpl);
                }
            };
            Provider<Boolean> provider = DoubleCheck.provider((Provider) PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
            this.provideEnabledLoggingProvider = provider;
            this.provideLoggerProvider = DoubleCheck.provider((Provider) CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, provider));
            Provider<CoroutineContext> provider2 = DoubleCheck.provider((Provider) CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideWorkContextProvider = provider2;
            this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, provider2);
            Factory factoryCreate = InstanceFactory.create(context);
            this.contextProvider = factoryCreate;
            PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate = PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory.create((Provider<Context>) factoryCreate);
            this.providePaymentConfigurationProvider = paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate;
            this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create((Provider<PaymentConfiguration>) paymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactoryCreate);
            Provider<Set<String>> provider3 = DoubleCheck.provider((Provider) AddressElementViewModelModule_ProvidesProductUsageFactory.create(addressElementViewModelModule));
            this.providesProductUsageProvider = provider3;
            PaymentAnalyticsRequestFactory_Factory paymentAnalyticsRequestFactory_FactoryCreate = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.providePublishableKeyProvider, provider3);
            this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactory_FactoryCreate;
            Provider<DefaultAddressLauncherEventReporter> provider4 = DoubleCheck.provider((Provider) DefaultAddressLauncherEventReporter_Factory.create((Provider<AnalyticsRequestExecutor>) this.defaultAnalyticsRequestExecutorProvider, (Provider<AnalyticsRequestFactory>) paymentAnalyticsRequestFactory_FactoryCreate, this.provideWorkContextProvider));
            this.defaultAddressLauncherEventReporterProvider = provider4;
            this.provideEventReporterProvider = DoubleCheck.provider((Provider) AddressElementViewModelModule_ProvideEventReporterFactory.create(addressElementViewModelModule, provider4));
            Factory factoryCreate2 = InstanceFactory.create(args);
            this.starterArgsProvider = factoryCreate2;
            this.provideGooglePlacesClient$paymentsheet_releaseProvider = DoubleCheck.provider((Provider) AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory.create(addressElementViewModelModule, this.contextProvider, (Provider<AddressElementActivityContract.Args>) factoryCreate2));
        }

        @Override // com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent
        public AddressElementViewModel getAddressElementViewModel() {
            return new AddressElementViewModel(this.navHostAddressElementNavigatorProvider.get(), this.inputAddressViewModelSubcomponentBuilderProvider, this.autocompleteViewModelSubcomponentBuilderProvider);
        }
    }
}
