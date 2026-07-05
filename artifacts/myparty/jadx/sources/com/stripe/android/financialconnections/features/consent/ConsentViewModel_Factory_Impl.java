package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ConsentViewModel_Factory_Impl implements ConsentViewModel.Factory {
    private final C0890ConsentViewModel_Factory delegateFactory;

    ConsentViewModel_Factory_Impl(C0890ConsentViewModel_Factory c0890ConsentViewModel_Factory) {
        this.delegateFactory = c0890ConsentViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.consent.ConsentViewModel.Factory
    public ConsentViewModel create(ConsentState consentState) {
        return this.delegateFactory.get(consentState);
    }

    public static Provider<ConsentViewModel.Factory> create(C0890ConsentViewModel_Factory c0890ConsentViewModel_Factory) {
        return InstanceFactory.create(new ConsentViewModel_Factory_Impl(c0890ConsentViewModel_Factory));
    }

    public static dagger.internal.Provider<ConsentViewModel.Factory> createFactoryProvider(C0890ConsentViewModel_Factory c0890ConsentViewModel_Factory) {
        return InstanceFactory.create(new ConsentViewModel_Factory_Impl(c0890ConsentViewModel_Factory));
    }
}
