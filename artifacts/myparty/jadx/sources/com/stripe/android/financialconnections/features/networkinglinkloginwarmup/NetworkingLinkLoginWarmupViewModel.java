package com.stripe.android.financialconnections.features.networkinglinkloginwarmup;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.DisableNetworking;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.common.ManifestExtensionsKt;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupState;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.model.EmailSource;
import com.stripe.android.uicore.navigation.NavigationManager;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
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

/* compiled from: NetworkingLinkLoginWarmupViewModel.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#B]\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "handleError", "Lcom/stripe/android/financialconnections/domain/HandleError;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "disableNetworking", "Lcom/stripe/android/financialconnections/domain/DisableNetworking;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "lookupAccount", "Lcom/stripe/android/financialconnections/domain/LookupAccount;", "prefillDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;", "consumerSessionProvider", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;", "<init>", "(Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/HandleError;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/DisableNetworking;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/LookupAccount;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;)V", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "logErrors", "", "onContinueClick", "onSecondaryButtonClicked", "skipNetworking", "determinePopUpToBehaviorForSkip", "Lcom/stripe/android/uicore/navigation/PopUpToBehavior;", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkingLinkLoginWarmupViewModel extends FinancialConnectionsViewModel<NetworkingLinkLoginWarmupState> {
    private final ConsumerSessionProvider consumerSessionProvider;
    private final DisableNetworking disableNetworking;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetOrFetchSync getOrFetchSync;
    private final HandleError handleError;
    private final LookupAccount lookupAccount;
    private final NavigationManager navigationManager;
    private final ElementsSessionContext.PrefillDetails prefillDetails;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_LOGIN_WARMUP;

    /* compiled from: NetworkingLinkLoginWarmupViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        NetworkingLinkLoginWarmupViewModel create(NetworkingLinkLoginWarmupState initialState);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(NetworkingLinkLoginWarmupState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public NetworkingLinkLoginWarmupViewModel(@Assisted NetworkingLinkLoginWarmupState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker eventTracker, HandleError handleError, GetOrFetchSync getOrFetchSync, DisableNetworking disableNetworking, NavigationManager navigationManager, LookupAccount lookupAccount, ElementsSessionContext.PrefillDetails prefillDetails, ConsumerSessionProvider consumerSessionProvider) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(disableNetworking, "disableNetworking");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(lookupAccount, "lookupAccount");
        Intrinsics.checkNotNullParameter(consumerSessionProvider, "consumerSessionProvider");
        this.eventTracker = eventTracker;
        this.handleError = handleError;
        this.getOrFetchSync = getOrFetchSync;
        this.disableNetworking = disableNetworking;
        this.navigationManager = navigationManager;
        this.lookupAccount = lookupAccount;
        this.prefillDetails = prefillDetails;
        this.consumerSessionProvider = consumerSessionProvider;
        logErrors();
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NetworkingLinkLoginWarmupViewModel._init_$lambda$0((NetworkingLinkLoginWarmupState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* compiled from: NetworkingLinkLoginWarmupViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$1", f = "NetworkingLinkLoginWarmupViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super NetworkingLinkLoginWarmupState.Payload>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return NetworkingLinkLoginWarmupViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super NetworkingLinkLoginWarmupState.Payload> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = GetOrFetchSync.invoke$default(NetworkingLinkLoginWarmupViewModel.this.getOrFetchSync, null, false, this, 3, null);
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
            NetworkingLinkLoginWarmupViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(NetworkingLinkLoginWarmupViewModel.INSTANCE.getPANE$financial_connections_release()));
            String accountholderCustomerEmailAddress = manifest.getAccountholderCustomerEmailAddress();
            if (accountholderCustomerEmailAddress == null) {
                ElementsSessionContext.PrefillDetails prefillDetails = NetworkingLinkLoginWarmupViewModel.this.prefillDetails;
                accountholderCustomerEmailAddress = prefillDetails != null ? prefillDetails.getEmail() : null;
            }
            String str = accountholderCustomerEmailAddress;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            return new NetworkingLinkLoginWarmupState.Payload(ManifestExtensionsKt.getBusinessName(manifest), str, NetworkingLinkLoginWarmupViewModelKt.redactEmail(str), manifest.getAppVerificationEnabled(), manifest.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingLinkLoginWarmupState _init_$lambda$0(NetworkingLinkLoginWarmupState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return NetworkingLinkLoginWarmupState.copy$default(execute, null, null, null, it, null, null, false, 119, null);
    }

    private final void logErrors() {
        NetworkingLinkLoginWarmupViewModel networkingLinkLoginWarmupViewModel = this;
        FinancialConnectionsViewModel.onAsync$default(networkingLinkLoginWarmupViewModel, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel.logErrors.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((NetworkingLinkLoginWarmupState) obj).getPayload();
            }
        }, null, new AnonymousClass2(null), 2, null);
        FinancialConnectionsViewModel.onAsync$default(networkingLinkLoginWarmupViewModel, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel.logErrors.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((NetworkingLinkLoginWarmupState) obj).getDisableNetworkingAsync();
            }
        }, null, new AnonymousClass4(null), 2, null);
        FinancialConnectionsViewModel.onAsync$default(networkingLinkLoginWarmupViewModel, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel.logErrors.5
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((NetworkingLinkLoginWarmupState) obj).getContinueAsync();
            }
        }, null, new AnonymousClass6(null), 2, null);
    }

    /* compiled from: NetworkingLinkLoginWarmupViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$logErrors$2", f = "NetworkingLinkLoginWarmupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$logErrors$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = NetworkingLinkLoginWarmupViewModel.this.new AnonymousClass2(continuation);
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
            NetworkingLinkLoginWarmupViewModel.this.handleError.invoke("Error fetching payload", (Throwable) this.L$0, NetworkingLinkLoginWarmupViewModel.INSTANCE.getPANE$financial_connections_release(), true);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: NetworkingLinkLoginWarmupViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$logErrors$4", f = "NetworkingLinkLoginWarmupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$logErrors$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = NetworkingLinkLoginWarmupViewModel.this.new AnonymousClass4(continuation);
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
            NetworkingLinkLoginWarmupViewModel.this.handleError.invoke("Error disabling networking", (Throwable) this.L$0, NetworkingLinkLoginWarmupViewModel.INSTANCE.getPANE$financial_connections_release(), true);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: NetworkingLinkLoginWarmupViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$logErrors$6", f = "NetworkingLinkLoginWarmupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$logErrors$6, reason: invalid class name */
    static final class AnonymousClass6 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass6 anonymousClass6 = NetworkingLinkLoginWarmupViewModel.this.new AnonymousClass6(continuation);
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
            NetworkingLinkLoginWarmupViewModel.this.handleError.invoke("Error looking up account", (Throwable) this.L$0, NetworkingLinkLoginWarmupViewModel.INSTANCE.getPANE$financial_connections_release(), false);
            return Unit.INSTANCE;
        }
    }

    public final void onContinueClick() {
        NetworkingLinkLoginWarmupState.Payload payloadInvoke = getStateFlow().getValue().getPayload().invoke();
        if (payloadInvoke == null) {
            return;
        }
        FinancialConnectionsViewModel.execute$default(this, new C09271(this.consumerSessionProvider.provideConsumerSession(), payloadInvoke, null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NetworkingLinkLoginWarmupViewModel.onContinueClick$lambda$1((NetworkingLinkLoginWarmupState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* compiled from: NetworkingLinkLoginWarmupViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$onContinueClick$1", f = "NetworkingLinkLoginWarmupViewModel.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$onContinueClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09271 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ CachedConsumerSession $existingConsumerSession;
        final /* synthetic */ NetworkingLinkLoginWarmupState.Payload $payload;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09271(CachedConsumerSession cachedConsumerSession, NetworkingLinkLoginWarmupState.Payload payload, Continuation<? super C09271> continuation) {
            super(1, continuation);
            this.$existingConsumerSession = cachedConsumerSession;
            this.$payload = payload;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return NetworkingLinkLoginWarmupViewModel.this.new C09271(this.$existingConsumerSession, this.$payload, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C09271) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NetworkingLinkLoginWarmupViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click("click.continue", NetworkingLinkLoginWarmupViewModel.INSTANCE.getPANE$financial_connections_release()));
                if (this.$existingConsumerSession == null) {
                    LookupAccount lookupAccount = NetworkingLinkLoginWarmupViewModel.this.lookupAccount;
                    FinancialConnectionsSessionManifest.Pane pANE$financial_connections_release = NetworkingLinkLoginWarmupViewModel.INSTANCE.getPANE$financial_connections_release();
                    String email = this.$payload.getEmail();
                    EmailSource emailSource = EmailSource.CUSTOMER_OBJECT;
                    String sessionId = this.$payload.getSessionId();
                    this.label = 1;
                    if (lookupAccount.invoke(email, null, null, emailSource, this.$payload.getVerifiedFlow(), sessionId, pANE$financial_connections_release, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            NavigationManager.DefaultImpls.tryNavigateTo$default(NetworkingLinkLoginWarmupViewModel.this.navigationManager, Destination.invoke$default(Destination.NetworkingLinkVerification.INSTANCE, NetworkingLinkLoginWarmupViewModel.INSTANCE.getPANE$financial_connections_release(), null, 2, null), null, false, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingLinkLoginWarmupState onContinueClick$lambda$1(NetworkingLinkLoginWarmupState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return NetworkingLinkLoginWarmupState.copy$default(execute, null, null, null, null, null, it, false, 95, null);
    }

    public final void onSecondaryButtonClicked() {
        if (getStateFlow().getValue().isInstantDebits()) {
            this.navigationManager.tryNavigateBack();
        } else {
            skipNetworking();
        }
    }

    /* compiled from: NetworkingLinkLoginWarmupViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$skipNetworking$1", f = "NetworkingLinkLoginWarmupViewModel.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$skipNetworking$1, reason: invalid class name and case insensitive filesystem */
    static final class C09281 extends SuspendLambda implements Function1<Continuation<? super FinancialConnectionsSessionManifest>, Object> {
        int label;

        C09281(Continuation<? super C09281> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return NetworkingLinkLoginWarmupViewModel.this.new C09281(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super FinancialConnectionsSessionManifest> continuation) {
            return ((C09281) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NetworkingLinkLoginWarmupViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click("click.skip_sign_in", NetworkingLinkLoginWarmupViewModel.INSTANCE.getPANE$financial_connections_release()));
                this.label = 1;
                obj = NetworkingLinkLoginWarmupViewModel.this.disableNetworking.invoke(NetworkingLinkLoginWarmupViewModel.this.getStateFlow().getValue().getNextPaneOnDisableNetworking(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            NetworkingLinkLoginWarmupViewModel networkingLinkLoginWarmupViewModel = NetworkingLinkLoginWarmupViewModel.this;
            NavigationManager.DefaultImpls.tryNavigateTo$default(networkingLinkLoginWarmupViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(((FinancialConnectionsSessionManifest) obj).getNextPane()), NetworkingLinkLoginWarmupViewModel.INSTANCE.getPANE$financial_connections_release(), null, 2, null), networkingLinkLoginWarmupViewModel.determinePopUpToBehaviorForSkip(), false, 4, null);
            return obj;
        }
    }

    private final void skipNetworking() {
        FinancialConnectionsViewModel.execute$default(this, new C09281(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NetworkingLinkLoginWarmupViewModel.skipNetworking$lambda$2((NetworkingLinkLoginWarmupState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingLinkLoginWarmupState skipNetworking$lambda$2(NetworkingLinkLoginWarmupState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return NetworkingLinkLoginWarmupState.copy$default(execute, null, null, null, null, it, null, false, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PopUpToBehavior determinePopUpToBehaviorForSkip() {
        FinancialConnectionsSessionManifest.Pane referrer = getStateFlow().getValue().getReferrer();
        if (referrer != null) {
            return new PopUpToBehavior.Route(true, DestinationMappersKt.getDestination(referrer).getFullRoute());
        }
        return new PopUpToBehavior.Current(true);
    }

    /* compiled from: NetworkingLinkLoginWarmupViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupViewModel$Companion;", "", "<init>", "()V", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPANE$financial_connections_release", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "arguments", "Landroid/os/Bundle;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FinancialConnectionsSessionManifest.Pane getPANE$financial_connections_release() {
            return NetworkingLinkLoginWarmupViewModel.PANE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NetworkingLinkLoginWarmupViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, Bundle bundle, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getNetworkingLinkLoginWarmupViewModelFactory().create(new NetworkingLinkLoginWarmupState(bundle, financialConnectionsSheetNativeComponent.getViewModel().getStateFlow().getValue()));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent, final Bundle arguments) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(NetworkingLinkLoginWarmupViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NetworkingLinkLoginWarmupViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, arguments, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
