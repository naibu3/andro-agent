package com.stripe.android.financialconnections.features.accountpicker;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountPickerScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$AccountPickerScreenKt {
    public static final ComposableSingletons$AccountPickerScreenKt INSTANCE = new ComposableSingletons$AccountPickerScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<Brush, Composer, Integer, Unit> f57lambda1 = ComposableLambdaKt.composableLambdaInstance(229709570, false, new Function3<Brush, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.accountpicker.ComposableSingletons$AccountPickerScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Brush brush, Composer composer, Integer num) {
            invoke(brush, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Brush it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i |= composer.changed(it) ? 4 : 2;
            }
            if ((i & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(229709570, i, -1, "com.stripe.android.financialconnections.features.accountpicker.ComposableSingletons$AccountPickerScreenKt.lambda-1.<anonymous> (AccountPickerScreen.kt:223)");
                }
                BoxKt.Box(BackgroundKt.background$default(ClipKt.clip(SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(72)), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(16))), it, null, 0.0f, 6, null), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> f58lambda2 = ComposableLambdaKt.composableLambdaInstance(1423572609, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.accountpicker.ComposableSingletons$AccountPickerScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 129) != 128 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1423572609, i2, -1, "com.stripe.android.financialconnections.features.accountpicker.ComposableSingletons$AccountPickerScreenKt.lambda-2.<anonymous> (AccountPickerScreen.kt:222)");
                }
                LoadingContentKt.LoadingShimmerEffect(ComposableSingletons$AccountPickerScreenKt.INSTANCE.m7303getLambda1$financial_connections_release(), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$financial_connections_release, reason: not valid java name */
    public final Function3<Brush, Composer, Integer, Unit> m7303getLambda1$financial_connections_release() {
        return f57lambda1;
    }

    /* renamed from: getLambda-2$financial_connections_release, reason: not valid java name */
    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> m7304getLambda2$financial_connections_release() {
        return f58lambda2;
    }
}
