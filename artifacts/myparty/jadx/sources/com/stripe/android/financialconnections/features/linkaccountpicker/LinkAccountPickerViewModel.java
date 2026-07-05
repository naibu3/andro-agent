package com.stripe.android.financialconnections.features.linkaccountpicker;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.FetchNetworkedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.SelectNetworkedAccounts;
import com.stripe.android.financialconnections.domain.UpdateCachedAccounts;
import com.stripe.android.financialconnections.exception.UnclassifiedError;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.NetworkedAccountsList;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.ReturningNetworkingUserAccountPicker;
import com.stripe.android.financialconnections.model.ShareNetworkedAccountsResponse;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import com.stripe.android.uicore.navigation.NavigationManager;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import defpackage.FinancialConnectionsGenericInfoScreen;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: LinkAccountPickerViewModel.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002CDBs\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\"H\u0002J\u0006\u0010+\u001a\u00020'J\u0006\u0010,\u001a\u00020\"J,\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020)2\f\u00101\u001a\b\u0012\u0004\u0012\u00020)02H\u0082@¢\u0006\u0002\u00103J \u00104\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\b\u00105\u001a\u0004\u0018\u000106H\u0082@¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020:H\u0002J\u000e\u0010;\u001a\u00020\"2\u0006\u00109\u001a\u00020:J\u0016\u0010<\u001a\u0004\u0018\u00010=*\u00020:2\u0006\u0010$\u001a\u00020%H\u0002J\f\u0010>\u001a\u00020\"*\u00020=H\u0002J\u0010\u0010?\u001a\u00020\"2\u0006\u0010@\u001a\u00020AH\u0002J\u0006\u0010B\u001a\u00020\"R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "consumerSessionProvider", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;", "handleClickableUrl", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;", "fetchNetworkedAccounts", "Lcom/stripe/android/financialconnections/domain/FetchNetworkedAccounts;", "selectNetworkedAccounts", "Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;", "updateCachedAccounts", "Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;", "getSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "logger", "Lcom/stripe/android/core/Logger;", "acceptConsent", "Lcom/stripe/android/financialconnections/domain/AcceptConsent;", "presentSheet", "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;", "<init>", "(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/financialconnections/domain/FetchNetworkedAccounts;Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;)V", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "observeAsyncs", "", "skipToNextPane", "payload", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;", "onClickableTextClick", "Lkotlinx/coroutines/Job;", ShareConstants.MEDIA_URI, "", "presentDataAccessBottomSheet", "onNewBankAccountClick", "onSelectAccountsClick", "selectAccounts", "acquireConsentOnPrimaryCtaClick", "", "consumerSessionClientSecret", "accountIds", "", "(ZLjava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleNonSuccessNextPane", "nextPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logAccountClick", "partnerAccount", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "onAccountClick", "computeDrawerPayload", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "present", "logUpdateRequired", "type", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;", "onViewEffectLaunched", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkAccountPickerViewModel extends FinancialConnectionsViewModel<LinkAccountPickerState> {
    private final AcceptConsent acceptConsent;
    private final ConsumerSessionProvider consumerSessionProvider;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final FetchNetworkedAccounts fetchNetworkedAccounts;
    private final GetOrFetchSync getSync;
    private final HandleClickableUrl handleClickableUrl;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final PresentSheet presentSheet;
    private final SelectNetworkedAccounts selectNetworkedAccounts;
    private final UpdateCachedAccounts updateCachedAccounts;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.LINK_ACCOUNT_PICKER;

    /* compiled from: LinkAccountPickerViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        LinkAccountPickerViewModel create(LinkAccountPickerState initialState);
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSessionManifest.Pane.values().length];
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel", f = "LinkAccountPickerViewModel.kt", i = {0, 0}, l = {TypedValues.AttributesType.TYPE_PIVOT_TARGET}, m = "handleNonSuccessNextPane", n = {"this", "nextPane"}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$handleNonSuccessNextPane$1, reason: invalid class name and case insensitive filesystem */
    static final class C09061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C09061(Continuation<? super C09061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkAccountPickerViewModel.this.handleNonSuccessNextPane(null, null, this);
        }
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel", f = "LinkAccountPickerViewModel.kt", i = {0}, l = {275}, m = "selectAccounts", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$selectAccounts$1, reason: invalid class name and case insensitive filesystem */
    static final class C09111 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C09111(Continuation<? super C09111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkAccountPickerViewModel.this.selectAccounts(false, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public LinkAccountPickerViewModel(@Assisted LinkAccountPickerState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker eventTracker, ConsumerSessionProvider consumerSessionProvider, HandleClickableUrl handleClickableUrl, FetchNetworkedAccounts fetchNetworkedAccounts, SelectNetworkedAccounts selectNetworkedAccounts, UpdateCachedAccounts updateCachedAccounts, GetOrFetchSync getSync, NavigationManager navigationManager, Logger logger, AcceptConsent acceptConsent, PresentSheet presentSheet) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(consumerSessionProvider, "consumerSessionProvider");
        Intrinsics.checkNotNullParameter(handleClickableUrl, "handleClickableUrl");
        Intrinsics.checkNotNullParameter(fetchNetworkedAccounts, "fetchNetworkedAccounts");
        Intrinsics.checkNotNullParameter(selectNetworkedAccounts, "selectNetworkedAccounts");
        Intrinsics.checkNotNullParameter(updateCachedAccounts, "updateCachedAccounts");
        Intrinsics.checkNotNullParameter(getSync, "getSync");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(acceptConsent, "acceptConsent");
        Intrinsics.checkNotNullParameter(presentSheet, "presentSheet");
        this.eventTracker = eventTracker;
        this.consumerSessionProvider = consumerSessionProvider;
        this.handleClickableUrl = handleClickableUrl;
        this.fetchNetworkedAccounts = fetchNetworkedAccounts;
        this.selectNetworkedAccounts = selectNetworkedAccounts;
        this.updateCachedAccounts = updateCachedAccounts;
        this.getSync = getSync;
        this.navigationManager = navigationManager;
        this.logger = logger;
        this.acceptConsent = acceptConsent;
        this.presentSheet = presentSheet;
        observeAsyncs();
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LinkAccountPickerViewModel._init_$lambda$0((LinkAccountPickerState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$1", f = "LinkAccountPickerViewModel.kt", i = {1, 1, 1}, l = {84, 87}, m = "invokeSuspend", n = {BaseJavaModule.METHOD_TYPE_SYNC, "manifest", "consumerSession"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super LinkAccountPickerState.Payload>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return LinkAccountPickerViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super LinkAccountPickerState.Payload> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0197  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objInvoke$default;
            Object objInvoke;
            SynchronizeSessionResponse synchronizeSessionResponse;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            CachedConsumerSession cachedConsumerSession;
            ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker;
            Object next;
            ConsentPane consent;
            PartnerAccount account;
            Object next2;
            TextUpdate text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objInvoke$default = GetOrFetchSync.invoke$default(LinkAccountPickerViewModel.this.getSync, null, false, this, 3, null);
                if (objInvoke$default != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cachedConsumerSession = (CachedConsumerSession) this.L$2;
                financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$1;
                SynchronizeSessionResponse synchronizeSessionResponse2 = (SynchronizeSessionResponse) this.L$0;
                ResultKt.throwOnFailure(obj);
                synchronizeSessionResponse = synchronizeSessionResponse2;
                objInvoke = obj;
                NetworkedAccountsList networkedAccountsList = (NetworkedAccountsList) objInvoke;
                Display display = networkedAccountsList.getDisplay();
                DataAccessNotice dataAccessNotice = null;
                returningNetworkingUserAccountPicker = (display != null || (text = display.getText()) == null) ? null : text.getReturningNetworkingUserAccountPicker();
                if (returningNetworkingUserAccountPicker != null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                List<NetworkedAccount> accounts = returningNetworkingUserAccountPicker.getAccounts();
                ArrayList arrayList = new ArrayList();
                for (NetworkedAccount networkedAccount : accounts) {
                    Iterator<T> it = networkedAccountsList.getData().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        if (Intrinsics.areEqual(((PartnerAccount) next2).getId(), networkedAccount.getId())) {
                            break;
                        }
                    }
                    PartnerAccount partnerAccount = (PartnerAccount) next2;
                    LinkedAccount linkedAccount = partnerAccount != null ? new LinkedAccount(partnerAccount, networkedAccount) : null;
                    if (linkedAccount != null) {
                        arrayList.add(linkedAccount);
                    }
                }
                ArrayList arrayList2 = arrayList;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    LinkedAccount linkedAccount2 = (LinkedAccount) next;
                    if (linkedAccount2.getDisplay().getAllowSelection() && linkedAccount2.getDisplay().getDrawerOnSelection() == null) {
                        break;
                    }
                }
                LinkedAccount linkedAccount3 = (LinkedAccount) next;
                List listListOfNotNull = CollectionsKt.listOfNotNull((linkedAccount3 == null || (account = linkedAccount3.getAccount()) == null) ? null : account.getId());
                LinkAccountPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(LinkAccountPickerViewModel.INSTANCE.getPANE$financial_connections_release()));
                Map<String, String> partnerToCoreAuths = networkedAccountsList.getPartnerToCoreAuths();
                String aboveCta = returningNetworkingUserAccountPicker.getAboveCta();
                TextUpdate text2 = synchronizeSessionResponse.getText();
                if (text2 != null && (consent = text2.getConsent()) != null) {
                    dataAccessNotice = consent.getDataAccessNotice();
                }
                DataAccessNotice dataAccessNotice2 = dataAccessNotice;
                FinancialConnectionsSessionManifest.Pane nextPaneOnAddAccount = networkedAccountsList.getNextPaneOnAddAccount();
                DataAccessNotice multipleAccountTypesSelectedDataAccessNotice = returningNetworkingUserAccountPicker.getMultipleAccountTypesSelectedDataAccessNotice();
                AddNewAccount addNewAccount = returningNetworkingUserAccountPicker.getAddNewAccount();
                if (addNewAccount == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                String title = returningNetworkingUserAccountPicker.getTitle();
                String defaultCta = returningNetworkingUserAccountPicker.getDefaultCta();
                String clientSecret = cachedConsumerSession.getClientSecret();
                boolean singleAccount = financialConnectionsSessionManifest.getSingleAccount();
                Boolean acquireConsentOnPrimaryCtaClick = networkedAccountsList.getAcquireConsentOnPrimaryCtaClick();
                return new LinkAccountPickerState.Payload(title, arrayList2, listListOfNotNull, addNewAccount, clientSecret, defaultCta, nextPaneOnAddAccount, partnerToCoreAuths, singleAccount, multipleAccountTypesSelectedDataAccessNotice, aboveCta, dataAccessNotice2, acquireConsentOnPrimaryCtaClick != null ? acquireConsentOnPrimaryCtaClick.booleanValue() : false);
            }
            ResultKt.throwOnFailure(obj);
            objInvoke$default = obj;
            SynchronizeSessionResponse synchronizeSessionResponse3 = (SynchronizeSessionResponse) objInvoke$default;
            FinancialConnectionsSessionManifest manifest = synchronizeSessionResponse3.getManifest();
            CachedConsumerSession cachedConsumerSessionProvideConsumerSession = LinkAccountPickerViewModel.this.consumerSessionProvider.provideConsumerSession();
            if (cachedConsumerSessionProvideConsumerSession != null) {
                this.L$0 = synchronizeSessionResponse3;
                this.L$1 = manifest;
                this.L$2 = cachedConsumerSessionProvideConsumerSession;
                this.label = 2;
                objInvoke = LinkAccountPickerViewModel.this.fetchNetworkedAccounts.invoke(cachedConsumerSessionProvideConsumerSession.getClientSecret(), this);
                if (objInvoke != coroutine_suspended) {
                    synchronizeSessionResponse = synchronizeSessionResponse3;
                    financialConnectionsSessionManifest = manifest;
                    cachedConsumerSession = cachedConsumerSessionProvideConsumerSession;
                    NetworkedAccountsList networkedAccountsList2 = (NetworkedAccountsList) objInvoke;
                    Display display2 = networkedAccountsList2.getDisplay();
                    DataAccessNotice dataAccessNotice3 = null;
                    if (display2 != null) {
                    }
                    if (returningNetworkingUserAccountPicker != null) {
                    }
                }
                return coroutine_suspended;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAccountPickerState _init_$lambda$0(LinkAccountPickerState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return LinkAccountPickerState.copy$default(execute, it, null, null, 6, null);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(LinkAccountPickerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TopAppBarStateUpdate(PANE, false, MavericksExtensionsKt.getError(state.getPayload()), false, null, false, 56, null);
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "payload", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$observeAsyncs$2", f = "LinkAccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$observeAsyncs$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<LinkAccountPickerState.Payload, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = LinkAccountPickerViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LinkAccountPickerState.Payload payload, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LinkAccountPickerState.Payload payload = (LinkAccountPickerState.Payload) this.L$0;
            if (payload.getAccounts().isEmpty()) {
                LinkAccountPickerViewModel.this.skipToNextPane(payload);
            }
            return Unit.INSTANCE;
        }
    }

    private final void observeAsyncs() {
        onAsync(new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel.observeAsyncs.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((LinkAccountPickerState) obj).getPayload();
            }
        }, new AnonymousClass2(null), new AnonymousClass3(null));
        FinancialConnectionsViewModel.onAsync$default(this, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel.observeAsyncs.4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((LinkAccountPickerState) obj).getSelectNetworkedAccountAsync();
            }
        }, null, new AnonymousClass5(null), 2, null);
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$observeAsyncs$3", f = "LinkAccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$observeAsyncs$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = LinkAccountPickerViewModel.this.new AnonymousClass3(continuation);
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
            FinancialConnectionsAnalyticsTrackerKt.logError(LinkAccountPickerViewModel.this.eventTracker, "Error fetching payload", (Throwable) this.L$0, LinkAccountPickerViewModel.this.logger, LinkAccountPickerViewModel.INSTANCE.getPANE$financial_connections_release());
            NavigationManager.DefaultImpls.tryNavigateTo$default(LinkAccountPickerViewModel.this.navigationManager, Destination.invoke$default(Destination.InstitutionPicker.INSTANCE, LinkAccountPickerViewModel.INSTANCE.getPANE$financial_connections_release(), null, 2, null), null, false, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$observeAsyncs$5", f = "LinkAccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$observeAsyncs$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = LinkAccountPickerViewModel.this.new AnonymousClass5(continuation);
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
            FinancialConnectionsAnalyticsTrackerKt.logError(LinkAccountPickerViewModel.this.eventTracker, "Error selecting networked account", (Throwable) this.L$0, LinkAccountPickerViewModel.this.logger, LinkAccountPickerViewModel.INSTANCE.getPANE$financial_connections_release());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void skipToNextPane(LinkAccountPickerState.Payload payload) {
        FinancialConnectionsSessionManifest.Pane nextPaneOnNewAccount = payload.getNextPaneOnNewAccount();
        if (nextPaneOnNewAccount == null) {
            nextPaneOnNewAccount = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
        }
        NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(nextPaneOnNewAccount), PANE, null, 2, null), new PopUpToBehavior.Route(true, DestinationMappersKt.getDestination(FinancialConnectionsSessionManifest.Pane.CONSENT).getFullRoute()), false, 4, null);
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onClickableTextClick$1", f = "LinkAccountPickerViewModel.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onClickableTextClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09081(String str, Continuation<? super C09081> continuation) {
            super(2, continuation);
            this.$uri = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LinkAccountPickerViewModel.this.new C09081(this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Date date = new Date();
                HandleClickableUrl handleClickableUrl = LinkAccountPickerViewModel.this.handleClickableUrl;
                FinancialConnectionsSessionManifest.Pane pANE$financial_connections_release = LinkAccountPickerViewModel.INSTANCE.getPANE$financial_connections_release();
                final String str = this.$uri;
                final LinkAccountPickerViewModel linkAccountPickerViewModel = LinkAccountPickerViewModel.this;
                this.label = 1;
                if (handleClickableUrl.invoke(pANE$financial_connections_release, str, new Function1() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onClickableTextClick$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LinkAccountPickerViewModel.C09081.invokeSuspend$lambda$1(linkAccountPickerViewModel, str, date, (String) obj2);
                    }
                }, MapsKt.mapOf(TuplesKt.to(LinkAccountPickerClickableText.DATA.getValue(), new AnonymousClass2(LinkAccountPickerViewModel.this, null))), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(LinkAccountPickerViewModel linkAccountPickerViewModel, final String str, final Date date, String str2) {
            linkAccountPickerViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onClickableTextClick$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LinkAccountPickerViewModel.C09081.invokeSuspend$lambda$1$lambda$0(str, date, (LinkAccountPickerState) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LinkAccountPickerState invokeSuspend$lambda$1$lambda$0(String str, Date date, LinkAccountPickerState linkAccountPickerState) {
            return LinkAccountPickerState.copy$default(linkAccountPickerState, null, null, new LinkAccountPickerState.ViewEffect.OpenUrl(str, date.getTime()), 3, null);
        }

        /* compiled from: LinkAccountPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onClickableTextClick$1$2", f = "LinkAccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onClickableTextClick$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<HandleClickableUrl.DeeplinkPayload, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ LinkAccountPickerViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(LinkAccountPickerViewModel linkAccountPickerViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = linkAccountPickerViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HandleClickableUrl.DeeplinkPayload deeplinkPayload, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(deeplinkPayload, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.presentDataAccessBottomSheet();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job onClickableTextClick(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09081(uri, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentDataAccessBottomSheet() {
        DataAccessNotice activeDataAccessNotice = getStateFlow().getValue().getActiveDataAccessNotice();
        if (activeDataAccessNotice == null) {
            return;
        }
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker = this.eventTracker;
        FinancialConnectionsSessionManifest.Pane pane = PANE;
        financialConnectionsAnalyticsTracker.track(new FinancialConnectionsAnalyticsEvent.ClickLearnMoreDataAccess(pane));
        this.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.DataAccess(activeDataAccessNotice), pane);
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onNewBankAccountClick$1", f = "LinkAccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onNewBankAccountClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C09091(Continuation<? super C09091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LinkAccountPickerViewModel.this.new C09091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FinancialConnectionsSessionManifest.Pane nextPaneOnNewAccount;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                LinkAccountPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click("click.new_account", LinkAccountPickerViewModel.INSTANCE.getPANE$financial_connections_release()));
                LinkAccountPickerState.Payload payloadInvoke = LinkAccountPickerViewModel.this.getStateFlow().getValue().getPayload().invoke();
                if (payloadInvoke == null || (nextPaneOnNewAccount = payloadInvoke.getNextPaneOnNewAccount()) == null) {
                    nextPaneOnNewAccount = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
                }
                NavigationManager.DefaultImpls.tryNavigateTo$default(LinkAccountPickerViewModel.this.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(nextPaneOnNewAccount), LinkAccountPickerViewModel.INSTANCE.getPANE$financial_connections_release(), null, 2, null), null, false, 6, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Job onNewBankAccountClick() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09091(null), 3, null);
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onSelectAccountsClick$1", f = "LinkAccountPickerViewModel.kt", i = {0, 0, 0, 1}, l = {221, 236, 257, 263}, m = "invokeSuspend", n = {"payload", "accounts", "selectedAccountDrawers", "selectedAccountDrawers"}, s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onSelectAccountsClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09101 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C09101(Continuation<? super C09101> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return LinkAccountPickerViewModel.this.new C09101(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C09101) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x01ad, code lost:
        
            if (r11.this$0.selectAccounts(r8.getAcquireConsentOnPrimaryCtaClick(), r8.getConsumerSessionClientSecret(), r1, r11) == r0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x01c1, code lost:
        
            if (r11.this$0.handleNonSuccessNextPane(r8, r12, r11) == r0) goto L55;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LinkAccountPickerState.Payload payload;
            ArrayList arrayList;
            List list;
            List list2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LinkAccountPickerState.Payload payloadInvoke = LinkAccountPickerViewModel.this.getStateFlow().getValue().getPayload().invoke();
                if (payloadInvoke == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                payload = payloadInvoke;
                List<LinkedAccount> selectedAccounts = payload.getSelectedAccounts();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedAccounts, 10));
                Iterator<T> it = selectedAccounts.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((LinkedAccount) it.next()).getAccount());
                }
                arrayList = arrayList2;
                List<LinkedAccount> selectedAccounts2 = payload.getSelectedAccounts();
                LinkAccountPickerViewModel linkAccountPickerViewModel = LinkAccountPickerViewModel.this;
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it2 = selectedAccounts2.iterator();
                while (it2.hasNext()) {
                    NoticeSheetState.NoticeSheetContent noticeSheetContentComputeDrawerPayload = linkAccountPickerViewModel.computeDrawerPayload(((LinkedAccount) it2.next()).getAccount(), payload);
                    if (noticeSheetContentComputeDrawerPayload != null) {
                        arrayList3.add(noticeSheetContentComputeDrawerPayload);
                    }
                }
                ArrayList arrayList4 = arrayList3;
                this.L$0 = payload;
                this.L$1 = arrayList;
                this.L$2 = arrayList4;
                this.label = 1;
                if (LinkAccountPickerViewModel.this.updateCachedAccounts.invoke(arrayList, this) != coroutine_suspended) {
                    list = arrayList4;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    list2 = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    LinkAccountPickerViewModel.this.present((NoticeSheetState.NoticeSheetContent) CollectionsKt.first(list2));
                    return Unit.INSTANCE;
                }
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            list = (List) this.L$2;
            arrayList = (List) this.L$1;
            payload = (LinkAccountPickerState.Payload) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (!list.isEmpty()) {
                if (list.size() > 1) {
                    FinancialConnectionsAnalyticsTrackerKt.logError(LinkAccountPickerViewModel.this.eventTracker, "Multiple accounts with drawers on selection", new UnclassifiedError("MultipleAccountsSelectedError", null, 2, null), LinkAccountPickerViewModel.this.logger, LinkAccountPickerViewModel.INSTANCE.getPANE$financial_connections_release());
                }
                this.L$0 = list;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (LinkAccountPickerViewModel.this.acceptConsent.invoke(this) != coroutine_suspended) {
                    list2 = list;
                    LinkAccountPickerViewModel.this.present((NoticeSheetState.NoticeSheetContent) CollectionsKt.first(list2));
                    return Unit.INSTANCE;
                }
            } else {
                PartnerAccount partnerAccount = (PartnerAccount) CollectionsKt.lastOrNull((List) arrayList);
                FinancialConnectionsSessionManifest.Pane nextPaneOnSelection = partnerAccount != null ? partnerAccount.getNextPaneOnSelection() : null;
                List<PartnerAccount> list3 = arrayList;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((PartnerAccount) it3.next()).getId());
                }
                Set set = CollectionsKt.toSet(arrayList5);
                LinkAccountPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AccountsSubmitted(LinkAccountPickerViewModel.INSTANCE.getPANE$financial_connections_release(), set, false));
                LinkAccountPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click("click.link_accounts", LinkAccountPickerViewModel.INSTANCE.getPANE$financial_connections_release()));
                if (nextPaneOnSelection == FinancialConnectionsSessionManifest.Pane.SUCCESS) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                } else {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                }
            }
            return coroutine_suspended;
        }
    }

    public final void onSelectAccountsClick() {
        FinancialConnectionsViewModel.execute$default(this, new C09101(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LinkAccountPickerViewModel.onSelectAccountsClick$lambda$1((LinkAccountPickerState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAccountPickerState onSelectAccountsClick$lambda$1(LinkAccountPickerState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return LinkAccountPickerState.copy$default(execute, null, it, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object selectAccounts(boolean z, String str, Set<String> set, Continuation<? super Unit> continuation) {
        C09111 c09111;
        LinkAccountPickerViewModel linkAccountPickerViewModel;
        if (continuation instanceof C09111) {
            c09111 = (C09111) continuation;
            if ((c09111.label & Integer.MIN_VALUE) != 0) {
                c09111.label -= Integer.MIN_VALUE;
            } else {
                c09111 = new C09111(continuation);
            }
        }
        Object objInvoke = c09111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c09111.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            SelectNetworkedAccounts selectNetworkedAccounts = this.selectNetworkedAccounts;
            Boolean boolBoxBoolean = Boxing.boxBoolean(z);
            c09111.L$0 = this;
            c09111.label = 1;
            objInvoke = selectNetworkedAccounts.invoke(str, set, boolBoxBoolean, c09111);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            linkAccountPickerViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkAccountPickerViewModel = (LinkAccountPickerViewModel) c09111.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        FinancialConnectionsSessionManifest.Pane nextPane = ((ShareNetworkedAccountsResponse) objInvoke).getNextPane();
        if (nextPane == null) {
            nextPane = FinancialConnectionsSessionManifest.Pane.SUCCESS;
        }
        FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.ACCOUNTS_SELECTED, null, 2, null);
        NavigationManager.DefaultImpls.tryNavigateTo$default(linkAccountPickerViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(nextPane), PANE, null, 2, null), null, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleNonSuccessNextPane(LinkAccountPickerState.Payload payload, FinancialConnectionsSessionManifest.Pane pane, Continuation<? super Unit> continuation) {
        C09061 c09061;
        LinkAccountPickerViewModel linkAccountPickerViewModel;
        FinancialConnectionsSessionManifest.Pane pane2 = pane;
        if (continuation instanceof C09061) {
            c09061 = (C09061) continuation;
            if ((c09061.label & Integer.MIN_VALUE) != 0) {
                c09061.label -= Integer.MIN_VALUE;
            } else {
                c09061 = new C09061(continuation);
            }
        }
        Object obj = c09061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c09061.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = pane2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pane2.ordinal()];
            if (i2 == -1) {
                FinancialConnectionsAnalyticsTrackerKt.logError(this.eventTracker, "Selected connect account, but next pane is NULL.", new UnclassifiedError("ConnectUnselectedAccountError", null, 2, null), this.logger, PANE);
            } else if (i2 == 1) {
                FinancialConnectionsAnalyticsTrackerKt.logError(this.eventTracker, "Connecting a supportability account, but user shouldn't be able to.", new UnclassifiedError("ConnectSupportabilityAccountError", null, 2, null), this.logger, PANE);
            } else if (i2 == 2) {
                FinancialConnectionsAnalyticsTrackerKt.logError(this.eventTracker, "Connecting a repair account, but user shouldn't be able to.", new UnclassifiedError("ConnectRepairAccountError", null, 2, null), this.logger, PANE);
            }
            if (payload.getAcquireConsentOnPrimaryCtaClick()) {
                AcceptConsent acceptConsent = this.acceptConsent;
                c09061.L$0 = this;
                c09061.L$1 = pane2;
                c09061.label = 1;
                if (acceptConsent.invoke(c09061) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            linkAccountPickerViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pane2 = (FinancialConnectionsSessionManifest.Pane) c09061.L$1;
            linkAccountPickerViewModel = (LinkAccountPickerViewModel) c09061.L$0;
            ResultKt.throwOnFailure(obj);
        }
        int i3 = pane2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pane2.ordinal()];
        if (i3 == -1 || i3 == 1 || i3 == 2) {
            pane2 = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
        }
        NavigationManager.DefaultImpls.tryNavigateTo$default(linkAccountPickerViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane2), PANE, null, 2, null), null, false, 6, null);
        return Unit.INSTANCE;
    }

    private final void logAccountClick(PartnerAccount partnerAccount) {
        LinkAccountPickerState.Payload payloadInvoke = getStateFlow().getValue().getPayload().invoke();
        if (payloadInvoke == null) {
            return;
        }
        this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AccountSelected(PANE, !payloadInvoke.getSelectedAccountIds().contains(partnerAccount.getId()), payloadInvoke.getSingleAccount(), partnerAccount.getId()));
    }

    public final void onAccountClick(PartnerAccount partnerAccount) {
        final List listMinus;
        NoticeSheetState.NoticeSheetContent noticeSheetContentComputeDrawerPayload;
        Intrinsics.checkNotNullParameter(partnerAccount, "partnerAccount");
        logAccountClick(partnerAccount);
        LinkAccountPickerState.Payload payloadInvoke = getStateFlow().getValue().getPayload().invoke();
        if (payloadInvoke == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        final LinkAccountPickerState.Payload payload = payloadInvoke;
        if (!payload.getAcquireConsentOnPrimaryCtaClick() && (noticeSheetContentComputeDrawerPayload = computeDrawerPayload(partnerAccount, payload)) != null) {
            present(noticeSheetContentComputeDrawerPayload);
            return;
        }
        if (payload.getSingleAccount()) {
            listMinus = CollectionsKt.listOf(partnerAccount.getId());
        } else {
            listMinus = payload.getSelectedAccountIds().contains(partnerAccount.getId()) ? CollectionsKt.minus(payload.getSelectedAccountIds(), partnerAccount.getId()) : CollectionsKt.plus((Collection<? extends String>) payload.getSelectedAccountIds(), partnerAccount.getId());
        }
        setState(new Function1() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkAccountPickerViewModel.onAccountClick$lambda$2(payload, listMinus, (LinkAccountPickerState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAccountPickerState onAccountClick$lambda$2(LinkAccountPickerState.Payload payload, List list, LinkAccountPickerState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return LinkAccountPickerState.copy$default(setState, new Async.Success(LinkAccountPickerState.Payload.copy$default(payload, null, null, list, null, null, null, null, null, false, null, null, null, false, 8187, null)), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NoticeSheetState.NoticeSheetContent computeDrawerPayload(PartnerAccount partnerAccount, LinkAccountPickerState.Payload payload) {
        Object next;
        NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequired;
        Map<String, String> partnerToCoreAuths;
        Image icon;
        NetworkedAccount display;
        Iterator<T> it = payload.getAccounts().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((LinkedAccount) next).getAccount().getId(), partnerAccount.getId())) {
                break;
            }
        }
        LinkedAccount linkedAccount = (LinkedAccount) next;
        FinancialConnectionsGenericInfoScreen drawerOnSelection = (linkedAccount == null || (display = linkedAccount.getDisplay()) == null) ? null : display.getDrawerOnSelection();
        if (drawerOnSelection == null) {
            updateRequired = null;
        } else {
            FinancialConnectionsInstitution institution = partnerAccount.getInstitution();
            FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreenWithIcon = LinkAccountPickerViewModelKt.withIcon(drawerOnSelection, (institution == null || (icon = institution.getIcon()) == null) ? null : icon.getDefault());
            if (financialConnectionsGenericInfoScreenWithIcon != null) {
                FinancialConnectionsSessionManifest.Pane nextPaneOnSelection = partnerAccount.getNextPaneOnSelection();
                int i = nextPaneOnSelection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[nextPaneOnSelection.ordinal()];
                if (i == 1) {
                    updateRequired = new NoticeSheetState.NoticeSheetContent.UpdateRequired(financialConnectionsGenericInfoScreenWithIcon, new NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability(partnerAccount.getInstitution()));
                } else if (i == 2) {
                    String authorization = partnerAccount.getAuthorization();
                    updateRequired = new NoticeSheetState.NoticeSheetContent.UpdateRequired(financialConnectionsGenericInfoScreenWithIcon, new NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Repair((authorization == null || (partnerToCoreAuths = payload.getPartnerToCoreAuths()) == null) ? null : (String) MapsKt.getValue(partnerToCoreAuths, authorization), partnerAccount.getInstitution()));
                } else if (i == 3) {
                    updateRequired = new NoticeSheetState.NoticeSheetContent.UpdateRequired(financialConnectionsGenericInfoScreenWithIcon, new NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability(null));
                }
            }
        }
        if (updateRequired != null) {
            return updateRequired;
        }
        return drawerOnSelection != null ? new NoticeSheetState.NoticeSheetContent.Generic(drawerOnSelection) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void present(NoticeSheetState.NoticeSheetContent noticeSheetContent) {
        if (noticeSheetContent instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired) {
            logUpdateRequired(((NoticeSheetState.NoticeSheetContent.UpdateRequired) noticeSheetContent).getType());
        }
        this.presentSheet.invoke(noticeSheetContent, PANE);
    }

    private final void logUpdateRequired(NoticeSheetState.NoticeSheetContent.UpdateRequired.Type type) {
        String str;
        if (type instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability) {
            str = "click.supportability_account";
        } else {
            if (!(type instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Repair)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "click.repair_accounts";
        }
        this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(str, PANE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAccountPickerState onViewEffectLaunched$lambda$6(LinkAccountPickerState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return LinkAccountPickerState.copy$default(setState, null, null, null, 3, null);
    }

    public final void onViewEffectLaunched() {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkAccountPickerViewModel.onViewEffectLaunched$lambda$6((LinkAccountPickerState) obj);
            }
        });
    }

    /* compiled from: LinkAccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Companion;", "", "<init>", "()V", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPANE$financial_connections_release", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FinancialConnectionsSessionManifest.Pane getPANE$financial_connections_release() {
            return LinkAccountPickerViewModel.PANE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LinkAccountPickerViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getLinkAccountPickerViewModelFactory().create(new LinkAccountPickerState(null, null, null, 7, null));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(LinkAccountPickerViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LinkAccountPickerViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
