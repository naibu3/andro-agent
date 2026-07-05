package com.qonversion.android.sdk.internal;

import android.app.Application;
import android.os.Handler;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.qonversion.android.sdk.internal.billing.BillingClientHolder;
import com.qonversion.android.sdk.internal.billing.BillingClientWrapper;
import com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper;
import com.qonversion.android.sdk.internal.billing.QonversionBillingService;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QonversionFactory.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\fH\u0002JN\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/qonversion/android/sdk/internal/QonversionFactory;", "", "context", "Landroid/app/Application;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "createBillingClient", "Lcom/android/billingclient/api/BillingClient;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "createBillingClientHolder", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "createBillingClientWrapper", "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;", "billingClientHolder", "createBillingService", "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;", "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;", "isAnalyticsMode", "", "createLegacyBillingClientWrapper", "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;", "createProductCenterManager", "Lcom/qonversion/android/sdk/internal/QProductCenterManager;", "repository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "purchasesCache", "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;", "handledPurchasesCache", "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;", "launchResultCacheWrapper", "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;", "userInfoService", "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "identityManager", "Lcom/qonversion/android/sdk/internal/QIdentityManager;", "config", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "appStateProvider", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "remoteConfigManager", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QonversionFactory {
    private final Application context;
    private final Logger logger;

    public QonversionFactory(Application context, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.logger = logger;
    }

    public final QProductCenterManager createProductCenterManager(QRepository repository, PurchasesCache purchasesCache, QHandledPurchasesCache handledPurchasesCache, LaunchResultCacheWrapper launchResultCacheWrapper, QUserInfoService userInfoService, QIdentityManager identityManager, InternalConfig config, AppStateProvider appStateProvider, QRemoteConfigManager remoteConfigManager) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(purchasesCache, "purchasesCache");
        Intrinsics.checkNotNullParameter(handledPurchasesCache, "handledPurchasesCache");
        Intrinsics.checkNotNullParameter(launchResultCacheWrapper, "launchResultCacheWrapper");
        Intrinsics.checkNotNullParameter(userInfoService, "userInfoService");
        Intrinsics.checkNotNullParameter(identityManager, "identityManager");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(appStateProvider, "appStateProvider");
        Intrinsics.checkNotNullParameter(remoteConfigManager, "remoteConfigManager");
        QProductCenterManager qProductCenterManager = new QProductCenterManager(this.context, repository, this.logger, purchasesCache, handledPurchasesCache, launchResultCacheWrapper, userInfoService, identityManager, config, appStateProvider, remoteConfigManager);
        qProductCenterManager.setBillingService(createBillingService(qProductCenterManager, config.isAnalyticsMode()));
        return qProductCenterManager;
    }

    private final QonversionBillingService createBillingService(QonversionBillingService.PurchasesListener listener, boolean isAnalyticsMode) {
        BillingClientHolder billingClientHolderCreateBillingClientHolder = createBillingClientHolder();
        return new QonversionBillingService(new Handler(this.context.getMainLooper()), listener, this.logger, isAnalyticsMode, billingClientHolderCreateBillingClientHolder, createBillingClientWrapper(billingClientHolderCreateBillingClientHolder), createLegacyBillingClientWrapper(billingClientHolderCreateBillingClientHolder));
    }

    private final BillingClientHolder createBillingClientHolder() {
        BillingClientHolder billingClientHolder = new BillingClientHolder(new Handler(this.context.getMainLooper()), this.logger);
        billingClientHolder.setBillingClient(createBillingClient(billingClientHolder));
        return billingClientHolder;
    }

    private final LegacyBillingClientWrapper createLegacyBillingClientWrapper(BillingClientHolder billingClientHolder) {
        return new LegacyBillingClientWrapper(billingClientHolder, this.logger);
    }

    private final BillingClientWrapper createBillingClientWrapper(BillingClientHolder billingClientHolder) {
        return new BillingClientWrapper(billingClientHolder, this.logger);
    }

    private final BillingClient createBillingClient(PurchasesUpdatedListener listener) {
        BillingClient.Builder builderNewBuilder = BillingClient.newBuilder(this.context);
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().enablePrepaidPlans().build());
        builderNewBuilder.setListener(listener);
        BillingClient billingClientBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(billingClientBuild, "build(...)");
        return billingClientBuild;
    }
}
