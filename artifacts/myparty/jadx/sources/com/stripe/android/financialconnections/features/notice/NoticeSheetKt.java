package com.stripe.android.financialconnections.features.notice;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt;
import com.stripe.android.financialconnections.features.notice.NoticeSheetKt;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NoticeSheet.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001aO\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, d2 = {"NoticeSheet", "", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V", "NoticeSheetContent", UriUtil.LOCAL_CONTENT_SCHEME, "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", "onClickableTextClick", "Lkotlin/Function1;", "", "onConfirmModalClick", "Lkotlin/Function0;", "onViewEffectLaunched", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NoticeSheetPreview", "(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NoticeSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoticeSheet$lambda$8(NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        NoticeSheet(navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoticeSheetContent$lambda$14(NoticeSheetState.NoticeSheetContent noticeSheetContent, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NoticeSheetContent(noticeSheetContent, function1, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoticeSheetPreview$lambda$15(NoticeSheetState.NoticeSheetContent noticeSheetContent, int i, Composer composer, int i2) {
        NoticeSheetPreview(noticeSheetContent, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void NoticeSheet(final NavBackStackEntry backStackEntry, Composer composer, final int i) {
        int i2;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-218687548);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(backStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-218687548, i2, -1, "com.stripe.android.financialconnections.features.notice.NoticeSheet (NoticeSheet.kt:26)");
            }
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = NoticeSheetViewModel.INSTANCE.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent(), backStackEntry.getArguments());
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(NoticeSheetViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            NoticeSheetViewModel noticeSheetViewModel = (NoticeSheetViewModel) ((FinancialConnectionsViewModel) viewModel);
            ProvidableCompositionLocal<UriHandler> localUriHandler = CompositionLocalsKt.getLocalUriHandler();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localUriHandler);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            UriHandler uriHandler = (UriHandler) objConsume;
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(noticeSheetViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1);
            NoticeSheetState.ViewEffect viewEffect = NoticeSheet$lambda$1(stateCollectAsState).getViewEffect();
            composerStartRestartGroup.startReplaceGroup(-1185293750);
            if (viewEffect != null) {
                composerStartRestartGroup.startReplaceGroup(102313580);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewEffect) | composerStartRestartGroup.changedInstance(uriHandler);
                NoticeSheetKt$NoticeSheet$1$1$1 noticeSheetKt$NoticeSheet$1$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || noticeSheetKt$NoticeSheet$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    noticeSheetKt$NoticeSheet$1$1$1RememberedValue = new NoticeSheetKt$NoticeSheet$1$1$1(viewEffect, uriHandler, null);
                    composerStartRestartGroup.updateRememberedValue(noticeSheetKt$NoticeSheet$1$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(viewEffect, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) noticeSheetKt$NoticeSheet$1$1$1RememberedValue, composerStartRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            NoticeSheetState.NoticeSheetContent content = NoticeSheet$lambda$1(stateCollectAsState).getContent();
            if (content != null) {
                composerStartRestartGroup.startReplaceGroup(102321813);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(noticeSheetViewModel);
                NoticeSheetKt$NoticeSheet$2$1$1 noticeSheetKt$NoticeSheet$2$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || noticeSheetKt$NoticeSheet$2$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    noticeSheetKt$NoticeSheet$2$1$1RememberedValue = new NoticeSheetKt$NoticeSheet$2$1$1(noticeSheetViewModel);
                    composerStartRestartGroup.updateRememberedValue(noticeSheetKt$NoticeSheet$2$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function1 function1 = (Function1) ((KFunction) noticeSheetKt$NoticeSheet$2$1$1RememberedValue);
                composerStartRestartGroup.startReplaceGroup(102324084);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(noticeSheetViewModel);
                NoticeSheetKt$NoticeSheet$2$2$1 noticeSheetKt$NoticeSheet$2$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || noticeSheetKt$NoticeSheet$2$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    noticeSheetKt$NoticeSheet$2$2$1RememberedValue = new NoticeSheetKt$NoticeSheet$2$2$1(noticeSheetViewModel);
                    composerStartRestartGroup.updateRememberedValue(noticeSheetKt$NoticeSheet$2$2$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0 function0 = (Function0) ((KFunction) noticeSheetKt$NoticeSheet$2$2$1RememberedValue);
                composerStartRestartGroup.startReplaceGroup(102326353);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(noticeSheetViewModel);
                NoticeSheetKt$NoticeSheet$2$3$1 noticeSheetKt$NoticeSheet$2$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || noticeSheetKt$NoticeSheet$2$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    noticeSheetKt$NoticeSheet$2$3$1RememberedValue = new NoticeSheetKt$NoticeSheet$2$3$1(noticeSheetViewModel);
                    composerStartRestartGroup.updateRememberedValue(noticeSheetKt$NoticeSheet$2$3$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                NoticeSheetContent(content, function1, function0, (Function0) ((KFunction) noticeSheetKt$NoticeSheet$2$3$1RememberedValue), null, composerStartRestartGroup, 0, 16);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NoticeSheetKt.NoticeSheet$lambda$8(backStackEntry, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NoticeSheetContent(final NoticeSheetState.NoticeSheetContent noticeSheetContent, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function03;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(378749029);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(noticeSheetContent) : composerStartRestartGroup.changedInstance(noticeSheetContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function03 = function02;
        } else {
            function03 = function02;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
            }
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(378749029, i3, -1, "com.stripe.android.financialconnections.features.notice.NoticeSheetContent (NoticeSheet.kt:59)");
                }
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (!(noticeSheetContent instanceof NoticeSheetState.NoticeSheetContent.Legal)) {
                    composerStartRestartGroup.startReplaceGroup(-144969852);
                    ModalBottomSheetContentKt.LegalDetailsBottomSheetContent(((NoticeSheetState.NoticeSheetContent.Legal) noticeSheetContent).getLegalDetails(), function1, function0, composerStartRestartGroup, i3 & PointerIconCompat.TYPE_TEXT);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (noticeSheetContent instanceof NoticeSheetState.NoticeSheetContent.DataAccess) {
                    composerStartRestartGroup.startReplaceGroup(-144724022);
                    ModalBottomSheetContentKt.DataAccessBottomSheetContent(((NoticeSheetState.NoticeSheetContent.DataAccess) noticeSheetContent).getDataAccess(), function1, function0, composerStartRestartGroup, i3 & PointerIconCompat.TYPE_TEXT);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (noticeSheetContent instanceof NoticeSheetState.NoticeSheetContent.Generic) {
                    composerStartRestartGroup.startReplaceGroup(965170500);
                    FinancialConnectionsGenericInfoScreen generic = ((NoticeSheetState.NoticeSheetContent.Generic) noticeSheetContent).getGeneric();
                    composerStartRestartGroup.startReplaceGroup(965177607);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ModalBottomSheetContentKt.GenericBottomSheetContent(generic, function1, function0, (Function0) objRememberedValue, composerStartRestartGroup, (i3 & 896) | (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 3072);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(noticeSheetContent instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired)) {
                        composerStartRestartGroup.startReplaceGroup(965154726);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(965189436);
                    FinancialConnectionsGenericInfoScreen generic2 = ((NoticeSheetState.NoticeSheetContent.UpdateRequired) noticeSheetContent).getGeneric();
                    composerStartRestartGroup.startReplaceGroup(965196583);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ModalBottomSheetContentKt.GenericBottomSheetContent(generic2, function1, function0, (Function0) objRememberedValue2, composerStartRestartGroup, (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 3072 | (i3 & 896));
                    composerStartRestartGroup.endReplaceGroup();
                }
                function03.invoke();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function0<Unit> function04 = function03;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NoticeSheetKt.NoticeSheetContent$lambda$14(noticeSheetContent, function1, function0, function04, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3150constructorimpl.getInserting()) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                if (!(noticeSheetContent instanceof NoticeSheetState.NoticeSheetContent.Legal)) {
                }
                function03.invoke();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: NoticeSheet.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.notice.NoticeSheetKt$NoticeSheetPreview$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ NoticeSheetState.NoticeSheetContent $content;

        AnonymousClass1(NoticeSheetState.NoticeSheetContent noticeSheetContent) {
            this.$content = noticeSheetContent;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(738895759, i, -1, "com.stripe.android.financialconnections.features.notice.NoticeSheetPreview.<anonymous> (NoticeSheet.kt:100)");
                }
                NoticeSheetState.NoticeSheetContent noticeSheetContent = this.$content;
                composer.startReplaceGroup(1148265142);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetKt$NoticeSheetPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NoticeSheetKt.AnonymousClass1.invoke$lambda$1$lambda$0((String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1148266358);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetKt$NoticeSheetPreview$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1148267606);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetKt$NoticeSheetPreview$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                NoticeSheetKt.NoticeSheetContent(noticeSheetContent, function1, function0, (Function0) objRememberedValue3, null, composer, 3504, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final void NoticeSheetPreview(@PreviewParameter(provider = NoticeSheetPreviewParameterProvider.class) final NoticeSheetState.NoticeSheetContent content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1583927710);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(content) : composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1583927710, i2, -1, "com.stripe.android.financialconnections.features.notice.NoticeSheetPreview (NoticeSheet.kt:98)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(738895759, true, new AnonymousClass1(content), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.notice.NoticeSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NoticeSheetKt.NoticeSheetPreview$lambda$15(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final NoticeSheetState NoticeSheet$lambda$1(State<NoticeSheetState> state) {
        return state.getValue();
    }
}
