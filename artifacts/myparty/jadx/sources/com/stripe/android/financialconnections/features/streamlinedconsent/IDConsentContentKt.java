package com.stripe.android.financialconnections.features.streamlinedconsent;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.features.generic.GenericScreenKt;
import com.stripe.android.financialconnections.features.generic.GenericScreenState;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IDConsentContent.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001aK\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u0004\u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {"IDConsentContentScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "IDConsentContent", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;", "onPrimaryButtonClick", "Lkotlin/Function0;", "onClickableTextClick", "Lkotlin/Function1;", "", "onCloseFromErrorClick", "", "(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IDConsentContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IDConsentContent$lambda$11(IDConsentContentState iDConsentContentState, Function0 function0, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        IDConsentContent(iDConsentContentState, function0, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IDConsentContentScreen$lambda$6(int i, Composer composer, int i2) {
        IDConsentContentScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void IDConsentContentScreen(Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1042122170);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1042122170, i, -1, "com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentScreen (IDConsentContent.kt:19)");
            }
            IDConsentContentViewModel.Companion companion = IDConsentContentViewModel.INSTANCE;
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IDConsentContentViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            IDConsentContentViewModel iDConsentContentViewModel = (IDConsentContentViewModel) ((FinancialConnectionsViewModel) viewModel);
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModelParentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(composerStartRestartGroup, 0);
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(iDConsentContentViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1);
            ProvidableCompositionLocal<UriHandler> localUriHandler = CompositionLocalsKt.getLocalUriHandler();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localUriHandler);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            UriHandler uriHandler = (UriHandler) objConsume;
            IDConsentContentState.ViewEffect viewEffect = IDConsentContentScreen$lambda$0(stateCollectAsState).getViewEffect();
            composerStartRestartGroup.startReplaceGroup(1818789996);
            if (viewEffect != null) {
                composerStartRestartGroup.startReplaceGroup(42254);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewEffect) | composerStartRestartGroup.changedInstance(uriHandler) | composerStartRestartGroup.changedInstance(iDConsentContentViewModel);
                IDConsentContentKt$IDConsentContentScreen$1$1$1 iDConsentContentKt$IDConsentContentScreen$1$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || iDConsentContentKt$IDConsentContentScreen$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    iDConsentContentKt$IDConsentContentScreen$1$1$1RememberedValue = new IDConsentContentKt$IDConsentContentScreen$1$1$1(viewEffect, uriHandler, iDConsentContentViewModel, null);
                    composerStartRestartGroup.updateRememberedValue(iDConsentContentKt$IDConsentContentScreen$1$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(viewEffect, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) iDConsentContentKt$IDConsentContentScreen$1$1$1RememberedValue, composerStartRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            IDConsentContentState iDConsentContentStateIDConsentContentScreen$lambda$0 = IDConsentContentScreen$lambda$0(stateCollectAsState);
            composerStartRestartGroup.startReplaceGroup(1818799586);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(iDConsentContentViewModel);
            IDConsentContentKt$IDConsentContentScreen$2$1 iDConsentContentKt$IDConsentContentScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || iDConsentContentKt$IDConsentContentScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                iDConsentContentKt$IDConsentContentScreen$2$1RememberedValue = new IDConsentContentKt$IDConsentContentScreen$2$1(iDConsentContentViewModel);
                composerStartRestartGroup.updateRememberedValue(iDConsentContentKt$IDConsentContentScreen$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) iDConsentContentKt$IDConsentContentScreen$2$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(1818801479);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(iDConsentContentViewModel);
            IDConsentContentKt$IDConsentContentScreen$3$1 iDConsentContentKt$IDConsentContentScreen$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || iDConsentContentKt$IDConsentContentScreen$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                iDConsentContentKt$IDConsentContentScreen$3$1RememberedValue = new IDConsentContentKt$IDConsentContentScreen$3$1(iDConsentContentViewModel);
                composerStartRestartGroup.updateRememberedValue(iDConsentContentKt$IDConsentContentScreen$3$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) iDConsentContentKt$IDConsentContentScreen$3$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(1818803566);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(financialConnectionsSheetNativeViewModelParentViewModel);
            IDConsentContentKt$IDConsentContentScreen$4$1 iDConsentContentKt$IDConsentContentScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || iDConsentContentKt$IDConsentContentScreen$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                iDConsentContentKt$IDConsentContentScreen$4$1RememberedValue = new IDConsentContentKt$IDConsentContentScreen$4$1(financialConnectionsSheetNativeViewModelParentViewModel);
                composerStartRestartGroup.updateRememberedValue(iDConsentContentKt$IDConsentContentScreen$4$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            IDConsentContent(iDConsentContentStateIDConsentContentScreen$lambda$0, function0, function1, (Function1) ((KFunction) iDConsentContentKt$IDConsentContentScreen$4$1RememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IDConsentContentKt.IDConsentContentScreen$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void IDConsentContent(final IDConsentContentState iDConsentContentState, Function0<Unit> function0, Function1<? super String, Unit> function1, final Function1<? super Throwable, Unit> function12, Composer composer, final int i) {
        int i2;
        Function1<? super String, Unit> function13;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1863994833);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(iDConsentContentState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1863994833, i2, -1, "com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContent (IDConsentContent.kt:49)");
            }
            final Async<IDConsentContentState.Payload> payload = iDConsentContentState.getPayload();
            if ((payload instanceof Async.Uninitialized) || (payload instanceof Async.Loading)) {
                function13 = function1;
                function02 = function0;
                composerStartRestartGroup.startReplaceGroup(-1407836812);
                LoadingContentKt.FullScreenGenericLoading(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (payload instanceof Async.Success) {
                composerStartRestartGroup.startReplaceGroup(-1407755375);
                GenericScreenState genericScreenState = ((IDConsentContentState.Payload) ((Async.Success) payload).invoke()).getGenericScreenState();
                composerStartRestartGroup.startReplaceGroup(785878147);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                function13 = function1;
                GenericScreenKt.GenericScreen(genericScreenState, function0, (Function0) objRememberedValue, function13, composerStartRestartGroup, (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT | ((i2 << 3) & 7168));
                function02 = function0;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                function13 = function1;
                function02 = function0;
                if (!(payload instanceof Async.Fail)) {
                    composerStartRestartGroup.startReplaceGroup(785867821);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1407403711);
                composerStartRestartGroup.startReplaceGroup(785885987);
                boolean zChangedInstance = ((i2 & 7168) == 2048) | composerStartRestartGroup.changedInstance(payload);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IDConsentContentKt.IDConsentContent$lambda$10$lambda$9(function12, payload);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorContentKt.UnclassifiedErrorContent(false, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function13 = function1;
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1<? super String, Unit> function14 = function13;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IDConsentContentKt.IDConsentContent$lambda$11(iDConsentContentState, function02, function14, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IDConsentContent$lambda$10$lambda$9(Function1 function1, Async async) {
        function1.invoke(((Async.Fail) async).getError());
        return Unit.INSTANCE;
    }

    private static final IDConsentContentState IDConsentContentScreen$lambda$0(State<IDConsentContentState> state) {
        return state.getValue();
    }
}
