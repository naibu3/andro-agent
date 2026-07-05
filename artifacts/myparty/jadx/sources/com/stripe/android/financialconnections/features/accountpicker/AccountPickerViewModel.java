package com.stripe.android.financialconnections.features.accountpicker;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.GetCachedAccountsKt;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.domain.SelectAccounts;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.common.ManifestExtensionsKt;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.model.AccountPickerPane;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
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
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: AccountPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002?@Bk\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0002J\u001e\u0010\"\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0002J\u000e\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020%J,\u0010,\u001a\u00020 2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00101\u001a\u000202H\u0002J\u0006\u00103\u001a\u00020 J\u001e\u00104\u001a\u00020 2\f\u00105\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00106\u001a\u000202H\u0002J\u0006\u00107\u001a\u00020 J\u0006\u00108\u001a\u00020 J\u0006\u00109\u001a\u00020 J\u000e\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020/J\b\u0010=\u001a\u00020 H\u0002J\u0006\u0010>\u001a\u00020 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "consumerSessionProvider", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;", "saveAccountToLink", "Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;", "selectAccounts", "Lcom/stripe/android/financialconnections/domain/SelectAccounts;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "handleClickableUrl", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;", "logger", "Lcom/stripe/android/core/Logger;", "pollAuthorizationSessionAccounts", "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;", "presentSheet", "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;", "<init>", "(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;Lcom/stripe/android/financialconnections/domain/SelectAccounts;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;)V", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "loadInstitution", "", "loadAccounts", "throwErrorIfNoSelectableAccounts", "accounts", "", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "onPayloadLoaded", "logErrors", "onAccountClicked", "account", "logAccountSelectionChanges", "idsBefore", "", "", "idsAfter", "isSingleAccount", "", "onSubmit", "submitAccounts", "selectedIds", "isSkipAccountSelection", "selectAnotherBank", "onEnterDetailsManually", "onLoadAccountsAgain", "onClickableTextClick", "Lkotlinx/coroutines/Job;", ShareConstants.MEDIA_URI, "presentDataAccessBottomSheet", "onViewEffectLaunched", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountPickerViewModel extends FinancialConnectionsViewModel<AccountPickerState> {
    private final ConsumerSessionProvider consumerSessionProvider;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetOrFetchSync getOrFetchSync;
    private final HandleClickableUrl handleClickableUrl;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final PollAuthorizationSessionAccounts pollAuthorizationSessionAccounts;
    private final PresentSheet presentSheet;
    private final SaveAccountToLink saveAccountToLink;
    private final SelectAccounts selectAccounts;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER;

    /* compiled from: AccountPickerViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        AccountPickerViewModel create(AccountPickerState initialState);
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountPickerState.SelectionMode.values().length];
            try {
                iArr[AccountPickerState.SelectionMode.Single.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountPickerState.SelectionMode.Multiple.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public AccountPickerViewModel(@Assisted AccountPickerState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker eventTracker, ConsumerSessionProvider consumerSessionProvider, SaveAccountToLink saveAccountToLink, SelectAccounts selectAccounts, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, HandleClickableUrl handleClickableUrl, Logger logger, PollAuthorizationSessionAccounts pollAuthorizationSessionAccounts, PresentSheet presentSheet) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(consumerSessionProvider, "consumerSessionProvider");
        Intrinsics.checkNotNullParameter(saveAccountToLink, "saveAccountToLink");
        Intrinsics.checkNotNullParameter(selectAccounts, "selectAccounts");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(handleClickableUrl, "handleClickableUrl");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(pollAuthorizationSessionAccounts, "pollAuthorizationSessionAccounts");
        Intrinsics.checkNotNullParameter(presentSheet, "presentSheet");
        this.eventTracker = eventTracker;
        this.consumerSessionProvider = consumerSessionProvider;
        this.saveAccountToLink = saveAccountToLink;
        this.selectAccounts = selectAccounts;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManager;
        this.handleClickableUrl = handleClickableUrl;
        this.logger = logger;
        this.pollAuthorizationSessionAccounts = pollAuthorizationSessionAccounts;
        this.presentSheet = presentSheet;
        logErrors();
        onPayloadLoaded();
        loadInstitution();
        loadAccounts();
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(AccountPickerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TopAppBarStateUpdate(PANE, false, MavericksExtensionsKt.getError(state.getPayload()), false, null, false, 56, null);
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$loadInstitution$1", f = "AccountPickerViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$loadInstitution$1, reason: invalid class name and case insensitive filesystem */
    static final class C08621 extends SuspendLambda implements Function1<Continuation<? super FinancialConnectionsInstitution>, Object> {
        int label;

        C08621(Continuation<? super C08621> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AccountPickerViewModel.this.new C08621(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super FinancialConnectionsInstitution> continuation) {
            return ((C08621) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = GetOrFetchSync.invoke$default(AccountPickerViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FinancialConnectionsInstitution activeInstitution = ((SynchronizeSessionResponse) obj).getManifest().getActiveInstitution();
            if (activeInstitution != null) {
                return activeInstitution;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private final void loadInstitution() {
        FinancialConnectionsViewModel.execute$default(this, new C08621(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountPickerViewModel.loadInstitution$lambda$0((AccountPickerState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountPickerState loadInstitution$lambda$0(AccountPickerState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return AccountPickerState.copy$default(execute, it, null, false, null, null, null, 62, null);
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$loadAccounts$1", f = "AccountPickerViewModel.kt", i = {0, 1, 1, 1, 1, 1}, l = {103, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m = "invokeSuspend", n = {ServerProtocol.DIALOG_PARAM_STATE, BaseJavaModule.METHOD_TYPE_SYNC, "dataAccessNotice", "manifest", "activeAuthSession", "startTime$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "J$0"})
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$loadAccounts$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super AccountPickerState.Payload>, Object> {
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
            return AccountPickerViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AccountPickerState.Payload> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x011b A[PHI: r1
          0x011b: PHI (r1v26 java.lang.Boolean) = (r1v13 java.lang.Boolean), (r1v14 java.lang.Boolean) binds: [B:35:0x0119, B:38:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws StripeException {
            AccountPickerState value;
            Object objInvoke$default;
            SynchronizeSessionResponse synchronizeSessionResponse;
            DataAccessNotice dataAccessNotice;
            FinancialConnectionsSessionManifest manifest;
            long jCurrentTimeMillis;
            Object objInvoke;
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
            ConsentPane consent;
            PartnerAccountsList partnerAccountsList;
            TextUpdate text;
            AccountPickerPane accountPicker;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            String dataAccessNotice2 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                value = AccountPickerViewModel.this.getStateFlow().getValue();
                this.L$0 = value;
                this.label = 1;
                objInvoke$default = GetOrFetchSync.invoke$default(AccountPickerViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (objInvoke$default != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j = this.J$0;
                financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) this.L$3;
                manifest = (FinancialConnectionsSessionManifest) this.L$2;
                dataAccessNotice = (DataAccessNotice) this.L$1;
                synchronizeSessionResponse = (SynchronizeSessionResponse) this.L$0;
                ResultKt.throwOnFailure(obj);
                jCurrentTimeMillis = j;
                objInvoke = obj;
                DataAccessNotice dataAccessNotice3 = dataAccessNotice;
                Pair pair = TuplesKt.to((PartnerAccountsList) objInvoke, Boxing.boxLong(System.currentTimeMillis() - jCurrentTimeMillis));
                partnerAccountsList = (PartnerAccountsList) pair.component1();
                long jLongValue = ((Number) pair.component2()).longValue();
                if (!partnerAccountsList.getData().isEmpty()) {
                    AccountPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PollAccountsSucceeded(AccountPickerViewModel.PANE, financialConnectionsAuthorizationSession.getId(), jLongValue));
                }
                List listSortedWith = CollectionsKt.sortedWith(partnerAccountsList.getData(), new Comparator() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$loadAccounts$1$invokeSuspend$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Boolean.valueOf(!((PartnerAccount) t).getAllowSelection$financial_connections_release()), Boolean.valueOf(!((PartnerAccount) t2).getAllowSelection$financial_connections_release()));
                    }
                });
                text = synchronizeSessionResponse.getText();
                if (text != null && (accountPicker = text.getAccountPicker()) != null) {
                    dataAccessNotice2 = accountPicker.getDataAccessNotice();
                }
                String str = dataAccessNotice2;
                AccountPickerViewModel.this.throwErrorIfNoSelectableAccounts(listSortedWith, manifest);
                Boolean skipAccountSelection = partnerAccountsList.getSkipAccountSelection();
                boolean zBooleanValue = (skipAccountSelection != null && (skipAccountSelection = financialConnectionsAuthorizationSession.getSkipAccountSelection()) == null) ? false : skipAccountSelection.booleanValue();
                AccountPickerState.SelectionMode selectionMode = !manifest.getSingleAccount() ? AccountPickerState.SelectionMode.Single : AccountPickerState.SelectionMode.Multiple;
                boolean singleAccount = manifest.getSingleAccount();
                boolean z = !manifest.getSingleAccount() && Intrinsics.areEqual(financialConnectionsAuthorizationSession.getInstitutionSkipAccountSelection(), Boxing.boxBoolean(true)) && listSortedWith.size() == 1;
                String businessName = manifest.getBusinessName();
                Boolean boolIsStripeDirect = manifest.isStripeDirect();
                AccountPickerState.Payload payload = new AccountPickerState.Payload(zBooleanValue, listSortedWith, str, dataAccessNotice3, selectionMode, singleAccount, boolIsStripeDirect != null ? boolIsStripeDirect.booleanValue() : false, businessName, z);
                AccountPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(AccountPickerViewModel.PANE));
                return payload;
            }
            value = (AccountPickerState) this.L$0;
            ResultKt.throwOnFailure(obj);
            objInvoke$default = obj;
            synchronizeSessionResponse = (SynchronizeSessionResponse) objInvoke$default;
            TextUpdate text2 = synchronizeSessionResponse.getText();
            dataAccessNotice = (text2 == null || (consent = text2.getConsent()) == null) ? null : consent.getDataAccessNotice();
            manifest = synchronizeSessionResponse.getManifest();
            FinancialConnectionsAuthorizationSession activeAuthSession = manifest.getActiveAuthSession();
            if (activeAuthSession == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            AccountPickerViewModel accountPickerViewModel = AccountPickerViewModel.this;
            jCurrentTimeMillis = System.currentTimeMillis();
            PollAuthorizationSessionAccounts pollAuthorizationSessionAccounts = accountPickerViewModel.pollAuthorizationSessionAccounts;
            boolean canRetry = value.getCanRetry();
            this.L$0 = synchronizeSessionResponse;
            this.L$1 = dataAccessNotice;
            this.L$2 = manifest;
            this.L$3 = activeAuthSession;
            this.J$0 = jCurrentTimeMillis;
            this.label = 2;
            objInvoke = pollAuthorizationSessionAccounts.invoke(canRetry, synchronizeSessionResponse, this);
            if (objInvoke != coroutine_suspended) {
                financialConnectionsAuthorizationSession = activeAuthSession;
                DataAccessNotice dataAccessNotice32 = dataAccessNotice;
                Pair pair2 = TuplesKt.to((PartnerAccountsList) objInvoke, Boxing.boxLong(System.currentTimeMillis() - jCurrentTimeMillis));
                partnerAccountsList = (PartnerAccountsList) pair2.component1();
                long jLongValue2 = ((Number) pair2.component2()).longValue();
                if (!partnerAccountsList.getData().isEmpty()) {
                }
                List listSortedWith2 = CollectionsKt.sortedWith(partnerAccountsList.getData(), new Comparator() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$loadAccounts$1$invokeSuspend$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Boolean.valueOf(!((PartnerAccount) t).getAllowSelection$financial_connections_release()), Boolean.valueOf(!((PartnerAccount) t2).getAllowSelection$financial_connections_release()));
                    }
                });
                text = synchronizeSessionResponse.getText();
                if (text != null) {
                    dataAccessNotice2 = accountPicker.getDataAccessNotice();
                }
                String str2 = dataAccessNotice2;
                AccountPickerViewModel.this.throwErrorIfNoSelectableAccounts(listSortedWith2, manifest);
                Boolean skipAccountSelection2 = partnerAccountsList.getSkipAccountSelection();
                if (skipAccountSelection2 != null) {
                }
                AccountPickerState.SelectionMode selectionMode2 = !manifest.getSingleAccount() ? AccountPickerState.SelectionMode.Single : AccountPickerState.SelectionMode.Multiple;
                boolean singleAccount2 = manifest.getSingleAccount();
                if (manifest.getSingleAccount()) {
                }
                String businessName2 = manifest.getBusinessName();
                Boolean boolIsStripeDirect2 = manifest.isStripeDirect();
                AccountPickerState.Payload payload2 = new AccountPickerState.Payload(zBooleanValue, listSortedWith2, str2, dataAccessNotice32, selectionMode2, singleAccount2, boolIsStripeDirect2 != null ? boolIsStripeDirect2.booleanValue() : false, businessName2, z);
                AccountPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(AccountPickerViewModel.PANE));
                return payload2;
            }
            return coroutine_suspended;
        }
    }

    private final void loadAccounts() {
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountPickerViewModel.loadAccounts$lambda$1((AccountPickerState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountPickerState loadAccounts$lambda$1(AccountPickerState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return AccountPickerState.copy$default(execute, null, it, false, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwErrorIfNoSelectableAccounts(List<PartnerAccount> accounts, FinancialConnectionsSessionManifest manifest) throws AccountLoadError {
        List<PartnerAccount> list = accounts;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((PartnerAccount) it.next()).getAllowSelection$financial_connections_release()) {
                    return;
                }
            }
        }
        boolean allowManualEntry = manifest.getAllowManualEntry();
        FinancialConnectionsInstitution activeInstitution = manifest.getActiveInstitution();
        if (activeInstitution != null) {
            throw new AccountLoadError(allowManualEntry, true, activeInstitution, new LocalStripeException("No accounts available to select.", null));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "payload", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onPayloadLoaded$2", f = "AccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onPayloadLoaded$2, reason: invalid class name and case insensitive filesystem */
    static final class C08672 extends SuspendLambda implements Function2<AccountPickerState.Payload, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C08672(Continuation<? super C08672> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08672 c08672 = AccountPickerViewModel.this.new C08672(continuation);
            c08672.L$0 = obj;
            return c08672;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountPickerState.Payload payload, Continuation<? super Unit> continuation) {
            return ((C08672) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountPickerState.Payload payload = (AccountPickerState.Payload) this.L$0;
            if (payload.getSkipAccountSelection()) {
                AccountPickerViewModel accountPickerViewModel = AccountPickerViewModel.this;
                List<PartnerAccount> selectableAccounts = payload.getSelectableAccounts();
                if (payload.getSingleAccount()) {
                    selectableAccounts = CollectionsKt.take(selectableAccounts, 1);
                }
                List<PartnerAccount> list = selectableAccounts;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PartnerAccount) it.next()).getId());
                }
                accountPickerViewModel.submitAccounts(CollectionsKt.toSet(arrayList), true);
            } else if (payload.getUserSelectedSingleAccountInInstitution()) {
                AccountPickerViewModel.this.submitAccounts(SetsKt.setOf(((PartnerAccount) CollectionsKt.first((List) payload.getAccounts())).getId()), true);
            } else if (payload.getSelectionMode() == AccountPickerState.SelectionMode.Single) {
                PartnerAccount partnerAccount = (PartnerAccount) CollectionsKt.firstOrNull((List) payload.getSelectableAccounts());
                final Set ofNotNull = SetsKt.setOfNotNull(partnerAccount != null ? partnerAccount.getId() : null);
                AccountPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AccountsAutoSelected(AccountPickerViewModel.PANE, ofNotNull, true));
                AccountPickerViewModel.this.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onPayloadLoaded$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AccountPickerViewModel.C08672.invokeSuspend$lambda$2(ofNotNull, (AccountPickerState) obj2);
                    }
                });
            } else if (payload.getSelectionMode() == AccountPickerState.SelectionMode.Multiple) {
                List<PartnerAccount> selectableAccounts2 = payload.getSelectableAccounts();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectableAccounts2, 10));
                Iterator<T> it2 = selectableAccounts2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((PartnerAccount) it2.next()).getId());
                }
                final Set set = CollectionsKt.toSet(arrayList2);
                AccountPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AccountsAutoSelected(AccountPickerViewModel.PANE, set, false));
                AccountPickerViewModel.this.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onPayloadLoaded$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AccountPickerViewModel.C08672.invokeSuspend$lambda$4(set, (AccountPickerState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AccountPickerState invokeSuspend$lambda$2(Set set, AccountPickerState accountPickerState) {
            return AccountPickerState.copy$default(accountPickerState, null, null, false, null, set, null, 47, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AccountPickerState invokeSuspend$lambda$4(Set set, AccountPickerState accountPickerState) {
            return AccountPickerState.copy$default(accountPickerState, null, null, false, null, set, null, 47, null);
        }
    }

    private final void onPayloadLoaded() {
        FinancialConnectionsViewModel.onAsync$default(this, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel.onPayloadLoaded.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((AccountPickerState) obj).getPayload();
            }
        }, new C08672(null), null, 4, null);
    }

    private final void logErrors() {
        AccountPickerViewModel accountPickerViewModel = this;
        FinancialConnectionsViewModel.onAsync$default(accountPickerViewModel, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel.logErrors.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((AccountPickerState) obj).getPayload();
            }
        }, null, new AnonymousClass2(null), 2, null);
        FinancialConnectionsViewModel.onAsync$default(accountPickerViewModel, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel.logErrors.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((AccountPickerState) obj).getSelectAccounts();
            }
        }, null, new AnonymousClass4(null), 2, null);
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$logErrors$2", f = "AccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$logErrors$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = AccountPickerViewModel.this.new AnonymousClass2(continuation);
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
            FinancialConnectionsAnalyticsTrackerKt.logError(AccountPickerViewModel.this.eventTracker, "Error retrieving accounts", (Throwable) this.L$0, AccountPickerViewModel.this.logger, AccountPickerViewModel.PANE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$logErrors$4", f = "AccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$logErrors$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = AccountPickerViewModel.this.new AnonymousClass4(continuation);
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
            FinancialConnectionsAnalyticsTrackerKt.logError(AccountPickerViewModel.this.eventTracker, "Error selecting accounts", (Throwable) this.L$0, AccountPickerViewModel.this.logger, AccountPickerViewModel.PANE);
            return Unit.INSTANCE;
        }
    }

    public final void onAccountClicked(final PartnerAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        withState(new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountPickerViewModel.onAccountClicked$lambda$6(this.f$0, account, (AccountPickerState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAccountClicked$lambda$6(AccountPickerViewModel accountPickerViewModel, PartnerAccount partnerAccount, AccountPickerState state) {
        final Set<String> of;
        Intrinsics.checkNotNullParameter(state, "state");
        AccountPickerState.Payload payloadInvoke = state.getPayload().invoke();
        if (payloadInvoke != null) {
            Set<String> selectedIds = state.getSelectedIds();
            int i = WhenMappings.$EnumSwitchMapping$0[payloadInvoke.getSelectionMode().ordinal()];
            if (i == 1) {
                of = SetsKt.setOf(partnerAccount.getId());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (selectedIds.contains(partnerAccount.getId())) {
                    of = SetsKt.minus(selectedIds, partnerAccount.getId());
                } else {
                    of = SetsKt.plus(selectedIds, partnerAccount.getId());
                }
            }
            accountPickerViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountPickerViewModel.onAccountClicked$lambda$6$lambda$4$lambda$3(of, (AccountPickerState) obj);
                }
            });
            accountPickerViewModel.logAccountSelectionChanges(selectedIds, of, payloadInvoke.getSingleAccount());
        } else {
            Logger.DefaultImpls.error$default(accountPickerViewModel.logger, "account clicked without available payload.", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountPickerState onAccountClicked$lambda$6$lambda$4$lambda$3(Set set, AccountPickerState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return AccountPickerState.copy$default(setState, null, null, false, null, set, null, 47, null);
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$logAccountSelectionChanges$1", f = "AccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$logAccountSelectionChanges$1, reason: invalid class name and case insensitive filesystem */
    static final class C08631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Set<String> $idsAfter;
        final /* synthetic */ Set<String> $idsBefore;
        final /* synthetic */ boolean $isSingleAccount;
        int label;
        final /* synthetic */ AccountPickerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08631(Set<String> set, Set<String> set2, AccountPickerViewModel accountPickerViewModel, boolean z, Continuation<? super C08631> continuation) {
            super(2, continuation);
            this.$idsAfter = set;
            this.$idsBefore = set2;
            this.this$0 = accountPickerViewModel;
            this.$isSingleAccount = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C08631(this.$idsAfter, this.$idsBefore, this.this$0, this.$isSingleAccount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Set setMinus = SetsKt.minus((Set) this.$idsAfter, (Iterable) this.$idsBefore);
            Set setMinus2 = SetsKt.minus((Set) this.$idsBefore, (Iterable) this.$idsAfter);
            if (setMinus.size() == 1) {
                this.this$0.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AccountSelected(AccountPickerViewModel.PANE, true, this.$isSingleAccount, (String) CollectionsKt.first(setMinus)));
            }
            if (setMinus2.size() == 1) {
                this.this$0.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AccountSelected(AccountPickerViewModel.PANE, false, this.$isSingleAccount, (String) CollectionsKt.first(setMinus2)));
            }
            return Unit.INSTANCE;
        }
    }

    private final void logAccountSelectionChanges(Set<String> idsBefore, Set<String> idsAfter, boolean isSingleAccount) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08631(idsAfter, idsBefore, this, isSingleAccount, null), 3, null);
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onSubmit$1", f = "AccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onSubmit$1, reason: invalid class name and case insensitive filesystem */
    static final class C08681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C08681(Continuation<? super C08681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountPickerViewModel.this.new C08681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AccountPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.ClickLinkAccounts(AccountPickerViewModel.PANE));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onSubmit() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08681(null), 3, null);
        FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.ACCOUNTS_SELECTED, null, 2, null);
        withState(new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountPickerViewModel.onSubmit$lambda$9(this.f$0, (AccountPickerState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSubmit$lambda$9(AccountPickerViewModel accountPickerViewModel, AccountPickerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getPayload().invoke() != null) {
            accountPickerViewModel.submitAccounts(state.getSelectedIds(), false);
        } else {
            Logger.DefaultImpls.error$default(accountPickerViewModel.logger, "account clicked without available payload.", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$submitAccounts$1", f = "AccountPickerViewModel.kt", i = {1, 2}, l = {326, 327, 337}, m = "invokeSuspend", n = {"manifest", "accountsList"}, s = {"L$0", "L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$submitAccounts$1, reason: invalid class name and case insensitive filesystem */
    static final class C08691 extends SuspendLambda implements Function1<Continuation<? super PartnerAccountsList>, Object> {
        final /* synthetic */ boolean $isSkipAccountSelection;
        final /* synthetic */ Set<String> $selectedIds;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08691(Set<String> set, boolean z, Continuation<? super C08691> continuation) {
            super(1, continuation);
            this.$selectedIds = set;
            this.$isSkipAccountSelection = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AccountPickerViewModel.this.new C08691(this.$selectedIds, this.$isSkipAccountSelection, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super PartnerAccountsList> continuation) {
            return ((C08691) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FinancialConnectionsSessionManifest manifest;
            PartnerAccountsList partnerAccountsList;
            String clientSecret;
            PartnerAccountsList partnerAccountsList2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.AccountsSubmitted(AccountPickerViewModel.PANE, this.$selectedIds, this.$isSkipAccountSelection));
                this.label = 1;
                obj = GetOrFetchSync.invoke$default(AccountPickerViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    partnerAccountsList2 = (PartnerAccountsList) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    partnerAccountsList = partnerAccountsList2;
                    NavigationManager.DefaultImpls.tryNavigateTo$default(AccountPickerViewModel.this.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(partnerAccountsList.getNextPane()), AccountPickerViewModel.PANE, null, 2, null), null, false, 6, null);
                    return partnerAccountsList;
                }
                manifest = (FinancialConnectionsSessionManifest) this.L$0;
                ResultKt.throwOnFailure(obj);
                partnerAccountsList = (PartnerAccountsList) obj;
                CachedConsumerSession cachedConsumerSessionProvideConsumerSession = AccountPickerViewModel.this.consumerSessionProvider.provideConsumerSession();
                clientSecret = cachedConsumerSessionProvideConsumerSession == null ? cachedConsumerSessionProvideConsumerSession.getClientSecret() : null;
                if (ManifestExtensionsKt.isDataFlow(manifest) && ManifestExtensionsKt.getCanSaveAccountsToLink(manifest) && clientSecret != null) {
                    this.L$0 = partnerAccountsList;
                    this.label = 3;
                    if (AccountPickerViewModel.this.saveAccountToLink.existing(clientSecret, GetCachedAccountsKt.toCachedPartnerAccounts(partnerAccountsList.getData()), ManifestExtensionsKt.isDataFlow(manifest), this) != coroutine_suspended) {
                        partnerAccountsList2 = partnerAccountsList;
                        partnerAccountsList = partnerAccountsList2;
                    }
                    return coroutine_suspended;
                }
                NavigationManager.DefaultImpls.tryNavigateTo$default(AccountPickerViewModel.this.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(partnerAccountsList.getNextPane()), AccountPickerViewModel.PANE, null, 2, null), null, false, 6, null);
                return partnerAccountsList;
            }
            ResultKt.throwOnFailure(obj);
            manifest = ((SynchronizeSessionResponse) obj).getManifest();
            SelectAccounts selectAccounts = AccountPickerViewModel.this.selectAccounts;
            Set<String> set = this.$selectedIds;
            FinancialConnectionsAuthorizationSession activeAuthSession = manifest.getActiveAuthSession();
            if (activeAuthSession != null) {
                this.L$0 = manifest;
                this.label = 2;
                obj = selectAccounts.invoke(set, activeAuthSession.getId(), this);
                if (obj != coroutine_suspended) {
                    partnerAccountsList = (PartnerAccountsList) obj;
                    CachedConsumerSession cachedConsumerSessionProvideConsumerSession2 = AccountPickerViewModel.this.consumerSessionProvider.provideConsumerSession();
                    if (cachedConsumerSessionProvideConsumerSession2 == null) {
                    }
                    if (ManifestExtensionsKt.isDataFlow(manifest)) {
                        this.L$0 = partnerAccountsList;
                        this.label = 3;
                        if (AccountPickerViewModel.this.saveAccountToLink.existing(clientSecret, GetCachedAccountsKt.toCachedPartnerAccounts(partnerAccountsList.getData()), ManifestExtensionsKt.isDataFlow(manifest), this) != coroutine_suspended) {
                        }
                    }
                    NavigationManager.DefaultImpls.tryNavigateTo$default(AccountPickerViewModel.this.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(partnerAccountsList.getNextPane()), AccountPickerViewModel.PANE, null, 2, null), null, false, 6, null);
                    return partnerAccountsList;
                }
                return coroutine_suspended;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitAccounts(Set<String> selectedIds, boolean isSkipAccountSelection) {
        FinancialConnectionsViewModel.execute$default(this, new C08691(selectedIds, isSkipAccountSelection, null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountPickerViewModel.submitAccounts$lambda$10((AccountPickerState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountPickerState submitAccounts$lambda$10(AccountPickerState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return AccountPickerState.copy$default(execute, null, null, false, it, null, null, 55, null);
    }

    public final void selectAnotherBank() {
        NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.Reset.INSTANCE, PANE, null, 2, null), null, false, 6, null);
    }

    public final void onEnterDetailsManually() {
        NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.ManualEntry.INSTANCE, PANE, null, 2, null), null, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountPickerState onLoadAccountsAgain$lambda$11(AccountPickerState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return AccountPickerState.copy$default(setState, null, null, false, null, null, null, 59, null);
    }

    public final void onLoadAccountsAgain() {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountPickerViewModel.onLoadAccountsAgain$lambda$11((AccountPickerState) obj);
            }
        });
        loadAccounts();
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onClickableTextClick$1", f = "AccountPickerViewModel.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onClickableTextClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C08651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08651(String str, Continuation<? super C08651> continuation) {
            super(2, continuation);
            this.$uri = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountPickerViewModel.this.new C08651(this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Date date = new Date();
                HandleClickableUrl handleClickableUrl = AccountPickerViewModel.this.handleClickableUrl;
                FinancialConnectionsSessionManifest.Pane pane = AccountPickerViewModel.PANE;
                final String str = this.$uri;
                final AccountPickerViewModel accountPickerViewModel = AccountPickerViewModel.this;
                this.label = 1;
                if (handleClickableUrl.invoke(pane, str, new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onClickableTextClick$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AccountPickerViewModel.C08651.invokeSuspend$lambda$1(accountPickerViewModel, str, date, (String) obj2);
                    }
                }, MapsKt.mapOf(TuplesKt.to(AccountPickerClickableText.DATA.getValue(), new AnonymousClass2(AccountPickerViewModel.this, null))), this) == coroutine_suspended) {
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
        public static final Unit invokeSuspend$lambda$1(AccountPickerViewModel accountPickerViewModel, final String str, final Date date, String str2) {
            accountPickerViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onClickableTextClick$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountPickerViewModel.C08651.invokeSuspend$lambda$1$lambda$0(str, date, (AccountPickerState) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AccountPickerState invokeSuspend$lambda$1$lambda$0(String str, Date date, AccountPickerState accountPickerState) {
            return AccountPickerState.copy$default(accountPickerState, null, null, false, null, null, new AccountPickerState.ViewEffect.OpenUrl(str, date.getTime()), 31, null);
        }

        /* compiled from: AccountPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onClickableTextClick$1$2", f = "AccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onClickableTextClick$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<HandleClickableUrl.DeeplinkPayload, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AccountPickerViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AccountPickerViewModel accountPickerViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = accountPickerViewModel;
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
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08651(uri, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentDataAccessBottomSheet() {
        DataAccessNotice dataAccessNotice;
        AccountPickerState.Payload payloadInvoke = getStateFlow().getValue().getPayload().invoke();
        if (payloadInvoke == null || (dataAccessNotice = payloadInvoke.getDataAccessNotice()) == null) {
            return;
        }
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker = this.eventTracker;
        FinancialConnectionsSessionManifest.Pane pane = PANE;
        financialConnectionsAnalyticsTracker.track(new FinancialConnectionsAnalyticsEvent.ClickLearnMoreDataAccess(pane));
        this.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.DataAccess(dataAccessNotice), pane);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountPickerState onViewEffectLaunched$lambda$12(AccountPickerState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return AccountPickerState.copy$default(setState, null, null, false, null, null, null, 31, null);
    }

    public final void onViewEffectLaunched() {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountPickerViewModel.onViewEffectLaunched$lambda$12((AccountPickerState) obj);
            }
        });
    }

    /* compiled from: AccountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AccountPickerViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getAccountPickerViewModelFactory().create(new AccountPickerState(null, null, false, null, null, null, 63, null));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(AccountPickerViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountPickerViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
