package com.stripe.android.common.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InlineContentTemplateBuilder.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$InlineContentTemplateBuilderKt {
    public static final ComposableSingletons$InlineContentTemplateBuilderKt INSTANCE = new ComposableSingletons$InlineContentTemplateBuilderKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f56lambda1 = ComposableLambdaKt.composableLambdaInstance(-1845148978, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.common.ui.ComposableSingletons$InlineContentTemplateBuilderKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1845148978, i, -1, "com.stripe.android.common.ui.ComposableSingletons$InlineContentTemplateBuilderKt.lambda-1.<anonymous> (InlineContentTemplateBuilder.kt:47)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7216getLambda1$paymentsheet_release() {
        return f56lambda1;
    }
}
