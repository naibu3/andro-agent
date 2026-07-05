package com.stripe.android.paymentsheet.verticalmode;

import android.content.Context;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.paymentsheet.ui.PaymentMethodIconKt;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodRowButton.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$PaymentMethodRowButtonKt {
    public static final ComposableSingletons$PaymentMethodRowButtonKt INSTANCE = new ComposableSingletons$PaymentMethodRowButtonKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f232lambda1 = ComposableLambdaKt.composableLambdaInstance(-228724754, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.ComposableSingletons$PaymentMethodRowButtonKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope PaymentMethodRowButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-228724754, i, -1, "com.stripe.android.paymentsheet.verticalmode.ComposableSingletons$PaymentMethodRowButtonKt.lambda-1.<anonymous> (PaymentMethodRowButton.kt:420)");
                }
                int i2 = R.drawable.stripe_ic_paymentsheet_pm_card;
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Context applicationContext = ((Context) objConsume).getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                float f = 22;
                PaymentMethodIconKt.PaymentMethodIcon(i2, null, new StripeImageLoader(applicationContext, null, null, null, null, 30, null), true, SizeKt.m1070width3ABfNKs(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), Dp.m6117constructorimpl(f)), Alignment.INSTANCE.getCenter(), composer, (StripeImageLoader.$stable << 6) | 224304, 0);
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
    private static Function3<RowScope, Composer, Integer, Unit> f233lambda2 = ComposableLambdaKt.composableLambdaInstance(-1423392141, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.ComposableSingletons$PaymentMethodRowButtonKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope PaymentMethodRowButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1423392141, i, -1, "com.stripe.android.paymentsheet.verticalmode.ComposableSingletons$PaymentMethodRowButtonKt.lambda-2.<anonymous> (PaymentMethodRowButton.kt:437)");
            }
            TextKt.m2076Text4IGK_g("Edit", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f234lambda3 = ComposableLambdaKt.composableLambdaInstance(-1179981339, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.ComposableSingletons$PaymentMethodRowButtonKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope PaymentMethodRowButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1179981339, i, -1, "com.stripe.android.paymentsheet.verticalmode.ComposableSingletons$PaymentMethodRowButtonKt.lambda-3.<anonymous> (PaymentMethodRowButton.kt:445)");
                }
                int i2 = R.drawable.stripe_ic_paymentsheet_pm_card;
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Context applicationContext = ((Context) objConsume).getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                float f = 22;
                PaymentMethodIconKt.PaymentMethodIcon(i2, null, new StripeImageLoader(applicationContext, null, null, null, null, 30, null), true, SizeKt.m1070width3ABfNKs(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), Dp.m6117constructorimpl(f)), Alignment.INSTANCE.getCenter(), composer, (StripeImageLoader.$stable << 6) | 224304, 0);
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
    private static Function3<RowScope, Composer, Integer, Unit> f235lambda4 = ComposableLambdaKt.composableLambdaInstance(1795895082, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.ComposableSingletons$PaymentMethodRowButtonKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope PaymentMethodRowButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1795895082, i, -1, "com.stripe.android.paymentsheet.verticalmode.ComposableSingletons$PaymentMethodRowButtonKt.lambda-4.<anonymous> (PaymentMethodRowButton.kt:462)");
            }
            TextKt.m2076Text4IGK_g("Edit", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f236lambda5 = ComposableLambdaKt.composableLambdaInstance(1616606426, false, ComposableSingletons$PaymentMethodRowButtonKt$lambda5$1.INSTANCE);

    /* renamed from: getLambda-1$paymentsheet_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m8560getLambda1$paymentsheet_release() {
        return f232lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m8561getLambda2$paymentsheet_release() {
        return f233lambda2;
    }

    /* renamed from: getLambda-3$paymentsheet_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m8562getLambda3$paymentsheet_release() {
        return f234lambda3;
    }

    /* renamed from: getLambda-4$paymentsheet_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m8563getLambda4$paymentsheet_release() {
        return f235lambda4;
    }

    /* renamed from: getLambda-5$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8564getLambda5$paymentsheet_release() {
        return f236lambda5;
    }
}
