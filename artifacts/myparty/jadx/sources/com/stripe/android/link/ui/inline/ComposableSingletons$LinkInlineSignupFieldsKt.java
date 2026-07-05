package com.stripe.android.link.ui.inline;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LinkInlineSignupFields.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$LinkInlineSignupFieldsKt {
    public static final ComposableSingletons$LinkInlineSignupFieldsKt INSTANCE = new ComposableSingletons$LinkInlineSignupFieldsKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f174lambda1 = ComposableLambdaKt.composableLambdaInstance(-673700069, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupFieldsKt$lambda-1$1
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
                ComposerKt.traceEventStart(-673700069, i, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupFieldsKt.lambda-1.<anonymous> (LinkInlineSignupFields.kt:80)");
            }
            LinkOptionalInlineSignupKt.LinkLogo(LinkInlineSignupFieldsKt.LinkLogoModifier, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f175lambda2 = ComposableLambdaKt.composableLambdaInstance(-1133341087, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupFieldsKt$lambda-2$1
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
                ComposerKt.traceEventStart(-1133341087, i, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupFieldsKt.lambda-2.<anonymous> (LinkInlineSignupFields.kt:99)");
            }
            LinkOptionalInlineSignupKt.LinkLogo(LinkInlineSignupFieldsKt.LinkLogoModifier, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7874getLambda1$paymentsheet_release() {
        return f174lambda1;
    }

    /* renamed from: getLambda-2$paymentsheet_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7875getLambda2$paymentsheet_release() {
        return f175lambda2;
    }
}
