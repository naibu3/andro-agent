package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.Api;
import com.qonversion.android.sdk.internal.api.ApiErrorMapper;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.api.ApiHelper;
import com.qonversion.android.sdk.internal.api.RateLimiter;
import com.qonversion.android.sdk.internal.di.scope.ApplicationScope;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.repository.DefaultRepository;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import com.qonversion.android.sdk.internal.storage.TokenStorage;
import com.qonversion.android.sdk.internal.storage.UserPropertiesStorage;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* compiled from: RepositoryModule.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J8\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J@\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007¨\u0006%"}, d2 = {"Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;", "", "()V", "provideApiErrorMapper", "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;", "apiHelper", "Lcom/qonversion/android/sdk/internal/api/ApiHelper;", "provideEnvironment", "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;", "context", "Landroid/app/Application;", "provideHeadersProvider", "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;", "config", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "sharedPreferencesCache", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "environmentProvider", "providePropertiesStorage", "Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;", "provideQonversionRepository", "Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;", "retrofit", "Lretrofit2/Retrofit;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "apiErrorMapper", "delayCalculator", "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;", "provideRepository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "rateLimiter", "Lcom/qonversion/android/sdk/internal/api/RateLimiter;", "provideTokenStorage", "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;", "preferences", "Landroid/content/SharedPreferences;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
/* loaded from: classes2.dex */
public final class RepositoryModule {
    @Provides
    @ApplicationScope
    public final QRepository provideRepository(Retrofit retrofit, EnvironmentProvider environmentProvider, InternalConfig config, Logger logger, ApiErrorMapper apiErrorMapper, IncrementalDelayCalculator delayCalculator, RateLimiter rateLimiter) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(environmentProvider, "environmentProvider");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(apiErrorMapper, "apiErrorMapper");
        Intrinsics.checkNotNullParameter(delayCalculator, "delayCalculator");
        Intrinsics.checkNotNullParameter(rateLimiter, "rateLimiter");
        return new RepositoryWithRateLimits(provideQonversionRepository(retrofit, environmentProvider, config, logger, apiErrorMapper, delayCalculator), rateLimiter);
    }

    @Provides
    @ApplicationScope
    public final DefaultRepository provideQonversionRepository(Retrofit retrofit, EnvironmentProvider environmentProvider, InternalConfig config, Logger logger, ApiErrorMapper apiErrorMapper, IncrementalDelayCalculator delayCalculator) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(environmentProvider, "environmentProvider");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(apiErrorMapper, "apiErrorMapper");
        Intrinsics.checkNotNullParameter(delayCalculator, "delayCalculator");
        Object objCreate = retrofit.create(Api.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return new DefaultRepository((Api) objCreate, environmentProvider, config, logger, apiErrorMapper, delayCalculator);
    }

    @Provides
    @ApplicationScope
    public final TokenStorage provideTokenStorage(SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new TokenStorage(preferences);
    }

    @Provides
    @ApplicationScope
    public final UserPropertiesStorage providePropertiesStorage() {
        return new UserPropertiesStorage();
    }

    @Provides
    @ApplicationScope
    public final EnvironmentProvider provideEnvironment(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new EnvironmentProvider(context);
    }

    @Provides
    @ApplicationScope
    public final ApiHeadersProvider provideHeadersProvider(InternalConfig config, SharedPreferencesCache sharedPreferencesCache, EnvironmentProvider environmentProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(sharedPreferencesCache, "sharedPreferencesCache");
        Intrinsics.checkNotNullParameter(environmentProvider, "environmentProvider");
        return new ApiHeadersProvider(config, sharedPreferencesCache, environmentProvider);
    }

    @Provides
    @ApplicationScope
    public final ApiErrorMapper provideApiErrorMapper(ApiHelper apiHelper) {
        Intrinsics.checkNotNullParameter(apiHelper, "apiHelper");
        return new ApiErrorMapper(apiHelper);
    }
}
