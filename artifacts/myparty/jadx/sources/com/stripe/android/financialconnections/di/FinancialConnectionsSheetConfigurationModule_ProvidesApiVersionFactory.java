package com.stripe.android.financialconnections.di;

import com.stripe.android.core.ApiVersion;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory implements Factory<ApiVersion> {
    @Override // javax.inject.Provider
    public ApiVersion get() {
        return providesApiVersion();
    }

    public static FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ApiVersion providesApiVersion() {
        return (ApiVersion) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetConfigurationModule.INSTANCE.providesApiVersion());
    }

    private static final class InstanceHolder {
        static final FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory INSTANCE = new FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory();

        private InstanceHolder() {
        }
    }
}
