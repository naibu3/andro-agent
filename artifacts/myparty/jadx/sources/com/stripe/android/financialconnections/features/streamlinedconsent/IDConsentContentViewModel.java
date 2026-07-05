package com.stripe.android.financialconnections.features.streamlinedconsent;

import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.consent.ConsentClickableText;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.IDConsentContentPane;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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

/* compiled from: IDConsentContentViewModel.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fBK\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0018J\b\u0010\u001d\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "acceptConsent", "Lcom/stripe/android/financialconnections/domain/AcceptConsent;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "handleClickableUrl", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;", "presentSheet", "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;", "<init>", "(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;)V", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "onContinueClick", "", "onClickableTextClick", ShareConstants.MEDIA_URI, "", "onViewEffectLaunched", "presentLegalDetailsBottomSheet", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IDConsentContentViewModel extends FinancialConnectionsViewModel<IDConsentContentState> {
    private final AcceptConsent acceptConsent;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetOrFetchSync getOrFetchSync;
    private final HandleClickableUrl handleClickableUrl;
    private final NavigationManager navigationManager;
    private final PresentSheet presentSheet;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.ID_CONSENT_CONTENT;

    /* compiled from: IDConsentContentViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        IDConsentContentViewModel create(IDConsentContentState initialState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public IDConsentContentViewModel(@Assisted IDConsentContentState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, AcceptConsent acceptConsent, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, FinancialConnectionsAnalyticsTracker eventTracker, HandleClickableUrl handleClickableUrl, PresentSheet presentSheet) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(acceptConsent, "acceptConsent");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(handleClickableUrl, "handleClickableUrl");
        Intrinsics.checkNotNullParameter(presentSheet, "presentSheet");
        this.acceptConsent = acceptConsent;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManager;
        this.eventTracker = eventTracker;
        this.handleClickableUrl = handleClickableUrl;
        this.presentSheet = presentSheet;
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IDConsentContentViewModel._init_$lambda$0((IDConsentContentState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* compiled from: IDConsentContentViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$1", f = "IDConsentContentViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super IDConsentContentState.Payload>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return IDConsentContentViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super IDConsentContentState.Payload> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = GetOrFetchSync.invoke$default(IDConsentContentViewModel.this.getOrFetchSync, null, false, this, 3, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TextUpdate text = ((SynchronizeSessionResponse) obj).getText();
            Intrinsics.checkNotNull(text);
            IDConsentContentPane idConsentContentPane = text.getIdConsentContentPane();
            Intrinsics.checkNotNull(idConsentContentPane);
            return new IDConsentContentState.Payload(idConsentContentPane);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IDConsentContentState _init_$lambda$0(IDConsentContentState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return IDConsentContentState.copy$default(execute, it, null, null, 6, null);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(IDConsentContentState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TopAppBarStateUpdate(PANE, false, MavericksExtensionsKt.getError(state.getPayload()), false, false, false, 40, null);
    }

    /* compiled from: IDConsentContentViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$onContinueClick$1", f = "IDConsentContentViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$onContinueClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09681 extends SuspendLambda implements Function1<Continuation<? super FinancialConnectionsSessionManifest>, Object> {
        int label;

        C09681(Continuation<? super C09681> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return IDConsentContentViewModel.this.new C09681(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super FinancialConnectionsSessionManifest> continuation) {
            return ((C09681) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IDConsentContentViewModel.this.eventTracker.track(FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE);
                this.label = 1;
                obj = IDConsentContentViewModel.this.acceptConsent.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj;
            FinancialConnections.m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections.INSTANCE, FinancialConnectionsEvent.Name.CONSENT_ACQUIRED, null, 2, null);
            NavigationManager.DefaultImpls.tryNavigateTo$default(IDConsentContentViewModel.this.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(financialConnectionsSessionManifest.getNextPane()), IDConsentContentViewModel.PANE, null, 2, null), null, false, 6, null);
            return financialConnectionsSessionManifest;
        }
    }

    public final void onContinueClick() {
        FinancialConnectionsViewModel.execute$default(this, new C09681(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IDConsentContentViewModel.onContinueClick$lambda$1((IDConsentContentState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IDConsentContentState onContinueClick$lambda$1(IDConsentContentState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return IDConsentContentState.copy$default(execute, null, it, null, 5, null);
    }

    /* compiled from: IDConsentContentViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$onClickableTextClick$1", f = "IDConsentContentViewModel.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$onClickableTextClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09671(String str, Continuation<? super C09671> continuation) {
            super(2, continuation);
            this.$uri = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IDConsentContentViewModel.this.new C09671(this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HandleClickableUrl handleClickableUrl = IDConsentContentViewModel.this.handleClickableUrl;
                FinancialConnectionsSessionManifest.Pane pane = IDConsentContentViewModel.PANE;
                final String str = this.$uri;
                final IDConsentContentViewModel iDConsentContentViewModel = IDConsentContentViewModel.this;
                this.label = 1;
                if (handleClickableUrl.invoke(pane, str, new Function1() { // from class: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$onClickableTextClick$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return IDConsentContentViewModel.C09671.invokeSuspend$lambda$1(iDConsentContentViewModel, str, (String) obj2);
                    }
                }, MapsKt.mapOf(TuplesKt.to(ConsentClickableText.LEGAL_DETAILS.getValue(), new AnonymousClass2(IDConsentContentViewModel.this, null))), this) == coroutine_suspended) {
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
        public static final Unit invokeSuspend$lambda$1(IDConsentContentViewModel iDConsentContentViewModel, final String str, String str2) {
            iDConsentContentViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$onClickableTextClick$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IDConsentContentViewModel.C09671.invokeSuspend$lambda$1$lambda$0(str, (IDConsentContentState) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IDConsentContentState invokeSuspend$lambda$1$lambda$0(String str, IDConsentContentState iDConsentContentState) {
            return IDConsentContentState.copy$default(iDConsentContentState, null, null, new IDConsentContentState.ViewEffect.OpenUrl(str), 3, null);
        }

        /* compiled from: IDConsentContentViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$onClickableTextClick$1$2", f = "IDConsentContentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$onClickableTextClick$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<HandleClickableUrl.DeeplinkPayload, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ IDConsentContentViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(IDConsentContentViewModel iDConsentContentViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = iDConsentContentViewModel;
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
                    this.this$0.presentLegalDetailsBottomSheet();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onClickableTextClick(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09671(uri, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IDConsentContentState onViewEffectLaunched$lambda$2(IDConsentContentState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return IDConsentContentState.copy$default(setState, null, null, null, 3, null);
    }

    public final void onViewEffectLaunched() {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IDConsentContentViewModel.onViewEffectLaunched$lambda$2((IDConsentContentState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentLegalDetailsBottomSheet() {
        IDConsentContentViewModelKt.withPayload(this, new Function1() { // from class: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IDConsentContentViewModel.presentLegalDetailsBottomSheet$lambda$3(this.f$0, (IDConsentContentState.Payload) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit presentLegalDetailsBottomSheet$lambda$3(IDConsentContentViewModel iDConsentContentViewModel, IDConsentContentState.Payload it) {
        Intrinsics.checkNotNullParameter(it, "it");
        iDConsentContentViewModel.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.Legal(it.getIdConsentContentPane().getLegalDetailsNotice()), PANE);
        return Unit.INSTANCE;
    }

    /* compiled from: IDConsentContentViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Companion;", "", "<init>", "()V", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IDConsentContentViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getIdConsentContentViewModelFactory().create(new IDConsentContentState(null, null, null, 7, null));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(IDConsentContentViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IDConsentContentViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
