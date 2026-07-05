package com.stripe.android.link.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LinkLoadingScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$LinkLoadingScreenKt {
    public static final ComposableSingletons$LinkLoadingScreenKt INSTANCE = new ComposableSingletons$LinkLoadingScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f167lambda1 = ComposableLambdaKt.composableLambdaInstance(-350180993, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.ComposableSingletons$LinkLoadingScreenKt$lambda-1$1
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
                ComposerKt.traceEventStart(-350180993, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkLoadingScreenKt.lambda-1.<anonymous> (LinkLoadingScreen.kt:41)");
            }
            LinkLoadingScreenKt.m7860LinkLoadingScreenhXAe_Q4(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f168lambda2 = ComposableLambdaKt.composableLambdaInstance(-1801501102, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.ComposableSingletons$LinkLoadingScreenKt$lambda-2$1
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
                ComposerKt.traceEventStart(-1801501102, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkLoadingScreenKt.lambda-2.<anonymous> (LinkLoadingScreen.kt:49)");
            }
            LinkLoadingScreenKt.m7860LinkLoadingScreenhXAe_Q4(null, Dp.m6115boximpl(Dp.m6117constructorimpl(500)), composer, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7835getLambda1$paymentsheet_release() {
        return f167lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7836getLambda2$paymentsheet_release() {
        return f168lambda2;
    }
}
