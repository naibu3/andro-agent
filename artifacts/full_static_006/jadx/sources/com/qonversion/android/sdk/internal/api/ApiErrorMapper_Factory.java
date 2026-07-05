package com.qonversion.android.sdk.internal.api;

import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ApiErrorMapper_Factory implements Factory<ApiErrorMapper> {
    private final Provider<ApiHelper> helperProvider;

    public ApiErrorMapper_Factory(Provider<ApiHelper> provider) {
        this.helperProvider = provider;
    }

    @Override // javax.inject.Provider
    public ApiErrorMapper get() {
        return new ApiErrorMapper(this.helperProvider.get());
    }

    public static ApiErrorMapper_Factory create(Provider<ApiHelper> provider) {
        return new ApiErrorMapper_Factory(provider);
    }

    public static ApiErrorMapper newInstance(ApiHelper apiHelper) {
        return new ApiErrorMapper(apiHelper);
    }
}
