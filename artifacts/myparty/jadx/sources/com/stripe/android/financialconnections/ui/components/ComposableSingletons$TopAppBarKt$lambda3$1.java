package com.stripe.android.financialconnections.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: TopAppBar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$TopAppBarKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TopAppBarKt$lambda3$1 INSTANCE = new ComposableSingletons$TopAppBarKt$lambda3$1();

    ComposableSingletons$TopAppBarKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1657803754, i, -1, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt.lambda-3.<anonymous> (TopAppBar.kt:247)");
            }
            TopAppBarState topAppBarState = new TopAppBarState(false, false, false, null, false, false, false, null, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
            composer.startReplaceGroup(1159159886);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt$lambda-3$1$$ExternalSyntheticLambda0
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
