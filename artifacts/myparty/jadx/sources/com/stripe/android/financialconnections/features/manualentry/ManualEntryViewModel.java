package com.stripe.android.financialconnections.features.manualentry;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.BaseJavaModule;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.domain.UpdateCachedAccounts;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.ManualEntryMode;
import com.stripe.android.financialconnections.model.PartnerAccount;
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
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ManualEntryViewModel.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002?@BS\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0002H\u0016J\b\u00105\u001a\u000206H\u0002J\u000e\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u0017J\u000e\u00109\u001a\u0002062\u0006\u00108\u001a\u00020\u0017J\u000e\u0010:\u001a\u0002062\u0006\u00108\u001a\u00020\u0017J\u0006\u0010;\u001a\u000206J\u000e\u0010<\u001a\u000206H\u0082@¢\u0006\u0002\u0010=J\u0006\u0010>\u001a\u000206R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR/\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR/\u0010#\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u0011\u0010'\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b(\u0010\u001aR\u0011\u0010)\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0011\u0010+\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006A"}, d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "pollAttachPaymentAccount", "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;", "successContentRepository", "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;", "updateCachedAccounts", "Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/domain/UpdateCachedAccounts;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V", "<set-?>", "", "_routing", "get_routing", "()Ljava/lang/String;", "set_routing", "(Ljava/lang/String;)V", "_routing$delegate", "Landroidx/compose/runtime/MutableState;", "_account", "get_account", "set_account", "_account$delegate", "_accountConfirm", "get_accountConfirm", "set_accountConfirm", "_accountConfirm$delegate", "routing", "getRouting", "account", "getAccount", "accountConfirm", "getAccountConfirm", "form", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;", "getForm", "()Lkotlinx/coroutines/flow/StateFlow;", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "observeAsyncs", "", "onRoutingEntered", "input", "onAccountEntered", "onAccountConfirmEntered", "onSubmit", "clearCachedAccounts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTestFill", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManualEntryViewModel extends FinancialConnectionsViewModel<ManualEntryState> {

    /* renamed from: _account$delegate, reason: from kotlin metadata */
    private final MutableState _account;

    /* renamed from: _accountConfirm$delegate, reason: from kotlin metadata */
    private final MutableState _accountConfirm;

    /* renamed from: _routing$delegate, reason: from kotlin metadata */
    private final MutableState _routing;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final StateFlow<ManualEntryFormState> form;
    private final GetOrFetchSync getOrFetchSync;
    private final Logger logger;
    private final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    private final NavigationManager navigationManager;
    private final PollAttachPaymentAccount pollAttachPaymentAccount;
    private final SuccessContentRepository successContentRepository;
    private final UpdateCachedAccounts updateCachedAccounts;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY;

    /* compiled from: ManualEntryViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        ManualEntryViewModel create(ManualEntryState initialState);
    }

    /* compiled from: ManualEntryViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel", f = "ManualEntryViewModel.kt", i = {}, l = {175}, m = "clearCachedAccounts", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$clearCachedAccounts$1, reason: invalid class name and case insensitive filesystem */
    static final class C09191 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C09191(Continuation<? super C09191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ManualEntryViewModel.this.clearCachedAccounts(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public ManualEntryViewModel(@Assisted ManualEntryState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, PollAttachPaymentAccount pollAttachPaymentAccount, SuccessContentRepository successContentRepository, UpdateCachedAccounts updateCachedAccounts, FinancialConnectionsAnalyticsTracker eventTracker, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, Logger logger) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(pollAttachPaymentAccount, "pollAttachPaymentAccount");
        Intrinsics.checkNotNullParameter(successContentRepository, "successContentRepository");
        Intrinsics.checkNotNullParameter(updateCachedAccounts, "updateCachedAccounts");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.pollAttachPaymentAccount = pollAttachPaymentAccount;
        this.successContentRepository = successContentRepository;
        this.updateCachedAccounts = updateCachedAccounts;
        this.eventTracker = eventTracker;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManager;
        this.logger = logger;
        this._routing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._account = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._accountConfirm = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.form = FlowKt.stateIn(FlowKt.combine(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.get_routing();
            }
        }), SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.get_account();
            }
        }), SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.get_accountConfirm();
            }
        }), ManualEntryViewModel$form$6.INSTANCE), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), new ManualEntryFormState(null, null, null));
        observeAsyncs();
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ManualEntryViewModel._init_$lambda$4((ManualEntryState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String get_routing() {
        return (String) this._routing.getValue();
    }

    private final void set_routing(String str) {
        this._routing.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String get_account() {
        return (String) this._account.getValue();
    }

    private final void set_account(String str) {
        this._account.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String get_accountConfirm() {
        return (String) this._accountConfirm.getValue();
    }

    private final void set_accountConfirm(String str) {
        this._accountConfirm.setValue(str);
    }

    public final String getRouting() {
        String str = get_routing();
        return str == null ? "" : str;
    }

    public final String getAccount() {
        String str = get_account();
        return str == null ? "" : str;
    }

    public final String getAccountConfirm() {
        String str = get_accountConfirm();
        return str == null ? "" : str;
    }

    public final StateFlow<ManualEntryFormState> getForm() {
        return this.form;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object form$lambda$3(String str, String str2, String str3, Continuation continuation) {
        return new ManualEntryFormState(str, str2, str3);
    }

    /* compiled from: ManualEntryViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$1", f = "ManualEntryViewModel.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ManualEntryState.Payload>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ManualEntryViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ManualEntryState.Payload> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = GetOrFetchSync.invoke$default(ManualEntryViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) obj).getManifest();
            if (manifest != null) {
                ManualEntryViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY));
                return new ManualEntryState.Payload(manifest.getManualEntryUsesMicrodeposits(), manifest.getManualEntryMode() == ManualEntryMode.CUSTOM, !manifest.getLivemode());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManualEntryState _init_$lambda$4(ManualEntryState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return ManualEntryState.copy$default(execute, it, null, 2, null);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(ManualEntryState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TopAppBarStateUpdate(PANE, true, MavericksExtensionsKt.getError(state.getPayload()), false, null, false, 56, null);
    }

    private final void observeAsyncs() {
        ManualEntryViewModel manualEntryViewModel = this;
        FinancialConnectionsViewModel.onAsync$default(manualEntryViewModel, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel.observeAsyncs.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ManualEntryState) obj).getPayload();
            }
        }, new AnonymousClass2(null), null, 4, null);
        FinancialConnectionsViewModel.onAsync$default(manualEntryViewModel, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel.observeAsyncs.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ManualEntryState) obj).getLinkPaymentAccount();
            }
        }, null, new AnonymousClass4(null), 2, null);
    }

    /* compiled from: ManualEntryViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "payload", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$observeAsyncs$2", f = "ManualEntryViewModel.kt", i = {}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$observeAsyncs$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ManualEntryState.Payload, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = ManualEntryViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ManualEntryState.Payload payload, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (((ManualEntryState.Payload) this.L$0).getCustomManualEntry()) {
                    this.label = 1;
                    if (ManualEntryViewModel.this.nativeAuthFlowCoordinator.invoke().emit(new NativeAuthFlowCoordinator.Message.Complete(NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause.USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ManualEntryViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$observeAsyncs$4", f = "ManualEntryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$observeAsyncs$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = ManualEntryViewModel.this.new AnonymousClass4(continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsAnalyticsTrackerKt.logError(ManualEntryViewModel.this.eventTracker, "Error linking payment account", (Throwable) this.L$0, ManualEntryViewModel.this.logger, ManualEntryViewModel.PANE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ManualEntryViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$onSubmit$1", f = "ManualEntryViewModel.kt", i = {1, 2, 2}, l = {144, 145, 153}, m = "invokeSuspend", n = {BaseJavaModule.METHOD_TYPE_SYNC, BaseJavaModule.METHOD_TYPE_SYNC, "it"}, s = {"L$0", "L$0", "L$3"})
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$onSubmit$1, reason: invalid class name and case insensitive filesystem */
    static final class C09211 extends SuspendLambda implements Function1<Continuation<? super LinkAccountSessionPaymentAccount>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        C09211(Continuation<? super C09211> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ManualEntryViewModel.this.new C09211(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
            return ((C09211) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SynchronizeSessionResponse synchronizeSessionResponse;
            ManualEntryViewModel manualEntryViewModel;
            Object obj2;
            LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount;
            FinancialConnectionsSessionManifest.Pane nextPane;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = GetOrFetchSync.invoke$default(ManualEntryViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) this.L$3;
                    manualEntryViewModel = (ManualEntryViewModel) this.L$2;
                    obj2 = this.L$1;
                    synchronizeSessionResponse = (SynchronizeSessionResponse) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (synchronizeSessionResponse.getManifest().getManualEntryUsesMicrodeposits()) {
                        manualEntryViewModel.successContentRepository.set(new TextResource.StringId(R.string.stripe_success_pane_desc_microdeposits, CollectionsKt.listOf(StringsKt.takeLast(manualEntryViewModel.getAccount(), 4))), new TextResource.StringId(R.string.stripe_success_pane_title_microdeposits, null, 2, null));
                    }
                    nextPane = linkAccountSessionPaymentAccount.getNextPane();
                    if (nextPane == null) {
                        nextPane = FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS;
                    }
                    NavigationManager.DefaultImpls.tryNavigateTo$default(manualEntryViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(nextPane), ManualEntryViewModel.PANE, null, 2, null), null, false, 6, null);
                    return obj2;
                }
                SynchronizeSessionResponse synchronizeSessionResponse2 = (SynchronizeSessionResponse) this.L$0;
                ResultKt.throwOnFailure(obj);
                synchronizeSessionResponse = synchronizeSessionResponse2;
                manualEntryViewModel = ManualEntryViewModel.this;
                LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount2 = (LinkAccountSessionPaymentAccount) obj;
                this.L$0 = synchronizeSessionResponse;
                this.L$1 = obj;
                this.L$2 = manualEntryViewModel;
                this.L$3 = linkAccountSessionPaymentAccount2;
                this.label = 3;
                if (manualEntryViewModel.clearCachedAccounts(this) != coroutine_suspended) {
                    obj2 = obj;
                    linkAccountSessionPaymentAccount = linkAccountSessionPaymentAccount2;
                    if (synchronizeSessionResponse.getManifest().getManualEntryUsesMicrodeposits()) {
                    }
                    nextPane = linkAccountSessionPaymentAccount.getNextPane();
                    if (nextPane == null) {
                    }
                    NavigationManager.DefaultImpls.tryNavigateTo$default(manualEntryViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(nextPane), ManualEntryViewModel.PANE, null, 2, null), null, false, 6, null);
                    return obj2;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            SynchronizeSessionResponse synchronizeSessionResponse3 = (SynchronizeSessionResponse) obj;
            this.L$0 = synchronizeSessionResponse3;
            this.label = 2;
            Object objInvoke = ManualEntryViewModel.this.pollAttachPaymentAccount.invoke(synchronizeSessionResponse3, null, new PaymentAccountParams.BankAccount(ManualEntryViewModel.this.getRouting(), ManualEntryViewModel.this.getAccount()), this);
            if (objInvoke != coroutine_suspended) {
                synchronizeSessionResponse = synchronizeSessionResponse3;
                obj = objInvoke;
                manualEntryViewModel = ManualEntryViewModel.this;
                LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount22 = (LinkAccountSessionPaymentAccount) obj;
                this.L$0 = synchronizeSessionResponse;
                this.L$1 = obj;
                this.L$2 = manualEntryViewModel;
                this.L$3 = linkAccountSessionPaymentAccount22;
                this.label = 3;
                if (manualEntryViewModel.clearCachedAccounts(this) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public final void onSubmit() {
        FinancialConnectionsViewModel.execute$default(this, new C09211(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ManualEntryViewModel.onSubmit$lambda$8((ManualEntryState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManualEntryState onSubmit$lambda$8(ManualEntryState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return ManualEntryState.copy$default(execute, null, it, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearCachedAccounts(Continuation<? super Unit> continuation) {
        C09191 c09191;
        if (continuation instanceof C09191) {
            c09191 = (C09191) continuation;
            if ((c09191.label & Integer.MIN_VALUE) != 0) {
                c09191.label -= Integer.MIN_VALUE;
            } else {
                c09191 = new C09191(continuation);
            }
        }
        Object obj = c09191.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c09191.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                ManualEntryViewModel manualEntryViewModel = this;
                UpdateCachedAccounts updateCachedAccounts = this.updateCachedAccounts;
                List<PartnerAccount> listEmptyList = CollectionsKt.emptyList();
                c09191.label = 1;
                if (updateCachedAccounts.invoke(listEmptyList, c09191) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m9118constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }

    public final void onTestFill() {
        set_routing("110000000");
        set_account("000123456789");
        set_accountConfirm("000123456789");
        onSubmit();
    }

    /* compiled from: ManualEntryViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ManualEntryViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getManualEntryViewModelFactory().create(new ManualEntryState(null, null, 3, null));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(ManualEntryViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManualEntryViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }

    public final void onRoutingEntered(String input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        String str = input;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        set_routing(sb.toString());
    }

    public final void onAccountEntered(String input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        String str = input;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        set_account(sb.toString());
    }

    public final void onAccountConfirmEntered(String input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        String str = input;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        set_accountConfirm(sb.toString());
    }
}
