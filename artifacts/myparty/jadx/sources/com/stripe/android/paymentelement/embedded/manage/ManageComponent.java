package com.stripe.android.paymentelement.embedded.manage;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.ui.core.di.CardScanModule;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: ManageComponent.kt */
@Component(modules = {ManageModule.class, EmbeddedCommonModule.class, CardScanModule.class})
@Singleton
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0012J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;", "", "viewModel", "Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;", "getViewModel", "()Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "getCustomerStateHolder", "()Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "getSelectionHolder", "()Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "inject", "", "activity", "Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ManageComponent {

    /* compiled from: ManageComponent.kt */
    @Component.Factory
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent$Factory;", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "context", "Landroid/content/Context;", "paymentElementCallbackIdentifier", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        ManageComponent build(@BindsInstance SavedStateHandle savedStateHandle, @BindsInstance PaymentMethodMetadata paymentMethodMetadata, @BindsInstance Context context, @BindsInstance @PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier);
    }

    CustomerStateHolder getCustomerStateHolder();

    EmbeddedSelectionHolder getSelectionHolder();

    ManageViewModel getViewModel();

    void inject(ManageActivity activity);
}
