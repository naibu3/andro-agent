package com.stripe.android.link.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.stripe.android.link.ui.LinkButtonState;
import com.stripe.android.link.ui.wallet.DefaultPaymentUI;
import com.stripe.android.link.ui.wallet.DefaultPaymentUIKt;
import com.stripe.android.model.DisplayablePaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkButton.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$LinkButtonKt$lambda4$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$LinkButtonKt$lambda4$1 INSTANCE = new ComposableSingletons$LinkButtonKt$lambda4$1();

    ComposableSingletons$LinkButtonKt$lambda4$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-994364167, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-4.<anonymous> (LinkButton.kt:123)");
            }
            DefaultPaymentUI defaultPaymentUI = DefaultPaymentUIKt.toDefaultPaymentUI(new DisplayablePaymentDetails("mastercard", "CARD", "4242", (Long) null, 8, (DefaultConstructorMarker) null), true);
            Intrinsics.checkNotNull(defaultPaymentUI);
            LinkButtonState.DefaultPayment defaultPayment = new LinkButtonState.DefaultPayment(defaultPaymentUI);
            composer.startReplaceGroup(1306426194);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt$lambda-4$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LinkButtonKt.LinkButton(defaultPayment, true, (Function0) objRememberedValue, null, composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
