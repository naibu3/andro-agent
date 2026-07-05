package com.stripe.android.financialconnections.features.networkinglinkverification;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
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

/* compiled from: NetworkingLinkVerificationScreen.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a)\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\t\u001a7\u0010\n\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {"NetworkingLinkVerificationScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "NetworkingLinkVerificationContent", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;", "onCloseFromErrorClick", "Lkotlin/Function1;", "", "(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "NetworkingLinkVerificationLoaded", "confirmVerificationAsync", "Lcom/stripe/android/financialconnections/presentation/Async;", "payload", "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Header", "(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;Landroidx/compose/runtime/Composer;I)V", "NetworkingLinkVerificationPreview", "(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release", "shouldRequestFocus", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkingLinkVerificationScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$19(NetworkingLinkVerificationState.Payload payload, int i, Composer composer, int i2) {
        Header(payload, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkVerificationContent$lambda$5(NetworkingLinkVerificationState networkingLinkVerificationState, Function1 function1, int i, Composer composer, int i2) {
        NetworkingLinkVerificationContent(networkingLinkVerificationState, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkVerificationLoaded$lambda$17(Async async, NetworkingLinkVerificationState.Payload payload, Function1 function1, int i, Composer composer, int i2) {
        NetworkingLinkVerificationLoaded(async, payload, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkVerificationPreview$lambda$20(NetworkingLinkVerificationState networkingLinkVerificationState, int i, Composer composer, int i2) {
        NetworkingLinkVerificationPreview(networkingLinkVerificationState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkVerificationScreen$lambda$1(int i, Composer composer, int i2) {
        NetworkingLinkVerificationScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void NetworkingLinkVerificationScreen(Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(1447580445);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1447580445, i, -1, "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreen (NetworkingLinkVerificationScreen.kt:49)");
            }
            NetworkingLinkVerificationViewModel.Companion companion = NetworkingLinkVerificationViewModel.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = companion.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent());
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(NetworkingLinkVerificationViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModelParentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(composerStartRestartGroup, 0);
            NetworkingLinkVerificationState networkingLinkVerificationState = (NetworkingLinkVerificationState) StateFlowsComposeKt.collectAsState(((NetworkingLinkVerificationViewModel) ((FinancialConnectionsViewModel) viewModel)).getStateFlow(), null, composerStartRestartGroup, 0, 1).getValue();
            composerStartRestartGroup.startReplaceGroup(709720926);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(financialConnectionsSheetNativeViewModelParentViewModel);
            NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationScreen$1$1 networkingLinkVerificationScreenKt$NetworkingLinkVerificationScreen$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || networkingLinkVerificationScreenKt$NetworkingLinkVerificationScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                networkingLinkVerificationScreenKt$NetworkingLinkVerificationScreen$1$1RememberedValue = new NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationScreen$1$1(financialConnectionsSheetNativeViewModelParentViewModel);
                composerStartRestartGroup.updateRememberedValue(networkingLinkVerificationScreenKt$NetworkingLinkVerificationScreen$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            NetworkingLinkVerificationContent(networkingLinkVerificationState, (Function1) ((KFunction) networkingLinkVerificationScreenKt$NetworkingLinkVerificationScreen$1$1RememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationScreen$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NetworkingLinkVerificationContent(final NetworkingLinkVerificationState networkingLinkVerificationState, final Function1<? super Throwable, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1923157657);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(networkingLinkVerificationState) : composerStartRestartGroup.changedInstance(networkingLinkVerificationState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1923157657, i2, -1, "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationContent (NetworkingLinkVerificationScreen.kt:63)");
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
            final Async<NetworkingLinkVerificationState.Payload> payload = networkingLinkVerificationState.getPayload();
            if (Intrinsics.areEqual(payload, Async.Uninitialized.INSTANCE) || (payload instanceof Async.Loading)) {
                composerStartRestartGroup.startReplaceGroup(1612580742);
                LoadingContentKt.FullScreenGenericLoading(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (payload instanceof Async.Success) {
                composerStartRestartGroup.startReplaceGroup(-1549546082);
                NetworkingLinkVerificationLoaded(networkingLinkVerificationState.getConfirmVerification(), (NetworkingLinkVerificationState.Payload) ((Async.Success) payload).invoke(), function1, composerStartRestartGroup, (i2 << 3) & 896);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(payload instanceof Async.Fail)) {
                    composerStartRestartGroup.startReplaceGroup(1612578667);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1612590189);
                composerStartRestartGroup.startReplaceGroup(1612590964);
                boolean zChangedInstance = ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) | composerStartRestartGroup.changedInstance(payload);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationContent$lambda$4$lambda$3$lambda$2(function1, payload);
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationContent$lambda$5(networkingLinkVerificationState, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkVerificationContent$lambda$4$lambda$3$lambda$2(Function1 function1, Async async) {
        function1.invoke(((Async.Fail) async).getError());
        return Unit.INSTANCE;
    }

    private static final void NetworkingLinkVerificationLoaded(final Async<Unit> async, final NetworkingLinkVerificationState.Payload payload, final Function1<? super Throwable, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1781283273);
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
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1781283273, i2, -1, "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationLoaded (NetworkingLinkVerificationScreen.kt:83)");
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
            composerStartRestartGroup.startReplaceGroup(-1327503506);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int i3 = i2;
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(-1327501046);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationLoaded$lambda$8$lambda$7();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.startReplaceGroup(-1327499985);
            if (NetworkingLinkVerificationLoaded$lambda$9(mutableState)) {
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1327498286);
                NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$1$1 networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$1$1RememberedValue = new NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$1$1(focusRequester, null);
                    composerStartRestartGroup.updateRememberedValue(networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$1$1RememberedValue, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1327495418);
            int i4 = i3 & 14;
            boolean zChangedInstance = (i4 == 4) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changed(softwareKeyboardController);
            NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1 networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1RememberedValue = new NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1(async, focusManager, softwareKeyboardController, null);
                composerStartRestartGroup.updateRememberedValue(networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(async, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) networkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$2$1RememberedValue, composerStartRestartGroup, i4);
            if (!(async instanceof Async.Fail) || (((Async.Fail) async).getError() instanceof ConfirmVerification.OTPError)) {
                composerStartRestartGroup.startReplaceGroup(1797685702);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(24));
                composerStartRestartGroup.startReplaceGroup(-1327480252);
                boolean zChanged = ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(payload))) | (i4 == 4) | composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationLoaded$lambda$16$lambda$15(async, payload, focusRequester, mutableState, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup = composerStartRestartGroup;
                LayoutKt.LazyLayout(null, null, false, false, false, horizontalOrVerticalM900spacedBy0680j_4, false, null, null, (Function1) objRememberedValue3, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 479);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1797551503);
                composerStartRestartGroup.startReplaceGroup(-1327486710);
                boolean z = ((i3 & 896) == 256) | (i4 == 4);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationLoaded$lambda$14$lambda$13(function1, async);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorContentKt.UnclassifiedErrorContent(false, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationLoaded$lambda$17(async, payload, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NetworkingLinkVerificationLoaded$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState NetworkingLinkVerificationLoaded$lambda$8$lambda$7() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean NetworkingLinkVerificationLoaded$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkVerificationLoaded$lambda$14$lambda$13(Function1 function1, Async async) {
        function1.invoke(((Async.Fail) async).getError());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkingLinkVerificationLoaded$lambda$16$lambda$15(Async async, final NetworkingLinkVerificationState.Payload payload, FocusRequester focusRequester, MutableState mutableState, LazyListScope LazyLayout) {
        Intrinsics.checkNotNullParameter(LazyLayout, "$this$LazyLayout");
        LazyListScope.item$default(LazyLayout, null, null, ComposableLambdaKt.composableLambdaInstance(1679613299, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$1
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
                    ComposerKt.traceEventStart(1679613299, i, -1, "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationLoaded.<anonymous>.<anonymous>.<anonymous> (NetworkingLinkVerificationScreen.kt:107)");
                }
                NetworkingLinkVerificationScreenKt.Header(payload, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyLayout, null, null, ComposableLambdaKt.composableLambdaInstance(1180786524, true, new NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2(focusRequester, payload, async, mutableState)), 3, null);
        if (async instanceof Async.Loading) {
            LazyListScope.item$default(LazyLayout, null, null, ComposableSingletons$NetworkingLinkVerificationScreenKt.INSTANCE.m7453getLambda1$financial_connections_release(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Header(final NetworkingLinkVerificationState.Payload payload, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436553127);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(payload) : composerStartRestartGroup.changedInstance(payload) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436553127, i2, -1, "com.stripe.android.financialconnections.features.networkinglinkverification.Header (NetworkingLinkVerificationScreen.kt:135)");
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
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_networking_verification_title, composerStartRestartGroup, 0), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getHeadingXLarge(), composer2, 0, 0, 65530);
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_networking_verification_desc, new Object[]{payload.getPhoneNumber()}, composer2, 0), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composer2, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer2, 6).getBodyMedium(), composer2, 0, 0, 65530);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkVerificationScreenKt.Header$lambda$19(payload, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: NetworkingLinkVerificationScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationPreview$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ NetworkingLinkVerificationState $state;

        AnonymousClass1(NetworkingLinkVerificationState networkingLinkVerificationState) {
            this.$state = networkingLinkVerificationState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1473089496, i, -1, "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationPreview.<anonymous> (NetworkingLinkVerificationScreen.kt:159)");
                }
                NetworkingLinkVerificationState networkingLinkVerificationState = this.$state;
                composer.startReplaceGroup(1795745885);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NetworkingLinkVerificationScreenKt.AnonymousClass1.invoke$lambda$1$lambda$0((Throwable) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationContent(networkingLinkVerificationState, (Function1) objRememberedValue, composer, 48);
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

    public static final void NetworkingLinkVerificationPreview(@PreviewParameter(provider = NetworkingLinkVerificationPreviewParameterProvider.class) final NetworkingLinkVerificationState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(86986537);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(86986537, i2, -1, "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationPreview (NetworkingLinkVerificationScreen.kt:157)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(1473089496, true, new AnonymousClass1(state), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationPreview$lambda$20(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
