package com.stripe.android.uicore.elements.bottomsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: StripeBottomSheetLayout.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$StripeBottomSheetLayoutKt {
    public static final ComposableSingletons$StripeBottomSheetLayoutKt INSTANCE = new ComposableSingletons$StripeBottomSheetLayoutKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f241lambda1 = ComposableLambdaKt.composableLambdaInstance(-1207274653, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.bottomsheet.ComposableSingletons$StripeBottomSheetLayoutKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1207274653, i, -1, "com.stripe.android.uicore.elements.bottomsheet.ComposableSingletons$StripeBottomSheetLayoutKt.lambda-1.<anonymous> (StripeBottomSheetLayout.kt:62)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$stripe_ui_core_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8850getLambda1$stripe_ui_core_release() {
        return f241lambda1;
    }
}
