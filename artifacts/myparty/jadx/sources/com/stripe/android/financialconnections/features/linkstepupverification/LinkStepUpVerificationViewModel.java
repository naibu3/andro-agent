package com.stripe.android.financialconnections.features.linkstepupverification;

import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.facebook.soloader.Elf64;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.CachedPartnerAccount;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.MarkLinkStepUpVerified;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.SelectNetworkedAccounts;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationState;
import com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.ShareNetworkedAccountsResponse;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.OTPController;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import defpackage.getRedactedPhoneNumber;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: LinkStepUpVerificationViewModel.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,Bk\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u0006\u0010)\u001a\u00020$J\u000e\u0010\n\u001a\u00020\"H\u0082@¢\u0006\u0002\u0010*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "startVerification", "Lcom/stripe/android/financialconnections/domain/StartVerification;", "consumerSessionProvider", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;", "confirmVerification", "Lcom/stripe/android/financialconnections/domain/ConfirmVerification;", "selectNetworkedAccounts", "Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;", "getCachedAccounts", "Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;", "markLinkStepUpVerified", "Lcom/stripe/android/financialconnections/domain/MarkLinkStepUpVerified;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/StartVerification;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/ConfirmVerification;Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/domain/MarkLinkStepUpVerified;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "buildPayload", "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;", "consumerSession", "Lcom/stripe/android/model/ConsumerSession;", "logErrors", "", "onOTPEntered", "Lkotlinx/coroutines/Job;", "otp", "", "onResendCodeClick", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkStepUpVerificationViewModel extends FinancialConnectionsViewModel<LinkStepUpVerificationState> {
    private final ConfirmVerification confirmVerification;
    private final ConsumerSessionProvider consumerSessionProvider;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetCachedAccounts getCachedAccounts;
    private final GetOrFetchSync getOrFetchSync;
    private final Logger logger;
    private final MarkLinkStepUpVerified markLinkStepUpVerified;
    private final NavigationManager navigationManager;
    private final SelectNetworkedAccounts selectNetworkedAccounts;
    private final StartVerification startVerification;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.LINK_STEP_UP_VERIFICATION;

    /* compiled from: LinkStepUpVerificationViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        LinkStepUpVerificationViewModel create(LinkStepUpVerificationState initialState);
    }

    /* compiled from: LinkStepUpVerificationViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel", f = "LinkStepUpVerificationViewModel.kt", i = {0}, l = {174, 178}, m = "startVerification", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$startVerification$1, reason: invalid class name and case insensitive filesystem */
    static final class C09161 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C09161(Continuation<? super C09161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkStepUpVerificationViewModel.this.startVerification(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public LinkStepUpVerificationViewModel(@Assisted LinkStepUpVerificationState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker eventTracker, GetOrFetchSync getOrFetchSync, StartVerification startVerification, ConsumerSessionProvider consumerSessionProvider, ConfirmVerification confirmVerification, SelectNetworkedAccounts selectNetworkedAccounts, GetCachedAccounts getCachedAccounts, MarkLinkStepUpVerified markLinkStepUpVerified, NavigationManager navigationManager, Logger logger) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(startVerification, "startVerification");
        Intrinsics.checkNotNullParameter(consumerSessionProvider, "consumerSessionProvider");
        Intrinsics.checkNotNullParameter(confirmVerification, "confirmVerification");
        Intrinsics.checkNotNullParameter(selectNetworkedAccounts, "selectNetworkedAccounts");
        Intrinsics.checkNotNullParameter(getCachedAccounts, "getCachedAccounts");
        Intrinsics.checkNotNullParameter(markLinkStepUpVerified, "markLinkStepUpVerified");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.eventTracker = eventTracker;
        this.getOrFetchSync = getOrFetchSync;
        this.startVerification = startVerification;
        this.consumerSessionProvider = consumerSessionProvider;
        this.confirmVerification = confirmVerification;
        this.selectNetworkedAccounts = selectNetworkedAccounts;
        this.getCachedAccounts = getCachedAccounts;
        this.markLinkStepUpVerified = markLinkStepUpVerified;
        this.navigationManager = navigationManager;
        this.logger = logger;
        logErrors();
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LinkStepUpVerificationViewModel._init_$lambda$0((LinkStepUpVerificationState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* compiled from: LinkStepUpVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$1", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {Elf64.Ehdr.E_SHSTRNDX}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super LinkStepUpVerificationState.Payload>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return LinkStepUpVerificationViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super LinkStepUpVerificationState.Payload> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LinkStepUpVerificationViewModel linkStepUpVerificationViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LinkStepUpVerificationViewModel linkStepUpVerificationViewModel2 = LinkStepUpVerificationViewModel.this;
                this.L$0 = linkStepUpVerificationViewModel2;
                this.label = 1;
                Object objStartVerification = linkStepUpVerificationViewModel2.startVerification(this);
                if (objStartVerification == coroutine_suspended) {
                    return coroutine_suspended;
                }
                linkStepUpVerificationViewModel = linkStepUpVerificationViewModel2;
                obj = objStartVerification;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                linkStepUpVerificationViewModel = (LinkStepUpVerificationViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return linkStepUpVerificationViewModel.buildPayload((ConsumerSession) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkStepUpVerificationState _init_$lambda$0(LinkStepUpVerificationState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return LinkStepUpVerificationState.copy$default(execute, it, null, null, 6, null);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(LinkStepUpVerificationState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TopAppBarStateUpdate(PANE, false, MavericksExtensionsKt.getError(state.getPayload()), false, null, false, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkStepUpVerificationState.Payload buildPayload(ConsumerSession consumerSession) {
        return new LinkStepUpVerificationState.Payload(consumerSession.getEmailAddress(), getRedactedPhoneNumber.getRedactedPhoneNumber(consumerSession), new OTPElement(IdentifierSpec.INSTANCE.Generic("otp"), new OTPController(0, 1, null)), consumerSession.getClientSecret());
    }

    /* compiled from: LinkStepUpVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$2", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<LinkStepUpVerificationState.Payload, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = LinkStepUpVerificationViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LinkStepUpVerificationState.Payload payload, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: LinkStepUpVerificationViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$2$1", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LinkStepUpVerificationState.Payload $it;
            int label;
            final /* synthetic */ LinkStepUpVerificationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LinkStepUpVerificationState.Payload payload, LinkStepUpVerificationViewModel linkStepUpVerificationViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$it = payload;
                this.this$0 = linkStepUpVerificationViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$it, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: LinkStepUpVerificationViewModel.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$2$1$1", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01501 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ LinkStepUpVerificationViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01501(LinkStepUpVerificationViewModel linkStepUpVerificationViewModel, Continuation<? super C01501> continuation) {
                    super(2, continuation);
                    this.this$0 = linkStepUpVerificationViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C01501 c01501 = new C01501(this.this$0, continuation);
                    c01501.L$0 = obj;
                    return c01501;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C01501) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.onOTPEntered((String) this.L$0);
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (FlowKt.collectLatest(this.$it.getOtpElement().getOtpCompleteFlow(), new C01501(this.this$0, null), this) == coroutine_suspended) {
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
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(LinkStepUpVerificationViewModel.this), null, null, new AnonymousClass1((LinkStepUpVerificationState.Payload) this.L$0, LinkStepUpVerificationViewModel.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void logErrors() {
        onAsync(new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel.logErrors.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((LinkStepUpVerificationState) obj).getPayload();
            }
        }, new AnonymousClass2(null), new AnonymousClass3(null));
        LinkStepUpVerificationViewModel linkStepUpVerificationViewModel = this;
        FinancialConnectionsViewModel.onAsync$default(linkStepUpVerificationViewModel, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel.logErrors.4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((LinkStepUpVerificationState) obj).getResendOtp();
            }
        }, null, new AnonymousClass5(null), 2, null);
        FinancialConnectionsViewModel.onAsync$default(linkStepUpVerificationViewModel, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel.logErrors.6
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((LinkStepUpVerificationState) obj).getConfirmVerification();
            }
        }, null, new AnonymousClass7(null), 2, null);
    }

    /* compiled from: LinkStepUpVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$3", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = LinkStepUpVerificationViewModel.this.new AnonymousClass3(continuation);
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
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                LinkStepUpVerificationViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.VerificationStepUpError(LinkStepUpVerificationViewModel.INSTANCE.getPANE$financial_connections_release(), FinancialConnectionsAnalyticsEvent.VerificationStepUpError.Error.StartVerificationError));
                FinancialConnectionsAnalyticsTrackerKt.logError(LinkStepUpVerificationViewModel.this.eventTracker, "Error fetching payload", th, LinkStepUpVerificationViewModel.this.logger, LinkStepUpVerificationViewModel.INSTANCE.getPANE$financial_connections_release());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LinkStepUpVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$5", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = LinkStepUpVerificationViewModel.this.new AnonymousClass5(continuation);
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
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                LinkStepUpVerificationViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.VerificationStepUpError(LinkStepUpVerificationViewModel.INSTANCE.getPANE$financial_connections_release(), FinancialConnectionsAnalyticsEvent.VerificationStepUpError.Error.StartVerificationError));
                FinancialConnectionsAnalyticsTrackerKt.logError(LinkStepUpVerificationViewModel.this.eventTracker, "Error resending OTP", th, LinkStepUpVerificationViewModel.this.logger, LinkStepUpVerificationViewModel.INSTANCE.getPANE$financial_connections_release());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LinkStepUpVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$7", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$logErrors$7, reason: invalid class name */
    static final class AnonymousClass7 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass7 anonymousClass7 = LinkStepUpVerificationViewModel.this.new AnonymousClass7(continuation);
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
            FinancialConnectionsAnalyticsTrackerKt.logError(LinkStepUpVerificationViewModel.this.eventTracker, "Error confirming verification", (Throwable) this.L$0, LinkStepUpVerificationViewModel.this.logger, LinkStepUpVerificationViewModel.INSTANCE.getPANE$financial_connections_release());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LinkStepUpVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$onOTPEntered$1", f = "LinkStepUpVerificationViewModel.kt", i = {0, 1, 2, 2}, l = {132, 138, 141, 154}, m = "invokeSuspend", n = {"payload", "payload", "payload", "selectedAccounts"}, s = {"L$0", "L$0", "L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$onOTPEntered$1, reason: invalid class name and case insensitive filesystem */
    static final class C09141 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $otp;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09141(String str, Continuation<? super C09141> continuation) {
            super(1, continuation);
            this.$otp = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return LinkStepUpVerificationViewModel.this.new C09141(this.$otp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C09141) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x0147, code lost:
        
            if (r14 == r1) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0124 A[LOOP:0: B:44:0x011e->B:46:0x0124, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LinkStepUpVerificationState.Payload payload;
            LinkStepUpVerificationState.Payload payload2;
            List list;
            List list2;
            Object objInvoke;
            Object objM9118constructorimpl;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LinkStepUpVerificationState.Payload payloadInvoke = LinkStepUpVerificationViewModel.this.getStateFlow().getValue().getPayload().invoke();
                if (payloadInvoke == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                payload = payloadInvoke;
                this.L$0 = payload;
                this.label = 1;
                if (LinkStepUpVerificationViewModel.this.confirmVerification.email(payload.getConsumerSessionClientSecret(), this.$otp, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                payload = (LinkStepUpVerificationState.Payload) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    payload = (LinkStepUpVerificationState.Payload) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    payload2 = payload;
                    list = (List) obj;
                    LinkStepUpVerificationViewModel linkStepUpVerificationViewModel = LinkStepUpVerificationViewModel.this;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        MarkLinkStepUpVerified markLinkStepUpVerified = linkStepUpVerificationViewModel.markLinkStepUpVerified;
                        this.L$0 = payload2;
                        this.L$1 = list;
                        this.label = 3;
                        objInvoke = markLinkStepUpVerified.invoke(this);
                    } catch (Throwable th) {
                        th = th;
                        list2 = list;
                        Throwable th2 = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th2));
                        LinkStepUpVerificationViewModel linkStepUpVerificationViewModel2 = LinkStepUpVerificationViewModel.this;
                        if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                        }
                        LinkStepUpVerificationViewModel linkStepUpVerificationViewModel3 = LinkStepUpVerificationViewModel.this;
                        if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                        }
                        ResultKt.throwOnFailure(objM9118constructorimpl);
                        SelectNetworkedAccounts selectNetworkedAccounts = LinkStepUpVerificationViewModel.this.selectNetworkedAccounts;
                        String consumerSessionClientSecret = payload2.getConsumerSessionClientSecret();
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                        obj = selectNetworkedAccounts.invoke(consumerSessionClientSecret, CollectionsKt.toSet(arrayList), null, this);
                    }
                    if (objInvoke != coroutine_suspended) {
                        list2 = list;
                        obj = objInvoke;
                        objM9118constructorimpl = Result.m9118constructorimpl((FinancialConnectionsSessionManifest) obj);
                        LinkStepUpVerificationViewModel linkStepUpVerificationViewModel22 = LinkStepUpVerificationViewModel.this;
                        if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                        }
                        LinkStepUpVerificationViewModel linkStepUpVerificationViewModel32 = LinkStepUpVerificationViewModel.this;
                        if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                        }
                        ResultKt.throwOnFailure(objM9118constructorimpl);
                        SelectNetworkedAccounts selectNetworkedAccounts2 = LinkStepUpVerificationViewModel.this.selectNetworkedAccounts;
                        String consumerSessionClientSecret2 = payload2.getConsumerSessionClientSecret();
                        List list32 = list2;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
                        it = list32.iterator();
                        while (it.hasNext()) {
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                        obj = selectNetworkedAccounts2.invoke(consumerSessionClientSecret2, CollectionsKt.toSet(arrayList2), null, this);
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NavigationManager navigationManager = LinkStepUpVerificationViewModel.this.navigationManager;
                    FinancialConnectionsSessionManifest.Pane nextPane = ((ShareNetworkedAccountsResponse) obj).getNextPane();
                    if (nextPane == null) {
                        nextPane = FinancialConnectionsSessionManifest.Pane.SUCCESS;
                    }
                    NavigationManager.DefaultImpls.tryNavigateTo$default(navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(nextPane), LinkStepUpVerificationViewModel.INSTANCE.getPANE$financial_connections_release(), null, 2, null), null, false, 6, null);
                    return Unit.INSTANCE;
                }
                list2 = (List) this.L$1;
                payload2 = (LinkStepUpVerificationState.Payload) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    objM9118constructorimpl = Result.m9118constructorimpl((FinancialConnectionsSessionManifest) obj);
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th22 = th;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th22));
                    LinkStepUpVerificationViewModel linkStepUpVerificationViewModel222 = LinkStepUpVerificationViewModel.this;
                    if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                    }
                    LinkStepUpVerificationViewModel linkStepUpVerificationViewModel322 = LinkStepUpVerificationViewModel.this;
                    if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                    }
                    ResultKt.throwOnFailure(objM9118constructorimpl);
                    SelectNetworkedAccounts selectNetworkedAccounts22 = LinkStepUpVerificationViewModel.this.selectNetworkedAccounts;
                    String consumerSessionClientSecret22 = payload2.getConsumerSessionClientSecret();
                    List list322 = list2;
                    ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list322, 10));
                    it = list322.iterator();
                    while (it.hasNext()) {
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    obj = selectNetworkedAccounts22.invoke(consumerSessionClientSecret22, CollectionsKt.toSet(arrayList22), null, this);
                }
                LinkStepUpVerificationViewModel linkStepUpVerificationViewModel2222 = LinkStepUpVerificationViewModel.this;
                if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                    linkStepUpVerificationViewModel2222.eventTracker.track(new FinancialConnectionsAnalyticsEvent.VerificationStepUpError(LinkStepUpVerificationViewModel.INSTANCE.getPANE$financial_connections_release(), FinancialConnectionsAnalyticsEvent.VerificationStepUpError.Error.MarkLinkVerifiedError));
                }
                LinkStepUpVerificationViewModel linkStepUpVerificationViewModel3222 = LinkStepUpVerificationViewModel.this;
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                    linkStepUpVerificationViewModel3222.eventTracker.track(new FinancialConnectionsAnalyticsEvent.VerificationStepUpSuccess(LinkStepUpVerificationViewModel.INSTANCE.getPANE$financial_connections_release()));
                }
                ResultKt.throwOnFailure(objM9118constructorimpl);
                SelectNetworkedAccounts selectNetworkedAccounts222 = LinkStepUpVerificationViewModel.this.selectNetworkedAccounts;
                String consumerSessionClientSecret222 = payload2.getConsumerSessionClientSecret();
                List list3222 = list2;
                ArrayList arrayList222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3222, 10));
                it = list3222.iterator();
                while (it.hasNext()) {
                    arrayList222.add(((CachedPartnerAccount) it.next()).getId());
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                obj = selectNetworkedAccounts222.invoke(consumerSessionClientSecret222, CollectionsKt.toSet(arrayList222), null, this);
            }
            this.L$0 = payload;
            this.label = 2;
            obj = LinkStepUpVerificationViewModel.this.getCachedAccounts.invoke(this);
            if (obj != coroutine_suspended) {
                payload2 = payload;
                list = (List) obj;
                LinkStepUpVerificationViewModel linkStepUpVerificationViewModel4 = LinkStepUpVerificationViewModel.this;
                Result.Companion companion3 = Result.INSTANCE;
                MarkLinkStepUpVerified markLinkStepUpVerified2 = linkStepUpVerificationViewModel4.markLinkStepUpVerified;
                this.L$0 = payload2;
                this.L$1 = list;
                this.label = 3;
                objInvoke = markLinkStepUpVerified2.invoke(this);
                if (objInvoke != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job onOTPEntered(String otp) {
        return FinancialConnectionsViewModel.execute$default(this, new C09141(otp, null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LinkStepUpVerificationViewModel.onOTPEntered$lambda$1((LinkStepUpVerificationState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkStepUpVerificationState onOTPEntered$lambda$1(LinkStepUpVerificationState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return LinkStepUpVerificationState.copy$default(execute, null, it, null, 5, null);
    }

    /* compiled from: LinkStepUpVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$onResendCodeClick$1", f = "LinkStepUpVerificationViewModel.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$onResendCodeClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09151 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C09151(Continuation<? super C09151> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return LinkStepUpVerificationViewModel.this.new C09151(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C09151) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (LinkStepUpVerificationViewModel.this.startVerification(this) == coroutine_suspended) {
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
    }

    public final void onResendCodeClick() {
        FinancialConnectionsViewModel.execute$default(this, new C09151(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LinkStepUpVerificationViewModel.onResendCodeClick$lambda$2((LinkStepUpVerificationState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkStepUpVerificationState onResendCodeClick$lambda$2(LinkStepUpVerificationState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return LinkStepUpVerificationState.copy$default(execute, null, null, it, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startVerification(Continuation<? super ConsumerSession> continuation) {
        C09161 c09161;
        LinkStepUpVerificationViewModel linkStepUpVerificationViewModel;
        if (continuation instanceof C09161) {
            c09161 = (C09161) continuation;
            if ((c09161.label & Integer.MIN_VALUE) != 0) {
                c09161.label -= Integer.MIN_VALUE;
            } else {
                c09161 = new C09161(continuation);
            }
        }
        C09161 c091612 = c09161;
        Object objInvoke$default = c091612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c091612.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke$default);
            GetOrFetchSync getOrFetchSync = this.getOrFetchSync;
            c091612.L$0 = this;
            c091612.label = 1;
            objInvoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, false, c091612, 3, null);
            if (objInvoke$default != coroutine_suspended) {
                linkStepUpVerificationViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke$default);
            return (ConsumerSession) objInvoke$default;
        }
        linkStepUpVerificationViewModel = (LinkStepUpVerificationViewModel) c091612.L$0;
        ResultKt.throwOnFailure(objInvoke$default);
        FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) objInvoke$default).getManifest();
        CachedConsumerSession cachedConsumerSessionProvideConsumerSession = linkStepUpVerificationViewModel.consumerSessionProvider.provideConsumerSession();
        if (cachedConsumerSessionProvideConsumerSession == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String clientSecret = cachedConsumerSessionProvideConsumerSession.getClientSecret();
        StartVerification startVerification = linkStepUpVerificationViewModel.startVerification;
        String businessName = manifest.getBusinessName();
        c091612.L$0 = null;
        c091612.label = 2;
        objInvoke$default = startVerification.email(clientSecret, businessName, c091612);
    }

    /* compiled from: LinkStepUpVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPANE$financial_connections_release", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LinkStepUpVerificationViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getLinkStepUpVerificationViewModelFactory().create(new LinkStepUpVerificationState(null, null, null, 7, null));
        }

        public final FinancialConnectionsSessionManifest.Pane getPANE$financial_connections_release() {
            return LinkStepUpVerificationViewModel.PANE;
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(LinkStepUpVerificationViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LinkStepUpVerificationViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
