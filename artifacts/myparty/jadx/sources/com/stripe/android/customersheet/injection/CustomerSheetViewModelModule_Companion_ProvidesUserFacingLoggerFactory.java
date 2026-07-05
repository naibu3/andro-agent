package com.stripe.android.customersheet.injection;

import com.stripe.android.core.utils.UserFacingLogger;
import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory implements Factory<UserFacingLogger> {
    @Override // javax.inject.Provider
    public UserFacingLogger get() {
        return providesUserFacingLogger();
    }

    public static CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static UserFacingLogger providesUserFacingLogger() {
        return CustomerSheetViewModelModule.INSTANCE.providesUserFacingLogger();
    }

    private static final class InstanceHolder {
        static final CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory INSTANCE = new CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory();

        private InstanceHolder() {
        }
    }
}
