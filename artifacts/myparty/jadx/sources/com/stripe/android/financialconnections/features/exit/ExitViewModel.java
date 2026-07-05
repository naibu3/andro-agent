package com.stripe.android.financialconnections.features.exit;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.common.ManifestExtensionsKt;
import com.stripe.android.financialconnections.features.exit.ExitState;
import com.stripe.android.financialconnections.features.exit.ExitViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ExitViewModel.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/exit/ExitState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "coordinator", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lcom/stripe/android/financialconnections/features/exit/ExitState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;)V", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "onCloseConfirm", "Lkotlinx/coroutines/Job;", "onCloseDismiss", "", "logErrors", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExitViewModel extends FinancialConnectionsViewModel<ExitState> {
    private final NativeAuthFlowCoordinator coordinator;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetOrFetchSync getOrFetchSync;
    private final Logger logger;
    private final NavigationManager navigationManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.EXIT;

    /* compiled from: ExitViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/exit/ExitState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        ExitViewModel create(ExitState initialState);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(ExitState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public ExitViewModel(@Assisted ExitState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, GetOrFetchSync getOrFetchSync, NativeAuthFlowCoordinator coordinator, FinancialConnectionsAnalyticsTracker eventTracker, NavigationManager navigationManager, Logger logger) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.getOrFetchSync = getOrFetchSync;
        this.coordinator = coordinator;
        this.eventTracker = eventTracker;
        this.navigationManager = navigationManager;
        this.logger = logger;
        logErrors();
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ExitViewModel._init_$lambda$0((ExitState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* compiled from: ExitViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/exit/ExitState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.exit.ExitViewModel$1", f = "ExitViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.exit.ExitViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ExitState.Payload>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ExitViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ExitState.Payload> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            Throwable th;
            Object objM9118constructorimpl;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            TextResource.StringId stringId;
            TextResource.StringId stringId2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ExitViewModel exitViewModel = ExitViewModel.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    GetOrFetchSync getOrFetchSync = exitViewModel.getOrFetchSync;
                    this.label = 1;
                    anonymousClass1 = this;
                    try {
                        obj = GetOrFetchSync.invoke$default(getOrFetchSync, null, false, anonymousClass1, 3, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                        }
                        financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) objM9118constructorimpl;
                        if (financialConnectionsSessionManifest == null) {
                        }
                        if (!(financialConnectionsSessionManifest == null ? Intrinsics.areEqual(financialConnectionsSessionManifest.isNetworkingUserFlow(), Boxing.boxBoolean(true)) : false) && ExitViewModel.this.getStateFlow().getValue().getReferrer() == FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE) {
                        }
                        return new ExitState.Payload(stringId2);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    anonymousClass1 = this;
                    th = th;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                    }
                    financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) objM9118constructorimpl;
                    if (financialConnectionsSessionManifest == null) {
                    }
                    if (!(financialConnectionsSessionManifest == null ? Intrinsics.areEqual(financialConnectionsSessionManifest.isNetworkingUserFlow(), Boxing.boxBoolean(true)) : false) && ExitViewModel.this.getStateFlow().getValue().getReferrer() == FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE) {
                    }
                    return new ExitState.Payload(stringId2);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass1 = this;
                    Result.Companion companion222 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                    }
                    financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) objM9118constructorimpl;
                    if (financialConnectionsSessionManifest == null) {
                    }
                    if (!(financialConnectionsSessionManifest == null ? Intrinsics.areEqual(financialConnectionsSessionManifest.isNetworkingUserFlow(), Boxing.boxBoolean(true)) : false) && ExitViewModel.this.getStateFlow().getValue().getReferrer() == FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE) {
                    }
                    return new ExitState.Payload(stringId2);
                }
            }
            objM9118constructorimpl = Result.m9118constructorimpl(((SynchronizeSessionResponse) obj).getManifest());
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                objM9118constructorimpl = null;
            }
            financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) objM9118constructorimpl;
            String businessName = financialConnectionsSessionManifest == null ? ManifestExtensionsKt.getBusinessName(financialConnectionsSessionManifest) : null;
            if (!(financialConnectionsSessionManifest == null ? Intrinsics.areEqual(financialConnectionsSessionManifest.isNetworkingUserFlow(), Boxing.boxBoolean(true)) : false) && ExitViewModel.this.getStateFlow().getValue().getReferrer() == FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE) {
                if (businessName == null) {
                    stringId2 = new TextResource.StringId(R.string.stripe_exit_modal_desc_no_business, null, 2, null);
                } else {
                    stringId = new TextResource.StringId(R.string.stripe_exit_modal_desc, CollectionsKt.listOf(businessName));
                    stringId2 = stringId;
                }
            } else if (businessName == null) {
                stringId2 = new TextResource.StringId(R.string.stripe_close_dialog_networking_desc_no_business, null, 2, null);
            } else {
                stringId = new TextResource.StringId(R.string.stripe_close_dialog_networking_desc, CollectionsKt.listOf(businessName));
                stringId2 = stringId;
            }
            return new ExitState.Payload(stringId2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitState _init_$lambda$0(ExitState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return ExitState.copy$default(execute, null, it, false, 5, null);
    }

    /* compiled from: ExitViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.exit.ExitViewModel$onCloseConfirm$1", f = "ExitViewModel.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.exit.ExitViewModel$onCloseConfirm$1, reason: invalid class name and case insensitive filesystem */
    static final class C08951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C08951(Continuation<? super C08951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExitViewModel.this.new C08951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ExitViewModel.this.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.exit.ExitViewModel$onCloseConfirm$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ExitViewModel.C08951.invokeSuspend$lambda$0((ExitState) obj2);
                    }
                });
                this.label = 1;
                if (ExitViewModel.this.coordinator.invoke().emit(new NativeAuthFlowCoordinator.Message.Complete(null), this) == coroutine_suspended) {
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
        public static final ExitState invokeSuspend$lambda$0(ExitState exitState) {
            return ExitState.copy$default(exitState, null, null, true, 3, null);
        }
    }

    public final Job onCloseConfirm() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08951(null), 3, null);
    }

    public final void onCloseDismiss() {
        this.navigationManager.tryNavigateBack();
    }

    private final void logErrors() {
        FinancialConnectionsViewModel.onAsync$default(this, new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.exit.ExitViewModel.logErrors.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ExitState) obj).getPayload();
            }
        }, null, new AnonymousClass2(null), 2, null);
    }

    /* compiled from: ExitViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.exit.ExitViewModel$logErrors$2", f = "ExitViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.exit.ExitViewModel$logErrors$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = ExitViewModel.this.new AnonymousClass2(continuation);
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
            FinancialConnectionsAnalyticsTrackerKt.logError(ExitViewModel.this.eventTracker, "Error loading payload", (Throwable) this.L$0, ExitViewModel.this.logger, ExitViewModel.INSTANCE.getPANE$financial_connections_release());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ExitViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "arguments", "Landroid/os/Bundle;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPANE$financial_connections_release", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ExitViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, Bundle bundle, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getExitViewModelFactory().create(new ExitState(bundle));
        }

        public final FinancialConnectionsSessionManifest.Pane getPANE$financial_connections_release() {
            return ExitViewModel.PANE;
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent, final Bundle arguments) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(ExitViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.exit.ExitViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExitViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, arguments, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
