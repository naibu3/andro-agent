package com.stripe.android.paymentsheet.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PaymentSheetTopBar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$PaymentSheetTopBarKt {
    public static final ComposableSingletons$PaymentSheetTopBarKt INSTANCE = new ComposableSingletons$PaymentSheetTopBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f223lambda1 = ComposableLambdaKt.composableLambdaInstance(1159340481, false, ComposableSingletons$PaymentSheetTopBarKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f224lambda2 = ComposableLambdaKt.composableLambdaInstance(-2123154384, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.ComposableSingletons$PaymentSheetTopBarKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2123154384, i, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$PaymentSheetTopBarKt.lambda-2.<anonymous> (PaymentSheetTopBar.kt:202)");
            }
            PaymentSheetTopBarKt.TestModeBadge(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8438getLambda1$paymentsheet_release() {
        return f223lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8439getLambda2$paymentsheet_release() {
        return f224lambda2;
    }
}
