package com.stripe.android.financialconnections.features.common;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.stripe.android.financialconnections.ui.components.ScaffoldKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: AccountItem.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$AccountItemKt {
    public static final ComposableSingletons$AccountItemKt INSTANCE = new ComposableSingletons$AccountItemKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f61lambda1 = ComposableLambdaKt.composableLambdaInstance(-1369069551, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$AccountItemKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1369069551, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$AccountItemKt.lambda-1.<anonymous> (AccountItem.kt:223)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f62lambda2 = ComposableLambdaKt.composableLambdaInstance(23054037, false, ComposableSingletons$AccountItemKt$lambda2$1.INSTANCE);

    /* renamed from: lambda-3, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f63lambda3 = ComposableLambdaKt.composableLambdaInstance(1416756258, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$AccountItemKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1416756258, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$AccountItemKt.lambda-3.<anonymous> (AccountItem.kt:223)");
                }
                ScaffoldKt.FinancialConnectionsScaffold(ComposableSingletons$AccountItemKt.INSTANCE.m7317getLambda1$financial_connections_release(), ComposableSingletons$AccountItemKt.INSTANCE.m7318getLambda2$financial_connections_release(), composer, 54);
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
    public final Function2<Composer, Integer, Unit> m7317getLambda1$financial_connections_release() {
        return f61lambda1;
    }

    /* renamed from: getLambda-2$financial_connections_release, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m7318getLambda2$financial_connections_release() {
        return f62lambda2;
    }

    /* renamed from: getLambda-3$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7319getLambda3$financial_connections_release() {
        return f63lambda3;
    }
}
