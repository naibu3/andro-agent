package com.stripe.android.financialconnections.features.networkingsavetolinkverification;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
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
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.components.ButtonKt;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton;
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

/* compiled from: NetworkingSaveToLinkVerificationScreen.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a7\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u000b\u001aE\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002"}, d2 = {"NetworkingSaveToLinkVerificationScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "NetworkingSaveToLinkVerificationContent", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState;", "onSkipClick", "Lkotlin/Function0;", "onCloseFromErrorClick", "Lkotlin/Function1;", "", "(Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "NetworkingSaveToLinkVerificationLoaded", "confirmVerificationAsync", "Lcom/stripe/android/financialconnections/presentation/Async;", "payload", "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState$Payload;", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState$Payload;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Header", "(Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState$Payload;Landroidx/compose/runtime/Composer;I)V", "SaveToLinkVerificationPreview", "(Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release", "shouldRequestFocus", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkingSaveToLinkVerificationScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$22(NetworkingSaveToLinkVerificationState.Payload payload, int i, Composer composer, int i2) {
        Header(payload, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingSaveToLinkVerificationContent$lambda$7(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        NetworkingSaveToLinkVerificationContent(networkingSaveToLinkVerificationState, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingSaveToLinkVerificationLoaded$lambda$20(Async async, NetworkingSaveToLinkVerificationState.Payload payload, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        NetworkingSaveToLinkVerificationLoaded(async, payload, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingSaveToLinkVerificationScreen$lambda$3(int i, Composer composer, int i2) {
        NetworkingSaveToLinkVerificationScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SaveToLinkVerificationPreview$lambda$23(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState, int i, Composer composer, int i2) {
        SaveToLinkVerificationPreview(networkingSaveToLinkVerificationState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void NetworkingSaveToLinkVerificationScreen(Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1788942795);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1788942795, i, -1, "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreen (NetworkingSaveToLinkVerificationScreen.kt:51)");
            }
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = NetworkingSaveToLinkVerificationViewModel.INSTANCE.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent());
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(NetworkingSaveToLinkVerificationViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel = (NetworkingSaveToLinkVerificationViewModel) ((FinancialConnectionsViewModel) viewModel);
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModelParentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(composerStartRestartGroup, 0);
            NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState = (NetworkingSaveToLinkVerificationState) StateFlowsComposeKt.collectAsState(networkingSaveToLinkVerificationViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1).getValue();
            composerStartRestartGroup.startReplaceGroup(-363194626);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(financialConnectionsSheetNativeViewModelParentViewModel);
            NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$1$1 networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$1$1RememberedValue = new NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$1$1(financialConnectionsSheetNativeViewModelParentViewModel);
                composerStartRestartGroup.updateRememberedValue(networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$1$1RememberedValue);
            }
            KFunction kFunction = (KFunction) networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$1$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-363192658);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(networkingSaveToLinkVerificationViewModel);
            NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$2$1 networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$2$1RememberedValue = new NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$2$1(networkingSaveToLinkVerificationViewModel);
                composerStartRestartGroup.updateRememberedValue(networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            NetworkingSaveToLinkVerificationContent(networkingSaveToLinkVerificationState, (Function0) ((KFunction) networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationScreen$2$1RememberedValue), (Function1) kFunction, composerStartRestartGroup, OTPElement.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationScreen$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NetworkingSaveToLinkVerificationContent(final NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        final Function1<? super Throwable, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-88973549);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(networkingSaveToLinkVerificationState) : composerStartRestartGroup.changedInstance(networkingSaveToLinkVerificationState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-88973549, i2, -1, "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationContent (NetworkingSaveToLinkVerificationScreen.kt:69)");
            }
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
            final Async<NetworkingSaveToLinkVerificationState.Payload> payload = networkingSaveToLinkVerificationState.getPayload();
            if (Intrinsics.areEqual(payload, Async.Uninitialized.INSTANCE) || (payload instanceof Async.Loading)) {
                function02 = function0;
                function12 = function1;
                composerStartRestartGroup.startReplaceGroup(-1562789658);
                LoadingContentKt.FullScreenGenericLoading(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (payload instanceof Async.Success) {
                composerStartRestartGroup.startReplaceGroup(-1201779155);
                function02 = function0;
                NetworkingSaveToLinkVerificationLoaded(networkingSaveToLinkVerificationState.getConfirmVerification(), (NetworkingSaveToLinkVerificationState.Payload) ((Async.Success) payload).invoke(), function1, function02, composerStartRestartGroup, (OTPElement.$stable << 3) | (i2 & 896) | ((i2 << 6) & 7168));
                function12 = function1;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                function02 = function0;
                function12 = function1;
                if (!(payload instanceof Async.Fail)) {
                    composerStartRestartGroup.startReplaceGroup(-1562791684);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1562778643);
                composerStartRestartGroup.startReplaceGroup(-1562777868);
                boolean zChangedInstance = ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(payload);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationContent$lambda$6$lambda$5$lambda$4(function12, payload);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorContentKt.UnclassifiedErrorContent(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
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
            function02 = function0;
            function12 = function1;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationContent$lambda$7(networkingSaveToLinkVerificationState, function02, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingSaveToLinkVerificationContent$lambda$6$lambda$5$lambda$4(Function1 function1, Async async) {
        function1.invoke(((Async.Fail) async).getError());
        return Unit.INSTANCE;
    }

    private static final void NetworkingSaveToLinkVerificationLoaded(final Async<Unit> async, final NetworkingSaveToLinkVerificationState.Payload payload, final Function1<? super Throwable, Unit> function1, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(1650371339);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(async) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(payload) : composerStartRestartGroup.changedInstance(payload) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1650371339, i2, -1, "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationLoaded (NetworkingSaveToLinkVerificationScreen.kt:91)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
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
            composerStartRestartGroup.startReplaceGroup(1894555214);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int i3 = i2;
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1894557674);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationLoaded$lambda$10$lambda$9();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposableLambda composableLambdaRememberComposableLambda = null;
            final MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.startReplaceGroup(1894558735);
            if (NetworkingSaveToLinkVerificationLoaded$lambda$11(mutableState)) {
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1894560434);
                NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$1$1 networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$1$1RememberedValue = new NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$1$1(focusRequester, null);
                    composerStartRestartGroup.updateRememberedValue(networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$1$1RememberedValue, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1894563302);
            int i4 = i3 & 14;
            boolean zChangedInstance = (i4 == 4) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changed(softwareKeyboardController);
            NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$2$1 networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$2$1RememberedValue = new NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$2$1(async, focusManager, softwareKeyboardController, null);
                composerStartRestartGroup.updateRememberedValue(networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(async, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$2$1RememberedValue, composerStartRestartGroup, i4);
            composerStartRestartGroup.startReplaceGroup(1894568207);
            if (NetworkingSaveToLinkVerificationLoaded$lambda$11(mutableState)) {
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1894569906);
                NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$3$1 networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$3$1RememberedValue = new NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$3$1(focusRequester, null);
                    composerStartRestartGroup.updateRememberedValue(networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$3$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) networkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$3$1RememberedValue, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (!(async instanceof Async.Fail) || (((Async.Fail) async).getError() instanceof ConfirmVerification.OTPError)) {
                composerStartRestartGroup.startReplaceGroup(-1397571101);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(24));
                composerStartRestartGroup.startReplaceGroup(1894615314);
                if (payload.getShowNotNowButton()) {
                    z = true;
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1656395436, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationLoaded.5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1656395436, i5, -1, "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationLoaded.<anonymous> (NetworkingSaveToLinkVerificationScreen.kt:146)");
                                }
                                FinancialConnectionsButton.Type.Secondary secondary = FinancialConnectionsButton.Type.Secondary.INSTANCE;
                                ButtonKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), secondary, null, false, false, ComposableSingletons$NetworkingSaveToLinkVerificationScreenKt.INSTANCE.m7457getLambda1$financial_connections_release(), composer2, 1573296, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                } else {
                    z = true;
                }
                composerStartRestartGroup.endReplaceGroup();
                Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM900spacedBy0680j_4;
                composerStartRestartGroup.startReplaceGroup(1894583684);
                boolean zChanged = (i4 == 4 ? z : false) | (((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(payload))) ? z : false) | composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationLoaded$lambda$19$lambda$18(async, payload, focusRequester, mutableState, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                LayoutKt.LazyLayout(null, null, false, false, false, horizontalOrVertical, false, lazyListStateRememberLazyListState, composableLambdaRememberComposableLambda, (Function1) objRememberedValue3, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 95);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1397724241);
                composerStartRestartGroup.startReplaceGroup(1894575850);
                boolean z2 = ((i3 & 896) == 256) | (i4 == 4);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationLoaded$lambda$17$lambda$16(function1, async);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationLoaded$lambda$20(async, payload, function1, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState NetworkingSaveToLinkVerificationLoaded$lambda$10$lambda$9() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean NetworkingSaveToLinkVerificationLoaded$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NetworkingSaveToLinkVerificationLoaded$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingSaveToLinkVerificationLoaded$lambda$17$lambda$16(Function1 function1, Async async) {
        function1.invoke(((Async.Fail) async).getError());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingSaveToLinkVerificationLoaded$lambda$19$lambda$18(Async async, final NetworkingSaveToLinkVerificationState.Payload payload, FocusRequester focusRequester, MutableState mutableState, LazyListScope LazyLayout) {
        Intrinsics.checkNotNullParameter(LazyLayout, "$this$LazyLayout");
        LazyListScope.item$default(LazyLayout, null, null, ComposableLambdaKt.composableLambdaInstance(-1279854810, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$6$1$1
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
                    ComposerKt.traceEventStart(-1279854810, i, -1, "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationLoaded.<anonymous>.<anonymous>.<anonymous> (NetworkingSaveToLinkVerificationScreen.kt:121)");
                }
                NetworkingSaveToLinkVerificationScreenKt.Header(payload, composer, OTPElement.$stable);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyLayout, null, null, ComposableLambdaKt.composableLambdaInstance(601289103, true, new NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$6$1$2(focusRequester, payload, async, mutableState)), 3, null);
        if (async instanceof Async.Loading) {
            LazyListScope.item$default(LazyLayout, null, null, ComposableSingletons$NetworkingSaveToLinkVerificationScreenKt.INSTANCE.m7458getLambda2$financial_connections_release(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Header(final NetworkingSaveToLinkVerificationState.Payload payload, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2107565545);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(payload) : composerStartRestartGroup.changedInstance(payload) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2107565545, i2, -1, "com.stripe.android.financialconnections.features.networkingsavetolinkverification.Header (NetworkingSaveToLinkVerificationScreen.kt:163)");
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
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_networking_save_to_link_verification_title, composerStartRestartGroup, 0), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getHeadingXLarge(), composer2, 0, 0, 65530);
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_networking_verification_desc, new Object[]{payload.getPhoneNumber()}, composer2, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer2, 6).getBodyMedium(), composer2, 0, 0, 65534);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingSaveToLinkVerificationScreenKt.Header$lambda$22(payload, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: NetworkingSaveToLinkVerificationScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$SaveToLinkVerificationPreview$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ NetworkingSaveToLinkVerificationState $state;

        AnonymousClass1(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState) {
            this.$state = networkingSaveToLinkVerificationState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(903169548, i, -1, "com.stripe.android.financialconnections.features.networkingsavetolinkverification.SaveToLinkVerificationPreview.<anonymous> (NetworkingSaveToLinkVerificationScreen.kt:189)");
                }
                NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState = this.$state;
                composer.startReplaceGroup(705970961);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$SaveToLinkVerificationPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(705972241);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$SaveToLinkVerificationPreview$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NetworkingSaveToLinkVerificationScreenKt.AnonymousClass1.invoke$lambda$3$lambda$2((Throwable) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationContent(networkingSaveToLinkVerificationState, function0, (Function1) objRememberedValue2, composer, OTPElement.$stable | 432);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final void SaveToLinkVerificationPreview(@PreviewParameter(provider = NetworkingSaveToLinkVerificationPreviewParameterProvider.class) final NetworkingSaveToLinkVerificationState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2010553443);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2010553443, i2, -1, "com.stripe.android.financialconnections.features.networkingsavetolinkverification.SaveToLinkVerificationPreview (NetworkingSaveToLinkVerificationScreen.kt:187)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(903169548, true, new AnonymousClass1(state), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingSaveToLinkVerificationScreenKt.SaveToLinkVerificationPreview$lambda$23(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
