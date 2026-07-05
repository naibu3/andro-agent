package com.stripe.android.financialconnections.features.consent;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.financialconnections.utils.Experiment;
import com.stripe.android.financialconnections.utils.ExperimentsKt;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.EmailSource;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ConsentViewModel.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000223Bm\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020 J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0082@¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\u00020(2\u0006\u0010$\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0082@¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020*J\b\u0010/\u001a\u00020 H\u0002J\b\u00100\u001a\u00020 H\u0002J\u0006\u00101\u001a\u00020 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "acceptConsent", "Lcom/stripe/android/financialconnections/domain/AcceptConsent;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "handleClickableUrl", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;", "logger", "Lcom/stripe/android/core/Logger;", "presentSheet", "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;", "lookupAccount", "Lcom/stripe/android/financialconnections/domain/LookupAccount;", "isLinkWithStripe", "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;", "prefillDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;", "<init>", "(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;Lcom/stripe/android/financialconnections/domain/LookupAccount;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)V", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "logErrors", "", "onContinueClick", "determineNavigationDestination", "Lcom/stripe/android/financialconnections/navigation/Destination;", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasExistingLinkAccount", "", "email", "", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClickableTextClick", "Lkotlinx/coroutines/Job;", ShareConstants.MEDIA_URI, "presentDataAccessBottomSheet", "presentLegalDetailsBottomSheet", "onViewEffectLaunched", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConsentViewModel extends FinancialConnectionsViewModel<ConsentState> {
    private final AcceptConsent acceptConsent;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetOrFetchSync getOrFetchSync;
    private final HandleClickableUrl handleClickableUrl;
    private final IsLinkWithStripe isLinkWithStripe;
    private final Logger logger;
    private final LookupAccount lookupAccount;
    private final NavigationManager navigationManager;
    private final ElementsSessionContext.PrefillDetails prefillDetails;
    private final PresentSheet presentSheet;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ConsentViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        ConsentViewModel create(ConsentState initialState);
    }

    /* compiled from: ConsentViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel", f = "ConsentViewModel.kt", i = {0}, l = {133}, m = "determineNavigationDestination", n = {"defaultDestination"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$determineNavigationDestination$1, reason: invalid class name and case insensitive filesystem */
    static final class C08851 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C08851(Continuation<? super C08851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConsentViewModel.this.determineNavigationDestination(null, this);
        }
    }

    /* compiled from: ConsentViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel", f = "ConsentViewModel.kt", i = {}, l = {146}, m = "hasExistingLinkAccount", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$hasExistingLinkAccount$1, reason: invalid class name and case insensitive filesystem */
    static final class C08861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C08861(Continuation<? super C08861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConsentViewModel.this.hasExistingLinkAccount(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public ConsentViewModel(@Assisted ConsentState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, AcceptConsent acceptConsent, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, FinancialConnectionsAnalyticsTracker eventTracker, HandleClickableUrl handleClickableUrl, Logger logger, PresentSheet presentSheet, LookupAccount lookupAccount, IsLinkWithStripe isLinkWithStripe, ElementsSessionContext.PrefillDetails prefillDetails) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(acceptConsent, "acceptConsent");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(handleClickableUrl, "handleClickableUrl");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(presentSheet, "presentSheet");
        Intrinsics.checkNotNullParameter(lookupAccount, "lookupAccount");
        Intrinsics.checkNotNullParameter(isLinkWithStripe, "isLinkWithStripe");
        this.acceptConsent = acceptConsent;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManager;
        this.eventTracker = eventTracker;
        this.handleClickableUrl = handleClickableUrl;
        this.logger = logger;
        this.presentSheet = presentSheet;
        this.lookupAccount = lookupAccount;
        this.isLinkWithStripe = isLinkWithStripe;
        this.prefillDetails = prefillDetails;
        logErrors();
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.consent.ConsentViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ConsentViewModel._init_$lambda$0((ConsentState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* compiled from: ConsentViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$1", f = "ConsentViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ConsentState.Payload>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ConsentViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ConsentState.Payload> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = GetOrFetchSync.invoke$default(ConsentViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
            FinancialConnectionsSessionManifest manifest = synchronizeSessionResponse.getManifest();
            boolean zAreEqual = Intrinsics.areEqual(ExperimentsKt.experimentAssignment(manifest, Experiment.CONNECTIONS_CONSENT_COMBINED_LOGO), "treatment");
            ExperimentsKt.trackExposure(ConsentViewModel.this.eventTracker, Experiment.CONNECTIONS_CONSENT_COMBINED_LOGO, manifest);
            TextUpdate text = synchronizeSessionResponse.getText();
            Intrinsics.checkNotNull(text);
            ConsentPane consent = text.getConsent();
            Intrinsics.checkNotNull(consent);
            return new ConsentState.Payload(consent, synchronizeSessionResponse.getVisual().getMerchantLogos(), zAreEqual, ConsentViewModelKt.getShowAnimatedDots(synchronizeSessionResponse.getManifest()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConsentState _init_$lambda$0(ConsentState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return ConsentState.copy$default(execute, it, null, null, null, 14, null);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(ConsentState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.CONSENT;
        ConsentState.Payload payloadInvoke = state.getConsent().invoke();
        return new TopAppBarStateUpdate(pane, true, MavericksExtensionsKt.getError(state.getConsent()), true, Boolean.valueOf(payloadInvoke != null ? payloadInvoke.getShouldShowMerchantLogos() : true), false, 32, null);
    }

    /* compiled from: ConsentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$logErrors$2", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$logErrors$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ConsentState.Payload, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConsentViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConsentState.Payload payload, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConsentViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(FinancialConnectionsSessionManifest.Pane.CONSENT));
            return Unit.INSTANCE;
        }
    }

    private final void logErrors() {
        onAsync(new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.consent.ConsentViewModel.logErrors.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ConsentState) obj).getConsent();
            }
        }, new AnonymousClass2(null), new AnonymousClass3(null));
        FinancialConnectionsViewModel.onAsync$default(this, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.consent.ConsentViewModel.logErrors.4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ConsentState) obj).getAcceptConsent();
            }
        }, null, new AnonymousClass5(null), 2, null);
    }

    /* compiled from: ConsentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$logErrors$3", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$logErrors$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = ConsentViewModel.this.new AnonymousClass3(continuation);
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
            ConsentViewModel.this.logger.error("Error retrieving consent content", (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ConsentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$logErrors$5", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$logErrors$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = ConsentViewModel.this.new AnonymousClass5(continuation);
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
            FinancialConnectionsAnalyticsTrackerKt.logError(ConsentViewModel.this.eventTracker, "Error accepting consent", (Throwable) this.L$0, ConsentViewModel.this.logger, FinancialConnectionsSessionManifest.Pane.CONSENT);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ConsentViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onContinueClick$1", f = "ConsentViewModel.kt", i = {1}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS}, m = "invokeSuspend", n = {"updatedManifest"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$onContinueClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C08891 extends SuspendLambda implements Function1<Continuation<? super FinancialConnectionsSessionManifest>, Object> {
        Object L$0;
        int label;

        C08891(Continuation<? super C08891> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ConsentViewModel.this.new C08891(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super FinancialConnectionsSessionManifest> continuation) {
            return ((C08891) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ConsentViewModel.this.eventTracker.track(FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE);
                this.label = 1;
                obj = ConsentViewModel.this.acceptConsent.invoke(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$0;
                ResultKt.throwOnFailure(obj);
                NavigationManager.DefaultImpls.tryNavigateTo$default(ConsentViewModel.this.navigationManager, Destination.invoke$default((Destination) obj, FinancialConnectionsSessionManifest.Pane.CONSENT, null, 2, null), null, false, 6, null);
                return financialConnectionsSessionManifest;
            }
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) obj;
            FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.CONSENT_ACQUIRED, null, 2, null);
            this.L$0 = financialConnectionsSessionManifest2;
            this.label = 2;
            Object objDetermineNavigationDestination = ConsentViewModel.this.determineNavigationDestination(financialConnectionsSessionManifest2, this);
            if (objDetermineNavigationDestination != coroutine_suspended) {
                financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
                obj = objDetermineNavigationDestination;
                NavigationManager.DefaultImpls.tryNavigateTo$default(ConsentViewModel.this.navigationManager, Destination.invoke$default((Destination) obj, FinancialConnectionsSessionManifest.Pane.CONSENT, null, 2, null), null, false, 6, null);
                return financialConnectionsSessionManifest;
            }
            return coroutine_suspended;
        }
    }

    public final void onContinueClick() {
        FinancialConnectionsViewModel.execute$default(this, new C08891(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.consent.ConsentViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ConsentViewModel.onContinueClick$lambda$1((ConsentState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConsentState onContinueClick$lambda$1(ConsentState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return ConsentState.copy$default(execute, null, null, it, null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object determineNavigationDestination(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, Continuation<? super Destination> continuation) {
        C08851 c08851;
        Destination destination;
        if (continuation instanceof C08851) {
            c08851 = (C08851) continuation;
            if ((c08851.label & Integer.MIN_VALUE) != 0) {
                c08851.label -= Integer.MIN_VALUE;
            } else {
                c08851 = new C08851(continuation);
            }
        }
        Object obj = c08851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08851.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Destination destination2 = DestinationMappersKt.getDestination(financialConnectionsSessionManifest.getNextPane());
            ElementsSessionContext.PrefillDetails prefillDetails = this.prefillDetails;
            String email = prefillDetails != null ? prefillDetails.getEmail() : null;
            if (!this.isLinkWithStripe.invoke() || financialConnectionsSessionManifest.getAccountholderCustomerEmailAddress() != null || email == null) {
                return destination2;
            }
            c08851.L$0 = destination2;
            c08851.label = 1;
            Object objHasExistingLinkAccount = hasExistingLinkAccount(financialConnectionsSessionManifest, email, c08851);
            if (objHasExistingLinkAccount == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objHasExistingLinkAccount;
            destination = destination2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            destination = (Destination) c08851.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return ((Boolean) obj).booleanValue() ? Destination.NetworkingLinkLoginWarmup.INSTANCE : destination;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasExistingLinkAccount(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, String str, Continuation<? super Boolean> continuation) {
        C08861 c08861;
        Object objM9118constructorimpl;
        if (continuation instanceof C08861) {
            c08861 = (C08861) continuation;
            if ((c08861.label & Integer.MIN_VALUE) != 0) {
                c08861.label -= Integer.MIN_VALUE;
            } else {
                c08861 = new C08861(continuation);
            }
        }
        C08861 c088612 = c08861;
        Object objInvoke = c088612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c088612.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objInvoke);
                Result.Companion companion = Result.INSTANCE;
                ConsentViewModel consentViewModel = this;
                LookupAccount lookupAccount = this.lookupAccount;
                FinancialConnectionsSessionManifest.Pane pANE$financial_connections_release = NetworkingLinkLoginWarmupViewModel.INSTANCE.getPANE$financial_connections_release();
                EmailSource emailSource = EmailSource.CUSTOMER_OBJECT;
                String id = financialConnectionsSessionManifest.getId();
                boolean appVerificationEnabled = financialConnectionsSessionManifest.getAppVerificationEnabled();
                c088612.label = 1;
                objInvoke = lookupAccount.invoke(str, null, null, emailSource, appVerificationEnabled, id, pANE$financial_connections_release, c088612);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
            objM9118constructorimpl = Result.m9118constructorimpl(Boxing.boxBoolean(((ConsumerSessionLookup) objInvoke).getExists()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m9124isFailureimpl(objM9118constructorimpl) ? Boxing.boxBoolean(false) : objM9118constructorimpl;
    }

    /* compiled from: ConsentViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1", f = "ConsentViewModel.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C08881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08881(String str, Continuation<? super C08881> continuation) {
            super(2, continuation);
            this.$uri = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConsentViewModel.this.new C08881(this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Date date = new Date();
                HandleClickableUrl handleClickableUrl = ConsentViewModel.this.handleClickableUrl;
                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.CONSENT;
                final String str = this.$uri;
                final ConsentViewModel consentViewModel = ConsentViewModel.this;
                Function1<? super String, Unit> function1 = new Function1() { // from class: com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ConsentViewModel.C08881.invokeSuspend$lambda$1(consentViewModel, str, date, (String) obj2);
                    }
                };
                Pair[] pairArr = {TuplesKt.to(ConsentClickableText.DATA.getValue(), new AnonymousClass2(ConsentViewModel.this, null)), TuplesKt.to(ConsentClickableText.LEGAL_DETAILS.getValue(), new AnonymousClass3(ConsentViewModel.this, null)), TuplesKt.to(ConsentClickableText.MANUAL_ENTRY.getValue(), new AnonymousClass4(ConsentViewModel.this, null)), TuplesKt.to(ConsentClickableText.LINK_LOGIN_WARMUP.getValue(), new AnonymousClass5(ConsentViewModel.this, null)), TuplesKt.to(ConsentClickableText.LINK_ACCOUNT_PICKER.getValue(), new AnonymousClass6(ConsentViewModel.this, null))};
                this.label = 1;
                if (handleClickableUrl.invoke(pane, str, function1, MapsKt.mapOf(pairArr), this) == coroutine_suspended) {
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
        public static final Unit invokeSuspend$lambda$1(ConsentViewModel consentViewModel, final String str, final Date date, String str2) {
            consentViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ConsentViewModel.C08881.invokeSuspend$lambda$1$lambda$0(str, date, (ConsentState) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ConsentState invokeSuspend$lambda$1$lambda$0(String str, Date date, ConsentState consentState) {
            return ConsentState.copy$default(consentState, null, null, null, new ConsentState.ViewEffect.OpenUrl(str, date.getTime()), 7, null);
        }

        /* compiled from: ConsentViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$2", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<HandleClickableUrl.DeeplinkPayload, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConsentViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ConsentViewModel consentViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = consentViewModel;
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

        /* compiled from: ConsentViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$3", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<HandleClickableUrl.DeeplinkPayload, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConsentViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ConsentViewModel consentViewModel, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = consentViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HandleClickableUrl.DeeplinkPayload deeplinkPayload, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(deeplinkPayload, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.presentLegalDetailsBottomSheet();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: ConsentViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$4", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<HandleClickableUrl.DeeplinkPayload, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConsentViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ConsentViewModel consentViewModel, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = consentViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HandleClickableUrl.DeeplinkPayload deeplinkPayload, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(deeplinkPayload, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    NavigationManager.DefaultImpls.tryNavigateTo$default(this.this$0.navigationManager, Destination.invoke$default(Destination.ManualEntry.INSTANCE, FinancialConnectionsSessionManifest.Pane.CONSENT, null, 2, null), null, false, 6, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: ConsentViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$5", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<HandleClickableUrl.DeeplinkPayload, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ConsentViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(ConsentViewModel consentViewModel, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = consentViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HandleClickableUrl.DeeplinkPayload deeplinkPayload, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(deeplinkPayload, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                NavigationManager.DefaultImpls.tryNavigateTo$default(this.this$0.navigationManager, Destination.NetworkingLinkLoginWarmup.INSTANCE.invoke(FinancialConnectionsSessionManifest.Pane.CONSENT, MapsKt.mapOf(TuplesKt.to(Destination.KEY_NEXT_PANE_ON_DISABLE_NETWORKING, ((HandleClickableUrl.DeeplinkPayload) this.L$0).getNextPaneOrDrawerOnSecondaryCta()))), null, false, 6, null);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: ConsentViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$6", f = "ConsentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$onClickableTextClick$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends SuspendLambda implements Function2<HandleClickableUrl.DeeplinkPayload, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConsentViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(ConsentViewModel consentViewModel, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = consentViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HandleClickableUrl.DeeplinkPayload deeplinkPayload, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(deeplinkPayload, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                NavigationManager.DefaultImpls.tryNavigateTo$default(this.this$0.navigationManager, Destination.invoke$default(Destination.LinkAccountPicker.INSTANCE, FinancialConnectionsSessionManifest.Pane.CONSENT, null, 2, null), null, false, 6, null);
                return Unit.INSTANCE;
            }
        }
    }

    public final Job onClickableTextClick(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08881(uri, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentDataAccessBottomSheet() {
        ConsentPane consent;
        DataAccessNotice dataAccessNotice;
        ConsentState.Payload payloadInvoke = getStateFlow().getValue().getConsent().invoke();
        if (payloadInvoke == null || (consent = payloadInvoke.getConsent()) == null || (dataAccessNotice = consent.getDataAccessNotice()) == null) {
            return;
        }
        this.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.DataAccess(dataAccessNotice), FinancialConnectionsSessionManifest.Pane.CONSENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentLegalDetailsBottomSheet() {
        ConsentPane consent;
        LegalDetailsNotice legalDetailsNotice;
        ConsentState.Payload payloadInvoke = getStateFlow().getValue().getConsent().invoke();
        if (payloadInvoke == null || (consent = payloadInvoke.getConsent()) == null || (legalDetailsNotice = consent.getLegalDetailsNotice()) == null) {
            return;
        }
        this.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.Legal(legalDetailsNotice), FinancialConnectionsSessionManifest.Pane.CONSENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConsentState onViewEffectLaunched$lambda$3(ConsentState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return ConsentState.copy$default(setState, null, null, null, null, 7, null);
    }

    public final void onViewEffectLaunched() {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.features.consent.ConsentViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConsentViewModel.onViewEffectLaunched$lambda$3((ConsentState) obj);
            }
        });
    }

    /* compiled from: ConsentViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ConsentViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getConsentViewModelFactory().create(new ConsentState(null, null, null, null, 15, null));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(ConsentViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.consent.ConsentViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ConsentViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
