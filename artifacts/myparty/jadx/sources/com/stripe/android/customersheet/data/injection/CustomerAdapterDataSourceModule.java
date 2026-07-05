package com.stripe.android.customersheet.data.injection;

import com.stripe.android.customersheet.data.CustomerAdapterDataSource;
import com.stripe.android.customersheet.data.CustomerSheetInitializationDataSource;
import com.stripe.android.customersheet.data.CustomerSheetIntentDataSource;
import com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource;
import com.stripe.android.customersheet.data.CustomerSheetSavedSelectionDataSource;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;

/* compiled from: CustomerAdapterDataSourceModule.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\f"}, d2 = {"Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceModule;", "", "bindsCustomerSheetPaymentMethodDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;", "impl", "Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;", "bindsCustomerSheetIntentDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;", "bindsCustomerSheetSavedSelectionDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;", "bindsCustomerSheetInitializationDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface CustomerAdapterDataSourceModule {
    @Binds
    CustomerSheetInitializationDataSource bindsCustomerSheetInitializationDataSource(CustomerAdapterDataSource impl);

    @Binds
    CustomerSheetIntentDataSource bindsCustomerSheetIntentDataSource(CustomerAdapterDataSource impl);

    @Binds
    CustomerSheetPaymentMethodDataSource bindsCustomerSheetPaymentMethodDataSource(CustomerAdapterDataSource impl);

    @Binds
    CustomerSheetSavedSelectionDataSource bindsCustomerSheetSavedSelectionDataSource(CustomerAdapterDataSource impl);
}
