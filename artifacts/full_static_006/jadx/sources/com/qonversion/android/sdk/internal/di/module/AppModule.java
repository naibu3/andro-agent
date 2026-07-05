package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.PreferenceManager;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.di.scope.ApplicationScope;
import com.qonversion.android.sdk.internal.logger.ConsoleLogger;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import com.squareup.moshi.Moshi;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppModule.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0007J\b\u0010\n\u001a\u00020\u0003H\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0007J\b\u0010\u0018\u001a\u00020\u0012H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u0003H\u0007J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001dH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/qonversion/android/sdk/internal/di/module/AppModule;", "", "application", "Landroid/app/Application;", "internalConfig", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "appStateProvider", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V", "provideAppStateProvider", "provideApplication", "provideConfig", "provideFallbackService", "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "context", "moshi", "Lcom/squareup/moshi/Moshi;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "provideLaunchResultCacheWrapper", "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;", "sharedPreferencesCache", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "fallbacksService", "provideLogger", "providePurchasesCache", "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;", "sharedPreferences", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "provideSharedPreferencesCache", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
/* loaded from: classes2.dex */
public final class AppModule {
    private final AppStateProvider appStateProvider;
    private final Application application;
    private final InternalConfig internalConfig;

    public AppModule(Application application, InternalConfig internalConfig, AppStateProvider appStateProvider) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        Intrinsics.checkNotNullParameter(appStateProvider, "appStateProvider");
        this.application = application;
        this.internalConfig = internalConfig;
        this.appStateProvider = appStateProvider;
    }

    @Provides
    @ApplicationScope
    /* renamed from: provideApplication, reason: from getter */
    public final Application getApplication() {
        return this.application;
    }

    @Provides
    @ApplicationScope
    /* renamed from: provideConfig, reason: from getter */
    public final InternalConfig getInternalConfig() {
        return this.internalConfig;
    }

    @Provides
    @ApplicationScope
    /* renamed from: provideAppStateProvider, reason: from getter */
    public final AppStateProvider getAppStateProvider() {
        return this.appStateProvider;
    }

    @Provides
    @ApplicationScope
    public final SharedPreferences provideSharedPreferences(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        return defaultSharedPreferences;
    }

    @Provides
    @ApplicationScope
    public final SharedPreferencesCache provideSharedPreferencesCache(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new SharedPreferencesCache(sharedPreferences);
    }

    @Provides
    @ApplicationScope
    public final Logger provideLogger() {
        return new ConsoleLogger();
    }

    @Provides
    @ApplicationScope
    public final PurchasesCache providePurchasesCache(SharedPreferencesCache sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new PurchasesCache(sharedPreferences);
    }

    @Provides
    @ApplicationScope
    public final LaunchResultCacheWrapper provideLaunchResultCacheWrapper(Moshi moshi, SharedPreferencesCache sharedPreferencesCache, QFallbacksService fallbacksService) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(sharedPreferencesCache, "sharedPreferencesCache");
        Intrinsics.checkNotNullParameter(fallbacksService, "fallbacksService");
        return new LaunchResultCacheWrapper(moshi, sharedPreferencesCache, this.internalConfig, fallbacksService);
    }

    @Provides
    @ApplicationScope
    public final QFallbacksService provideFallbackService(Application context, Moshi moshi, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new QFallbacksService(context, this.internalConfig, moshi, logger);
    }
}
