package com.stripe.android.financialconnections.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.browser.BrowserManager;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationKt;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewEffect;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.components.BottomSheetKt;
import com.stripe.android.financialconnections.ui.components.ScaffoldKt;
import com.stripe.android.financialconnections.ui.components.TopAppBarKt;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.android.uicore.navigation.KeyboardController;
import com.stripe.android.uicore.navigation.KeyboardControllerKt;
import com.stripe.android.uicore.navigation.NavBackStackEntryUpdate;
import com.stripe.android.uicore.navigation.NavigationEffectsKt;
import com.stripe.android.uicore.navigation.NavigationIntent;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: FinancialConnectionsSheetNativeActivity.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0001\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020%H\u0002J\u001d\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.H\u0014J\b\u0010/\u001a\u00020\u001fH\u0014J\b\u00100\u001a\u00020\u001fH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00062²\u0006\n\u00103\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewModel", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "getViewModel", "()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "visibilityObserver", "Lcom/stripe/android/financialconnections/ui/ActivityVisibilityObserver;", "logger", "Lcom/stripe/android/core/Logger;", "getLogger", "()Lcom/stripe/android/core/Logger;", "setLogger", "(Lcom/stripe/android/core/Logger;)V", "imageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "getImageLoader", "()Lcom/stripe/android/uicore/image/StripeImageLoader;", "setImageLoader", "(Lcom/stripe/android/uicore/image/StripeImageLoader;)V", "browserManager", "Lcom/stripe/android/financialconnections/browser/BrowserManager;", "getBrowserManager", "()Lcom/stripe/android/financialconnections/browser/BrowserManager;", "setBrowserManager", "(Lcom/stripe/android/financialconnections/browser/BrowserManager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "observeBackPress", "observeBackgroundEvents", "observeViewEffects", "Lkotlinx/coroutines/Job;", "NavHost", "initialPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "testMode", "", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLandroidx/compose/runtime/Composer;I)V", "onNewIntent", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "onResume", "onDestroy", "Companion", "financial-connections_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "topAppBarState", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeActivity extends AppCompatActivity {
    private static final String EXTRA_ARGS = "FinancialConnectionsSheetNativeActivityArgs";
    public static final String EXTRA_RESULT = "result";

    @Inject
    public BrowserManager browserManager;

    @Inject
    public StripeImageLoader imageLoader;

    @Inject
    public Logger logger;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    private ActivityVisibilityObserver visibilityObserver;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHost$lambda$9(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, FinancialConnectionsSessionManifest.Pane pane, boolean z, int i, Composer composer, int i2) {
        financialConnectionsSheetNativeActivity.NavHost(pane, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public FinancialConnectionsSheetNativeActivity() {
        final FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(FinancialConnectionsSheetNativeViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return financialConnectionsSheetNativeActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinancialConnectionsSheetNativeActivity.viewModel_delegate$lambda$0();
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? financialConnectionsSheetNativeActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    public final FinancialConnectionsSheetNativeViewModel getViewModel() {
        return (FinancialConnectionsSheetNativeViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$0() {
        return FinancialConnectionsSheetNativeViewModel.INSTANCE.getFactory();
    }

    public final Logger getLogger() {
        Logger logger = this.logger;
        if (logger != null) {
            return logger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logger");
        return null;
    }

    public final void setLogger(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "<set-?>");
        this.logger = logger;
    }

    public final StripeImageLoader getImageLoader() {
        StripeImageLoader stripeImageLoader = this.imageLoader;
        if (stripeImageLoader != null) {
            return stripeImageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(StripeImageLoader stripeImageLoader) {
        Intrinsics.checkNotNullParameter(stripeImageLoader, "<set-?>");
        this.imageLoader = stripeImageLoader;
    }

    public final BrowserManager getBrowserManager() {
        BrowserManager browserManager = this.browserManager;
        if (browserManager != null) {
            return browserManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("browserManager");
        return null;
    }

    public final void setBrowserManager(BrowserManager browserManager) {
        Intrinsics.checkNotNullParameter(browserManager, "<set-?>");
        this.browserManager = browserManager;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        final FinancialConnectionsSheetNativeActivityArgs args = companion.getArgs(intent);
        if (args == null) {
            finish();
            return;
        }
        getViewModel().getActivityRetainedComponent().inject(this);
        observeBackPress();
        observeBackgroundEvents();
        observeViewEffects();
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-32931369, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-32931369, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.onCreate.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:95)");
                    }
                    Theme theme = FinancialConnectionsSheetNativeActivityKt.getTheme(args);
                    final FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this;
                    ThemeKt.FinancialConnectionsTheme(theme, ComposableLambdaKt.rememberComposableLambda(1887094632, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1887094632, i2, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.onCreate.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:96)");
                                }
                                final State stateCollectAsState = StateFlowsComposeKt.collectAsState(financialConnectionsSheetNativeActivity.getViewModel().getStateFlow(), null, composer2, 0, 1);
                                StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(ModalBottomSheetValue.Expanded, null, composer2, 6, 2);
                                FinancialConnectionsSheetNativeViewModel viewModel = financialConnectionsSheetNativeActivity.getViewModel();
                                composer2.startReplaceGroup(44086609);
                                boolean zChangedInstance = composer2.changedInstance(viewModel);
                                FinancialConnectionsSheetNativeActivity$onCreate$1$1$1$1 financialConnectionsSheetNativeActivity$onCreate$1$1$1$1RememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || financialConnectionsSheetNativeActivity$onCreate$1$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                    financialConnectionsSheetNativeActivity$onCreate$1$1$1$1RememberedValue = new FinancialConnectionsSheetNativeActivity$onCreate$1$1$1$1(viewModel);
                                    composer2.updateRememberedValue(financialConnectionsSheetNativeActivity$onCreate$1$1$1$1RememberedValue);
                                }
                                composer2.endReplaceGroup();
                                final FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity2 = financialConnectionsSheetNativeActivity;
                                BottomSheetKt.FinancialConnectionsBottomSheetLayout(stripeBottomSheetStateRememberStripeBottomSheetState, null, (Function0) ((KFunction) financialConnectionsSheetNativeActivity$onCreate$1$1$1$1RememberedValue), ComposableLambdaKt.rememberComposableLambda(1681319268, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.onCreate.1.1.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i3) {
                                        if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1681319268, i3, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:105)");
                                            }
                                            financialConnectionsSheetNativeActivity2.NavHost(C01621.invoke$lambda$0(stateCollectAsState).getInitialPane(), C01621.invoke$lambda$0(stateCollectAsState).getTestMode(), composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composer2, 54), composer2, StripeBottomSheetState.$stable | 3072, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final FinancialConnectionsSheetNativeState invoke$lambda$0(State<FinancialConnectionsSheetNativeState> state) {
                            return state.getValue();
                        }
                    }, composer, 54), composer, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 1, null);
    }

    private final void observeBackPress() {
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetNativeActivity.observeBackPress$lambda$1(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeBackPress$lambda$1(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        financialConnectionsSheetNativeActivity.getViewModel().onBackPressed();
        return Unit.INSTANCE;
    }

    /* compiled from: FinancialConnectionsSheetNativeActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeBackgroundEvents$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass1(Object obj) {
            super(0, obj, FinancialConnectionsSheetNativeViewModel.class, "onBackgrounded", "onBackgrounded()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((FinancialConnectionsSheetNativeViewModel) this.receiver).onBackgrounded();
        }
    }

    private final void observeBackgroundEvents() {
        ActivityVisibilityObserver activityVisibilityObserver = new ActivityVisibilityObserver(new AnonymousClass1(getViewModel()), new C10152(getViewModel()));
        getLifecycle().addObserver(activityVisibilityObserver);
        this.visibilityObserver = activityVisibilityObserver;
    }

    /* compiled from: FinancialConnectionsSheetNativeActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeBackgroundEvents$2, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C10152 extends FunctionReferenceImpl implements Function0<Unit> {
        C10152(Object obj) {
            super(0, obj, FinancialConnectionsSheetNativeViewModel.class, "onForegrounded", "onForegrounded()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((FinancialConnectionsSheetNativeViewModel) this.receiver).onForegrounded();
        }
    }

    /* compiled from: FinancialConnectionsSheetNativeActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeViewEffects$1", f = "FinancialConnectionsSheetNativeActivity.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeViewEffects$1, reason: invalid class name and case insensitive filesystem */
    static final class C10161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C10161(Continuation<? super C10161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetNativeActivity.this.new C10161(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FinancialConnectionsSheetNativeActivity.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1", f = "FinancialConnectionsSheetNativeActivity.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01611(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, Continuation<? super C01611> continuation) {
                super(2, continuation);
                this.this$0 = financialConnectionsSheetNativeActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01611(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<FinancialConnectionsSheetNativeState> stateFlow = this.this$0.getViewModel().getStateFlow();
                    Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.distinctUntilChanged(new Flow<FinancialConnectionsSheetNativeViewEffect>() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @DebugMetadata(c = "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2", f = "FinancialConnectionsSheetNativeActivity.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                            /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label -= Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = anonymousClass1.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    FinancialConnectionsSheetNativeViewEffect viewEffect = ((FinancialConnectionsSheetNativeState) obj).getViewEffect();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(viewEffect, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super FinancialConnectionsSheetNativeViewEffect> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }));
                    final FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
                    this.label = 1;
                    if (flowFilterNotNull.collect(new FlowCollector() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.observeViewEffects.1.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((FinancialConnectionsSheetNativeViewEffect) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect, Continuation<? super Unit> continuation) {
                            if (financialConnectionsSheetNativeViewEffect instanceof FinancialConnectionsSheetNativeViewEffect.OpenUrl) {
                                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity2 = financialConnectionsSheetNativeActivity;
                                BrowserManager browserManager = financialConnectionsSheetNativeActivity2.getBrowserManager();
                                Uri uri = Uri.parse(((FinancialConnectionsSheetNativeViewEffect.OpenUrl) financialConnectionsSheetNativeViewEffect).getUrl());
                                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                                financialConnectionsSheetNativeActivity2.startActivity(browserManager.createBrowserIntentForUrl(uri));
                            } else {
                                if (!(financialConnectionsSheetNativeViewEffect instanceof FinancialConnectionsSheetNativeViewEffect.Finish)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                financialConnectionsSheetNativeActivity.setResult(-1, new Intent().putExtra(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, ((FinancialConnectionsSheetNativeViewEffect.Finish) financialConnectionsSheetNativeViewEffect).getResult()));
                                financialConnectionsSheetNativeActivity.finish();
                            }
                            financialConnectionsSheetNativeActivity.getViewModel().onViewEffectLaunched();
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(FinancialConnectionsSheetNativeActivity.this, Lifecycle.State.STARTED, new C01611(FinancialConnectionsSheetNativeActivity.this, null), this) == coroutine_suspended) {
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

    private final Job observeViewEffects() {
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C10161(null), 3, null);
    }

    public final void NavHost(final FinancialConnectionsSessionManifest.Pane initialPane, final boolean z, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(initialPane, "initialPane");
        Composer composerStartRestartGroup = composer.startRestartGroup(915147200);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(initialPane) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(915147200, i2, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost (FinancialConnectionsSheetNativeActivity.kt:156)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(1511313700);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CustomTabUriHandler(context, getBrowserManager());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CustomTabUriHandler customTabUriHandler = (CustomTabUriHandler) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1511316604);
            boolean z2 = (i2 & 14) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = DestinationMappersKt.getDestination(initialPane);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Destination destination = (Destination) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(getViewModel().getTopAppBarState(), null, composerStartRestartGroup, 0, 1);
            ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, true, composerStartRestartGroup, 3078, 6);
            composerStartRestartGroup.startReplaceGroup(1511326296);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new BottomSheetNavigator(modalBottomSheetStateRememberModalBottomSheetState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            BottomSheetNavigator bottomSheetNavigator = (BottomSheetNavigator) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[]{bottomSheetNavigator}, composerStartRestartGroup, 0);
            KeyboardController keyboardControllerRememberKeyboardController = KeyboardControllerKt.rememberKeyboardController(composerStartRestartGroup, 0);
            SharedFlow<NavigationIntent> navigationFlow = getViewModel().getNavigationFlow();
            composerStartRestartGroup.startReplaceGroup(1511335043);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FinancialConnectionsSheetNativeActivity.NavHost$lambda$8$lambda$7(this.f$0, (NavBackStackEntryUpdate) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            NavigationEffectsKt.NavigationEffects(navigationFlow, navHostControllerRememberNavController, keyboardControllerRememberKeyboardController, null, (Function1) objRememberedValue4, composerStartRestartGroup, KeyboardController.$stable << 6, 8);
            composerStartRestartGroup = composerStartRestartGroup;
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{FinancialConnectionsSheetNativeActivityKt.getLocalTestMode().provides(Boolean.valueOf(z)), FinancialConnectionsSheetNativeActivityKt.getLocalNavHostController().provides(navHostControllerRememberNavController), FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader().provides(getImageLoader()), CompositionLocalsKt.getLocalUriHandler().provides(customTabUriHandler), FinancialConnectionsSheetNativeActivityKt.getLocalTopAppBarHost().provides(getViewModel())}, ComposableLambdaKt.rememberComposableLambda(-789697280, true, new AnonymousClass2(navHostControllerRememberNavController, bottomSheetNavigator, stateCollectAsState, destination), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FinancialConnectionsSheetNativeActivity.NavHost$lambda$9(this.f$0, initialPane, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHost$lambda$8$lambda$7(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, NavBackStackEntryUpdate backStackEntryUpdate) {
        NavDestination destination;
        Intrinsics.checkNotNullParameter(backStackEntryUpdate, "backStackEntryUpdate");
        NavBackStackEntry currentBackStackEntry = backStackEntryUpdate.getCurrentBackStackEntry();
        FinancialConnectionsSessionManifest.Pane pane = (currentBackStackEntry == null || (destination = currentBackStackEntry.getDestination()) == null) ? null : DestinationMappersKt.getPane(destination);
        if (pane != null) {
            financialConnectionsSheetNativeActivity.getViewModel().handlePaneChanged(pane);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FinancialConnectionsSheetNativeActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$2, reason: invalid class name */
    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ BottomSheetNavigator $bottomSheetNavigator;
        final /* synthetic */ Destination $initialDestination;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ State<TopAppBarState> $topAppBarState$delegate;

        AnonymousClass2(NavHostController navHostController, BottomSheetNavigator bottomSheetNavigator, State<TopAppBarState> state, Destination destination) {
            this.$navController = navHostController;
            this.$bottomSheetNavigator = bottomSheetNavigator;
            this.$topAppBarState$delegate = state;
            this.$initialDestination = destination;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-789697280, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:185)");
            }
            composer.startReplaceGroup(1974805113);
            boolean zChangedInstance = composer.changedInstance(FinancialConnectionsSheetNativeActivity.this) | composer.changedInstance(this.$navController);
            final FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = FinancialConnectionsSheetNativeActivity.this;
            final NavHostController navHostController = this.$navController;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinancialConnectionsSheetNativeActivity.AnonymousClass2.invoke$lambda$1$lambda$0(financialConnectionsSheetNativeActivity, navHostController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BackHandlerKt.BackHandler(true, (Function0) objRememberedValue, composer, 6, 0);
            BottomSheetNavigator bottomSheetNavigator = this.$bottomSheetNavigator;
            final FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity2 = FinancialConnectionsSheetNativeActivity.this;
            final State<TopAppBarState> state = this.$topAppBarState$delegate;
            final NavHostController navHostController2 = this.$navController;
            final Destination destination = this.$initialDestination;
            BottomSheetKt.FinancialConnectionsModalBottomSheetLayout(bottomSheetNavigator, ComposableLambdaKt.rememberComposableLambda(712780309, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.2.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(712780309, i2, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:192)");
                        }
                        final FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity3 = financialConnectionsSheetNativeActivity2;
                        final State<TopAppBarState> state2 = state;
                        ScaffoldKt.FinancialConnectionsScaffold(ComposableLambdaKt.rememberComposableLambda(1045885766, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.2.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1045885766, i3, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:194)");
                                    }
                                    TopAppBarState topAppBarStateNavHost$lambda$5 = FinancialConnectionsSheetNativeActivity.NavHost$lambda$5(state2);
                                    FinancialConnectionsSheetNativeViewModel viewModel = financialConnectionsSheetNativeActivity3.getViewModel();
                                    composer3.startReplaceGroup(-2017278875);
                                    boolean zChangedInstance2 = composer3.changedInstance(viewModel);
                                    FinancialConnectionsSheetNativeActivity$NavHost$2$2$1$1$1 financialConnectionsSheetNativeActivity$NavHost$2$2$1$1$1RememberedValue = composer3.rememberedValue();
                                    if (zChangedInstance2 || financialConnectionsSheetNativeActivity$NavHost$2$2$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                        financialConnectionsSheetNativeActivity$NavHost$2$2$1$1$1RememberedValue = new FinancialConnectionsSheetNativeActivity$NavHost$2$2$1$1$1(viewModel);
                                        composer3.updateRememberedValue(financialConnectionsSheetNativeActivity$NavHost$2$2$1$1$1RememberedValue);
                                    }
                                    composer3.endReplaceGroup();
                                    TopAppBarKt.FinancialConnectionsTopAppBar(topAppBarStateNavHost$lambda$5, (Function0) ((KFunction) financialConnectionsSheetNativeActivity$NavHost$2$2$1$1$1RememberedValue), composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(1178447874, true, new C01602(navHostController2, destination), composer2, 54), composer2, 54);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* compiled from: FinancialConnectionsSheetNativeActivity.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$2$2$2, reason: invalid class name and collision with other inner class name */
                static final class C01602 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ Destination $initialDestination;
                    final /* synthetic */ NavHostController $navController;

                    C01602(NavHostController navHostController, Destination destination) {
                        this.$navController = navHostController;
                        this.$initialDestination = destination;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues it, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i & 17) != 16 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1178447874, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:200)");
                            }
                            NavHostController navHostController = this.$navController;
                            String fullRoute = this.$initialDestination.getFullRoute();
                            composer.startReplaceGroup(-2017268472);
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$2$2$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return FinancialConnectionsSheetNativeActivity.AnonymousClass2.C01592.C01602.invoke$lambda$1$lambda$0((NavGraphBuilder) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            NavHostKt.NavHost(navHostController, fullRoute, null, null, null, null, null, null, null, null, (Function1) objRememberedValue, composer, 0, 6, PointerIconCompat.TYPE_GRAB);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(NavGraphBuilder NavHost) {
                        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                        DestinationKt.composable$default(NavHost, Destination.Consent.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.IDConsentContent.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.ManualEntry.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.PartnerAuth.INSTANCE, null, 2, null);
                        DestinationKt.bottomSheet$default(NavHost, Destination.PartnerAuthDrawer.INSTANCE, null, 2, null);
                        DestinationKt.bottomSheet$default(NavHost, Destination.Exit.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.InstitutionPicker.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.AccountPicker.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.Success.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.Reset.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.Error.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.AttachLinkedPaymentAccount.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.NetworkingLinkSignup.INSTANCE, null, 2, null);
                        DestinationKt.bottomSheet$default(NavHost, Destination.NetworkingLinkLoginWarmup.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.NetworkingLinkVerification.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.NetworkingSaveToLinkVerification.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.LinkAccountPicker.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.BankAuthRepair.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.LinkStepUpVerification.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.ManualEntrySuccess.INSTANCE, null, 2, null);
                        DestinationKt.bottomSheet$default(NavHost, Destination.Notice.INSTANCE, null, 2, null);
                        DestinationKt.bottomSheet$default(NavHost, Destination.AccountUpdateRequired.INSTANCE, null, 2, null);
                        DestinationKt.composable$default(NavHost, Destination.LinkLogin.INSTANCE, null, 2, null);
                        return Unit.INSTANCE;
                    }
                }
            }, composer, 54), composer, ModalBottomSheetState.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, NavHostController navHostController) {
            FinancialConnectionsSheetNativeViewModel viewModel = financialConnectionsSheetNativeActivity.getViewModel();
            NavDestination currentDestination = navHostController.getCurrentDestination();
            viewModel.onBackClick(currentDestination != null ? DestinationMappersKt.getPane(currentDestination) : null);
            if (!navHostController.popBackStack()) {
                financialConnectionsSheetNativeActivity.getViewModel().onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        getViewModel().handleOnNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        getViewModel().onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        ActivityVisibilityObserver activityVisibilityObserver = this.visibilityObserver;
        if (activityVisibilityObserver != null) {
            getLifecycle().removeObserver(activityVisibilityObserver);
        }
        super.onDestroy();
    }

    /* compiled from: FinancialConnectionsSheetNativeActivity.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$Companion;", "", "<init>", "()V", "EXTRA_RESULT", "", "EXTRA_ARGS", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "context", "Landroid/content/Context;", CardScanActivity.ARGS, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;", "getArgs", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent intent(Context context, FinancialConnectionsSheetNativeActivityArgs args) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(args, "args");
            Intent intent = new Intent(context, (Class<?>) FinancialConnectionsSheetNativeActivity.class);
            intent.putExtra(FinancialConnectionsSheetNativeActivity.EXTRA_ARGS, args);
            return intent;
        }

        public final FinancialConnectionsSheetNativeActivityArgs getArgs(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return (FinancialConnectionsSheetNativeActivityArgs) savedStateHandle.get(FinancialConnectionsSheetNativeActivity.EXTRA_ARGS);
        }

        public final FinancialConnectionsSheetNativeActivityArgs getArgs(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return (FinancialConnectionsSheetNativeActivityArgs) intent.getParcelableExtra(FinancialConnectionsSheetNativeActivity.EXTRA_ARGS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TopAppBarState NavHost$lambda$5(State<TopAppBarState> state) {
        return state.getValue();
    }
}
