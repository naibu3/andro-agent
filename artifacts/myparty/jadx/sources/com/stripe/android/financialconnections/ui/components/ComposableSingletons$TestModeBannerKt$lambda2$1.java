package com.stripe.android.financialconnections.ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: TestModeBanner.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.components.ComposableSingletons$TestModeBannerKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$TestModeBannerKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TestModeBannerKt$lambda2$1 INSTANCE = new ComposableSingletons$TestModeBannerKt$lambda2$1();

    ComposableSingletons$TestModeBannerKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(231559736, i, -1, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$TestModeBannerKt.lambda-2.<anonymous> (TestModeBanner.kt:95)");
            }
            composer.startReplaceGroup(780847407);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.ui.components.ComposableSingletons$TestModeBannerKt$lambda-2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            TestModeBannerKt.TestModeBanner(false, "Use test code", (Function0) objRememberedValue, PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), null, composer, 3510, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
