package com.stripe.android.customersheet.injection;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.customersheet.CustomerEphemeralKeyProvider;
import com.stripe.android.customersheet.SetupIntentClientSecretProvider;
import com.stripe.android.customersheet.StripeCustomerAdapter;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import dagger.BindsInstance;
import dagger.Component;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: StripeCustomerAdapterComponent.kt */
@Component(modules = {StripeCustomerAdapterModule.class, CustomerSheetDataCommonModule.class, StripeRepositoryModule.class, CoroutineContextModule.class, CoreCommonModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent;", "", "stripeCustomerAdapter", "Lcom/stripe/android/customersheet/StripeCustomerAdapter;", "getStripeCustomerAdapter", "()Lcom/stripe/android/customersheet/StripeCustomerAdapter;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface StripeCustomerAdapterComponent {

    /* compiled from: StripeCustomerAdapterComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H'J\u0018\u0010\b\u001a\u00020\u00002\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH'J\b\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;", "", "context", "Landroid/content/Context;", "customerEphemeralKeyProvider", "Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;", "setupIntentClientSecretProvider", "Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;", "paymentMethodTypes", "", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        StripeCustomerAdapterComponent build();

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder customerEphemeralKeyProvider(CustomerEphemeralKeyProvider customerEphemeralKeyProvider);

        @BindsInstance
        Builder paymentMethodTypes(List<String> paymentMethodTypes);

        @BindsInstance
        Builder setupIntentClientSecretProvider(SetupIntentClientSecretProvider setupIntentClientSecretProvider);
    }

    StripeCustomerAdapter getStripeCustomerAdapter();
}
