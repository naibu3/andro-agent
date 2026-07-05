package com.stripe.android.link.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: SecondaryButton.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.link.ui.ComposableSingletons$SecondaryButtonKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$SecondaryButtonKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SecondaryButtonKt$lambda1$1 INSTANCE = new ComposableSingletons$SecondaryButtonKt$lambda1$1();

    ComposableSingletons$SecondaryButtonKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1093093247, i, -1, "com.stripe.android.link.ui.ComposableSingletons$SecondaryButtonKt.lambda-1.<anonymous> (SecondaryButton.kt:48)");
            }
            composer.startReplaceGroup(988671009);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.ComposableSingletons$SecondaryButtonKt$lambda-1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SecondaryButtonKt.SecondaryButton(null, true, "Testing", (Function0) objRememberedValue, composer, 3504, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
