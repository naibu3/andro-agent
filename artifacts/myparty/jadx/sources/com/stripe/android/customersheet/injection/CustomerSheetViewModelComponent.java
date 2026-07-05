package com.stripe.android.customersheet.injection;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.CustomerSheetIntegration;
import com.stripe.android.customersheet.CustomerSheetViewModel;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.paymentelement.confirmation.injection.DefaultConfirmationModule;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: CustomerSheetViewModelComponent.kt */
@Component(modules = {DefaultConfirmationModule.class, CustomerSheetViewModelModule.class, StripeRepositoryModule.class, GooglePayLauncherModule.class})
@CustomerSheetViewModelScope
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent;", "", "viewModel", "Lcom/stripe/android/customersheet/CustomerSheetViewModel;", "getViewModel", "()Lcom/stripe/android/customersheet/CustomerSheetViewModel;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CustomerSheetViewModelComponent {

    /* compiled from: CustomerSheetViewModelComponent.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0019\u0010\u0006\u001a\u00020\u00002\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH'J\b\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;", "", "application", "Landroid/app/Application;", "configuration", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "statusBarColor", "", "(Ljava/lang/Integer;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;", "integrationType", "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        CustomerSheetViewModelComponent build();

        @BindsInstance
        Builder configuration(CustomerSheet.Configuration configuration);

        @BindsInstance
        Builder integrationType(CustomerSheetIntegration.Type integrationType);

        @BindsInstance
        Builder savedStateHandle(SavedStateHandle savedStateHandle);

        @BindsInstance
        Builder statusBarColor(@Named(NamedConstantsKt.STATUS_BAR_COLOR) Integer statusBarColor);
    }

    CustomerSheetViewModel getViewModel();
}
