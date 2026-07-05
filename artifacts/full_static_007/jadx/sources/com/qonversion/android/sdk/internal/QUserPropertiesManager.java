package com.qonversion.android.sdk.internal;

import android.app.Application;
import android.content.ContentResolver;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.dto.properties.QUserProperties;
import com.qonversion.android.sdk.dto.properties.QUserProperty;
import com.qonversion.android.sdk.dto.properties.QUserPropertyKey;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
import com.qonversion.android.sdk.internal.dto.QLaunchResult;
import com.qonversion.android.sdk.internal.dto.SendPropertiesResult;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.storage.PropertiesStorage;
import com.qonversion.android.sdk.listeners.QonversionEmptyCallback;
import com.qonversion.android.sdk.listeners.QonversionLaunchCallback;
import com.qonversion.android.sdk.listeners.QonversionUserPropertiesCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QUserPropertiesManager.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B7\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0011J\u0006\u0010$\u001a\u00020!J\u0006\u0010%\u001a\u00020!J\u0012\u0010&\u001a\u00020!2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020!H\u0007J\u0006\u0010*\u001a\u00020!J\u0010\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\u001eH\u0007J\u0016\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(J\u0016\u00100\u001a\u00020!2\u0006\u0010.\u001a\u0002012\u0006\u0010/\u001a\u00020(J\u000e\u00102\u001a\u00020!2\u0006\u0010#\u001a\u000203R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;", "Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;", "context", "Landroid/app/Application;", "repository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "propertiesStorage", "Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;", "delayCalculator", "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;", "appStateProvider", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "completions", "", "Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;", "handler", "Landroid/os/Handler;", "isRequestInProgress", "", "isSendingScheduled", "productCenterManager", "Lcom/qonversion/android/sdk/internal/QProductCenterManager;", "getProductCenterManager$sdk_release", "()Lcom/qonversion/android/sdk/internal/QProductCenterManager;", "setProductCenterManager$sdk_release", "(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V", "retriesCounter", "", "retryDelay", "fireCallbacks", "", "forceSendProperties", "callback", "onAppBackground", "onAppForeground", "onFbAttributionIdResult", "id", "", "retryPropertiesRequest", "sendFacebookAttribution", "sendPropertiesWithDelay", "delaySec", "setCustomUserProperty", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setUserProperty", "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;", "userProperties", "Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QUserPropertiesManager implements FacebookAttributionListener {
    private static final String LOOPER_THREAD_NAME = "userPropertiesThread";
    private static final int PROPERTY_UPLOAD_MIN_DELAY = 5;
    private final AppStateProvider appStateProvider;
    private List<QonversionEmptyCallback> completions;
    private final Application context;
    private final IncrementalDelayCalculator delayCalculator;
    private Handler handler;
    private boolean isRequestInProgress;
    private boolean isSendingScheduled;
    private final Logger logger;
    private QProductCenterManager productCenterManager;
    private PropertiesStorage propertiesStorage;
    private final QRepository repository;
    private int retriesCounter;
    private int retryDelay;

    @Inject
    public QUserPropertiesManager(Application context, QRepository repository, PropertiesStorage propertiesStorage, IncrementalDelayCalculator delayCalculator, AppStateProvider appStateProvider, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(propertiesStorage, "propertiesStorage");
        Intrinsics.checkNotNullParameter(delayCalculator, "delayCalculator");
        Intrinsics.checkNotNullParameter(appStateProvider, "appStateProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.repository = repository;
        this.propertiesStorage = propertiesStorage;
        this.delayCalculator = delayCalculator;
        this.appStateProvider = appStateProvider;
        this.logger = logger;
        this.retryDelay = 5;
        this.completions = new ArrayList();
        HandlerThread handlerThread = new HandlerThread(LOOPER_THREAD_NAME);
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
    }

    /* renamed from: getProductCenterManager$sdk_release, reason: from getter */
    public final QProductCenterManager getProductCenterManager() {
        return this.productCenterManager;
    }

    public final void setProductCenterManager$sdk_release(QProductCenterManager qProductCenterManager) {
        this.productCenterManager = qProductCenterManager;
    }

    public final void onAppBackground() {
        forceSendProperties$default(this, null, 1, null);
    }

    public final void onAppForeground() {
        if (this.propertiesStorage.getProperties().isEmpty()) {
            return;
        }
        sendPropertiesWithDelay(this.retryDelay);
    }

    public final void sendFacebookAttribution() {
        try {
            FacebookAttribution facebookAttribution = new FacebookAttribution();
            ContentResolver contentResolver = this.context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            facebookAttribution.getAttributionId(contentResolver, this);
        } catch (IllegalStateException e) {
            this.logger.error("Failed to retrieve facebook attribution " + e.getLocalizedMessage());
        }
    }

    @Override // com.qonversion.android.sdk.internal.FacebookAttributionListener
    public void onFbAttributionIdResult(String id) {
        if (id == null) {
            return;
        }
        setCustomUserProperty(QUserPropertyKey.FacebookAttribution.getUserPropertyCode(), id);
    }

    public static /* synthetic */ void forceSendProperties$default(QUserPropertiesManager qUserPropertiesManager, QonversionEmptyCallback qonversionEmptyCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            qonversionEmptyCallback = null;
        }
        qUserPropertiesManager.forceSendProperties(qonversionEmptyCallback);
    }

    public final void forceSendProperties(QonversionEmptyCallback callback) {
        if (this.isRequestInProgress) {
            if (callback != null) {
                this.completions.add(callback);
                return;
            }
            return;
        }
        final Map<String, String> properties = this.propertiesStorage.getProperties();
        if (properties.isEmpty()) {
            if (callback != null) {
                callback.onComplete();
            }
        } else {
            if (callback != null) {
                this.completions.add(callback);
            }
            this.isRequestInProgress = true;
            this.isSendingScheduled = false;
            this.repository.sendProperties(properties, new Function1<SendPropertiesResult, Unit>() { // from class: com.qonversion.android.sdk.internal.QUserPropertiesManager.forceSendProperties.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SendPropertiesResult sendPropertiesResult) {
                    invoke2(sendPropertiesResult);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SendPropertiesResult result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    QUserPropertiesManager.this.fireCallbacks();
                    List<SendPropertiesResult.PropertyError> propertyErrors = result.getPropertyErrors();
                    QUserPropertiesManager qUserPropertiesManager = QUserPropertiesManager.this;
                    for (SendPropertiesResult.PropertyError propertyError : propertyErrors) {
                        qUserPropertiesManager.logger.error("Failed to save property " + propertyError.getKey() + ": " + propertyError.getError());
                    }
                    QUserPropertiesManager.this.isRequestInProgress = false;
                    QUserPropertiesManager.this.retriesCounter = 0;
                    QUserPropertiesManager.this.retryDelay = 5;
                    QUserPropertiesManager.this.propertiesStorage.clear(properties);
                }
            }, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.QUserPropertiesManager.forceSendProperties.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(QonversionError qonversionError) {
                    invoke2(qonversionError);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(QonversionError it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    QUserPropertiesManager.this.fireCallbacks();
                    QUserPropertiesManager.this.isRequestInProgress = false;
                    if (it.getCode() == QonversionErrorCode.InvalidClientUid) {
                        QProductCenterManager productCenterManager = QUserPropertiesManager.this.getProductCenterManager();
                        if (productCenterManager != null) {
                            RequestTrigger requestTrigger = RequestTrigger.UserProperties;
                            final QUserPropertiesManager qUserPropertiesManager = QUserPropertiesManager.this;
                            productCenterManager.launch(requestTrigger, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QUserPropertiesManager.forceSendProperties.2.1
                                @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                                public void onSuccess(QLaunchResult launchResult) {
                                    Intrinsics.checkNotNullParameter(launchResult, "launchResult");
                                    qUserPropertiesManager.retryPropertiesRequest();
                                }

                                @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                                public void onError(QonversionError error) {
                                    Intrinsics.checkNotNullParameter(error, "error");
                                    qUserPropertiesManager.retryPropertiesRequest();
                                }
                            });
                            return;
                        }
                        return;
                    }
                    QUserPropertiesManager.this.retryPropertiesRequest();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireCallbacks() {
        List list = CollectionsKt.toList(this.completions);
        this.completions.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((QonversionEmptyCallback) it.next()).onComplete();
        }
    }

    public final void retryPropertiesRequest() {
        int i = this.retriesCounter + 1;
        this.retriesCounter = i;
        try {
            int iCountDelay = this.delayCalculator.countDelay(5, i);
            this.retryDelay = iCountDelay;
            sendPropertiesWithDelay(iCountDelay);
        } catch (IllegalArgumentException e) {
            this.logger.error("The error occurred during properties sending. " + e);
        }
    }

    public final void setUserProperty(QUserPropertyKey key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (key == QUserPropertyKey.Custom) {
            this.logger.error("Can not set user property with the key `QUserPropertyKey.Custom`. To set custom user property, use the `setCustomUserProperty` method.");
        } else {
            setCustomUserProperty(key.getUserPropertyCode(), value);
        }
    }

    public final void setCustomUserProperty(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() == 0) {
            return;
        }
        this.propertiesStorage.save(key, value);
        if (this.isSendingScheduled) {
            return;
        }
        sendPropertiesWithDelay(this.retryDelay);
    }

    public final void userProperties(final QonversionUserPropertiesCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.repository.getProperties(new Function1<List<? extends QUserProperty>, Unit>() { // from class: com.qonversion.android.sdk.internal.QUserPropertiesManager.userProperties.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends QUserProperty> list) {
                invoke2((List<QUserProperty>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<QUserProperty> properties) {
                Intrinsics.checkNotNullParameter(properties, "properties");
                callback.onSuccess(new QUserProperties(properties));
            }
        }, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.QUserPropertiesManager.userProperties.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(QonversionError qonversionError) {
                invoke2(qonversionError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                callback.onError(error);
            }
        });
    }

    public final void sendPropertiesWithDelay(int delaySec) {
        if (this.appStateProvider.getAppState().isBackground()) {
            return;
        }
        long jSecondsToMilliSeconds = ExtensionsKt.secondsToMilliSeconds(delaySec);
        this.isSendingScheduled = true;
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.qonversion.android.sdk.internal.QUserPropertiesManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    QUserPropertiesManager.sendPropertiesWithDelay$lambda$1(this.f$0);
                }
            }, jSecondsToMilliSeconds);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendPropertiesWithDelay$lambda$1(QUserPropertiesManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        forceSendProperties$default(this$0, null, 1, null);
    }
}
