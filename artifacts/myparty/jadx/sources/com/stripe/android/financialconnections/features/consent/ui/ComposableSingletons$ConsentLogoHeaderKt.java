package com.stripe.android.financialconnections.features.consent.ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsentLogoHeader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$ConsentLogoHeaderKt {
    public static final ComposableSingletons$ConsentLogoHeaderKt INSTANCE = new ComposableSingletons$ConsentLogoHeaderKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<ImageBitmap, Composer, Integer, Unit> f84lambda1 = ComposableLambdaKt.composableLambdaInstance(230959578, false, new Function3<ImageBitmap, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.consent.ui.ComposableSingletons$ConsentLogoHeaderKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ImageBitmap imageBitmap, Composer composer, Integer num) {
            invoke(imageBitmap, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ImageBitmap image, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(image, "image");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(230959578, i, -1, "com.stripe.android.financialconnections.features.consent.ui.ComposableSingletons$ConsentLogoHeaderKt.lambda-1.<anonymous> (ConsentLogoHeader.kt:238)");
            }
            ImageKt.m631Image5hnEew(image, null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer, (i & 14) | 25008, 232);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$financial_connections_release, reason: not valid java name */
    public final Function3<ImageBitmap, Composer, Integer, Unit> m7378getLambda1$financial_connections_release() {
        return f84lambda1;
    }
}
