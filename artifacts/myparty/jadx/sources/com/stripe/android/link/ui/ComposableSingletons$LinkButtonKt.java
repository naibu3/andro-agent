package com.stripe.android.link.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LinkButton.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$LinkButtonKt {
    public static final ComposableSingletons$LinkButtonKt INSTANCE = new ComposableSingletons$LinkButtonKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f159lambda1 = ComposableLambdaKt.composableLambdaInstance(-1533692053, false, ComposableSingletons$LinkButtonKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f160lambda2 = ComposableLambdaKt.composableLambdaInstance(877557994, false, ComposableSingletons$LinkButtonKt$lambda2$1.INSTANCE);

    /* renamed from: lambda-3, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f161lambda3 = ComposableLambdaKt.composableLambdaInstance(1578780215, false, ComposableSingletons$LinkButtonKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f162lambda4 = ComposableLambdaKt.composableLambdaInstance(-994364167, false, ComposableSingletons$LinkButtonKt$lambda4$1.INSTANCE);

    /* renamed from: lambda-5, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f163lambda5 = ComposableLambdaKt.composableLambdaInstance(364257093, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(364257093, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-5.<anonymous> (LinkButton.kt:279)");
            }
            LinkButtonKt.LinkButtonIcon(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f164lambda6 = ComposableLambdaKt.composableLambdaInstance(-739155639, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-739155639, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-6.<anonymous> (LinkButton.kt:326)");
            }
            LinkButtonKt.LinkButtonIcon(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f165lambda7 = ComposableLambdaKt.composableLambdaInstance(-956381198, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-956381198, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-7.<anonymous> (LinkButton.kt:327)");
            }
            LinkButtonKt.LinkDivider(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7825getLambda1$paymentsheet_release() {
        return f159lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7826getLambda2$paymentsheet_release() {
        return f160lambda2;
    }

    /* renamed from: getLambda-3$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7827getLambda3$paymentsheet_release() {
        return f161lambda3;
    }

    /* renamed from: getLambda-4$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7828getLambda4$paymentsheet_release() {
        return f162lambda4;
    }

    /* renamed from: getLambda-5$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7829getLambda5$paymentsheet_release() {
        return f163lambda5;
    }

    /* renamed from: getLambda-6$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7830getLambda6$paymentsheet_release() {
        return f164lambda6;
    }

    /* renamed from: getLambda-7$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7831getLambda7$paymentsheet_release() {
        return f165lambda7;
    }
}
