package com.stripe.android.link.ui;

import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LinkTerms.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$LinkTermsKt {
    public static final ComposableSingletons$LinkTermsKt INSTANCE = new ComposableSingletons$LinkTermsKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f170lambda1 = ComposableLambdaKt.composableLambdaInstance(-2087552559, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.ComposableSingletons$LinkTermsKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087552559, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkTermsKt.lambda-1.<anonymous> (LinkTerms.kt:90)");
                }
                LinkTermsKt.m7870LinkTerms8iNrtrE(LinkTermsType.InlineOptional, null, 0, composer, 6, 6);
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
    private static Function2<Composer, Integer, Unit> f171lambda2 = ComposableLambdaKt.composableLambdaInstance(1274925453, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.ComposableSingletons$LinkTermsKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1274925453, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkTermsKt.lambda-2.<anonymous> (LinkTerms.kt:89)");
                }
                SurfaceKt.m2015SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$LinkTermsKt.INSTANCE.m7838getLambda1$paymentsheet_release(), composer, 1572864, 63);
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
    public final Function2<Composer, Integer, Unit> m7838getLambda1$paymentsheet_release() {
        return f170lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7839getLambda2$paymentsheet_release() {
        return f171lambda2;
    }
}
