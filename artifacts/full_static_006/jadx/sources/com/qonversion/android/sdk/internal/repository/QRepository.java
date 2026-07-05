package com.qonversion.android.sdk.internal.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.properties.QUserProperty;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
import com.qonversion.android.sdk.internal.dto.SendPropertiesResult;
import com.qonversion.android.sdk.internal.dto.automations.ActionPointScreen;
import com.qonversion.android.sdk.internal.dto.automations.Screen;
import com.qonversion.android.sdk.internal.dto.request.CrashRequest;
import com.qonversion.android.sdk.internal.dto.request.data.InitRequestData;
import com.qonversion.android.sdk.internal.purchase.Purchase;
import com.qonversion.android.sdk.internal.purchase.PurchaseHistory;
import com.qonversion.android.sdk.listeners.QonversionEligibilityCallback;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionLaunchCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: QRepository.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001Jd\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\bH&J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0017H&J]\u0010\u0018\u001a\u00020\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b2%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH&JA\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\bH&J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0017H&J&\u0010!\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020&H&JE\u0010'\u001a\u00020\u00032\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0#\u0012\u0004\u0012\u00020\u00030\b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\bH&J^\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030\b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\bH&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/H&J*\u00100\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u000203H&J\u001a\u00104\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u000206H&J\u0010\u00107\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u000208H&J&\u00107\u001a\u00020\u00032\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060#2\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0013\u001a\u000208H&J.\u0010<\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0#2\u0006\u0010\u0013\u001a\u0002032\u0006\u0010?\u001a\u00020@H&JV\u0010A\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110C¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(D\u0012\u0004\u0012\u00020\u00030\b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\bH&JS\u0010E\u001a\u00020\u00032\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00030\b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\bH&J\u0010\u0010H\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0006H&¨\u0006I"}, d2 = {"Lcom/qonversion/android/sdk/internal/repository/QRepository;", "", "actionPoints", "", "queryParams", "", "", "onSuccess", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "actionPoint", "onError", "Lcom/qonversion/android/sdk/dto/QonversionError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "attachUserToExperiment", "experimentId", "groupId", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToRemoteConfiguration", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "attribution", "conversionInfo", "from", "Lkotlin/Function0;", "crashReport", "crashData", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "detachUserFromExperiment", "detachUserFromRemoteConfiguration", "eligibilityForProductIds", "productIds", "", "installDate", "", "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;", "getProperties", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "identify", "userID", "currentUserID", "identityID", "init", "requestData", "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;", "purchase", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "qProductId", "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;", "remoteConfig", "contextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "remoteConfigList", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "contextKeys", "includeEmptyContextKey", "", "restore", "historyRecords", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "requestTrigger", "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;", "screens", ScreenActivity.INTENT_SCREEN_ID, "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "screen", "sendProperties", "properties", "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "views", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface QRepository {
    void actionPoints(Map<String, String> queryParams, Function1<? super ActionPointScreen, Unit> onSuccess, Function1<? super QonversionError, Unit> onError);

    void attachUserToExperiment(String experimentId, String groupId, QonversionExperimentAttachCallback callback);

    void attachUserToRemoteConfiguration(String remoteConfigurationId, QonversionRemoteConfigurationAttachCallback callback);

    void attribution(Map<String, ? extends Object> conversionInfo, String from, Function0<Unit> onSuccess, Function1<? super QonversionError, Unit> onError);

    void crashReport(CrashRequest crashData, Function0<Unit> onSuccess, Function1<? super QonversionError, Unit> onError);

    void detachUserFromExperiment(String experimentId, QonversionExperimentAttachCallback callback);

    void detachUserFromRemoteConfiguration(String remoteConfigurationId, QonversionRemoteConfigurationAttachCallback callback);

    void eligibilityForProductIds(List<String> productIds, long installDate, QonversionEligibilityCallback callback);

    void getProperties(Function1<? super List<QUserProperty>, Unit> onSuccess, Function1<? super QonversionError, Unit> onError);

    void identify(String userID, String currentUserID, Function1<? super String, Unit> onSuccess, Function1<? super QonversionError, Unit> onError);

    void init(InitRequestData requestData);

    void purchase(long installDate, Purchase purchase, String qProductId, QonversionLaunchCallback callback);

    void remoteConfig(String contextKey, QonversionRemoteConfigCallback callback);

    void remoteConfigList(QonversionRemoteConfigListCallback callback);

    void remoteConfigList(List<String> contextKeys, boolean includeEmptyContextKey, QonversionRemoteConfigListCallback callback);

    void restore(long installDate, List<PurchaseHistory> historyRecords, QonversionLaunchCallback callback, RequestTrigger requestTrigger);

    void screens(String screenId, Function1<? super Screen, Unit> onSuccess, Function1<? super QonversionError, Unit> onError);

    void sendProperties(Map<String, String> properties, Function1<? super SendPropertiesResult, Unit> onSuccess, Function1<? super QonversionError, Unit> onError);

    void views(String screenId);

    /* compiled from: QRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void attribution$default(QRepository qRepository, Map map, String str, Function0 function0, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attribution");
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            qRepository.attribution(map, str, function0, function1);
        }
    }
}
