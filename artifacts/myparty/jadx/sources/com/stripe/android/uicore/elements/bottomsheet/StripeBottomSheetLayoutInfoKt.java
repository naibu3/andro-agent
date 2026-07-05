package com.stripe.android.uicore.elements.bottomsheet;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ModalBottomSheetDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;

/* compiled from: StripeBottomSheetLayoutInfo.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"rememberStripeBottomSheetLayoutInfo", "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "scrimColor", "rememberStripeBottomSheetLayoutInfo-Hde_KZM", "(FJJLandroidx/compose/runtime/Composer;II)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;", "sheetShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "sheetShape-0680j_4", "(F)Landroidx/compose/foundation/shape/RoundedCornerShape;", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeBottomSheetLayoutInfoKt {
    /* renamed from: rememberStripeBottomSheetLayoutInfo-Hde_KZM, reason: not valid java name */
    public static final StripeBottomSheetLayoutInfo m8857rememberStripeBottomSheetLayoutInfoHde_KZM(float f, long j, long j2, Composer composer, int i, int i2) {
        composer.startReplaceGroup(769413883);
        if ((i2 & 1) != 0) {
            f = Dp.m6117constructorimpl(StripeThemeKt.getStripeShapes(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getBottomSheetCornerRadius());
        }
        if ((i2 & 2) != 0) {
            j = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1837getSurface0d7_KjU();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composer, ModalBottomSheetDefaults.$stable);
        }
        long j4 = j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(769413883, i, -1, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetLayoutInfo (StripeBottomSheetLayoutInfo.kt:26)");
        }
        composer.startReplaceGroup(-392358919);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo = new StripeBottomSheetLayoutInfo(m8858sheetShape0680j_4(f), j3, j4, null);
            composer.updateRememberedValue(stripeBottomSheetLayoutInfo);
            objRememberedValue = stripeBottomSheetLayoutInfo;
        }
        StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo2 = (StripeBottomSheetLayoutInfo) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stripeBottomSheetLayoutInfo2;
    }

    /* renamed from: sheetShape-0680j_4, reason: not valid java name */
    private static final RoundedCornerShape m8858sheetShape0680j_4(float f) {
        return RoundedCornerShapeKt.m1305RoundedCornerShapea9UjIt4$default(f, f, 0.0f, 0.0f, 12, null);
    }
}
