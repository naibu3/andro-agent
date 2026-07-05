package com.stripe.android.uicore.elements;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.uicore.R;
import com.stripe.android.uicore.elements.TextFieldIcon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TextFieldUI.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$TextFieldUIKt {
    public static final ComposableSingletons$TextFieldUIKt INSTANCE = new ComposableSingletons$TextFieldUIKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f240lambda1 = ComposableLambdaKt.composableLambdaInstance(549433638, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.ComposableSingletons$TextFieldUIKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(549433638, i, -1, "com.stripe.android.uicore.elements.ComposableSingletons$TextFieldUIKt.lambda-1.<anonymous> (TextFieldUI.kt:480)");
                }
                TextFieldUIKt.TrailingIcon(new TextFieldIcon.Trailing(R.drawable.stripe_ic_chevron_down, null, true, null, 10, null), false, SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(8)), composer, 432, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$stripe_ui_core_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8783getLambda1$stripe_ui_core_release() {
        return f240lambda1;
    }
}
