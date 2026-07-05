package com.stripe.android.financialconnections.navigation.bottomsheet;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheetNavigation.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$BottomSheetNavigationKt {
    public static final ComposableSingletons$BottomSheetNavigationKt INSTANCE = new ComposableSingletons$BottomSheetNavigationKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function4<ColumnScope, NavBackStackEntry, Composer, Integer, Unit> f128lambda1 = ComposableLambdaKt.composableLambdaInstance(-282873092, false, new Function4<ColumnScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.ComposableSingletons$BottomSheetNavigationKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(columnScope, navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope Destination, NavBackStackEntry it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Destination, "$this$Destination");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-282873092, i, -1, "com.stripe.android.financialconnections.navigation.bottomsheet.ComposableSingletons$BottomSheetNavigationKt.lambda-1.<anonymous> (BottomSheetNavigation.kt:223)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$financial_connections_release, reason: not valid java name */
    public final Function4<ColumnScope, NavBackStackEntry, Composer, Integer, Unit> m7538getLambda1$financial_connections_release() {
        return f128lambda1;
    }
}
