package com.stripe.android.link.ui.verification;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.stripe.android.link.theme.LinkTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: VerificationDialog.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$VerificationDialogKt {
    public static final ComposableSingletons$VerificationDialogKt INSTANCE = new ComposableSingletons$VerificationDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f196lambda1 = ComposableLambdaKt.composableLambdaInstance(-755570406, false, ComposableSingletons$VerificationDialogKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f197lambda2 = ComposableLambdaKt.composableLambdaInstance(2046956246, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationDialogKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2046956246, i, -1, "com.stripe.android.link.ui.verification.ComposableSingletons$VerificationDialogKt.lambda-2.<anonymous> (VerificationDialog.kt:120)");
                }
                SurfaceKt.m2015SurfaceFjzlyU(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, LinkTheme.INSTANCE.getColors(composer, 6).m7805getSurfacePrimary0d7_KjU(), 0L, null, 0.0f, ComposableSingletons$VerificationDialogKt.INSTANCE.m7927getLambda1$paymentsheet_release(), composer, 1572870, 58);
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
    public final Function2<Composer, Integer, Unit> m7927getLambda1$paymentsheet_release() {
        return f196lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7928getLambda2$paymentsheet_release() {
        return f197lambda2;
    }
}
