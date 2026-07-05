package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressElementViewModel;
import com.stripe.android.ui.core.forms.resources.injection.ResourceRepositoryModule;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: AddressElementViewModelFactoryComponent.kt */
@Component(modules = {PaymentSheetCommonModule.class, CoroutineContextModule.class, StripeRepositoryModule.class, CoreCommonModule.class, AddressElementViewModelModule.class, ResourceRepositoryModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent;", "", "addressElementViewModel", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "getAddressElementViewModel", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddressElementViewModelFactoryComponent {

    /* compiled from: AddressElementViewModelFactoryComponent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent$Builder;", "", "context", "Landroid/content/Context;", "starterArgs", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        AddressElementViewModelFactoryComponent build();

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder starterArgs(AddressElementActivityContract.Args starterArgs);
    }

    AddressElementViewModel getAddressElementViewModel();
}
