package com.stripe.android.paymentsheet.utils;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.StripeTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ComposeUtils.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"PaymentSheetContentPadding", "", "subtractingExtraPadding", "Landroidx/compose/ui/unit/Dp;", "PaymentSheetContentPadding-kHDZbjc", "(FLandroidx/compose/runtime/Composer;II)V", "DismissKeyboardOnProcessing", BaseSheetViewModel.SAVE_PROCESSING, "", "(ZLandroidx/compose/runtime/Composer;I)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposeUtilsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DismissKeyboardOnProcessing$lambda$2(boolean z, int i, Composer composer, int i2) {
        DismissKeyboardOnProcessing(z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentSheetContentPadding_kHDZbjc$lambda$0(float f, int i, int i2, Composer composer, int i3) {
        m8559PaymentSheetContentPaddingkHDZbjc(f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: PaymentSheetContentPadding-kHDZbjc, reason: not valid java name */
    public static final void m8559PaymentSheetContentPaddingkHDZbjc(final float f, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1469222463);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                f = Dp.m6117constructorimpl(0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1469222463, i3, -1, "com.stripe.android.paymentsheet.utils.PaymentSheetContentPadding (ComposeUtils.kt:14)");
            }
            SpacerKt.Spacer(SizeKt.m1054requiredHeight3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(RangesKt.coerceAtLeast(Dp.m6117constructorimpl(Dp.m6117constructorimpl(StripeTheme.INSTANCE.getFormInsets().getBottom()) - f), Dp.m6117constructorimpl(0)))), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.utils.ComposeUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeUtilsKt.PaymentSheetContentPadding_kHDZbjc$lambda$0(f, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void DismissKeyboardOnProcessing(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-102088289);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-102088289, i2, -1, "com.stripe.android.paymentsheet.utils.DismissKeyboardOnProcessing (ComposeUtils.kt:20)");
            }
            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localSoftwareKeyboardController);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) objConsume;
            if (z) {
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-619527114);
                boolean zChanged = composerStartRestartGroup.changed(softwareKeyboardController);
                ComposeUtilsKt$DismissKeyboardOnProcessing$1$1 composeUtilsKt$DismissKeyboardOnProcessing$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || composeUtilsKt$DismissKeyboardOnProcessing$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    composeUtilsKt$DismissKeyboardOnProcessing$1$1RememberedValue = new ComposeUtilsKt$DismissKeyboardOnProcessing$1$1(softwareKeyboardController, null);
                    composerStartRestartGroup.updateRememberedValue(composeUtilsKt$DismissKeyboardOnProcessing$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) composeUtilsKt$DismissKeyboardOnProcessing$1$1RememberedValue, composerStartRestartGroup, 6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.utils.ComposeUtilsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeUtilsKt.DismissKeyboardOnProcessing$lambda$2(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
