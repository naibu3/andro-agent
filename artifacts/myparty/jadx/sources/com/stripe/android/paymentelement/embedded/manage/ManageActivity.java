package com.stripe.android.paymentelement.embedded.manage;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.common.ui.BottomSheetScaffoldKt;
import com.stripe.android.common.ui.ElementsBottomSheetLayoutKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.manage.ManageActivity;
import com.stripe.android.paymentelement.embedded.manage.ManageContract;
import com.stripe.android.paymentelement.embedded.manage.ManageNavigator;
import com.stripe.android.paymentelement.embedded.manage.ManageResult;
import com.stripe.android.paymentelement.embedded.manage.ManageViewModel;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarState;
import com.stripe.android.paymentsheet.utils.EdgeToEdgeKt;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.ui.core.elements.H4TextKt;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.AnimationConstantsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ManageActivity.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u001d\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(H\u0003¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\"H\u0016J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006.²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u0010/\u001a\u00020-X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u000201X\u008a\u008e\u0002²\u0006\f\u00102\u001a\u0004\u0018\u000103X\u008a\u0084\u0002²\u0006\f\u00104\u001a\u0004\u0018\u000105X\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", CardScanActivity.ARGS, "Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;", "getArgs", "()Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;", "args$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;", "getViewModel", "()Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;", "viewModel$delegate", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "getCustomerStateHolder", "()Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "setCustomerStateHolder", "(Lcom/stripe/android/paymentsheet/CustomerStateHolder;)V", "manageNavigator", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;", "getManageNavigator", "()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;", "setManageNavigator", "(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;)V", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "getSelectionHolder", "()Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "setSelectionHolder", "(Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ScreenContent", "navigator", "screen", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;", "(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;Landroidx/compose/runtime/Composer;I)V", "finish", "setManageResult", "shouldInvokeSelectionCallback", "", "paymentsheet_release", "hasResult", "contentHeight", "Landroidx/compose/ui/unit/Dp;", "topBarState", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "headerText", "Lcom/stripe/android/core/strings/ResolvableString;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManageActivity extends AppCompatActivity {
    public static final int $stable = 8;

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ManageActivity.args_delegate$lambda$0(this.f$0);
        }
    });

    @Inject
    public CustomerStateHolder customerStateHolder;

    @Inject
    public ManageNavigator manageNavigator;

    @Inject
    public EmbeddedSelectionHolder selectionHolder;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenContent$lambda$10(ManageActivity manageActivity, ManageNavigator manageNavigator, ManageNavigator.Screen screen, int i, Composer composer, int i2) {
        manageActivity.ScreenContent(manageNavigator, screen, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public ManageActivity() {
        final ManageActivity manageActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ManageViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return manageActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManageActivity.viewModel_delegate$lambda$2(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? manageActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final ManageContract.Args getArgs() {
        return (ManageContract.Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManageContract.Args args_delegate$lambda$0(ManageActivity manageActivity) {
        ManageContract.Args.Companion companion = ManageContract.Args.INSTANCE;
        Intent intent = manageActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.fromIntent(intent);
    }

    private final ManageViewModel getViewModel() {
        return (ManageViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$2(final ManageActivity manageActivity) {
        return new ManageViewModel.Factory(new Function0() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManageActivity.viewModel_delegate$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManageContract.Args viewModel_delegate$lambda$2$lambda$1(ManageActivity manageActivity) {
        ManageContract.Args args = manageActivity.getArgs();
        if (args != null) {
            return args;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final CustomerStateHolder getCustomerStateHolder() {
        CustomerStateHolder customerStateHolder = this.customerStateHolder;
        if (customerStateHolder != null) {
            return customerStateHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("customerStateHolder");
        return null;
    }

    public final void setCustomerStateHolder(CustomerStateHolder customerStateHolder) {
        Intrinsics.checkNotNullParameter(customerStateHolder, "<set-?>");
        this.customerStateHolder = customerStateHolder;
    }

    public final ManageNavigator getManageNavigator() {
        ManageNavigator manageNavigator = this.manageNavigator;
        if (manageNavigator != null) {
            return manageNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("manageNavigator");
        return null;
    }

    public final void setManageNavigator(ManageNavigator manageNavigator) {
        Intrinsics.checkNotNullParameter(manageNavigator, "<set-?>");
        this.manageNavigator = manageNavigator;
    }

    public final EmbeddedSelectionHolder getSelectionHolder() {
        EmbeddedSelectionHolder embeddedSelectionHolder = this.selectionHolder;
        if (embeddedSelectionHolder != null) {
            return embeddedSelectionHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectionHolder");
        return null;
    }

    public final void setSelectionHolder(EmbeddedSelectionHolder embeddedSelectionHolder) {
        Intrinsics.checkNotNullParameter(embeddedSelectionHolder, "<set-?>");
        this.selectionHolder = embeddedSelectionHolder;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArgs() == null) {
            finish();
            return;
        }
        EdgeToEdgeKt.renderEdgeToEdge(this);
        getViewModel().getComponent().inject(this);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageActivity.onCreate$lambda$3(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 3, null);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(573781948, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity.onCreate.2

            /* compiled from: ManageActivity.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.paymentelement.embedded.manage.ManageActivity$onCreate$2$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ ManageActivity this$0;

                AnonymousClass1(ManageActivity manageActivity) {
                    this.this$0 = manageActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1304251054, i, -1, "com.stripe.android.paymentelement.embedded.manage.ManageActivity.onCreate.<anonymous>.<anonymous> (ManageActivity.kt:79)");
                        }
                        final State stateCollectAsState = StateFlowsComposeKt.collectAsState(this.this$0.getManageNavigator().getScreen(), null, composer, 0, 1);
                        composer.startReplaceGroup(938745555);
                        boolean zChanged = composer.changed(stateCollectAsState);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity$onCreate$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(ManageActivity.C10852.AnonymousClass1.invoke$lambda$2$lambda$1(stateCollectAsState, (ModalBottomSheetValue) obj));
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, (Function1) objRememberedValue, composer, 0, 1);
                        composer.startReplaceGroup(938751504);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final ManageActivity manageActivity = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity$onCreate$2$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ManageActivity.C10852.AnonymousClass1.invoke$lambda$4$lambda$3(manageActivity);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetStateRememberStripeBottomSheetState, null, 0.0f, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(1832322730, true, new C01952(this.this$0, stateCollectAsState), composer, 54), composer, StripeBottomSheetState.$stable | 24576, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean invoke$lambda$2$lambda$1(State state, ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return !invoke$lambda$0(state).isPerformingNetworkOperation();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$4$lambda$3(ManageActivity manageActivity) {
                    manageActivity.setManageResult(false);
                    manageActivity.finish();
                    return Unit.INSTANCE;
                }

                /* compiled from: ManageActivity.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.paymentelement.embedded.manage.ManageActivity$onCreate$2$1$2, reason: invalid class name and collision with other inner class name */
                static final class C01952 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ State<ManageNavigator.Screen> $screen$delegate;
                    final /* synthetic */ ManageActivity this$0;

                    /* JADX WARN: Multi-variable type inference failed */
                    C01952(ManageActivity manageActivity, State<? extends ManageNavigator.Screen> state) {
                        this.this$0 = manageActivity;
                        this.$screen$delegate = state;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
                        return mutableState.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
                        mutableState.setValue(Boolean.valueOf(z));
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1832322730, i, -1, "com.stripe.android.paymentelement.embedded.manage.ManageActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ManageActivity.kt:90)");
                        }
                        composer.startReplaceGroup(-583858582);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        MutableState mutableState = (MutableState) objRememberedValue;
                        composer.endReplaceGroup();
                        if (!invoke$lambda$1(mutableState)) {
                            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(20), 7, null);
                            ManageActivity manageActivity = this.this$0;
                            State<ManageNavigator.Screen> state = this.$screen$delegate;
                            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1024paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer);
                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            manageActivity.ScreenContent(manageActivity.getManageNavigator(), AnonymousClass1.invoke$lambda$0(state), composer, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ManageNavigator.Screen screenInvoke$lambda$0 = AnonymousClass1.invoke$lambda$0(this.$screen$delegate);
                            composer.startReplaceGroup(-583849118);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            ManageActivity manageActivity2 = this.this$0;
                            ManageActivity$onCreate$2$1$2$2$1 manageActivity$onCreate$2$1$2$2$1RememberedValue = composer.rememberedValue();
                            if (zChangedInstance || manageActivity$onCreate$2$1$2$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                manageActivity$onCreate$2$1$2$2$1RememberedValue = new ManageActivity$onCreate$2$1$2$2$1(manageActivity2, mutableState, null);
                                composer.updateRememberedValue(manageActivity$onCreate$2$1$2$2$1RememberedValue);
                            }
                            composer.endReplaceGroup();
                            EffectsKt.LaunchedEffect(screenInvoke$lambda$0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) manageActivity$onCreate$2$1$2$2$1RememberedValue, composer, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ManageNavigator.Screen invoke$lambda$0(State<? extends ManageNavigator.Screen> state) {
                    return state.getValue();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(573781948, i, -1, "com.stripe.android.paymentelement.embedded.manage.ManageActivity.onCreate.<anonymous> (ManageActivity.kt:78)");
                    }
                    StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1304251054, true, new AnonymousClass1(ManageActivity.this), composer, 54), composer, 12582912, 127);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(ManageActivity manageActivity, OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        if (!manageActivity.getManageNavigator().getScreen().getValue().isPerformingNetworkOperation()) {
            manageActivity.getManageNavigator().performAction(ManageNavigator.Action.Back.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ScreenContent(final ManageNavigator manageNavigator, final ManageNavigator.Screen screen, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-362033229);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(manageNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(screen) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-362033229, i2, -1, "com.stripe.android.paymentelement.embedded.manage.ManageActivity.ScreenContent (ManageActivity.kt:112)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Density density = (Density) objConsume;
            composerStartRestartGroup.startReplaceGroup(-973071138);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m6115boximpl(Dp.m6117constructorimpl(0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1777492334, true, new AnonymousClass1(screen, manageNavigator, this), composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1765925809, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity.ScreenContent.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1765925809, i3, -1, "com.stripe.android.paymentelement.embedded.manage.ManageActivity.ScreenContent.<anonymous> (ManageActivity.kt:129)");
                        }
                        PaddingValues outerFormInsets = StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE);
                        composer2.startReplaceGroup(-2084002877);
                        boolean zChanged = composer2.changed(screen);
                        ManageNavigator.Screen screen2 = screen;
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = screen2.title();
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        ResolvableString resolvableStringInvoke$lambda$1 = invoke$lambda$1(StateFlowsComposeKt.collectAsState((StateFlow) objRememberedValue2, null, composer2, 0, 1));
                        composer2.startReplaceGroup(-2083998922);
                        if (resolvableStringInvoke$lambda$1 != null) {
                            H4TextKt.H4Text(ResolvableStringComposeUtilsKt.resolve(resolvableStringInvoke$lambda$1, composer2, 0), PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(16), 7, null), outerFormInsets), composer2, 0, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(Modifier.INSTANCE, null, null, 3, null);
                        ManageNavigator.Screen screen3 = screen;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierAnimateContentSize$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        screen3.Content(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                private static final ResolvableString invoke$lambda$1(State<? extends ResolvableString> state) {
                    return state.getValue();
                }
            }, composerStartRestartGroup, 54);
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-973029676);
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ManageActivity.ScreenContent$lambda$9$lambda$8(density, mutableState, (LayoutCoordinates) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BottomSheetScaffoldKt.BottomSheetScaffold(composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue2), scrollStateRememberScrollState, composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManageActivity.ScreenContent$lambda$10(this.f$0, manageNavigator, screen, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ScreenContent$lambda$6(MutableState<Dp> mutableState, float f) {
        mutableState.setValue(Dp.m6115boximpl(f));
    }

    /* compiled from: ManageActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentelement.embedded.manage.ManageActivity$ScreenContent$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ManageNavigator $navigator;
        final /* synthetic */ ManageNavigator.Screen $screen;
        final /* synthetic */ ManageActivity this$0;

        AnonymousClass1(ManageNavigator.Screen screen, ManageNavigator manageNavigator, ManageActivity manageActivity) {
            this.$screen = screen;
            this.$navigator = manageNavigator;
            this.this$0 = manageActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1777492334, i, -1, "com.stripe.android.paymentelement.embedded.manage.ManageActivity.ScreenContent.<anonymous> (ManageActivity.kt:118)");
                }
                composer.startReplaceGroup(-2084020055);
                boolean zChanged = composer.changed(this.$screen);
                ManageNavigator.Screen screen = this.$screen;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = screen.topBarState();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                PaymentSheetTopBarState paymentSheetTopBarStateInvoke$lambda$1 = invoke$lambda$1(StateFlowsComposeKt.collectAsState((StateFlow) objRememberedValue, null, composer, 0, 1));
                boolean canGoBack = this.$navigator.getCanGoBack();
                composer.startReplaceGroup(-2084010182);
                boolean zChangedInstance = composer.changedInstance(this.this$0);
                final ManageActivity manageActivity = this.this$0;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentelement.embedded.manage.ManageActivity$ScreenContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ManageActivity.AnonymousClass1.invoke$lambda$3$lambda$2(manageActivity);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                PaymentSheetTopBarKt.m8492PaymentSheetTopBarFJfuzF0(paymentSheetTopBarStateInvoke$lambda$1, canGoBack, true, (Function0) objRememberedValue2, 0.0f, composer, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(ManageActivity manageActivity) {
            manageActivity.getManageNavigator().performAction(ManageNavigator.Action.Back.INSTANCE);
            return Unit.INSTANCE;
        }

        private static final PaymentSheetTopBarState invoke$lambda$1(State<PaymentSheetTopBarState> state) {
            return state.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenContent$lambda$9$lambda$8(Density density, MutableState mutableState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ScreenContent$lambda$6(mutableState, density.mo709toDpu2uoSUM(IntSize.m6286getHeightimpl(it.mo5001getSizeYbymL2g())));
        return Unit.INSTANCE;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstantsKt.fadeOut(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setManageResult(boolean shouldInvokeSelectionCallback) {
        CustomerState value = getCustomerStateHolder().getCustomer().getValue();
        if (value != null) {
            ManageResult.Complete complete = new ManageResult.Complete(value, getSelectionHolder().getSelection().getValue(), shouldInvokeSelectionCallback);
            ManageResult.Companion companion = ManageResult.INSTANCE;
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            setResult(-1, companion.toIntent(intent, complete));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
