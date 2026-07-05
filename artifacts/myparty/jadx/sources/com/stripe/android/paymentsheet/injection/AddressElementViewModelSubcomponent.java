package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressElementViewModel;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;

/* compiled from: AddressElementViewModelSubcomponent.kt */
@Subcomponent
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddressElementViewModelSubcomponent {

    /* compiled from: AddressElementViewModelSubcomponent.kt */
    @Subcomponent.Builder
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelSubcomponent$Builder;", "", "application", "Landroid/app/Application;", "savedStateHandle", "handle", "Landroidx/lifecycle/SavedStateHandle;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelSubcomponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        @BindsInstance
        Builder args(AddressElementActivityContract.Args args);

        AddressElementViewModelSubcomponent build();

        @BindsInstance
        Builder savedStateHandle(SavedStateHandle handle);
    }

    AddressElementViewModel getViewModel();
}
