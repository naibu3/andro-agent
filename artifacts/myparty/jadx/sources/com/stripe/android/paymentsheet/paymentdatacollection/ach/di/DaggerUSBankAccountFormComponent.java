package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormComponent;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes6.dex */
public final class DaggerUSBankAccountFormComponent {
    private DaggerUSBankAccountFormComponent() {
    }

    public static USBankAccountFormComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements USBankAccountFormComponent.Builder {
        private Application application;

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormComponent.Builder
        public USBankAccountFormComponent build() {
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            return new USBankAccountFormComponentImpl(new USBankAccountFormViewModelModule(), this.application);
        }
    }

    private static final class USBankAccountFormViewModelSubcomponentBuilder implements USBankAccountFormViewModelSubcomponent.Builder {
        private AutocompleteAddressInteractor.Factory autocompleteAddressInteractorFactory;
        private USBankAccountFormViewModel.Args configuration;
        private SavedStateHandle savedStateHandle;
        private final USBankAccountFormComponentImpl uSBankAccountFormComponentImpl;

        private USBankAccountFormViewModelSubcomponentBuilder(USBankAccountFormComponentImpl uSBankAccountFormComponentImpl) {
            this.uSBankAccountFormComponentImpl = uSBankAccountFormComponentImpl;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent.Builder
        public USBankAccountFormViewModelSubcomponentBuilder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent.Builder
        public USBankAccountFormViewModelSubcomponentBuilder configuration(USBankAccountFormViewModel.Args args) {
            this.configuration = (USBankAccountFormViewModel.Args) Preconditions.checkNotNull(args);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent.Builder
        public USBankAccountFormViewModelSubcomponentBuilder autocompleteAddressInteractorFactory(AutocompleteAddressInteractor.Factory factory) {
            this.autocompleteAddressInteractorFactory = factory;
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent.Builder
        public USBankAccountFormViewModelSubcomponent build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.configuration, USBankAccountFormViewModel.Args.class);
            return new USBankAccountFormViewModelSubcomponentImpl(this.uSBankAccountFormComponentImpl, this.savedStateHandle, this.configuration, this.autocompleteAddressInteractorFactory);
        }
    }

    private static final class USBankAccountFormViewModelSubcomponentImpl implements USBankAccountFormViewModelSubcomponent {
        private final AutocompleteAddressInteractor.Factory autocompleteAddressInteractorFactory;
        private final USBankAccountFormViewModel.Args configuration;
        private final SavedStateHandle savedStateHandle;
        private final USBankAccountFormComponentImpl uSBankAccountFormComponentImpl;
        private final USBankAccountFormViewModelSubcomponentImpl uSBankAccountFormViewModelSubcomponentImpl;

        private USBankAccountFormViewModelSubcomponentImpl(USBankAccountFormComponentImpl uSBankAccountFormComponentImpl, SavedStateHandle savedStateHandle, USBankAccountFormViewModel.Args args, AutocompleteAddressInteractor.Factory factory) {
            this.uSBankAccountFormViewModelSubcomponentImpl = this;
            this.uSBankAccountFormComponentImpl = uSBankAccountFormComponentImpl;
            this.configuration = args;
            this.savedStateHandle = savedStateHandle;
            this.autocompleteAddressInteractorFactory = factory;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent
        public USBankAccountFormViewModel getViewModel() {
            return new USBankAccountFormViewModel(this.configuration, this.uSBankAccountFormComponentImpl.application, this.uSBankAccountFormComponentImpl.providePaymentConfigurationProvider, this.savedStateHandle, this.autocompleteAddressInteractorFactory);
        }
    }

    private static final class USBankAccountFormComponentImpl implements USBankAccountFormComponent {
        private final Application application;
        private Provider<Application> applicationProvider;
        private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
        private Provider<Context> providesAppContextProvider;
        private final USBankAccountFormComponentImpl uSBankAccountFormComponentImpl;
        private Provider<USBankAccountFormViewModelSubcomponent.Builder> uSBankAccountFormViewModelSubcomponentBuilderProvider;

        private USBankAccountFormComponentImpl(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Application application) {
            this.uSBankAccountFormComponentImpl = this;
            this.application = application;
            initialize(uSBankAccountFormViewModelModule, application);
        }

        private void initialize(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Application application) {
            this.uSBankAccountFormViewModelSubcomponentBuilderProvider = new Provider<USBankAccountFormViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.DaggerUSBankAccountFormComponent.USBankAccountFormComponentImpl.1
                @Override // javax.inject.Provider
                public USBankAccountFormViewModelSubcomponent.Builder get() {
                    return new USBankAccountFormViewModelSubcomponentBuilder(USBankAccountFormComponentImpl.this.uSBankAccountFormComponentImpl);
                }
            };
            Factory factoryCreate = InstanceFactory.create(application);
            this.applicationProvider = factoryCreate;
            USBankAccountFormViewModelModule_ProvidesAppContextFactory uSBankAccountFormViewModelModule_ProvidesAppContextFactoryCreate = USBankAccountFormViewModelModule_ProvidesAppContextFactory.create(uSBankAccountFormViewModelModule, (Provider<Application>) factoryCreate);
            this.providesAppContextProvider = uSBankAccountFormViewModelModule_ProvidesAppContextFactoryCreate;
            this.providePaymentConfigurationProvider = USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory.create(uSBankAccountFormViewModelModule, (Provider<Context>) uSBankAccountFormViewModelModule_ProvidesAppContextFactoryCreate);
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormComponent
        public javax.inject.Provider<USBankAccountFormViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            return this.uSBankAccountFormViewModelSubcomponentBuilderProvider;
        }
    }
}
