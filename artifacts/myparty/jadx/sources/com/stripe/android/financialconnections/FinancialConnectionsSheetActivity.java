package com.stripe.android.financialconnections;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect;
import com.stripe.android.financialconnections.browser.BrowserManager;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.components.BottomSheetKt;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FinancialConnectionsSheetActivity.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\r\u0010\u0014\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0011H\u0014J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\fH\u0014J\u001e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006%²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewModel", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;", "getViewModel", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "startBrowserForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "startNativeAuthFlowForResult", "browserManager", "Lcom/stripe/android/financialconnections/browser/BrowserManager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Loading", "(Landroidx/compose/runtime/Composer;I)V", "onResume", "onNewIntent", SDKConstants.PARAM_INTENT, "handleViewEffect", "viewEffect", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", "bottomSheetState", "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openNativeAuthFlow", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;", "finishWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "Companion", "financial-connections_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetActivity extends AppCompatActivity {
    private BrowserManager browserManager;
    private final ActivityResultLauncher<Intent> startBrowserForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$$ExternalSyntheticLambda1
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            FinancialConnectionsSheetActivity.startBrowserForResult$lambda$1(this.f$0, (ActivityResult) obj);
        }
    });
    private final ActivityResultLauncher<Intent> startNativeAuthFlowForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$$ExternalSyntheticLambda2
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            FinancialConnectionsSheetActivity.startNativeAuthFlowForResult$lambda$2(this.f$0, (ActivityResult) obj);
        }
    });

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FinancialConnectionsSheetActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity", f = "FinancialConnectionsSheetActivity.kt", i = {0, 0}, l = {139}, m = "handleViewEffect", n = {"this", "viewEffect"}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$handleViewEffect$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsSheetActivity.this.handleViewEffect(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$4(FinancialConnectionsSheetActivity financialConnectionsSheetActivity, int i, Composer composer, int i2) {
        financialConnectionsSheetActivity.Loading(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public FinancialConnectionsSheetActivity() {
        final FinancialConnectionsSheetActivity financialConnectionsSheetActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(FinancialConnectionsSheetViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return financialConnectionsSheetActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinancialConnectionsSheetActivity.viewModel_delegate$lambda$0();
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? financialConnectionsSheetActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    public final FinancialConnectionsSheetViewModel getViewModel() {
        return (FinancialConnectionsSheetViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$0() {
        return FinancialConnectionsSheetViewModel.INSTANCE.getFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startBrowserForResult$lambda$1(FinancialConnectionsSheetActivity financialConnectionsSheetActivity, ActivityResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        financialConnectionsSheetActivity.getViewModel().onBrowserActivityResult$financial_connections_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startNativeAuthFlowForResult$lambda$2(FinancialConnectionsSheetActivity financialConnectionsSheetActivity, ActivityResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        financialConnectionsSheetActivity.getViewModel().onNativeAuthFlowResult$financial_connections_release(it);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (companion.getArgs(intent) == null) {
            finish();
            return;
        }
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        this.browserManager = new BrowserManager(application);
        if (savedInstanceState != null) {
            getViewModel().onActivityRecreated$financial_connections_release();
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(906787691, true, new C08501()), 1, null);
    }

    /* compiled from: FinancialConnectionsSheetActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$onCreate$1, reason: invalid class name and case insensitive filesystem */
    static final class C08501 implements Function2<Composer, Integer, Unit> {
        C08501() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(906787691, i, -1, "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.onCreate.<anonymous> (FinancialConnectionsSheetActivity.kt:70)");
                }
                final StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, null, composer, 0, 3);
                State stateCollectAsState = StateFlowsComposeKt.collectAsState(FinancialConnectionsSheetActivity.this.getViewModel().getStateFlow(), null, composer, 0, 1);
                FinancialConnectionsSheetViewEffect viewEffect = invoke$lambda$0(stateCollectAsState).getViewEffect();
                composer.startReplaceGroup(-1050794133);
                boolean zChanged = composer.changed(stateCollectAsState) | composer.changedInstance(FinancialConnectionsSheetActivity.this) | composer.changedInstance(stripeBottomSheetStateRememberStripeBottomSheetState);
                FinancialConnectionsSheetActivity financialConnectionsSheetActivity = FinancialConnectionsSheetActivity.this;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = (Function2) new FinancialConnectionsSheetActivity$onCreate$1$1$1(stateCollectAsState, financialConnectionsSheetActivity, stripeBottomSheetStateRememberStripeBottomSheetState, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(viewEffect, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 0);
                composer.startReplaceGroup(-1050783636);
                boolean zChangedInstance = composer.changedInstance(FinancialConnectionsSheetActivity.this);
                final FinancialConnectionsSheetActivity financialConnectionsSheetActivity2 = FinancialConnectionsSheetActivity.this;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$onCreate$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FinancialConnectionsSheetActivity.C08501.invoke$lambda$3$lambda$2(financialConnectionsSheetActivity2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BackHandlerKt.BackHandler(false, (Function0) objRememberedValue2, composer, 0, 1);
                Theme theme = invoke$lambda$0(stateCollectAsState).getTheme();
                final FinancialConnectionsSheetActivity financialConnectionsSheetActivity3 = FinancialConnectionsSheetActivity.this;
                ThemeKt.FinancialConnectionsTheme(theme, ComposableLambdaKt.rememberComposableLambda(2096424442, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.onCreate.1.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2096424442, i2, -1, "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.onCreate.<anonymous>.<anonymous> (FinancialConnectionsSheetActivity.kt:88)");
                            }
                            StripeBottomSheetState stripeBottomSheetState = stripeBottomSheetStateRememberStripeBottomSheetState;
                            FinancialConnectionsSheetViewModel viewModel = financialConnectionsSheetActivity3.getViewModel();
                            composer2.startReplaceGroup(1989319018);
                            boolean zChangedInstance2 = composer2.changedInstance(viewModel);
                            FinancialConnectionsSheetActivity$onCreate$1$3$1$1 financialConnectionsSheetActivity$onCreate$1$3$1$1RememberedValue = composer2.rememberedValue();
                            if (zChangedInstance2 || financialConnectionsSheetActivity$onCreate$1$3$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                financialConnectionsSheetActivity$onCreate$1$3$1$1RememberedValue = new FinancialConnectionsSheetActivity$onCreate$1$3$1$1(viewModel);
                                composer2.updateRememberedValue(financialConnectionsSheetActivity$onCreate$1$3$1$1RememberedValue);
                            }
                            composer2.endReplaceGroup();
                            final FinancialConnectionsSheetActivity financialConnectionsSheetActivity4 = financialConnectionsSheetActivity3;
                            BottomSheetKt.FinancialConnectionsBottomSheetLayout(stripeBottomSheetState, null, (Function0) ((KFunction) financialConnectionsSheetActivity$onCreate$1$3$1$1RememberedValue), ComposableLambdaKt.rememberComposableLambda(-627568770, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.onCreate.1.3.2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i3) {
                                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-627568770, i3, -1, "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetActivity.kt:92)");
                                    }
                                    financialConnectionsSheetActivity4.Loading(composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
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
                }, composer, 54), composer, 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(FinancialConnectionsSheetActivity financialConnectionsSheetActivity) {
            financialConnectionsSheetActivity.getViewModel().onDismissed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FinancialConnectionsSheetState invoke$lambda$0(State<FinancialConnectionsSheetState> state) {
            return state.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1849528791);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1849528791, i, -1, "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.Loading (FinancialConnectionsSheetActivity.kt:99)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LoadingContentKt.m7359LoadingSpinneruFdPcIQ(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(52)), 0.0f, null, composerStartRestartGroup, 6, 6);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FinancialConnectionsSheetActivity.Loading$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        getViewModel().onResume$financial_connections_release();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        getViewModel().handleOnNewIntent$financial_connections_release(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleViewEffect(FinancialConnectionsSheetViewEffect financialConnectionsSheetViewEffect, StripeBottomSheetState stripeBottomSheetState, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        FinancialConnectionsSheetActivity financialConnectionsSheetActivity;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (financialConnectionsSheetViewEffect instanceof FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl) {
                ActivityResultLauncher<Intent> activityResultLauncher = this.startBrowserForResult;
                BrowserManager browserManager = this.browserManager;
                if (browserManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("browserManager");
                    browserManager = null;
                }
                Uri uri = Uri.parse(((FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl) financialConnectionsSheetViewEffect).getUrl());
                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                activityResultLauncher.launch(browserManager.createBrowserIntentForUrl(uri));
            } else if (financialConnectionsSheetViewEffect instanceof FinancialConnectionsSheetViewEffect.FinishWithResult) {
                Integer finishToast = ((FinancialConnectionsSheetViewEffect.FinishWithResult) financialConnectionsSheetViewEffect).getFinishToast();
                if (finishToast != null) {
                    Toast.makeText(this, finishToast.intValue(), 1).show();
                }
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = financialConnectionsSheetViewEffect;
                anonymousClass1.label = 1;
                if (stripeBottomSheetState.hide(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                financialConnectionsSheetActivity = this;
            } else {
                if (!(financialConnectionsSheetViewEffect instanceof FinancialConnectionsSheetViewEffect.OpenNativeAuthFlow)) {
                    throw new NoWhenBranchMatchedException();
                }
                openNativeAuthFlow((FinancialConnectionsSheetViewEffect.OpenNativeAuthFlow) financialConnectionsSheetViewEffect);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        financialConnectionsSheetViewEffect = (FinancialConnectionsSheetViewEffect) anonymousClass1.L$1;
        financialConnectionsSheetActivity = (FinancialConnectionsSheetActivity) anonymousClass1.L$0;
        ResultKt.throwOnFailure(obj);
        financialConnectionsSheetActivity.finishWithResult(((FinancialConnectionsSheetViewEffect.FinishWithResult) financialConnectionsSheetViewEffect).getResult());
        return Unit.INSTANCE;
    }

    private final void openNativeAuthFlow(FinancialConnectionsSheetViewEffect.OpenNativeAuthFlow viewEffect) {
        this.startNativeAuthFlowForResult.launch(FinancialConnectionsSheetNativeActivity.INSTANCE.intent(this, new FinancialConnectionsSheetNativeActivityArgs(viewEffect.getFlowType(), viewEffect.getConfiguration(), viewEffect.getInitialSyncResponse(), viewEffect.getElementsSessionContext())));
    }

    private final void finishWithResult(FinancialConnectionsSheetActivityResult result) {
        setResult(-1, new Intent().putExtras(result.toBundle()));
        finish();
    }

    /* compiled from: FinancialConnectionsSheetActivity.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Companion;", "", "<init>", "()V", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "context", "Landroid/content/Context;", CardScanActivity.ARGS, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "getArgs", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent intent(Context context, FinancialConnectionsSheetActivityArgs args) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(args, "args");
            Intent intent = new Intent(context, (Class<?>) FinancialConnectionsSheetActivity.class);
            intent.addFlags(65536);
            intent.putExtra(FinancialConnectionsSheetActivityArgs.EXTRA_ARGS, args);
            return intent;
        }

        public final FinancialConnectionsSheetActivityArgs getArgs(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return (FinancialConnectionsSheetActivityArgs) savedStateHandle.get(FinancialConnectionsSheetActivityArgs.EXTRA_ARGS);
        }

        public final FinancialConnectionsSheetActivityArgs getArgs(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return (FinancialConnectionsSheetActivityArgs) intent.getParcelableExtra(FinancialConnectionsSheetActivityArgs.EXTRA_ARGS);
        }
    }
}
