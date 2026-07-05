package com.stripe.android.link.injection;

import com.stripe.android.link.ui.inline.C1043InlineSignupViewModel_Factory;
import com.stripe.android.link.ui.inline.InlineSignupViewModel;
import com.stripe.android.link.ui.inline.LinkSignupMode;
import com.stripe.android.link.ui.inline.UserInput;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class LinkInlineSignupAssistedViewModelFactory_Impl implements LinkInlineSignupAssistedViewModelFactory {
    private final C1043InlineSignupViewModel_Factory delegateFactory;

    LinkInlineSignupAssistedViewModelFactory_Impl(C1043InlineSignupViewModel_Factory c1043InlineSignupViewModel_Factory) {
        this.delegateFactory = c1043InlineSignupViewModel_Factory;
    }

    @Override // com.stripe.android.link.injection.LinkInlineSignupAssistedViewModelFactory
    public InlineSignupViewModel create(LinkSignupMode linkSignupMode, UserInput userInput) {
        return this.delegateFactory.get(userInput, linkSignupMode);
    }

    public static Provider<LinkInlineSignupAssistedViewModelFactory> create(C1043InlineSignupViewModel_Factory c1043InlineSignupViewModel_Factory) {
        return InstanceFactory.create(new LinkInlineSignupAssistedViewModelFactory_Impl(c1043InlineSignupViewModel_Factory));
    }

    public static dagger.internal.Provider<LinkInlineSignupAssistedViewModelFactory> createFactoryProvider(C1043InlineSignupViewModel_Factory c1043InlineSignupViewModel_Factory) {
        return InstanceFactory.create(new LinkInlineSignupAssistedViewModelFactory_Impl(c1043InlineSignupViewModel_Factory));
    }
}
