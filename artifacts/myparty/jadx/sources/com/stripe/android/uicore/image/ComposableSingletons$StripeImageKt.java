package com.stripe.android.uicore.image;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeImage.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$StripeImageKt {
    public static final ComposableSingletons$StripeImageKt INSTANCE = new ComposableSingletons$StripeImageKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<BoxWithConstraintsScope, Composer, Integer, Unit> f242lambda1 = ComposableLambdaKt.composableLambdaInstance(-621553741, false, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.image.ComposableSingletons$StripeImageKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxWithConstraintsScope, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-621553741, i, -1, "com.stripe.android.uicore.image.ComposableSingletons$StripeImageKt.lambda-1.<anonymous> (StripeImage.kt:57)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function3<BoxWithConstraintsScope, Composer, Integer, Unit> f243lambda2 = ComposableLambdaKt.composableLambdaInstance(1996028391, false, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.image.ComposableSingletons$StripeImageKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxWithConstraintsScope, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1996028391, i, -1, "com.stripe.android.uicore.image.ComposableSingletons$StripeImageKt.lambda-2.<anonymous> (StripeImage.kt:58)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$stripe_ui_core_release, reason: not valid java name */
    public final Function3<BoxWithConstraintsScope, Composer, Integer, Unit> m8871getLambda1$stripe_ui_core_release() {
        return f242lambda1;
    }

    /* renamed from: getLambda-2$stripe_ui_core_release, reason: not valid java name */
    public final Function3<BoxWithConstraintsScope, Composer, Integer, Unit> m8872getLambda2$stripe_ui_core_release() {
        return f243lambda2;
    }
}
