package com.stripe.android.financialconnections.features.networkingsavetolinkverification;

import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.stripe.android.financialconnections.domain.CachedPartnerAccount;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.MarkLinkVerified;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.features.common.ManifestExtensionsKt;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002()Bs\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0006\u0010'\u001a\u00020\"R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "consumerSessionProvider", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;", "startVerification", "Lcom/stripe/android/financialconnections/domain/StartVerification;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "confirmVerification", "Lcom/stripe/android/financialconnections/domain/ConfirmVerification;", "attachedPaymentAccountRepository", "Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository;", "markLinkVerified", "Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;", "getCachedAccounts", "Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;", "saveAccountToLink", "Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/StartVerification;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/ConfirmVerification;Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository;Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "logErrors", "", "onOTPEntered", "Lkotlinx/coroutines/Job;", "otp", "", "onSkipClick", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkingSaveToLinkVerificationViewModel extends FinancialConnectionsViewModel<NetworkingSaveToLinkVerificationState> {
    private final AttachedPaymentAccountRepository attachedPaymentAccountRepository;
    private final ConfirmVerification confirmVerification;
    private final ConsumerSessionProvider consumerSessionProvider;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetCachedAccounts getCachedAccounts;
    private final GetOrFetchSync getOrFetchSync;
    private final Logger logger;
    private final MarkLinkVerified markLinkVerified;
    private final NavigationManager navigationManager;
    private final SaveAccountToLink saveAccountToLink;
    private final StartVerification startVerification;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.NETWORKING_SAVE_TO_LINK_VERIFICATION;

    /* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        NetworkingSaveToLinkVerificationViewModel create(NetworkingSaveToLinkVerificationState initialState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public NetworkingSaveToLinkVerificationViewModel(@Assisted NetworkingSaveToLinkVerificationState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker eventTracker, ConsumerSessionProvider consumerSessionProvider, StartVerification startVerification, GetOrFetchSync getOrFetchSync, ConfirmVerification confirmVerification, AttachedPaymentAccountRepository attachedPaymentAccountRepository, MarkLinkVerified markLinkVerified, GetCachedAccounts getCachedAccounts, SaveAccountToLink saveAccountToLink, NavigationManager navigationManager, Logger logger) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(consumerSessionProvider, "consumerSessionProvider");
        Intrinsics.checkNotNullParameter(startVerification, "startVerification");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(confirmVerification, "confirmVerification");
        Intrinsics.checkNotNullParameter(attachedPaymentAccountRepository, "attachedPaymentAccountRepository");
        Intrinsics.checkNotNullParameter(markLinkVerified, "markLinkVerified");
        Intrinsics.checkNotNullParameter(getCachedAccounts, "getCachedAccounts");
        Intrinsics.checkNotNullParameter(saveAccountToLink, "saveAccountToLink");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.eventTracker = eventTracker;
        this.consumerSessionProvider = consumerSessionProvider;
        this.startVerification = startVerification;
        this.getOrFetchSync = getOrFetchSync;
        this.confirmVerification = confirmVerification;
        this.attachedPaymentAccountRepository = attachedPaymentAccountRepository;
        this.markLinkVerified = markLinkVerified;
        this.getCachedAccounts = getCachedAccounts;
        this.saveAccountToLink = saveAccountToLink;
        this.navigationManager = navigationManager;
        this.logger = logger;
        logErrors();
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NetworkingSaveToLinkVerificationViewModel._init_$lambda$0((NetworkingSaveToLinkVerificationState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$1", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {0, 1, 1}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, 68}, m = "invokeSuspend", n = {"consumerSession", "consumerSession", "showNotNowButton"}, s = {"L$0", "L$0", "I$0"})
    /* renamed from: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super NetworkingSaveToLinkVerificationState.Payload>, Object> {
        int I$0;
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return NetworkingSaveToLinkVerificationViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super NetworkingSaveToLinkVerificationState.Payload> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(10:6|45|7|29|34|(1:36)|37|(1:39)(1:40)|41|42)(2:11|12))(1:13))(2:14|(3:16|(1:19)|27)(2:43|44))|20|(1:22)(1:23)|24|47|25|(8:28|29|34|(0)|37|(0)(0)|41|42)|27|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
        
            r2 = r1;
            r1 = r13;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CachedConsumerSession cachedConsumerSession;
            CachedConsumerSession cachedConsumerSession2;
            int i;
            Object objM9118constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CachedConsumerSession cachedConsumerSessionProvideConsumerSession = NetworkingSaveToLinkVerificationViewModel.this.consumerSessionProvider.provideConsumerSession();
                if (cachedConsumerSessionProvideConsumerSession != null) {
                    this.L$0 = cachedConsumerSessionProvideConsumerSession;
                    this.label = 1;
                    Object objInvoke$default = GetOrFetchSync.invoke$default(NetworkingSaveToLinkVerificationViewModel.this.getOrFetchSync, null, false, this, 3, null);
                    if (objInvoke$default != coroutine_suspended) {
                        cachedConsumerSession = cachedConsumerSessionProvideConsumerSession;
                        obj = objInvoke$default;
                    }
                    return coroutine_suspended;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                cachedConsumerSession2 = (CachedConsumerSession) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    objM9118constructorimpl = Result.m9118constructorimpl((ConsumerSession) obj);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    Result.Companion companion = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th2));
                    NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel = NetworkingSaveToLinkVerificationViewModel.this;
                    if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                    }
                    ResultKt.throwOnFailure(objM9118constructorimpl);
                    NetworkingSaveToLinkVerificationViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(NetworkingSaveToLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release()));
                    String emailAddress = cachedConsumerSession2.getEmailAddress();
                    String phoneNumber = cachedConsumerSession2.getPhoneNumber();
                    String clientSecret = cachedConsumerSession2.getClientSecret();
                    return new NetworkingSaveToLinkVerificationState.Payload(i == 0, emailAddress, phoneNumber, new OTPElement(IdentifierSpec.INSTANCE.Generic("otp"), new OTPController(0, 1, null)), clientSecret);
                }
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel2 = NetworkingSaveToLinkVerificationViewModel.this;
                if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                    networkingSaveToLinkVerificationViewModel2.eventTracker.track(new FinancialConnectionsAnalyticsEvent.VerificationError(NetworkingSaveToLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release(), FinancialConnectionsAnalyticsEvent.VerificationError.Error.StartVerificationSessionError));
                }
                ResultKt.throwOnFailure(objM9118constructorimpl);
                NetworkingSaveToLinkVerificationViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(NetworkingSaveToLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release()));
                String emailAddress2 = cachedConsumerSession2.getEmailAddress();
                String phoneNumber2 = cachedConsumerSession2.getPhoneNumber();
                String clientSecret2 = cachedConsumerSession2.getClientSecret();
                return new NetworkingSaveToLinkVerificationState.Payload(i == 0, emailAddress2, phoneNumber2, new OTPElement(IdentifierSpec.INSTANCE.Generic("otp"), new OTPController(0, 1, null)), clientSecret2);
            }
            cachedConsumerSession = (CachedConsumerSession) this.L$0;
            ResultKt.throwOnFailure(obj);
            int i3 = ((SynchronizeSessionResponse) obj).getManifest().getAccountholderCustomerEmailAddress() != null ? 1 : 0;
            NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel3 = NetworkingSaveToLinkVerificationViewModel.this;
            Result.Companion companion2 = Result.INSTANCE;
            StartVerification startVerification = networkingSaveToLinkVerificationViewModel3.startVerification;
            String clientSecret3 = cachedConsumerSession.getClientSecret();
            this.L$0 = cachedConsumerSession;
            this.I$0 = i3;
            this.label = 2;
            Object objSms = startVerification.sms(clientSecret3, this);
            if (objSms != coroutine_suspended) {
                CachedConsumerSession cachedConsumerSession3 = cachedConsumerSession;
                i = i3;
                obj = objSms;
                cachedConsumerSession2 = cachedConsumerSession3;
                objM9118constructorimpl = Result.m9118constructorimpl((ConsumerSession) obj);
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel22 = NetworkingSaveToLinkVerificationViewModel.this;
                if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                }
                ResultKt.throwOnFailure(objM9118constructorimpl);
                NetworkingSaveToLinkVerificationViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(NetworkingSaveToLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release()));
                String emailAddress22 = cachedConsumerSession2.getEmailAddress();
                String phoneNumber22 = cachedConsumerSession2.getPhoneNumber();
                String clientSecret22 = cachedConsumerSession2.getClientSecret();
                return new NetworkingSaveToLinkVerificationState.Payload(i == 0, emailAddress22, phoneNumber22, new OTPElement(IdentifierSpec.INSTANCE.Generic("otp"), new OTPController(0, 1, null)), clientSecret22);
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingSaveToLinkVerificationState _init_$lambda$0(NetworkingSaveToLinkVerificationState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return NetworkingSaveToLinkVerificationState.copy$default(execute, it, null, 2, null);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(NetworkingSaveToLinkVerificationState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TopAppBarStateUpdate(PANE, true, MavericksExtensionsKt.getError(state.getPayload()), false, null, false, 56, null);
    }

    /* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$2", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<NetworkingSaveToLinkVerificationState.Payload, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = NetworkingSaveToLinkVerificationViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NetworkingSaveToLinkVerificationState.Payload payload, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$2$1", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ NetworkingSaveToLinkVerificationState.Payload $it;
            int label;
            final /* synthetic */ NetworkingSaveToLinkVerificationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(NetworkingSaveToLinkVerificationState.Payload payload, NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$it = payload;
                this.this$0 = networkingSaveToLinkVerificationViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$it, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$2$1$1", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01541 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ NetworkingSaveToLinkVerificationViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01541(NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel, Continuation<? super C01541> continuation) {
                    super(2, continuation);
                    this.this$0 = networkingSaveToLinkVerificationViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C01541 c01541 = new C01541(this.this$0, continuation);
                    c01541.L$0 = obj;
                    return c01541;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C01541) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    if (FlowKt.collectLatest(this.$it.getOtpElement().getOtpCompleteFlow(), new C01541(this.this$0, null), this) == coroutine_suspended) {
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
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(NetworkingSaveToLinkVerificationViewModel.this), null, null, new AnonymousClass1((NetworkingSaveToLinkVerificationState.Payload) this.L$0, NetworkingSaveToLinkVerificationViewModel.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void logErrors() {
        onAsync(new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel.logErrors.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((NetworkingSaveToLinkVerificationState) obj).getPayload();
            }
        }, new AnonymousClass2(null), new AnonymousClass3(null));
        onAsync(new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel.logErrors.4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((NetworkingSaveToLinkVerificationState) obj).getConfirmVerification();
            }
        }, new AnonymousClass5(null), new AnonymousClass6(null));
    }

    /* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$3", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = NetworkingSaveToLinkVerificationViewModel.this.new AnonymousClass3(continuation);
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
            FinancialConnectionsAnalyticsTrackerKt.logError(NetworkingSaveToLinkVerificationViewModel.this.eventTracker, "Error fetching payload", (Throwable) this.L$0, NetworkingSaveToLinkVerificationViewModel.this.logger, NetworkingSaveToLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$5", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NetworkingSaveToLinkVerificationViewModel.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                NavigationManager.DefaultImpls.tryNavigateTo$default(NetworkingSaveToLinkVerificationViewModel.this.navigationManager, Destination.invoke$default(Destination.Success.INSTANCE, NetworkingSaveToLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release(), null, 2, null), null, false, 6, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$6", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$logErrors$6, reason: invalid class name */
    static final class AnonymousClass6 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass6 anonymousClass6 = NetworkingSaveToLinkVerificationViewModel.this.new AnonymousClass6(continuation);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            FinancialConnectionsAnalyticsTrackerKt.logError(NetworkingSaveToLinkVerificationViewModel.this.eventTracker, "Error confirming verification", th, NetworkingSaveToLinkVerificationViewModel.this.logger, NetworkingSaveToLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release());
            if (!(th instanceof ConfirmVerification.OTPError)) {
                NavigationManager.DefaultImpls.tryNavigateTo$default(NetworkingSaveToLinkVerificationViewModel.this.navigationManager, Destination.invoke$default(Destination.Success.INSTANCE, NetworkingSaveToLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release(), null, 2, null), null, false, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$onOTPEntered$1", f = "NetworkingSaveToLinkVerificationViewModel.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {134, 139, 147, 149, 161}, m = "invokeSuspend", n = {"payload", "$this$invokeSuspend_u24lambda_u241", "payload", "$this$invokeSuspend_u24lambda_u241", "payload", "$this$invokeSuspend_u24lambda_u241", "accounts"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$onOTPEntered$1, reason: invalid class name and case insensitive filesystem */
    static final class C09471 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $otp;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09471(String str, Continuation<? super C09471> continuation) {
            super(1, continuation);
            this.$otp = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return NetworkingSaveToLinkVerificationViewModel.this.new C09471(this.$otp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C09471) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
        
            if (r0 == r6) goto L70;
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b6 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:15:0x0029, B:58:0x0115, B:18:0x003b, B:55:0x00f4, B:21:0x004a, B:40:0x00ad, B:42:0x00b6, B:44:0x00c2, B:46:0x00c8, B:49:0x00cd, B:50:0x00d8, B:51:0x00d9, B:25:0x0059, B:36:0x0099, B:32:0x007f), top: B:78:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            Object objInvoke;
            NetworkingSaveToLinkVerificationState.Payload payload;
            NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel;
            Object objInvoke2;
            NetworkingSaveToLinkVerificationState.Payload payload2;
            List<CachedPartnerAccount> list;
            Object objInvoke$default;
            NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel2;
            NetworkingSaveToLinkVerificationState.Payload payload3;
            Object objExisting;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m9118constructorimpl(ResultKt.createFailure(th2));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NetworkingSaveToLinkVerificationState.Payload payloadInvoke = NetworkingSaveToLinkVerificationViewModel.this.getStateFlow().getValue().getPayload().invoke();
                if (payloadInvoke == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                NetworkingSaveToLinkVerificationState.Payload payload4 = payloadInvoke;
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel3 = NetworkingSaveToLinkVerificationViewModel.this;
                String str = this.$otp;
                Result.Companion companion3 = Result.INSTANCE;
                ConfirmVerification confirmVerification = networkingSaveToLinkVerificationViewModel3.confirmVerification;
                String consumerSessionClientSecret = payload4.getConsumerSessionClientSecret();
                this.L$0 = payload4;
                this.L$1 = networkingSaveToLinkVerificationViewModel3;
                this.label = 1;
                if (confirmVerification.sms(consumerSessionClientSecret, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                payload = payload4;
                networkingSaveToLinkVerificationViewModel = networkingSaveToLinkVerificationViewModel3;
            } else if (i == 1) {
                networkingSaveToLinkVerificationViewModel = (NetworkingSaveToLinkVerificationViewModel) this.L$1;
                payload = (NetworkingSaveToLinkVerificationState.Payload) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                networkingSaveToLinkVerificationViewModel = (NetworkingSaveToLinkVerificationViewModel) this.L$1;
                NetworkingSaveToLinkVerificationState.Payload payload5 = (NetworkingSaveToLinkVerificationState.Payload) this.L$0;
                ResultKt.throwOnFailure(obj);
                payload2 = payload5;
                objInvoke2 = obj;
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel4 = networkingSaveToLinkVerificationViewModel;
                list = (List) objInvoke2;
                if (list.isEmpty()) {
                    AttachedPaymentAccountRepository.State state = networkingSaveToLinkVerificationViewModel4.attachedPaymentAccountRepository.get();
                    if (!((state != null ? state.getAttachedPaymentAccount() : null) instanceof PaymentAccountParams.BankAccount)) {
                        throw new IllegalArgumentException("An already attached account is required when no accounts cached".toString());
                    }
                }
                GetOrFetchSync getOrFetchSync = networkingSaveToLinkVerificationViewModel4.getOrFetchSync;
                this.L$0 = payload2;
                this.L$1 = networkingSaveToLinkVerificationViewModel4;
                this.L$2 = list;
                this.label = 3;
                objInvoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, false, this, 3, null);
                if (objInvoke$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                networkingSaveToLinkVerificationViewModel2 = networkingSaveToLinkVerificationViewModel4;
                payload3 = payload2;
                FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) objInvoke$default).getManifest();
                SaveAccountToLink saveAccountToLink = networkingSaveToLinkVerificationViewModel2.saveAccountToLink;
                String consumerSessionClientSecret2 = payload3.getConsumerSessionClientSecret();
                boolean zIsDataFlow = ManifestExtensionsKt.isDataFlow(manifest);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                objExisting = saveAccountToLink.existing(consumerSessionClientSecret2, list, zIsDataFlow, this);
                if (objExisting == coroutine_suspended) {
                }
                objM9118constructorimpl = Result.m9118constructorimpl((FinancialConnectionsSessionManifest) objExisting);
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel5 = NetworkingSaveToLinkVerificationViewModel.this;
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                }
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel6 = NetworkingSaveToLinkVerificationViewModel.this;
                if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                }
                ResultKt.throwOnFailure(objM9118constructorimpl);
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel7 = NetworkingSaveToLinkVerificationViewModel.this;
                Result.Companion companion4 = Result.INSTANCE;
                MarkLinkVerified markLinkVerified = networkingSaveToLinkVerificationViewModel7.markLinkVerified;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 5;
                objInvoke = markLinkVerified.invoke(this);
            } else if (i == 3) {
                List<CachedPartnerAccount> list2 = (List) this.L$2;
                networkingSaveToLinkVerificationViewModel2 = (NetworkingSaveToLinkVerificationViewModel) this.L$1;
                payload3 = (NetworkingSaveToLinkVerificationState.Payload) this.L$0;
                ResultKt.throwOnFailure(obj);
                list = list2;
                objInvoke$default = obj;
                FinancialConnectionsSessionManifest manifest2 = ((SynchronizeSessionResponse) objInvoke$default).getManifest();
                SaveAccountToLink saveAccountToLink2 = networkingSaveToLinkVerificationViewModel2.saveAccountToLink;
                String consumerSessionClientSecret22 = payload3.getConsumerSessionClientSecret();
                boolean zIsDataFlow2 = ManifestExtensionsKt.isDataFlow(manifest2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                objExisting = saveAccountToLink2.existing(consumerSessionClientSecret22, list, zIsDataFlow2, this);
                if (objExisting == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objM9118constructorimpl = Result.m9118constructorimpl((FinancialConnectionsSessionManifest) objExisting);
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel52 = NetworkingSaveToLinkVerificationViewModel.this;
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                }
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel62 = NetworkingSaveToLinkVerificationViewModel.this;
                if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                }
                ResultKt.throwOnFailure(objM9118constructorimpl);
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel72 = NetworkingSaveToLinkVerificationViewModel.this;
                Result.Companion companion42 = Result.INSTANCE;
                MarkLinkVerified markLinkVerified2 = networkingSaveToLinkVerificationViewModel72.markLinkVerified;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 5;
                objInvoke = markLinkVerified2.invoke(this);
            } else {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objInvoke = obj;
                    Result.m9118constructorimpl((FinancialConnectionsSessionManifest) objInvoke);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objExisting = obj;
                objM9118constructorimpl = Result.m9118constructorimpl((FinancialConnectionsSessionManifest) objExisting);
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel522 = NetworkingSaveToLinkVerificationViewModel.this;
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                    networkingSaveToLinkVerificationViewModel522.eventTracker.track(new FinancialConnectionsAnalyticsEvent.VerificationSuccess(NetworkingSaveToLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release()));
                }
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel622 = NetworkingSaveToLinkVerificationViewModel.this;
                if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
                    networkingSaveToLinkVerificationViewModel622.eventTracker.track(new FinancialConnectionsAnalyticsEvent.VerificationError(NetworkingSaveToLinkVerificationViewModel.INSTANCE.getPANE$financial_connections_release(), FinancialConnectionsAnalyticsEvent.VerificationError.Error.ConfirmVerificationSessionError));
                }
                ResultKt.throwOnFailure(objM9118constructorimpl);
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel722 = NetworkingSaveToLinkVerificationViewModel.this;
                Result.Companion companion422 = Result.INSTANCE;
                MarkLinkVerified markLinkVerified22 = networkingSaveToLinkVerificationViewModel722.markLinkVerified;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 5;
                objInvoke = markLinkVerified22.invoke(this);
            }
            GetCachedAccounts getCachedAccounts = networkingSaveToLinkVerificationViewModel.getCachedAccounts;
            this.L$0 = payload;
            this.L$1 = networkingSaveToLinkVerificationViewModel;
            this.label = 2;
            objInvoke2 = getCachedAccounts.invoke(this);
            if (objInvoke2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            payload2 = payload;
            NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel42 = networkingSaveToLinkVerificationViewModel;
            list = (List) objInvoke2;
            if (list.isEmpty()) {
            }
            GetOrFetchSync getOrFetchSync2 = networkingSaveToLinkVerificationViewModel42.getOrFetchSync;
            this.L$0 = payload2;
            this.L$1 = networkingSaveToLinkVerificationViewModel42;
            this.L$2 = list;
            this.label = 3;
            objInvoke$default = GetOrFetchSync.invoke$default(getOrFetchSync2, null, false, this, 3, null);
            if (objInvoke$default != coroutine_suspended) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job onOTPEntered(String otp) {
        return FinancialConnectionsViewModel.execute$default(this, new C09471(otp, null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NetworkingSaveToLinkVerificationViewModel.onOTPEntered$lambda$1((NetworkingSaveToLinkVerificationState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingSaveToLinkVerificationState onOTPEntered$lambda$1(NetworkingSaveToLinkVerificationState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return NetworkingSaveToLinkVerificationState.copy$default(execute, null, it, 1, null);
    }

    public final void onSkipClick() {
        NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.Success.INSTANCE, PANE, null, 2, null), null, false, 6, null);
    }

    /* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel$Companion;", "", "<init>", "()V", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPANE$financial_connections_release", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FinancialConnectionsSessionManifest.Pane getPANE$financial_connections_release() {
            return NetworkingSaveToLinkVerificationViewModel.PANE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NetworkingSaveToLinkVerificationViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getNetworkingSaveToLinkVerificationViewModelFactory().create(new NetworkingSaveToLinkVerificationState(null, null, 3, null));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(NetworkingSaveToLinkVerificationViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NetworkingSaveToLinkVerificationViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
