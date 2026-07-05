package com.stripe.android.financialconnections.features.linkstepupverification;

import com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class LinkStepUpVerificationViewModel_Factory_Impl implements LinkStepUpVerificationViewModel.Factory {
    private final C0917LinkStepUpVerificationViewModel_Factory delegateFactory;

    LinkStepUpVerificationViewModel_Factory_Impl(C0917LinkStepUpVerificationViewModel_Factory c0917LinkStepUpVerificationViewModel_Factory) {
        this.delegateFactory = c0917LinkStepUpVerificationViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel.Factory
    public LinkStepUpVerificationViewModel create(LinkStepUpVerificationState linkStepUpVerificationState) {
        return this.delegateFactory.get(linkStepUpVerificationState);
    }

    public static Provider<LinkStepUpVerificationViewModel.Factory> create(C0917LinkStepUpVerificationViewModel_Factory c0917LinkStepUpVerificationViewModel_Factory) {
        return InstanceFactory.create(new LinkStepUpVerificationViewModel_Factory_Impl(c0917LinkStepUpVerificationViewModel_Factory));
    }

    public static dagger.internal.Provider<LinkStepUpVerificationViewModel.Factory> createFactoryProvider(C0917LinkStepUpVerificationViewModel_Factory c0917LinkStepUpVerificationViewModel_Factory) {
        return InstanceFactory.create(new LinkStepUpVerificationViewModel_Factory_Impl(c0917LinkStepUpVerificationViewModel_Factory));
    }
}
