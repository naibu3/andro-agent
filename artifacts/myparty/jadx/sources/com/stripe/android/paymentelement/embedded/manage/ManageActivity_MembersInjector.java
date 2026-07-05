package com.stripe.android.paymentelement.embedded.manage;

import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class ManageActivity_MembersInjector implements MembersInjector<ManageActivity> {
    private final Provider<CustomerStateHolder> customerStateHolderProvider;
    private final Provider<ManageNavigator> manageNavigatorProvider;
    private final Provider<EmbeddedSelectionHolder> selectionHolderProvider;

    public ManageActivity_MembersInjector(Provider<CustomerStateHolder> provider, Provider<ManageNavigator> provider2, Provider<EmbeddedSelectionHolder> provider3) {
        this.customerStateHolderProvider = provider;
        this.manageNavigatorProvider = provider2;
        this.selectionHolderProvider = provider3;
    }

    public static MembersInjector<ManageActivity> create(Provider<CustomerStateHolder> provider, Provider<ManageNavigator> provider2, Provider<EmbeddedSelectionHolder> provider3) {
        return new ManageActivity_MembersInjector(provider, provider2, provider3);
    }

    public static MembersInjector<ManageActivity> create(javax.inject.Provider<CustomerStateHolder> provider, javax.inject.Provider<ManageNavigator> provider2, javax.inject.Provider<EmbeddedSelectionHolder> provider3) {
        return new ManageActivity_MembersInjector(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ManageActivity manageActivity) {
        injectCustomerStateHolder(manageActivity, this.customerStateHolderProvider.get());
        injectManageNavigator(manageActivity, this.manageNavigatorProvider.get());
        injectSelectionHolder(manageActivity, this.selectionHolderProvider.get());
    }

    public static void injectCustomerStateHolder(ManageActivity manageActivity, CustomerStateHolder customerStateHolder) {
        manageActivity.customerStateHolder = customerStateHolder;
    }

    public static void injectManageNavigator(ManageActivity manageActivity, ManageNavigator manageNavigator) {
        manageActivity.manageNavigator = manageNavigator;
    }

    public static void injectSelectionHolder(ManageActivity manageActivity, EmbeddedSelectionHolder embeddedSelectionHolder) {
        manageActivity.selectionHolder = embeddedSelectionHolder;
    }
}
