package com.stripe.android.financialconnections.features.attachpayment;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.soloader.Elf64;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.CachedPartnerAccount;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.IsNetworkingRelinkSession;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: AttachPaymentViewModel.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B[\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\u0006\u0010#\u001a\u00020\u001cJ\u0006\u0010$\u001a\u00020\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "successContentRepository", "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;", "pollAttachPaymentAccount", "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "getCachedAccounts", "Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "logger", "Lcom/stripe/android/core/Logger;", "isNetworkingRelinkSession", "Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;", "<init>", "(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;)V", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "setSuccessMessageIfNecessary", "", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "accounts", "", "Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;", "logErrors", "onEnterDetailsManually", "onSelectAnotherBank", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AttachPaymentViewModel extends FinancialConnectionsViewModel<AttachPaymentState> {
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetCachedAccounts getCachedAccounts;
    private final GetOrFetchSync getOrFetchSync;
    private final IsNetworkingRelinkSession isNetworkingRelinkSession;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final PollAttachPaymentAccount pollAttachPaymentAccount;
    private final SuccessContentRepository successContentRepository;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.ATTACH_LINKED_PAYMENT_ACCOUNT;

    /* compiled from: AttachPaymentViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        AttachPaymentViewModel create(AttachPaymentState initialState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public AttachPaymentViewModel(@Assisted AttachPaymentState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, SuccessContentRepository successContentRepository, PollAttachPaymentAccount pollAttachPaymentAccount, FinancialConnectionsAnalyticsTracker eventTracker, GetCachedAccounts getCachedAccounts, NavigationManager navigationManager, GetOrFetchSync getOrFetchSync, Logger logger, IsNetworkingRelinkSession isNetworkingRelinkSession) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(successContentRepository, "successContentRepository");
        Intrinsics.checkNotNullParameter(pollAttachPaymentAccount, "pollAttachPaymentAccount");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(getCachedAccounts, "getCachedAccounts");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(isNetworkingRelinkSession, "isNetworkingRelinkSession");
        this.successContentRepository = successContentRepository;
        this.pollAttachPaymentAccount = pollAttachPaymentAccount;
        this.eventTracker = eventTracker;
        this.getCachedAccounts = getCachedAccounts;
        this.navigationManager = navigationManager;
        this.getOrFetchSync = getOrFetchSync;
        this.logger = logger;
        this.isNetworkingRelinkSession = isNetworkingRelinkSession;
        logErrors();
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AttachPaymentViewModel._init_$lambda$0((AttachPaymentState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* compiled from: AttachPaymentViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$1", f = "AttachPaymentViewModel.kt", i = {1, 1, 1, 1, 2, 2, 2, 2}, l = {54, Elf64.Ehdr.E_SHENTSIZE, LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend", n = {BaseJavaModule.METHOD_TYPE_SYNC, "manifest", "authSession", "activeInstitution", "manifest", "authSession", "accounts", "startTime$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super LinkAccountSessionPaymentAccount>, Object> {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AttachPaymentViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0142  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objInvoke$default;
            SynchronizeSessionResponse synchronizeSessionResponse;
            FinancialConnectionsAuthorizationSession activeAuthSession;
            Object objInvoke;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            FinancialConnectionsInstitution financialConnectionsInstitution;
            String linkedAccountId;
            long jCurrentTimeMillis;
            boolean z;
            Object objInvoke2;
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2;
            List list;
            LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount;
            FinancialConnectionsSessionManifest.Pane nextPane;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objInvoke$default = GetOrFetchSync.invoke$default(AttachPaymentViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (objInvoke$default != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j = this.J$0;
                    list = (List) this.L$2;
                    financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) this.L$1;
                    financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    jCurrentTimeMillis = j;
                    z = true;
                    objInvoke2 = obj;
                    Pair pair = TuplesKt.to((LinkAccountSessionPaymentAccount) objInvoke2, Boxing.boxLong(System.currentTimeMillis() - jCurrentTimeMillis));
                    linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) pair.component1();
                    long jLongValue = ((Number) pair.component2()).longValue();
                    if (Intrinsics.areEqual(linkAccountSessionPaymentAccount.getNetworkingSuccessful(), Boxing.boxBoolean(z))) {
                        AttachPaymentViewModel.this.setSuccessMessageIfNecessary(financialConnectionsSessionManifest2, list);
                    }
                    AttachPaymentViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PollAttachPaymentsSucceeded(AttachPaymentViewModel.PANE, financialConnectionsAuthorizationSession.getId(), jLongValue));
                    nextPane = linkAccountSessionPaymentAccount.getNextPane();
                    if (nextPane == null) {
                        nextPane = FinancialConnectionsSessionManifest.Pane.SUCCESS;
                    }
                    NavigationManager.DefaultImpls.tryNavigateTo$default(AttachPaymentViewModel.this.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(nextPane), AttachPaymentViewModel.PANE, null, 2, null), null, false, 6, null);
                    return linkAccountSessionPaymentAccount;
                }
                financialConnectionsInstitution = (FinancialConnectionsInstitution) this.L$3;
                activeAuthSession = (FinancialConnectionsAuthorizationSession) this.L$2;
                financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$1;
                synchronizeSessionResponse = (SynchronizeSessionResponse) this.L$0;
                ResultKt.throwOnFailure(obj);
                objInvoke = obj;
                List list2 = (List) objInvoke;
                linkedAccountId = ((CachedPartnerAccount) CollectionsKt.single(list2)).getLinkedAccountId();
                AttachPaymentViewModel attachPaymentViewModel = AttachPaymentViewModel.this;
                jCurrentTimeMillis = System.currentTimeMillis();
                PollAttachPaymentAccount pollAttachPaymentAccount = attachPaymentViewModel.pollAttachPaymentAccount;
                z = true;
                if (linkedAccountId != null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                PaymentAccountParams.LinkedAccount linkedAccount = new PaymentAccountParams.LinkedAccount(linkedAccountId);
                this.L$0 = financialConnectionsSessionManifest;
                this.L$1 = activeAuthSession;
                this.L$2 = list2;
                this.L$3 = null;
                this.J$0 = jCurrentTimeMillis;
                this.label = 3;
                objInvoke2 = pollAttachPaymentAccount.invoke(synchronizeSessionResponse, financialConnectionsInstitution, linkedAccount, this);
                if (objInvoke2 != coroutine_suspended) {
                    financialConnectionsAuthorizationSession = activeAuthSession;
                    financialConnectionsSessionManifest2 = financialConnectionsSessionManifest;
                    list = list2;
                    Pair pair2 = TuplesKt.to((LinkAccountSessionPaymentAccount) objInvoke2, Boxing.boxLong(System.currentTimeMillis() - jCurrentTimeMillis));
                    linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) pair2.component1();
                    long jLongValue2 = ((Number) pair2.component2()).longValue();
                    if (Intrinsics.areEqual(linkAccountSessionPaymentAccount.getNetworkingSuccessful(), Boxing.boxBoolean(z))) {
                    }
                    AttachPaymentViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PollAttachPaymentsSucceeded(AttachPaymentViewModel.PANE, financialConnectionsAuthorizationSession.getId(), jLongValue2));
                    nextPane = linkAccountSessionPaymentAccount.getNextPane();
                    if (nextPane == null) {
                    }
                    NavigationManager.DefaultImpls.tryNavigateTo$default(AttachPaymentViewModel.this.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(nextPane), AttachPaymentViewModel.PANE, null, 2, null), null, false, 6, null);
                    return linkAccountSessionPaymentAccount;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            objInvoke$default = obj;
            synchronizeSessionResponse = (SynchronizeSessionResponse) objInvoke$default;
            FinancialConnectionsSessionManifest manifest = synchronizeSessionResponse.getManifest();
            if (manifest == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            activeAuthSession = manifest.getActiveAuthSession();
            if (activeAuthSession == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            FinancialConnectionsInstitution activeInstitution = manifest.getActiveInstitution();
            if (activeInstitution == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            this.L$0 = synchronizeSessionResponse;
            this.L$1 = manifest;
            this.L$2 = activeAuthSession;
            this.L$3 = activeInstitution;
            this.label = 2;
            objInvoke = AttachPaymentViewModel.this.getCachedAccounts.invoke(this);
            if (objInvoke != coroutine_suspended) {
                financialConnectionsSessionManifest = manifest;
                financialConnectionsInstitution = activeInstitution;
                List list22 = (List) objInvoke;
                linkedAccountId = ((CachedPartnerAccount) CollectionsKt.single(list22)).getLinkedAccountId();
                AttachPaymentViewModel attachPaymentViewModel2 = AttachPaymentViewModel.this;
                jCurrentTimeMillis = System.currentTimeMillis();
                PollAttachPaymentAccount pollAttachPaymentAccount2 = attachPaymentViewModel2.pollAttachPaymentAccount;
                z = true;
                if (linkedAccountId != null) {
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AttachPaymentState _init_$lambda$0(AttachPaymentState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return execute.copy(it);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(AttachPaymentState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TopAppBarStateUpdate(PANE, false, MavericksExtensionsKt.getError(state.getLinkPaymentAccount()), false, null, false, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSuccessMessageIfNecessary(FinancialConnectionsSessionManifest manifest, List<CachedPartnerAccount> accounts) {
        if (!AttachPaymentViewModelKt.getCanSetCustomLinkSuccessMessage(manifest) || this.isNetworkingRelinkSession.invoke()) {
            return;
        }
        SuccessContentRepository.set$default(this.successContentRepository, new TextResource.PluralId(R.string.stripe_success_pane_desc_link_success_singular, R.string.stripe_success_pane_desc_link_success_plural, accounts.size(), null, 8, null), null, 2, null);
    }

    private final void logErrors() {
        FinancialConnectionsViewModel.onAsync$default(this, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel.logErrors.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((AttachPaymentState) obj).getLinkPaymentAccount();
            }
        }, null, new AnonymousClass2(null), 2, null);
    }

    /* compiled from: AttachPaymentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$logErrors$2", f = "AttachPaymentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$logErrors$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = AttachPaymentViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsAnalyticsTrackerKt.logError(AttachPaymentViewModel.this.eventTracker, "Error Attaching payment account", (Throwable) this.L$0, AttachPaymentViewModel.this.logger, AttachPaymentViewModel.PANE);
            return Unit.INSTANCE;
        }
    }

    public final void onEnterDetailsManually() {
        NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.ManualEntry.INSTANCE, PANE, null, 2, null), null, false, 6, null);
    }

    public final void onSelectAnotherBank() {
        NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.Reset.INSTANCE, PANE, null, 2, null), null, false, 6, null);
    }

    /* compiled from: AttachPaymentViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AttachPaymentViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getAttachPaymentViewModelFactory().create(new AttachPaymentState(null, 1, null));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(AttachPaymentViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AttachPaymentViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
