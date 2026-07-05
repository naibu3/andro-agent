package com.stripe.android.financialconnections.navigation.bottomsheet;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import kotlin.Metadata;

/* compiled from: BottomSheetNavigation.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"rememberBottomSheetNavigator", "Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BottomSheetNavigationKt {
    public static final BottomSheetNavigator rememberBottomSheetNavigator(AnimationSpec<Float> animationSpec, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-1959573965);
        if ((i2 & 1) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1959573965, i, -1, "com.stripe.android.financialconnections.navigation.bottomsheet.rememberBottomSheetNavigator (BottomSheetNavigation.kt:83)");
        }
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, animationSpec2, null, false, composer, ((i << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6, 12);
        composer.startReplaceGroup(330932226);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new BottomSheetNavigator(modalBottomSheetStateRememberModalBottomSheetState);
            composer.updateRememberedValue(objRememberedValue);
        }
        BottomSheetNavigator bottomSheetNavigator = (BottomSheetNavigator) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bottomSheetNavigator;
    }
}
