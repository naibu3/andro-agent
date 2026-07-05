package com.qonversion.android.sdk.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.QFallbackObject;
import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.QRemoteConfigList;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.internal.provider.UserStateProvider;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.services.QRemoteConfigService;
import com.qonversion.android.sdk.listeners.QonversionEmptyCallback;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QRemoteConfigManager.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002>?B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020(J\u0016\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%J\u0016\u0010*\u001a\u00020!2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020(J+\u0010+\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010\u00122\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020!0.¢\u0006\u0002\b0H\u0002J(\u00101\u001a\u0002022\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001042\u0006\u00105\u001a\u0002062\u0006\u0010$\u001a\u000202H\u0002J\u0006\u00107\u001a\u00020!J\u001a\u00108\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010\u00122\b\u0010$\u001a\u0004\u0018\u00010/J\u000e\u00109\u001a\u00020!2\u0006\u0010$\u001a\u000202J$\u00109\u001a\u00020!2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0012042\u0006\u00105\u001a\u0002062\u0006\u0010$\u001a\u000202J\u0006\u0010:\u001a\u00020!J\u000e\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020=R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006@"}, d2 = {"Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;", "", "remoteConfigService", "Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;", "fallbacksService", "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "(Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V", "fallbackData", "Lcom/qonversion/android/sdk/dto/QFallbackObject;", "getFallbackData", "()Lcom/qonversion/android/sdk/dto/QFallbackObject;", "fallbackData$delegate", "Lkotlin/Lazy;", "listRequests", "", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;", "loadingStates", "", "", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;", "userPropertiesManager", "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;", "getUserPropertiesManager", "()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;", "setUserPropertiesManager", "(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V", "userStateProvider", "Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;", "getUserStateProvider", "()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;", "setUserStateProvider", "(Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;)V", "attachUserToExperiment", "", "experimentId", "groupId", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToRemoteConfiguration", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "detachUserFromExperiment", "detachUserFromRemoteConfiguration", "fireToCallbacks", "contextKey", "action", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "Lkotlin/ExtensionFunctionType;", "getRemoteConfigListCallbackWrapper", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "contextKeys", "", "includeEmptyContextKey", "", "handlePendingRequests", "loadRemoteConfig", "loadRemoteConfigList", "onUserUpdate", "userChangingRequestFailedWithError", com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/qonversion/android/sdk/dto/QonversionError;", "ListRequestData", "LoadingState", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QRemoteConfigManager {

    /* renamed from: fallbackData$delegate, reason: from kotlin metadata */
    private final Lazy fallbackData;
    private final QFallbacksService fallbacksService;
    private final List<ListRequestData> listRequests;
    private Map<String, LoadingState> loadingStates;
    private final QRemoteConfigService remoteConfigService;
    public QUserPropertiesManager userPropertiesManager;
    public UserStateProvider userStateProvider;

    @Inject
    public QRemoteConfigManager(QRemoteConfigService remoteConfigService, QFallbacksService fallbacksService) {
        Intrinsics.checkNotNullParameter(remoteConfigService, "remoteConfigService");
        Intrinsics.checkNotNullParameter(fallbacksService, "fallbacksService");
        this.remoteConfigService = remoteConfigService;
        this.fallbacksService = fallbacksService;
        this.fallbackData = LazyKt.lazy(new Function0<QFallbackObject>() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager$fallbackData$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final QFallbackObject invoke() {
                return this.this$0.fallbacksService.obtainFallbackData();
            }
        });
        this.loadingStates = new LinkedHashMap();
        this.listRequests = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QFallbackObject getFallbackData() {
        return (QFallbackObject) this.fallbackData.getValue();
    }

    /* compiled from: QRemoteConfigManager.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;", "", "loadedConfig", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "callbacks", "", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "isInProgress", "", "(Lcom/qonversion/android/sdk/dto/QRemoteConfig;Ljava/util/List;Z)V", "getCallbacks", "()Ljava/util/List;", "()Z", "setInProgress", "(Z)V", "getLoadedConfig", "()Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "setLoadedConfig", "(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class LoadingState {
        private final List<QonversionRemoteConfigCallback> callbacks;
        private boolean isInProgress;
        private QRemoteConfig loadedConfig;

        public LoadingState() {
            this(null, null, false, 7, null);
        }

        public LoadingState(QRemoteConfig qRemoteConfig, List<QonversionRemoteConfigCallback> callbacks, boolean z) {
            Intrinsics.checkNotNullParameter(callbacks, "callbacks");
            this.loadedConfig = qRemoteConfig;
            this.callbacks = callbacks;
            this.isInProgress = z;
        }

        public final QRemoteConfig getLoadedConfig() {
            return this.loadedConfig;
        }

        public final void setLoadedConfig(QRemoteConfig qRemoteConfig) {
            this.loadedConfig = qRemoteConfig;
        }

        public /* synthetic */ LoadingState(QRemoteConfig qRemoteConfig, ArrayList arrayList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : qRemoteConfig, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? false : z);
        }

        public final List<QonversionRemoteConfigCallback> getCallbacks() {
            return this.callbacks;
        }

        /* renamed from: isInProgress, reason: from getter */
        public final boolean getIsInProgress() {
            return this.isInProgress;
        }

        public final void setInProgress(boolean z) {
            this.isInProgress = z;
        }
    }

    /* compiled from: QRemoteConfigManager.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;", "", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "contextKeys", "", "", "includeEmptyContextKey", "", "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/List;Z)V", "getCallback", "()Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "getContextKeys", "()Ljava/util/List;", "getIncludeEmptyContextKey", "()Z", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ListRequestData {
        private final QonversionRemoteConfigListCallback callback;
        private final List<String> contextKeys;
        private final boolean includeEmptyContextKey;

        public ListRequestData(QonversionRemoteConfigListCallback callback, List<String> list, boolean z) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callback = callback;
            this.contextKeys = list;
            this.includeEmptyContextKey = z;
        }

        public /* synthetic */ ListRequestData(QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(qonversionRemoteConfigListCallback, (i & 2) != 0 ? null : list, (i & 4) != 0 ? false : z);
        }

        public final QonversionRemoteConfigListCallback getCallback() {
            return this.callback;
        }

        public final List<String> getContextKeys() {
            return this.contextKeys;
        }

        public final boolean getIncludeEmptyContextKey() {
            return this.includeEmptyContextKey;
        }
    }

    public final UserStateProvider getUserStateProvider() {
        UserStateProvider userStateProvider = this.userStateProvider;
        if (userStateProvider != null) {
            return userStateProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStateProvider");
        return null;
    }

    public final void setUserStateProvider(UserStateProvider userStateProvider) {
        Intrinsics.checkNotNullParameter(userStateProvider, "<set-?>");
        this.userStateProvider = userStateProvider;
    }

    public final QUserPropertiesManager getUserPropertiesManager() {
        QUserPropertiesManager qUserPropertiesManager = this.userPropertiesManager;
        if (qUserPropertiesManager != null) {
            return qUserPropertiesManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userPropertiesManager");
        return null;
    }

    public final void setUserPropertiesManager(QUserPropertiesManager qUserPropertiesManager) {
        Intrinsics.checkNotNullParameter(qUserPropertiesManager, "<set-?>");
        this.userPropertiesManager = qUserPropertiesManager;
    }

    public final void handlePendingRequests() {
        Unit unit;
        Map<String, LoadingState> map = this.loadingStates;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, LoadingState> entry : map.entrySet()) {
            if (!entry.getValue().getCallbacks().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            loadRemoteConfig((String) it.next(), null);
        }
        for (ListRequestData listRequestData : this.listRequests) {
            List<String> contextKeys = listRequestData.getContextKeys();
            if (contextKeys != null) {
                loadRemoteConfigList(contextKeys, listRequestData.getIncludeEmptyContextKey(), listRequestData.getCallback());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                loadRemoteConfigList(listRequestData.getCallback());
            }
        }
    }

    public final void userChangingRequestFailedWithError(final QonversionError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Iterator<T> it = this.loadingStates.keySet().iterator();
        while (it.hasNext()) {
            fireToCallbacks((String) it.next(), new Function1<QonversionRemoteConfigCallback, Unit>() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager$userChangingRequestFailedWithError$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(QonversionRemoteConfigCallback qonversionRemoteConfigCallback) {
                    invoke2(qonversionRemoteConfigCallback);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(QonversionRemoteConfigCallback fireToCallbacks) {
                    Intrinsics.checkNotNullParameter(fireToCallbacks, "$this$fireToCallbacks");
                    fireToCallbacks.onError(error);
                }
            });
        }
    }

    public final void onUserUpdate() {
        this.loadingStates = new LinkedHashMap();
    }

    public final void loadRemoteConfig(final String contextKey, QonversionRemoteConfigCallback callback) {
        QRemoteConfig loadedConfig;
        LoadingState loadingState = this.loadingStates.get(contextKey);
        if (loadingState != null && (loadedConfig = loadingState.getLoadedConfig()) != null) {
            if (!getUserStateProvider().isUserStable()) {
                loadedConfig = null;
            }
            if (loadedConfig != null) {
                if (callback != null) {
                    callback.onSuccess(loadedConfig);
                    return;
                }
                return;
            }
        }
        final LoadingState loadingState2 = this.loadingStates.get(contextKey);
        if (loadingState2 == null) {
            loadingState2 = new LoadingState(null, null, false, 7, null);
        }
        this.loadingStates.put(contextKey, loadingState2);
        if (callback != null) {
            loadingState2.getCallbacks().add(callback);
        }
        if (!getUserStateProvider().isUserStable() || loadingState2.getIsInProgress()) {
            return;
        }
        loadingState2.setInProgress(true);
        loadingState2.setLoadedConfig(null);
        getUserPropertiesManager().forceSendProperties(new QonversionEmptyCallback() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager.loadRemoteConfig.4
            @Override // com.qonversion.android.sdk.listeners.QonversionEmptyCallback
            public void onComplete() {
                QRemoteConfigService qRemoteConfigService = QRemoteConfigManager.this.remoteConfigService;
                String str = contextKey;
                final LoadingState loadingState3 = loadingState2;
                final QRemoteConfigManager qRemoteConfigManager = QRemoteConfigManager.this;
                final String str2 = contextKey;
                qRemoteConfigService.loadRemoteConfig(str, new QonversionRemoteConfigCallback() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager$loadRemoteConfig$4$onComplete$1
                    @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback
                    public void onSuccess(final QRemoteConfig remoteConfig) {
                        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
                        loadingState3.setLoadedConfig(remoteConfig);
                        qRemoteConfigManager.fireToCallbacks(str2, new Function1<QonversionRemoteConfigCallback, Unit>() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onSuccess$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(QonversionRemoteConfigCallback qonversionRemoteConfigCallback) {
                                invoke2(qonversionRemoteConfigCallback);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(QonversionRemoteConfigCallback fireToCallbacks) {
                                Intrinsics.checkNotNullParameter(fireToCallbacks, "$this$fireToCallbacks");
                                fireToCallbacks.onSuccess(remoteConfig);
                            }
                        });
                    }

                    @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback
                    public void onError(final QonversionError error) {
                        QRemoteConfigList remoteConfigList;
                        QRemoteConfig qRemoteConfigRemoteConfigForContextKey;
                        Unit unit;
                        Intrinsics.checkNotNullParameter(error, "error");
                        if (!UtilsKt.getShouldFireFallback(error)) {
                            qRemoteConfigManager.fireToCallbacks(str2, new Function1<QonversionRemoteConfigCallback, Unit>() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(QonversionRemoteConfigCallback qonversionRemoteConfigCallback) {
                                    invoke2(qonversionRemoteConfigCallback);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(QonversionRemoteConfigCallback fireToCallbacks) {
                                    Intrinsics.checkNotNullParameter(fireToCallbacks, "$this$fireToCallbacks");
                                    fireToCallbacks.onError(error);
                                }
                            });
                            return;
                        }
                        QFallbackObject fallbackData = qRemoteConfigManager.getFallbackData();
                        if (fallbackData == null || (remoteConfigList = fallbackData.getRemoteConfigList()) == null) {
                            qRemoteConfigManager.fireToCallbacks(str2, new Function1<QonversionRemoteConfigCallback, Unit>() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$baseRemoteConfigList$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(QonversionRemoteConfigCallback qonversionRemoteConfigCallback) {
                                    invoke2(qonversionRemoteConfigCallback);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(QonversionRemoteConfigCallback fireToCallbacks) {
                                    Intrinsics.checkNotNullParameter(fireToCallbacks, "$this$fireToCallbacks");
                                    fireToCallbacks.onError(error);
                                }
                            });
                            return;
                        }
                        String str3 = str2;
                        if (str3 == null) {
                            qRemoteConfigRemoteConfigForContextKey = remoteConfigList.getRemoteConfigForEmptyContextKey();
                        } else {
                            qRemoteConfigRemoteConfigForContextKey = remoteConfigList.remoteConfigForContextKey(str3);
                        }
                        if (qRemoteConfigRemoteConfigForContextKey != null) {
                            onSuccess(qRemoteConfigRemoteConfigForContextKey);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            qRemoteConfigManager.fireToCallbacks(str2, new Function1<QonversionRemoteConfigCallback, Unit>() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$3
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(QonversionRemoteConfigCallback qonversionRemoteConfigCallback) {
                                    invoke2(qonversionRemoteConfigCallback);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(QonversionRemoteConfigCallback fireToCallbacks) {
                                    Intrinsics.checkNotNullParameter(fireToCallbacks, "$this$fireToCallbacks");
                                    fireToCallbacks.onError(error);
                                }
                            });
                        }
                    }
                });
            }
        });
    }

    public final void loadRemoteConfigList(final List<String> contextKeys, final boolean includeEmptyContextKey, final QonversionRemoteConfigListCallback callback) {
        Intrinsics.checkNotNullParameter(contextKeys, "contextKeys");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<String> listPlus = includeEmptyContextKey ? CollectionsKt.plus((Collection<? extends String>) contextKeys, QRemoteConfigManagerKt.EmptyContextKey) : contextKeys;
        if (!(listPlus instanceof Collection) || !listPlus.isEmpty()) {
            Iterator<T> it = listPlus.iterator();
            while (it.hasNext()) {
                LoadingState loadingState = this.loadingStates.get((String) it.next());
                if ((loadingState != null ? loadingState.getLoadedConfig() : null) == null) {
                    if (!getUserStateProvider().isUserStable()) {
                        this.listRequests.add(new ListRequestData(callback, contextKeys, includeEmptyContextKey));
                        return;
                    } else {
                        getUserPropertiesManager().forceSendProperties(new QonversionEmptyCallback() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager.loadRemoteConfigList.2
                            @Override // com.qonversion.android.sdk.listeners.QonversionEmptyCallback
                            public void onComplete() {
                                QRemoteConfigService qRemoteConfigService = QRemoteConfigManager.this.remoteConfigService;
                                List<String> list = contextKeys;
                                boolean z = includeEmptyContextKey;
                                qRemoteConfigService.loadRemoteConfigs(list, z, QRemoteConfigManager.this.getRemoteConfigListCallbackWrapper(list, z, callback));
                            }
                        });
                        return;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listPlus.iterator();
        while (it2.hasNext()) {
            LoadingState loadingState2 = this.loadingStates.get((String) it2.next());
            QRemoteConfig loadedConfig = loadingState2 != null ? loadingState2.getLoadedConfig() : null;
            if (loadedConfig != null) {
                arrayList.add(loadedConfig);
            }
        }
        callback.onSuccess(new QRemoteConfigList(arrayList));
    }

    public final void loadRemoteConfigList(final QonversionRemoteConfigListCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!getUserStateProvider().isUserStable()) {
            this.listRequests.add(new ListRequestData(callback, null, false, 6, null));
            return;
        }
        getUserPropertiesManager().forceSendProperties(new QonversionEmptyCallback() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager.loadRemoteConfigList.3
            @Override // com.qonversion.android.sdk.listeners.QonversionEmptyCallback
            public void onComplete() {
                QRemoteConfigManager.this.remoteConfigService.loadRemoteConfigs(QRemoteConfigManager.this.getRemoteConfigListCallbackWrapper(null, true, callback));
            }
        });
    }

    public final void attachUserToExperiment(String experimentId, String groupId, QonversionExperimentAttachCallback callback) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LoadingState loadingState = this.loadingStates.get(QRemoteConfigManagerKt.EmptyContextKey);
        if (loadingState != null) {
            loadingState.setLoadedConfig(null);
        }
        this.remoteConfigService.attachUserToExperiment(experimentId, groupId, callback);
    }

    public final void detachUserFromExperiment(String experimentId, QonversionExperimentAttachCallback callback) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LoadingState loadingState = this.loadingStates.get(QRemoteConfigManagerKt.EmptyContextKey);
        if (loadingState != null) {
            loadingState.setLoadedConfig(null);
        }
        this.remoteConfigService.detachUserFromExperiment(experimentId, callback);
    }

    public final void attachUserToRemoteConfiguration(String remoteConfigurationId, QonversionRemoteConfigurationAttachCallback callback) {
        Intrinsics.checkNotNullParameter(remoteConfigurationId, "remoteConfigurationId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LoadingState loadingState = this.loadingStates.get(QRemoteConfigManagerKt.EmptyContextKey);
        if (loadingState != null) {
            loadingState.setLoadedConfig(null);
        }
        this.remoteConfigService.attachUserToRemoteConfiguration(remoteConfigurationId, callback);
    }

    public final void detachUserFromRemoteConfiguration(String remoteConfigurationId, QonversionRemoteConfigurationAttachCallback callback) {
        Intrinsics.checkNotNullParameter(remoteConfigurationId, "remoteConfigurationId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LoadingState loadingState = this.loadingStates.get(QRemoteConfigManagerKt.EmptyContextKey);
        if (loadingState != null) {
            loadingState.setLoadedConfig(null);
        }
        this.remoteConfigService.detachUserFromRemoteConfiguration(remoteConfigurationId, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QonversionRemoteConfigListCallback getRemoteConfigListCallbackWrapper(final List<String> contextKeys, final boolean includeEmptyContextKey, final QonversionRemoteConfigListCallback callback) {
        final Map<String, LoadingState> map = this.loadingStates;
        return new QonversionRemoteConfigListCallback() { // from class: com.qonversion.android.sdk.internal.QRemoteConfigManager.getRemoteConfigListCallbackWrapper.1
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onSuccess(QRemoteConfigList remoteConfigList) {
                Intrinsics.checkNotNullParameter(remoteConfigList, "remoteConfigList");
                List<QRemoteConfig> remoteConfigs = remoteConfigList.getRemoteConfigs();
                Map<String, LoadingState> map2 = map;
                for (QRemoteConfig qRemoteConfig : remoteConfigs) {
                    String contextKey = qRemoteConfig.getSource().getContextKey();
                    LoadingState loadingState = map2.get(contextKey);
                    if (loadingState == null) {
                        loadingState = new LoadingState(null, null, false, 7, null);
                    }
                    loadingState.setLoadedConfig(qRemoteConfig);
                    map2.put(contextKey, loadingState);
                }
                callback.onSuccess(remoteConfigList);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onError(QonversionError error) {
                QRemoteConfigList remoteConfigList;
                QRemoteConfigList qRemoteConfigList;
                Intrinsics.checkNotNullParameter(error, "error");
                if (UtilsKt.getShouldFireFallback(error)) {
                    QFallbackObject fallbackData = this.getFallbackData();
                    if (fallbackData == null || (remoteConfigList = fallbackData.getRemoteConfigList()) == null) {
                        callback.onError(error);
                        return;
                    }
                    Object obj = null;
                    if (contextKeys == null) {
                        qRemoteConfigList = QRemoteConfigList.copy$default(remoteConfigList, null, 1, null);
                    } else {
                        List<QRemoteConfig> remoteConfigs = remoteConfigList.getRemoteConfigs();
                        List<String> list = contextKeys;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : remoteConfigs) {
                            if (CollectionsKt.contains(list, ((QRemoteConfig) obj2).getSource().getContextKey())) {
                                arrayList.add(obj2);
                            }
                        }
                        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                        if (includeEmptyContextKey) {
                            Iterator<T> it = remoteConfigList.getRemoteConfigs().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                String contextKey = ((QRemoteConfig) next).getSource().getContextKey();
                                if (contextKey != null && contextKey.length() == 0) {
                                    obj = next;
                                    break;
                                }
                            }
                            QRemoteConfig qRemoteConfig = (QRemoteConfig) obj;
                            if (qRemoteConfig != null) {
                                mutableList.add(qRemoteConfig);
                            }
                        }
                        qRemoteConfigList = new QRemoteConfigList(CollectionsKt.toList(mutableList));
                    }
                    onSuccess(qRemoteConfigList);
                    return;
                }
                callback.onError(error);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireToCallbacks(String contextKey, Function1<? super QonversionRemoteConfigCallback, Unit> action) {
        LoadingState loadingState = this.loadingStates.get(contextKey);
        if (loadingState != null) {
            loadingState.setInProgress(false);
            List list = CollectionsKt.toList(loadingState.getCallbacks());
            loadingState.getCallbacks().clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                action.invoke((QonversionRemoteConfigCallback) it.next());
            }
        }
    }
}
