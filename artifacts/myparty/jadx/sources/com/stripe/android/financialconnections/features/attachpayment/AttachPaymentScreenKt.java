package com.stripe.android.financialconnections.features.attachpayment;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: AttachPaymentScreen.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001aK\u0010\u0003\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\r\u001aE\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0012"}, d2 = {"AttachPaymentScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "AttachPaymentContent", "attachPayment", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "onSelectAnotherBank", "Lkotlin/Function0;", "onEnterDetailsManually", "onCloseFromErrorClick", "Lkotlin/Function1;", "", "(Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ErrorContent", "error", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AttachPaymentScreenPreview", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AttachPaymentScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttachPaymentContent$lambda$8(Async async, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        AttachPaymentContent(async, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttachPaymentScreen$lambda$6(int i, Composer composer, int i2) {
        AttachPaymentScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttachPaymentScreenPreview$lambda$12(int i, Composer composer, int i2) {
        AttachPaymentScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorContent$lambda$11(Throwable th, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        ErrorContent(th, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AttachPaymentScreen(Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(1538621207);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1538621207, i, -1, "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreen (AttachPaymentScreen.kt:22)");
            }
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = AttachPaymentViewModel.INSTANCE.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent());
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AttachPaymentViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            AttachPaymentViewModel attachPaymentViewModel = (AttachPaymentViewModel) ((FinancialConnectionsViewModel) viewModel);
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModelParentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(composerStartRestartGroup, 0);
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(attachPaymentViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1189778048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(true, (Function0) objRememberedValue, composerStartRestartGroup, 54, 0);
            Async<LinkAccountSessionPaymentAccount> linkPaymentAccount = ((AttachPaymentState) stateCollectAsState.getValue()).getLinkPaymentAccount();
            composerStartRestartGroup.startReplaceGroup(1189781756);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(attachPaymentViewModel);
            AttachPaymentScreenKt$AttachPaymentScreen$2$1 attachPaymentScreenKt$AttachPaymentScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || attachPaymentScreenKt$AttachPaymentScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                attachPaymentScreenKt$AttachPaymentScreen$2$1RememberedValue = new AttachPaymentScreenKt$AttachPaymentScreen$2$1(attachPaymentViewModel);
                composerStartRestartGroup.updateRememberedValue(attachPaymentScreenKt$AttachPaymentScreen$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) attachPaymentScreenKt$AttachPaymentScreen$2$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(1189783839);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(attachPaymentViewModel);
            AttachPaymentScreenKt$AttachPaymentScreen$3$1 attachPaymentScreenKt$AttachPaymentScreen$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || attachPaymentScreenKt$AttachPaymentScreen$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                attachPaymentScreenKt$AttachPaymentScreen$3$1RememberedValue = new AttachPaymentScreenKt$AttachPaymentScreen$3$1(attachPaymentViewModel);
                composerStartRestartGroup.updateRememberedValue(attachPaymentScreenKt$AttachPaymentScreen$3$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function02 = (Function0) ((KFunction) attachPaymentScreenKt$AttachPaymentScreen$3$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(1189785988);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(financialConnectionsSheetNativeViewModelParentViewModel);
            AttachPaymentScreenKt$AttachPaymentScreen$4$1 attachPaymentScreenKt$AttachPaymentScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || attachPaymentScreenKt$AttachPaymentScreen$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                attachPaymentScreenKt$AttachPaymentScreen$4$1RememberedValue = new AttachPaymentScreenKt$AttachPaymentScreen$4$1(financialConnectionsSheetNativeViewModelParentViewModel);
                composerStartRestartGroup.updateRememberedValue(attachPaymentScreenKt$AttachPaymentScreen$4$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AttachPaymentContent(linkPaymentAccount, function0, function02, (Function1) ((KFunction) attachPaymentScreenKt$AttachPaymentScreen$4$1RememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttachPaymentScreenKt.AttachPaymentScreen$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AttachPaymentContent(final Async<LinkAccountSessionPaymentAccount> async, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Throwable, Unit> function1, Composer composer, final int i) {
        int i2;
        final Function1<? super Throwable, Unit> function12;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        Composer composerStartRestartGroup = composer.startRestartGroup(-55472851);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(async) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-55472851, i2, -1, "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentContent (AttachPaymentScreen.kt:41)");
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
            if ((async instanceof Async.Loading) || (async instanceof Async.Uninitialized) || (async instanceof Async.Success)) {
                function12 = function1;
                function03 = function02;
                function04 = function0;
                composerStartRestartGroup.startReplaceGroup(-803106176);
                LoadingContentKt.FullScreenGenericLoading(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(async instanceof Async.Fail)) {
                    composerStartRestartGroup.startReplaceGroup(-803109076);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-803104312);
                ErrorContent(((Async.Fail) async).getError(), function0, function02, function1, composerStartRestartGroup, i2 & 8176);
                function04 = function0;
                function03 = function02;
                function12 = function1;
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
            function12 = function1;
            function03 = function02;
            function04 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttachPaymentScreenKt.AttachPaymentContent$lambda$8(async, function04, function03, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ErrorContent(final Throwable th, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super Throwable, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1107918986);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(th) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1107918986, i2, -1, "com.stripe.android.financialconnections.features.attachpayment.ErrorContent (AttachPaymentScreen.kt:64)");
            }
            if (th instanceof AccountNumberRetrievalError) {
                composerStartRestartGroup.startReplaceGroup(899097791);
                ErrorContentKt.AccountNumberRetrievalErrorContent((AccountNumberRetrievalError) th, function0, function02, composerStartRestartGroup, i2 & PointerIconCompat.TYPE_TEXT);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(899104345);
                composerStartRestartGroup.startReplaceGroup(899105120);
                boolean zChangedInstance = ((i2 & 7168) == 2048) | composerStartRestartGroup.changedInstance(th);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AttachPaymentScreenKt.ErrorContent$lambda$10$lambda$9(function1, th);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorContentKt.UnclassifiedErrorContent(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttachPaymentScreenKt.ErrorContent$lambda$11(th, function0, function02, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorContent$lambda$10$lambda$9(Function1 function1, Throwable th) {
        function1.invoke(th);
        return Unit.INSTANCE;
    }

    public static final void AttachPaymentScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1527947085);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1527947085, i, -1, "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreenPreview (AttachPaymentScreen.kt:82)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableSingletons$AttachPaymentScreenKt.INSTANCE.m7313getLambda1$financial_connections_release(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AttachPaymentScreenKt.AttachPaymentScreenPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
