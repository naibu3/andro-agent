package com.stripe.android.financialconnections.presentation;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.savedstate.SavedStateRegistry;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.di.ActivityRetainedScope;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.di.FinancialConnectionsSingletonSharedComponentHolder;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.CreateInstantDebitsResult;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.exception.CustomManualEntryRequiredError;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.UnclassifiedError;
import com.stripe.android.financialconnections.features.error.FinancialConnectionsAttestationError;
import com.stripe.android.financialconnections.features.manualentry.CustomManualEntryKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.launcher.InstantDebitsResult;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionExtensionsKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PaymentAccount;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarHost;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewEffect;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.utils.FlowsKt;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.uicore.navigation.NavigationIntent;
import com.stripe.android.uicore.navigation.NavigationManager;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
@ActivityRetainedScope
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001eBc\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\f\u00103\u001a\u000204*\u00020\u0007H\u0002J\u0010\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108J\u0006\u00109\u001a\u000204J\u001a\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020\u00172\b\u0010<\u001a\u0004\u0018\u00010\u0017H\u0002J\u0006\u0010=\u001a\u000206J\u000e\u0010>\u001a\u0002042\u0006\u0010?\u001a\u00020\u0017J\u0006\u0010@\u001a\u000204J\u0010\u0010A\u001a\u0002062\u0006\u0010B\u001a\u00020,H\u0002J\u0010\u0010C\u001a\u0002042\b\u0010B\u001a\u0004\u0018\u00010,J\u0010\u0010D\u001a\u0002042\u0006\u0010B\u001a\u00020,H\u0002J\u000e\u0010E\u001a\u0002042\u0006\u0010F\u001a\u00020GJ\u0006\u0010H\u001a\u000204J \u0010I\u001a\u0002062\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010GH\u0002J\u0010\u0010M\u001a\u0002042\u0006\u0010N\u001a\u00020OH\u0002J\u0016\u0010P\u001a\u0002042\u0006\u0010N\u001a\u00020OH\u0082@¢\u0006\u0002\u0010QJ\u0010\u0010R\u001a\u0002042\u0006\u0010S\u001a\u00020TH\u0002J\f\u0010U\u001a\u00020V*\u00020OH\u0002J\u0018\u0010W\u001a\u0002042\u0006\u0010B\u001a\u00020,2\b\u0010X\u001a\u0004\u0018\u00010,J\u0006\u0010Y\u001a\u000204J\u0006\u0010Z\u001a\u000204J\u0010\u0010[\u001a\u0002042\u0006\u0010\\\u001a\u00020VH\u0002J\u0010\u0010]\u001a\u0002042\u0006\u0010^\u001a\u00020VH\u0016J\u0012\u0010_\u001a\u0002042\b\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u000e\u0010b\u001a\u0002042\u0006\u0010B\u001a\u00020,J\u0012\u0010c\u001a\u0004\u0018\u00010a2\u0006\u0010d\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020%0.0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020%00¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006f"}, d2 = {"Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarHost;", "activityRetainedComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "uriUtils", "Lcom/stripe/android/financialconnections/utils/UriUtils;", "completeFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;", "createInstantDebitsResult", "Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "logger", "Lcom/stripe/android/core/Logger;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", NamedConstantsKt.APPLICATION_ID, "", "initialState", "<init>", "(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V", "getActivityRetainedComponent", "()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "navigationFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/stripe/android/uicore/navigation/NavigationIntent;", "getNavigationFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "defaultTopAppBarState", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;", "getDefaultTopAppBarState", "()Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;", "defaultTopAppBarState$delegate", "Lkotlin/Lazy;", "currentPane", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "topAppBarStateUpdatesByPane", "", "topAppBarState", "Lkotlinx/coroutines/flow/StateFlow;", "getTopAppBarState", "()Lkotlinx/coroutines/flow/StateFlow;", "registerSavedStateProvider", "", "handleOnNewIntent", "Lkotlinx/coroutines/Job;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "handleOnCloseClick", "onUrlReceived", "receivedUrl", "status", "onResume", "openPartnerAuthFlowInBrowser", "url", "onViewEffectLaunched", "onCloseWithConfirmationClick", "pane", "onBackClick", "onCloseNoConfirmationClick", "onCloseFromErrorClick", "error", "", "onBackPressed", "closeAuthFlow", "earlyTerminationCause", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;", "closeAuthFlowError", "handleFinancialConnectionsCompletion", "session", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "handleInstantDebitsCompletion", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "hasAValidAccount", "", "onPaneLaunched", Destination.KEY_REFERRER, "onBackgrounded", "onForegrounded", "trackBackgroundStateChanged", "backgrounded", "updateTopAppBarElevation", "isElevated", "updateTopAppBarState", "update", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", "handlePaneChanged", "updateTopAppBar", ServerProtocol.DIALOG_PARAM_STATE, "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeViewModel extends FinancialConnectionsViewModel<FinancialConnectionsSheetNativeState> implements TopAppBarHost {
    private static final ViewModelProvider.Factory Factory;
    private static final String PARAM_CODE = "code";
    private static final String PARAM_ERROR_REASON = "error_reason";
    private static final String PARAM_STATUS = "status";
    private static final String STATUS_FAILURE = "failure";
    private static final String STATUS_SUCCESS = "success";
    private final FinancialConnectionsSheetNativeComponent activityRetainedComponent;
    private final String applicationId;
    private final CompleteFinancialConnectionsSession completeFinancialConnectionsSession;
    private final CreateInstantDebitsResult createInstantDebitsResult;
    private final MutableStateFlow<FinancialConnectionsSessionManifest.Pane> currentPane;

    /* renamed from: defaultTopAppBarState$delegate, reason: from kotlin metadata */
    private final Lazy defaultTopAppBarState;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final Logger logger;
    private final Mutex mutex;
    private final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    private final SharedFlow<NavigationIntent> navigationFlow;
    private final NavigationManager navigationManager;
    private final StateFlow<TopAppBarState> topAppBarState;
    private final MutableStateFlow<Map<FinancialConnectionsSessionManifest.Pane, TopAppBarState>> topAppBarStateUpdatesByPane;
    private final UriUtils uriUtils;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {0}, l = {398}, m = "handleInstantDebitsCompletion", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1, reason: invalid class name and case insensitive filesystem */
    static final class C09821 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C09821(Continuation<? super C09821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsSheetNativeViewModel.this.handleInstantDebitsCompletion(null, this);
        }
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(FinancialConnectionsSheetNativeState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    public final FinancialConnectionsSheetNativeComponent getActivityRetainedComponent() {
        return this.activityRetainedComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public FinancialConnectionsSheetNativeViewModel(FinancialConnectionsSheetNativeComponent activityRetainedComponent, SavedStateHandle savedStateHandle, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, UriUtils uriUtils, CompleteFinancialConnectionsSession completeFinancialConnectionsSession, CreateInstantDebitsResult createInstantDebitsResult, FinancialConnectionsAnalyticsTracker eventTracker, Logger logger, NavigationManager navigationManager, @Named(NamedConstantsKt.APPLICATION_ID) String applicationId, final FinancialConnectionsSheetNativeState initialState) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(activityRetainedComponent, "activityRetainedComponent");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(uriUtils, "uriUtils");
        Intrinsics.checkNotNullParameter(completeFinancialConnectionsSession, "completeFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(createInstantDebitsResult, "createInstantDebitsResult");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.activityRetainedComponent = activityRetainedComponent;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.uriUtils = uriUtils;
        this.completeFinancialConnectionsSession = completeFinancialConnectionsSession;
        this.createInstantDebitsResult = createInstantDebitsResult;
        this.eventTracker = eventTracker;
        this.logger = logger;
        this.navigationManager = navigationManager;
        this.applicationId = applicationId;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.navigationFlow = navigationManager.getNavigationFlow();
        this.defaultTopAppBarState = LazyKt.lazy(new Function0() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinancialConnectionsSheetNativeViewModel.defaultTopAppBarState_delegate$lambda$0(initialState);
            }
        });
        MutableStateFlow<FinancialConnectionsSessionManifest.Pane> MutableStateFlow = StateFlowKt.MutableStateFlow(initialState.getInitialPane());
        this.currentPane = MutableStateFlow;
        MutableStateFlow<Map<FinancialConnectionsSessionManifest.Pane, TopAppBarState>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(MapsKt.mapOf(TuplesKt.to(initialState.getInitialPane(), getDefaultTopAppBarState())));
        this.topAppBarStateUpdatesByPane = MutableStateFlow2;
        Flow flow = FlowsKt.get(MutableStateFlow2, MutableStateFlow);
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = this;
        this.topAppBarState = FlowKt.stateIn(flow, ViewModelKt.getViewModelScope(financialConnectionsSheetNativeViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), getDefaultTopAppBarState());
        registerSavedStateProvider(savedStateHandle);
        setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetNativeViewModel._init_$lambda$1((FinancialConnectionsSheetNativeState) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsSheetNativeViewModel), null, null, new AnonymousClass2(null), 3, null);
    }

    public final SharedFlow<NavigationIntent> getNavigationFlow() {
        return this.navigationFlow;
    }

    private final TopAppBarState getDefaultTopAppBarState() {
        return (TopAppBarState) this.defaultTopAppBarState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TopAppBarState defaultTopAppBarState_delegate$lambda$0(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
        return FinancialConnectionsSheetNativeViewModelKt.toTopAppBarState(financialConnectionsSheetNativeState, true);
    }

    public final StateFlow<TopAppBarState> getTopAppBarState() {
        return this.topAppBarState;
    }

    /* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$2", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetNativeViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$2$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ FinancialConnectionsSheetNativeViewModel this$0;

            AnonymousClass1(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel) {
                this.this$0 = financialConnectionsSheetNativeViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((NativeAuthFlowCoordinator.Message) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(NativeAuthFlowCoordinator.Message message, Continuation<? super Unit> continuation) {
                if (Intrinsics.areEqual(message, NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE)) {
                    this.this$0.setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FinancialConnectionsSheetNativeViewModel.AnonymousClass2.AnonymousClass1.emit$lambda$0((FinancialConnectionsSheetNativeState) obj);
                        }
                    });
                } else if (message instanceof NativeAuthFlowCoordinator.Message.Complete) {
                    FinancialConnectionsSheetNativeViewModel.closeAuthFlow$default(this.this$0, ((NativeAuthFlowCoordinator.Message.Complete) message).getCause(), null, 2, null);
                } else if (message instanceof NativeAuthFlowCoordinator.Message.CloseWithError) {
                    FinancialConnectionsSheetNativeViewModel.closeAuthFlow$default(this.this$0, null, ((NativeAuthFlowCoordinator.Message.CloseWithError) message).getCause(), 1, null);
                } else if (message instanceof NativeAuthFlowCoordinator.Message.UpdateTopAppBar) {
                    this.this$0.updateTopAppBarState(((NativeAuthFlowCoordinator.Message.UpdateTopAppBar) message).getUpdate());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final FinancialConnectionsSheetNativeState emit$lambda$0(FinancialConnectionsSheetNativeState setState) {
                Intrinsics.checkNotNullParameter(setState, "$this$setState");
                return FinancialConnectionsSheetNativeState.copy$default(setState, null, WebAuthFlowState.Uninitialized.INSTANCE, false, null, false, false, null, false, null, null, false, false, null, 8189, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FinancialConnectionsSheetNativeViewModel.this.nativeAuthFlowCoordinator.invoke().collect(new AnonymousClass1(FinancialConnectionsSheetNativeViewModel.this), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetNativeState _init_$lambda$1(FinancialConnectionsSheetNativeState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetNativeState.copy$default(setState, null, null, false, null, false, false, null, false, null, null, false, false, null, 8187, null);
    }

    private final void registerSavedStateProvider(SavedStateHandle savedStateHandle) {
        savedStateHandle.setSavedStateProvider(FinancialConnectionsSheetNativeState.KEY_SAVED_STATE, new SavedStateRegistry.SavedStateProvider() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda6
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return FinancialConnectionsSheetNativeViewModel.registerSavedStateProvider$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle registerSavedStateProvider$lambda$3(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel) {
        FinancialConnectionsSheetNativeState value = financialConnectionsSheetNativeViewModel.getStateFlow().getValue();
        Bundle bundle = new Bundle();
        bundle.putParcelable(FinancialConnectionsSheetNativeState.KEY_WEB_AUTH_FLOW, value.getWebAuthFlow());
        bundle.putBoolean(FinancialConnectionsSheetNativeState.KEY_FIRST_INIT, value.getFirstInit());
        return bundle;
    }

    /* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {0, 1}, l = {652, 176}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C09831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Intent $intent;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09831(Intent intent, Continuation<? super C09831> continuation) {
            super(2, continuation);
            this.$intent = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetNativeViewModel.this.new C09831(this.$intent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            Intent intent;
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel;
            Mutex mutex2;
            Throwable th;
            final String string;
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel2;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = FinancialConnectionsSheetNativeViewModel.this.mutex;
                intent = this.$intent;
                financialConnectionsSheetNativeViewModel = FinancialConnectionsSheetNativeViewModel.this;
                this.L$0 = mutex;
                this.L$1 = intent;
                this.L$2 = financialConnectionsSheetNativeViewModel;
                this.label = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                financialConnectionsSheetNativeViewModel2 = (FinancialConnectionsSheetNativeViewModel) this.L$2;
                str = (String) this.L$1;
                mutex2 = (Mutex) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    financialConnectionsSheetNativeViewModel2.onUrlReceived(str, (String) obj);
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) this.L$2;
            intent = (Intent) this.L$1;
            Mutex mutex3 = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex3;
            if (intent != null) {
                try {
                    Uri data = intent.getData();
                    if (data == null || (string = data.toString()) == null) {
                        string = "";
                    }
                    if (StringsKt.contains((CharSequence) string, (CharSequence) "authentication_return", true)) {
                        UriUtils uriUtils = financialConnectionsSheetNativeViewModel.uriUtils;
                        this.L$0 = mutex;
                        this.L$1 = string;
                        this.L$2 = financialConnectionsSheetNativeViewModel;
                        this.label = 2;
                        Object queryParameterFromFragment = uriUtils.getQueryParameterFromFragment(string, "code", this);
                        if (queryParameterFromFragment != coroutine_suspended) {
                            mutex2 = mutex;
                            obj = queryParameterFromFragment;
                            financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel;
                            str = string;
                            financialConnectionsSheetNativeViewModel2.onUrlReceived(str, (String) obj);
                        }
                        return coroutine_suspended;
                    }
                    if (financialConnectionsSheetNativeViewModel.uriUtils.compareSchemeAuthorityAndPath(string, FinancialConnectionsSheetNativeViewModel.INSTANCE.baseUrl(financialConnectionsSheetNativeViewModel.applicationId))) {
                        financialConnectionsSheetNativeViewModel.onUrlReceived(string, financialConnectionsSheetNativeViewModel.uriUtils.getQueryParameter(string, "status"));
                    } else {
                        financialConnectionsSheetNativeViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return FinancialConnectionsSheetNativeViewModel.C09831.invokeSuspend$lambda$1$lambda$0(string, (FinancialConnectionsSheetNativeState) obj2);
                            }
                        });
                    }
                    mutex2 = mutex;
                } catch (Throwable th3) {
                    mutex2 = mutex;
                    th = th3;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            mutex2.unlock(null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FinancialConnectionsSheetNativeState invokeSuspend$lambda$1$lambda$0(String str, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
            return FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState, null, new WebAuthFlowState.Canceled(str), false, null, false, false, null, false, null, null, false, false, null, 8189, null);
        }
    }

    public final Job handleOnNewIntent(Intent intent) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09831(intent, null), 3, null);
    }

    public final void handleOnCloseClick() {
        FinancialConnectionsSessionManifest.Pane value = this.currentPane.getValue();
        TopAppBarState value2 = this.topAppBarState.getValue();
        if (value2.getError() != null) {
            onCloseFromErrorClick(value2.getError());
        } else if (value2.getCanCloseWithoutConfirmation()) {
            onCloseNoConfirmationClick(value);
        } else {
            onCloseWithConfirmationClick(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUrlReceived(final String receivedUrl, String status) {
        if (Intrinsics.areEqual(status, "success")) {
            setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinancialConnectionsSheetNativeViewModel.onUrlReceived$lambda$4(receivedUrl, (FinancialConnectionsSheetNativeState) obj);
                }
            });
        } else if (Intrinsics.areEqual(status, "failure")) {
            final String queryParameter = this.uriUtils.getQueryParameter(receivedUrl, PARAM_ERROR_REASON);
            setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinancialConnectionsSheetNativeViewModel.onUrlReceived$lambda$5(receivedUrl, queryParameter, (FinancialConnectionsSheetNativeState) obj);
                }
            });
        } else {
            setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinancialConnectionsSheetNativeViewModel.onUrlReceived$lambda$6(receivedUrl, (FinancialConnectionsSheetNativeState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetNativeState onUrlReceived$lambda$4(String str, FinancialConnectionsSheetNativeState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetNativeState.copy$default(setState, null, new WebAuthFlowState.Success(str), false, null, false, false, null, false, null, null, false, false, null, 8189, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetNativeState onUrlReceived$lambda$5(String str, String str2, FinancialConnectionsSheetNativeState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetNativeState.copy$default(setState, null, new WebAuthFlowState.Failed(str, "Received return_url with failed status: " + str, str2), false, null, false, false, null, false, null, null, false, false, null, 8189, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetNativeState onUrlReceived$lambda$6(String str, FinancialConnectionsSheetNativeState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetNativeState.copy$default(setState, null, new WebAuthFlowState.Canceled(str), false, null, false, false, null, false, null, null, false, false, null, 8189, null);
    }

    /* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onResume$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {0}, l = {652}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onResume$1, reason: invalid class name and case insensitive filesystem */
    static final class C09881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C09881(Continuation<? super C09881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetNativeViewModel.this.new C09881(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = FinancialConnectionsSheetNativeViewModel.this.mutex;
                FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel2 = FinancialConnectionsSheetNativeViewModel.this;
                this.L$0 = mutex;
                this.L$1 = financialConnectionsSheetNativeViewModel2;
                this.label = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                financialConnectionsSheetNativeViewModel = financialConnectionsSheetNativeViewModel2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) this.L$1;
                mutex = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            try {
                if (financialConnectionsSheetNativeViewModel.getStateFlow().getValue().getWebAuthFlow() instanceof WebAuthFlowState.InProgress) {
                    financialConnectionsSheetNativeViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onResume$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return FinancialConnectionsSheetNativeViewModel.C09881.invokeSuspend$lambda$1$lambda$0((FinancialConnectionsSheetNativeState) obj2);
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FinancialConnectionsSheetNativeState invokeSuspend$lambda$1$lambda$0(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
            return FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState, null, new WebAuthFlowState.Canceled(null), false, null, false, false, null, false, null, null, false, false, null, 8189, null);
        }
    }

    public final Job onResume() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09881(null), 3, null);
    }

    public final void openPartnerAuthFlowInBrowser(final String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetNativeViewModel.openPartnerAuthFlowInBrowser$lambda$7(url, (FinancialConnectionsSheetNativeState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetNativeState openPartnerAuthFlowInBrowser$lambda$7(String str, FinancialConnectionsSheetNativeState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetNativeState.copy$default(setState, null, WebAuthFlowState.InProgress.INSTANCE, false, null, false, false, new FinancialConnectionsSheetNativeViewEffect.OpenUrl(str), false, null, null, false, false, null, 8125, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetNativeState onViewEffectLaunched$lambda$8(FinancialConnectionsSheetNativeState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetNativeState.copy$default(setState, null, null, false, null, false, false, null, false, null, null, false, false, null, 8127, null);
    }

    public final void onViewEffectLaunched() {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetNativeViewModel.onViewEffectLaunched$lambda$8((FinancialConnectionsSheetNativeState) obj);
            }
        });
    }

    /* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onCloseWithConfirmationClick$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onCloseWithConfirmationClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSessionManifest.Pane $pane;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09861(FinancialConnectionsSessionManifest.Pane pane, Continuation<? super C09861> continuation) {
            super(2, continuation);
            this.$pane = pane;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetNativeViewModel.this.new C09861(this.$pane, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsSheetNativeViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.ClickNavBarClose(this.$pane));
                NavigationManager.DefaultImpls.tryNavigateTo$default(FinancialConnectionsSheetNativeViewModel.this.navigationManager, Destination.invoke$default(Destination.Exit.INSTANCE, this.$pane, null, 2, null), null, false, 6, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final Job onCloseWithConfirmationClick(FinancialConnectionsSessionManifest.Pane pane) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09861(pane, null), 3, null);
    }

    /* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onBackClick$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onBackClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSessionManifest.Pane $pane;
        int label;
        final /* synthetic */ FinancialConnectionsSheetNativeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09841(FinancialConnectionsSessionManifest.Pane pane, FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, Continuation<? super C09841> continuation) {
            super(2, continuation);
            this.$pane = pane;
            this.this$0 = financialConnectionsSheetNativeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09841(this.$pane, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsSessionManifest.Pane pane = this.$pane;
            if (pane != null) {
                this.this$0.eventTracker.track(new FinancialConnectionsAnalyticsEvent.ClickNavBarBack(pane));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onBackClick(FinancialConnectionsSessionManifest.Pane pane) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09841(pane, this, null), 3, null);
    }

    /* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onCloseNoConfirmationClick$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onCloseNoConfirmationClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSessionManifest.Pane $pane;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09851(FinancialConnectionsSessionManifest.Pane pane, Continuation<? super C09851> continuation) {
            super(2, continuation);
            this.$pane = pane;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetNativeViewModel.this.new C09851(this.$pane, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsSheetNativeViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.ClickNavBarClose(this.$pane));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void onCloseNoConfirmationClick(FinancialConnectionsSessionManifest.Pane pane) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09851(pane, null), 3, null);
        closeAuthFlow$default(this, null, null, 1, null);
    }

    public final void onCloseFromErrorClick(Throwable error) {
        StripeException stripeException;
        Intrinsics.checkNotNullParameter(error, "error");
        FinancialConnectionsError financialConnectionsError = error instanceof FinancialConnectionsError ? (FinancialConnectionsError) error : null;
        if (financialConnectionsError != null && (stripeException = financialConnectionsError.getStripeException()) != null) {
            error = stripeException;
        }
        closeAuthFlow$default(this, null, error, 1, null);
    }

    public final void onBackPressed() {
        closeAuthFlow$default(this, null, null, 1, null);
    }

    static /* synthetic */ Job closeAuthFlow$default(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            earlyTerminationCause = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return financialConnectionsSheetNativeViewModel.closeAuthFlow(earlyTerminationCause, th);
    }

    /* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {0, 0, 1, 1, 2}, l = {652, 322, 345}, m = "invokeSuspend", n = {"$this$launch", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", ServerProtocol.DIALOG_PARAM_STATE, "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$3", "L$0"})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Throwable $closeAuthFlowError;
        final /* synthetic */ NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause $earlyTerminationCause;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Throwable th, NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$closeAuthFlowError = th;
            this.$earlyTerminationCause = earlyTerminationCause;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = FinancialConnectionsSheetNativeViewModel.this.new AnonymousClass1(this.$closeAuthFlowError, this.$earlyTerminationCause, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x0158, code lost:
        
            if (r7.handleInstantDebitsCompletion(r10, r18) == r0) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0123 A[Catch: all -> 0x0182, TryCatch #0 {all -> 0x0182, blocks: (B:37:0x00e7, B:39:0x0123, B:40:0x013c, B:42:0x0142, B:44:0x014a, B:47:0x015b, B:49:0x0161, B:50:0x016c, B:34:0x00ce), top: B:69:0x00ce }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x013c A[Catch: all -> 0x0182, TryCatch #0 {all -> 0x0182, blocks: (B:37:0x00e7, B:39:0x0123, B:40:0x013c, B:42:0x0142, B:44:0x014a, B:47:0x015b, B:49:0x0161, B:50:0x016c, B:34:0x00ce), top: B:69:0x00ce }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0194 A[Catch: all -> 0x01ce, TryCatch #3 {all -> 0x01ce, blocks: (B:57:0x018e, B:59:0x0194, B:62:0x01be, B:63:0x01c6, B:56:0x0184, B:24:0x009c, B:26:0x00ac, B:29:0x00b2, B:31:0x00be), top: B:74:0x009c }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause;
            Mutex mutex;
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel;
            Throwable th;
            FinancialConnectionsSheetNativeState value;
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel2;
            Object objInvoke;
            FinancialConnectionsSession session;
            Object objM9118constructorimpl;
            Throwable thM9121exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Mutex mutex2 = FinancialConnectionsSheetNativeViewModel.this.mutex;
                    FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel3 = FinancialConnectionsSheetNativeViewModel.this;
                    Throwable th2 = this.$closeAuthFlowError;
                    earlyTerminationCause = this.$earlyTerminationCause;
                    this.L$0 = coroutineScope;
                    this.L$1 = mutex2;
                    this.L$2 = financialConnectionsSheetNativeViewModel3;
                    this.L$3 = th2;
                    this.L$4 = earlyTerminationCause;
                    this.label = 1;
                    if (mutex2.lock(null, this) != coroutine_suspended) {
                        mutex = mutex2;
                        financialConnectionsSheetNativeViewModel = financialConnectionsSheetNativeViewModel3;
                        th = th2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) this.L$2;
                        financialConnectionsSheetNativeViewModel2 = (FinancialConnectionsSheetNativeViewModel) this.L$1;
                        mutex = (Mutex) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th3) {
                            th = th3;
                            Result.Companion companion = Result.INSTANCE;
                            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                            if (thM9121exceptionOrNullimpl != null) {
                            }
                            Unit unit = Unit.INSTANCE;
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        }
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl != null) {
                            financialConnectionsSheetNativeViewModel2.logger.error("Error completing session before closing", thM9121exceptionOrNullimpl);
                            financialConnectionsSheetNativeViewModel2.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Complete((FinancialConnectionsSessionManifest.Pane) financialConnectionsSheetNativeViewModel2.currentPane.getValue(), thM9121exceptionOrNullimpl, "Error completing session before closing", null, "failed"));
                            if (th == null) {
                                th = thM9121exceptionOrNullimpl;
                            }
                            financialConnectionsSheetNativeViewModel2.finishWithResult(new FinancialConnectionsSheetActivityResult.Failed(th));
                        }
                        Unit unit2 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    }
                    FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) this.L$3;
                    Throwable th4 = (Throwable) this.L$2;
                    financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) this.L$1;
                    Mutex mutex3 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        value = financialConnectionsSheetNativeState;
                        th = th4;
                        mutex = mutex3;
                        objInvoke = obj;
                        CompleteFinancialConnectionsSession.Result result = (CompleteFinancialConnectionsSession.Result) objInvoke;
                        session = result.getSession();
                        financialConnectionsSheetNativeViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Complete((FinancialConnectionsSessionManifest.Pane) financialConnectionsSheetNativeViewModel.currentPane.getValue(), null, null, Boxing.boxInt(session.getAccounts().getData().size()), result.getStatus()));
                        if (!CustomManualEntryKt.isCustomManualEntryError(session)) {
                            FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.MANUAL_ENTRY_INITIATED, null, 2, null);
                            financialConnectionsSheetNativeViewModel.finishWithResult(new FinancialConnectionsSheetActivityResult.Failed(new CustomManualEntryRequiredError()));
                        } else if (financialConnectionsSheetNativeViewModel.hasAValidAccount(session)) {
                            if (value.getFlowType() == FinancialConnectionsSheetFlowType.ForInstantDebits) {
                                this.L$0 = mutex;
                                this.L$1 = financialConnectionsSheetNativeViewModel;
                                this.L$2 = th;
                                this.L$3 = null;
                                this.label = 3;
                            } else {
                                financialConnectionsSheetNativeViewModel.handleFinancialConnectionsCompletion(session);
                            }
                        } else if (th != null) {
                            financialConnectionsSheetNativeViewModel.finishWithResult(new FinancialConnectionsSheetActivityResult.Failed(th));
                        } else {
                            FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.CANCEL, null, 2, null);
                            financialConnectionsSheetNativeViewModel.finishWithResult(FinancialConnectionsSheetActivityResult.Canceled.INSTANCE);
                        }
                        financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel;
                        objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th5) {
                        th = th5;
                        th = th4;
                        financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel;
                        mutex = mutex3;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl != null) {
                        }
                        Unit unit22 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    }
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    Unit unit222 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
                NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause2 = (NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause) this.L$4;
                Throwable th6 = (Throwable) this.L$3;
                financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) this.L$2;
                Mutex mutex4 = (Mutex) this.L$1;
                ResultKt.throwOnFailure(obj);
                earlyTerminationCause = earlyTerminationCause2;
                th = th6;
                mutex = mutex4;
                value = financialConnectionsSheetNativeViewModel.getStateFlow().getValue();
                if (value.getCompleted()) {
                    return Unit.INSTANCE;
                }
                financialConnectionsSheetNativeViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return FinancialConnectionsSheetNativeViewModel.AnonymousClass1.invokeSuspend$lambda$3$lambda$0((FinancialConnectionsSheetNativeState) obj2);
                    }
                });
                if (th instanceof FinancialConnectionsAttestationError) {
                    financialConnectionsSheetNativeViewModel.finishWithResult(new FinancialConnectionsSheetActivityResult.Failed(th));
                    return Unit.INSTANCE;
                }
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    CompleteFinancialConnectionsSession completeFinancialConnectionsSession = financialConnectionsSheetNativeViewModel.completeFinancialConnectionsSession;
                    this.L$0 = mutex;
                    this.L$1 = financialConnectionsSheetNativeViewModel;
                    this.L$2 = th;
                    this.L$3 = value;
                    this.L$4 = null;
                    this.label = 2;
                    objInvoke = completeFinancialConnectionsSession.invoke(earlyTerminationCause, th, this);
                } catch (Throwable th7) {
                    th = th7;
                    financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    Unit unit2222 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
                if (objInvoke != coroutine_suspended) {
                    CompleteFinancialConnectionsSession.Result result2 = (CompleteFinancialConnectionsSession.Result) objInvoke;
                    session = result2.getSession();
                    financialConnectionsSheetNativeViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Complete((FinancialConnectionsSessionManifest.Pane) financialConnectionsSheetNativeViewModel.currentPane.getValue(), null, null, Boxing.boxInt(session.getAccounts().getData().size()), result2.getStatus()));
                    if (!CustomManualEntryKt.isCustomManualEntryError(session)) {
                    }
                    financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel;
                    objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    Unit unit22222 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } finally {
                mutex.unlock(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FinancialConnectionsSheetNativeState invokeSuspend$lambda$3$lambda$0(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
            return FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState, null, null, false, null, false, false, null, true, null, null, false, false, null, 8063, null);
        }
    }

    private final Job closeAuthFlow(NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause, Throwable closeAuthFlowError) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(closeAuthFlowError, earlyTerminationCause, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFinancialConnectionsCompletion(FinancialConnectionsSession session) {
        FinancialConnections.INSTANCE.m7282emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.SUCCESS, new FinancialConnectionsEvent.Metadata(null, Boolean.valueOf(session.getPaymentAccount() instanceof BankAccount), null, 5, null));
        FinancialConnectionsSession financialConnectionsSessionUpdate = FinancialConnectionsSessionExtensionsKt.update(session, getStateFlow().getValue().getManualEntryUsesMicrodeposits());
        finishWithResult(new FinancialConnectionsSheetActivityResult.Completed(null, financialConnectionsSessionUpdate, financialConnectionsSessionUpdate.getParsedToken(), 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleInstantDebitsCompletion(FinancialConnectionsSession financialConnectionsSession, Continuation<? super Unit> continuation) {
        C09821 c09821;
        InstantDebitsResult instantDebitsResult;
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel;
        InstantDebitsResult instantDebitsResult2;
        FinancialConnectionsSheetActivityResult.Failed failed;
        if (continuation instanceof C09821) {
            c09821 = (C09821) continuation;
            if ((c09821.label & Integer.MIN_VALUE) != 0) {
                c09821.label -= Integer.MIN_VALUE;
            } else {
                c09821 = new C09821(continuation);
            }
        }
        Object objInvoke = c09821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c09821.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            PaymentAccount paymentAccount = financialConnectionsSession.getPaymentAccount();
            if (paymentAccount != null) {
                CreateInstantDebitsResult createInstantDebitsResult = this.createInstantDebitsResult;
                String id = paymentAccount.getId();
                c09821.L$0 = this;
                c09821.label = 1;
                objInvoke = createInstantDebitsResult.invoke(id, c09821);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                financialConnectionsSheetNativeViewModel = this;
            } else {
                instantDebitsResult = null;
                financialConnectionsSheetNativeViewModel = this;
                instantDebitsResult2 = instantDebitsResult;
                if (instantDebitsResult2 == null) {
                    failed = new FinancialConnectionsSheetActivityResult.Completed(instantDebitsResult2, null, null, 6, null);
                } else {
                    failed = new FinancialConnectionsSheetActivityResult.Failed(new UnclassifiedError("InstantDebitsCompletionError", "Unable to complete Instant Debits flow due to missing PaymentAccount"));
                }
                financialConnectionsSheetNativeViewModel.finishWithResult(failed);
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) c09821.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        instantDebitsResult = (InstantDebitsResult) objInvoke;
        instantDebitsResult2 = instantDebitsResult;
        if (instantDebitsResult2 == null) {
        }
        financialConnectionsSheetNativeViewModel.finishWithResult(failed);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(final FinancialConnectionsSheetActivityResult result) {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetNativeViewModel.finishWithResult$lambda$10(result, (FinancialConnectionsSheetNativeState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetNativeState finishWithResult$lambda$10(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult, FinancialConnectionsSheetNativeState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetNativeState.copy$default(setState, null, null, false, null, false, false, new FinancialConnectionsSheetNativeViewEffect.Finish(financialConnectionsSheetActivityResult), false, null, null, false, false, null, 8127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasAValidAccount(FinancialConnectionsSession financialConnectionsSession) {
        return (financialConnectionsSession.getAccounts().getData().isEmpty() && financialConnectionsSession.getPaymentAccount() == null && financialConnectionsSession.getBankAccountToken() == null) ? false : true;
    }

    /* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onPaneLaunched$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onPaneLaunched$1, reason: invalid class name and case insensitive filesystem */
    static final class C09871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSessionManifest.Pane $pane;
        final /* synthetic */ FinancialConnectionsSessionManifest.Pane $referrer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09871(FinancialConnectionsSessionManifest.Pane pane, FinancialConnectionsSessionManifest.Pane pane2, Continuation<? super C09871> continuation) {
            super(2, continuation);
            this.$pane = pane;
            this.$referrer = pane2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetNativeViewModel.this.new C09871(this.$pane, this.$referrer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsSheetNativeViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLaunched(this.$pane, this.$referrer));
            return Unit.INSTANCE;
        }
    }

    public final void onPaneLaunched(FinancialConnectionsSessionManifest.Pane pane, FinancialConnectionsSessionManifest.Pane referrer) {
        Intrinsics.checkNotNullParameter(pane, "pane");
        if (DestinationMappersKt.getDestination(pane).getLogPaneLaunched()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09871(pane, referrer, null), 3, null);
        }
    }

    public final void onBackgrounded() {
        trackBackgroundStateChanged(true);
    }

    public final void onForegrounded() {
        trackBackgroundStateChanged(false);
    }

    private final void trackBackgroundStateChanged(boolean backgrounded) {
        this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AppBackgrounded(this.currentPane.getValue(), backgrounded));
    }

    @Override // com.stripe.android.financialconnections.navigation.topappbar.TopAppBarHost
    public void updateTopAppBarElevation(final boolean isElevated) {
        FlowsKt.updateWithNewEntry(this.topAppBarStateUpdatesByPane, this.currentPane.getValue(), new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetNativeViewModel.updateTopAppBarElevation$lambda$11(isElevated, (TopAppBarState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TopAppBarState updateTopAppBarElevation$lambda$11(boolean z, TopAppBarState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return TopAppBarState.copy$default(it, false, false, false, null, false, false, z, null, false, 447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTopAppBarState(TopAppBarStateUpdate update) {
        if (update != null) {
            FlowsKt.updateWithNewEntry(this.topAppBarStateUpdatesByPane, TuplesKt.to(update.getPane(), getDefaultTopAppBarState().apply(update)));
        }
    }

    public final void handlePaneChanged(FinancialConnectionsSessionManifest.Pane pane) {
        Intrinsics.checkNotNullParameter(pane, "pane");
        this.currentPane.setValue(pane);
    }

    /* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;", "", "<init>", "()V", "baseUrl", "", NamedConstantsKt.APPLICATION_ID, "PARAM_STATUS", "PARAM_CODE", "PARAM_ERROR_REASON", "STATUS_SUCCESS", "STATUS_FAILURE", "Factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String baseUrl(String applicationId) {
            return "stripe://auth-redirect/" + applicationId;
        }

        public final ViewModelProvider.Factory getFactory() {
            return FinancialConnectionsSheetNativeViewModel.Factory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetNativeViewModel Factory$lambda$14$lambda$13(CreationExtras initializer) {
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(initializer);
        Object obj = initializer.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) obj;
        FinancialConnectionsSheetNativeActivityArgs args = FinancialConnectionsSheetNativeActivity.INSTANCE.getArgs(savedStateHandleCreateSavedStateHandle);
        if (args == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState = new FinancialConnectionsSheetNativeState(args, (Bundle) savedStateHandleCreateSavedStateHandle.get(FinancialConnectionsSheetNativeState.KEY_SAVED_STATE));
        FinancialConnectionsSheetNativeComponent.Builder builder = DaggerFinancialConnectionsSheetNativeComponent.builder();
        SynchronizeSessionResponse initialSyncResponse = args.getInitialSyncResponse();
        if (!financialConnectionsSheetNativeState.getFirstInit()) {
            initialSyncResponse = null;
        }
        return builder.initialSyncResponse(initialSyncResponse).application(application).configuration(financialConnectionsSheetNativeState.getConfiguration()).sharedComponent(FinancialConnectionsSingletonSharedComponentHolder.INSTANCE.getComponent(application)).savedStateHandle(savedStateHandleCreateSavedStateHandle).initialState(financialConnectionsSheetNativeState).build().getViewModel();
    }

    static {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(FinancialConnectionsSheetNativeViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetNativeViewModel.Factory$lambda$14$lambda$13((CreationExtras) obj);
            }
        });
        Factory = initializerViewModelFactoryBuilder.build();
    }
}
