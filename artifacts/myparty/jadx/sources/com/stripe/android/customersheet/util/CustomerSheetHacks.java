package com.stripe.android.customersheet.util;

import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.common.coroutines.Single;
import com.stripe.android.common.coroutines.SingleKt;
import com.stripe.android.customersheet.CustomerSheetIntegration;
import com.stripe.android.customersheet.data.CustomerSheetInitializationDataSource;
import com.stripe.android.customersheet.data.CustomerSheetIntentDataSource;
import com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource;
import com.stripe.android.customersheet.data.CustomerSheetSavedSelectionDataSource;
import com.stripe.android.customersheet.data.injection.CustomerAdapterDataSourceComponent;
import com.stripe.android.customersheet.data.injection.CustomerSessionDataSourceComponent;
import com.stripe.android.customersheet.data.injection.DaggerCustomerAdapterDataSourceComponent;
import com.stripe.android.customersheet.data.injection.DaggerCustomerSessionDataSourceComponent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: CustomerSheetHacks.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0018R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\n¨\u0006 "}, d2 = {"Lcom/stripe/android/customersheet/util/CustomerSheetHacks;", "", "<init>", "()V", "_initializationDataSource", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;", "initializationDataSource", "Lcom/stripe/android/common/coroutines/Single;", "getInitializationDataSource", "()Lcom/stripe/android/common/coroutines/Single;", "_paymentMethodDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;", "paymentMethodDataSource", "getPaymentMethodDataSource", "_savedSelectionDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;", "savedSelectionDataSource", "getSavedSelectionDataSource", "_intentDataSource", "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;", "intentDataSource", "getIntentDataSource", "initialize", "", "application", "Landroid/app/Application;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "integration", "Lcom/stripe/android/customersheet/CustomerSheetIntegration;", "clear", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheetHacks {
    public static final CustomerSheetHacks INSTANCE = new CustomerSheetHacks();
    private static final MutableStateFlow<CustomerSheetInitializationDataSource> _initializationDataSource = StateFlowKt.MutableStateFlow(null);
    private static final MutableStateFlow<CustomerSheetPaymentMethodDataSource> _paymentMethodDataSource = StateFlowKt.MutableStateFlow(null);
    private static final MutableStateFlow<CustomerSheetSavedSelectionDataSource> _savedSelectionDataSource = StateFlowKt.MutableStateFlow(null);
    private static final MutableStateFlow<CustomerSheetIntentDataSource> _intentDataSource = StateFlowKt.MutableStateFlow(null);
    public static final int $stable = 8;

    private CustomerSheetHacks() {
    }

    public final Single<CustomerSheetInitializationDataSource> getInitializationDataSource() {
        return SingleKt.asSingle(_initializationDataSource);
    }

    public final Single<CustomerSheetPaymentMethodDataSource> getPaymentMethodDataSource() {
        return SingleKt.asSingle(_paymentMethodDataSource);
    }

    public final Single<CustomerSheetSavedSelectionDataSource> getSavedSelectionDataSource() {
        return SingleKt.asSingle(_savedSelectionDataSource);
    }

    public final Single<CustomerSheetIntentDataSource> getIntentDataSource() {
        return SingleKt.asSingle(_intentDataSource);
    }

    public final void initialize(Application application, LifecycleOwner lifecycleOwner, CustomerSheetIntegration integration) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(integration, "integration");
        if (integration instanceof CustomerSheetIntegration.Adapter) {
            CustomerAdapterDataSourceComponent customerAdapterDataSourceComponentBuild = DaggerCustomerAdapterDataSourceComponent.builder().application(application).adapter(((CustomerSheetIntegration.Adapter) integration).getAdapter()).build();
            _initializationDataSource.setValue(customerAdapterDataSourceComponentBuild.getCustomerSheetInitializationDataSource());
            _paymentMethodDataSource.setValue(customerAdapterDataSourceComponentBuild.getCustomerSheetPaymentMethodDataSource());
            _intentDataSource.setValue(customerAdapterDataSourceComponentBuild.getCustomerSheetIntentDataSource());
            _savedSelectionDataSource.setValue(customerAdapterDataSourceComponentBuild.getCustomerSheetSavedSelectionDataSource());
        } else {
            if (!(integration instanceof CustomerSheetIntegration.CustomerSession)) {
                throw new NoWhenBranchMatchedException();
            }
            CustomerSessionDataSourceComponent customerSessionDataSourceComponentBuild = DaggerCustomerSessionDataSourceComponent.builder().application(application).customerSessionProvider(((CustomerSheetIntegration.CustomerSession) integration).getCustomerSessionProvider()).build();
            _initializationDataSource.setValue(customerSessionDataSourceComponentBuild.getCustomerSheetInitializationDataSource());
            _paymentMethodDataSource.setValue(customerSessionDataSourceComponentBuild.getCustomerSheetPaymentMethodDataSource());
            _intentDataSource.setValue(customerSessionDataSourceComponentBuild.getCustomerSheetIntentDataSource());
            _savedSelectionDataSource.setValue(customerSessionDataSourceComponentBuild.getCustomerSheetSavedSelectionDataSource());
        }
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.stripe.android.customersheet.util.CustomerSheetHacks.initialize.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                boolean zIsChangingConfigurations;
                FragmentActivity activity;
                Intrinsics.checkNotNullParameter(owner, "owner");
                if (owner instanceof ComponentActivity) {
                    zIsChangingConfigurations = ((ComponentActivity) owner).isChangingConfigurations();
                } else {
                    zIsChangingConfigurations = (!(owner instanceof Fragment) || (activity = ((Fragment) owner).getActivity()) == null) ? false : activity.isChangingConfigurations();
                }
                if (!zIsChangingConfigurations) {
                    CustomerSheetHacks.INSTANCE.clear();
                }
                super.onDestroy(owner);
            }
        });
    }

    public final void clear() {
        _initializationDataSource.setValue(null);
        _paymentMethodDataSource.setValue(null);
        _savedSelectionDataSource.setValue(null);
        _intentDataSource.setValue(null);
    }
}
