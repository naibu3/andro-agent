package com.stripe.android.financialconnections.ui.components;

import androidx.compose.material.IconKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TopAppBar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$TopAppBarKt {
    public static final ComposableSingletons$TopAppBarKt INSTANCE = new ComposableSingletons$TopAppBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f139lambda1 = ComposableLambdaKt.composableLambdaInstance(-1318334173, false, ComposableSingletons$TopAppBarKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f140lambda2 = ComposableLambdaKt.composableLambdaInstance(-1910988991, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1910988991, i, -1, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt.lambda-2.<anonymous> (TopAppBar.kt:175)");
                }
                IconKt.m1926Iconww6aTOc(CloseKt.getClose(Icons.Filled.INSTANCE), "Close icon", (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7635getIcon0d7_KjU(), composer, 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f141lambda3 = ComposableLambdaKt.composableLambdaInstance(1657803754, false, ComposableSingletons$TopAppBarKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f142lambda4 = ComposableLambdaKt.composableLambdaInstance(-131451939, false, ComposableSingletons$TopAppBarKt$lambda4$1.INSTANCE);

    /* renamed from: lambda-5, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f143lambda5 = ComposableLambdaKt.composableLambdaInstance(293892879, false, ComposableSingletons$TopAppBarKt$lambda5$1.INSTANCE);

    /* renamed from: getLambda-1$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7571getLambda1$financial_connections_release() {
        return f139lambda1;
    }

    /* renamed from: getLambda-2$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7572getLambda2$financial_connections_release() {
        return f140lambda2;
    }

    /* renamed from: getLambda-3$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7573getLambda3$financial_connections_release() {
        return f141lambda3;
    }

    /* renamed from: getLambda-4$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7574getLambda4$financial_connections_release() {
        return f142lambda4;
    }

    /* renamed from: getLambda-5$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7575getLambda5$financial_connections_release() {
        return f143lambda5;
    }
}
