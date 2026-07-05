package com.stripe.android.link.ui;

import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.stripe.android.link.theme.LinkTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LinkAppBar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$LinkAppBarKt {
    public static final ComposableSingletons$LinkAppBarKt INSTANCE = new ComposableSingletons$LinkAppBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f155lambda1 = ComposableLambdaKt.composableLambdaInstance(741088751, false, ComposableSingletons$LinkAppBarKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f156lambda2 = ComposableLambdaKt.composableLambdaInstance(-184689997, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-184689997, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt.lambda-2.<anonymous> (LinkAppBar.kt:156)");
                }
                SurfaceKt.m2015SurfaceFjzlyU(null, null, LinkTheme.INSTANCE.getColors(composer, 6).m7805getSurfacePrimary0d7_KjU(), 0L, null, 0.0f, ComposableSingletons$LinkAppBarKt.INSTANCE.m7820getLambda1$paymentsheet_release(), composer, 1572864, 59);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f157lambda3 = ComposableLambdaKt.composableLambdaInstance(957945807, false, ComposableSingletons$LinkAppBarKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f158lambda4 = ComposableLambdaKt.composableLambdaInstance(-1787374957, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1787374957, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt.lambda-4.<anonymous> (LinkAppBar.kt:180)");
                }
                SurfaceKt.m2015SurfaceFjzlyU(null, null, LinkTheme.INSTANCE.getColors(composer, 6).m7805getSurfacePrimary0d7_KjU(), 0L, null, 0.0f, ComposableSingletons$LinkAppBarKt.INSTANCE.m7822getLambda3$paymentsheet_release(), composer, 1572864, 59);
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
    public final Function2<Composer, Integer, Unit> m7820getLambda1$paymentsheet_release() {
        return f155lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7821getLambda2$paymentsheet_release() {
        return f156lambda2;
    }

    /* renamed from: getLambda-3$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7822getLambda3$paymentsheet_release() {
        return f157lambda3;
    }

    /* renamed from: getLambda-4$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7823getLambda4$paymentsheet_release() {
        return f158lambda4;
    }
}
