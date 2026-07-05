package com.stripe.android.paymentsheet.addresselement;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.paymentsheet.ui.AddressOptionsAppBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutocompleteScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.paymentsheet.addresselement.ComposableSingletons$AutocompleteScreenKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$AutocompleteScreenKt$lambda1$1 implements Function4<Boolean, Function0<? extends Unit>, Composer, Integer, Unit> {
    public static final ComposableSingletons$AutocompleteScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$AutocompleteScreenKt$lambda1$1();

    ComposableSingletons$AutocompleteScreenKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Function0<? extends Unit> function0, Composer composer, Integer num) {
        invoke(bool.booleanValue(), (Function0<Unit>) function0, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, final Function0<Unit> onBack, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        if ((i & 6) == 0) {
            i2 = (composer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changedInstance(onBack) ? 32 : 16;
        }
        if ((i2 & 147) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1578841985, i2, -1, "com.stripe.android.paymentsheet.addresselement.ComposableSingletons$AutocompleteScreenKt.lambda-1.<anonymous> (AutocompleteScreen.kt:110)");
        }
        composer.startReplaceGroup(-628952392);
        boolean z2 = (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.ComposableSingletons$AutocompleteScreenKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComposableSingletons$AutocompleteScreenKt$lambda1$1.invoke$lambda$1$lambda$0(onBack);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AddressOptionsAppBarKt.AddressOptionsAppBar(z, (Function0) objRememberedValue, composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
