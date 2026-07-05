package com.stripe.android.link.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LinkSpinner.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$LinkSpinnerKt {
    public static final ComposableSingletons$LinkSpinnerKt INSTANCE = new ComposableSingletons$LinkSpinnerKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f169lambda1 = ComposableLambdaKt.composableLambdaInstance(1627442911, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.ComposableSingletons$LinkSpinnerKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1627442911, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkSpinnerKt.lambda-1.<anonymous> (LinkSpinner.kt:72)");
                }
                LinkSpinnerKt.m7868LinkSpinnerh1eTWw(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), 0L, 0L, Dp.m6117constructorimpl(6), composer, 3078, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7837getLambda1$paymentsheet_release() {
        return f169lambda1;
    }
}
