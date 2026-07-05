package com.stripe.android.financialconnections.features.accountupdate;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.exception.UnclassifiedError;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountUpdateRequiredViewModel.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%BK\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0006\u0010\u0019\u001a\u00020\u0015J$\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001a\u0010!\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010\"\u001a\u00020\u0015J\b\u0010#\u001a\u00020\u0015H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "updateRequiredContentRepository", "Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;", "pendingRepairRepository", "Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "updateLocalManifest", "Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;Lcom/stripe/android/financialconnections/repository/CoreAuthorizationPendingNetworkingRepairRepository;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;Lcom/stripe/android/core/Logger;)V", "loadContent", "", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "handleContinue", "openBankAuthRepair", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "authorization", "", Destination.KEY_REFERRER, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "openPartnerAuth", "handleCancel", "onCleared", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountUpdateRequiredViewModel extends FinancialConnectionsViewModel<AccountUpdateRequiredState> {
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final CoreAuthorizationPendingNetworkingRepairRepository pendingRepairRepository;
    private final UpdateLocalManifest updateLocalManifest;
    private final AccountUpdateRequiredContentRepository updateRequiredContentRepository;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.ACCOUNT_UPDATE_REQUIRED;

    /* compiled from: AccountUpdateRequiredViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        AccountUpdateRequiredViewModel create(AccountUpdateRequiredState initialState);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(AccountUpdateRequiredState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public AccountUpdateRequiredViewModel(@Assisted AccountUpdateRequiredState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, AccountUpdateRequiredContentRepository updateRequiredContentRepository, CoreAuthorizationPendingNetworkingRepairRepository pendingRepairRepository, NavigationManager navigationManager, FinancialConnectionsAnalyticsTracker eventTracker, UpdateLocalManifest updateLocalManifest, Logger logger) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(updateRequiredContentRepository, "updateRequiredContentRepository");
        Intrinsics.checkNotNullParameter(pendingRepairRepository, "pendingRepairRepository");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(updateLocalManifest, "updateLocalManifest");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.updateRequiredContentRepository = updateRequiredContentRepository;
        this.pendingRepairRepository = pendingRepairRepository;
        this.navigationManager = navigationManager;
        this.eventTracker = eventTracker;
        this.updateLocalManifest = updateLocalManifest;
        this.logger = logger;
        loadContent();
    }

    /* compiled from: AccountUpdateRequiredViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel$loadContent$1", f = "AccountUpdateRequiredViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel$loadContent$1, reason: invalid class name and case insensitive filesystem */
    static final class C08711 extends SuspendLambda implements Function1<Continuation<? super NoticeSheetState.NoticeSheetContent.UpdateRequired>, Object> {
        int label;

        C08711(Continuation<? super C08711> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AccountUpdateRequiredViewModel.this.new C08711(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super NoticeSheetState.NoticeSheetContent.UpdateRequired> continuation) {
            return ((C08711) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountUpdateRequiredContentRepository.State state = AccountUpdateRequiredViewModel.this.updateRequiredContentRepository.get();
            NoticeSheetState.NoticeSheetContent.UpdateRequired payload = state != null ? state.getPayload() : null;
            if (payload != null) {
                return payload;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private final void loadContent() {
        FinancialConnectionsViewModel.execute$default(this, new C08711(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountUpdateRequiredViewModel.loadContent$lambda$0((AccountUpdateRequiredState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountUpdateRequiredState loadContent$lambda$0(AccountUpdateRequiredState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return AccountUpdateRequiredState.copy$default(execute, null, it, 1, null);
    }

    /* compiled from: AccountUpdateRequiredViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel$handleContinue$1", f = "AccountUpdateRequiredViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel$handleContinue$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountUpdateRequiredViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountUpdateRequiredState value = AccountUpdateRequiredViewModel.this.getStateFlow().getValue();
            FinancialConnectionsSessionManifest.Pane referrer = value.getReferrer();
            NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequiredInvoke = value.getPayload().invoke();
            NoticeSheetState.NoticeSheetContent.UpdateRequired.Type type = updateRequiredInvoke != null ? updateRequiredInvoke.getType() : null;
            if (type == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (type instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Repair) {
                NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Repair repair = (NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Repair) type;
                AccountUpdateRequiredViewModel.this.openBankAuthRepair(repair.getInstitution(), repair.getAuthorization(), referrer);
            } else if (type instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability) {
                AccountUpdateRequiredViewModel.this.openPartnerAuth(((NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability) type).getInstitution(), referrer);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public final void handleContinue() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openBankAuthRepair(final FinancialConnectionsInstitution institution, String authorization, FinancialConnectionsSessionManifest.Pane referrer) {
        if (institution != null && authorization != null) {
            this.updateLocalManifest.invoke(new Function1() { // from class: com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountUpdateRequiredViewModel.openBankAuthRepair$lambda$1(institution, (FinancialConnectionsSessionManifest) obj);
                }
            });
            this.pendingRepairRepository.set(authorization);
            NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.BankAuthRepair.INSTANCE, referrer, null, 2, null), null, false, 6, null);
        } else {
            FinancialConnectionsAnalyticsTrackerKt.logError(this.eventTracker, "Unable to open repair flow (missing auth: " + (authorization == null) + ", missing institution: " + (institution == null) + ").", new UnclassifiedError("UpdateRepairAccountError", null, 2, null), this.logger, PANE);
            NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.InstitutionPicker.INSTANCE, referrer, null, 2, null), null, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSessionManifest openBankAuthRepair$lambda$1(FinancialConnectionsInstitution financialConnectionsInstitution, FinancialConnectionsSessionManifest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FinancialConnectionsSessionManifest.copy$default(it, false, false, null, false, false, null, false, false, false, false, false, false, null, null, null, null, false, false, null, null, null, null, null, null, financialConnectionsInstitution, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPartnerAuth(final FinancialConnectionsInstitution institution, FinancialConnectionsSessionManifest.Pane referrer) {
        if (institution != null) {
            this.updateLocalManifest.invoke(new Function1() { // from class: com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountUpdateRequiredViewModel.openPartnerAuth$lambda$2(institution, (FinancialConnectionsSessionManifest) obj);
                }
            });
            NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.PartnerAuth.INSTANCE, referrer, null, 2, null), null, false, 6, null);
        } else {
            NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.InstitutionPicker.INSTANCE, referrer, null, 2, null), null, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSessionManifest openPartnerAuth$lambda$2(FinancialConnectionsInstitution financialConnectionsInstitution, FinancialConnectionsSessionManifest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FinancialConnectionsSessionManifest.copy$default(it, false, false, null, false, false, null, false, false, false, false, false, false, null, null, null, null, false, false, null, null, null, null, null, null, financialConnectionsInstitution, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 16383, null);
    }

    public final void handleCancel() {
        this.navigationManager.tryNavigateBack();
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        this.updateRequiredContentRepository.clear();
        super.onCleared();
    }

    /* compiled from: AccountUpdateRequiredViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "arguments", "Landroid/os/Bundle;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPANE$financial_connections_release", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AccountUpdateRequiredViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, Bundle bundle, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getAccountUpdateRequiredViewModelFactory().create(new AccountUpdateRequiredState(bundle));
        }

        public final FinancialConnectionsSessionManifest.Pane getPANE$financial_connections_release() {
            return AccountUpdateRequiredViewModel.PANE;
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent, final Bundle arguments) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(AccountUpdateRequiredViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountUpdateRequiredViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, arguments, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
