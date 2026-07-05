package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class ManagersModule_ProvideIncrementalDelayCalculatorFactory implements Factory<IncrementalDelayCalculator> {
    private final ManagersModule module;

    public ManagersModule_ProvideIncrementalDelayCalculatorFactory(ManagersModule managersModule) {
        this.module = managersModule;
    }

    @Override // javax.inject.Provider
    public IncrementalDelayCalculator get() {
        return provideIncrementalDelayCalculator(this.module);
    }

    public static ManagersModule_ProvideIncrementalDelayCalculatorFactory create(ManagersModule managersModule) {
        return new ManagersModule_ProvideIncrementalDelayCalculatorFactory(managersModule);
    }

    public static IncrementalDelayCalculator provideIncrementalDelayCalculator(ManagersModule managersModule) {
        return (IncrementalDelayCalculator) Preconditions.checkNotNull(managersModule.provideIncrementalDelayCalculator(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
