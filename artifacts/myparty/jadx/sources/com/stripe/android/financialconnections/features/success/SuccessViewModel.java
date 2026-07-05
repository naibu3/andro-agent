package com.stripe.android.financialconnections.features.success;

import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.common.ManifestExtensionsKt;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.features.success.SuccessViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.List;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: SuccessViewModel.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cBC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/success/SuccessState;", "initialState", "getCachedAccounts", "Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "successContentRepository", "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "logger", "Lcom/stripe/android/core/Logger;", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "<init>", "(Lcom/stripe/android/financialconnections/features/success/SuccessState;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "observeAsyncs", "", "onDoneClick", "Lkotlinx/coroutines/Job;", "completeSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SuccessViewModel extends FinancialConnectionsViewModel<SuccessState> {
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final Logger logger;
    private final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    private final SuccessContentRepository successContentRepository;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.SUCCESS;

    /* compiled from: SuccessViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/success/SuccessState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        SuccessViewModel create(SuccessState initialState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public SuccessViewModel(@Assisted SuccessState initialState, GetCachedAccounts getCachedAccounts, GetOrFetchSync getOrFetchSync, SuccessContentRepository successContentRepository, FinancialConnectionsAnalyticsTracker eventTracker, Logger logger, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(getCachedAccounts, "getCachedAccounts");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(successContentRepository, "successContentRepository");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        this.successContentRepository = successContentRepository;
        this.eventTracker = eventTracker;
        this.logger = logger;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        observeAsyncs();
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(getOrFetchSync, getCachedAccounts, this, null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.success.SuccessViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SuccessViewModel._init_$lambda$0((SuccessState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* compiled from: SuccessViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$1", f = "SuccessViewModel.kt", i = {1}, l = {46, 47}, m = "invokeSuspend", n = {"manifest"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.success.SuccessViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super SuccessState.Payload>, Object> {
        final /* synthetic */ GetCachedAccounts $getCachedAccounts;
        final /* synthetic */ GetOrFetchSync $getOrFetchSync;
        Object L$0;
        int label;
        final /* synthetic */ SuccessViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GetOrFetchSync getOrFetchSync, GetCachedAccounts getCachedAccounts, SuccessViewModel successViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$getOrFetchSync = getOrFetchSync;
            this.$getCachedAccounts = getCachedAccounts;
            this.this$0 = successViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$getOrFetchSync, this.$getCachedAccounts, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super SuccessState.Payload> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            List list;
            SuccessContentRepository.State state;
            String str;
            TextResource.StringId stringId;
            TextResource.PluralId pluralId;
            String businessName;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = GetOrFetchSync.invoke$default(this.$getOrFetchSync, null, false, this, 3, null);
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
                list = (List) obj;
                state = this.this$0.successContentRepository.get();
                str = null;
                if (state != null || (stringId = state.getHeading()) == null) {
                    stringId = new TextResource.StringId(R.string.stripe_success_pane_title, null, 2, null);
                }
                if (state != null || (pluralId = state.getMessage()) == null) {
                    pluralId = new TextResource.PluralId(R.string.stripe_success_pane_desc_singular, R.string.stripe_success_pane_desc_plural, list.size(), null, 8, null);
                }
                Boolean skipSuccessPane = financialConnectionsSessionManifest.getSkipSuccessPane();
                boolean zBooleanValue = skipSuccessPane == null ? skipSuccessPane.booleanValue() : false;
                businessName = financialConnectionsSessionManifest.getBusinessName();
                if (businessName != null && ManifestExtensionsKt.useContinueWithMerchantText(financialConnectionsSessionManifest)) {
                    str = businessName;
                }
                return new SuccessState.Payload(str, stringId, pluralId, zBooleanValue);
            }
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) obj).getManifest();
            this.L$0 = manifest;
            this.label = 2;
            Object objInvoke = this.$getCachedAccounts.invoke(this);
            if (objInvoke != coroutine_suspended) {
                financialConnectionsSessionManifest = manifest;
                obj = objInvoke;
                list = (List) obj;
                state = this.this$0.successContentRepository.get();
                str = null;
                if (state != null) {
                    stringId = new TextResource.StringId(R.string.stripe_success_pane_title, null, 2, null);
                }
                if (state != null) {
                    pluralId = new TextResource.PluralId(R.string.stripe_success_pane_desc_singular, R.string.stripe_success_pane_desc_plural, list.size(), null, 8, null);
                }
                Boolean skipSuccessPane2 = financialConnectionsSessionManifest.getSkipSuccessPane();
                if (skipSuccessPane2 == null) {
                }
                businessName = financialConnectionsSessionManifest.getBusinessName();
                if (businessName != null) {
                    str = businessName;
                }
                return new SuccessState.Payload(str, stringId, pluralId, zBooleanValue);
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SuccessState _init_$lambda$0(SuccessState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return SuccessState.copy$default(execute, it, null, 2, null);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(SuccessState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TopAppBarStateUpdate(PANE, false, MavericksExtensionsKt.getError(state.getPayload()), true, null, false, 48, null);
    }

    /* compiled from: SuccessViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$observeAsyncs$3", f = "SuccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.success.SuccessViewModel$observeAsyncs$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = SuccessViewModel.this.new AnonymousClass3(continuation);
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
                SuccessViewModel.this.logger.error("Error retrieving payload", (Throwable) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void observeAsyncs() {
        onAsync(new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.success.SuccessViewModel.observeAsyncs.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SuccessState) obj).getPayload();
            }
        }, new AnonymousClass2(null), new AnonymousClass3(null));
    }

    /* compiled from: SuccessViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$observeAsyncs$2", f = "SuccessViewModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.success.SuccessViewModel$observeAsyncs$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<SuccessState.Payload, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = SuccessViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SuccessState.Payload payload, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!((SuccessState.Payload) this.L$0).getSkipSuccessPane()) {
                    SuccessViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(SuccessViewModel.PANE));
                } else {
                    this.label = 1;
                    if (SuccessViewModel.this.completeSession(this) == coroutine_suspended) {
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

    /* compiled from: SuccessViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$onDoneClick$1", f = "SuccessViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.success.SuccessViewModel$onDoneClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C09721(Continuation<? super C09721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SuccessViewModel.this.new C09721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SuccessViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.ClickDone(SuccessViewModel.PANE));
                SuccessViewModel.this.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.success.SuccessViewModel$onDoneClick$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SuccessViewModel.C09721.invokeSuspend$lambda$0((SuccessState) obj2);
                    }
                });
                this.label = 1;
                if (SuccessViewModel.this.completeSession(this) == coroutine_suspended) {
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
        public static final SuccessState invokeSuspend$lambda$0(SuccessState successState) {
            return SuccessState.copy$default(successState, null, new Async.Loading(null, 1, null), 1, null);
        }
    }

    public final Job onDoneClick() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09721(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object completeSession(Continuation<? super Unit> continuation) {
        Object objEmit = this.nativeAuthFlowCoordinator.invoke().emit(new NativeAuthFlowCoordinator.Message.Complete(null, 1, null), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* compiled from: SuccessViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SuccessViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getSuccessViewModelFactory().create(new SuccessState(null, null, 3, null));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(SuccessViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.success.SuccessViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SuccessViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
