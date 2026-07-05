package com.stripe.android.customersheet.injection;

import android.content.Context;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.customersheet.CustomerEphemeralKey;
import com.stripe.android.customersheet.injection.StripeCustomerAdapterModule;
import com.stripe.android.paymentsheet.DefaultPrefsRepository;
import com.stripe.android.paymentsheet.PrefsRepository;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeCustomerAdapterComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterModule;", "", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface StripeCustomerAdapterModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: StripeCustomerAdapterComponent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterModule$Companion;", "", "<init>", "()V", "providePrefsRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/customersheet/CustomerEphemeralKey;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "appContext", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        public final Function1<CustomerEphemeralKey, PrefsRepository> providePrefsRepositoryFactory(final Context appContext, @IOContext final CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            return new Function1() { // from class: com.stripe.android.customersheet.injection.StripeCustomerAdapterModule$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return StripeCustomerAdapterModule.Companion.providePrefsRepositoryFactory$lambda$0(appContext, workContext, (CustomerEphemeralKey) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DefaultPrefsRepository providePrefsRepositoryFactory$lambda$0(Context context, CoroutineContext coroutineContext, CustomerEphemeralKey customer) {
            Intrinsics.checkNotNullParameter(customer, "customer");
            return new DefaultPrefsRepository(context, customer.getCustomerId(), coroutineContext);
        }
    }
}
