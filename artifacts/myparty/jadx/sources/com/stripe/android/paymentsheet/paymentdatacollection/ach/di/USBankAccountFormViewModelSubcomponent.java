package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;

/* compiled from: USBankAccountFormViewModelSubcomponent.kt */
@Subcomponent
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface USBankAccountFormViewModelSubcomponent {

    /* compiled from: USBankAccountFormViewModelSubcomponent.kt */
    @Subcomponent.Builder
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H'J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tH'J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelSubcomponent$Builder;", "", "savedStateHandle", "handle", "Landroidx/lifecycle/SavedStateHandle;", "configuration", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;", "autocompleteAddressInteractorFactory", "interactorFactory", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/di/USBankAccountFormViewModelSubcomponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        @BindsInstance
        Builder autocompleteAddressInteractorFactory(AutocompleteAddressInteractor.Factory interactorFactory);

        USBankAccountFormViewModelSubcomponent build();

        @BindsInstance
        Builder configuration(USBankAccountFormViewModel.Args configuration);

        @BindsInstance
        Builder savedStateHandle(SavedStateHandle handle);
    }

    USBankAccountFormViewModel getViewModel();
}
