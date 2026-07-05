package com.stripe.android.uicore.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OTPElementUI.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$OTPElementUIKt {
    public static final ComposableSingletons$OTPElementUIKt INSTANCE = new ComposableSingletons$OTPElementUIKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f238lambda1 = ComposableLambdaKt.composableLambdaInstance(1503171109, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.ComposableSingletons$OTPElementUIKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1503171109, i, -1, "com.stripe.android.uicore.elements.ComposableSingletons$OTPElementUIKt.lambda-1.<anonymous> (OTPElementUI.kt:68)");
                }
                OTPElementUIKt.m8812OTPElementUIRE_urrM(true, new OTPElement(IdentifierSpec.INSTANCE.Generic("otp"), new OTPController(0, 1, null)), null, null, null, 0.0f, 0.0f, null, null, 0.0f, null, composer, 6, 0, 2044);
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
    private static Function2<Composer, Integer, Unit> f239lambda2 = ComposableLambdaKt.composableLambdaInstance(1851972617, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.ComposableSingletons$OTPElementUIKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1851972617, i, -1, "com.stripe.android.uicore.elements.ComposableSingletons$OTPElementUIKt.lambda-2.<anonymous> (OTPElementUI.kt:82)");
                }
                OTPElementUIKt.m8812OTPElementUIRE_urrM(false, new OTPElement(IdentifierSpec.INSTANCE.Generic("otp"), new OTPController(0, 1, null)), null, null, null, 0.0f, 0.0f, null, null, 0.0f, null, composer, 6, 0, 2044);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$stripe_ui_core_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8781getLambda1$stripe_ui_core_release() {
        return f238lambda1;
    }

    /* renamed from: getLambda-2$stripe_ui_core_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8782getLambda2$stripe_ui_core_release() {
        return f239lambda2;
    }
}
