package com.stripe.android.financialconnections.ui.components;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayoutInfo;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayoutInfoKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayoutKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheet.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\tH\u0001¢\u0006\u0002\u0010\n\u001a(\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\tH\u0001¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"FinancialConnectionsBottomSheetLayout", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;", "modifier", "Landroidx/compose/ui/Modifier;", "onDismissed", "Lkotlin/Function0;", UriUtil.LOCAL_CONTENT_SCHEME, "Landroidx/compose/runtime/Composable;", "(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FinancialConnectionsModalBottomSheetLayout", "bottomSheetNavigator", "Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;", "(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rememberFinancialConnectionsBottomSheetLayoutInfo", "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinancialConnectionsBottomSheetLayout$lambda$0(StripeBottomSheetState stripeBottomSheetState, Modifier modifier, Function0 function0, Function2 function2, int i, int i2, Composer composer, int i3) {
        FinancialConnectionsBottomSheetLayout(stripeBottomSheetState, modifier, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinancialConnectionsModalBottomSheetLayout$lambda$1(BottomSheetNavigator bottomSheetNavigator, Function2 function2, int i, Composer composer, int i2) {
        FinancialConnectionsModalBottomSheetLayout(bottomSheetNavigator, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FinancialConnectionsBottomSheetLayout(StripeBottomSheetState state, Modifier modifier, Function0<Unit> onDismissed, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final StripeBottomSheetState stripeBottomSheetState;
        final Function0<Unit> function0;
        final Function2<? super Composer, ? super Integer, Unit> function2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1648304739);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissed) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1648304739, i3, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsBottomSheetLayout (BottomSheet.kt:21)");
            }
            StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfoRememberFinancialConnectionsBottomSheetLayoutInfo = rememberFinancialConnectionsBottomSheetLayoutInfo(composerStartRestartGroup, 0);
            int i5 = StripeBottomSheetState.$stable | (i3 & 14) | (StripeBottomSheetLayoutInfo.$stable << 3);
            int i6 = i3 << 3;
            StripeBottomSheetLayoutKt.StripeBottomSheetLayout(state, stripeBottomSheetLayoutInfoRememberFinancialConnectionsBottomSheetLayoutInfo, modifier3, onDismissed, content, composerStartRestartGroup, i5 | (i6 & 896) | (i6 & 7168) | (i6 & 57344), 0);
            stripeBottomSheetState = state;
            function0 = onDismissed;
            function2 = content;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function2 = content;
            function0 = onDismissed;
            modifier2 = modifier;
            stripeBottomSheetState = state;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.BottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BottomSheetKt.FinancialConnectionsBottomSheetLayout$lambda$0(stripeBottomSheetState, modifier2, function0, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FinancialConnectionsModalBottomSheetLayout(final BottomSheetNavigator bottomSheetNavigator, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(bottomSheetNavigator, "bottomSheetNavigator");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2032792412);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bottomSheetNavigator) : composerStartRestartGroup.changedInstance(bottomSheetNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2032792412, i2, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsModalBottomSheetLayout (BottomSheet.kt:37)");
            }
            StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfoRememberFinancialConnectionsBottomSheetLayoutInfo = rememberFinancialConnectionsBottomSheetLayoutInfo(composerStartRestartGroup, 0);
            com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetKt.m7536ModalBottomSheetLayout4erKP6g(bottomSheetNavigator, null, stripeBottomSheetLayoutInfoRememberFinancialConnectionsBottomSheetLayoutInfo.getSheetShape(), 0.0f, stripeBottomSheetLayoutInfoRememberFinancialConnectionsBottomSheetLayoutInfo.m8856getSheetBackgroundColor0d7_KjU(), 0L, stripeBottomSheetLayoutInfoRememberFinancialConnectionsBottomSheetLayoutInfo.m8855getScrimColor0d7_KjU(), content, composerStartRestartGroup, ModalBottomSheetState.$stable | (i2 & 14) | ((i2 << 18) & 29360128), 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.BottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BottomSheetKt.FinancialConnectionsModalBottomSheetLayout$lambda$1(bottomSheetNavigator, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final StripeBottomSheetLayoutInfo rememberFinancialConnectionsBottomSheetLayoutInfo(Composer composer, int i) {
        composer.startReplaceGroup(1404296655);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1404296655, i, -1, "com.stripe.android.financialconnections.ui.components.rememberFinancialConnectionsBottomSheetLayoutInfo (BottomSheet.kt:50)");
        }
        StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM = StripeBottomSheetLayoutInfoKt.m8857rememberStripeBottomSheetLayoutInfoHde_KZM(Dp.m6117constructorimpl(20), FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7630getBackground0d7_KjU(), Color.m3656copywmQWz5c$default(Color.INSTANCE.m3683getBlack0d7_KjU(), DarkThemeKt.isSystemInDarkTheme(composer, 0) ? 0.48f : 0.32f, 0.0f, 0.0f, 0.0f, 14, null), composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM;
    }
}
