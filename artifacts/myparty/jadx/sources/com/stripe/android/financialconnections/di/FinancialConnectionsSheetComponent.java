package com.stripe.android.financialconnections.di;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;

/* compiled from: FinancialConnectionsSheetComponent.kt */
@Component(dependencies = {FinancialConnectionsSingletonSharedComponent.class}, modules = {FinancialConnectionsSheetModule.class, FinancialConnectionsSheetSharedModule.class})
@ActivityRetainedScope
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent;", "", "viewModel", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;", "getViewModel", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;", "Builder", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FinancialConnectionsSheetComponent {

    /* compiled from: FinancialConnectionsSheetComponent.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;", "", "application", "Landroid/app/Application;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "initialState", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "sharedComponent", "component", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        FinancialConnectionsSheetComponent build();

        @BindsInstance
        Builder configuration(FinancialConnectionsSheetConfiguration configuration);

        @BindsInstance
        Builder initialState(FinancialConnectionsSheetState initialState);

        @BindsInstance
        Builder savedStateHandle(SavedStateHandle savedStateHandle);

        Builder sharedComponent(FinancialConnectionsSingletonSharedComponent component);
    }

    FinancialConnectionsSheetViewModel getViewModel();
}
