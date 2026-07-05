package com.qonversion.android.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.Qonversion;
import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.dto.QAttributionProvider;
import com.qonversion.android.sdk.dto.QPurchaseModel;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QPurchaseUpdateModel;
import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.QRemoteConfigList;
import com.qonversion.android.sdk.dto.QUser;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.eligibility.QEligibility;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.properties.QUserPropertyKey;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
import com.qonversion.android.sdk.internal.di.QDependencyInjector;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseModelInternal;
import com.qonversion.android.sdk.internal.logger.ConsoleLogger;
import com.qonversion.android.sdk.internal.logger.ExceptionManager;
import com.qonversion.android.sdk.internal.logger.QExceptionManager;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.Cache;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import com.qonversion.android.sdk.listeners.QEntitlementsUpdateListener;
import com.qonversion.android.sdk.listeners.QonversionEligibilityCallback;
import com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionOfferingsCallback;
import com.qonversion.android.sdk.listeners.QonversionProductsCallback;
import com.qonversion.android.sdk.listeners.QonversionPurchaseCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionUserCallback;
import com.qonversion.android.sdk.listeners.QonversionUserPropertiesCallback;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QonversionInternal.kt */
@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020&2\u0006\u0010(\u001a\u00020,H\u0016J$\u0010-\u001a\u00020$2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u0002000/2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020$2\u0006\u0010(\u001a\u000204H\u0016J\u001e\u00105\u001a\u00020$2\f\u00106\u001a\b\u0012\u0004\u0012\u00020&072\u0006\u0010(\u001a\u000208H\u0016J\u0018\u00109\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010:\u001a\u00020$2\u0006\u0010+\u001a\u00020&2\u0006\u0010(\u001a\u00020,H\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020&H\u0016J\u0018\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020&2\u0006\u0010(\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020?H\u0016J\u001a\u0010@\u001a\u00020$2\b\u0010A\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020$H\u0016J\u0010\u0010D\u001a\u0002042\u0006\u0010(\u001a\u000204H\u0002J\u0010\u0010E\u001a\u00020F2\u0006\u0010(\u001a\u000204H\u0002J\u0010\u0010G\u001a\u00020=2\u0006\u0010(\u001a\u00020=H\u0002J\u0010\u0010H\u001a\u00020$2\u0006\u0010(\u001a\u00020IH\u0016J\b\u0010J\u001a\u00020$H\u0016J\b\u0010K\u001a\u00020$H\u0016J\u0016\u0010L\u001a\u00020$2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020$0NH\u0002J\u0010\u0010O\u001a\u00020$2\u0006\u0010(\u001a\u00020PH\u0016J \u0010Q\u001a\u00020$2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010(\u001a\u000204H\u0017J(\u0010Q\u001a\u00020$2\u0006\u0010R\u001a\u00020S2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010(\u001a\u000204H\u0016J \u0010Q\u001a\u00020$2\u0006\u0010R\u001a\u00020S2\u0006\u0010V\u001a\u00020W2\u0006\u0010(\u001a\u000204H\u0016J\u0010\u0010Z\u001a\u00020$2\u0006\u0010(\u001a\u00020BH\u0016J\u0018\u0010Z\u001a\u00020$2\u0006\u0010A\u001a\u00020&2\u0006\u0010(\u001a\u00020BH\u0016J\u0010\u0010[\u001a\u00020$2\u0006\u0010(\u001a\u00020\\H\u0016J&\u0010[\u001a\u00020$2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020&072\u0006\u0010^\u001a\u00020?2\u0006\u0010(\u001a\u00020\\H\u0016J\u0010\u0010_\u001a\u00020$2\u0006\u0010(\u001a\u000204H\u0016J\u0018\u0010`\u001a\u00020$2\u0006\u0010a\u001a\u00020&2\u0006\u0010b\u001a\u00020&H\u0016J\u0010\u0010c\u001a\u00020$2\u0006\u0010d\u001a\u00020eH\u0016J\u0018\u0010f\u001a\u00020$2\u0006\u0010a\u001a\u00020g2\u0006\u0010b\u001a\u00020&H\u0016J\b\u0010h\u001a\u00020$H\u0016J\b\u0010i\u001a\u00020$H\u0016J \u0010j\u001a\u00020$2\u0006\u0010R\u001a\u00020S2\u0006\u0010k\u001a\u00020l2\u0006\u0010(\u001a\u000204H\u0017J(\u0010j\u001a\u00020$2\u0006\u0010R\u001a\u00020S2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010(\u001a\u000204H\u0016J\u0010\u0010m\u001a\u00020$2\u0006\u0010(\u001a\u00020=H\u0016J\u0010\u0010n\u001a\u00020$2\u0006\u0010(\u001a\u00020oH\u0016R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006p"}, d2 = {"Lcom/qonversion/android/sdk/internal/QonversionInternal;", "Lcom/qonversion/android/sdk/Qonversion;", "Lcom/qonversion/android/sdk/internal/LifecycleDelegate;", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "internalConfig", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "application", "Landroid/app/Application;", "(Lcom/qonversion/android/sdk/internal/InternalConfig;Landroid/app/Application;)V", "appState", "Lcom/qonversion/android/sdk/internal/AppState;", "getAppState", "()Lcom/qonversion/android/sdk/internal/AppState;", "setAppState", "(Lcom/qonversion/android/sdk/internal/AppState;)V", "attributionManager", "Lcom/qonversion/android/sdk/internal/QAttributionManager;", "automationsManager", "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "exceptionManager", "Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;", "fallbackService", "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "handler", "Landroid/os/Handler;", "logger", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "productCenterManager", "Lcom/qonversion/android/sdk/internal/QProductCenterManager;", "remoteConfigManager", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;", "sharedPreferencesCache", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "userPropertiesManager", "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;", "attachUserToExperiment", "", "experimentId", "", "groupId", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToRemoteConfiguration", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "attribution", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "provider", "Lcom/qonversion/android/sdk/dto/QAttributionProvider;", "checkEntitlements", "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;", "checkTrialIntroEligibility", "productIds", "", "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;", "detachUserFromExperiment", "detachUserFromRemoteConfiguration", "identify", "userID", "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;", "isFallbackFileAccessible", "", "loadRemoteConfig", "contextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "logout", "mainEntitlementsCallback", "mainPurchaseCallback", "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;", "mainUserCallback", "offerings", "Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;", "onAppBackground", "onAppForeground", "postToMainThread", "runnable", "Lkotlin/Function0;", "products", "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;", "purchase", "context", "Landroid/app/Activity;", "purchaseModel", "Lcom/qonversion/android/sdk/dto/QPurchaseModel;", "product", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "options", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "remoteConfig", "remoteConfigList", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "contextKeys", "includeEmptyContextKey", "restore", "setCustomUserProperty", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setEntitlementsUpdateListener", "entitlementsUpdateListener", "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "setUserProperty", "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;", "syncHistoricalData", "syncPurchases", "updatePurchase", "purchaseUpdateModel", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;", "userInfo", "userProperties", "Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QonversionInternal implements Qonversion, LifecycleDelegate, AppStateProvider {
    private AppState appState;
    private QAttributionManager attributionManager;
    private QAutomationsManager automationsManager;
    private ExceptionManager exceptionManager;
    private QFallbacksService fallbackService;
    private final Handler handler;
    private ConsoleLogger logger;
    private QProductCenterManager productCenterManager;
    private QRemoteConfigManager remoteConfigManager;
    private SharedPreferencesCache sharedPreferencesCache;
    private QUserPropertiesManager userPropertiesManager;

    public QonversionInternal(InternalConfig internalConfig, Application application) {
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        Intrinsics.checkNotNullParameter(application, "application");
        this.logger = new ConsoleLogger();
        this.handler = new Handler(Looper.getMainLooper());
        this.appState = AppState.Background;
        QonversionInternal qonversionInternal = this;
        QDependencyInjector.INSTANCE.buildAppComponent$sdk_release(application, internalConfig, qonversionInternal);
        QExceptionManager qExceptionManagerExceptionManager = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().exceptionManager();
        qExceptionManagerExceptionManager.initialize(application);
        this.exceptionManager = qExceptionManagerExceptionManager;
        QRepository qRepositoryRepository = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().repository();
        PurchasesCache purchasesCache = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().purchasesCache();
        QHandledPurchasesCache qHandledPurchasesCacheHandledPurchasesCache = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().handledPurchasesCache();
        LaunchResultCacheWrapper launchResultCacheWrapper = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().launchResultCacheWrapper();
        QUserInfoService qUserInfoServiceUserInfoService = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().userInfoService();
        QIdentityManager qIdentityManagerIdentityManager = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().identityManager();
        this.sharedPreferencesCache = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().sharedPreferencesCache();
        internalConfig.setUid(qUserInfoServiceUserInfoService.obtainUserID());
        this.fallbackService = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().fallbacksService();
        this.automationsManager = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().automationsManager();
        this.userPropertiesManager = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().userPropertiesManager();
        QRemoteConfigManager qRemoteConfigManagerRemoteConfigManager = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().remoteConfigManager();
        this.attributionManager = new QAttributionManager(qRepositoryRepository, qonversionInternal);
        QProductCenterManager qProductCenterManagerCreateProductCenterManager = new QonversionFactory(application, this.logger).createProductCenterManager(qRepositoryRepository, purchasesCache, qHandledPurchasesCacheHandledPurchasesCache, launchResultCacheWrapper, qUserInfoServiceUserInfoService, qIdentityManagerIdentityManager, internalConfig, qonversionInternal, qRemoteConfigManagerRemoteConfigManager);
        qRemoteConfigManagerRemoteConfigManager.setUserStateProvider(qProductCenterManagerCreateProductCenterManager);
        this.productCenterManager = qProductCenterManagerCreateProductCenterManager;
        this.remoteConfigManager = qRemoteConfigManagerRemoteConfigManager;
        this.userPropertiesManager.setProductCenterManager$sdk_release(qProductCenterManagerCreateProductCenterManager);
        if (internalConfig.getPrimaryConfig().getSendFbAttribution()) {
            this.userPropertiesManager.sendFacebookAttribution();
        }
        this.remoteConfigManager.setUserPropertiesManager(this.userPropertiesManager);
        final AppLifecycleHandler appLifecycleHandler = new AppLifecycleHandler(this);
        postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ProcessLifecycleOwner.get().getLifecycle().addObserver(appLifecycleHandler);
            }
        });
        QProductCenterManager.launch$default(this.productCenterManager, RequestTrigger.Init, null, 2, null);
    }

    @Override // com.qonversion.android.sdk.internal.provider.AppStateProvider
    public AppState getAppState() {
        return this.appState;
    }

    public void setAppState(AppState appState) {
        Intrinsics.checkNotNullParameter(appState, "<set-?>");
        this.appState = appState;
    }

    @Override // com.qonversion.android.sdk.internal.LifecycleDelegate
    public void onAppBackground() {
        setAppState(AppState.Background);
        this.userPropertiesManager.onAppBackground();
    }

    @Override // com.qonversion.android.sdk.internal.LifecycleDelegate
    public void onAppForeground() {
        setAppState(AppState.Foreground);
        this.userPropertiesManager.onAppForeground();
        this.productCenterManager.onAppForeground();
        this.attributionManager.onAppForeground();
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void syncHistoricalData() {
        if (Cache.DefaultImpls.getBool$default(this.sharedPreferencesCache, Constants.IS_HISTORICAL_DATA_SYNCED, false, 2, null)) {
            return;
        }
        this.productCenterManager.restore(RequestTrigger.SyncHistoricalData, new QonversionEntitlementsCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.syncHistoricalData.1
            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onSuccess(Map<String, QEntitlement> entitlements) {
                Intrinsics.checkNotNullParameter(entitlements, "entitlements");
                QonversionInternal.this.sharedPreferencesCache.putBool(Constants.IS_HISTORICAL_DATA_SYNCED, true);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QonversionInternal.this.logger.error("Historical data sync failed.");
            }
        });
    }

    @Override // com.qonversion.android.sdk.Qonversion
    @Deprecated(message = "Use the new purchase() method", replaceWith = @ReplaceWith(expression = "purchase(context, TODO(\"pass product here\"), callback)", imports = {}))
    public void purchase(Activity context, QPurchaseModel purchaseModel, QonversionEntitlementsCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchaseModel, "purchaseModel");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productCenterManager.purchaseProduct(context, new PurchaseModelInternal(purchaseModel), mainPurchaseCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void purchase(Activity context, QProduct product, QPurchaseOptions options, QonversionEntitlementsCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productCenterManager.purchaseProduct(context, new PurchaseModelInternal(product, options), mainPurchaseCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void purchase(Activity context, QProduct product, QonversionEntitlementsCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productCenterManager.purchaseProduct(context, new PurchaseModelInternal(product, (QPurchaseOptions) null, 2, (DefaultConstructorMarker) null), mainPurchaseCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void updatePurchase(Activity context, QProduct product, QPurchaseOptions options, QonversionEntitlementsCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productCenterManager.purchaseProduct(context, new PurchaseModelInternal(product, options), mainPurchaseCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    @Deprecated(message = "Use the new updatePurchase() method", replaceWith = @ReplaceWith(expression = "updatePurchase(context, TODO(\"pass product here\"), TODO(\"pass purchase options here\"), callback)", imports = {}))
    public void updatePurchase(Activity context, QPurchaseUpdateModel purchaseUpdateModel, QonversionEntitlementsCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchaseUpdateModel, "purchaseUpdateModel");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productCenterManager.purchaseProduct(context, new PurchaseModelInternal(purchaseUpdateModel), mainPurchaseCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void products(final QonversionProductsCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productCenterManager.loadProducts(new QonversionProductsCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.products.1
            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onSuccess(final Map<String, QProduct> products) {
                Intrinsics.checkNotNullParameter(products, "products");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionProductsCallback qonversionProductsCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$products$1$onSuccess$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionProductsCallback.onSuccess(products);
                    }
                });
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onError(final QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionProductsCallback qonversionProductsCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$products$1$onError$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionProductsCallback.onError(error);
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void offerings(final QonversionOfferingsCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productCenterManager.offerings(new QonversionOfferingsCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.offerings.1
            @Override // com.qonversion.android.sdk.listeners.QonversionOfferingsCallback
            public void onSuccess(final QOfferings offerings) {
                Intrinsics.checkNotNullParameter(offerings, "offerings");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionOfferingsCallback qonversionOfferingsCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$offerings$1$onSuccess$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionOfferingsCallback.onSuccess(offerings);
                    }
                });
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionOfferingsCallback
            public void onError(final QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionOfferingsCallback qonversionOfferingsCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$offerings$1$onError$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionOfferingsCallback.onError(error);
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void remoteConfig(QonversionRemoteConfigCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        loadRemoteConfig(null, callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void remoteConfig(String contextKey, QonversionRemoteConfigCallback callback) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loadRemoteConfig(contextKey, callback);
    }

    private final void loadRemoteConfig(String contextKey, final QonversionRemoteConfigCallback callback) {
        this.remoteConfigManager.loadRemoteConfig(contextKey, new QonversionRemoteConfigCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.loadRemoteConfig.1
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback
            public void onSuccess(final QRemoteConfig remoteConfig) {
                Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionRemoteConfigCallback qonversionRemoteConfigCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$loadRemoteConfig$1$onSuccess$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionRemoteConfigCallback.onSuccess(remoteConfig);
                    }
                });
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback
            public void onError(final QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionRemoteConfigCallback qonversionRemoteConfigCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$loadRemoteConfig$1$onError$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionRemoteConfigCallback.onError(error);
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void remoteConfigList(List<String> contextKeys, boolean includeEmptyContextKey, final QonversionRemoteConfigListCallback callback) {
        Intrinsics.checkNotNullParameter(contextKeys, "contextKeys");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.remoteConfigManager.loadRemoteConfigList(contextKeys, includeEmptyContextKey, new QonversionRemoteConfigListCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.remoteConfigList.1
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onSuccess(final QRemoteConfigList remoteConfigList) {
                Intrinsics.checkNotNullParameter(remoteConfigList, "remoteConfigList");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$remoteConfigList$1$onSuccess$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionRemoteConfigListCallback.onSuccess(remoteConfigList);
                    }
                });
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onError(final QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$remoteConfigList$1$onError$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionRemoteConfigListCallback.onError(error);
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void remoteConfigList(final QonversionRemoteConfigListCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.remoteConfigManager.loadRemoteConfigList(new QonversionRemoteConfigListCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.remoteConfigList.2
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onSuccess(final QRemoteConfigList remoteConfigList) {
                Intrinsics.checkNotNullParameter(remoteConfigList, "remoteConfigList");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$remoteConfigList$2$onSuccess$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionRemoteConfigListCallback.onSuccess(remoteConfigList);
                    }
                });
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onError(final QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$remoteConfigList$2$onError$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionRemoteConfigListCallback.onError(error);
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void attachUserToExperiment(String experimentId, String groupId, QonversionExperimentAttachCallback callback) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.remoteConfigManager.attachUserToExperiment(experimentId, groupId, callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void detachUserFromExperiment(String experimentId, QonversionExperimentAttachCallback callback) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.remoteConfigManager.detachUserFromExperiment(experimentId, callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void attachUserToRemoteConfiguration(String remoteConfigurationId, QonversionRemoteConfigurationAttachCallback callback) {
        Intrinsics.checkNotNullParameter(remoteConfigurationId, "remoteConfigurationId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.remoteConfigManager.attachUserToRemoteConfiguration(remoteConfigurationId, callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void detachUserFromRemoteConfiguration(String remoteConfigurationId, QonversionRemoteConfigurationAttachCallback callback) {
        Intrinsics.checkNotNullParameter(remoteConfigurationId, "remoteConfigurationId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.remoteConfigManager.detachUserFromRemoteConfiguration(remoteConfigurationId, callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void checkTrialIntroEligibility(List<String> productIds, final QonversionEligibilityCallback callback) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productCenterManager.checkTrialIntroEligibilityForProductIds(productIds, new QonversionEligibilityCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.checkTrialIntroEligibility.1
            @Override // com.qonversion.android.sdk.listeners.QonversionEligibilityCallback
            public void onSuccess(Map<String, QEligibility> eligibilities) {
                Intrinsics.checkNotNullParameter(eligibilities, "eligibilities");
                callback.onSuccess(eligibilities);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEligibilityCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                callback.onError(error);
            }
        });
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void checkEntitlements(QonversionEntitlementsCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productCenterManager.checkEntitlements(mainEntitlementsCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void restore(QonversionEntitlementsCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productCenterManager.restore(RequestTrigger.Restore, mainEntitlementsCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void syncPurchases() {
        this.productCenterManager.syncPurchases();
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void identify(String userID) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        QProductCenterManager.identify$default(this.productCenterManager, userID, null, 2, null);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void identify(String userID, QonversionUserCallback callback) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productCenterManager.identify(userID, callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void logout() {
        this.productCenterManager.logout();
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void userInfo(QonversionUserCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productCenterManager.getUserInfo(mainUserCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void attribution(Map<String, ? extends Object> data, QAttributionProvider provider) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.attributionManager.attribution(data, provider);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void setUserProperty(QUserPropertyKey key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.userPropertiesManager.setUserProperty(key, value);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void setCustomUserProperty(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.userPropertiesManager.setCustomUserProperty(key, value);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void userProperties(QonversionUserPropertiesCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.userPropertiesManager.userProperties(callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public boolean isFallbackFileAccessible() {
        return this.fallbackService.obtainFallbackData() != null;
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void setEntitlementsUpdateListener(QEntitlementsUpdateListener entitlementsUpdateListener) {
        Intrinsics.checkNotNullParameter(entitlementsUpdateListener, "entitlementsUpdateListener");
        this.productCenterManager.setEntitlementsUpdateListener(entitlementsUpdateListener);
    }

    private final QonversionEntitlementsCallback mainEntitlementsCallback(final QonversionEntitlementsCallback callback) {
        return new QonversionEntitlementsCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.mainEntitlementsCallback.1
            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onSuccess(final Map<String, QEntitlement> entitlements) {
                Intrinsics.checkNotNullParameter(entitlements, "entitlements");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionEntitlementsCallback qonversionEntitlementsCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$mainEntitlementsCallback$1$onSuccess$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionEntitlementsCallback.onSuccess(entitlements);
                    }
                });
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onError(final QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionEntitlementsCallback qonversionEntitlementsCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$mainEntitlementsCallback$1$onError$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionEntitlementsCallback.onError(error);
                    }
                });
            }
        };
    }

    private final QonversionPurchaseCallback mainPurchaseCallback(final QonversionEntitlementsCallback callback) {
        final QonversionPurchaseCallback qonversionPurchaseCallback;
        if (callback instanceof QonversionPurchaseCallback) {
            qonversionPurchaseCallback = (QonversionPurchaseCallback) callback;
        } else {
            qonversionPurchaseCallback = new QonversionPurchaseCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$mainPurchaseCallback$purchaseCallback$1
                @Override // com.qonversion.android.sdk.listeners.QonversionPurchaseCallback
                public void onSuccess(Map<String, QEntitlement> map, Purchase purchase) {
                    QonversionPurchaseCallback.DefaultImpls.onSuccess(this, map, purchase);
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
                public void onSuccess(Map<String, QEntitlement> entitlements) {
                    Intrinsics.checkNotNullParameter(entitlements, "entitlements");
                    callback.onSuccess(entitlements);
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
                public void onError(QonversionError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    callback.onError(error);
                }
            };
        }
        return new QonversionPurchaseCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.mainPurchaseCallback.1
            @Override // com.qonversion.android.sdk.listeners.QonversionPurchaseCallback
            public void onSuccess(final Map<String, QEntitlement> entitlements, final Purchase purchase) {
                Intrinsics.checkNotNullParameter(entitlements, "entitlements");
                Intrinsics.checkNotNullParameter(purchase, "purchase");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionPurchaseCallback qonversionPurchaseCallback2 = qonversionPurchaseCallback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$mainPurchaseCallback$1$onSuccess$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionPurchaseCallback2.onSuccess(entitlements, purchase);
                    }
                });
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onSuccess(final Map<String, QEntitlement> entitlements) {
                Intrinsics.checkNotNullParameter(entitlements, "entitlements");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionPurchaseCallback qonversionPurchaseCallback2 = qonversionPurchaseCallback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$mainPurchaseCallback$1$onSuccess$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionPurchaseCallback2.onSuccess(entitlements);
                    }
                });
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onError(final QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionPurchaseCallback qonversionPurchaseCallback2 = qonversionPurchaseCallback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$mainPurchaseCallback$1$onError$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionPurchaseCallback2.onError(error);
                    }
                });
            }
        };
    }

    private final QonversionUserCallback mainUserCallback(final QonversionUserCallback callback) {
        return new QonversionUserCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.mainUserCallback.1
            @Override // com.qonversion.android.sdk.listeners.QonversionUserCallback
            public void onSuccess(final QUser user) {
                Intrinsics.checkNotNullParameter(user, "user");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionUserCallback qonversionUserCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$mainUserCallback$1$onSuccess$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionUserCallback.onSuccess(user);
                    }
                });
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionUserCallback
            public void onError(final QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QonversionInternal qonversionInternal = QonversionInternal.this;
                final QonversionUserCallback qonversionUserCallback = callback;
                qonversionInternal.postToMainThread(new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$mainUserCallback$1$onError$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        qonversionUserCallback.onError(error);
                    }
                });
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postToMainThread(final Function0<Unit> runnable) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    QonversionInternal.postToMainThread$lambda$2(runnable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postToMainThread$lambda$2(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }
}
