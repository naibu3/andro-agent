package com.stripe.android.link.ui.verification;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.link.theme.LinkTheme;
import com.stripe.android.link.ui.LinkSpinnerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationBody.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$VerificationBodyKt {
    public static final ComposableSingletons$VerificationBodyKt INSTANCE = new ComposableSingletons$VerificationBodyKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f192lambda1 = ComposableLambdaKt.composableLambdaInstance(1556541497, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1556541497, i, -1, "com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt.lambda-1.<anonymous> (VerificationBody.kt:344)");
            }
            LinkSpinnerKt.m7868LinkSpinnerh1eTWw(SizeKt.m1065size3ABfNKs(TestTagKt.testTag(Modifier.INSTANCE, VerificationBodyKt.VERIFICATION_RESEND_LOADER_TAG), Dp.m6117constructorimpl(18)), LinkTheme.INSTANCE.getColors(composer, 6).m7810getTextPrimary0d7_KjU(), 0L, Dp.m6117constructorimpl(3), composer, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f193lambda2 = ComposableLambdaKt.composableLambdaInstance(1814127193, false, ComposableSingletons$VerificationBodyKt$lambda2$1.INSTANCE);

    /* renamed from: lambda-3, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f194lambda3 = ComposableLambdaKt.composableLambdaInstance(1594811933, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1594811933, i, -1, "com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt.lambda-3.<anonymous> (VerificationBody.kt:360)");
                }
                SurfaceKt.m2015SurfaceFjzlyU(PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(24)), LinkTheme.INSTANCE.getColors(composer, 6).m7805getSurfacePrimary0d7_KjU(), 0L, null, 0.0f, ComposableSingletons$VerificationBodyKt.INSTANCE.m7921getLambda2$paymentsheet_release(), composer, 1572870, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f195lambda4 = ComposableLambdaKt.composableLambdaInstance(-391428647, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-391428647, i, -1, "com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt.lambda-4.<anonymous> (VerificationBody.kt:359)");
                }
                SurfaceKt.m2015SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$VerificationBodyKt.INSTANCE.m7922getLambda3$paymentsheet_release(), composer, 1572864, 63);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$paymentsheet_release, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7920getLambda1$paymentsheet_release() {
        return f192lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7921getLambda2$paymentsheet_release() {
        return f193lambda2;
    }

    /* renamed from: getLambda-3$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7922getLambda3$paymentsheet_release() {
        return f194lambda3;
    }

    /* renamed from: getLambda-4$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7923getLambda4$paymentsheet_release() {
        return f195lambda4;
    }
}
