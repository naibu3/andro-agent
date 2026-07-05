package com.stripe.android.financialconnections.ui.components;

import androidx.compose.material.IconKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopAppBar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$TopAppBarKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TopAppBarKt$lambda1$1 INSTANCE = new ComposableSingletons$TopAppBarKt$lambda1$1();

    ComposableSingletons$TopAppBarKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1318334173, i, -1, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt.lambda-1.<anonymous> (TopAppBar.kt:150)");
            }
            ImageVector arrowBack = ArrowBackKt.getArrowBack(Icons.Filled.INSTANCE);
            long jM7635getIcon0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7635getIcon0d7_KjU();
            Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, "top-app-bar-back-button");
            composer.startReplaceGroup(-1856038519);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt$lambda-1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$TopAppBarKt$lambda1$1.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            IconKt.m1926Iconww6aTOc(arrowBack, "Back icon", SemanticsModifierKt.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null), jM7635getIcon0d7_KjU, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }
}
