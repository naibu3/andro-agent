package com.stripe.android.paymentsheet.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.paymentsheet.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: SavedPaymentMethodTab.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.ComposableSingletons$SavedPaymentMethodTabKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$SavedPaymentMethodTabKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SavedPaymentMethodTabKt$lambda1$1 INSTANCE = new ComposableSingletons$SavedPaymentMethodTabKt$lambda1$1();

    ComposableSingletons$SavedPaymentMethodTabKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2089981125, i, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$SavedPaymentMethodTabKt.lambda-1.<anonymous> (SavedPaymentMethodTab.kt:243)");
            }
            float fM6117constructorimpl = Dp.m6117constructorimpl(100);
            int i2 = R.drawable.stripe_ic_paymentsheet_card_visa_ref;
            composer.startReplaceGroup(-304537517);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.ComposableSingletons$SavedPaymentMethodTabKt$lambda-1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SavedPaymentMethodTabKt.m8535SavedPaymentMethodTabRYabdnw(null, fM6117constructorimpl, true, false, false, true, false, i2, null, null, false, "MasterCard", "MasterCard", null, null, (Function0) objRememberedValue, composer, 224688, 197040, 26433);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
