package com.stripe.android.financialconnections.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import com.stripe.android.financialconnections.ui.theme.Theme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: TopAppBar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$TopAppBarKt$lambda4$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TopAppBarKt$lambda4$1 INSTANCE = new ComposableSingletons$TopAppBarKt$lambda4$1();

    ComposableSingletons$TopAppBarKt$lambda4$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-131451939, i, -1, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt.lambda-4.<anonymous> (TopAppBar.kt:258)");
            }
            TopAppBarState topAppBarState = new TopAppBarState(false, false, false, Theme.LinkLight, false, false, false, null, false, TypedValues.PositionType.TYPE_DRAWPATH, null);
            composer.startReplaceGroup(-1628243409);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt$lambda-4$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            TopAppBarKt.FinancialConnectionsTopAppBar(topAppBarState, (Function0) objRememberedValue, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
