package com.stripe.android.financialconnections.features.common;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharedPartnerAuth.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$SharedPartnerAuthKt {
    public static final ComposableSingletons$SharedPartnerAuthKt INSTANCE = new ComposableSingletons$SharedPartnerAuthKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<BoxWithConstraintsScope, Composer, Integer, Unit> f83lambda1 = ComposableLambdaKt.composableLambdaInstance(-1709284826, false, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$SharedPartnerAuthKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraintsScope StripeImage, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(StripeImage, "$this$StripeImage");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1709284826, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$SharedPartnerAuthKt.lambda-1.<anonymous> (SharedPartnerAuth.kt:393)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$financial_connections_release, reason: not valid java name */
    public final Function3<BoxWithConstraintsScope, Composer, Integer, Unit> m7342getLambda1$financial_connections_release() {
        return f83lambda1;
    }
}
