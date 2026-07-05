package com.qonversion.android.sdk.internal.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.QRemoteConfigList;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.dto.properties.QUserProperty;
import com.qonversion.android.sdk.internal.CallBackKt;
import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.ErrorsKt;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.Api;
import com.qonversion.android.sdk.internal.api.ApiErrorMapper;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
import com.qonversion.android.sdk.internal.billing.UtilsKt;
import com.qonversion.android.sdk.internal.dto.ActionPoints;
import com.qonversion.android.sdk.internal.dto.BaseResponse;
import com.qonversion.android.sdk.internal.dto.Data;
import com.qonversion.android.sdk.internal.dto.Environment;
import com.qonversion.android.sdk.internal.dto.ProviderData;
import com.qonversion.android.sdk.internal.dto.QLaunchResult;
import com.qonversion.android.sdk.internal.dto.SendPropertiesResult;
import com.qonversion.android.sdk.internal.dto.automations.ActionPointScreen;
import com.qonversion.android.sdk.internal.dto.automations.Screen;
import com.qonversion.android.sdk.internal.dto.eligibility.EligibilityResult;
import com.qonversion.android.sdk.internal.dto.eligibility.StoreProductInfo;
import com.qonversion.android.sdk.internal.dto.identity.IdentityResult;
import com.qonversion.android.sdk.internal.dto.purchase.History;
import com.qonversion.android.sdk.internal.dto.purchase.Inapp;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseDetails;
import com.qonversion.android.sdk.internal.dto.request.AttachUserRequest;
import com.qonversion.android.sdk.internal.dto.request.AttributionRequest;
import com.qonversion.android.sdk.internal.dto.request.CrashRequest;
import com.qonversion.android.sdk.internal.dto.request.EligibilityRequest;
import com.qonversion.android.sdk.internal.dto.request.IdentityRequest;
import com.qonversion.android.sdk.internal.dto.request.InitRequest;
import com.qonversion.android.sdk.internal.dto.request.PurchaseRequest;
import com.qonversion.android.sdk.internal.dto.request.RestoreRequest;
import com.qonversion.android.sdk.internal.dto.request.ViewsRequest;
import com.qonversion.android.sdk.internal.dto.request.data.InitRequestData;
import com.qonversion.android.sdk.internal.dto.request.data.UserPropertyRequestData;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.purchase.Purchase;
import com.qonversion.android.sdk.internal.purchase.PurchaseHistory;
import com.qonversion.android.sdk.listeners.QonversionEligibilityCallback;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionLaunchCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* compiled from: DefaultRepository.kt */
@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 y2\u00020\u0001:\u0001yB7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJd\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001d2#\u0010\u001e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u001b0\u001f2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J \u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010*\u001a\u00020.H\u0016JY\u0010/\u001a\u00020\u001b2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002010\u001d2\u0006\u00102\u001a\u00020\u00102\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u0001032#\u0010$\u001a\u001f\u0012\u0013\u0012\u00110%¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001fH\u0016J\u001c\u00104\u001a\b\u0012\u0004\u0012\u000206052\f\u00107\u001a\b\u0012\u0004\u0012\u00020805H\u0002J\u001c\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0010H\u0002J\u001e\u0010>\u001a\b\u0012\u0004\u0012\u00020?052\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020<\u0018\u000105H\u0002JA\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020C2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b032!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J$\u0010D\u001a\u00020E2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002010\u001d2\u0006\u00102\u001a\u00020\u0010H\u0002J\u0018\u0010F\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010G\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010*\u001a\u00020.H\u0016J&\u0010H\u001a\u00020\u001b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u0010052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010*\u001a\u00020JH\u0016JE\u0010K\u001a\u00020\u001b2\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020L05\u0012\u0004\u0012\u00020\u001b0\u001f2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J&\u0010M\u001a\u00020\u001b2\u0012\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0P0O2\b\u0010*\u001a\u0004\u0018\u00010RH\u0002JR\u0010S\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020R2\u0006\u0010&\u001a\u00020%2\b\u0010T\u001a\u0004\u0018\u00010U2\u0006\u0010V\u001a\u00020U2!\u0010W\u001a\u001d\u0012\u0013\u0012\u00110U¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(V\u0012\u0004\u0012\u00020\u001b0\u001fH\u0002¢\u0006\u0002\u0010XJ^\u0010Y\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u00102!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\\\u0012\u0004\u0012\u00020\u001b0\u001f2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J\u0010\u0010]\u001a\u00020\u001b2\u0006\u0010^\u001a\u00020_H\u0016J*\u0010;\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u00102\u0006\u0010*\u001a\u00020RH\u0016J4\u0010`\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u00102\u0006\u0010*\u001a\u00020R2\b\b\u0002\u0010V\u001a\u00020UH\u0002J\u001a\u0010a\u001a\u00020\u001b2\b\u0010b\u001a\u0004\u0018\u00010\u00102\u0006\u0010*\u001a\u00020cH\u0016J\u0010\u0010d\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020eH\u0016J&\u0010d\u001a\u00020\u001b2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u0010052\u0006\u0010g\u001a\u00020\u00142\u0006\u0010*\u001a\u00020eH\u0016J.\u0010h\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\f\u00107\u001a\b\u0012\u0004\u0012\u000208052\u0006\u0010*\u001a\u00020R2\u0006\u0010i\u001a\u00020jH\u0016J3\u0010k\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010l\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010*\u001a\u00020R2\u0006\u0010m\u001a\u00020jH\u0001¢\u0006\u0002\bnJV\u0010o\u001a\u00020\u001b2\u0006\u0010p\u001a\u00020\u00102!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110q¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(r\u0012\u0004\u0012\u00020\u001b0\u001f2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016JS\u0010s\u001a\u00020\u001b2\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u001b0\u001f2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J\u0010\u0010v\u001a\u00020\u001b2\u0006\u0010p\u001a\u00020\u0010H\u0016J\u0018\u0010w\u001a\u00020\u0010\"\u0004\b\u0000\u0010x*\b\u0012\u0004\u0012\u0002Hx0OH\u0002R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006z"}, d2 = {"Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "api", "Lcom/qonversion/android/sdk/internal/api/Api;", "environmentProvider", "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;", "config", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "errorMapper", "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;", "delayCalculator", "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;", "(Lcom/qonversion/android/sdk/internal/api/Api;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)V", "advertisingId", "", "installDate", "", "isDebugMode", "", "key", "sdkVersion", "uid", "getUid", "()Ljava/lang/String;", "actionPoints", "", "queryParams", "", "onSuccess", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "actionPoint", "onError", "Lcom/qonversion/android/sdk/dto/QonversionError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "attachUserToExperiment", "experimentId", "groupId", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToRemoteConfiguration", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "attribution", "conversionInfo", "", "from", "Lkotlin/Function0;", "convertHistory", "", "Lcom/qonversion/android/sdk/internal/dto/purchase/History;", "historyRecords", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "convertPurchaseDetails", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;", "purchase", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "qProductId", "convertPurchases", "Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;", "purchases", "crashReport", "crashData", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "createAttributionRequest", "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;", "detachUserFromExperiment", "detachUserFromRemoteConfiguration", "eligibilityForProductIds", "productIds", "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;", "getProperties", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "handlePermissionsResponse", "response", "Lretrofit2/Response;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;", "handlePurchaseError", "errorCode", "", "attemptIndex", "retry", "(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILkotlin/jvm/functions/Function1;)V", "identify", "userID", "currentUserID", "identityID", "init", "requestData", "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;", "purchaseRequest", "remoteConfig", "contextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "remoteConfigList", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "contextKeys", "includeEmptyContextKey", "restore", "requestTrigger", "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;", "restoreRequest", "history", "trigger", "restoreRequest$sdk_release", "screens", ScreenActivity.INTENT_SCREEN_ID, "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "screen", "sendProperties", "properties", "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "views", "getLogMessage", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class DefaultRepository implements QRepository {
    private static final int MAX_RETRIES_COUNT = 3;
    private String advertisingId;
    private final Api api;
    private final InternalConfig config;
    private final IncrementalDelayCalculator delayCalculator;
    private final EnvironmentProvider environmentProvider;
    private final ApiErrorMapper errorMapper;
    private long installDate;
    private final boolean isDebugMode;
    private final String key;
    private final Logger logger;
    private final String sdkVersion;

    public DefaultRepository(Api api, EnvironmentProvider environmentProvider, InternalConfig config, Logger logger, ApiErrorMapper errorMapper, IncrementalDelayCalculator delayCalculator) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(environmentProvider, "environmentProvider");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Intrinsics.checkNotNullParameter(delayCalculator, "delayCalculator");
        this.api = api;
        this.environmentProvider = environmentProvider;
        this.config = config;
        this.logger = logger;
        this.errorMapper = errorMapper;
        this.delayCalculator = delayCalculator;
        this.key = config.getPrimaryConfig().getProjectKey();
        this.isDebugMode = config.isSandbox();
        this.sdkVersion = config.getPrimaryConfig().getSdkVersion();
    }

    private final String getUid() {
        return this.config.getUid();
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void init(final InitRequestData requestData) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        this.advertisingId = requestData.getIdfa();
        this.installDate = requestData.getInstallDate();
        ExtensionsKt.enqueue(this.api.init(new InitRequest(this.installDate, this.environmentProvider.getInfo(this.advertisingId), this.sdkVersion, this.key, getUid(), null, ExtensionsKt.stringValue(this.isDebugMode), convertPurchases(requestData.getPurchases()), 32, null), requestData.getRequestTrigger().getKey()), new Function1<CallBackKt<BaseResponse<QLaunchResult>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.init.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<BaseResponse<QLaunchResult>> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<BaseResponse<QLaunchResult>> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final InitRequestData initRequestData = requestData;
                enqueue.setOnResponse(new Function1<Response<BaseResponse<QLaunchResult>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.init.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<BaseResponse<QLaunchResult>> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<BaseResponse<QLaunchResult>> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("initRequest - " + defaultRepository.getLogMessage(it));
                        BaseResponse<QLaunchResult> baseResponseBody = it.body();
                        if (baseResponseBody != null && baseResponseBody.getSuccess()) {
                            QonversionLaunchCallback callback = initRequestData.getCallback();
                            if (callback != null) {
                                callback.onSuccess(baseResponseBody.getData());
                                return;
                            }
                            return;
                        }
                        QonversionLaunchCallback callback2 = initRequestData.getCallback();
                        if (callback2 != null) {
                            callback2.onError(defaultRepository.errorMapper.getErrorFromResponse(it));
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final InitRequestData initRequestData2 = requestData;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.init.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("initRequest - failure - " + ErrorsKt.toQonversionError(it));
                        QonversionLaunchCallback callback = initRequestData2.getCallback();
                        if (callback != null) {
                            callback.onError(ErrorsKt.toQonversionError(it));
                        }
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void remoteConfig(String contextKey, final QonversionRemoteConfigCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ExtensionsKt.enqueue(this.api.remoteConfig(getUid(), contextKey), new Function1<CallBackKt<QRemoteConfig>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.remoteConfig.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<QRemoteConfig> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<QRemoteConfig> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final QonversionRemoteConfigCallback qonversionRemoteConfigCallback = callback;
                enqueue.setOnResponse(new Function1<Response<QRemoteConfig>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.remoteConfig.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<QRemoteConfig> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<QRemoteConfig> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("remoteConfigRequest - " + defaultRepository.getLogMessage(it));
                        QRemoteConfig qRemoteConfigBody = it.body();
                        if (qRemoteConfigBody == null) {
                            qonversionRemoteConfigCallback.onError(defaultRepository.errorMapper.getErrorFromResponse(it));
                        } else if (qRemoteConfigBody.getIsCorrect()) {
                            qonversionRemoteConfigCallback.onSuccess(qRemoteConfigBody);
                        } else {
                            qonversionRemoteConfigCallback.onError(new QonversionError(QonversionErrorCode.RemoteConfigurationNotAvailable, null, null, 6, null));
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final QonversionRemoteConfigCallback qonversionRemoteConfigCallback2 = callback;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.remoteConfig.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("remoteConfigRequest - failure - " + ErrorsKt.toQonversionError(it));
                        qonversionRemoteConfigCallback2.onError(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void remoteConfigList(List<String> contextKeys, boolean includeEmptyContextKey, final QonversionRemoteConfigListCallback callback) {
        Intrinsics.checkNotNullParameter(contextKeys, "contextKeys");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ExtensionsKt.enqueue(this.api.remoteConfigList(getUid(), contextKeys, includeEmptyContextKey), new Function1<CallBackKt<List<? extends QRemoteConfig>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.remoteConfigList.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<List<? extends QRemoteConfig>> callBackKt) {
                invoke2((CallBackKt<List<QRemoteConfig>>) callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<List<QRemoteConfig>> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback = callback;
                enqueue.setOnResponse(new Function1<Response<List<? extends QRemoteConfig>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.remoteConfigList.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<List<? extends QRemoteConfig>> response) {
                        invoke2((Response<List<QRemoteConfig>>) response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<List<QRemoteConfig>> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("remoteConfigListRequest for specific context keys - " + defaultRepository.getLogMessage(it));
                        List<QRemoteConfig> listBody = it.body();
                        if (listBody == null) {
                            qonversionRemoteConfigListCallback.onError(defaultRepository.errorMapper.getErrorFromResponse(it));
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listBody) {
                            if (((QRemoteConfig) obj).getIsCorrect()) {
                                arrayList.add(obj);
                            }
                        }
                        qonversionRemoteConfigListCallback.onSuccess(new QRemoteConfigList(arrayList));
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback2 = callback;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.remoteConfigList.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("remoteConfigRequest for specific context keys - failure - " + ErrorsKt.toQonversionError(it));
                        qonversionRemoteConfigListCallback2.onError(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void remoteConfigList(final QonversionRemoteConfigListCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ExtensionsKt.enqueue(Api.DefaultImpls.remoteConfigList$default(this.api, getUid(), false, 2, null), new Function1<CallBackKt<List<? extends QRemoteConfig>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.remoteConfigList.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<List<? extends QRemoteConfig>> callBackKt) {
                invoke2((CallBackKt<List<QRemoteConfig>>) callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<List<QRemoteConfig>> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback = callback;
                enqueue.setOnResponse(new Function1<Response<List<? extends QRemoteConfig>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.remoteConfigList.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<List<? extends QRemoteConfig>> response) {
                        invoke2((Response<List<QRemoteConfig>>) response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<List<QRemoteConfig>> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("remoteConfigListRequest for all context keys - " + defaultRepository.getLogMessage(it));
                        List<QRemoteConfig> listBody = it.body();
                        if (listBody == null) {
                            qonversionRemoteConfigListCallback.onError(defaultRepository.errorMapper.getErrorFromResponse(it));
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listBody) {
                            if (((QRemoteConfig) obj).getIsCorrect()) {
                                arrayList.add(obj);
                            }
                        }
                        qonversionRemoteConfigListCallback.onSuccess(new QRemoteConfigList(arrayList));
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback2 = callback;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.remoteConfigList.2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("remoteConfigRequest for all context keys - failure - " + ErrorsKt.toQonversionError(it));
                        qonversionRemoteConfigListCallback2.onError(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void attachUserToExperiment(String experimentId, String groupId, final QonversionExperimentAttachCallback callback) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ExtensionsKt.enqueue(this.api.attachUserToExperiment(experimentId, getUid(), new AttachUserRequest(groupId)), new Function1<CallBackKt<Void>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.attachUserToExperiment.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<Void> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<Void> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final QonversionExperimentAttachCallback qonversionExperimentAttachCallback = callback;
                enqueue.setOnResponse(new Function1<Response<Void>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.attachUserToExperiment.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<Void> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<Void> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("attachUserToExperimentRequest - " + defaultRepository.getLogMessage(it));
                        if (!it.isSuccessful()) {
                            qonversionExperimentAttachCallback.onError(defaultRepository.errorMapper.getErrorFromResponse(it));
                        } else {
                            qonversionExperimentAttachCallback.onSuccess();
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final QonversionExperimentAttachCallback qonversionExperimentAttachCallback2 = callback;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.attachUserToExperiment.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("attachUserToExperimentRequest - failure - " + ErrorsKt.toQonversionError(it));
                        qonversionExperimentAttachCallback2.onError(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void detachUserFromExperiment(String experimentId, final QonversionExperimentAttachCallback callback) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ExtensionsKt.enqueue(this.api.detachUserFromExperiment(experimentId, getUid()), new Function1<CallBackKt<Void>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.detachUserFromExperiment.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<Void> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<Void> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final QonversionExperimentAttachCallback qonversionExperimentAttachCallback = callback;
                enqueue.setOnResponse(new Function1<Response<Void>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.detachUserFromExperiment.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<Void> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<Void> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("detachUserFromExperimentRequest - " + defaultRepository.getLogMessage(it));
                        if (!it.isSuccessful()) {
                            qonversionExperimentAttachCallback.onError(defaultRepository.errorMapper.getErrorFromResponse(it));
                        } else {
                            qonversionExperimentAttachCallback.onSuccess();
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final QonversionExperimentAttachCallback qonversionExperimentAttachCallback2 = callback;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.detachUserFromExperiment.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("detachUserFromExperimentRequest - failure - " + ErrorsKt.toQonversionError(it));
                        qonversionExperimentAttachCallback2.onError(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void attachUserToRemoteConfiguration(String remoteConfigurationId, final QonversionRemoteConfigurationAttachCallback callback) {
        Intrinsics.checkNotNullParameter(remoteConfigurationId, "remoteConfigurationId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ExtensionsKt.enqueue(this.api.attachUserToRemoteConfiguration(remoteConfigurationId, getUid()), new Function1<CallBackKt<Void>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.attachUserToRemoteConfiguration.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<Void> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<Void> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback = callback;
                enqueue.setOnResponse(new Function1<Response<Void>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.attachUserToRemoteConfiguration.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<Void> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<Void> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("attachUserToRemoteConfigurationRequest - " + defaultRepository.getLogMessage(it));
                        if (!it.isSuccessful()) {
                            qonversionRemoteConfigurationAttachCallback.onError(defaultRepository.errorMapper.getErrorFromResponse(it));
                        } else {
                            qonversionRemoteConfigurationAttachCallback.onSuccess();
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback2 = callback;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.attachUserToRemoteConfiguration.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("attachUserToRemoteConfigurationRequest - failure - " + ErrorsKt.toQonversionError(it));
                        qonversionRemoteConfigurationAttachCallback2.onError(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void detachUserFromRemoteConfiguration(String remoteConfigurationId, final QonversionRemoteConfigurationAttachCallback callback) {
        Intrinsics.checkNotNullParameter(remoteConfigurationId, "remoteConfigurationId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ExtensionsKt.enqueue(this.api.detachUserFromRemoteConfiguration(remoteConfigurationId, getUid()), new Function1<CallBackKt<Void>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.detachUserFromRemoteConfiguration.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<Void> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<Void> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback = callback;
                enqueue.setOnResponse(new Function1<Response<Void>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.detachUserFromRemoteConfiguration.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<Void> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<Void> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("detachUserFromRemoteConfigurationRequest - " + defaultRepository.getLogMessage(it));
                        if (!it.isSuccessful()) {
                            qonversionRemoteConfigurationAttachCallback.onError(defaultRepository.errorMapper.getErrorFromResponse(it));
                        } else {
                            qonversionRemoteConfigurationAttachCallback.onSuccess();
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback2 = callback;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.detachUserFromRemoteConfiguration.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("detachUserFromRemoteConfigurationRequest - failure - " + ErrorsKt.toQonversionError(it));
                        qonversionRemoteConfigurationAttachCallback2.onError(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void purchase(long installDate, Purchase purchase, String qProductId, QonversionLaunchCallback callback) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(callback, "callback");
        purchaseRequest$default(this, installDate, purchase, qProductId, callback, 0, 16, null);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void restore(long installDate, List<PurchaseHistory> historyRecords, QonversionLaunchCallback callback, RequestTrigger requestTrigger) {
        Intrinsics.checkNotNullParameter(historyRecords, "historyRecords");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(requestTrigger, "requestTrigger");
        restoreRequest$sdk_release(installDate, convertHistory(historyRecords), callback, requestTrigger);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void attribution(Map<String, ? extends Object> conversionInfo, String from, final Function0<Unit> onSuccess, final Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(conversionInfo, "conversionInfo");
        Intrinsics.checkNotNullParameter(from, "from");
        ExtensionsKt.enqueue(this.api.attribution(createAttributionRequest(conversionInfo, from)), new Function1<CallBackKt<BaseResponse<com.qonversion.android.sdk.internal.dto.Response>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.attribution.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<BaseResponse<com.qonversion.android.sdk.internal.dto.Response>> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<BaseResponse<com.qonversion.android.sdk.internal.dto.Response>> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final Function0<Unit> function0 = onSuccess;
                final Function1<QonversionError, Unit> function1 = onError;
                enqueue.setOnResponse(new Function1<Response<BaseResponse<com.qonversion.android.sdk.internal.dto.Response>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.attribution.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<BaseResponse<com.qonversion.android.sdk.internal.dto.Response>> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<BaseResponse<com.qonversion.android.sdk.internal.dto.Response>> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("AttributionRequest - " + defaultRepository.getLogMessage(it));
                        if (it.isSuccessful()) {
                            Function0<Unit> function02 = function0;
                            if (function02 != null) {
                                function02.invoke();
                                return;
                            }
                            return;
                        }
                        Function1<QonversionError, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(defaultRepository.errorMapper.getErrorFromResponse(it));
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final Function1<QonversionError, Unit> function12 = onError;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.attribution.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("AttributionRequest - failure - " + ErrorsKt.toQonversionError(it));
                        Function1<QonversionError, Unit> function13 = function12;
                        if (function13 != null) {
                            function13.invoke(ErrorsKt.toQonversionError(it));
                        }
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void getProperties(final Function1<? super List<QUserProperty>, Unit> onSuccess, final Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        ExtensionsKt.enqueue(this.api.getProperties(getUid()), new Function1<CallBackKt<List<? extends QUserProperty>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.getProperties.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<List<? extends QUserProperty>> callBackKt) {
                invoke2((CallBackKt<List<QUserProperty>>) callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<List<QUserProperty>> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final Function1<List<QUserProperty>, Unit> function1 = onSuccess;
                final Function1<QonversionError, Unit> function12 = onError;
                enqueue.setOnResponse(new Function1<Response<List<? extends QUserProperty>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.getProperties.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<List<? extends QUserProperty>> response) {
                        invoke2((Response<List<QUserProperty>>) response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<List<QUserProperty>> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("getPropertiesRequest - " + defaultRepository.getLogMessage(it));
                        List<QUserProperty> listBody = it.body();
                        if (!it.isSuccessful() || listBody == null) {
                            function12.invoke(defaultRepository.errorMapper.getErrorFromResponse(it));
                        } else {
                            function1.invoke(listBody);
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final Function1<QonversionError, Unit> function13 = onError;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.getProperties.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("getPropertiesRequest - failure - " + ErrorsKt.toQonversionError(it));
                        function13.invoke(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void eligibilityForProductIds(List<String> productIds, long installDate, final QonversionEligibilityCallback callback) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Environment info = this.environmentProvider.getInfo(this.advertisingId);
        String str = this.sdkVersion;
        String str2 = this.key;
        String uid = getUid();
        String strStringValue = ExtensionsKt.stringValue(this.isDebugMode);
        List<String> list = productIds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new StoreProductInfo((String) it.next()));
        }
        ExtensionsKt.enqueue(this.api.eligibility(new EligibilityRequest(installDate, info, str, str2, uid, null, strStringValue, arrayList, 32, null)), new Function1<CallBackKt<BaseResponse<EligibilityResult>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.eligibilityForProductIds.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<BaseResponse<EligibilityResult>> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<BaseResponse<EligibilityResult>> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final QonversionEligibilityCallback qonversionEligibilityCallback = callback;
                enqueue.setOnResponse(new Function1<Response<BaseResponse<EligibilityResult>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.eligibilityForProductIds.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<BaseResponse<EligibilityResult>> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<BaseResponse<EligibilityResult>> it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        defaultRepository.logger.debug("eligibilityRequest - " + defaultRepository.getLogMessage(it2));
                        BaseResponse<EligibilityResult> baseResponseBody = it2.body();
                        if (baseResponseBody == null || !baseResponseBody.getSuccess()) {
                            qonversionEligibilityCallback.onError(defaultRepository.errorMapper.getErrorFromResponse(it2));
                        } else {
                            qonversionEligibilityCallback.onSuccess(baseResponseBody.getData().getProductsEligibility());
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final QonversionEligibilityCallback qonversionEligibilityCallback2 = callback;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.eligibilityForProductIds.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        defaultRepository2.logger.error("eligibilityRequest - failure - " + ErrorsKt.toQonversionError(it2));
                        qonversionEligibilityCallback2.onError(ErrorsKt.toQonversionError(it2));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void identify(String userID, String currentUserID, final Function1<? super String, Unit> onSuccess, final Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(currentUserID, "currentUserID");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        ExtensionsKt.enqueue(this.api.identify(new IdentityRequest(currentUserID, userID)), new Function1<CallBackKt<Data<IdentityResult>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.identify.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<Data<IdentityResult>> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<Data<IdentityResult>> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final Function1<String, Unit> function1 = onSuccess;
                final Function1<QonversionError, Unit> function12 = onError;
                enqueue.setOnResponse(new Function1<Response<Data<IdentityResult>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.identify.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<Data<IdentityResult>> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<Data<IdentityResult>> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("identityRequest - " + defaultRepository.getLogMessage(it));
                        Data<IdentityResult> dataBody = it.body();
                        if (dataBody == null || !it.isSuccessful()) {
                            function12.invoke(defaultRepository.errorMapper.getErrorFromResponse(it));
                        } else {
                            function1.invoke(dataBody.getData().getUserID());
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final Function1<QonversionError, Unit> function13 = onError;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.identify.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("identityRequest - failure - " + ErrorsKt.toQonversionError(it));
                        function13.invoke(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void screens(String screenId, final Function1<? super Screen, Unit> onSuccess, final Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        ExtensionsKt.enqueue(this.api.screens(screenId), new Function1<CallBackKt<Data<Screen>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.screens.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<Data<Screen>> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<Data<Screen>> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final Function1<Screen, Unit> function1 = onSuccess;
                final Function1<QonversionError, Unit> function12 = onError;
                enqueue.setOnResponse(new Function1<Response<Data<Screen>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.screens.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<Data<Screen>> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<Data<Screen>> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("screensRequest - " + defaultRepository.getLogMessage(it));
                        Data<Screen> dataBody = it.body();
                        if (dataBody == null || !it.isSuccessful()) {
                            function12.invoke(defaultRepository.errorMapper.getErrorFromResponse(it));
                        } else {
                            function1.invoke(dataBody.getData());
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final Function1<QonversionError, Unit> function13 = onError;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.screens.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("screensRequest - failure - " + ErrorsKt.toQonversionError(it));
                        function13.invoke(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void views(String screenId) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        ExtensionsKt.enqueue(this.api.views(screenId, new ViewsRequest(getUid())), new Function1<CallBackKt<Void>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.views.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<Void> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<Void> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                enqueue.setOnResponse(new Function1<Response<Void>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.views.1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<Void> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<Void> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("viewsRequest - " + defaultRepository.getLogMessage(it));
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.views.1.2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("viewsRequest - failure - " + ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void actionPoints(Map<String, String> queryParams, final Function1<? super ActionPointScreen, Unit> onSuccess, final Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        ExtensionsKt.enqueue(this.api.actionPoints(getUid(), queryParams), new Function1<CallBackKt<Data<ActionPoints>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.actionPoints.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<Data<ActionPoints>> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<Data<ActionPoints>> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final Function1<ActionPointScreen, Unit> function1 = onSuccess;
                final Function1<QonversionError, Unit> function12 = onError;
                enqueue.setOnResponse(new Function1<Response<Data<ActionPoints>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.actionPoints.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<Data<ActionPoints>> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<Data<ActionPoints>> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("actionPointsRequest - " + defaultRepository.getLogMessage(it));
                        Data<ActionPoints> dataBody = it.body();
                        if (dataBody == null || !it.isSuccessful()) {
                            function12.invoke(defaultRepository.errorMapper.getErrorFromResponse(it));
                            return;
                        }
                        Function1<ActionPointScreen, Unit> function13 = function1;
                        Data data = (Data) CollectionsKt.lastOrNull((List) dataBody.getData().getItems());
                        function13.invoke(data != null ? (ActionPointScreen) data.getData() : null);
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final Function1<QonversionError, Unit> function13 = onError;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.actionPoints.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("actionPointsRequest - failure - " + ErrorsKt.toQonversionError(it));
                        function13.invoke(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void crashReport(CrashRequest crashData, final Function0<Unit> onSuccess, final Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(crashData, "crashData");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        ExtensionsKt.enqueue(Api.DefaultImpls.crashLogs$default(this.api, crashData, null, 2, null), new Function1<CallBackKt<Void>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.crashReport.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<Void> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<Void> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final Function0<Unit> function0 = onSuccess;
                final Function1<QonversionError, Unit> function1 = onError;
                enqueue.setOnResponse(new Function1<Response<Void>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.crashReport.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<Void> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<Void> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("crashReportRequest - " + defaultRepository.getLogMessage(it));
                        if (!it.isSuccessful()) {
                            function1.invoke(defaultRepository.errorMapper.getErrorFromResponse(it));
                        } else {
                            function0.invoke();
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final Function1<QonversionError, Unit> function12 = onError;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.crashReport.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.warn("crashReportRequest - failure - " + ErrorsKt.toQonversionError(it));
                        function12.invoke(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    private final AttributionRequest createAttributionRequest(Map<String, ? extends Object> conversionInfo, String from) {
        return new AttributionRequest(EnvironmentProvider.getInfo$default(this.environmentProvider, null, 1, null), this.sdkVersion, this.key, new ProviderData(conversionInfo, from), getUid());
    }

    static /* synthetic */ void purchaseRequest$default(DefaultRepository defaultRepository, long j, Purchase purchase, String str, QonversionLaunchCallback qonversionLaunchCallback, int i, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        defaultRepository.purchaseRequest(j, purchase, str, qonversionLaunchCallback, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void purchaseRequest(final long installDate, final Purchase purchase, final String qProductId, final QonversionLaunchCallback callback, final int attemptIndex) {
        ExtensionsKt.enqueue(this.api.purchase(new PurchaseRequest(installDate, this.environmentProvider.getInfo(this.advertisingId), this.sdkVersion, this.key, getUid(), null, ExtensionsKt.stringValue(this.isDebugMode), convertPurchaseDetails(purchase, qProductId), 32, null), RequestTrigger.Purchase.getKey(), attemptIndex + 1), new Function1<CallBackKt<BaseResponse<QLaunchResult>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.purchaseRequest.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<BaseResponse<QLaunchResult>> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<BaseResponse<QLaunchResult>> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final QonversionLaunchCallback qonversionLaunchCallback = callback;
                final int i = attemptIndex;
                final long j = installDate;
                final Purchase purchase2 = purchase;
                final String str = qProductId;
                enqueue.setOnResponse(new Function1<Response<BaseResponse<QLaunchResult>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.purchaseRequest.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<BaseResponse<QLaunchResult>> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<BaseResponse<QLaunchResult>> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("purchaseRequest - " + defaultRepository.getLogMessage(it));
                        BaseResponse<QLaunchResult> baseResponseBody = it.body();
                        if (baseResponseBody != null && baseResponseBody.getSuccess()) {
                            qonversionLaunchCallback.onSuccess(baseResponseBody.getData());
                            return;
                        }
                        DefaultRepository defaultRepository2 = defaultRepository;
                        QonversionLaunchCallback qonversionLaunchCallback2 = qonversionLaunchCallback;
                        QonversionError errorFromResponse = defaultRepository2.errorMapper.getErrorFromResponse(it);
                        Integer numValueOf = Integer.valueOf(it.code());
                        int i2 = i;
                        final DefaultRepository defaultRepository3 = defaultRepository;
                        final long j2 = j;
                        final Purchase purchase3 = purchase2;
                        final String str2 = str;
                        final QonversionLaunchCallback qonversionLaunchCallback3 = qonversionLaunchCallback;
                        defaultRepository2.handlePurchaseError(qonversionLaunchCallback2, errorFromResponse, numValueOf, i2, new Function1<Integer, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.purchaseRequest.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i3) {
                                defaultRepository3.purchaseRequest(j2, purchase3, str2, qonversionLaunchCallback3, i3);
                            }
                        });
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final QonversionLaunchCallback qonversionLaunchCallback2 = callback;
                final int i2 = attemptIndex;
                final long j2 = installDate;
                final Purchase purchase3 = purchase;
                final String str2 = qProductId;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.purchaseRequest.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("purchaseRequest - failure - " + ErrorsKt.toQonversionError(it));
                        DefaultRepository defaultRepository3 = defaultRepository2;
                        QonversionLaunchCallback qonversionLaunchCallback3 = qonversionLaunchCallback2;
                        QonversionError qonversionError = ErrorsKt.toQonversionError(it);
                        int i3 = i2;
                        final DefaultRepository defaultRepository4 = defaultRepository2;
                        final long j3 = j2;
                        final Purchase purchase4 = purchase3;
                        final String str3 = str2;
                        final QonversionLaunchCallback qonversionLaunchCallback4 = qonversionLaunchCallback2;
                        defaultRepository3.handlePurchaseError(qonversionLaunchCallback3, qonversionError, null, i3, new Function1<Integer, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.purchaseRequest.1.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i4) {
                                defaultRepository4.purchaseRequest(j3, purchase4, str3, qonversionLaunchCallback4, i4);
                            }
                        });
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePurchaseError(QonversionLaunchCallback callback, QonversionError error, Integer errorCode, int attemptIndex, final Function1<? super Integer, Unit> retry) {
        if (attemptIndex >= 3 || !(errorCode == null || ExtensionsKt.isInternalServerError(errorCode.intValue()))) {
            callback.onError(error);
            return;
        }
        final int i = attemptIndex + 1;
        if (attemptIndex == 0) {
            retry.invoke(Integer.valueOf(i));
            return;
        }
        try {
            new Timer("Delayed retry", false).schedule(new TimerTask() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.handlePurchaseError.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    retry.invoke(Integer.valueOf(i));
                }
            }, ExtensionsKt.secondsToMilliSeconds(this.delayCalculator.countDelay(0, attemptIndex - 1)));
        } catch (RuntimeException unused) {
            retry.invoke(Integer.valueOf(i));
        }
    }

    private final List<Inapp> convertPurchases(List<Purchase> purchases) {
        ArrayList arrayList = new ArrayList();
        if (purchases != null) {
            Iterator<T> it = purchases.iterator();
            while (it.hasNext()) {
                arrayList.add(new Inapp(convertPurchaseDetails$default(this, (Purchase) it.next(), null, 2, null)));
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    static /* synthetic */ PurchaseDetails convertPurchaseDetails$default(DefaultRepository defaultRepository, Purchase purchase, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return defaultRepository.convertPurchaseDetails(purchase, str);
    }

    private final PurchaseDetails convertPurchaseDetails(Purchase purchase, String qProductId) {
        String purchaseToken = purchase.getPurchaseToken();
        long purchaseTime = purchase.getPurchaseTime();
        String orderId = purchase.getOrderId();
        String originalOrderId = purchase.getOriginalOrderId();
        String storeProductId = purchase.getStoreProductId();
        String str = storeProductId == null ? "" : storeProductId;
        if (qProductId == null) {
            qProductId = "";
        }
        return new PurchaseDetails(purchaseToken, purchaseTime, orderId, originalOrderId, str, qProductId, purchase.getContextKeys(), purchase.getScreenUid());
    }

    private final List<History> convertHistory(List<PurchaseHistory> historyRecords) {
        History history;
        ArrayList arrayList = new ArrayList();
        for (PurchaseHistory purchaseHistory : historyRecords) {
            String productId = UtilsKt.getProductId(purchaseHistory.getHistoryRecord());
            if (productId == null) {
                history = null;
            } else {
                String purchaseToken = purchaseHistory.getHistoryRecord().getPurchaseToken();
                Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
                history = new History(productId, purchaseToken, ExtensionsKt.milliSecondsToSeconds(purchaseHistory.getHistoryRecord().getPurchaseTime()));
            }
            if (history != null) {
                arrayList.add(history);
            }
        }
        return arrayList;
    }

    public final void restoreRequest$sdk_release(long installDate, List<History> history, final QonversionLaunchCallback callback, RequestTrigger trigger) {
        Intrinsics.checkNotNullParameter(history, "history");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        ExtensionsKt.enqueue(this.api.restore(new RestoreRequest(installDate, this.environmentProvider.getInfo(this.advertisingId), this.sdkVersion, this.key, getUid(), null, ExtensionsKt.stringValue(this.isDebugMode), history, 32, null), trigger.getKey()), new Function1<CallBackKt<BaseResponse<QLaunchResult>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository$restoreRequest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<BaseResponse<QLaunchResult>> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<BaseResponse<QLaunchResult>> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = this.this$0;
                final QonversionLaunchCallback qonversionLaunchCallback = callback;
                enqueue.setOnResponse(new Function1<Response<BaseResponse<QLaunchResult>>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository$restoreRequest$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<BaseResponse<QLaunchResult>> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<BaseResponse<QLaunchResult>> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("restoreRequest - " + defaultRepository.getLogMessage(it));
                        defaultRepository.handlePermissionsResponse(it, qonversionLaunchCallback);
                    }
                });
                final DefaultRepository defaultRepository2 = this.this$0;
                final QonversionLaunchCallback qonversionLaunchCallback2 = callback;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository$restoreRequest$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("restoreRequest - failure - " + ErrorsKt.toQonversionError(it));
                        qonversionLaunchCallback2.onError(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePermissionsResponse(Response<BaseResponse<QLaunchResult>> response, QonversionLaunchCallback callback) {
        BaseResponse<QLaunchResult> baseResponseBody = response.body();
        if (baseResponseBody == null || !baseResponseBody.getSuccess()) {
            if (callback != null) {
                callback.onError(this.errorMapper.getErrorFromResponse(response));
            }
        } else if (callback != null) {
            callback.onSuccess(baseResponseBody.getData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> String getLogMessage(Response<T> response) {
        StringBuilder sb;
        if (response.isSuccessful()) {
            sb = new StringBuilder("success - ");
        } else {
            response = (Response<T>) this.errorMapper.getErrorFromResponse(response);
            sb = new StringBuilder("failure - ");
        }
        return sb.append(response).toString();
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void sendProperties(Map<String, String> properties, final Function1<? super SendPropertiesResult, Unit> onSuccess, final Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        ArrayList arrayList = new ArrayList(properties.size());
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            arrayList.add(new UserPropertyRequestData(entry.getKey(), entry.getValue()));
        }
        ExtensionsKt.enqueue(this.api.sendProperties(getUid(), arrayList), new Function1<CallBackKt<SendPropertiesResult>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.sendProperties.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CallBackKt<SendPropertiesResult> callBackKt) {
                invoke2(callBackKt);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CallBackKt<SendPropertiesResult> enqueue) {
                Intrinsics.checkNotNullParameter(enqueue, "$this$enqueue");
                final DefaultRepository defaultRepository = DefaultRepository.this;
                final Function1<SendPropertiesResult, Unit> function1 = onSuccess;
                final Function1<QonversionError, Unit> function12 = onError;
                enqueue.setOnResponse(new Function1<Response<SendPropertiesResult>, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.sendProperties.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Response<SendPropertiesResult> response) {
                        invoke2(response);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Response<SendPropertiesResult> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository.logger.debug("sendPropertiesRequest - " + defaultRepository.getLogMessage(it));
                        SendPropertiesResult sendPropertiesResultBody = it.body();
                        if (!it.isSuccessful() || sendPropertiesResultBody == null) {
                            function12.invoke(defaultRepository.errorMapper.getErrorFromResponse(it));
                        } else {
                            function1.invoke(sendPropertiesResultBody);
                        }
                    }
                });
                final DefaultRepository defaultRepository2 = DefaultRepository.this;
                final Function1<QonversionError, Unit> function13 = onError;
                enqueue.setOnFailure(new Function1<Throwable, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.sendProperties.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        defaultRepository2.logger.error("sendPropertiesRequest - failure - " + ErrorsKt.toQonversionError(it));
                        function13.invoke(ErrorsKt.toQonversionError(it));
                    }
                });
            }
        });
    }
}
