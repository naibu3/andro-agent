package com.stripe.android.financialconnections.features.linkaccountpicker;

import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class LinkAccountPickerViewModel_Factory_Impl implements LinkAccountPickerViewModel.Factory {
    private final C0912LinkAccountPickerViewModel_Factory delegateFactory;

    LinkAccountPickerViewModel_Factory_Impl(C0912LinkAccountPickerViewModel_Factory c0912LinkAccountPickerViewModel_Factory) {
        this.delegateFactory = c0912LinkAccountPickerViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel.Factory
    public LinkAccountPickerViewModel create(LinkAccountPickerState linkAccountPickerState) {
        return this.delegateFactory.get(linkAccountPickerState);
    }

    public static Provider<LinkAccountPickerViewModel.Factory> create(C0912LinkAccountPickerViewModel_Factory c0912LinkAccountPickerViewModel_Factory) {
        return InstanceFactory.create(new LinkAccountPickerViewModel_Factory_Impl(c0912LinkAccountPickerViewModel_Factory));
    }

    public static dagger.internal.Provider<LinkAccountPickerViewModel.Factory> createFactoryProvider(C0912LinkAccountPickerViewModel_Factory c0912LinkAccountPickerViewModel_Factory) {
        return InstanceFactory.create(new LinkAccountPickerViewModel_Factory_Impl(c0912LinkAccountPickerViewModel_Factory));
    }
}
