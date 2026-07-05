package com.stripe.android.customersheet.data.injection;

import android.content.Context;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.customersheet.data.CustomerSessionElementsSessionManager;
import com.stripe.android.customersheet.data.CustomerSessionInitializationDataSource;
import com.stripe.android.customersheet.data.CustomerSessionIntentDataSource;
import com.stripe.android.customersheet.data.CustomerSessionPaymentMethodDataSource;
import com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource;
import com.stripe.android.customersheet.data.CustomerSheetInitializationDataSource;
import com.stripe.android.customersheet.data.CustomerSheetIntentDataSource;
import com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource;
import com.stripe.android.customersheet.data.CustomerSheetSavedSelectionDataSource;
import com.stripe.android.customersheet.data.DefaultCustomerSessionElementsSessionManager;
import com.stripe.android.customersheet.data.injection.CustomerSessionDataSourceModule;
import com.stripe.android.paymentsheet.DefaultPrefsRepository;
import com.stripe.android.paymentsheet.PrefsRepository;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSessionDataSourceModule.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H'¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule;", "", "bindsCustomerSheetPaymentMethodDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;", "impl", "Lcom/stripe/android/customersheet/data/CustomerSessionPaymentMethodDataSource;", "bindsCustomerSheetIntentDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;", "Lcom/stripe/android/customersheet/data/CustomerSessionIntentDataSource;", "bindsCustomerSheetSavedSelectionDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;", "Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;", "bindsCustomerSheetInitializationDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;", "Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;", "bindsCustomerSessionElementsSessionManager", "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;", "Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface CustomerSessionDataSourceModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    CustomerSessionElementsSessionManager bindsCustomerSessionElementsSessionManager(DefaultCustomerSessionElementsSessionManager impl);

    @Binds
    CustomerSheetInitializationDataSource bindsCustomerSheetInitializationDataSource(CustomerSessionInitializationDataSource impl);

    @Binds
    CustomerSheetIntentDataSource bindsCustomerSheetIntentDataSource(CustomerSessionIntentDataSource impl);

    @Binds
    CustomerSheetPaymentMethodDataSource bindsCustomerSheetPaymentMethodDataSource(CustomerSessionPaymentMethodDataSource impl);

    @Binds
    CustomerSheetSavedSelectionDataSource bindsCustomerSheetSavedSelectionDataSource(CustomerSessionSavedSelectionDataSource impl);

    /* compiled from: CustomerSessionDataSourceModule.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;", "", "<init>", "()V", "providePrefsRepositoryFactory", "Lkotlin/Function1;", "", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "appContext", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        public final Function1<String, PrefsRepository> providePrefsRepositoryFactory(final Context appContext, @IOContext final CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            return new Function1() { // from class: com.stripe.android.customersheet.data.injection.CustomerSessionDataSourceModule$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CustomerSessionDataSourceModule.Companion.providePrefsRepositoryFactory$lambda$0(appContext, workContext, (String) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DefaultPrefsRepository providePrefsRepositoryFactory$lambda$0(Context context, CoroutineContext coroutineContext, String customerId) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            return new DefaultPrefsRepository(context, customerId, coroutineContext);
        }
    }
}
