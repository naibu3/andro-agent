package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.addresselement.AutocompleteContract;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: AutocompleteViewModelFactoryComponent.kt */
@Component(modules = {CoreCommonModule.class, CoroutineContextModule.class, StripeRepositoryModule.class, AutocompleteViewModelModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelFactoryComponent;", "", "autocompleteViewModel", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;", "getAutocompleteViewModel", "()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AutocompleteViewModelFactoryComponent {

    /* compiled from: AutocompleteViewModelFactoryComponent.kt */
    @Component.Factory
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelFactoryComponent$Factory;", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelFactoryComponent;", "application", "Landroid/app/Application;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        AutocompleteViewModelFactoryComponent build(@BindsInstance Application application, @BindsInstance AutocompleteContract.Args args);
    }

    AutocompleteViewModel getAutocompleteViewModel();
}
