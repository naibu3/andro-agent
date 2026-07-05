package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent;
import com.stripe.android.paymentsheet.injection.DaggerAddressElementViewModelFactoryComponent;
import com.stripe.android.paymentsheet.injection.InputAddressViewModelSubcomponent;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressElementViewModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010B-\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "Landroidx/lifecycle/ViewModel;", "navigator", "Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;", "inputAddressViewModelSubcomponentBuilderProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;", "autoCompleteViewModelSubcomponentBuilderProvider", "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "getNavigator", "()Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;", "getInputAddressViewModelSubcomponentBuilderProvider", "()Ljavax/inject/Provider;", "getAutoCompleteViewModelSubcomponentBuilderProvider", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressElementViewModel extends ViewModel {
    public static final int $stable = 8;
    private final Provider<AutocompleteViewModelSubcomponent.Builder> autoCompleteViewModelSubcomponentBuilderProvider;
    private final Provider<InputAddressViewModelSubcomponent.Builder> inputAddressViewModelSubcomponentBuilderProvider;
    private final NavHostAddressElementNavigator navigator;

    public final NavHostAddressElementNavigator getNavigator() {
        return this.navigator;
    }

    public final Provider<InputAddressViewModelSubcomponent.Builder> getInputAddressViewModelSubcomponentBuilderProvider() {
        return this.inputAddressViewModelSubcomponentBuilderProvider;
    }

    public final Provider<AutocompleteViewModelSubcomponent.Builder> getAutoCompleteViewModelSubcomponentBuilderProvider() {
        return this.autoCompleteViewModelSubcomponentBuilderProvider;
    }

    @Inject
    public AddressElementViewModel(NavHostAddressElementNavigator navigator, Provider<InputAddressViewModelSubcomponent.Builder> inputAddressViewModelSubcomponentBuilderProvider, Provider<AutocompleteViewModelSubcomponent.Builder> autoCompleteViewModelSubcomponentBuilderProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
        Intrinsics.checkNotNullParameter(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
        this.navigator = navigator;
        this.inputAddressViewModelSubcomponentBuilderProvider = inputAddressViewModelSubcomponentBuilderProvider;
        this.autoCompleteViewModelSubcomponentBuilderProvider = autoCompleteViewModelSubcomponentBuilderProvider;
    }

    /* compiled from: AddressElementViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "applicationSupplier", "Lkotlin/Function0;", "Landroid/app/Application;", "starterArgsSupplier", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 0;
        private final Function0<Application> applicationSupplier;
        private final Function0<AddressElementActivityContract.Args> starterArgsSupplier;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(Function0<? extends Application> applicationSupplier, Function0<AddressElementActivityContract.Args> starterArgsSupplier) {
            Intrinsics.checkNotNullParameter(applicationSupplier, "applicationSupplier");
            Intrinsics.checkNotNullParameter(starterArgsSupplier, "starterArgsSupplier");
            this.applicationSupplier = applicationSupplier;
            this.starterArgsSupplier = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            AddressElementViewModel addressElementViewModel = DaggerAddressElementViewModelFactoryComponent.builder().context(this.applicationSupplier.invoke()).starterArgs(this.starterArgsSupplier.invoke()).build().getAddressElementViewModel();
            Intrinsics.checkNotNull(addressElementViewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AddressElementViewModel.Factory.create");
            return addressElementViewModel;
        }
    }
}
