package com.stripe.android.common.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: PaymentElementCompose.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"UpdateCallbacks", "", "paymentElementCallbackIdentifier", "", "paymentElementCallbacks", "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;", "(Ljava/lang/String;Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentElementComposeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateCallbacks$lambda$1(String str, PaymentElementCallbacks paymentElementCallbacks, int i, Composer composer, int i2) {
        UpdateCallbacks(str, paymentElementCallbacks, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UpdateCallbacks(final String paymentElementCallbackIdentifier, final PaymentElementCallbacks paymentElementCallbacks, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        Intrinsics.checkNotNullParameter(paymentElementCallbacks, "paymentElementCallbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1144143026);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paymentElementCallbackIdentifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(paymentElementCallbacks) : composerStartRestartGroup.changedInstance(paymentElementCallbacks) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1144143026, i2, -1, "com.stripe.android.common.ui.UpdateCallbacks (PaymentElementCompose.kt:11)");
            }
            composerStartRestartGroup.startReplaceGroup(-1451301209);
            boolean z = true;
            boolean z2 = (i2 & 14) == 4;
            if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32 && ((i2 & 64) == 0 || !composerStartRestartGroup.changedInstance(paymentElementCallbacks))) {
                z = false;
            }
            boolean z3 = z2 | z;
            PaymentElementComposeKt$UpdateCallbacks$1$1 paymentElementComposeKt$UpdateCallbacks$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || paymentElementComposeKt$UpdateCallbacks$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                paymentElementComposeKt$UpdateCallbacks$1$1RememberedValue = new PaymentElementComposeKt$UpdateCallbacks$1$1(paymentElementCallbackIdentifier, paymentElementCallbacks, null);
                composerStartRestartGroup.updateRememberedValue(paymentElementComposeKt$UpdateCallbacks$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(paymentElementCallbackIdentifier, paymentElementCallbacks, (Function2) paymentElementComposeKt$UpdateCallbacks$1$1RememberedValue, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.common.ui.PaymentElementComposeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentElementComposeKt.UpdateCallbacks$lambda$1(paymentElementCallbackIdentifier, paymentElementCallbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
