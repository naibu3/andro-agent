package com.stripe.android.financialconnections.features.exit;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.features.common.ShapedIconKt;
import com.stripe.android.financialconnections.features.exit.ExitState;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.ButtonKt;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: ExitModal.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a9\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"ExitModal", "", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V", "ExitModalContent", "description", "Lcom/stripe/android/financialconnections/ui/TextResource;", "loading", "", "onExit", "Lkotlin/Function0;", "onCancel", "(Lcom/stripe/android/financialconnections/ui/TextResource;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ExitModalPreview", "(Landroidx/compose/runtime/Composer;I)V", "financial-connections_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/exit/ExitState;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExitModalKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExitModal$lambda$5(NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        ExitModal(navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExitModalContent$lambda$6(TextResource textResource, boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ExitModalContent(textResource, z, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExitModalPreview$lambda$7(int i, Composer composer, int i2) {
        ExitModalPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ExitModal(final NavBackStackEntry backStackEntry, Composer composer, final int i) {
        int i2;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(386579450);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(backStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(386579450, i2, -1, "com.stripe.android.financialconnections.features.exit.ExitModal (ExitModal.kt:30)");
            }
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = ExitViewModel.INSTANCE.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent(), backStackEntry.getArguments());
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ExitViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            ExitViewModel exitViewModel = (ExitViewModel) ((FinancialConnectionsViewModel) viewModel);
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(exitViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1);
            ExitState.Payload payloadInvoke = ExitModal$lambda$1(stateCollectAsState).getPayload().invoke();
            if (payloadInvoke != null) {
                TextResource description = payloadInvoke.getDescription();
                boolean closing = ExitModal$lambda$1(stateCollectAsState).getClosing();
                composerStartRestartGroup.startReplaceGroup(1556450329);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(exitViewModel);
                ExitModalKt$ExitModal$1$1$1 exitModalKt$ExitModal$1$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || exitModalKt$ExitModal$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    exitModalKt$ExitModal$1$1$1RememberedValue = new ExitModalKt$ExitModal$1$1$1(exitViewModel);
                    composerStartRestartGroup.updateRememberedValue(exitModalKt$ExitModal$1$1$1RememberedValue);
                }
                Function0 function0 = (Function0) exitModalKt$ExitModal$1$1$1RememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1556451929);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(exitViewModel);
                ExitModalKt$ExitModal$1$2$1 exitModalKt$ExitModal$1$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || exitModalKt$ExitModal$1$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    exitModalKt$ExitModal$1$2$1RememberedValue = new ExitModalKt$ExitModal$1$2$1(exitViewModel);
                    composerStartRestartGroup.updateRememberedValue(exitModalKt$ExitModal$1$2$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ExitModalContent(description, closing, function0, (Function0) ((KFunction) exitModalKt$ExitModal$1$2$1RememberedValue), composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.exit.ExitModalKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExitModalKt.ExitModal$lambda$5(backStackEntry, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExitModalContent(final TextResource textResource, final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(863506792);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(textResource) : composerStartRestartGroup.changedInstance(textResource) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(863506792, i2, -1, "com.stripe.android.financialconnections.features.exit.ExitModalContent (ExitModal.kt:52)");
            }
            float f = 24;
            composer2 = composerStartRestartGroup;
            LayoutKt.Layout(null, PaddingKt.m1016PaddingValuesa9UjIt4(Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(0), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f)), true, false, false, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(83429272, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.exit.ExitModalKt.ExitModalContent.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Layout, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    if ((i3 & 17) != 16 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(83429272, i3, -1, "com.stripe.android.financialconnections.features.exit.ExitModalContent.<anonymous> (ExitModal.kt:62)");
                        }
                        ShapedIconKt.ShapedIcon(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_panel_arrow_right, composer3, 0), null, null, null, StringResources_androidKt.stringResource(R.string.stripe_exit_modal_title, composer3, 0), composer3, 0, 14);
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composer3, 6);
                        TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_exit_modal_title, composer3, 0), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer3, 6).getHeadingLarge(), composer3, 0, 0, 65530);
                        float f2 = 8;
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f2)), composer3, 6);
                        TextKt.m2076Text4IGK_g(textResource.toText(composer3, 0).toString(), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer3, 6).getBodyMedium(), composer3, 0, 0, 65530);
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), composer3, 6);
                        ButtonKt.FinancialConnectionsButton(function02, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, !z, false, ComposableSingletons$ExitModalKt.INSTANCE.m7386getLambda1$financial_connections_release(), composer3, 1572912, 44);
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f2)), composer3, 6);
                        ButtonKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), FinancialConnectionsButton.Type.Secondary.INSTANCE, null, !z, z, ComposableSingletons$ExitModalKt.INSTANCE.m7387getLambda2$financial_connections_release(), composer3, 1573296, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composer2, 805306752, TypedValues.PositionType.TYPE_SIZE_PERCENT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.exit.ExitModalKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExitModalKt.ExitModalContent$lambda$6(textResource, z, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ExitModalPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-211373178);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211373178, i, -1, "com.stripe.android.financialconnections.features.exit.ExitModalPreview (ExitModal.kt:101)");
            }
            ThemeKt.FinancialConnectionsTheme(null, ComposableSingletons$ExitModalKt.INSTANCE.m7389getLambda4$financial_connections_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.exit.ExitModalKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExitModalKt.ExitModalPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ExitState ExitModal$lambda$1(State<ExitState> state) {
        return state.getValue();
    }
}
