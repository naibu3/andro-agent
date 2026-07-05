package com.stripe.android.paymentsheet.paymentdatacollection.polling.di;

import android.app.Application;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelSubcomponent;
import com.stripe.android.polling.IntentStatusPoller;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: PollingComponent.kt */
@Component(modules = {CoroutineContextModule.class, PollingViewModelModule.class, StripeRepositoryModule.class, CoreCommonModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent;", "", "subcomponentBuilder", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelSubcomponent$Builder;", "getSubcomponentBuilder", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelSubcomponent$Builder;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PollingComponent {

    /* compiled from: PollingComponent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent$Builder;", "", "application", "Landroid/app/Application;", "config", "Lcom/stripe/android/polling/IntentStatusPoller$Config;", "ioDispatcher", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        PollingComponent build();

        @BindsInstance
        Builder config(IntentStatusPoller.Config config);

        @BindsInstance
        Builder ioDispatcher(CoroutineDispatcher dispatcher);
    }

    PollingViewModelSubcomponent.Builder getSubcomponentBuilder();
}
