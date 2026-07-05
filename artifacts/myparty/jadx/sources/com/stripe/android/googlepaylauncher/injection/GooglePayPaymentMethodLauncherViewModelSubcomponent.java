package com.stripe.android.googlepaylauncher.injection;

import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;

/* compiled from: GooglePayPaymentMethodLauncherViewModelSubcomponent.kt */
@Subcomponent
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "Builder", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface GooglePayPaymentMethodLauncherViewModelSubcomponent {

    /* compiled from: GooglePayPaymentMethodLauncherViewModelSubcomponent.kt */
    @Subcomponent.Builder
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent$Builder;", "", CardScanActivity.ARGS, "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        @BindsInstance
        Builder args(GooglePayPaymentMethodLauncherContractV2.Args args);

        GooglePayPaymentMethodLauncherViewModelSubcomponent build();

        @BindsInstance
        Builder savedStateHandle(SavedStateHandle savedStateHandle);
    }

    GooglePayPaymentMethodLauncherViewModel getViewModel();
}
