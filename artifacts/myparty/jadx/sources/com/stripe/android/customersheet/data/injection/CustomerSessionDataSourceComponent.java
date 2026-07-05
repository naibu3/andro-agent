package com.stripe.android.customersheet.data.injection;

import android.app.Application;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.common.di.ApplicationIdModule;
import com.stripe.android.common.di.MobileSessionIdModule;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.data.CustomerSheetInitializationDataSource;
import com.stripe.android.customersheet.data.CustomerSheetIntentDataSource;
import com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource;
import com.stripe.android.customersheet.data.CustomerSheetSavedSelectionDataSource;
import com.stripe.android.customersheet.injection.CustomerSheetDataCommonModule;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: CustomerSessionDataSourceComponent.kt */
@Component(modules = {CustomerSessionDataSourceModule.class, CustomerSheetDataSourceCommonModule.class, CustomerSheetDataCommonModule.class, StripeRepositoryModule.class, CoroutineContextModule.class, CoreCommonModule.class, ApplicationIdModule.class, MobileSessionIdModule.class})
@Singleton
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0012R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceComponent;", "", "customerSheetPaymentMethodDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;", "getCustomerSheetPaymentMethodDataSource", "()Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;", "customerSheetSavedSelectionDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;", "getCustomerSheetSavedSelectionDataSource", "()Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;", "customerSheetIntentDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;", "getCustomerSheetIntentDataSource", "()Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;", "customerSheetInitializationDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;", "getCustomerSheetInitializationDataSource", "()Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CustomerSessionDataSourceComponent {

    /* compiled from: CustomerSessionDataSourceComponent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceComponent$Builder;", "", "application", "Landroid/app/Application;", "customerSessionProvider", "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        CustomerSessionDataSourceComponent build();

        @BindsInstance
        Builder customerSessionProvider(CustomerSheet.CustomerSessionProvider customerSessionProvider);
    }

    CustomerSheetInitializationDataSource getCustomerSheetInitializationDataSource();

    CustomerSheetIntentDataSource getCustomerSheetIntentDataSource();

    CustomerSheetPaymentMethodDataSource getCustomerSheetPaymentMethodDataSource();

    CustomerSheetSavedSelectionDataSource getCustomerSheetSavedSelectionDataSource();
}
