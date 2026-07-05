package com.stripe.android.financialconnections.features.success;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: SuccessContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SuccessContentKt$SpinnerToSuccessAnimation$2$2 implements Function3<Boolean, Composer, Integer, Unit> {
    final /* synthetic */ MutableFloatState $targetCheckmarkScale$delegate;

    SuccessContentKt$SpinnerToSuccessAnimation$2$2(MutableFloatState mutableFloatState) {
        this.$targetCheckmarkScale$delegate = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer, Integer num) {
        invoke(bool.booleanValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(z) ? 4 : 2;
        }
        if ((i & 19) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-303768988, i, -1, "com.stripe.android.financialconnections.features.success.SpinnerToSuccessAnimation.<anonymous>.<anonymous> (SuccessContent.kt:207)");
            }
            composer.startReplaceGroup(-1307215074);
            boolean zChanged = composer.changed(this.$targetCheckmarkScale$delegate);
            final MutableFloatState mutableFloatState = this.$targetCheckmarkScale$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$SpinnerToSuccessAnimation$2$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(SuccessContentKt.access$SpinnerToSuccessAnimation_8GFhAUE$lambda$17(mutableFloatState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SuccessContentKt.SpinnerToCheckmark(z, (Function0) objRememberedValue, null, composer, i & 14, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
