package com.stripe.android.paymentelement.embedded.form;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.confirmation.injection.ExtendedPaymentElementConfirmationModule;
import com.stripe.android.paymentelement.embedded.EmbeddedCommonModule;
import com.stripe.android.paymentelement.embedded.EmbeddedLinkExtrasModule;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.form.FormActivitySubcomponent;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.ui.core.di.CardScanModule;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: FormActivityViewModelComponent.kt */
@Component(modules = {EmbeddedCommonModule.class, FormActivityViewModelModule.class, ExtendedPaymentElementConfirmationModule.class, GooglePayLauncherModule.class, CardScanModule.class, EmbeddedLinkExtrasModule.class})
@Singleton
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u000eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent;", "", "viewModel", "Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;", "getViewModel", "()Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "getSelectionHolder", "()Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "subcomponentFactory", "Lcom/stripe/android/paymentelement/embedded/form/FormActivitySubcomponent$Factory;", "getSubcomponentFactory", "()Lcom/stripe/android/paymentelement/embedded/form/FormActivitySubcomponent$Factory;", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FormActivityViewModelComponent {

    /* compiled from: FormActivityViewModelComponent.kt */
    @Component.Factory
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001Jm\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\f\b\u0001\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0015H&¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent$Factory;", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "selectedPaymentMethodCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "hasSavedPaymentMethods", "", "statusBarColor", "", "configuration", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "paymentElementCallbackIdentifier", "application", "Landroid/app/Application;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/lang/String;ZLjava/lang/Integer;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        FormActivityViewModelComponent build(@BindsInstance PaymentMethodMetadata paymentMethodMetadata, @BindsInstance String selectedPaymentMethodCode, @BindsInstance boolean hasSavedPaymentMethods, @BindsInstance @Named(NamedConstantsKt.STATUS_BAR_COLOR) Integer statusBarColor, @BindsInstance EmbeddedPaymentElement.Configuration configuration, @BindsInstance PaymentElementLoader.InitializationMode initializationMode, @BindsInstance @PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier, @BindsInstance Application application, @BindsInstance SavedStateHandle savedStateHandle);
    }

    EmbeddedSelectionHolder getSelectionHolder();

    FormActivitySubcomponent.Factory getSubcomponentFactory();

    FormActivityViewModel getViewModel();
}
