package com.qonversion.android.sdk.internal.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.dto.properties.QUserProperty;
import com.qonversion.android.sdk.internal.api.RateLimiter;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
import com.qonversion.android.sdk.internal.api.RequestType;
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
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RepositoryWithRateLimits.kt */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005Jd\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00070\f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00070\fH\u0016J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u001bH\u0016JY\u0010\u001c\u001a\u00020\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e0\t2\u0006\u0010\u001f\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010 2#\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH\u0016JA\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070 2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00070\fH\u0016J\u0018\u0010$\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u001bH\u0016J&\u0010&\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0(2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020+H\u0016JE\u0010,\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0(\u0012\u0004\u0012\u00020\u00070\f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00070\fH\u0016J^\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00070\f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00070\fH\u0016J\u0010\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u000204H\u0016J*\u00105\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*2\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u000208H\u0016J\u001a\u00109\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020=H\u0016J&\u0010<\u001a\u00020\u00072\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\n0(2\u0006\u0010?\u001a\u00020@2\u0006\u0010\u0017\u001a\u00020=H\u0016J.\u0010A\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C0(2\u0006\u0010\u0017\u001a\u0002082\u0006\u0010D\u001a\u00020EH\u0016JV\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110H¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(I\u0012\u0004\u0012\u00020\u00070\f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00070\fH\u0016JS\u0010J\u001a\u00020\u00072\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00070\f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00070\fH\u0016J\u0010\u0010M\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\nH\u0016JI\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "repository", "rateLimiter", "Lcom/qonversion/android/sdk/internal/api/RateLimiter;", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/api/RateLimiter;)V", "actionPoints", "", "queryParams", "", "", "onSuccess", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "actionPoint", "onError", "Lcom/qonversion/android/sdk/dto/QonversionError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "attachUserToExperiment", "experimentId", "groupId", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToRemoteConfiguration", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "attribution", "conversionInfo", "", "from", "Lkotlin/Function0;", "crashReport", "crashData", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "detachUserFromExperiment", "detachUserFromRemoteConfiguration", "eligibilityForProductIds", "productIds", "", "installDate", "", "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;", "getProperties", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "identify", "userID", "currentUserID", "identityID", "init", "requestData", "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;", "purchase", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "qProductId", "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;", "remoteConfig", "contextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "remoteConfigList", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "contextKeys", "includeEmptyContextKey", "", "restore", "historyRecords", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "requestTrigger", "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;", "screens", ScreenActivity.INTENT_SCREEN_ID, "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "screen", "sendProperties", "properties", "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "views", "withRateLimitCheck", "requestType", "Lcom/qonversion/android/sdk/internal/api/RequestType;", "hash", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class RepositoryWithRateLimits implements QRepository {
    private final RateLimiter rateLimiter;
    private final QRepository repository;

    public RepositoryWithRateLimits(QRepository repository, RateLimiter rateLimiter) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(rateLimiter, "rateLimiter");
        this.repository = repository;
        this.rateLimiter = rateLimiter;
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void init(final InitRequestData requestData) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        withRateLimitCheck(RequestType.Init, requestData.hashCode(), new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.init.1
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
                QonversionLaunchCallback callback = requestData.getCallback();
                if (callback != null) {
                    callback.onError(error);
                }
            }
        }, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.init.2
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
                RepositoryWithRateLimits.this.repository.init(requestData);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void remoteConfig(final String contextKey, final QonversionRemoteConfigCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        withRateLimitCheck(RequestType.RemoteConfig, contextKey != null ? contextKey.hashCode() : 0, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.remoteConfig.1
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
        }, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.remoteConfig.2
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
                RepositoryWithRateLimits.this.repository.remoteConfig(contextKey, callback);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void remoteConfigList(final List<String> contextKeys, final boolean includeEmptyContextKey, final QonversionRemoteConfigListCallback callback) {
        Intrinsics.checkNotNullParameter(contextKeys, "contextKeys");
        Intrinsics.checkNotNullParameter(callback, "callback");
        withRateLimitCheck(RequestType.RemoteConfigList, contextKeys.hashCode(), new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.remoteConfigList.1
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
        }, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.remoteConfigList.2
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
                RepositoryWithRateLimits.this.repository.remoteConfigList(contextKeys, includeEmptyContextKey, callback);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void remoteConfigList(final QonversionRemoteConfigListCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        withRateLimitCheck(RequestType.RemoteConfigList, 0, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.remoteConfigList.3
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
        }, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.remoteConfigList.4
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
                RepositoryWithRateLimits.this.repository.remoteConfigList(callback);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void attachUserToExperiment(final String experimentId, final String groupId, final QonversionExperimentAttachCallback callback) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        withRateLimitCheck(RequestType.AttachUserToExperiment, (experimentId + groupId).hashCode(), new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.attachUserToExperiment.1
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
        }, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.attachUserToExperiment.2
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
                RepositoryWithRateLimits.this.repository.attachUserToExperiment(experimentId, groupId, callback);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void detachUserFromExperiment(final String experimentId, final QonversionExperimentAttachCallback callback) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        withRateLimitCheck(RequestType.DetachUserFromExperiment, experimentId.hashCode(), new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.detachUserFromExperiment.1
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
        }, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.detachUserFromExperiment.2
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
                RepositoryWithRateLimits.this.repository.detachUserFromExperiment(experimentId, callback);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void attachUserToRemoteConfiguration(final String remoteConfigurationId, final QonversionRemoteConfigurationAttachCallback callback) {
        Intrinsics.checkNotNullParameter(remoteConfigurationId, "remoteConfigurationId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        withRateLimitCheck(RequestType.AttachUserToRemoteConfiguration, remoteConfigurationId.hashCode(), new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.attachUserToRemoteConfiguration.1
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
        }, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.attachUserToRemoteConfiguration.2
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
                RepositoryWithRateLimits.this.repository.attachUserToRemoteConfiguration(remoteConfigurationId, callback);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void detachUserFromRemoteConfiguration(final String remoteConfigurationId, final QonversionRemoteConfigurationAttachCallback callback) {
        Intrinsics.checkNotNullParameter(remoteConfigurationId, "remoteConfigurationId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        withRateLimitCheck(RequestType.DetachUserFromRemoteConfiguration, remoteConfigurationId.hashCode(), new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.detachUserFromRemoteConfiguration.1
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
        }, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.detachUserFromRemoteConfiguration.2
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
                RepositoryWithRateLimits.this.repository.detachUserFromRemoteConfiguration(remoteConfigurationId, callback);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void purchase(final long installDate, final Purchase purchase, final String qProductId, final QonversionLaunchCallback callback) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(callback, "callback");
        withRateLimitCheck(RequestType.Purchase, purchase.hashCode() + (qProductId + installDate).hashCode(), new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.purchase.1
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
        }, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.purchase.2
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
                RepositoryWithRateLimits.this.repository.purchase(installDate, purchase, qProductId, callback);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void restore(final long installDate, final List<PurchaseHistory> historyRecords, final QonversionLaunchCallback callback, final RequestTrigger requestTrigger) {
        Intrinsics.checkNotNullParameter(historyRecords, "historyRecords");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(requestTrigger, "requestTrigger");
        withRateLimitCheck(RequestType.Restore, Long.hashCode(installDate) + historyRecords.hashCode(), new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.restore.1
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
        }, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.restore.2
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
                RepositoryWithRateLimits.this.repository.restore(installDate, historyRecords, callback, requestTrigger);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void attribution(final Map<String, ? extends Object> conversionInfo, final String from, final Function0<Unit> onSuccess, final Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(conversionInfo, "conversionInfo");
        Intrinsics.checkNotNullParameter(from, "from");
        withRateLimitCheck(RequestType.Attribution, conversionInfo.hashCode() + from.hashCode(), new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.attribution.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                Function1<QonversionError, Unit> function1 = onError;
                if (function1 != null) {
                    function1.invoke(error);
                }
            }
        }, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.attribution.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                RepositoryWithRateLimits.this.repository.attribution(conversionInfo, from, onSuccess, onError);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void sendProperties(Map<String, String> properties, Function1<? super SendPropertiesResult, Unit> onSuccess, Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.repository.sendProperties(properties, onSuccess, onError);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void getProperties(final Function1<? super List<QUserProperty>, Unit> onSuccess, final Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        withRateLimitCheck(RequestType.GetProperties, 0, onError, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.getProperties.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                RepositoryWithRateLimits.this.repository.getProperties(onSuccess, onError);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void eligibilityForProductIds(final List<String> productIds, final long installDate, final QonversionEligibilityCallback callback) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(callback, "callback");
        withRateLimitCheck(RequestType.EligibilityForProductIds, productIds.hashCode() + Long.hashCode(installDate), new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.eligibilityForProductIds.1
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
        }, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.eligibilityForProductIds.2
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
                RepositoryWithRateLimits.this.repository.eligibilityForProductIds(productIds, installDate, callback);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void identify(final String userID, final String currentUserID, final Function1<? super String, Unit> onSuccess, final Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(currentUserID, "currentUserID");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        withRateLimitCheck(RequestType.Identify, (userID + currentUserID).hashCode(), onError, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits.identify.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                RepositoryWithRateLimits.this.repository.identify(userID, currentUserID, onSuccess, onError);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void screens(String screenId, Function1<? super Screen, Unit> onSuccess, Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.repository.screens(screenId, onSuccess, onError);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void views(String screenId) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        this.repository.views(screenId);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void actionPoints(Map<String, String> queryParams, Function1<? super ActionPointScreen, Unit> onSuccess, Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.repository.actionPoints(queryParams, onSuccess, onError);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void crashReport(CrashRequest crashData, Function0<Unit> onSuccess, Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(crashData, "crashData");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.repository.crashReport(crashData, onSuccess, onError);
    }

    private final void withRateLimitCheck(RequestType requestType, int hash, Function1<? super QonversionError, Unit> onError, Function0<Unit> onSuccess) {
        if (this.rateLimiter.isRateLimitExceeded(requestType, hash)) {
            onError.invoke(new QonversionError(QonversionErrorCode.ApiRateLimitExceeded, null, null, 6, null));
        } else {
            this.rateLimiter.saveRequest(requestType, hash);
            onSuccess.invoke();
        }
    }
}
