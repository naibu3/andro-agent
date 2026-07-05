package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.automations.internal.ActivityProvider;
import com.qonversion.android.sdk.automations.internal.AutomationsEventMapper;
import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import com.qonversion.android.sdk.internal.QIdentityManager;
import com.qonversion.android.sdk.internal.QUserPropertiesManager;
import com.qonversion.android.sdk.internal.di.scope.ApplicationScope;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.UserPropertiesStorage;
import dagger.Module;
import dagger.Provides;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManagersModule.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J8\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u001d"}, d2 = {"Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;", "", "()V", "provideAutomationsEventMapper", "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "provideAutomationsManager", "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "repository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "eventMapper", "appContext", "Landroid/app/Application;", "activityProvider", "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;", "provideIdentityManager", "Lcom/qonversion/android/sdk/internal/QIdentityManager;", "userInfoService", "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "provideIncrementalDelayCalculator", "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;", "provideUserPropertiesManager", "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;", "propertiesStorage", "Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;", "incrementalDelayCalculator", "appStateProvider", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
/* loaded from: classes2.dex */
public final class ManagersModule {
    @Provides
    @ApplicationScope
    public final QAutomationsManager provideAutomationsManager(QRepository repository, AutomationsEventMapper eventMapper, Application appContext, ActivityProvider activityProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eventMapper, "eventMapper");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        return new QAutomationsManager(repository, eventMapper, appContext, activityProvider);
    }

    @Provides
    @ApplicationScope
    public final AutomationsEventMapper provideAutomationsEventMapper(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new AutomationsEventMapper(logger);
    }

    @Provides
    @ApplicationScope
    public final QIdentityManager provideIdentityManager(QRepository repository, QUserInfoService userInfoService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userInfoService, "userInfoService");
        return new QIdentityManager(repository, userInfoService);
    }

    @Provides
    @ApplicationScope
    public final QUserPropertiesManager provideUserPropertiesManager(Application appContext, QRepository repository, UserPropertiesStorage propertiesStorage, IncrementalDelayCalculator incrementalDelayCalculator, AppStateProvider appStateProvider, Logger logger) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(propertiesStorage, "propertiesStorage");
        Intrinsics.checkNotNullParameter(incrementalDelayCalculator, "incrementalDelayCalculator");
        Intrinsics.checkNotNullParameter(appStateProvider, "appStateProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new QUserPropertiesManager(appContext, repository, propertiesStorage, incrementalDelayCalculator, appStateProvider, logger);
    }

    @Provides
    @ApplicationScope
    public final IncrementalDelayCalculator provideIncrementalDelayCalculator() {
        return new IncrementalDelayCalculator(new Random());
    }
}
