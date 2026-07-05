package com.stripe.android.financialconnections.features.networkinglinkverification;

import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.AttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.domain.MarkLinkVerified;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
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
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: NetworkingLinkVerificationViewModel.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-.Bs\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0010\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\b\u0010(\u001a\u00020\u001eH\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "confirmVerification", "Lcom/stripe/android/financialconnections/domain/ConfirmVerification;", "markLinkVerified", "Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "analyticsTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "startVerification", "Lcom/stripe/android/financialconnections/domain/StartVerification;", "logger", "Lcom/stripe/android/core/Logger;", "isLinkWithStripe", "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;", "attachConsumerToLinkAccountSession", "Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;", "consumerSessionProvider", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;", "handleError", "Lcom/stripe/android/financialconnections/domain/HandleError;", "<init>", "(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/ConfirmVerification;Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/StartVerification;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/HandleError;)V", "", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "buildPayload", "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;", "consumerSession", "Lcom/stripe/android/model/ConsumerSession;", "initialInstitution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "observeAsyncs", "onOTPEntered", "Lkotlinx/coroutines/Job;", "otp", "", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkingLinkVerificationViewModel extends FinancialConnectionsViewModel<NetworkingLinkVerificationState> {
    private final FinancialConnectionsAnalyticsTracker analyticsTracker;
    private final AttachConsumerToLinkAccountSession attachConsumerToLinkAccountSession;
    private final ConfirmVerification confirmVerification;
    private final ConsumerSessionProvider consumerSessionProvider;
    private final GetOrFetchSync getOrFetchSync;
    private final HandleError handleError;
    private final IsLinkWithStripe isLinkWithStripe;
    private final Logger logger;
    private final MarkLinkVerified markLinkVerified;
    private final NavigationManager navigationManager;
    private final StartVerification startVerification;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_VERIFICATION;

    /* compiled from: NetworkingLinkVerificationViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        NetworkingLinkVerificationViewModel create(NetworkingLinkVerificationState initialState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public NetworkingLinkVerificationViewModel(@Assisted NetworkingLinkVerificationState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, GetOrFetchSync getOrFetchSync, ConfirmVerification confirmVerification, MarkLinkVerified markLinkVerified, NavigationManager navigationManager, FinancialConnectionsAnalyticsTracker analyticsTracker, StartVerification startVerification, Logger logger, IsLinkWithStripe isLinkWithStripe, AttachConsumerToLinkAccountSession attachConsumerToLinkAccountSession, ConsumerSessionProvider consumerSessionProvider, HandleError handleError) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(confirmVerification, "confirmVerification");
        Intrinsics.checkNotNullParameter(markLinkVerified, "markLinkVerified");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        Intrinsics.checkNotNullParameter(startVerification, "startVerification");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(isLinkWithStripe, "isLinkWithStripe");
        Intrinsics.checkNotNullParameter(attachConsumerToLinkAccountSession, "attachConsumerToLinkAccountSession");
        Intrinsics.checkNotNullParameter(consumerSessionProvider, "consumerSessionProvider");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        this.getOrFetchSync = getOrFetchSync;
        this.confirmVerification = confirmVerification;
        this.markLinkVerified = markLinkVerified;
        this.navigationManager = navigationManager;
        this.analyticsTracker = analyticsTracker;
        this.startVerification = startVerification;
        this.logger = logger;
        this.isLinkWithStripe = isLinkWithStripe;
        this.attachConsumerToLinkAccountSession = attachConsumerToLinkAccountSession;
        this.consumerSessionProvider = consumerSessionProvider;
        this.handleError = handleError;
        observeAsyncs();
        startVerification();
    }

    /* compiled from: NetworkingLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$startVerification$1", f = "NetworkingLinkVerificationViewModel.kt", i = {1}, l = {69, 71}, m = "invokeSuspend", n = {"manifest"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$startVerification$1, reason: invalid class name and case insensitive filesystem */
    static final class C09441 extends SuspendLambda implements Function1<Continuation<? super NetworkingLinkVerificationState.Payload>, Object> {
        Object L$0;
        int label;

        C09441(Continuation<? super C09441> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return NetworkingLinkVerificationViewModel.this.new C09441(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super NetworkingLinkVerificationState.Payload> continuation) {
            return ((C09441) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = GetOrFetchSync.invoke$default(NetworkingLinkVerificationViewModel.this.getOrFetchSync, null, false, this, 3, null);
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
                return NetworkingLinkVerificationViewModel.this.buildPayload((ConsumerSession) obj, financialConnectionsSessionManifest.getInitialInstitution());
            }
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) obj).getManifest();
            CachedConsumerSession cachedConsumerSessionProvideConsumerSession = NetworkingLinkVerificationViewModel.this.consumerSessionProvider.provideConsumerSession();
            if (cachedConsumerSessionProvideConsumerSession != null) {
                this.L$0 = manifest;
                this.label = 2;
                Object objSms = NetworkingLinkVerificationViewModel.this.startVerification.sms(cachedConsumerSessionProvideConsumerSession.getClientSecret(), this);
                if (objSms != coroutine_suspended) {
                    financialConnectionsSessionManifest = manifest;
                    obj = objSms;
                    return NetworkingLinkVerificationViewModel.this.buildPayload((ConsumerSession) obj, financialConnectionsSessionManifest.getInitialInstitution());
                }
                return coroutine_suspended;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private final void startVerification() {
        FinancialConnectionsViewModel.execute$default(this, new C09441(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NetworkingLinkVerificationViewModel.startVerification$lambda$0((NetworkingLinkVerificationState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingLinkVerificationState startVerification$lambda$0(NetworkingLinkVerificationState execute, Async payload) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return NetworkingLinkVerificationState.copy$default(execute, payload, null, 2, null);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(NetworkingLinkVerificationState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TopAppBarStateUpdate(PANE, true, MavericksExtensionsKt.getError(state.getPayload()), false, null, false, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkingLinkVerificationState.Payload buildPayload(ConsumerSession consumerSession, FinancialConnectionsInstitution initialInstitution) {
        return new NetworkingLinkVerificationState.Payload(consumerSession.getEmailAddress(), getRedactedPhoneNumber.getRedactedPhoneNumber(consumerSession), new OTPElement(IdentifierSpec.INSTANCE.Generic("otp"), new OTPController(0, 1, null)), consumerSession.getClientSecret(), initialInstitution);
    }

    /* compiled from: NetworkingLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$observeAsyncs$2", f = "NetworkingLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$observeAsyncs$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<NetworkingLinkVerificationState.Payload, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = NetworkingLinkVerificationViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NetworkingLinkVerificationState.Payload payload, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: NetworkingLinkVerificationViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$observeAsyncs$2$1", f = "NetworkingLinkVerificationViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$observeAsyncs$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ NetworkingLinkVerificationState.Payload $it;
            int label;
            final /* synthetic */ NetworkingLinkVerificationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(NetworkingLinkVerificationState.Payload payload, NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$it = payload;
                this.this$0 = networkingLinkVerificationViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$it, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: NetworkingLinkVerificationViewModel.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$observeAsyncs$2$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C01531 extends AdaptedFunctionReference implements Function2<String, Continuation<? super Unit>, Object>, SuspendFunction {
                C01531(Object obj) {
                    super(2, obj, NetworkingLinkVerificationViewModel.class, "onOTPEntered", "onOTPEntered(Ljava/lang/String;)Lkotlinx/coroutines/Job;", 12);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return AnonymousClass1.invokeSuspend$onOTPEntered((NetworkingLinkVerificationViewModel) this.receiver, str, continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (FlowKt.collectLatest(this.$it.getOtpElement().getOtpCompleteFlow(), new C01531(this.this$0), this) == coroutine_suspended) {
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
            public static final /* synthetic */ Object invokeSuspend$onOTPEntered(NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel, String str, Continuation continuation) {
                networkingLinkVerificationViewModel.onOTPEntered(str);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(NetworkingLinkVerificationViewModel.this), null, null, new AnonymousClass1((NetworkingLinkVerificationState.Payload) this.L$0, NetworkingLinkVerificationViewModel.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void observeAsyncs() {
        onAsync(new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel.observeAsyncs.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((NetworkingLinkVerificationState) obj).getPayload();
            }
        }, new AnonymousClass2(null), new AnonymousClass3(null));
    }

    /* compiled from: NetworkingLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$observeAsyncs$3", f = "NetworkingLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$observeAsyncs$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = NetworkingLinkVerificationViewModel.this.new AnonymousClass3(continuation);
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
            FinancialConnectionsAnalyticsTrackerKt.logError(NetworkingLinkVerificationViewModel.this.analyticsTracker, "Error starting verification", (Throwable) this.L$0, NetworkingLinkVerificationViewModel.this.logger, NetworkingLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: NetworkingLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$onOTPEntered$1", f = "NetworkingLinkVerificationViewModel.kt", i = {0, 1, 1, 1, 2, 2, 3, 3}, l = {121, 130, 131, 133}, m = "invokeSuspend", n = {"payload", "payload", "$this$invokeSuspend_u24lambda_u240", "isInstantDebits", "payload", "isInstantDebits", "payload", "isInstantDebits"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "Z$0", "L$0", "Z$0"})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$onOTPEntered$1, reason: invalid class name and case insensitive filesystem */
    static final class C09431 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $otp;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09431(String str, Continuation<? super C09431> continuation) {
            super(1, continuation);
            this.$otp = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return NetworkingLinkVerificationViewModel.this.new C09431(this.$otp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C09431) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(1:75)|(1:(1:(1:(1:(9:8|9|10|50|51|56|(1:58)(1:(1:60)(3:61|(1:66)|67))|68|69)(2:11|12))(9:13|14|15|42|51|56|(0)(0)|68|69))(10:18|79|19|20|21|77|38|(7:41|42|51|56|(0)(0)|68|69)|72|48))(1:24))(2:26|(1:28)(2:70|71))|25|31|73|32|(2:34|(5:37|21|77|38|(0)))(2:46|(7:49|50|51|56|(0)(0)|68|69))|72|48|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        
            if (r16.this$0.confirmVerification.sms(r0.getConsumerSessionClientSecret(), r16.$otp, r16) == r6) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00fc, code lost:
        
            r2 = r4;
            r1 = r5;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v33 */
        /* JADX WARN: Type inference failed for: r1v34 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r4v14 */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v5, types: [com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState$Payload, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            NetworkingLinkVerificationState.Payload payload;
            boolean z;
            Throwable thM9121exceptionOrNullimpl;
            FinancialConnectionsSessionManifest.Pane pane;
            NetworkingLinkVerificationState.Payload payload2;
            ?? r4;
            boolean zInvoke;
            NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel;
            Object objInvoke;
            NetworkingLinkVerificationState.Payload payload3;
            boolean z2;
            boolean z3;
            NetworkingLinkVerificationState.Payload payload4;
            NetworkingLinkVerificationState.Payload payload5;
            Object objInvoke$default;
            boolean z4;
            NetworkingLinkVerificationState.Payload payload6;
            FinancialConnectionsSessionManifest manifest;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            ?? r1 = 4;
            ?? r2 = 3;
            try {
            } catch (Throwable th) {
                th = th;
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NetworkingLinkVerificationState.Payload payloadInvoke = NetworkingLinkVerificationViewModel.this.getStateFlow().getValue().getPayload().invoke();
                if (payloadInvoke == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                payload2 = payloadInvoke;
                this.L$0 = payload2;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            boolean z5 = this.Z$0;
                            NetworkingLinkVerificationState.Payload payload7 = (NetworkingLinkVerificationState.Payload) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            objInvoke$default = obj;
                            z4 = z5;
                            payload6 = payload7;
                            manifest = ((SynchronizeSessionResponse) objInvoke$default).getManifest();
                            r1 = z4;
                            r2 = payload6;
                            objM9118constructorimpl = Result.m9118constructorimpl(manifest);
                            z = r1;
                            payload = r2;
                            NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel2 = NetworkingLinkVerificationViewModel.this;
                            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                            if (thM9121exceptionOrNullimpl == null) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z6 = this.Z$0;
                        NetworkingLinkVerificationState.Payload payload8 = (NetworkingLinkVerificationState.Payload) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objInvoke = obj;
                        z2 = z6;
                        payload3 = payload8;
                        manifest = (FinancialConnectionsSessionManifest) objInvoke;
                        r1 = z2;
                        r2 = payload3;
                        objM9118constructorimpl = Result.m9118constructorimpl(manifest);
                        z = r1;
                        payload = r2;
                        NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel22 = NetworkingLinkVerificationViewModel.this;
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl == null) {
                            networkingLinkVerificationViewModel22.analyticsTracker.track(new FinancialConnectionsAnalyticsEvent.VerificationSuccess(NetworkingLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release()));
                            NavigationManager.DefaultImpls.tryNavigateTo$default(networkingLinkVerificationViewModel22.navigationManager, Destination.invoke$default(Destination.LinkAccountPicker.INSTANCE, NetworkingLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release(), null, 2, null), null, false, 6, null);
                        } else if (z) {
                            networkingLinkVerificationViewModel22.handleError.invoke("Error attaching consumer to LAS or synchronizing afterwards", thM9121exceptionOrNullimpl, NetworkingLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release(), true);
                        } else {
                            FinancialConnectionsAnalyticsTrackerKt.logError(networkingLinkVerificationViewModel22.analyticsTracker, "Error confirming verification or marking link as verified", thM9121exceptionOrNullimpl, networkingLinkVerificationViewModel22.logger, NetworkingLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release());
                            if (payload.getInitialInstitution() == null || (pane = FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH) == null) {
                                pane = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
                            }
                            networkingLinkVerificationViewModel22.analyticsTracker.track(new FinancialConnectionsAnalyticsEvent.VerificationError(NetworkingLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release(), FinancialConnectionsAnalyticsEvent.VerificationError.Error.MarkLinkVerifiedError));
                            NavigationManager.DefaultImpls.tryNavigateTo$default(networkingLinkVerificationViewModel22.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane), NetworkingLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release(), null, 2, null), null, false, 6, null);
                        }
                        return Unit.INSTANCE;
                    }
                    r1 = this.Z$0;
                    networkingLinkVerificationViewModel = (NetworkingLinkVerificationViewModel) this.L$1;
                    NetworkingLinkVerificationState.Payload payload9 = (NetworkingLinkVerificationState.Payload) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        z3 = r1 == true ? 1 : 0;
                        payload4 = payload9;
                        payload5 = payload4;
                        try {
                            GetOrFetchSync getOrFetchSync = networkingLinkVerificationViewModel.getOrFetchSync;
                            GetOrFetchSync.RefetchCondition.Always always = GetOrFetchSync.RefetchCondition.Always.INSTANCE;
                            this.L$0 = payload5;
                            this.L$1 = null;
                            this.Z$0 = z3;
                            this.label = 3;
                            r4 = 2;
                            zInvoke = false;
                            objInvoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, always, false, this, 2, null);
                        } catch (Throwable th2) {
                            th = th2;
                            r1 = z3;
                            r2 = payload5;
                            Result.Companion companion = Result.INSTANCE;
                            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                            z = r1;
                            payload = r2;
                            NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel222 = NetworkingLinkVerificationViewModel.this;
                            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                            if (thM9121exceptionOrNullimpl == null) {
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = payload9;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                        z = r1;
                        payload = r2;
                        NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel2222 = NetworkingLinkVerificationViewModel.this;
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl == null) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (objInvoke$default != coroutine_suspended) {
                        z4 = z3;
                        payload6 = payload5;
                        manifest = ((SynchronizeSessionResponse) objInvoke$default).getManifest();
                        r1 = z4;
                        r2 = payload6;
                        objM9118constructorimpl = Result.m9118constructorimpl(manifest);
                        z = r1;
                        payload = r2;
                        NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel22222 = NetworkingLinkVerificationViewModel.this;
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl == null) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                payload2 = (NetworkingLinkVerificationState.Payload) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            r4 = payload2;
            zInvoke = NetworkingLinkVerificationViewModel.this.isLinkWithStripe.invoke();
            networkingLinkVerificationViewModel = NetworkingLinkVerificationViewModel.this;
            Result.Companion companion3 = Result.INSTANCE;
            if (zInvoke) {
                AttachConsumerToLinkAccountSession attachConsumerToLinkAccountSession = networkingLinkVerificationViewModel.attachConsumerToLinkAccountSession;
                String consumerSessionClientSecret = r4.getConsumerSessionClientSecret();
                this.L$0 = r4;
                this.L$1 = networkingLinkVerificationViewModel;
                this.Z$0 = zInvoke;
                this.label = 2;
                r4 = r4;
                if (attachConsumerToLinkAccountSession.invoke(consumerSessionClientSecret, this) != coroutine_suspended) {
                    z3 = zInvoke;
                    payload4 = r4;
                    payload5 = payload4;
                    GetOrFetchSync getOrFetchSync2 = networkingLinkVerificationViewModel.getOrFetchSync;
                    GetOrFetchSync.RefetchCondition.Always always2 = GetOrFetchSync.RefetchCondition.Always.INSTANCE;
                    this.L$0 = payload5;
                    this.L$1 = null;
                    this.Z$0 = z3;
                    this.label = 3;
                    r4 = 2;
                    zInvoke = false;
                    objInvoke$default = GetOrFetchSync.invoke$default(getOrFetchSync2, always2, false, this, 2, null);
                    if (objInvoke$default != coroutine_suspended) {
                    }
                }
            } else {
                MarkLinkVerified markLinkVerified = networkingLinkVerificationViewModel.markLinkVerified;
                this.L$0 = r4;
                this.Z$0 = zInvoke;
                this.label = 4;
                objInvoke = markLinkVerified.invoke(this);
                r4 = r4;
                if (objInvoke != coroutine_suspended) {
                    payload3 = r4;
                    z2 = zInvoke;
                    manifest = (FinancialConnectionsSessionManifest) objInvoke;
                    r1 = z2;
                    r2 = payload3;
                    objM9118constructorimpl = Result.m9118constructorimpl(manifest);
                    z = r1;
                    payload = r2;
                    NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel222222 = NetworkingLinkVerificationViewModel.this;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl == null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job onOTPEntered(String otp) {
        return FinancialConnectionsViewModel.execute$default(this, new C09431(otp, null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NetworkingLinkVerificationViewModel.onOTPEntered$lambda$1((NetworkingLinkVerificationState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingLinkVerificationState onOTPEntered$lambda$1(NetworkingLinkVerificationState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return NetworkingLinkVerificationState.copy$default(execute, null, it, 1, null);
    }

    /* compiled from: NetworkingLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPANE$financial_connections_release", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NetworkingLinkVerificationViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getNetworkingLinkVerificationViewModelFactory().create(new NetworkingLinkVerificationState(null, null, 3, null));
        }

        public final FinancialConnectionsSessionManifest.Pane getPANE$financial_connections_release() {
            return NetworkingLinkVerificationViewModel.PANE;
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(NetworkingLinkVerificationViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NetworkingLinkVerificationViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
