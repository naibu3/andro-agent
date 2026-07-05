package com.stripe.android.financialconnections;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.savedstate.SavedStateRegistry;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.BaseJavaModule;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.browser.BrowserManager;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetComponent;
import com.stripe.android.financialconnections.di.FinancialConnectionsSingletonSharedComponentHolder;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.IntegrityVerdictManager;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.NativeAuthFlowRouter;
import com.stripe.android.financialconnections.exception.AppInitializationError;
import com.stripe.android.financialconnections.exception.CustomManualEntryRequiredError;
import com.stripe.android.financialconnections.features.error.FinancialConnectionsAttestationError;
import com.stripe.android.financialconnections.features.manualentry.CustomManualEntryKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgsKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.launcher.InstantDebitsResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionExtensionsKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.utils.HostedAuthUrlBuilder;
import com.stripe.android.financialconnections.utils.InstantDebitsResultBuilder;
import com.stripe.android.model.Token;
import com.stripe.attestation.IntegrityRequestManager;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: FinancialConnectionsSheetViewModel.kt */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \\2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002[\\B\u0085\u0001\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\f\u0010$\u001a\u00020%*\u00020\u0006H\u0002J\b\u0010&\u001a\u00020%H\u0002J\u000e\u0010'\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020%H\u0002J\r\u0010.\u001a\u00020%H\u0000¢\u0006\u0002\b/J\u0006\u00100\u001a\u00020%J\r\u00101\u001a\u00020%H\u0000¢\u0006\u0002\b2J\r\u00103\u001a\u00020%H\u0000¢\u0006\u0002\b4J\u0015\u00105\u001a\u00020%2\u0006\u00106\u001a\u000207H\u0000¢\u0006\u0002\b8J\u0010\u0010\r\u001a\u00020%2\u0006\u00109\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020%2\u0006\u00109\u001a\u00020\u0002H\u0002J\u0010\u0010:\u001a\u00020%2\u0006\u00109\u001a\u00020\u0002H\u0002J\u0017\u0010;\u001a\u00020%2\b\u0010<\u001a\u0004\u0018\u00010=H\u0000¢\u0006\u0002\b>J\u0010\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u0004H\u0002J\u0010\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020CH\u0002J\u001a\u0010D\u001a\u00020%2\u0006\u00109\u001a\u00020\u00022\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u0010\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020CH\u0002J\u0010\u0010G\u001a\u00020%2\u0006\u00109\u001a\u00020\u0002H\u0002J\r\u0010H\u001a\u00020%H\u0000¢\u0006\u0002\bIJ\u000e\u0010J\u001a\u0004\u0018\u00010C*\u00020\u0004H\u0002J+\u0010K\u001a\u00020%2\u0006\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2\n\b\u0003\u0010P\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0002\u0010RJ\u0010\u0010S\u001a\u00020%2\u0006\u0010L\u001a\u00020MH\u0002J\u0012\u0010T\u001a\u00020%2\b\u0010U\u001a\u0004\u0018\u00010VH\u0002J\u001a\u0010T\u001a\u00020%2\u0006\u0010W\u001a\u00020X2\b\u0010U\u001a\u0004\u0018\u00010VH\u0002J\u0012\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u00109\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", NamedConstantsKt.APPLICATION_ID, "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "integrityRequestManager", "Lcom/stripe/attestation/IntegrityRequestManager;", "integrityVerdictManager", "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;", "fetchFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;", "fetchFinancialConnectionsSessionForToken", "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;", "logger", "Lcom/stripe/android/core/Logger;", "browserManager", "Lcom/stripe/android/financialconnections/browser/BrowserManager;", "eventReporter", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;", "analyticsTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "nativeRouter", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "initialState", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/browser/BrowserManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlinx/coroutines/CoroutineDispatcher;)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "registerSavedStateProvider", "", "initAuthFlow", "prepareStandardRequestManager", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openAuthFlow", BaseJavaModule.METHOD_TYPE_SYNC, "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "logNoBrowserAvailableAndFinish", "onActivityRecreated", "onActivityRecreated$financial_connections_release", "onDismissed", "onResume", "onResume$financial_connections_release", "onBrowserActivityResult", "onBrowserActivityResult$financial_connections_release", "onNativeAuthFlowResult", "activityResult", "Landroidx/activity/result/ActivityResult;", "onNativeAuthFlowResult$financial_connections_release", ServerProtocol.DIALOG_PARAM_STATE, "onUserCancel", "handleOnNewIntent", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "handleOnNewIntent$financial_connections_release", "onStartApp2App", "unwrappedUriString", "onFinishApp2App", "receivedUrl", "Landroid/net/Uri;", "onFlowSuccess", "onSuccessFromInstantDebits", "url", "onFlowCancelled", "onViewEffectLaunched", "onViewEffectLaunched$financial_connections_release", "toUriOrNull", "finishWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "fromNative", "", "finishMessage", "", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;ZLjava/lang/Integer;)V", "reportResult", "switchToWebFlow", "prefillDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", "AttestationInitResult", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetViewModel extends FinancialConnectionsViewModel<FinancialConnectionsSheetState> {
    private static final ViewModelProvider.Factory Factory;
    public static final int MAX_ACCOUNTS = 100;
    private final FinancialConnectionsAnalyticsTracker analyticsTracker;
    private final String applicationId;
    private final BrowserManager browserManager;
    private final FinancialConnectionsEventReporter eventReporter;
    private final FetchFinancialConnectionsSession fetchFinancialConnectionsSession;
    private final FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken;
    private final GetOrFetchSync getOrFetchSync;
    private final FinancialConnectionsSheetState initialState;
    private final IntegrityRequestManager integrityRequestManager;
    private final IntegrityVerdictManager integrityVerdictManager;
    private final CoroutineDispatcher ioDispatcher;
    private final Logger logger;
    private final Mutex mutex;
    private final NativeAuthFlowRouter nativeRouter;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FinancialConnectionsSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSheetFlowType.values().length];
            try {
                iArr[FinancialConnectionsSheetFlowType.ForData.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSheetFlowType.ForToken.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSheetFlowType.ForInstantDebits.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FinancialConnectionsSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel", f = "FinancialConnectionsSheetViewModel.kt", i = {}, l = {156}, m = "prepareStandardRequestManager", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1, reason: invalid class name and case insensitive filesystem */
    static final class C08541 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C08541(Continuation<? super C08541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsSheetViewModel.this.prepareStandardRequestManager(this);
        }
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(FinancialConnectionsSheetState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    public /* synthetic */ FinancialConnectionsSheetViewModel(String str, SavedStateHandle savedStateHandle, GetOrFetchSync getOrFetchSync, IntegrityRequestManager integrityRequestManager, IntegrityVerdictManager integrityVerdictManager, FetchFinancialConnectionsSession fetchFinancialConnectionsSession, FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken, Logger logger, BrowserManager browserManager, FinancialConnectionsEventReporter financialConnectionsEventReporter, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, NativeAuthFlowRouter nativeAuthFlowRouter, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsSheetState financialConnectionsSheetState, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, savedStateHandle, getOrFetchSync, integrityRequestManager, integrityVerdictManager, fetchFinancialConnectionsSession, fetchFinancialConnectionsSessionForToken, logger, browserManager, financialConnectionsEventReporter, financialConnectionsAnalyticsTracker, nativeAuthFlowRouter, nativeAuthFlowCoordinator, financialConnectionsSheetState, (i & 16384) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public FinancialConnectionsSheetViewModel(@Named(NamedConstantsKt.APPLICATION_ID) String applicationId, SavedStateHandle savedStateHandle, GetOrFetchSync getOrFetchSync, IntegrityRequestManager integrityRequestManager, IntegrityVerdictManager integrityVerdictManager, FetchFinancialConnectionsSession fetchFinancialConnectionsSession, FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken, Logger logger, BrowserManager browserManager, FinancialConnectionsEventReporter eventReporter, FinancialConnectionsAnalyticsTracker analyticsTracker, NativeAuthFlowRouter nativeRouter, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsSheetState initialState, CoroutineDispatcher ioDispatcher) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(integrityRequestManager, "integrityRequestManager");
        Intrinsics.checkNotNullParameter(integrityVerdictManager, "integrityVerdictManager");
        Intrinsics.checkNotNullParameter(fetchFinancialConnectionsSession, "fetchFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(fetchFinancialConnectionsSessionForToken, "fetchFinancialConnectionsSessionForToken");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(browserManager, "browserManager");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        Intrinsics.checkNotNullParameter(nativeRouter, "nativeRouter");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.applicationId = applicationId;
        this.getOrFetchSync = getOrFetchSync;
        this.integrityRequestManager = integrityRequestManager;
        this.integrityVerdictManager = integrityVerdictManager;
        this.fetchFinancialConnectionsSession = fetchFinancialConnectionsSession;
        this.fetchFinancialConnectionsSessionForToken = fetchFinancialConnectionsSessionForToken;
        this.logger = logger;
        this.browserManager = browserManager;
        this.eventReporter = eventReporter;
        this.analyticsTracker = analyticsTracker;
        this.nativeRouter = nativeRouter;
        this.initialState = initialState;
        this.ioDispatcher = ioDispatcher;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        registerSavedStateProvider(savedStateHandle);
        if (initialState.getInitialArgs().isValid()) {
            eventReporter.onPresented();
            if (initialState.getManifest() == null) {
                initAuthFlow();
                return;
            }
            return;
        }
        final FinancialConnectionsSheetActivityResult.Failed failed = new FinancialConnectionsSheetActivityResult.Failed(new IllegalStateException("Invalid configuration provided when instantiating activity"));
        setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetViewModel._init_$lambda$0(failed, (FinancialConnectionsSheetState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState _init_$lambda$0(FinancialConnectionsSheetActivityResult.Failed failed, FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetState.copy$default(setState, null, false, null, null, new FinancialConnectionsSheetViewEffect.FinishWithResult(failed, null, 2, null), 15, null);
    }

    private final void registerSavedStateProvider(SavedStateHandle savedStateHandle) {
        savedStateHandle.setSavedStateProvider(FinancialConnectionsSheetState.KEY_SAVED_STATE, new SavedStateRegistry.SavedStateProvider() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return FinancialConnectionsSheetViewModel.registerSavedStateProvider$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle registerSavedStateProvider$lambda$2(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel) {
        FinancialConnectionsSheetState value = financialConnectionsSheetViewModel.getStateFlow().getValue();
        Bundle bundle = new Bundle();
        bundle.putParcelable(FinancialConnectionsSheetState.KEY_MANIFEST, value.getManifest());
        bundle.putSerializable(FinancialConnectionsSheetState.KEY_WEB_AUTH_FLOW_STATUS, value.getWebAuthFlowStatus());
        return bundle;
    }

    /* compiled from: FinancialConnectionsSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$initAuthFlow$1", f = "FinancialConnectionsSheetViewModel.kt", i = {1}, l = {WebSocketProtocol.PAYLOAD_SHORT, 127}, m = "invokeSuspend", n = {"attestationInitResult"}, s = {"L$1"})
    /* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$initAuthFlow$1, reason: invalid class name and case insensitive filesystem */
    static final class C08521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C08521(Continuation<? super C08521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetViewModel.this.new C08521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: all -> 0x00a6, TryCatch #0 {all -> 0x00a6, blocks: (B:7:0x0016, B:23:0x005c, B:33:0x0094, B:34:0x009b, B:26:0x0070, B:28:0x0078, B:29:0x0080, B:31:0x0084, B:35:0x00a0, B:36:0x00a5, B:12:0x0026, B:19:0x003f, B:15:0x002f), top: B:47:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[Catch: all -> 0x00a6, TryCatch #0 {all -> 0x00a6, blocks: (B:7:0x0016, B:23:0x005c, B:33:0x0094, B:34:0x009b, B:26:0x0070, B:28:0x0078, B:29:0x0080, B:31:0x0084, B:35:0x00a0, B:36:0x00a5, B:12:0x0026, B:19:0x003f, B:15:0x002f), top: B:47:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            Throwable thM9121exceptionOrNullimpl;
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel;
            AttestationInitResult attestationInitResult;
            FinancialConnectionsAnalyticsEvent.AttestationInitFailed attestationInitFailed;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = FinancialConnectionsSheetViewModel.this;
                Result.Companion companion2 = Result.INSTANCE;
                this.L$0 = financialConnectionsSheetViewModel2;
                this.label = 1;
                Object objPrepareStandardRequestManager = financialConnectionsSheetViewModel2.prepareStandardRequestManager(this);
                if (objPrepareStandardRequestManager == coroutine_suspended) {
                    return coroutine_suspended;
                }
                financialConnectionsSheetViewModel = financialConnectionsSheetViewModel2;
                obj = objPrepareStandardRequestManager;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    attestationInitResult = (AttestationInitResult) this.L$1;
                    financialConnectionsSheetViewModel = (FinancialConnectionsSheetViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
                    FinancialConnectionsSessionManifest.Pane nextPane = synchronizeSessionResponse.getManifest().getNextPane();
                    if (!Intrinsics.areEqual(attestationInitResult, AttestationInitResult.Success.INSTANCE)) {
                        attestationInitFailed = null;
                    } else if (Intrinsics.areEqual(attestationInitResult, AttestationInitResult.Skipped.INSTANCE)) {
                        attestationInitFailed = new FinancialConnectionsAnalyticsEvent.AttestationInitSkipped(nextPane);
                    } else {
                        if (!(attestationInitResult instanceof AttestationInitResult.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        attestationInitFailed = new FinancialConnectionsAnalyticsEvent.AttestationInitFailed(nextPane, ((AttestationInitResult.Failure) attestationInitResult).getError());
                    }
                    if (attestationInitFailed != null) {
                        financialConnectionsSheetViewModel.analyticsTracker.track(attestationInitFailed);
                    }
                    objM9118constructorimpl = Result.m9118constructorimpl(synchronizeSessionResponse);
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel3 = FinancialConnectionsSheetViewModel.this;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                        FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel3, new FinancialConnectionsSheetActivityResult.Failed(thM9121exceptionOrNullimpl), false, null, 6, null);
                    }
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel4 = FinancialConnectionsSheetViewModel.this;
                    if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                        financialConnectionsSheetViewModel4.openAuthFlow((SynchronizeSessionResponse) objM9118constructorimpl);
                    }
                    return Unit.INSTANCE;
                }
                financialConnectionsSheetViewModel = (FinancialConnectionsSheetViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            AttestationInitResult attestationInitResult2 = (AttestationInitResult) obj;
            GetOrFetchSync getOrFetchSync = financialConnectionsSheetViewModel.getOrFetchSync;
            GetOrFetchSync.RefetchCondition.Always always = GetOrFetchSync.RefetchCondition.Always.INSTANCE;
            boolean supportsAppVerification = attestationInitResult2.getSupportsAppVerification();
            this.L$0 = financialConnectionsSheetViewModel;
            this.L$1 = attestationInitResult2;
            this.label = 2;
            Object objInvoke = getOrFetchSync.invoke(always, supportsAppVerification, this);
            if (objInvoke != coroutine_suspended) {
                attestationInitResult = attestationInitResult2;
                obj = objInvoke;
                SynchronizeSessionResponse synchronizeSessionResponse2 = (SynchronizeSessionResponse) obj;
                FinancialConnectionsSessionManifest.Pane nextPane2 = synchronizeSessionResponse2.getManifest().getNextPane();
                if (!Intrinsics.areEqual(attestationInitResult, AttestationInitResult.Success.INSTANCE)) {
                }
                if (attestationInitFailed != null) {
                }
                objM9118constructorimpl = Result.m9118constructorimpl(synchronizeSessionResponse2);
                FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel32 = FinancialConnectionsSheetViewModel.this;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel42 = FinancialConnectionsSheetViewModel.this;
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    private final void initAuthFlow() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08521(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object prepareStandardRequestManager(Continuation<? super AttestationInitResult> continuation) {
        C08541 c08541;
        Object objMo8934prepareIoAF18A;
        if (continuation instanceof C08541) {
            c08541 = (C08541) continuation;
            if ((c08541.label & Integer.MIN_VALUE) != 0) {
                c08541.label -= Integer.MIN_VALUE;
            } else {
                c08541 = new C08541(continuation);
            }
        }
        Object obj = c08541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08541.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.integrityVerdictManager.getVerdictFailed()) {
                return AttestationInitResult.Skipped.INSTANCE;
            }
            IntegrityRequestManager integrityRequestManager = this.integrityRequestManager;
            c08541.label = 1;
            objMo8934prepareIoAF18A = integrityRequestManager.mo8934prepareIoAF18A(c08541);
            if (objMo8934prepareIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8934prepareIoAF18A = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8934prepareIoAF18A);
        if (thM9121exceptionOrNullimpl == null) {
            return AttestationInitResult.Success.INSTANCE;
        }
        return new AttestationInitResult.Failure(thM9121exceptionOrNullimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openAuthFlow(final SynchronizeSessionResponse sync) {
        if (!this.browserManager.canOpenHttpsUrl()) {
            logNoBrowserAvailableAndFinish();
            return;
        }
        final FinancialConnectionsSessionManifest manifest = sync.getManifest();
        boolean zNativeAuthFlowEnabled = this.nativeRouter.nativeAuthFlowEnabled(manifest);
        this.nativeRouter.logExposure(manifest);
        final String strCreate$default = HostedAuthUrlBuilder.create$default(HostedAuthUrlBuilder.INSTANCE, this.initialState.getInitialArgs(), manifest.getHostedAuthUrl(), null, 4, null);
        if (strCreate$default == null) {
            finishWithResult$default(this, new FinancialConnectionsSheetActivityResult.Failed(new IllegalArgumentException("hostedAuthUrl is required!")), false, null, 6, null);
            return;
        }
        FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.OPEN, null, 2, null);
        if (zNativeAuthFlowEnabled) {
            setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinancialConnectionsSheetViewModel.openAuthFlow$lambda$5(manifest, sync, (FinancialConnectionsSheetState) obj);
                }
            });
        } else {
            FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.FLOW_LAUNCHED_IN_BROWSER, null, 2, null);
            setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinancialConnectionsSheetViewModel.openAuthFlow$lambda$6(manifest, strCreate$default, (FinancialConnectionsSheetState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState openAuthFlow$lambda$5(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, SynchronizeSessionResponse synchronizeSessionResponse, FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetState.copy$default(setState, null, false, financialConnectionsSessionManifest, FinancialConnectionsSheetState.AuthFlowStatus.NONE, new FinancialConnectionsSheetViewEffect.OpenNativeAuthFlow(FinancialConnectionsSheetActivityArgsKt.getFlowType(setState.getInitialArgs()), setState.getInitialArgs().getConfiguration(), synchronizeSessionResponse, setState.getInitialArgs().getElementsSessionContext()), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState openAuthFlow$lambda$6(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, String str, FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetState.copy$default(setState, null, false, financialConnectionsSessionManifest, FinancialConnectionsSheetState.AuthFlowStatus.ON_EXTERNAL_ACTIVITY, new FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl(str), 3, null);
    }

    private final void logNoBrowserAvailableAndFinish() {
        AppInitializationError appInitializationError = new AppInitializationError("No Web browser available to launch AuthFlow");
        FinancialConnectionsAnalyticsTrackerKt.logError(this.analyticsTracker, "error Launching the Auth Flow", appInitializationError, this.logger, FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR);
        finishWithResult$default(this, new FinancialConnectionsSheetActivityResult.Failed(appInitializationError), false, null, 6, null);
    }

    public final void onActivityRecreated$financial_connections_release() {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetViewModel.onActivityRecreated$lambda$7((FinancialConnectionsSheetState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState onActivityRecreated$lambda$7(FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetState.copy$default(setState, null, true, null, null, null, 29, null);
    }

    public final void onDismissed() {
        finishWithResult$default(this, FinancialConnectionsSheetActivityResult.Canceled.INSTANCE, false, null, 6, null);
    }

    public final void onResume$financial_connections_release() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FinancialConnectionsSheetViewModel$onResume$1(this, null), 3, null);
    }

    public final void onBrowserActivityResult$financial_connections_release() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FinancialConnectionsSheetViewModel$onBrowserActivityResult$1(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Parcelable] */
    public final void onNativeAuthFlowResult$financial_connections_release(ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "activityResult");
        Intent data = activityResult.getData();
        if (data != null) {
            ?? parcelableExtra = data.getParcelableExtra(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT);
            financialConnectionsSheetActivityResult = parcelableExtra instanceof FinancialConnectionsSheetActivityResult ? parcelableExtra : null;
        }
        FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult = financialConnectionsSheetActivityResult;
        if (activityResult.getResultCode() == -1 && financialConnectionsSheetActivityResult != null) {
            finishWithResult$default(this, financialConnectionsSheetActivityResult, true, null, 4, null);
        } else {
            finishWithResult$default(this, FinancialConnectionsSheetActivityResult.Canceled.INSTANCE, true, null, 4, null);
        }
    }

    /* compiled from: FinancialConnectionsSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1", f = "FinancialConnectionsSheetViewModel.kt", i = {}, l = {328}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSheetState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FinancialConnectionsSheetState financialConnectionsSheetState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$state = financialConnectionsSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetViewModel.this.new AnonymousClass1(this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = FinancialConnectionsSheetViewModel.this;
                    FinancialConnectionsSheetState financialConnectionsSheetState = this.$state;
                    Result.Companion companion = Result.INSTANCE;
                    FetchFinancialConnectionsSession fetchFinancialConnectionsSession = financialConnectionsSheetViewModel.fetchFinancialConnectionsSession;
                    String sessionSecret = financialConnectionsSheetState.getSessionSecret();
                    this.label = 1;
                    obj = fetchFinancialConnectionsSession.invoke(sessionSecret, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM9118constructorimpl = Result.m9118constructorimpl((FinancialConnectionsSession) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            FinancialConnectionsSheetState financialConnectionsSheetState2 = this.$state;
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = FinancialConnectionsSheetViewModel.this;
            if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel2, new FinancialConnectionsSheetActivityResult.Completed(null, FinancialConnectionsSessionExtensionsKt.update((FinancialConnectionsSession) objM9118constructorimpl, financialConnectionsSheetState2.getManifest()), null, 5, null), false, null, 6, null);
            }
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel3 = FinancialConnectionsSheetViewModel.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel3, new FinancialConnectionsSheetActivityResult.Failed(thM9121exceptionOrNullimpl), false, null, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void fetchFinancialConnectionsSession(FinancialConnectionsSheetState state) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(state, null), 3, null);
    }

    /* compiled from: FinancialConnectionsSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1", f = "FinancialConnectionsSheetViewModel.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1, reason: invalid class name and case insensitive filesystem */
    static final class C08511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSheetState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08511(FinancialConnectionsSheetState financialConnectionsSheetState, Continuation<? super C08511> continuation) {
            super(2, continuation);
            this.$state = financialConnectionsSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetViewModel.this.new C08511(this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = FinancialConnectionsSheetViewModel.this;
                    FinancialConnectionsSheetState financialConnectionsSheetState = this.$state;
                    Result.Companion companion = Result.INSTANCE;
                    FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken = financialConnectionsSheetViewModel.fetchFinancialConnectionsSessionForToken;
                    String sessionSecret = financialConnectionsSheetState.getSessionSecret();
                    this.label = 1;
                    obj = fetchFinancialConnectionsSessionForToken.invoke(sessionSecret, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM9118constructorimpl = Result.m9118constructorimpl((Pair) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            FinancialConnectionsSheetState financialConnectionsSheetState2 = this.$state;
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = FinancialConnectionsSheetViewModel.this;
            if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                Pair pair = (Pair) objM9118constructorimpl;
                FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) pair.component1();
                FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel2, new FinancialConnectionsSheetActivityResult.Completed(null, FinancialConnectionsSessionExtensionsKt.update(financialConnectionsSession, financialConnectionsSheetState2.getManifest()), (Token) pair.component2(), 1, null), false, null, 6, null);
            }
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel3 = FinancialConnectionsSheetViewModel.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel3, new FinancialConnectionsSheetActivityResult.Failed(thM9121exceptionOrNullimpl), false, null, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void fetchFinancialConnectionsSessionForToken(FinancialConnectionsSheetState state) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08511(state, null), 3, null);
    }

    /* compiled from: FinancialConnectionsSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$onUserCancel$1", f = "FinancialConnectionsSheetViewModel.kt", i = {}, l = {374}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$onUserCancel$1, reason: invalid class name and case insensitive filesystem */
    static final class C08531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSheetState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08531(FinancialConnectionsSheetState financialConnectionsSheetState, Continuation<? super C08531> continuation) {
            super(2, continuation);
            this.$state = financialConnectionsSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetViewModel.this.new C08531(this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            FinancialConnectionsSheetActivityResult.Canceled failed;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = FinancialConnectionsSheetViewModel.this;
                    FinancialConnectionsSheetState financialConnectionsSheetState = this.$state;
                    Result.Companion companion = Result.INSTANCE;
                    FetchFinancialConnectionsSession fetchFinancialConnectionsSession = financialConnectionsSheetViewModel.fetchFinancialConnectionsSession;
                    String sessionSecret = financialConnectionsSheetState.getSessionSecret();
                    this.label = 1;
                    obj = fetchFinancialConnectionsSession.invoke(sessionSecret, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM9118constructorimpl = Result.m9118constructorimpl((FinancialConnectionsSession) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = FinancialConnectionsSheetViewModel.this;
            if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                if (CustomManualEntryKt.isCustomManualEntryError((FinancialConnectionsSession) objM9118constructorimpl)) {
                    failed = new FinancialConnectionsSheetActivityResult.Failed(new CustomManualEntryRequiredError());
                } else {
                    failed = FinancialConnectionsSheetActivityResult.Canceled.INSTANCE;
                }
                FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel2, failed, false, null, 6, null);
            }
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel3 = FinancialConnectionsSheetViewModel.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel3, new FinancialConnectionsSheetActivityResult.Failed(thM9121exceptionOrNullimpl), false, null, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onUserCancel(FinancialConnectionsSheetState state) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08531(state, null), 3, null);
    }

    public final void handleOnNewIntent$financial_connections_release(Intent intent) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FinancialConnectionsSheetViewModel$handleOnNewIntent$1(this, intent, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStartApp2App(final String unwrappedUriString) {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetViewModel.onStartApp2App$lambda$8(unwrappedUriString, (FinancialConnectionsSheetState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState onStartApp2App$lambda$8(String str, FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetState.copy$default(setState, null, false, null, FinancialConnectionsSheetState.AuthFlowStatus.INTERMEDIATE_DEEPLINK, new FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl(str), 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinishApp2App(final Uri receivedUrl) {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetViewModel.onFinishApp2App$lambda$9(receivedUrl, (FinancialConnectionsSheetState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState onFinishApp2App$lambda$9(Uri uri, FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        FinancialConnectionsSessionManifest manifest = setState.getManifest();
        Intrinsics.checkNotNull(manifest);
        return FinancialConnectionsSheetState.copy$default(setState, null, false, null, FinancialConnectionsSheetState.AuthFlowStatus.INTERMEDIATE_DEEPLINK, new FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl(manifest.getHostedAuthUrl() + "&startPolling=true&" + uri.getFragment()), 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFlowSuccess(FinancialConnectionsSheetState state, Uri receivedUrl) {
        if (receivedUrl == null) {
            finishWithResult$default(this, new FinancialConnectionsSheetActivityResult.Failed(new Exception("Intent url received from web flow is null")), false, null, 6, null);
            return;
        }
        setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetViewModel.onFlowSuccess$lambda$10((FinancialConnectionsSheetState) obj);
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[FinancialConnectionsSheetActivityArgsKt.getFlowType(state.getInitialArgs()).ordinal()];
        if (i == 1) {
            fetchFinancialConnectionsSession(state);
        } else if (i == 2) {
            fetchFinancialConnectionsSessionForToken(state);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            onSuccessFromInstantDebits(receivedUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState onFlowSuccess$lambda$10(FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetState.copy$default(setState, null, false, null, FinancialConnectionsSheetState.AuthFlowStatus.NONE, null, 23, null);
    }

    private final void onSuccessFromInstantDebits(Uri url) {
        Object objM7654fromUriIoAF18A = InstantDebitsResultBuilder.INSTANCE.m7654fromUriIoAF18A(url);
        if (Result.m9125isSuccessimpl(objM7654fromUriIoAF18A)) {
            finishWithResult$default(this, new FinancialConnectionsSheetActivityResult.Completed((InstantDebitsResult) objM7654fromUriIoAF18A, null, null), false, null, 6, null);
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM7654fromUriIoAF18A);
        if (thM9121exceptionOrNullimpl != null) {
            this.logger.error("Could not retrieve payment method parameters from success url", thM9121exceptionOrNullimpl);
            finishWithResult$default(this, new FinancialConnectionsSheetActivityResult.Failed(thM9121exceptionOrNullimpl), false, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFlowCancelled(FinancialConnectionsSheetState state) {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetViewModel.onFlowCancelled$lambda$13((FinancialConnectionsSheetState) obj);
            }
        });
        onUserCancel(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState onFlowCancelled$lambda$13(FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetState.copy$default(setState, null, false, null, FinancialConnectionsSheetState.AuthFlowStatus.NONE, null, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState onViewEffectLaunched$lambda$14(FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetState.copy$default(setState, null, false, null, null, null, 15, null);
    }

    public final void onViewEffectLaunched$financial_connections_release() {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetViewModel.onViewEffectLaunched$lambda$14((FinancialConnectionsSheetState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri toUriOrNull(String str) {
        Uri.parse(str).buildUpon().clearQuery();
        try {
            Result.Companion companion = Result.INSTANCE;
            return Uri.parse(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                this.logger.error("Could not parse web flow url", thM9121exceptionOrNullimpl);
            }
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                objM9118constructorimpl = null;
            }
            return (Uri) objM9118constructorimpl;
        }
    }

    static /* synthetic */ void finishWithResult$default(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        financialConnectionsSheetViewModel.finishWithResult(financialConnectionsSheetActivityResult, z, num);
    }

    private final void finishWithResult(final FinancialConnectionsSheetActivityResult result, boolean fromNative, final Integer finishMessage) {
        boolean z = result instanceof FinancialConnectionsSheetActivityResult.Failed;
        if (z) {
            FinancialConnectionsSheetActivityResult.Failed failed = (FinancialConnectionsSheetActivityResult.Failed) result;
            if (failed.getError() instanceof FinancialConnectionsAttestationError) {
                Throwable error = failed.getError();
                Intrinsics.checkNotNull(error, "null cannot be cast to non-null type com.stripe.android.financialconnections.features.error.FinancialConnectionsAttestationError");
                this.integrityVerdictManager.setVerdictFailed();
                switchToWebFlow(((FinancialConnectionsAttestationError) error).getPrefillDetails());
                return;
            }
        }
        reportResult(result);
        if (!fromNative) {
            if (result instanceof FinancialConnectionsSheetActivityResult.Completed) {
                FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.SUCCESS, null, 2, null);
            } else if (result instanceof FinancialConnectionsSheetActivityResult.Canceled) {
                FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.CANCEL, null, 2, null);
            } else {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                FinancialConnections.INSTANCE.m7282emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.ERROR, new FinancialConnectionsEvent.Metadata(null, null, FinancialConnectionsEvent.ErrorCode.UNEXPECTED_ERROR, 3, null));
            }
        }
        setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetViewModel.finishWithResult$lambda$17(result, finishMessage, (FinancialConnectionsSheetState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState finishWithResult$lambda$17(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult, Integer num, FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetState.copy$default(setState, null, false, null, null, new FinancialConnectionsSheetViewEffect.FinishWithResult(financialConnectionsSheetActivityResult, num), 15, null);
    }

    /* compiled from: FinancialConnectionsSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$reportResult$1", f = "FinancialConnectionsSheetViewModel.kt", i = {}, l = {542}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$reportResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C08551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSheetActivityResult $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08551(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult, Continuation<? super C08551> continuation) {
            super(2, continuation);
            this.$result = financialConnectionsSheetActivityResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08551 c08551 = FinancialConnectionsSheetViewModel.this.new C08551(this.$result, continuation);
            c08551.L$0 = obj;
            return c08551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C08551 c08551;
            Throwable th;
            Object objM9118constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = FinancialConnectionsSheetViewModel.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    GetOrFetchSync getOrFetchSync = financialConnectionsSheetViewModel.getOrFetchSync;
                    this.label = 1;
                    c08551 = this;
                    try {
                        obj = GetOrFetchSync.invoke$default(getOrFetchSync, null, false, c08551, 3, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = FinancialConnectionsSheetViewModel.this;
                        FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult = c08551.$result;
                        if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                        }
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c08551 = this;
                    th = th;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel22 = FinancialConnectionsSheetViewModel.this;
                    FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult2 = c08551.$result;
                    if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c08551 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c08551 = this;
                    Result.Companion companion222 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel222 = FinancialConnectionsSheetViewModel.this;
                    FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult22 = c08551.$result;
                    if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                    }
                    return Unit.INSTANCE;
                }
            }
            objM9118constructorimpl = Result.m9118constructorimpl(((SynchronizeSessionResponse) obj).getManifest());
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2222 = FinancialConnectionsSheetViewModel.this;
            FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult222 = c08551.$result;
            if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                financialConnectionsSheetViewModel2222.eventReporter.onResult(((FinancialConnectionsSessionManifest) objM9118constructorimpl).getId(), financialConnectionsSheetActivityResult222);
            }
            return Unit.INSTANCE;
        }
    }

    private final void reportResult(FinancialConnectionsSheetActivityResult result) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, this.ioDispatcher, null, new C08551(result, null), 2, null);
    }

    /* compiled from: FinancialConnectionsSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$switchToWebFlow$1", f = "FinancialConnectionsSheetViewModel.kt", i = {}, l = {553}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$switchToWebFlow$1, reason: invalid class name and case insensitive filesystem */
    static final class C08561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ElementsSessionContext.PrefillDetails $prefillDetails;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08561(ElementsSessionContext.PrefillDetails prefillDetails, Continuation<? super C08561> continuation) {
            super(2, continuation);
            this.$prefillDetails = prefillDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08561 c08561 = FinancialConnectionsSheetViewModel.this.new C08561(this.$prefillDetails, continuation);
            c08561.L$0 = obj;
            return c08561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C08561 c08561;
            Throwable th;
            Object objM9118constructorimpl;
            Throwable thM9121exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = FinancialConnectionsSheetViewModel.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    GetOrFetchSync getOrFetchSync = financialConnectionsSheetViewModel.getOrFetchSync;
                    this.label = 1;
                    c08561 = this;
                    try {
                        obj = GetOrFetchSync.invoke$default(getOrFetchSync, null, false, c08561, 3, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = FinancialConnectionsSheetViewModel.this;
                        ElementsSessionContext.PrefillDetails prefillDetails = c08561.$prefillDetails;
                        if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                        }
                        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel3 = FinancialConnectionsSheetViewModel.this;
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c08561 = this;
                    th = th;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel22 = FinancialConnectionsSheetViewModel.this;
                    ElementsSessionContext.PrefillDetails prefillDetails2 = c08561.$prefillDetails;
                    if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                    }
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel32 = FinancialConnectionsSheetViewModel.this;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c08561 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c08561 = this;
                    Result.Companion companion222 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel222 = FinancialConnectionsSheetViewModel.this;
                    ElementsSessionContext.PrefillDetails prefillDetails22 = c08561.$prefillDetails;
                    if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                    }
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel322 = FinancialConnectionsSheetViewModel.this;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            objM9118constructorimpl = Result.m9118constructorimpl((SynchronizeSessionResponse) obj);
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2222 = FinancialConnectionsSheetViewModel.this;
            ElementsSessionContext.PrefillDetails prefillDetails222 = c08561.$prefillDetails;
            if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                financialConnectionsSheetViewModel2222.switchToWebFlow(((SynchronizeSessionResponse) objM9118constructorimpl).getManifest(), prefillDetails222);
            }
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel3222 = FinancialConnectionsSheetViewModel.this;
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel3222, new FinancialConnectionsSheetActivityResult.Failed(thM9121exceptionOrNullimpl), false, null, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void switchToWebFlow(ElementsSessionContext.PrefillDetails prefillDetails) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08561(prefillDetails, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchToWebFlow(final FinancialConnectionsSessionManifest manifest, ElementsSessionContext.PrefillDetails prefillDetails) {
        final String strCreate = HostedAuthUrlBuilder.INSTANCE.create(this.initialState.getInitialArgs(), manifest.getHostedAuthUrl(), prefillDetails);
        if (strCreate != null) {
            setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinancialConnectionsSheetViewModel.switchToWebFlow$lambda$18(manifest, strCreate, (FinancialConnectionsSheetState) obj);
                }
            });
        } else {
            finishWithResult$default(this, new FinancialConnectionsSheetActivityResult.Failed(new IllegalArgumentException("hostedAuthUrl is required to switch to web flow!")), false, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState switchToWebFlow$lambda$18(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, String str, FinancialConnectionsSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return FinancialConnectionsSheetState.copy$default(setState, null, false, financialConnectionsSessionManifest, FinancialConnectionsSheetState.AuthFlowStatus.INTERMEDIATE_DEEPLINK, new FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl(str), 3, null);
    }

    /* compiled from: FinancialConnectionsSheetViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;", "", "supportsAppVerification", "", "<init>", "(Z)V", "getSupportsAppVerification", "()Z", "Success", "Skipped", "Failure", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Failure;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Skipped;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Success;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static abstract class AttestationInitResult {
        private final boolean supportsAppVerification;

        public /* synthetic */ AttestationInitResult(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        /* compiled from: FinancialConnectionsSheetViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Success;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success extends AttestationInitResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1864658884;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
                super(true, null);
            }
        }

        private AttestationInitResult(boolean z) {
            this.supportsAppVerification = z;
        }

        public final boolean getSupportsAppVerification() {
            return this.supportsAppVerification;
        }

        /* compiled from: FinancialConnectionsSheetViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Skipped;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Skipped extends AttestationInitResult {
            public static final int $stable = 0;
            public static final Skipped INSTANCE = new Skipped();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Skipped)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1584305905;
            }

            public String toString() {
                return "Skipped";
            }

            private Skipped() {
                super(false, null);
            }
        }

        /* compiled from: FinancialConnectionsSheetViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Failure;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Failure extends AttestationInitResult {
            public static final int $stable = 8;
            private final Throwable error;

            public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = failure.error;
                }
                return failure.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            public final Failure copy(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Failure(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failure(error=" + this.error + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(Throwable error) {
                super(false, null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: FinancialConnectionsSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;", "", "<init>", "()V", "Factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "MAX_ACCOUNTS", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ViewModelProvider.Factory getFactory() {
            return FinancialConnectionsSheetViewModel.Factory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetViewModel Factory$lambda$20$lambda$19(CreationExtras initializer) {
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(initializer);
        Bundle bundle = (Bundle) savedStateHandleCreateSavedStateHandle.get(FinancialConnectionsSheetState.KEY_SAVED_STATE);
        Object obj = initializer.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) obj;
        FinancialConnectionsSheetActivityArgs args = FinancialConnectionsSheetActivity.INSTANCE.getArgs(savedStateHandleCreateSavedStateHandle);
        if (args == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        FinancialConnectionsSheetState financialConnectionsSheetState = new FinancialConnectionsSheetState(args, bundle);
        return DaggerFinancialConnectionsSheetComponent.builder().application(application).savedStateHandle(savedStateHandleCreateSavedStateHandle).sharedComponent(FinancialConnectionsSingletonSharedComponentHolder.INSTANCE.getComponent(application)).initialState(financialConnectionsSheetState).configuration(financialConnectionsSheetState.getInitialArgs().getConfiguration()).build().getViewModel();
    }

    static {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(FinancialConnectionsSheetViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetViewModel.Factory$lambda$20$lambda$19((CreationExtras) obj);
            }
        });
        Factory = initializerViewModelFactoryBuilder.build();
    }
}
