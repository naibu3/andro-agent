package com.stripe.android.financialconnections.features.common;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.ui.components.ScaffoldKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: ErrorContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$ErrorContentKt {
    public static final ComposableSingletons$ErrorContentKt INSTANCE = new ComposableSingletons$ErrorContentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f64lambda1 = ComposableLambdaKt.composableLambdaInstance(-117198573, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-117198573, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt.lambda-1.<anonymous> (ErrorContent.kt:46)");
                }
                ShapedIconKt.ShapedIcon(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_warning, composer, 0), null, null, null, null, composer, 24576, 14);
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
    private static Function2<Composer, Integer, Unit> f65lambda2 = ComposableLambdaKt.composableLambdaInstance(-2052014915, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2052014915, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt.lambda-2.<anonymous> (ErrorContent.kt:68)");
                }
                ShapedIconKt.ShapedIcon(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_warning, composer, 0), null, null, null, null, composer, 24576, 14);
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
    private static Function2<Composer, Integer, Unit> f66lambda3 = ComposableLambdaKt.composableLambdaInstance(-530833761, false, ComposableSingletons$ErrorContentKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f67lambda4 = ComposableLambdaKt.composableLambdaInstance(-1209818533, false, ComposableSingletons$ErrorContentKt$lambda4$1.INSTANCE);

    /* renamed from: lambda-5, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f68lambda5 = ComposableLambdaKt.composableLambdaInstance(-1980911826, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1980911826, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt.lambda-5.<anonymous> (ErrorContent.kt:331)");
                }
                ScaffoldKt.FinancialConnectionsScaffold(ComposableSingletons$ErrorContentKt.INSTANCE.m7322getLambda3$financial_connections_release(), ComposableSingletons$ErrorContentKt.INSTANCE.m7323getLambda4$financial_connections_release(), composer, 54);
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
    public final Function2<Composer, Integer, Unit> m7320getLambda1$financial_connections_release() {
        return f64lambda1;
    }

    /* renamed from: getLambda-2$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7321getLambda2$financial_connections_release() {
        return f65lambda2;
    }

    /* renamed from: getLambda-3$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7322getLambda3$financial_connections_release() {
        return f66lambda3;
    }

    /* renamed from: getLambda-4$financial_connections_release, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m7323getLambda4$financial_connections_release() {
        return f67lambda4;
    }

    /* renamed from: getLambda-5$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7324getLambda5$financial_connections_release() {
        return f68lambda5;
    }
}
