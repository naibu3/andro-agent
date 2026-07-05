package com.stripe.android.paymentsheet.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: PaymentSheetTopBar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$PaymentSheetTopBarKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PaymentSheetTopBarKt$lambda1$1 INSTANCE = new ComposableSingletons$PaymentSheetTopBarKt$lambda1$1();

    ComposableSingletons$PaymentSheetTopBarKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1159340481, i, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$PaymentSheetTopBarKt.lambda-1.<anonymous> (PaymentSheetTopBar.kt:181)");
            }
            composer.startReplaceGroup(2122222019);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            PaymentSheetTopBarState paymentSheetTopBarState = new PaymentSheetTopBarState(true, true, false, (Function0) objRememberedValue);
            float fM6117constructorimpl = Dp.m6117constructorimpl(0);
            composer.startReplaceGroup(2122228547);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            PaymentSheetTopBarKt.m8491PaymentSheetTopBarjt2gSs(paymentSheetTopBarState, true, true, fM6117constructorimpl, (Function0) objRememberedValue2, composer, 28080);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
