package com.stripe.android.link.ui.updatecard;

import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.stripe.android.link.theme.LinkTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: UpdateCardScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$UpdateCardScreenKt {
    public static final ComposableSingletons$UpdateCardScreenKt INSTANCE = new ComposableSingletons$UpdateCardScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f190lambda1 = ComposableLambdaKt.composableLambdaInstance(-852519330, false, ComposableSingletons$UpdateCardScreenKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f191lambda2 = ComposableLambdaKt.composableLambdaInstance(-349044966, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.updatecard.ComposableSingletons$UpdateCardScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-349044966, i, -1, "com.stripe.android.link.ui.updatecard.ComposableSingletons$UpdateCardScreenKt.lambda-2.<anonymous> (UpdateCardScreen.kt:99)");
                }
                SurfaceKt.m2015SurfaceFjzlyU(null, null, LinkTheme.INSTANCE.getColors(composer, 6).m7805getSurfacePrimary0d7_KjU(), 0L, null, 0.0f, ComposableSingletons$UpdateCardScreenKt.INSTANCE.m7916getLambda1$paymentsheet_release(), composer, 1572864, 59);
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
    public final Function2<Composer, Integer, Unit> m7916getLambda1$paymentsheet_release() {
        return f190lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7917getLambda2$paymentsheet_release() {
        return f191lambda2;
    }
}
