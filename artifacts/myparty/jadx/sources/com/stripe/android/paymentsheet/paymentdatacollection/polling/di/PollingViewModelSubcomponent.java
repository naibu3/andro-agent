package com.stripe.android.paymentsheet.paymentdatacollection.polling.di;

import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;

/* compiled from: PollingViewModelSubcomponent.kt */
@Subcomponent
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PollingViewModelSubcomponent {

    /* compiled from: PollingViewModelSubcomponent.kt */
    @Subcomponent.Builder
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H'J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelSubcomponent$Builder;", "", "savedStateHandle", "handle", "Landroidx/lifecycle/SavedStateHandle;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelSubcomponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        @BindsInstance
        Builder args(PollingViewModel.Args args);

        PollingViewModelSubcomponent build();

        @BindsInstance
        Builder savedStateHandle(SavedStateHandle handle);
    }

    PollingViewModel getViewModel();
}
