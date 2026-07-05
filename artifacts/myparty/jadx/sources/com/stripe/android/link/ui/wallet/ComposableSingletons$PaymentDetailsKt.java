package com.stripe.android.link.ui.wallet;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.MoreVertKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.R;
import com.stripe.android.link.theme.LinkTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentDetails.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$PaymentDetailsKt {
    public static final ComposableSingletons$PaymentDetailsKt INSTANCE = new ComposableSingletons$PaymentDetailsKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f199lambda1 = ComposableLambdaKt.composableLambdaInstance(1381508991, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.wallet.ComposableSingletons$PaymentDetailsKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1381508991, i, -1, "com.stripe.android.link.ui.wallet.ComposableSingletons$PaymentDetailsKt.lambda-1.<anonymous> (PaymentDetails.kt:101)");
            }
            PaymentDetailsKt.DefaultTag(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f200lambda2 = ComposableLambdaKt.composableLambdaInstance(629401301, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.wallet.ComposableSingletons$PaymentDetailsKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(629401301, i, -1, "com.stripe.android.link.ui.wallet.ComposableSingletons$PaymentDetailsKt.lambda-2.<anonymous> (PaymentDetails.kt:281)");
                }
                IconKt.m1926Iconww6aTOc(MoreVertKt.getMoreVert(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(R.string.stripe_edit, composer, 0), SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), LinkTheme.INSTANCE.getColors(composer, 6).m7802getIconTertiary0d7_KjU(), composer, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
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
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7941getLambda1$paymentsheet_release() {
        return f199lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7942getLambda2$paymentsheet_release() {
        return f200lambda2;
    }
}
