package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.stripe.android.paymentsheet.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CvcRecollectionScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$CvcRecollectionScreenKt {
    public static final ComposableSingletons$CvcRecollectionScreenKt INSTANCE = new ComposableSingletons$CvcRecollectionScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f212lambda1 = ComposableLambdaKt.composableLambdaInstance(-1155375669, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.ComposableSingletons$CvcRecollectionScreenKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1155375669, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.ComposableSingletons$CvcRecollectionScreenKt.lambda-1.<anonymous> (CvcRecollectionScreen.kt:234)");
            }
            IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_paymentsheet_close, composer, 0), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f213lambda2 = ComposableLambdaKt.composableLambdaInstance(-1739181525, false, ComposableSingletons$CvcRecollectionScreenKt$lambda2$1.INSTANCE);

    /* renamed from: getLambda-1$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8369getLambda1$paymentsheet_release() {
        return f212lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8370getLambda2$paymentsheet_release() {
        return f213lambda2;
    }
}
