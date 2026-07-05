package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.stripe.android.paymentsheet.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: PollingScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt$lambda-7$1, reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$PollingScreenKt$lambda7$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PollingScreenKt$lambda7$1 INSTANCE = new ComposableSingletons$PollingScreenKt$lambda7$1();

    ComposableSingletons$PollingScreenKt$lambda7$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(110635542, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-7.<anonymous> (PollingScreen.kt:254)");
            }
            Duration.Companion companion = Duration.INSTANCE;
            PollingUiState pollingUiState = new PollingUiState(DurationKt.toDuration(83, DurationUnit.SECONDS), R.string.stripe_upi_polling_message, PollingState.Failed, null);
            composer.startReplaceGroup(1313317898);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt$lambda-7$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            PollingScreenKt.PollingScreen(pollingUiState, (Function0) objRememberedValue, null, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
