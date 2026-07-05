package com.stripe.android.financialconnections.features.institutionpicker;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.imageutils.JfifUtil;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.actions.SearchIntents;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.FeaturedInstitutions;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.domain.SearchInstitutions;
import com.stripe.android.financialconnections.domain.SelectInstitution;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitutionSelected;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.utils.ConflatedJob;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import com.stripe.android.uicore.navigation.NavigationManager;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: InstitutionPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000223Bs\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'J\u0016\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\u0010\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/H\u0002J\u0006\u00100\u001a\u00020$J\u0006\u00101\u001a\u00020$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "postAuthorizationSession", "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;", "selectInstitution", "Lcom/stripe/android/financialconnections/domain/SelectInstitution;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "searchInstitutions", "Lcom/stripe/android/financialconnections/domain/SearchInstitutions;", "featuredInstitutions", "Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "handleError", "Lcom/stripe/android/financialconnections/domain/HandleError;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "updateLocalManifest", "Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;", "logger", "Lcom/stripe/android/core/Logger;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "<init>", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;Lcom/stripe/android/financialconnections/domain/SelectInstitution;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/SearchInstitutions;Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/HandleError;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V", "searchJob", "Lcom/stripe/android/financialconnections/utils/ConflatedJob;", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "logErrors", "", "onQueryChanged", SearchIntents.EXTRA_QUERY, "", "onInstitutionSelected", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "fromFeatured", "", "navigateToPartnerAuth", "authSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "onManualEntryClick", "onScrollChanged", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InstitutionPickerViewModel extends FinancialConnectionsViewModel<InstitutionPickerState> {
    private static final long SEARCH_DEBOUNCE_MS = 300;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final FeaturedInstitutions featuredInstitutions;
    private final GetOrFetchSync getOrFetchSync;
    private final HandleError handleError;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final PostAuthorizationSession postAuthorizationSession;
    private final SearchInstitutions searchInstitutions;
    private ConflatedJob searchJob;
    private final SelectInstitution selectInstitution;
    private final UpdateLocalManifest updateLocalManifest;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;

    /* compiled from: InstitutionPickerViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        InstitutionPickerViewModel create(InstitutionPickerState initialState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public InstitutionPickerViewModel(FinancialConnectionsSheetConfiguration configuration, PostAuthorizationSession postAuthorizationSession, SelectInstitution selectInstitution, GetOrFetchSync getOrFetchSync, SearchInstitutions searchInstitutions, FeaturedInstitutions featuredInstitutions, FinancialConnectionsAnalyticsTracker eventTracker, HandleError handleError, NavigationManager navigationManager, UpdateLocalManifest updateLocalManifest, Logger logger, @Assisted InstitutionPickerState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(postAuthorizationSession, "postAuthorizationSession");
        Intrinsics.checkNotNullParameter(selectInstitution, "selectInstitution");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(searchInstitutions, "searchInstitutions");
        Intrinsics.checkNotNullParameter(featuredInstitutions, "featuredInstitutions");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(updateLocalManifest, "updateLocalManifest");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        this.configuration = configuration;
        this.postAuthorizationSession = postAuthorizationSession;
        this.selectInstitution = selectInstitution;
        this.getOrFetchSync = getOrFetchSync;
        this.searchInstitutions = searchInstitutions;
        this.featuredInstitutions = featuredInstitutions;
        this.eventTracker = eventTracker;
        this.handleError = handleError;
        this.navigationManager = navigationManager;
        this.updateLocalManifest = updateLocalManifest;
        this.logger = logger;
        this.searchJob = new ConflatedJob();
        logErrors();
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InstitutionPickerViewModel._init_$lambda$0((InstitutionPickerState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* compiled from: InstitutionPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$1", f = "InstitutionPickerViewModel.kt", i = {1, 1}, l = {77, 80}, m = "invokeSuspend", n = {"manifest", "startTime$iv"}, s = {"L$0", "J$0"})
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super InstitutionPickerState.Payload>, Object> {
        long J$0;
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return InstitutionPickerViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super InstitutionPickerState.Payload> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(10:6|36|7|22|27|(1:29)|30|(1:33)|34|35)(2:11|12))(1:13))(3:14|(0)|20)|17|38|18|(8:21|22|27|(0)|30|(0)|34|35)|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        
            r2 = r11;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            long j;
            Object objM9118constructorimpl;
            Throwable thM9121exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = GetOrFetchSync.invoke$default(InstitutionPickerViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    objM9118constructorimpl = Result.m9118constructorimpl(TuplesKt.to((InstitutionResponse) obj, Boxing.boxLong(System.currentTimeMillis() - j)));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    Result.Companion companion = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th2));
                    InstitutionPickerViewModel institutionPickerViewModel = InstitutionPickerViewModel.this;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                    }
                    Pair pair = (Pair) objM9118constructorimpl;
                    return new InstitutionPickerState.Payload((InstitutionResponse) pair.component1(), financialConnectionsSessionManifest.getInstitutionSearchDisabled(), ((Number) pair.component2()).longValue());
                }
                InstitutionPickerViewModel institutionPickerViewModel2 = InstitutionPickerViewModel.this;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    FinancialConnectionsAnalyticsTrackerKt.logError(institutionPickerViewModel2.eventTracker, "Error fetching featured institutions", thM9121exceptionOrNullimpl, institutionPickerViewModel2.logger, InstitutionPickerViewModel.PANE);
                }
                if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                    objM9118constructorimpl = TuplesKt.to(new InstitutionResponse(Boxing.boxBoolean(financialConnectionsSessionManifest.getAllowManualEntry()), CollectionsKt.emptyList()), Boxing.boxLong(0L));
                }
                Pair pair2 = (Pair) objM9118constructorimpl;
                return new InstitutionPickerState.Payload((InstitutionResponse) pair2.component1(), financialConnectionsSessionManifest.getInstitutionSearchDisabled(), ((Number) pair2.component2()).longValue());
            }
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) obj).getManifest();
            InstitutionPickerViewModel institutionPickerViewModel3 = InstitutionPickerViewModel.this;
            Result.Companion companion2 = Result.INSTANCE;
            long jCurrentTimeMillis = System.currentTimeMillis();
            FeaturedInstitutions featuredInstitutions = institutionPickerViewModel3.featuredInstitutions;
            String financialConnectionsSessionClientSecret = institutionPickerViewModel3.configuration.getFinancialConnectionsSessionClientSecret();
            this.L$0 = manifest;
            this.J$0 = jCurrentTimeMillis;
            this.label = 2;
            Object objInvoke = featuredInstitutions.invoke(financialConnectionsSessionClientSecret, this);
            if (objInvoke != coroutine_suspended) {
                financialConnectionsSessionManifest = manifest;
                obj = objInvoke;
                j = jCurrentTimeMillis;
                objM9118constructorimpl = Result.m9118constructorimpl(TuplesKt.to((InstitutionResponse) obj, Boxing.boxLong(System.currentTimeMillis() - j)));
                InstitutionPickerViewModel institutionPickerViewModel22 = InstitutionPickerViewModel.this;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                }
                Pair pair22 = (Pair) objM9118constructorimpl;
                return new InstitutionPickerState.Payload((InstitutionResponse) pair22.component1(), financialConnectionsSessionManifest.getInstitutionSearchDisabled(), ((Number) pair22.component2()).longValue());
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstitutionPickerState _init_$lambda$0(InstitutionPickerState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return InstitutionPickerState.copy$default(execute, null, null, it, null, null, null, 59, null);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(InstitutionPickerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TopAppBarStateUpdate(PANE, state.getReferrer() != FinancialConnectionsSessionManifest.Pane.LINK_LOGIN, MavericksExtensionsKt.getError(state.getPayload()), state.getReferrer() == null, null, false, 16, null);
    }

    /* compiled from: InstitutionPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "payload", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$logErrors$2", f = "InstitutionPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$logErrors$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<InstitutionPickerState.Payload, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = InstitutionPickerViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InstitutionPickerState.Payload payload, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                InstitutionPickerState.Payload payload = (InstitutionPickerState.Payload) this.L$0;
                InstitutionPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(InstitutionPickerViewModel.PANE));
                FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker = InstitutionPickerViewModel.this.eventTracker;
                FinancialConnectionsSessionManifest.Pane pane = InstitutionPickerViewModel.PANE;
                long featuredInstitutionsDuration = payload.getFeaturedInstitutionsDuration();
                List<FinancialConnectionsInstitution> data = payload.getFeaturedInstitutions().getData();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
                Iterator<T> it = data.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FinancialConnectionsInstitution) it.next()).getId());
                }
                financialConnectionsAnalyticsTracker.track(new FinancialConnectionsAnalyticsEvent.FeaturedInstitutionsLoaded(CollectionsKt.toSet(arrayList), featuredInstitutionsDuration, pane));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void logErrors() {
        onAsync(new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel.logErrors.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((InstitutionPickerState) obj).getPayload();
            }
        }, new AnonymousClass2(null), new AnonymousClass3(null));
        InstitutionPickerViewModel institutionPickerViewModel = this;
        FinancialConnectionsViewModel.onAsync$default(institutionPickerViewModel, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel.logErrors.4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((InstitutionPickerState) obj).getSearchInstitutions();
            }
        }, null, new AnonymousClass5(null), 2, null);
        FinancialConnectionsViewModel.onAsync$default(institutionPickerViewModel, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel.logErrors.6
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((InstitutionPickerState) obj).getCreateSessionForInstitution();
            }
        }, null, new AnonymousClass7(null), 2, null);
    }

    /* compiled from: InstitutionPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$logErrors$3", f = "InstitutionPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$logErrors$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = InstitutionPickerViewModel.this.new AnonymousClass3(continuation);
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
            InstitutionPickerViewModel.this.handleError.invoke("Error fetching initial payload", (Throwable) this.L$0, InstitutionPickerViewModel.PANE, true);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: InstitutionPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$logErrors$5", f = "InstitutionPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$logErrors$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = InstitutionPickerViewModel.this.new AnonymousClass5(continuation);
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
            InstitutionPickerViewModel.this.handleError.invoke("Error searching institutions", (Throwable) this.L$0, InstitutionPickerViewModel.PANE, false);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: InstitutionPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$logErrors$7", f = "InstitutionPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$logErrors$7, reason: invalid class name */
    static final class AnonymousClass7 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass7 anonymousClass7 = InstitutionPickerViewModel.this.new AnonymousClass7(continuation);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InstitutionPickerViewModel.this.handleError.invoke("Error selecting or creating session for institution", (Throwable) this.L$0, InstitutionPickerViewModel.PANE, true);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: InstitutionPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onQueryChanged$1", f = "InstitutionPickerViewModel.kt", i = {1}, l = {169, 171}, m = "invokeSuspend", n = {"startTime$iv"}, s = {"J$0"})
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onQueryChanged$1, reason: invalid class name and case insensitive filesystem */
    static final class C09011 extends SuspendLambda implements Function1<Continuation<? super InstitutionResponse>, Object> {
        final /* synthetic */ String $query;
        long J$0;
        int label;
        final /* synthetic */ InstitutionPickerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09011(String str, InstitutionPickerViewModel institutionPickerViewModel, Continuation<? super C09011> continuation) {
            super(1, continuation);
            this.$query = str;
            this.this$0 = institutionPickerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C09011(this.$query, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super InstitutionResponse> continuation) {
            return ((C09011) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!StringsKt.isBlank(this.$query)) {
                    this.label = 1;
                    if (DelayKt.delay(InstitutionPickerViewModel.SEARCH_DEBOUNCE_MS, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                return new InstitutionResponse(Boxing.boxBoolean(false), CollectionsKt.emptyList());
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
                Pair pair = TuplesKt.to((InstitutionResponse) obj, Boxing.boxLong(System.currentTimeMillis() - j));
                InstitutionResponse institutionResponse = (InstitutionResponse) pair.component1();
                this.this$0.eventTracker.track(new FinancialConnectionsAnalyticsEvent.SearchSucceeded(InstitutionPickerViewModel.PANE, this.$query, ((Number) pair.component2()).longValue(), institutionResponse.getData().size()));
                FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.SEARCH_INITIATED, null, 2, null);
                return institutionResponse;
            }
            ResultKt.throwOnFailure(obj);
            InstitutionPickerViewModel institutionPickerViewModel = this.this$0;
            String str = this.$query;
            long jCurrentTimeMillis = System.currentTimeMillis();
            SearchInstitutions searchInstitutions = institutionPickerViewModel.searchInstitutions;
            String financialConnectionsSessionClientSecret = institutionPickerViewModel.configuration.getFinancialConnectionsSessionClientSecret();
            this.J$0 = jCurrentTimeMillis;
            this.label = 2;
            obj = searchInstitutions.invoke(financialConnectionsSessionClientSecret, str, this);
            if (obj != coroutine_suspended) {
                j = jCurrentTimeMillis;
                Pair pair2 = TuplesKt.to((InstitutionResponse) obj, Boxing.boxLong(System.currentTimeMillis() - j));
                InstitutionResponse institutionResponse2 = (InstitutionResponse) pair2.component1();
                this.this$0.eventTracker.track(new FinancialConnectionsAnalyticsEvent.SearchSucceeded(InstitutionPickerViewModel.PANE, this.$query, ((Number) pair2.component2()).longValue(), institutionResponse2.getData().size()));
                FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.SEARCH_INITIATED, null, 2, null);
                return institutionResponse2;
            }
            return coroutine_suspended;
        }
    }

    public final void onQueryChanged(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.searchJob.plusAssign(FinancialConnectionsViewModel.execute$default(this, new C09011(query, this, null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InstitutionPickerViewModel.onQueryChanged$lambda$1((InstitutionPickerState) obj, (Async) obj2);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstitutionPickerState onQueryChanged$lambda$1(InstitutionPickerState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        if (MavericksExtensionsKt.isCancellationError(it)) {
            it = new Async.Loading(null, 1, null);
        }
        return InstitutionPickerState.copy$default(execute, null, null, null, it, null, null, 55, null);
    }

    /* compiled from: InstitutionPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onInstitutionSelected$1", f = "InstitutionPickerViewModel.kt", i = {}, l = {JfifUtil.MARKER_SOS, 220, 220, JfifUtil.MARKER_APP1}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onInstitutionSelected$1, reason: invalid class name and case insensitive filesystem */
    static final class C09001 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $fromFeatured;
        final /* synthetic */ FinancialConnectionsInstitution $institution;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09001(boolean z, FinancialConnectionsInstitution financialConnectionsInstitution, Continuation<? super C09001> continuation) {
            super(1, continuation);
            this.$fromFeatured = z;
            this.$institution = financialConnectionsInstitution;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return InstitutionPickerViewModel.this.new C09001(this.$fromFeatured, this.$institution, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C09001) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
        
            if (r14 != r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
        
            if (r14 == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws StripeException {
            PostAuthorizationSession postAuthorizationSession;
            FinancialConnectionsInstitution financialConnectionsInstitution;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InstitutionPickerViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.InstitutionSelected(InstitutionPickerViewModel.PANE, this.$fromFeatured, this.$institution.getId()));
                FinancialConnections.INSTANCE.m7282emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.INSTITUTION_SELECTED, new FinancialConnectionsEvent.Metadata(this.$institution.getName(), null, null, 6, null));
                UpdateLocalManifest updateLocalManifest = InstitutionPickerViewModel.this.updateLocalManifest;
                final FinancialConnectionsInstitution financialConnectionsInstitution2 = this.$institution;
                updateLocalManifest.invoke(new Function1() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onInstitutionSelected$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return InstitutionPickerViewModel.C09001.invokeSuspend$lambda$0(financialConnectionsInstitution2, (FinancialConnectionsSessionManifest) obj2);
                    }
                });
                this.label = 1;
                obj = GetOrFetchSync.invoke$default(InstitutionPickerViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        InstitutionPickerViewModel.this.navigateToPartnerAuth((FinancialConnectionsAuthorizationSession) obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NavigationManager.DefaultImpls.tryNavigateTo$default(InstitutionPickerViewModel.this.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(((FinancialConnectionsInstitutionSelected) obj).getManifest().getNextPane()), InstitutionPickerViewModel.PANE, null, 2, null), new PopUpToBehavior.Current(true), false, 4, null);
                    return Unit.INSTANCE;
                }
                financialConnectionsInstitution = (FinancialConnectionsInstitution) this.L$1;
                postAuthorizationSession = (PostAuthorizationSession) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                obj = postAuthorizationSession.invoke(financialConnectionsInstitution, (SynchronizeSessionResponse) obj, this);
            }
            if (((SynchronizeSessionResponse) obj).getManifest().getConsentAcquired()) {
                postAuthorizationSession = InstitutionPickerViewModel.this.postAuthorizationSession;
                financialConnectionsInstitution = this.$institution;
                this.L$0 = postAuthorizationSession;
                this.L$1 = financialConnectionsInstitution;
                this.label = 2;
                obj = GetOrFetchSync.invoke$default(InstitutionPickerViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (obj != coroutine_suspended) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    obj = postAuthorizationSession.invoke(financialConnectionsInstitution, (SynchronizeSessionResponse) obj, this);
                }
            } else {
                this.label = 4;
                obj = InstitutionPickerViewModel.this.selectInstitution.invoke(this.$institution, this);
            }
            return coroutine_suspended;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FinancialConnectionsSessionManifest invokeSuspend$lambda$0(FinancialConnectionsInstitution financialConnectionsInstitution, FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
            return FinancialConnectionsSessionManifest.copy$default(financialConnectionsSessionManifest, false, false, null, false, false, null, false, false, false, false, false, false, null, null, null, null, false, false, null, null, null, null, null, null, financialConnectionsInstitution, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -25165825, 16383, null);
        }
    }

    public final void onInstitutionSelected(final FinancialConnectionsInstitution institution, boolean fromFeatured) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        FinancialConnectionsViewModel.execute$default(this, new C09001(fromFeatured, institution, null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InstitutionPickerViewModel.onInstitutionSelected$lambda$3(institution, (InstitutionPickerState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstitutionPickerState onInstitutionSelected$lambda$3(FinancialConnectionsInstitution financialConnectionsInstitution, InstitutionPickerState execute, Async async) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(async, "async");
        String id = financialConnectionsInstitution.getId();
        if (!(async instanceof Async.Loading)) {
            id = null;
        }
        return InstitutionPickerState.copy$default(execute, null, id, null, null, async, null, 45, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToPartnerAuth(FinancialConnectionsAuthorizationSession authSession) {
        String strInvoke$default;
        NavigationManager navigationManager = this.navigationManager;
        if (authSession.isOAuth()) {
            strInvoke$default = Destination.invoke$default(Destination.PartnerAuthDrawer.INSTANCE, PANE, null, 2, null);
        } else {
            strInvoke$default = Destination.invoke$default(Destination.PartnerAuth.INSTANCE, PANE, null, 2, null);
        }
        NavigationManager.DefaultImpls.tryNavigateTo$default(navigationManager, strInvoke$default, null, false, 6, null);
    }

    public final void onManualEntryClick() {
        NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.ManualEntry.INSTANCE, PANE, null, 2, null), null, false, 6, null);
    }

    /* compiled from: InstitutionPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onScrollChanged$1", f = "InstitutionPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onScrollChanged$1, reason: invalid class name and case insensitive filesystem */
    static final class C09021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C09021(Continuation<? super C09021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstitutionPickerViewModel.this.new C09021(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Set setEmptySet;
            List<FinancialConnectionsInstitution> data;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker = InstitutionPickerViewModel.this.eventTracker;
                FinancialConnectionsSessionManifest.Pane pane = InstitutionPickerViewModel.PANE;
                InstitutionResponse institutionResponseInvoke = InstitutionPickerViewModel.this.getStateFlow().getValue().getSearchInstitutions().invoke();
                if (institutionResponseInvoke == null || (data = institutionResponseInvoke.getData()) == null) {
                    setEmptySet = SetsKt.emptySet();
                } else {
                    List<FinancialConnectionsInstitution> list = data;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((FinancialConnectionsInstitution) it.next()).getId());
                    }
                    setEmptySet = CollectionsKt.toSet(arrayList);
                    if (setEmptySet == null) {
                    }
                }
                financialConnectionsAnalyticsTracker.track(new FinancialConnectionsAnalyticsEvent.SearchScroll(setEmptySet, pane));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onScrollChanged() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09021(null), 3, null);
    }

    /* compiled from: InstitutionPickerViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "arguments", "Landroid/os/Bundle;", "SEARCH_DEBOUNCE_MS", "", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InstitutionPickerViewModel factory$lambda$1$lambda$0(Bundle bundle, FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getInstitutionPickerViewModelFactory().create(new InstitutionPickerState(bundle));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent, final Bundle arguments) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(InstitutionPickerViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstitutionPickerViewModel.Companion.factory$lambda$1$lambda$0(arguments, parentComponent, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
