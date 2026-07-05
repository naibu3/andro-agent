package com.stripe.android.financialconnections.features.partnerauth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.URLUtil;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.canhub.cropper.CropImageOptionsKt;
import com.facebook.GraphResponse;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.imageutils.TiffUtil;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.browser.BrowserManager;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.financialconnections.domain.CancelAuthorizationSession;
import com.stripe.android.financialconnections.domain.CompleteAuthorizationSession;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults;
import com.stripe.android.financialconnections.domain.PostAuthSessionEvent;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.domain.RepairAuthorizationSession;
import com.stripe.android.financialconnections.domain.RetrieveAuthorizationSession;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.PartnerAuthError;
import com.stripe.android.financialconnections.exception.WebAuthFlowFailedException;
import com.stripe.android.financialconnections.features.common.ManifestExtensionsKt;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.MixedOAuthParams;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.navigation.NavigationManager;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Date;
import java.util.Iterator;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: PartnerAuthViewModel.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 Y2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003WXYB¥\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\b\b\u0001\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0012\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\u0002H\u0016J\b\u00101\u001a\u000202H\u0002J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0082@¢\u0006\u0002\u00107J\u0016\u00108\u001a\u0002042\u0006\u00105\u001a\u000206H\u0082@¢\u0006\u0002\u00107J\b\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u000202H\u0002J\b\u0010<\u001a\u000202H\u0002J\u0006\u0010=\u001a\u000202J\u0010\u0010>\u001a\u0002022\u0006\u0010?\u001a\u00020\u000eH\u0002J\u0010\u0010@\u001a\u0002022\u0006\u0010A\u001a\u00020BH\u0002J\u000e\u0010C\u001a\u0004\u0018\u00010\u000e*\u00020BH\u0002J\u000e\u0010D\u001a\u0002022\u0006\u0010E\u001a\u00020FJ(\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u000e2\b\u0010J\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u0010KJ\u0018\u0010L\u001a\u0002022\b\u0010H\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u0010MJ\u0016\u0010N\u001a\u0002022\u0006\u0010A\u001a\u00020BH\u0082@¢\u0006\u0002\u0010OJ\u0016\u0010\u0003\u001a\u0002022\u0006\u0010H\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010MJ\u000e\u0010P\u001a\u00020:2\u0006\u0010Q\u001a\u00020\u000eJ\b\u0010R\u001a\u000202H\u0002J\u0006\u0010S\u001a\u000202J\u0006\u0010T\u001a\u000202J\b\u0010U\u001a\u000202H\u0002J\b\u0010V\u001a\u000202H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006Z"}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;", "completeAuthorizationSession", "Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;", "createAuthorizationSession", "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;", "cancelAuthorizationSession", "Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;", "retrieveAuthorizationSession", "Lcom/stripe/android/financialconnections/domain/RetrieveAuthorizationSession;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", NamedConstantsKt.APPLICATION_ID, "", "uriUtils", "Lcom/stripe/android/financialconnections/utils/UriUtils;", "postAuthSessionEvent", "Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "browserManager", "Lcom/stripe/android/financialconnections/browser/BrowserManager;", "handleError", "Lcom/stripe/android/financialconnections/domain/HandleError;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "pollAuthorizationSessionOAuthResults", "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;", "logger", "Lcom/stripe/android/core/Logger;", "presentSheet", "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;", "pendingRepairRepository", "Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;", "repairAuthSession", "Lcom/stripe/android/financialconnections/domain/RepairAuthorizationSession;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "<init>", "(Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;Lcom/stripe/android/financialconnections/domain/RetrieveAuthorizationSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/browser/BrowserManager;Lcom/stripe/android/financialconnections/domain/HandleError;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;Lcom/stripe/android/financialconnections/domain/RepairAuthorizationSession;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "initializeState", "", "initializeBankAuthRepair", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;", BaseJavaModule.METHOD_TYPE_SYNC, "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializePartnerAuth", "recreateAuthSession", "Lkotlinx/coroutines/Job;", "launchBrowserIfNonOauth", "handleErrors", "onLaunchAuthClick", "reportOAuthLaunched", "sessionId", "launchAuthInBrowser", "authSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "browserReadyUrl", "onWebAuthFlowFinished", "webStatus", "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;", "onAuthFailed", "url", "message", "reason", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAuthCancelled", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAuthSessionAndContinue", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClickableTextClick", ShareConstants.MEDIA_URI, "presentDataAccessBottomSheet", "onViewEffectLaunched", "onCancelClick", "cancelInModal", "cancelInFullscreen", "Args", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PartnerAuthViewModel extends FinancialConnectionsViewModel<SharedPartnerAuthState> {
    private final String applicationId;
    private final BrowserManager browserManager;
    private final CancelAuthorizationSession cancelAuthorizationSession;
    private final CompleteAuthorizationSession completeAuthorizationSession;
    private final PostAuthorizationSession createAuthorizationSession;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetOrFetchSync getOrFetchSync;
    private final HandleError handleError;
    private final SharedPartnerAuthState initialState;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final CoreAuthorizationPendingNetworkingRepairRepository pendingRepairRepository;
    private final PollAuthorizationSessionOAuthResults pollAuthorizationSessionOAuthResults;
    private final PostAuthSessionEvent postAuthSessionEvent;
    private final PresentSheet presentSheet;
    private final RepairAuthorizationSession repairAuthSession;
    private final RetrieveAuthorizationSession retrieveAuthorizationSession;
    private final UriUtils uriUtils;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PartnerAuthViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        PartnerAuthViewModel create(SharedPartnerAuthState initialState);
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel", f = "PartnerAuthViewModel.kt", i = {0, 0}, l = {396}, m = "cancelAuthSessionAndContinue", n = {"this", "authSession"}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$cancelAuthSessionAndContinue$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PartnerAuthViewModel.this.cancelAuthSessionAndContinue(null, this);
        }
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel", f = "PartnerAuthViewModel.kt", i = {0, 0, 1, 1, 2}, l = {419, 434, 436}, m = "completeAuthorizationSession", n = {"this", "url", "this", "authSession", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$completeAuthorizationSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C09511 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C09511(Continuation<? super C09511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PartnerAuthViewModel.this.completeAuthorizationSession(null, this);
        }
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel", f = "PartnerAuthViewModel.kt", i = {0, 0}, l = {139}, m = "initializeBankAuthRepair", n = {BaseJavaModule.METHOD_TYPE_SYNC, "activeInstitution"}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$initializeBankAuthRepair$1, reason: invalid class name and case insensitive filesystem */
    static final class C09531 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C09531(Continuation<? super C09531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PartnerAuthViewModel.this.initializeBankAuthRepair(null, this);
        }
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel", f = "PartnerAuthViewModel.kt", i = {0}, l = {152}, m = "initializePartnerAuth", n = {"manifest"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$initializePartnerAuth$1, reason: invalid class name and case insensitive filesystem */
    static final class C09541 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C09541(Continuation<? super C09541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PartnerAuthViewModel.this.initializePartnerAuth(null, this);
        }
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel", f = "PartnerAuthViewModel.kt", i = {0, 0, 1, 1, 1, 2, 2, 3, 3}, l = {343, CropImageOptionsKt.DEGREES_360, 370, 377}, m = "onAuthCancelled", n = {"this", "url", "this", "url", "authSession", "this", "url", "this", "url"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onAuthCancelled$1, reason: invalid class name and case insensitive filesystem */
    static final class C09581 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C09581(Continuation<? super C09581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PartnerAuthViewModel.this.onAuthCancelled(null, this);
        }
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel", f = "PartnerAuthViewModel.kt", i = {0, 0, 0, 1, 1}, l = {305, 323}, m = "onAuthFailed", n = {"this", "url", "error", "this", "error"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onAuthFailed$1, reason: invalid class name and case insensitive filesystem */
    static final class C09591 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C09591(Continuation<? super C09591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PartnerAuthViewModel.this.onAuthFailed(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public PartnerAuthViewModel(CompleteAuthorizationSession completeAuthorizationSession, PostAuthorizationSession createAuthorizationSession, CancelAuthorizationSession cancelAuthorizationSession, RetrieveAuthorizationSession retrieveAuthorizationSession, FinancialConnectionsAnalyticsTracker eventTracker, @Named(NamedConstantsKt.APPLICATION_ID) String applicationId, UriUtils uriUtils, PostAuthSessionEvent postAuthSessionEvent, GetOrFetchSync getOrFetchSync, BrowserManager browserManager, HandleError handleError, NavigationManager navigationManager, PollAuthorizationSessionOAuthResults pollAuthorizationSessionOAuthResults, Logger logger, PresentSheet presentSheet, CoreAuthorizationPendingNetworkingRepairRepository pendingRepairRepository, RepairAuthorizationSession repairAuthSession, @Assisted SharedPartnerAuthState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(completeAuthorizationSession, "completeAuthorizationSession");
        Intrinsics.checkNotNullParameter(createAuthorizationSession, "createAuthorizationSession");
        Intrinsics.checkNotNullParameter(cancelAuthorizationSession, "cancelAuthorizationSession");
        Intrinsics.checkNotNullParameter(retrieveAuthorizationSession, "retrieveAuthorizationSession");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(uriUtils, "uriUtils");
        Intrinsics.checkNotNullParameter(postAuthSessionEvent, "postAuthSessionEvent");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(browserManager, "browserManager");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(pollAuthorizationSessionOAuthResults, "pollAuthorizationSessionOAuthResults");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(presentSheet, "presentSheet");
        Intrinsics.checkNotNullParameter(pendingRepairRepository, "pendingRepairRepository");
        Intrinsics.checkNotNullParameter(repairAuthSession, "repairAuthSession");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        this.completeAuthorizationSession = completeAuthorizationSession;
        this.createAuthorizationSession = createAuthorizationSession;
        this.cancelAuthorizationSession = cancelAuthorizationSession;
        this.retrieveAuthorizationSession = retrieveAuthorizationSession;
        this.eventTracker = eventTracker;
        this.applicationId = applicationId;
        this.uriUtils = uriUtils;
        this.postAuthSessionEvent = postAuthSessionEvent;
        this.getOrFetchSync = getOrFetchSync;
        this.browserManager = browserManager;
        this.handleError = handleError;
        this.navigationManager = navigationManager;
        this.pollAuthorizationSessionOAuthResults = pollAuthorizationSessionOAuthResults;
        this.logger = logger;
        this.presentSheet = presentSheet;
        this.pendingRepairRepository = pendingRepairRepository;
        this.repairAuthSession = repairAuthSession;
        this.initialState = initialState;
        handleErrors();
        launchBrowserIfNonOauth();
        initializeState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FinancialConnectionsSessionManifest.Pane getPane() {
        return this.initialState.getPane();
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(SharedPartnerAuthState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getInModal()) {
            return null;
        }
        return new TopAppBarStateUpdate(state.getPane(), state.getCanNavigateBack(), MavericksExtensionsKt.getError(state.getPayload()), false, null, false, 56, null);
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$initializeState$1", f = "PartnerAuthViewModel.kt", i = {}, l = {122, 124, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$initializeState$1, reason: invalid class name and case insensitive filesystem */
    static final class C09551 extends SuspendLambda implements Function1<Continuation<? super SharedPartnerAuthState.Payload>, Object> {
        int label;

        C09551(Continuation<? super C09551> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PartnerAuthViewModel.this.new C09551(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super SharedPartnerAuthState.Payload> continuation) {
            return ((C09551) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        
            if (r12 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        
            if (r12 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = GetOrFetchSync.invoke$default(PartnerAuthViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return (SharedPartnerAuthState.Payload) obj;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (SharedPartnerAuthState.Payload) obj;
            }
            ResultKt.throwOnFailure(obj);
            SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
            if (PartnerAuthViewModel.this.getPane() == FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR) {
                this.label = 2;
                obj = PartnerAuthViewModel.this.initializeBankAuthRepair(synchronizeSessionResponse, this);
            } else {
                this.label = 3;
                obj = PartnerAuthViewModel.this.initializePartnerAuth(synchronizeSessionResponse, this);
            }
            return coroutine_suspended;
        }
    }

    private final void initializeState() {
        FinancialConnectionsViewModel.execute$default(this, new C09551(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PartnerAuthViewModel.initializeState$lambda$0((SharedPartnerAuthState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPartnerAuthState initializeState$lambda$0(SharedPartnerAuthState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return SharedPartnerAuthState.copy$default(execute, null, it, null, null, false, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializeBankAuthRepair(SynchronizeSessionResponse synchronizeSessionResponse, Continuation<? super SharedPartnerAuthState.Payload> continuation) {
        C09531 c09531;
        FinancialConnectionsInstitution activeInstitution;
        if (continuation instanceof C09531) {
            c09531 = (C09531) continuation;
            if ((c09531.label & Integer.MIN_VALUE) != 0) {
                c09531.label -= Integer.MIN_VALUE;
            } else {
                c09531 = new C09531(continuation);
            }
        }
        Object objInvoke = c09531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c09531.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            CoreAuthorizationPendingNetworkingRepairRepository.State state = this.pendingRepairRepository.get();
            String coreAuthorization = state != null ? state.getCoreAuthorization() : null;
            if (coreAuthorization == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            activeInstitution = synchronizeSessionResponse.getManifest().getActiveInstitution();
            if (activeInstitution == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            RepairAuthorizationSession repairAuthorizationSession = this.repairAuthSession;
            c09531.L$0 = synchronizeSessionResponse;
            c09531.L$1 = activeInstitution;
            c09531.label = 1;
            objInvoke = repairAuthorizationSession.invoke(coreAuthorization, c09531);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) c09531.L$1;
            SynchronizeSessionResponse synchronizeSessionResponse2 = (SynchronizeSessionResponse) c09531.L$0;
            ResultKt.throwOnFailure(objInvoke);
            activeInstitution = financialConnectionsInstitution;
            synchronizeSessionResponse = synchronizeSessionResponse2;
        }
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) objInvoke;
        Boolean boolIsStripeDirect = synchronizeSessionResponse.getManifest().isStripeDirect();
        return new SharedPartnerAuthState.Payload(boolIsStripeDirect != null ? boolIsStripeDirect.booleanValue() : false, activeInstitution, financialConnectionsAuthorizationSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializePartnerAuth(SynchronizeSessionResponse synchronizeSessionResponse, Continuation<? super SharedPartnerAuthState.Payload> continuation) throws StripeException {
        C09541 c09541;
        FinancialConnectionsSessionManifest manifest;
        FinancialConnectionsAuthorizationSession activeAuthSession;
        Object obj;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        FinancialConnectionsInstitution activeInstitution;
        if (continuation instanceof C09541) {
            c09541 = (C09541) continuation;
            if ((c09541.label & Integer.MIN_VALUE) != 0) {
                c09541.label -= Integer.MIN_VALUE;
            } else {
                c09541 = new C09541(continuation);
            }
        }
        Object obj2 = c09541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c09541.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            manifest = synchronizeSessionResponse.getManifest();
            activeAuthSession = manifest.getActiveAuthSession();
            if (activeAuthSession == null) {
                PostAuthorizationSession postAuthorizationSession = this.createAuthorizationSession;
                FinancialConnectionsInstitution activeInstitution2 = manifest.getActiveInstitution();
                if (activeInstitution2 != null) {
                    c09541.L$0 = manifest;
                    c09541.label = 1;
                    Object objInvoke = postAuthorizationSession.invoke(activeInstitution2, synchronizeSessionResponse, c09541);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objInvoke;
                    financialConnectionsSessionManifest = manifest;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            Boolean boolIsStripeDirect = manifest.isStripeDirect();
            boolean zBooleanValue = boolIsStripeDirect == null ? boolIsStripeDirect.booleanValue() : false;
            activeInstitution = manifest.getActiveInstitution();
            if (activeInstitution == null) {
                return new SharedPartnerAuthState.Payload(zBooleanValue, activeInstitution, activeAuthSession);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) c09541.L$0;
        ResultKt.throwOnFailure(obj2);
        obj = obj2;
        activeAuthSession = (FinancialConnectionsAuthorizationSession) obj;
        manifest = financialConnectionsSessionManifest;
        Boolean boolIsStripeDirect2 = manifest.isStripeDirect();
        if (boolIsStripeDirect2 == null) {
        }
        activeInstitution = manifest.getActiveInstitution();
        if (activeInstitution == null) {
        }
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$recreateAuthSession$1", f = "PartnerAuthViewModel.kt", i = {0, 1, 1}, l = {165, 167}, m = "invokeSuspend", n = {"launchedEvent", "launchedEvent", "manifest"}, s = {"L$0", "L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$recreateAuthSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C09621 extends SuspendLambda implements Function1<Continuation<? super SharedPartnerAuthState.Payload>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C09621(Continuation<? super C09621> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PartnerAuthViewModel.this.new C09621(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super SharedPartnerAuthState.Payload> continuation) {
            return ((C09621) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws StripeException {
            AuthSessionEvent.Launched launched;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            FinancialConnectionsInstitution activeInstitution;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthSessionEvent.Launched launched2 = new AuthSessionEvent.Launched(new Date());
                this.L$0 = launched2;
                this.label = 1;
                Object objInvoke$default = GetOrFetchSync.invoke$default(PartnerAuthViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (objInvoke$default != coroutine_suspended) {
                    launched = launched2;
                    obj = objInvoke$default;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$1;
                launched = (AuthSessionEvent.Launched) this.L$0;
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) obj;
                PartnerAuthViewModel.this.logger.debug("Created auth session " + financialConnectionsAuthorizationSession.getId());
                activeInstitution = financialConnectionsSessionManifest.getActiveInstitution();
                if (activeInstitution != null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                Boolean boolIsStripeDirect = financialConnectionsSessionManifest.isStripeDirect();
                SharedPartnerAuthState.Payload payload = new SharedPartnerAuthState.Payload(boolIsStripeDirect != null ? boolIsStripeDirect.booleanValue() : false, activeInstitution, financialConnectionsAuthorizationSession);
                PartnerAuthViewModel partnerAuthViewModel = PartnerAuthViewModel.this;
                AuthSessionEvent.Loaded loaded = new AuthSessionEvent.Loaded(new Date());
                if (!financialConnectionsAuthorizationSession.isOAuth()) {
                    loaded = null;
                }
                partnerAuthViewModel.postAuthSessionEvent.invoke(financialConnectionsAuthorizationSession.getId(), CollectionsKt.listOfNotNull((Object[]) new AuthSessionEvent[]{launched, loaded}));
                return payload;
            }
            launched = (AuthSessionEvent.Launched) this.L$0;
            ResultKt.throwOnFailure(obj);
            SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
            FinancialConnectionsSessionManifest manifest = synchronizeSessionResponse.getManifest();
            PostAuthorizationSession postAuthorizationSession = PartnerAuthViewModel.this.createAuthorizationSession;
            FinancialConnectionsInstitution activeInstitution2 = manifest.getActiveInstitution();
            if (activeInstitution2 != null) {
                this.L$0 = launched;
                this.L$1 = manifest;
                this.label = 2;
                obj = postAuthorizationSession.invoke(activeInstitution2, synchronizeSessionResponse, this);
                if (obj != coroutine_suspended) {
                    financialConnectionsSessionManifest = manifest;
                    FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) obj;
                    PartnerAuthViewModel.this.logger.debug("Created auth session " + financialConnectionsAuthorizationSession2.getId());
                    activeInstitution = financialConnectionsSessionManifest.getActiveInstitution();
                    if (activeInstitution != null) {
                    }
                }
                return coroutine_suspended;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private final Job recreateAuthSession() {
        return execute(new C09621(null), new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel.recreateAuthSession.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SharedPartnerAuthState) obj).getPayload();
            }
        }, new Function2() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PartnerAuthViewModel.recreateAuthSession$lambda$1((SharedPartnerAuthState) obj, (Async) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPartnerAuthState recreateAuthSession$lambda$1(SharedPartnerAuthState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return SharedPartnerAuthState.copy$default(execute, null, it, null, null, false, 29, null);
    }

    private final void launchBrowserIfNonOauth() {
        FinancialConnectionsViewModel.onAsync$default(this, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel.launchBrowserIfNonOauth.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SharedPartnerAuthState) obj).getPayload();
            }
        }, new C09572(null), null, 4, null);
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$launchBrowserIfNonOauth$2", f = "PartnerAuthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$launchBrowserIfNonOauth$2, reason: invalid class name and case insensitive filesystem */
    static final class C09572 extends SuspendLambda implements Function2<SharedPartnerAuthState.Payload, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C09572(Continuation<? super C09572> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09572 c09572 = PartnerAuthViewModel.this.new C09572(continuation);
            c09572.L$0 = obj;
            return c09572;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SharedPartnerAuthState.Payload payload, Continuation<? super Unit> continuation) {
            return ((C09572) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SharedPartnerAuthState.Payload payload = (SharedPartnerAuthState.Payload) this.L$0;
            if (!payload.getAuthSession().isOAuth()) {
                PartnerAuthViewModel.this.launchAuthInBrowser(payload.getAuthSession());
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$handleErrors$3", f = "PartnerAuthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$handleErrors$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = PartnerAuthViewModel.this.new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PartnerAuthViewModel.this.handleError.invoke("Error fetching payload / posting AuthSession", (Throwable) this.L$0, PartnerAuthViewModel.this.getPane(), true);
            return Unit.INSTANCE;
        }
    }

    private final void handleErrors() {
        onAsync(new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel.handleErrors.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SharedPartnerAuthState) obj).getPayload();
            }
        }, new AnonymousClass2(null), new AnonymousClass3(null));
        FinancialConnectionsViewModel.onAsync$default(this, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel.handleErrors.4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SharedPartnerAuthState) obj).getAuthenticationStatus();
            }
        }, null, new AnonymousClass5(null), 2, null);
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$handleErrors$2", f = "PartnerAuthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$handleErrors$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<SharedPartnerAuthState.Payload, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PartnerAuthViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SharedPartnerAuthState.Payload payload, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PartnerAuthViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(PartnerAuthViewModel.this.getPane()));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$handleErrors$5", f = "PartnerAuthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$handleErrors$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = PartnerAuthViewModel.this.new AnonymousClass5(continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            PartnerAuthViewModel.this.handleError.invoke("Error with authentication status", th instanceof FinancialConnectionsError ? (FinancialConnectionsError) th : new PartnerAuthError(th.getMessage()), PartnerAuthViewModel.this.getPane(), true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPartnerAuthState onLaunchAuthClick$lambda$2(SharedPartnerAuthState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return SharedPartnerAuthState.copy$default(setState, null, null, null, new Async.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.Action.AUTHENTICATING)), false, 23, null);
    }

    public final void onLaunchAuthClick() {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PartnerAuthViewModel.onLaunchAuthClick$lambda$2((SharedPartnerAuthState) obj);
            }
        });
        withState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PartnerAuthViewModel.onLaunchAuthClick$lambda$4(this.f$0, (SharedPartnerAuthState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLaunchAuthClick$lambda$4(PartnerAuthViewModel partnerAuthViewModel, SharedPartnerAuthState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        SharedPartnerAuthState.Payload payloadInvoke = state.getPayload().invoke();
        FinancialConnectionsAuthorizationSession authSession = payloadInvoke != null ? payloadInvoke.getAuthSession() : null;
        if (authSession == null) {
            throw new IllegalArgumentException("Payload shouldn't be null when the user launches the auth flow".toString());
        }
        partnerAuthViewModel.reportOAuthLaunched(authSession.getId());
        partnerAuthViewModel.launchAuthInBrowser(authSession);
        return Unit.INSTANCE;
    }

    private final void reportOAuthLaunched(String sessionId) {
        this.postAuthSessionEvent.invoke(sessionId, new AuthSessionEvent.OAuthLaunched(new Date()));
        this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PrepaneClickContinue(getPane()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAuthInBrowser(FinancialConnectionsAuthorizationSession authSession) {
        final String strBrowserReadyUrl = browserReadyUrl(authSession);
        if (strBrowserReadyUrl != null) {
            setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PartnerAuthViewModel.launchAuthInBrowser$lambda$6$lambda$5(strBrowserReadyUrl, (SharedPartnerAuthState) obj);
                }
            });
            this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AuthSessionOpened(getPane(), authSession.getFlow(), this.browserManager.getPackageToHandleUri(Uri.parse(strBrowserReadyUrl)), authSession.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPartnerAuthState launchAuthInBrowser$lambda$6$lambda$5(String str, SharedPartnerAuthState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return SharedPartnerAuthState.copy$default(setState, null, null, new SharedPartnerAuthState.ViewEffect.OpenPartnerAuth(str), null, false, 27, null);
    }

    private final String browserReadyUrl(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession) {
        String url = financialConnectionsAuthorizationSession.getUrl();
        if (url == null) {
            return null;
        }
        return StringsKt.replaceFirst$default(url, "stripe-auth://native-redirect/" + this.applicationId + "/", "", false, 4, (Object) null);
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onWebAuthFlowFinished$1", f = "PartnerAuthViewModel.kt", i = {}, l = {TiffUtil.TIFF_TAG_ORIENTATION, 278, 290}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onWebAuthFlowFinished$1, reason: invalid class name and case insensitive filesystem */
    static final class C09611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WebAuthFlowState $webStatus;
        int label;
        final /* synthetic */ PartnerAuthViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09611(WebAuthFlowState webAuthFlowState, PartnerAuthViewModel partnerAuthViewModel, Continuation<? super C09611> continuation) {
            super(2, continuation);
            this.$webStatus = webAuthFlowState;
            this.this$0 = partnerAuthViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09611(this.$webStatus, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (r6.this$0.onAuthCancelled(((com.stripe.android.financialconnections.presentation.WebAuthFlowState.Canceled) r7).getUrl(), r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        
            if (r6.this$0.onAuthFailed(((com.stripe.android.financialconnections.presentation.WebAuthFlowState.Failed) r7).getUrl(), ((com.stripe.android.financialconnections.presentation.WebAuthFlowState.Failed) r6.$webStatus).getMessage(), ((com.stripe.android.financialconnections.presentation.WebAuthFlowState.Failed) r6.$webStatus).getReason(), r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
        
            if (r6.this$0.completeAuthorizationSession(((com.stripe.android.financialconnections.presentation.WebAuthFlowState.Success) r6.$webStatus).getUrl(), r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WebAuthFlowState webAuthFlowState = this.$webStatus;
                if (webAuthFlowState instanceof WebAuthFlowState.Canceled) {
                    this.label = 1;
                } else if (webAuthFlowState instanceof WebAuthFlowState.Failed) {
                    this.label = 2;
                } else if (Intrinsics.areEqual(webAuthFlowState, WebAuthFlowState.InProgress.INSTANCE)) {
                    this.this$0.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onWebAuthFlowFinished$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PartnerAuthViewModel.C09611.invokeSuspend$lambda$0((SharedPartnerAuthState) obj2);
                        }
                    });
                } else if (webAuthFlowState instanceof WebAuthFlowState.Success) {
                    this.label = 3;
                } else if (!Intrinsics.areEqual(webAuthFlowState, WebAuthFlowState.Uninitialized.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SharedPartnerAuthState invokeSuspend$lambda$0(SharedPartnerAuthState sharedPartnerAuthState) {
            return SharedPartnerAuthState.copy$default(sharedPartnerAuthState, null, null, null, new Async.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.Action.AUTHENTICATING)), false, 23, null);
        }
    }

    public final void onWebAuthFlowFinished(WebAuthFlowState webStatus) {
        Intrinsics.checkNotNullParameter(webStatus, "webStatus");
        this.logger.debug("Web AuthFlow status received " + webStatus);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09611(webStatus, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:41:0x00ee, B:29:0x007e, B:31:0x0091, B:33:0x0097, B:35:0x00b5, B:40:0x00e5), top: B:51:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:41:0x00ee, B:29:0x007e, B:31:0x0091, B:33:0x0097, B:35:0x00b5, B:40:0x00e5), top: B:51:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:41:0x00ee, B:29:0x007e, B:31:0x0091, B:33:0x0097, B:35:0x00b5, B:40:0x00e5), top: B:51:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onAuthFailed(String str, String str2, String str3, Continuation<? super Unit> continuation) {
        C09591 c09591;
        Throwable th;
        PartnerAuthViewModel partnerAuthViewModel;
        Object objM9118constructorimpl;
        PartnerAuthViewModel partnerAuthViewModel2;
        Throwable thM9121exceptionOrNullimpl;
        final WebAuthFlowFailedException webAuthFlowFailedException;
        Object obj;
        PartnerAuthViewModel partnerAuthViewModel3;
        FinancialConnectionsAuthorizationSession activeAuthSession;
        WebAuthFlowFailedException webAuthFlowFailedException2;
        PartnerAuthViewModel partnerAuthViewModel4;
        if (continuation instanceof C09591) {
            c09591 = (C09591) continuation;
            if ((c09591.label & Integer.MIN_VALUE) != 0) {
                c09591.label -= Integer.MIN_VALUE;
            } else {
                c09591 = new C09591(continuation);
            }
        }
        C09591 c095912 = c09591;
        Object obj2 = c095912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c095912.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj2);
                webAuthFlowFailedException = new WebAuthFlowFailedException(str2, str3);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    GetOrFetchSync getOrFetchSync = this.getOrFetchSync;
                    c095912.L$0 = this;
                    c095912.L$1 = str;
                    c095912.L$2 = webAuthFlowFailedException;
                    c095912.label = 1;
                    Object objInvoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, false, c095912, 3, null);
                    if (objInvoke$default != coroutine_suspended) {
                        obj = objInvoke$default;
                        partnerAuthViewModel3 = this;
                        activeAuthSession = ((SynchronizeSessionResponse) obj).getManifest().getActiveAuthSession();
                        partnerAuthViewModel3.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AuthSessionUrlReceived(partnerAuthViewModel3.getPane(), str, "failed", activeAuthSession == null ? activeAuthSession.getId() : null));
                        FinancialConnectionsAnalyticsTrackerKt.logError(partnerAuthViewModel3.eventTracker, "Auth failed, cancelling AuthSession", webAuthFlowFailedException, partnerAuthViewModel3.logger, partnerAuthViewModel3.getPane());
                        if (activeAuthSession == null) {
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    partnerAuthViewModel = this;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    partnerAuthViewModel2 = partnerAuthViewModel;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i == 1) {
                WebAuthFlowFailedException webAuthFlowFailedException3 = (WebAuthFlowFailedException) c095912.L$2;
                String str4 = (String) c095912.L$1;
                PartnerAuthViewModel partnerAuthViewModel5 = (PartnerAuthViewModel) c095912.L$0;
                try {
                    ResultKt.throwOnFailure(obj2);
                    webAuthFlowFailedException = webAuthFlowFailedException3;
                    str = str4;
                    partnerAuthViewModel3 = partnerAuthViewModel5;
                    obj = obj2;
                    activeAuthSession = ((SynchronizeSessionResponse) obj).getManifest().getActiveAuthSession();
                    partnerAuthViewModel3.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AuthSessionUrlReceived(partnerAuthViewModel3.getPane(), str, "failed", activeAuthSession == null ? activeAuthSession.getId() : null));
                    FinancialConnectionsAnalyticsTrackerKt.logError(partnerAuthViewModel3.eventTracker, "Auth failed, cancelling AuthSession", webAuthFlowFailedException, partnerAuthViewModel3.logger, partnerAuthViewModel3.getPane());
                    if (activeAuthSession == null) {
                        partnerAuthViewModel3.postAuthSessionEvent.invoke(activeAuthSession.getId(), new AuthSessionEvent.Failure(new Date(), webAuthFlowFailedException));
                        CancelAuthorizationSession cancelAuthorizationSession = partnerAuthViewModel3.cancelAuthorizationSession;
                        String id = activeAuthSession.getId();
                        c095912.L$0 = partnerAuthViewModel3;
                        c095912.L$1 = webAuthFlowFailedException;
                        c095912.L$2 = null;
                        c095912.label = 2;
                        if (cancelAuthorizationSession.invoke(id, c095912) != coroutine_suspended) {
                            webAuthFlowFailedException2 = webAuthFlowFailedException;
                            partnerAuthViewModel4 = partnerAuthViewModel3;
                            webAuthFlowFailedException = webAuthFlowFailedException2;
                            str2 = partnerAuthViewModel4;
                            str2.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return PartnerAuthViewModel.onAuthFailed$lambda$8$lambda$7(webAuthFlowFailedException, (SharedPartnerAuthState) obj3);
                                }
                            });
                            objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                            partnerAuthViewModel2 = str2;
                        }
                        return coroutine_suspended;
                    }
                    partnerAuthViewModel3.logger.debug("Could not find AuthSession to cancel.");
                    Unit unit = Unit.INSTANCE;
                    str2 = partnerAuthViewModel3;
                    str2.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return PartnerAuthViewModel.onAuthFailed$lambda$8$lambda$7(webAuthFlowFailedException, (SharedPartnerAuthState) obj3);
                        }
                    });
                    objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                    partnerAuthViewModel2 = str2;
                } catch (Throwable th3) {
                    th = th3;
                    partnerAuthViewModel = partnerAuthViewModel5;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    partnerAuthViewModel2 = partnerAuthViewModel;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webAuthFlowFailedException2 = (WebAuthFlowFailedException) c095912.L$1;
                PartnerAuthViewModel partnerAuthViewModel6 = (PartnerAuthViewModel) c095912.L$0;
                ResultKt.throwOnFailure(obj2);
                partnerAuthViewModel4 = partnerAuthViewModel6;
                webAuthFlowFailedException = webAuthFlowFailedException2;
                str2 = partnerAuthViewModel4;
                str2.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return PartnerAuthViewModel.onAuthFailed$lambda$8$lambda$7(webAuthFlowFailedException, (SharedPartnerAuthState) obj3);
                    }
                });
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                partnerAuthViewModel2 = str2;
            }
        } catch (Throwable th4) {
            th = th4;
            partnerAuthViewModel = str2;
        }
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            FinancialConnectionsAnalyticsTrackerKt.logError(partnerAuthViewModel2.eventTracker, "failed cancelling session after failed web flow", thM9121exceptionOrNullimpl, partnerAuthViewModel2.logger, partnerAuthViewModel2.getPane());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPartnerAuthState onAuthFailed$lambda$8$lambda$7(WebAuthFlowFailedException webAuthFlowFailedException, SharedPartnerAuthState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return SharedPartnerAuthState.copy$default(setState, null, null, null, new Async.Fail(webAuthFlowFailedException), false, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015f, code lost:
    
        if (r3.cancelAuthSessionAndContinue(r4, r6) == r2) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca A[Catch: all -> 0x0175, TryCatch #1 {all -> 0x0175, blocks: (B:53:0x00f9, B:55:0x0115, B:58:0x0124, B:39:0x00b2, B:44:0x00ca, B:46:0x00d0, B:48:0x00de, B:50:0x00e4, B:60:0x0154, B:65:0x0169, B:66:0x0174), top: B:82:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de A[Catch: all -> 0x0175, TryCatch #1 {all -> 0x0175, blocks: (B:53:0x00f9, B:55:0x0115, B:58:0x0124, B:39:0x00b2, B:44:0x00ca, B:46:0x00d0, B:48:0x00de, B:50:0x00e4, B:60:0x0154, B:65:0x0169, B:66:0x0174), top: B:82:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115 A[Catch: all -> 0x0175, TryCatch #1 {all -> 0x0175, blocks: (B:53:0x00f9, B:55:0x0115, B:58:0x0124, B:39:0x00b2, B:44:0x00ca, B:46:0x00d0, B:48:0x00de, B:50:0x00e4, B:60:0x0154, B:65:0x0169, B:66:0x0174), top: B:82:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124 A[Catch: all -> 0x0175, TryCatch #1 {all -> 0x0175, blocks: (B:53:0x00f9, B:55:0x0115, B:58:0x0124, B:39:0x00b2, B:44:0x00ca, B:46:0x00d0, B:48:0x00de, B:50:0x00e4, B:60:0x0154, B:65:0x0169, B:66:0x0174), top: B:82:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169 A[Catch: all -> 0x0175, TRY_ENTER, TryCatch #1 {all -> 0x0175, blocks: (B:53:0x00f9, B:55:0x0115, B:58:0x0124, B:39:0x00b2, B:44:0x00ca, B:46:0x00d0, B:48:0x00de, B:50:0x00e4, B:60:0x0154, B:65:0x0169, B:66:0x0174), top: B:82:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onAuthCancelled(String str, Continuation<? super Unit> continuation) {
        C09581 c09581;
        String str2;
        PartnerAuthViewModel partnerAuthViewModel;
        FinancialConnectionsAuthorizationSession activeAuthSession;
        String str3;
        FinancialConnectionsSessionManifest.Pane nextPane;
        Object objM9118constructorimpl;
        final Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof C09581) {
            c09581 = (C09581) continuation;
            if ((c09581.label & Integer.MIN_VALUE) != 0) {
                c09581.label -= Integer.MIN_VALUE;
            } else {
                c09581 = new C09581(continuation);
            }
        }
        C09581 c095812 = c09581;
        Object objInvoke$default = c095812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c095812.label;
        if (i != 0) {
            if (i == 1) {
                String str4 = (String) c095812.L$1;
                PartnerAuthViewModel partnerAuthViewModel2 = (PartnerAuthViewModel) c095812.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke$default);
                    str2 = str4;
                    partnerAuthViewModel = partnerAuthViewModel2;
                    try {
                        FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) objInvoke$default).getManifest();
                        activeAuthSession = manifest.getActiveAuthSession();
                        partnerAuthViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AuthSessionUrlReceived(partnerAuthViewModel.getPane(), str2 != null ? "none" : str2, AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, activeAuthSession == null ? activeAuthSession.getId() : null));
                        if (activeAuthSession != null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        if (ManifestExtensionsKt.enableRetrieveAuthSession(manifest)) {
                            RetrieveAuthorizationSession retrieveAuthorizationSession = partnerAuthViewModel.retrieveAuthorizationSession;
                            String id = activeAuthSession.getId();
                            c095812.L$0 = partnerAuthViewModel;
                            c095812.L$1 = str2;
                            c095812.L$2 = activeAuthSession;
                            c095812.label = 2;
                            objInvoke$default = retrieveAuthorizationSession.invoke(id, c095812);
                            if (objInvoke$default != coroutine_suspended) {
                                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) objInvoke$default;
                                nextPane = financialConnectionsAuthorizationSession.getNextPane();
                                partnerAuthViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AuthSessionRetrieved(nextPane, financialConnectionsAuthorizationSession.getId()));
                                if (nextPane != partnerAuthViewModel.getPane()) {
                                }
                                str3 = str2;
                                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                            }
                        } else {
                            c095812.L$0 = partnerAuthViewModel;
                            c095812.L$1 = str2;
                            c095812.label = 4;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str4;
                    partnerAuthViewModel = partnerAuthViewModel2;
                }
            } else if (i == 2) {
                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) c095812.L$2;
                String str5 = (String) c095812.L$1;
                PartnerAuthViewModel partnerAuthViewModel3 = (PartnerAuthViewModel) c095812.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke$default);
                    str2 = str5;
                    activeAuthSession = financialConnectionsAuthorizationSession2;
                    partnerAuthViewModel = partnerAuthViewModel3;
                    FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession3 = (FinancialConnectionsAuthorizationSession) objInvoke$default;
                    nextPane = financialConnectionsAuthorizationSession3.getNextPane();
                    partnerAuthViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AuthSessionRetrieved(nextPane, financialConnectionsAuthorizationSession3.getId()));
                    if (nextPane != partnerAuthViewModel.getPane()) {
                        c095812.L$0 = partnerAuthViewModel;
                        c095812.L$1 = str2;
                        c095812.L$2 = null;
                        c095812.label = 3;
                        if (partnerAuthViewModel.cancelAuthSessionAndContinue(financialConnectionsAuthorizationSession3, c095812) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        partnerAuthViewModel.postAuthSessionEvent.invoke(activeAuthSession.getId(), new AuthSessionEvent.Success(new Date()));
                        NavigationManager.DefaultImpls.tryNavigateTo$default(partnerAuthViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(nextPane), partnerAuthViewModel.getPane(), null, 2, null), null, false, 6, null);
                    }
                    str3 = str2;
                    objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    th = th3;
                    str2 = str5;
                    partnerAuthViewModel = partnerAuthViewModel3;
                }
            } else {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) c095812.L$1;
                partnerAuthViewModel = (PartnerAuthViewModel) c095812.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke$default);
                    objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                } catch (Throwable th4) {
                    th = th4;
                    str2 = str3;
                }
            }
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            str3 = str2;
        } else {
            ResultKt.throwOnFailure(objInvoke$default);
            try {
                Result.Companion companion2 = Result.INSTANCE;
                this.logger.debug("Auth cancelled, cancelling AuthSession");
                setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PartnerAuthViewModel.onAuthCancelled$lambda$11$lambda$10((SharedPartnerAuthState) obj);
                    }
                });
                GetOrFetchSync getOrFetchSync = this.getOrFetchSync;
                GetOrFetchSync.RefetchCondition.IfMissingActiveAuthSession ifMissingActiveAuthSession = GetOrFetchSync.RefetchCondition.IfMissingActiveAuthSession.INSTANCE;
                c095812.L$0 = this;
                str2 = str;
                try {
                    c095812.L$1 = str2;
                    c095812.label = 1;
                    objInvoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, ifMissingActiveAuthSession, false, c095812, 2, null);
                    if (objInvoke$default != coroutine_suspended) {
                        partnerAuthViewModel = this;
                        FinancialConnectionsSessionManifest manifest2 = ((SynchronizeSessionResponse) objInvoke$default).getManifest();
                        activeAuthSession = manifest2.getActiveAuthSession();
                        partnerAuthViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AuthSessionUrlReceived(partnerAuthViewModel.getPane(), str2 != null ? "none" : str2, AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, activeAuthSession == null ? activeAuthSession.getId() : null));
                        if (activeAuthSession != null) {
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th5) {
                    th = th5;
                    partnerAuthViewModel = this;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    str3 = str2;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            } catch (Throwable th6) {
                th = th6;
                str2 = str;
            }
        }
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            FinancialConnectionsAnalyticsTrackerKt.logError(partnerAuthViewModel.eventTracker, "failed cancelling session after cancelled web flow. url: " + str3, thM9121exceptionOrNullimpl, partnerAuthViewModel.logger, partnerAuthViewModel.getPane());
            partnerAuthViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PartnerAuthViewModel.onAuthCancelled$lambda$13$lambda$12(thM9121exceptionOrNullimpl, (SharedPartnerAuthState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPartnerAuthState onAuthCancelled$lambda$11$lambda$10(SharedPartnerAuthState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return SharedPartnerAuthState.copy$default(setState, null, null, null, new Async.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.Action.AUTHENTICATING)), false, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPartnerAuthState onAuthCancelled$lambda$13$lambda$12(Throwable th, SharedPartnerAuthState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return SharedPartnerAuthState.copy$default(setState, null, null, null, new Async.Fail(th), false, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelAuthSessionAndContinue(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        PartnerAuthViewModel partnerAuthViewModel;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objInvoke = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            CancelAuthorizationSession cancelAuthorizationSession = this.cancelAuthorizationSession;
            String id = financialConnectionsAuthorizationSession.getId();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = financialConnectionsAuthorizationSession;
            anonymousClass1.label = 1;
            objInvoke = cancelAuthorizationSession.invoke(id, anonymousClass1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            partnerAuthViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) anonymousClass1.L$1;
            partnerAuthViewModel = (PartnerAuthViewModel) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) objInvoke;
        if (financialConnectionsAuthorizationSession.isOAuth()) {
            partnerAuthViewModel.logger.debug("Creating a new session for this OAuth institution");
            partnerAuthViewModel.postAuthSessionEvent.invoke(financialConnectionsAuthorizationSession.getId(), new AuthSessionEvent.Retry(new Date()));
            partnerAuthViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PartnerAuthViewModel.cancelAuthSessionAndContinue$lambda$14((SharedPartnerAuthState) obj);
                }
            });
            partnerAuthViewModel.recreateAuthSession();
        } else {
            partnerAuthViewModel.postAuthSessionEvent.invoke(financialConnectionsAuthorizationSession.getId(), new AuthSessionEvent.Cancel(new Date()));
            NavigationManager.DefaultImpls.tryNavigateTo$default(partnerAuthViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(financialConnectionsAuthorizationSession2.getNextPane()), partnerAuthViewModel.getPane(), null, 2, null), new PopUpToBehavior.Current(true), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPartnerAuthState cancelAuthSessionAndContinue$lambda$14(SharedPartnerAuthState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return SharedPartnerAuthState.copy$default(setState, null, null, null, Async.Uninitialized.INSTANCE, false, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0104, code lost:
    
        if (r14 != r0) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:14:0x0032, B:47:0x0107, B:50:0x012f, B:44:0x00e7, B:33:0x0090, B:35:0x00a2, B:37:0x00a8, B:39:0x00b6, B:41:0x00d1, B:49:0x0122, B:51:0x0146, B:52:0x0151), top: B:64:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:14:0x0032, B:47:0x0107, B:50:0x012f, B:44:0x00e7, B:33:0x0090, B:35:0x00a2, B:37:0x00a8, B:39:0x00b6, B:41:0x00d1, B:49:0x0122, B:51:0x0146, B:52:0x0151), top: B:64:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:14:0x0032, B:47:0x0107, B:50:0x012f, B:44:0x00e7, B:33:0x0090, B:35:0x00a2, B:37:0x00a8, B:39:0x00b6, B:41:0x00d1, B:49:0x0122, B:51:0x0146, B:52:0x0151), top: B:64:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object completeAuthorizationSession(String str, Continuation<? super Unit> continuation) {
        C09511 c09511;
        Throwable th;
        PartnerAuthViewModel partnerAuthViewModel;
        Object objM9118constructorimpl;
        PartnerAuthViewModel partnerAuthViewModel2;
        final Throwable thM9121exceptionOrNullimpl;
        String str2;
        PartnerAuthViewModel partnerAuthViewModel3;
        Object obj;
        FinancialConnectionsAuthorizationSession activeAuthSession;
        PartnerAuthViewModel partnerAuthViewModel4;
        String strInvoke$default;
        PartnerAuthViewModel partnerAuthViewModel5;
        PartnerAuthViewModel partnerAuthViewModel6;
        if (continuation instanceof C09511) {
            c09511 = (C09511) continuation;
            if ((c09511.label & Integer.MIN_VALUE) != 0) {
                c09511.label -= Integer.MIN_VALUE;
            } else {
                c09511 = new C09511(continuation);
            }
        }
        C09511 c095112 = c09511;
        Object objInvoke = c095112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = c095112.label;
        try {
            if (r1 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PartnerAuthViewModel.completeAuthorizationSession$lambda$16$lambda$15((SharedPartnerAuthState) obj2);
                        }
                    });
                    GetOrFetchSync getOrFetchSync = this.getOrFetchSync;
                    GetOrFetchSync.RefetchCondition.IfMissingActiveAuthSession ifMissingActiveAuthSession = GetOrFetchSync.RefetchCondition.IfMissingActiveAuthSession.INSTANCE;
                    c095112.L$0 = this;
                    c095112.L$1 = str;
                    c095112.label = 1;
                    Object objInvoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, ifMissingActiveAuthSession, false, c095112, 2, null);
                    if (objInvoke$default != coroutine_suspended) {
                        obj = objInvoke$default;
                        str2 = str;
                        partnerAuthViewModel3 = this;
                        activeAuthSession = ((SynchronizeSessionResponse) obj).getManifest().getActiveAuthSession();
                        partnerAuthViewModel3.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AuthSessionUrlReceived(partnerAuthViewModel3.getPane(), str2, GraphResponse.SUCCESS_KEY, activeAuthSession == null ? activeAuthSession.getId() : null));
                        if (activeAuthSession != null) {
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    partnerAuthViewModel = this;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    partnerAuthViewModel2 = partnerAuthViewModel;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            try {
                if (r1 == 1) {
                    String str3 = (String) c095112.L$1;
                    PartnerAuthViewModel partnerAuthViewModel7 = (PartnerAuthViewModel) c095112.L$0;
                    ResultKt.throwOnFailure(objInvoke);
                    str2 = str3;
                    partnerAuthViewModel3 = partnerAuthViewModel7;
                    obj = objInvoke;
                    activeAuthSession = ((SynchronizeSessionResponse) obj).getManifest().getActiveAuthSession();
                    partnerAuthViewModel3.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AuthSessionUrlReceived(partnerAuthViewModel3.getPane(), str2, GraphResponse.SUCCESS_KEY, activeAuthSession == null ? activeAuthSession.getId() : null));
                    if (activeAuthSession != null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    partnerAuthViewModel3.postAuthSessionEvent.invoke(activeAuthSession.getId(), new AuthSessionEvent.Success(new Date()));
                    if (activeAuthSession.isOAuth()) {
                        partnerAuthViewModel3.logger.debug("Web AuthFlow completed! waiting for oauth results");
                        PollAuthorizationSessionOAuthResults pollAuthorizationSessionOAuthResults = partnerAuthViewModel3.pollAuthorizationSessionOAuthResults;
                        c095112.L$0 = partnerAuthViewModel3;
                        c095112.L$1 = activeAuthSession;
                        c095112.label = 2;
                        objInvoke = pollAuthorizationSessionOAuthResults.invoke(activeAuthSession, c095112);
                        partnerAuthViewModel4 = partnerAuthViewModel3;
                        if (objInvoke != coroutine_suspended) {
                            partnerAuthViewModel4.logger.debug("OAuth results received! completing session");
                            CompleteAuthorizationSession completeAuthorizationSession = partnerAuthViewModel4.completeAuthorizationSession;
                            String id = activeAuthSession.getId();
                            String publicToken = ((MixedOAuthParams) objInvoke).getPublicToken();
                            c095112.L$0 = partnerAuthViewModel4;
                            c095112.L$1 = null;
                            c095112.label = 3;
                            objInvoke = completeAuthorizationSession.invoke(id, publicToken, c095112);
                            partnerAuthViewModel6 = partnerAuthViewModel4;
                        }
                        return coroutine_suspended;
                    }
                    strInvoke$default = Destination.invoke$default(Destination.AccountPicker.INSTANCE, partnerAuthViewModel3.getPane(), null, 2, null);
                    partnerAuthViewModel5 = partnerAuthViewModel3;
                } else if (r1 == 2) {
                    FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) c095112.L$1;
                    PartnerAuthViewModel partnerAuthViewModel8 = (PartnerAuthViewModel) c095112.L$0;
                    ResultKt.throwOnFailure(objInvoke);
                    activeAuthSession = financialConnectionsAuthorizationSession;
                    partnerAuthViewModel4 = partnerAuthViewModel8;
                    partnerAuthViewModel4.logger.debug("OAuth results received! completing session");
                    CompleteAuthorizationSession completeAuthorizationSession2 = partnerAuthViewModel4.completeAuthorizationSession;
                    String id2 = activeAuthSession.getId();
                    String publicToken2 = ((MixedOAuthParams) objInvoke).getPublicToken();
                    c095112.L$0 = partnerAuthViewModel4;
                    c095112.L$1 = null;
                    c095112.label = 3;
                    objInvoke = completeAuthorizationSession2.invoke(id2, publicToken2, c095112);
                    partnerAuthViewModel6 = partnerAuthViewModel4;
                } else {
                    if (r1 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    PartnerAuthViewModel partnerAuthViewModel9 = (PartnerAuthViewModel) c095112.L$0;
                    ResultKt.throwOnFailure(objInvoke);
                    partnerAuthViewModel6 = partnerAuthViewModel9;
                    partnerAuthViewModel6.logger.debug("Session authorized!");
                    strInvoke$default = Destination.invoke$default(DestinationMappersKt.getDestination(((FinancialConnectionsAuthorizationSession) objInvoke).getNextPane()), partnerAuthViewModel6.getPane(), null, 2, null);
                    partnerAuthViewModel5 = partnerAuthViewModel6;
                }
            } catch (Throwable th3) {
                th = th3;
                partnerAuthViewModel = r1;
                Result.Companion companion22 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                partnerAuthViewModel2 = partnerAuthViewModel;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            String str4 = strInvoke$default;
            FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.INSTITUTION_AUTHORIZED, null, 2, null);
            NavigationManager.DefaultImpls.tryNavigateTo$default(partnerAuthViewModel5.navigationManager, str4, null, false, 6, null);
            objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
            partnerAuthViewModel2 = partnerAuthViewModel5;
        } catch (Throwable th4) {
            th = th4;
            partnerAuthViewModel = str;
        }
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            FinancialConnectionsAnalyticsTrackerKt.logError(partnerAuthViewModel2.eventTracker, "failed authorizing session", thM9121exceptionOrNullimpl, partnerAuthViewModel2.logger, partnerAuthViewModel2.getPane());
            partnerAuthViewModel2.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PartnerAuthViewModel.completeAuthorizationSession$lambda$18$lambda$17(thM9121exceptionOrNullimpl, (SharedPartnerAuthState) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPartnerAuthState completeAuthorizationSession$lambda$16$lambda$15(SharedPartnerAuthState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return SharedPartnerAuthState.copy$default(setState, null, null, null, new Async.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.Action.AUTHENTICATING)), false, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPartnerAuthState completeAuthorizationSession$lambda$18$lambda$17(Throwable th, SharedPartnerAuthState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return SharedPartnerAuthState.copy$default(setState, null, null, null, new Async.Fail(th), false, 23, null);
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onClickableTextClick$1", f = "PartnerAuthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onClickableTextClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $uri;
        int label;

        /* compiled from: PartnerAuthViewModel.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onClickableTextClick$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SharedPartnerAuthState.ClickableText.values().length];
                try {
                    iArr[SharedPartnerAuthState.ClickableText.DATA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09601(String str, Continuation<? super C09601> continuation) {
            super(2, continuation);
            this.$uri = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PartnerAuthViewModel.this.new C09601(this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SharedPartnerAuthState.ClickableText next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                String queryParameter = PartnerAuthViewModel.this.uriUtils.getQueryParameter(this.$uri, HandleClickableUrl.ClickableLinkParameters.EVENT_NAME);
                if (queryParameter != null) {
                    PartnerAuthViewModel partnerAuthViewModel = PartnerAuthViewModel.this;
                    partnerAuthViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(queryParameter, partnerAuthViewModel.getPane()));
                }
                if (URLUtil.isNetworkUrl(this.$uri)) {
                    PartnerAuthViewModel partnerAuthViewModel2 = PartnerAuthViewModel.this;
                    final String str = this.$uri;
                    partnerAuthViewModel2.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onClickableTextClick$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PartnerAuthViewModel.C09601.invokeSuspend$lambda$1(str, (SharedPartnerAuthState) obj2);
                        }
                    });
                } else {
                    EnumEntries<SharedPartnerAuthState.ClickableText> entries = SharedPartnerAuthState.ClickableText.getEntries();
                    PartnerAuthViewModel partnerAuthViewModel3 = PartnerAuthViewModel.this;
                    String str2 = this.$uri;
                    Iterator<SharedPartnerAuthState.ClickableText> it = entries.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (partnerAuthViewModel3.uriUtils.compareSchemeAuthorityAndPath(next.getValue(), str2)) {
                            break;
                        }
                    }
                    SharedPartnerAuthState.ClickableText clickableText = next;
                    int i = clickableText == null ? -1 : WhenMappings.$EnumSwitchMapping$0[clickableText.ordinal()];
                    if (i == -1) {
                        Logger.DefaultImpls.error$default(PartnerAuthViewModel.this.logger, "Unrecognized clickable text: " + this.$uri, null, 2, null);
                    } else if (i == 1) {
                        PartnerAuthViewModel.this.presentDataAccessBottomSheet();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SharedPartnerAuthState invokeSuspend$lambda$1(String str, SharedPartnerAuthState sharedPartnerAuthState) {
            return SharedPartnerAuthState.copy$default(sharedPartnerAuthState, null, null, new SharedPartnerAuthState.ViewEffect.OpenUrl(str, new Date().getTime()), null, false, 27, null);
        }
    }

    public final Job onClickableTextClick(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09601(uri, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentDataAccessBottomSheet() {
        Display display;
        TextUpdate text;
        ConsentPane consent;
        DataAccessNotice dataAccessNotice;
        SharedPartnerAuthState.Payload payloadInvoke = getStateFlow().getValue().getPayload().invoke();
        FinancialConnectionsAuthorizationSession authSession = payloadInvoke != null ? payloadInvoke.getAuthSession() : null;
        if (authSession == null || (display = authSession.getDisplay()) == null || (text = display.getText()) == null || (consent = text.getConsent()) == null || (dataAccessNotice = consent.getDataAccessNotice()) == null) {
            return;
        }
        this.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.DataAccess(dataAccessNotice), getPane());
    }

    public final void onViewEffectLaunched() {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PartnerAuthViewModel.onViewEffectLaunched$lambda$19((SharedPartnerAuthState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPartnerAuthState onViewEffectLaunched$lambda$19(SharedPartnerAuthState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return SharedPartnerAuthState.copy$default(setState, null, null, null, null, false, 27, null);
    }

    public final void onCancelClick() {
        withState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PartnerAuthViewModel.onCancelClick$lambda$20(this.f$0, (SharedPartnerAuthState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCancelClick$lambda$20(PartnerAuthViewModel partnerAuthViewModel, SharedPartnerAuthState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getInModal()) {
            partnerAuthViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PrepaneClickCancel(partnerAuthViewModel.getPane()));
        } else {
            partnerAuthViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PrepaneClickChooseAnotherBank(partnerAuthViewModel.getPane()));
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(partnerAuthViewModel), null, null, new PartnerAuthViewModel$onCancelClick$1$1(partnerAuthViewModel, state, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelInModal() {
        this.navigationManager.tryNavigateBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelInFullscreen() {
        NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.InstitutionPicker.INSTANCE, getPane(), null, 2, null), new PopUpToBehavior.Current(true), false, 4, null);
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Args;", "Landroid/os/Parcelable;", "inModal", "", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "getInModal", "()Z", "getPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {
        private final boolean inModal;
        private final FinancialConnectionsSessionManifest.Pane pane;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PartnerAuthViewModel.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, FinancialConnectionsSessionManifest.Pane.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, FinancialConnectionsSessionManifest.Pane pane, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.inModal;
            }
            if ((i & 2) != 0) {
                pane = args.pane;
            }
            return args.copy(z, pane);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getInModal() {
            return this.inModal;
        }

        /* renamed from: component2, reason: from getter */
        public final FinancialConnectionsSessionManifest.Pane getPane() {
            return this.pane;
        }

        public final Args copy(boolean inModal, FinancialConnectionsSessionManifest.Pane pane) {
            Intrinsics.checkNotNullParameter(pane, "pane");
            return new Args(inModal, pane);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.inModal == args.inModal && this.pane == args.pane;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.inModal) * 31) + this.pane.hashCode();
        }

        public String toString() {
            return "Args(inModal=" + this.inModal + ", pane=" + this.pane + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.inModal ? 1 : 0);
            dest.writeString(this.pane.name());
        }

        public Args(boolean z, FinancialConnectionsSessionManifest.Pane pane) {
            Intrinsics.checkNotNullParameter(pane, "pane");
            this.inModal = z;
            this.pane = pane;
        }

        public final boolean getInModal() {
            return this.inModal;
        }

        public final FinancialConnectionsSessionManifest.Pane getPane() {
            return this.pane;
        }
    }

    /* compiled from: PartnerAuthViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", CardScanActivity.ARGS, "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Args;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PartnerAuthViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, Args args, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getPartnerAuthViewModelFactory().create(new SharedPartnerAuthState(args));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent, final Args args) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            Intrinsics.checkNotNullParameter(args, "args");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(PartnerAuthViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PartnerAuthViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, args, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
