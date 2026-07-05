package com.stripe.android.financialconnections.features.linkaccountpicker;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkAccountPickerScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$LinkAccountPickerScreenKt {
    public static final ComposableSingletons$LinkAccountPickerScreenKt INSTANCE = new ComposableSingletons$LinkAccountPickerScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f94lambda1 = ComposableLambdaKt.composableLambdaInstance(1590876224, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.ComposableSingletons$LinkAccountPickerScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1590876224, i, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.ComposableSingletons$LinkAccountPickerScreenKt.lambda-1.<anonymous> (LinkAccountPickerScreen.kt:232)");
                }
                TextKt.m2076Text4IGK_g("Retrieving accounts", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer, 6).getHeadingXLarge(), composer, 54, 0, 65532);
                SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(8)), composer, 6);
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
    private static Function3<Brush, Composer, Integer, Unit> f95lambda2 = ComposableLambdaKt.composableLambdaInstance(2110578920, false, new Function3<Brush, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.ComposableSingletons$LinkAccountPickerScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Brush brush, Composer composer, Integer num) {
            invoke(brush, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Brush it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i |= composer.changed(it) ? 4 : 2;
            }
            if ((i & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2110578920, i, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.ComposableSingletons$LinkAccountPickerScreenKt.lambda-2.<anonymous> (LinkAccountPickerScreen.kt:241)");
                }
                BoxKt.Box(BackgroundKt.background$default(ClipKt.clip(SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(88)), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(12))), it, null, 0.0f, 6, null), composer, 0);
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
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> f96lambda3 = ComposableLambdaKt.composableLambdaInstance(-775726903, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.linkaccountpicker.ComposableSingletons$LinkAccountPickerScreenKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 129) != 128 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-775726903, i2, -1, "com.stripe.android.financialconnections.features.linkaccountpicker.ComposableSingletons$LinkAccountPickerScreenKt.lambda-3.<anonymous> (LinkAccountPickerScreen.kt:240)");
                }
                LoadingContentKt.LoadingShimmerEffect(ComposableSingletons$LinkAccountPickerScreenKt.INSTANCE.m7415getLambda2$financial_connections_release(), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$financial_connections_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m7414getLambda1$financial_connections_release() {
        return f94lambda1;
    }

    /* renamed from: getLambda-2$financial_connections_release, reason: not valid java name */
    public final Function3<Brush, Composer, Integer, Unit> m7415getLambda2$financial_connections_release() {
        return f95lambda2;
    }

    /* renamed from: getLambda-3$financial_connections_release, reason: not valid java name */
    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> m7416getLambda3$financial_connections_release() {
        return f96lambda3;
    }
}
