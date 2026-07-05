package com.stripe.android.paymentelement.embedded.form;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory implements Factory<OnClickOverrideDelegate> {
    @Override // javax.inject.Provider
    public OnClickOverrideDelegate get() {
        return provideOnClickOverrideDelegate();
    }

    public static FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OnClickOverrideDelegate provideOnClickOverrideDelegate() {
        return (OnClickOverrideDelegate) Preconditions.checkNotNullFromProvides(FormActivityViewModelModule.INSTANCE.provideOnClickOverrideDelegate());
    }

    private static final class InstanceHolder {
        static final FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory INSTANCE = new FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory();

        private InstanceHolder() {
        }
    }
}
