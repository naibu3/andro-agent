package com.stripe.android.financialconnections.features.notice;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
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

/* compiled from: NoticeSheetViewModel.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0017\u001a\u00020\u000fJ\b\u0010\u0018\u001a\u00020\u000fH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "noticeSheetContentRepository", "Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;", "handleClickableUrl", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;", "<init>", "(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;)V", "loadNoticeSheetContent", "", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "handleClickableTextClick", ShareConstants.MEDIA_URI, "", "handleConfirmModalClick", "onViewEffectLaunched", "onCleared", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NoticeSheetViewModel extends FinancialConnectionsViewModel<NoticeSheetState> {
    private final HandleClickableUrl handleClickableUrl;
    private final NavigationManager navigationManager;
    private final NoticeSheetContentRepository noticeSheetContentRepository;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NoticeSheetViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        NoticeSheetViewModel create(NoticeSheetState initialState);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(NoticeSheetState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public NoticeSheetViewModel(@Assisted NoticeSheetState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, NavigationManager navigationManager, NoticeSheetContentRepository noticeSheetContentRepository, HandleClickableUrl handleClickableUrl) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(noticeSheetContentRepository, "noticeSheetContentRepository");
        Intrinsics.checkNotNullParameter(handleClickableUrl, "handleClickableUrl");
        this.navigationManager = navigationManager;
        this.noticeSheetContentRepository = noticeSheetContentRepository;
        this.handleClickableUrl = handleClickableUrl;
        loadNoticeSheetContent();
    }

    /* compiled from: NoticeSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$loadNoticeSheetContent$1", f = "NoticeSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$loadNoticeSheetContent$1, reason: invalid class name and case insensitive filesystem */
    static final class C09491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C09491(Continuation<? super C09491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NoticeSheetViewModel.this.new C09491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                NoticeSheetContentRepository.State state = NoticeSheetViewModel.this.noticeSheetContentRepository.get();
                final NoticeSheetState.NoticeSheetContent content = state != null ? state.getContent() : null;
                if (content != null) {
                    NoticeSheetViewModel.this.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$loadNoticeSheetContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return NoticeSheetViewModel.C09491.invokeSuspend$lambda$0(content, (NoticeSheetState) obj2);
                        }
                    });
                } else {
                    NoticeSheetViewModel.this.navigationManager.tryNavigateBack();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NoticeSheetState invokeSuspend$lambda$0(NoticeSheetState.NoticeSheetContent noticeSheetContent, NoticeSheetState noticeSheetState) {
            return NoticeSheetState.copy$default(noticeSheetState, null, noticeSheetContent, null, 5, null);
        }
    }

    private final void loadNoticeSheetContent() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09491(null), 3, null);
    }

    /* compiled from: NoticeSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$handleClickableTextClick$1", f = "NoticeSheetViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$handleClickableTextClick$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$uri = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NoticeSheetViewModel.this.new AnonymousClass1(this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Date date = new Date();
                FinancialConnectionsSessionManifest.Pane pane = NoticeSheetViewModel.this.getStateFlow().getValue().getPane();
                HandleClickableUrl handleClickableUrl = NoticeSheetViewModel.this.handleClickableUrl;
                final String str = this.$uri;
                final NoticeSheetViewModel noticeSheetViewModel = NoticeSheetViewModel.this;
                this.label = 1;
                if (handleClickableUrl.invoke(pane, str, new Function1() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$handleClickableTextClick$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return NoticeSheetViewModel.AnonymousClass1.invokeSuspend$lambda$1(noticeSheetViewModel, str, date, (String) obj2);
                    }
                }, MapsKt.emptyMap(), this) == coroutine_suspended) {
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
        public static final Unit invokeSuspend$lambda$1(NoticeSheetViewModel noticeSheetViewModel, final String str, final Date date, String str2) {
            noticeSheetViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$handleClickableTextClick$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NoticeSheetViewModel.AnonymousClass1.invokeSuspend$lambda$1$lambda$0(str, date, (NoticeSheetState) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NoticeSheetState invokeSuspend$lambda$1$lambda$0(String str, Date date, NoticeSheetState noticeSheetState) {
            return NoticeSheetState.copy$default(noticeSheetState, null, null, new NoticeSheetState.ViewEffect.OpenUrl(str, date.getTime()), 3, null);
        }
    }

    public final void handleClickableTextClick(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(uri, null), 3, null);
    }

    public final void handleConfirmModalClick() {
        this.navigationManager.tryNavigateBack();
    }

    public final void onViewEffectLaunched() {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NoticeSheetViewModel.onViewEffectLaunched$lambda$0((NoticeSheetState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NoticeSheetState onViewEffectLaunched$lambda$0(NoticeSheetState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return NoticeSheetState.copy$default(setState, null, null, null, 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        this.noticeSheetContentRepository.clear();
        super.onCleared();
    }

    /* compiled from: NoticeSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "arguments", "Landroid/os/Bundle;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NoticeSheetViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, Bundle bundle, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getNoticeSheetViewModelFactory().create(new NoticeSheetState(bundle));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent, final Bundle arguments) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(NoticeSheetViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NoticeSheetViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, arguments, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
