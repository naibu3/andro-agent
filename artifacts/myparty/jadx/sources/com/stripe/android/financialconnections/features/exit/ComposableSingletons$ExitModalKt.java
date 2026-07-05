package com.stripe.android.financialconnections.features.exit;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExitModal.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$ExitModalKt {
    public static final ComposableSingletons$ExitModalKt INSTANCE = new ComposableSingletons$ExitModalKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f85lambda1 = ComposableLambdaKt.composableLambdaInstance(2101475679, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.exit.ComposableSingletons$ExitModalKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope FinancialConnectionsButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2101475679, i, -1, "com.stripe.android.financialconnections.features.exit.ComposableSingletons$ExitModalKt.lambda-1.<anonymous> (ExitModal.kt:84)");
            }
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_exit_modal_cta_cancel, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f86lambda2 = ComposableLambdaKt.composableLambdaInstance(-60472120, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.exit.ComposableSingletons$ExitModalKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope FinancialConnectionsButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-60472120, i, -1, "com.stripe.android.financialconnections.features.exit.ComposableSingletons$ExitModalKt.lambda-2.<anonymous> (ExitModal.kt:94)");
            }
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_exit_modal_cta_accept, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f87lambda3 = ComposableLambdaKt.composableLambdaInstance(-1374968111, false, ComposableSingletons$ExitModalKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f88lambda4 = ComposableLambdaKt.composableLambdaInstance(-312397163, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.exit.ComposableSingletons$ExitModalKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-312397163, i, -1, "com.stripe.android.financialconnections.features.exit.ComposableSingletons$ExitModalKt.lambda-4.<anonymous> (ExitModal.kt:103)");
                }
                SurfaceKt.m2015SurfaceFjzlyU(null, null, FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7630getBackground0d7_KjU(), 0L, null, 0.0f, ComposableSingletons$ExitModalKt.INSTANCE.m7388getLambda3$financial_connections_release(), composer, 1572864, 59);
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
    public final Function3<RowScope, Composer, Integer, Unit> m7386getLambda1$financial_connections_release() {
        return f85lambda1;
    }

    /* renamed from: getLambda-2$financial_connections_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7387getLambda2$financial_connections_release() {
        return f86lambda2;
    }

    /* renamed from: getLambda-3$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7388getLambda3$financial_connections_release() {
        return f87lambda3;
    }

    /* renamed from: getLambda-4$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7389getLambda4$financial_connections_release() {
        return f88lambda4;
    }
}
