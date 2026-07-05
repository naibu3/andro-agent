package com.stripe.android.financialconnections.features.linkstepupverification;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt;
import com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationState;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinkStepUpVerificationScreen.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a7\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u000b\u001aQ\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u0011X\u008a\u008e\u0002"}, d2 = {"LinkStepUpVerificationScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "LinkStepUpVerificationContent", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;", "onCloseFromErrorClick", "Lkotlin/Function1;", "", "onResendCodeClick", "Lkotlin/Function0;", "(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LinkStepUpVerificationLoaded", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "submitError", "submitLoading", "", "payload", "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HeaderSection", "email", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ResendCodeSection", "isLoading", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LinkStepUpVerificationPreview", "(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release", "shouldRequestFocus"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkStepUpVerificationScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderSection$lambda$23(String str, int i, Composer composer, int i2) {
        HeaderSection(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkStepUpVerificationContent$lambda$9(LinkStepUpVerificationState linkStepUpVerificationState, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        LinkStepUpVerificationContent(linkStepUpVerificationState, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkStepUpVerificationLoaded$lambda$21(LazyListState lazyListState, Throwable th, boolean z, Function1 function1, LinkStepUpVerificationState.Payload payload, Function0 function0, int i, Composer composer, int i2) {
        LinkStepUpVerificationLoaded(lazyListState, th, z, function1, payload, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkStepUpVerificationPreview$lambda$28(LinkStepUpVerificationState linkStepUpVerificationState, int i, Composer composer, int i2) {
        LinkStepUpVerificationPreview(linkStepUpVerificationState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkStepUpVerificationScreen$lambda$5(int i, Composer composer, int i2) {
        LinkStepUpVerificationScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResendCodeSection$lambda$27(boolean z, Function0 function0, int i, Composer composer, int i2) {
        ResendCodeSection(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LinkStepUpVerificationScreen(Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(1187927588);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1187927588, i, -1, "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreen (LinkStepUpVerificationScreen.kt:53)");
            }
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = LinkStepUpVerificationViewModel.INSTANCE.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent());
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LinkStepUpVerificationViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            LinkStepUpVerificationViewModel linkStepUpVerificationViewModel = (LinkStepUpVerificationViewModel) ((FinancialConnectionsViewModel) viewModel);
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModelParentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(composerStartRestartGroup, 0);
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(linkStepUpVerificationViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(730519962);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(true, (Function0) objRememberedValue, composerStartRestartGroup, 54, 0);
            LinkStepUpVerificationState linkStepUpVerificationState = (LinkStepUpVerificationState) stateCollectAsState.getValue();
            composerStartRestartGroup.startReplaceGroup(730523166);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(financialConnectionsSheetNativeViewModelParentViewModel);
            LinkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$2$1 linkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || linkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$2$1RememberedValue = new LinkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$2$1(financialConnectionsSheetNativeViewModelParentViewModel);
                composerStartRestartGroup.updateRememberedValue(linkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) linkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$2$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(730525332);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(linkStepUpVerificationViewModel);
            LinkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$3$1 linkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || linkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$3$1RememberedValue = new LinkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$3$1(linkStepUpVerificationViewModel);
                composerStartRestartGroup.updateRememberedValue(linkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$3$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LinkStepUpVerificationContent(linkStepUpVerificationState, function1, (Function0) ((KFunction) linkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$3$1RememberedValue), composerStartRestartGroup, OTPElement.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkStepUpVerificationScreenKt.LinkStepUpVerificationScreen$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkStepUpVerificationContent(final LinkStepUpVerificationState linkStepUpVerificationState, final Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function1<? super Throwable, Unit> function12;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(-410876857);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(linkStepUpVerificationState) : composerStartRestartGroup.changedInstance(linkStepUpVerificationState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-410876857, i2, -1, "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationContent (LinkStepUpVerificationScreen.kt:72)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            final Async<LinkStepUpVerificationState.Payload> payload = linkStepUpVerificationState.getPayload();
            if (Intrinsics.areEqual(payload, Async.Uninitialized.INSTANCE) || (payload instanceof Async.Loading)) {
                function12 = function1;
                function02 = function0;
                composerStartRestartGroup.startReplaceGroup(2072327206);
                LoadingContentKt.FullScreenGenericLoading(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (!(payload instanceof Async.Fail)) {
                if (!(payload instanceof Async.Success)) {
                    composerStartRestartGroup.startReplaceGroup(2072325230);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-182216198);
                function12 = function1;
                function02 = function0;
                LinkStepUpVerificationLoaded(lazyListStateRememberLazyListState, linkStepUpVerificationState.getSubmitError(), linkStepUpVerificationState.getSubmitLoading(), function12, (LinkStepUpVerificationState.Payload) ((Async.Success) payload).invoke(), function02, composerStartRestartGroup, ((i2 << 6) & 7168) | (OTPElement.$stable << 12) | ((i2 << 9) & 458752));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2072328845);
                composerStartRestartGroup.startReplaceGroup(2072329620);
                boolean zChangedInstance = ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) | composerStartRestartGroup.changedInstance(payload);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LinkStepUpVerificationScreenKt.LinkStepUpVerificationContent$lambda$8$lambda$7$lambda$6(function1, payload);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorContentKt.UnclassifiedErrorContent(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
                function12 = function1;
                function02 = function0;
            }
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
            function12 = function1;
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkStepUpVerificationScreenKt.LinkStepUpVerificationContent$lambda$9(linkStepUpVerificationState, function12, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkStepUpVerificationContent$lambda$8$lambda$7$lambda$6(Function1 function1, Async async) {
        function1.invoke(((Async.Fail) async).getError());
        return Unit.INSTANCE;
    }

    private static final void LinkStepUpVerificationLoaded(final LazyListState lazyListState, final Throwable th, final boolean z, final Function1<? super Throwable, Unit> function1, final LinkStepUpVerificationState.Payload payload, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(838269731);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(th) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? composerStartRestartGroup.changed(payload) : composerStartRestartGroup.changedInstance(payload) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(838269731, i2, -1, "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationLoaded (LinkStepUpVerificationScreen.kt:98)");
            }
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            FocusManager focusManager = (FocusManager) objConsume;
            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localSoftwareKeyboardController);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) objConsume2;
            composerStartRestartGroup.startReplaceGroup(-1306691410);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(-1306688950);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LinkStepUpVerificationScreenKt.LinkStepUpVerificationLoaded$lambda$12$lambda$11();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.startReplaceGroup(-1306687889);
            if (LinkStepUpVerificationLoaded$lambda$13(mutableState)) {
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1306686190);
                LinkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$1$1 linkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (linkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    linkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$1$1RememberedValue = new LinkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$1$1(focusRequester, null);
                    composerStartRestartGroup.updateRememberedValue(linkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$1$1RememberedValue, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceGroup(-1306683696);
            int i4 = i2 & 896;
            boolean zChangedInstance = (i4 == 256) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changed(softwareKeyboardController);
            LinkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$2$1 linkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || linkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                linkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$2$1RememberedValue = new LinkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$2$1(z, focusManager, softwareKeyboardController, null);
                composerStartRestartGroup.updateRememberedValue(linkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$2$1RememberedValue, composerStartRestartGroup, (i2 >> 6) & 14);
            if (th == null || (th instanceof ConfirmVerification.OTPError)) {
                composerStartRestartGroup.startReplaceGroup(-1852194162);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(24));
                composerStartRestartGroup.startReplaceGroup(-1306669647);
                boolean zChangedInstance2 = ((57344 & i2) == 16384 || ((i2 & 32768) != 0 && composerStartRestartGroup.changedInstance(payload))) | (i4 == 256) | composerStartRestartGroup.changedInstance(th) | composerStartRestartGroup.changed(mutableState) | ((458752 & i2) == 131072);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    i3 = i2;
                    Function1 function12 = new Function1() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LinkStepUpVerificationScreenKt.LinkStepUpVerificationLoaded$lambda$20$lambda$19(payload, focusRequester, z, th, mutableState, function0, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function12);
                    objRememberedValue3 = function12;
                } else {
                    i3 = i2;
                }
                composerStartRestartGroup.endReplaceGroup();
                LayoutKt.LazyLayout(null, null, false, false, false, horizontalOrVerticalM900spacedBy0680j_4, false, lazyListState, null, (Function1) objRememberedValue3, composerStartRestartGroup, ((i3 << 21) & 29360128) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 351);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1852305886);
                composerStartRestartGroup.startReplaceGroup(-1306676713);
                boolean zChangedInstance3 = ((i2 & 7168) == 2048) | composerStartRestartGroup.changedInstance(th);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LinkStepUpVerificationScreenKt.LinkStepUpVerificationLoaded$lambda$18$lambda$17(function1, th);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorContentKt.UnclassifiedErrorContent(false, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkStepUpVerificationScreenKt.LinkStepUpVerificationLoaded$lambda$21(lazyListState, th, z, function1, payload, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState LinkStepUpVerificationLoaded$lambda$12$lambda$11() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean LinkStepUpVerificationLoaded$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkStepUpVerificationLoaded$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkStepUpVerificationLoaded$lambda$18$lambda$17(Function1 function1, Throwable th) {
        function1.invoke(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkStepUpVerificationLoaded$lambda$20$lambda$19(final LinkStepUpVerificationState.Payload payload, FocusRequester focusRequester, final boolean z, Throwable th, MutableState mutableState, final Function0 function0, LazyListScope LazyLayout) {
        Intrinsics.checkNotNullParameter(LazyLayout, "$this$LazyLayout");
        LazyListScope.item$default(LazyLayout, null, null, ComposableLambdaKt.composableLambdaInstance(1199382111, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$4$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1199382111, i, -1, "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationLoaded.<anonymous>.<anonymous>.<anonymous> (LinkStepUpVerificationScreen.kt:124)");
                }
                LinkStepUpVerificationScreenKt.HeaderSection(payload.getEmail(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyLayout, null, null, ComposableLambdaKt.composableLambdaInstance(1149547848, true, new LinkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$4$1$2(focusRequester, payload, z, th, mutableState)), 3, null);
        LazyListScope.item$default(LazyLayout, null, null, ComposableLambdaKt.composableLambdaInstance(2020369447, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$4$1$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2020369447, i, -1, "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationLoaded.<anonymous>.<anonymous>.<anonymous> (LinkStepUpVerificationScreen.kt:138)");
                    }
                    LinkStepUpVerificationScreenKt.ResendCodeSection(z, function0, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HeaderSection(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1023284225);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1023284225, i2, -1, "com.stripe.android.financialconnections.features.linkstepupverification.HeaderSection (LinkStepUpVerificationScreen.kt:151)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_link_stepup_verification_title, composerStartRestartGroup, 0), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getHeadingXLarge(), composer2, 0, 0, 65530);
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_link_stepup_verification_desc, new Object[]{str}, composer2, 0), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composer2, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer2, 6).getBodyMedium(), composer2, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkStepUpVerificationScreenKt.HeaderSection$lambda$23(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ResendCodeSection(final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1640362317);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1640362317, i2, -1, "com.stripe.android.financialconnections.features.linkstepupverification.ResendCodeSection (LinkStepUpVerificationScreen.kt:172)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-40436401);
                LoadingContentKt.m7359LoadingSpinneruFdPcIQ(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), 0.0f, null, composerStartRestartGroup, 6, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-40352701);
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-971131197);
                boolean z2 = (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LinkStepUpVerificationScreenKt.ResendCodeSection$lambda$26$lambda$25$lambda$24(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_link_stepup_verification_resend_code, composerStartRestartGroup, 0), ClickableKt.m608clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7643getTextAction0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelMediumEmphasized(), composerStartRestartGroup, 0, 0, 65528);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkStepUpVerificationScreenKt.ResendCodeSection$lambda$27(z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResendCodeSection$lambda$26$lambda$25$lambda$24(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: LinkStepUpVerificationScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ LinkStepUpVerificationState $state;

        AnonymousClass1(LinkStepUpVerificationState linkStepUpVerificationState) {
            this.$state = linkStepUpVerificationState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(135287404, i, -1, "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationPreview.<anonymous> (LinkStepUpVerificationScreen.kt:197)");
                }
                LinkStepUpVerificationState linkStepUpVerificationState = this.$state;
                composer.startReplaceGroup(-2039458115);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LinkStepUpVerificationScreenKt.AnonymousClass1.invoke$lambda$1$lambda$0((Throwable) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-2039456963);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                LinkStepUpVerificationScreenKt.LinkStepUpVerificationContent(linkStepUpVerificationState, function1, (Function0) objRememberedValue2, composer, OTPElement.$stable | 432);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final void LinkStepUpVerificationPreview(@PreviewParameter(provider = LinkStepUpVerificationPreviewParameterProvider.class) final LinkStepUpVerificationState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1630219331);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1630219331, i2, -1, "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationPreview (LinkStepUpVerificationScreen.kt:195)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(135287404, true, new AnonymousClass1(state), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkStepUpVerificationScreenKt.LinkStepUpVerificationPreview$lambda$28(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
