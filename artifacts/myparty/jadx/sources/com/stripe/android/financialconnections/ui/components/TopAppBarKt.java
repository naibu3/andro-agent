package com.stripe.android.financialconnections.ui.components;

import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AppBarDefaults;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
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
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.theme.ColorKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.uicore.navigation.KeyboardController;
import com.stripe.android.uicore.navigation.KeyboardControllerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TopAppBar.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0001¢\u0006\u0002\u0010\u000e\u001aS\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001a'\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0003¢\u0006\u0002\u0010!\u001a+\u0010\"\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0003¢\u0006\u0002\u0010#\u001a%\u0010$\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010&\u001a\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015*\u00020(H\u0003¢\u0006\u0002\u0010)\u001a\r\u0010*\u001a\u00020\tH\u0001¢\u0006\u0002\u0010+\u001a\r\u0010,\u001a\u00020\tH\u0001¢\u0006\u0002\u0010+\u001a\r\u0010-\u001a\u00020\tH\u0001¢\u0006\u0002\u0010+\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006.²\u0006\n\u0010/\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"LOGO_WIDTH", "Landroidx/compose/ui/unit/Dp;", "F", "LOGO_HEIGHT", "PILL_HORIZONTAL_PADDING", "PILL_VERTICAL_PADDING", "PILL_RADIUS", "", "FinancialConnectionsTopAppBar", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;", "onCloseClick", "Lkotlin/Function0;", "(Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "hideStripeLogo", "", "testMode", "theme", "Lcom/stripe/android/financialconnections/ui/theme/Theme;", "elevation", "Landroidx/compose/runtime/State;", "allowBackNavigation", "modifier", "Landroidx/compose/ui/Modifier;", "(ZZLcom/stripe/android/financialconnections/ui/theme/Theme;Landroidx/compose/runtime/State;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BackButton", "scope", "Lkotlinx/coroutines/CoroutineScope;", "keyboardController", "Lcom/stripe/android/uicore/navigation/KeyboardController;", "localBackPressed", "Landroidx/activity/OnBackPressedDispatcher;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/uicore/navigation/KeyboardController;Landroidx/activity/OnBackPressedDispatcher;Landroidx/compose/runtime/Composer;I)V", "CloseButton", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/uicore/navigation/KeyboardController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Title", "testmode", "(ZZLcom/stripe/android/financialconnections/ui/theme/Theme;Landroidx/compose/runtime/Composer;I)V", "collectCanShowBackIconAsState", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "TopAppBarWithStripeLogoPreview", "(Landroidx/compose/runtime/Composer;I)V", "TopAppBarWithLinkLogoPreview", "TopAppBarNoStripeLogoPreview", "financial-connections_release", "canShowBackIcon"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TopAppBarKt {
    private static final float PILL_RADIUS = 8.0f;
    private static final float LOGO_WIDTH = Dp.m6117constructorimpl(50);
    private static final float LOGO_HEIGHT = Dp.m6117constructorimpl(20);
    private static final float PILL_HORIZONTAL_PADDING = Dp.m6117constructorimpl(4);
    private static final float PILL_VERTICAL_PADDING = Dp.m6117constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackButton$lambda$7(CoroutineScope coroutineScope, KeyboardController keyboardController, OnBackPressedDispatcher onBackPressedDispatcher, int i, Composer composer, int i2) {
        BackButton(coroutineScope, keyboardController, onBackPressedDispatcher, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CloseButton$lambda$10(CoroutineScope coroutineScope, KeyboardController keyboardController, Function0 function0, int i, Composer composer, int i2) {
        CloseButton(coroutineScope, keyboardController, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinancialConnectionsTopAppBar$lambda$0(TopAppBarState topAppBarState, Function0 function0, int i, Composer composer, int i2) {
        FinancialConnectionsTopAppBar(topAppBarState, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinancialConnectionsTopAppBar$lambda$4(boolean z, boolean z2, Theme theme, State state, boolean z3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FinancialConnectionsTopAppBar(z, z2, theme, state, z3, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$14(boolean z, boolean z2, Theme theme, int i, Composer composer, int i2) {
        Title(z, z2, theme, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBarNoStripeLogoPreview$lambda$22(int i, Composer composer, int i2) {
        TopAppBarNoStripeLogoPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBarWithLinkLogoPreview$lambda$21(int i, Composer composer, int i2) {
        TopAppBarWithLinkLogoPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBarWithStripeLogoPreview$lambda$20(int i, Composer composer, int i2) {
        TopAppBarWithStripeLogoPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FinancialConnectionsTopAppBar(final TopAppBarState state, Function0<Unit> onCloseClick, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1366845633);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366845633, i2, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar (TopAppBar.kt:65)");
            }
            function0 = onCloseClick;
            FinancialConnectionsTopAppBar(state.getHideStripeLogo() || state.getForceHideStripeLogo(), state.isTestMode(), state.getTheme(), AnimateAsStateKt.m467animateDpAsStateAjpBEmI(state.isElevated() ? AppBarDefaults.INSTANCE.m1758getTopAppBarElevationD9Ej5fM() : Dp.m6117constructorimpl(0), null, "TopAppBarElevation", null, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 10), state.getAllowBackNavigation(), function0, null, composerStartRestartGroup, (i2 << 12) & 458752, 64);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onCloseClick;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopAppBarKt.FinancialConnectionsTopAppBar$lambda$0(state, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FinancialConnectionsTopAppBar(final boolean z, final boolean z2, final Theme theme, final State<Dp> state, final boolean z3, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        boolean z4;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1272084064);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(theme) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1272084064, i3, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar (TopAppBar.kt:90)");
                }
                OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalOnBackPressedDispatcherOwner.$stable);
                final OnBackPressedDispatcher onBackPressedDispatcher = current == null ? current.getOnBackPressedDispatcher() : null;
                ProvidableCompositionLocal<NavHostController> localNavHostController = FinancialConnectionsSheetNativeActivityKt.getLocalNavHostController();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localNavHostController);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                State<Boolean> stateCollectCanShowBackIconAsState = collectCanShowBackIconAsState((NavHostController) objConsume, composerStartRestartGroup, 0);
                final KeyboardController keyboardControllerRememberKeyboardController = KeyboardControllerKt.rememberKeyboardController(composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                float fM6117constructorimpl = Dp.m6117constructorimpl(0);
                composerStartRestartGroup.startReplaceGroup(-697768439);
                ComposableLambda composableLambdaRememberComposableLambda = (FinancialConnectionsTopAppBar$lambda$1(stateCollectCanShowBackIconAsState) || !z3) ? null : ComposableLambdaKt.rememberComposableLambda(1218887284, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt.FinancialConnectionsTopAppBar.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1218887284, i5, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar.<anonymous> (TopAppBar.kt:111)");
                            }
                            TopAppBarKt.BackButton(coroutineScope, keyboardControllerRememberKeyboardController, onBackPressedDispatcher, composer3, KeyboardController.$stable << 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup.endReplaceGroup();
                long jM7630getBackground0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7630getBackground0d7_KjU();
                long jM7643getTextAction0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7643getTextAction0d7_KjU();
                composerStartRestartGroup.startReplaceGroup(-697746290);
                z4 = (i3 & 7168) != 2048;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TopAppBarKt.FinancialConnectionsTopAppBar$lambda$3$lambda$2(state, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue2);
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = companion;
                AppBarKt.m1765TopAppBarxWeB9s(ComposableLambdaKt.rememberComposableLambda(-894934244, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt.FinancialConnectionsTopAppBar.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-894934244, i5, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar.<anonymous> (TopAppBar.kt:102)");
                            }
                            TopAppBarKt.Title(z, z2, theme, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), modifierGraphicsLayer, composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(802859473, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt.FinancialConnectionsTopAppBar.5
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope TopAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                        if ((i5 & 17) != 16 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802859473, i5, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar.<anonymous> (TopAppBar.kt:121)");
                            }
                            TopAppBarKt.CloseButton(coroutineScope, keyboardControllerRememberKeyboardController, function0, composer3, KeyboardController.$stable << 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), jM7630getBackground0d7_KjU, jM7643getTextAction0d7_KjU, fM6117constructorimpl, composer2, 1575942, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TopAppBarKt.FinancialConnectionsTopAppBar$lambda$4(z, z2, theme, state, z3, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            OnBackPressedDispatcherOwner current2 = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalOnBackPressedDispatcherOwner.$stable);
            if (current2 == null) {
            }
            ProvidableCompositionLocal<NavHostController> localNavHostController2 = FinancialConnectionsSheetNativeActivityKt.getLocalNavHostController();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localNavHostController2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            State<Boolean> stateCollectCanShowBackIconAsState2 = collectCanShowBackIconAsState((NavHostController) objConsume2, composerStartRestartGroup, 0);
            final KeyboardController keyboardControllerRememberKeyboardController2 = KeyboardControllerKt.rememberKeyboardController(composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            float fM6117constructorimpl2 = Dp.m6117constructorimpl(0);
            composerStartRestartGroup.startReplaceGroup(-697768439);
            if (FinancialConnectionsTopAppBar$lambda$1(stateCollectCanShowBackIconAsState2)) {
                composerStartRestartGroup.endReplaceGroup();
                long jM7630getBackground0d7_KjU2 = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7630getBackground0d7_KjU();
                long jM7643getTextAction0d7_KjU2 = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7643getTextAction0d7_KjU();
                composerStartRestartGroup.startReplaceGroup(-697746290);
                if ((i3 & 7168) != 2048) {
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TopAppBarKt.FinancialConnectionsTopAppBar$lambda$3$lambda$2(state, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue2);
                    composer2 = composerStartRestartGroup;
                    Modifier modifier42 = companion;
                    AppBarKt.m1765TopAppBarxWeB9s(ComposableLambdaKt.rememberComposableLambda(-894934244, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt.FinancialConnectionsTopAppBar.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-894934244, i5, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar.<anonymous> (TopAppBar.kt:102)");
                                }
                                TopAppBarKt.Title(z, z2, theme, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54), modifierGraphicsLayer2, composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(802859473, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt.FinancialConnectionsTopAppBar.5
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope TopAppBar, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                            if ((i5 & 17) != 16 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(802859473, i5, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar.<anonymous> (TopAppBar.kt:121)");
                                }
                                TopAppBarKt.CloseButton(coroutineScope2, keyboardControllerRememberKeyboardController2, function0, composer3, KeyboardController.$stable << 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54), jM7630getBackground0d7_KjU2, jM7643getTextAction0d7_KjU2, fM6117constructorimpl2, composer2, 1575942, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinancialConnectionsTopAppBar$lambda$3$lambda$2(State state, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setShadowElevation(graphicsLayer.mo712toPx0680j_4(((Dp) state.getValue()).m6131unboximpl()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackButton(final CoroutineScope coroutineScope, final KeyboardController keyboardController, final OnBackPressedDispatcher onBackPressedDispatcher, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1797009785);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(coroutineScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(keyboardController) : composerStartRestartGroup.changedInstance(keyboardController) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackPressedDispatcher) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1797009785, i2, -1, "com.stripe.android.financialconnections.ui.components.BackButton (TopAppBar.kt:141)");
            }
            composerStartRestartGroup.startReplaceGroup(-1075573607);
            boolean zChangedInstance = ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(keyboardController))) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(onBackPressedDispatcher);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopAppBarKt.BackButton$lambda$6$lambda$5(coroutineScope, keyboardController, onBackPressedDispatcher);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, ComposableSingletons$TopAppBarKt.INSTANCE.m7571getLambda1$financial_connections_release(), composerStartRestartGroup, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopAppBarKt.BackButton$lambda$7(coroutineScope, keyboardController, onBackPressedDispatcher, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackButton$lambda$6$lambda$5(CoroutineScope coroutineScope, KeyboardController keyboardController, OnBackPressedDispatcher onBackPressedDispatcher) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TopAppBarKt$BackButton$1$1$1(keyboardController, onBackPressedDispatcher, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CloseButton(final CoroutineScope coroutineScope, final KeyboardController keyboardController, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(771534685);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(coroutineScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(keyboardController) : composerStartRestartGroup.changedInstance(keyboardController) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(771534685, i2, -1, "com.stripe.android.financialconnections.ui.components.CloseButton (TopAppBar.kt:166)");
            }
            composerStartRestartGroup.startReplaceGroup(-450495523);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(keyboardController))) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopAppBarKt.CloseButton$lambda$9$lambda$8(coroutineScope, keyboardController, function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, ComposableSingletons$TopAppBarKt.INSTANCE.m7572getLambda2$financial_connections_release(), composerStartRestartGroup, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopAppBarKt.CloseButton$lambda$10(coroutineScope, keyboardController, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CloseButton$lambda$9$lambda$8(CoroutineScope coroutineScope, KeyboardController keyboardController, Function0 function0) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TopAppBarKt$CloseButton$1$1$1(keyboardController, function0, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(final boolean z, final boolean z2, final Theme theme, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(501404909);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(theme) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(501404909, i2, -1, "com.stripe.android.financialconnections.ui.components.Title (TopAppBar.kt:188)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
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
            composerStartRestartGroup.startReplaceGroup(-1951471789);
            if (!z) {
                Modifier modifierM1067sizeVpY3zN4 = SizeKt.m1067sizeVpY3zN4(Modifier.INSTANCE, LOGO_WIDTH, LOGO_HEIGHT);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(theme.getIcon(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1951465027);
                ColorFilter colorFilterM3698tintxETnrds$default = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0) ? ColorFilter.Companion.m3698tintxETnrds$default(ColorFilter.INSTANCE, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0, 2, null) : null;
                composerStartRestartGroup.endReplaceGroup();
                ImageKt.Image(painterPainterResource, (String) null, modifierM1067sizeVpY3zN4, (Alignment) null, (ContentScale) null, 0.0f, colorFilterM3698tintxETnrds$default, composerStartRestartGroup, 432, 56);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1951454187);
            if (z2) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1951451303);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TopAppBarKt.Title$lambda$13$lambda$12$lambda$11((DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                androidx.compose.material.TextKt.m2076Text4IGK_g("Test", PaddingKt.m1021paddingVpY3zN4(DrawModifierKt.drawBehind(companion2, (Function1) objRememberedValue), PILL_HORIZONTAL_PADDING, PILL_VERTICAL_PADDING), Color.INSTANCE.m3694getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelMediumEmphasized(), composerStartRestartGroup, 390, 0, 65528);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopAppBarKt.Title$lambda$14(z, z2, theme, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$13$lambda$12$lambda$11(DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m4209drawRoundRectuAw5IA$default(drawBehind, ColorKt.getAttention300(), 0L, 0L, CornerRadiusKt.CornerRadius$default(8.0f, 0.0f, 2, null), null, 0.0f, null, 0, 246, null);
        return Unit.INSTANCE;
    }

    private static final State<Boolean> collectCanShowBackIconAsState(final NavHostController navHostController, Composer composer, int i) {
        composer.startReplaceGroup(-756540468);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-756540468, i, -1, "com.stripe.android.financialconnections.ui.components.collectCanShowBackIconAsState (TopAppBar.kt:225)");
        }
        composer.startReplaceGroup(-1135362543);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composer.endReplaceGroup();
        Unit unit = Unit.INSTANCE;
        composer.startReplaceGroup(-1135360048);
        boolean zChangedInstance = composer.changedInstance(navHostController);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TopAppBarKt.collectCanShowBackIconAsState$lambda$19$lambda$18(navHostController, mutableState, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult collectCanShowBackIconAsState$lambda$19$lambda$18(final NavHostController navHostController, final MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final NavController.OnDestinationChangedListener onDestinationChangedListener = new NavController.OnDestinationChangedListener() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda6
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public final void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle) {
                TopAppBarKt.collectCanShowBackIconAsState$lambda$19$lambda$18$lambda$16(mutableState, navController, navDestination, bundle);
            }
        };
        navHostController.addOnDestinationChangedListener(onDestinationChangedListener);
        return new DisposableEffectResult() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$collectCanShowBackIconAsState$lambda$19$lambda$18$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                navHostController.removeOnDestinationChangedListener(onDestinationChangedListener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectCanShowBackIconAsState$lambda$19$lambda$18$lambda$16(MutableState mutableState, NavController controller, NavDestination destination, Bundle bundle) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (Intrinsics.areEqual(destination.getNavigatorName(), "BottomSheetNavigator")) {
            return;
        }
        mutableState.setValue(Boolean.valueOf(controller.getPreviousBackStackEntry() != null));
    }

    public static final void TopAppBarWithStripeLogoPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1674163385);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1674163385, i, -1, "com.stripe.android.financialconnections.ui.components.TopAppBarWithStripeLogoPreview (TopAppBar.kt:245)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableSingletons$TopAppBarKt.INSTANCE.m7573getLambda3$financial_connections_release(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopAppBarKt.TopAppBarWithStripeLogoPreview$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TopAppBarWithLinkLogoPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1633926252);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1633926252, i, -1, "com.stripe.android.financialconnections.ui.components.TopAppBarWithLinkLogoPreview (TopAppBar.kt:256)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableSingletons$TopAppBarKt.INSTANCE.m7574getLambda4$financial_connections_release(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopAppBarKt.TopAppBarWithLinkLogoPreview$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TopAppBarNoStripeLogoPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2059271070);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2059271070, i, -1, "com.stripe.android.financialconnections.ui.components.TopAppBarNoStripeLogoPreview (TopAppBar.kt:270)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableSingletons$TopAppBarKt.INSTANCE.m7575getLambda5$financial_connections_release(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TopAppBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopAppBarKt.TopAppBarNoStripeLogoPreview$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean FinancialConnectionsTopAppBar$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
