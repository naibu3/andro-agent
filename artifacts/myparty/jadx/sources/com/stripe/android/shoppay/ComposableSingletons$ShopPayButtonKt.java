package com.stripe.android.shoppay;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.PrimaryButtonTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShopPayButton.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$ShopPayButtonKt {
    public static final ComposableSingletons$ShopPayButtonKt INSTANCE = new ComposableSingletons$ShopPayButtonKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f237lambda1 = ComposableLambdaKt.composableLambdaInstance(-891608132, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.shoppay.ComposableSingletons$ShopPayButtonKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-891608132, i, -1, "com.stripe.android.shoppay.ComposableSingletons$ShopPayButtonKt.lambda-1.<anonymous> (ShopPayButton.kt:53)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.stripe_shop_pay_logo_white, composer, 0), (String) null, SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(PrimaryButtonTheme.INSTANCE.getShape(composer, 6).m8524getHeightD9Ej5fM() - Dp.m6117constructorimpl(ShopPayButtonKt.ShopPayButtonVerticalPadding * 2))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
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
    public final Function3<RowScope, Composer, Integer, Unit> m8604getLambda1$paymentsheet_release() {
        return f237lambda1;
    }
}
