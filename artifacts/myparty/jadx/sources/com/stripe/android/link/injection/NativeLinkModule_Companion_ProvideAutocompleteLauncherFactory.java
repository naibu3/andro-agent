package com.stripe.android.link.injection;

import com.stripe.android.paymentsheet.addresselement.DefaultAutocompleteLauncher;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory implements Factory<DefaultAutocompleteLauncher> {
    @Override // javax.inject.Provider
    public DefaultAutocompleteLauncher get() {
        return provideAutocompleteLauncher();
    }

    public static NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DefaultAutocompleteLauncher provideAutocompleteLauncher() {
        return (DefaultAutocompleteLauncher) Preconditions.checkNotNullFromProvides(NativeLinkModule.INSTANCE.provideAutocompleteLauncher());
    }

    private static final class InstanceHolder {
        static final NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory INSTANCE = new NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory();

        private InstanceHolder() {
        }
    }
}
