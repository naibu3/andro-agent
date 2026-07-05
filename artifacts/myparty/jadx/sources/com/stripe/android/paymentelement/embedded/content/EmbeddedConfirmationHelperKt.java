package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EmbeddedConfirmationHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"asEmbeddedResult", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmbeddedConfirmationHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final EmbeddedPaymentElement.Result asEmbeddedResult(ConfirmationHandler.Result result) {
        if (result instanceof ConfirmationHandler.Result.Canceled) {
            return new EmbeddedPaymentElement.Result.Canceled();
        }
        if (result instanceof ConfirmationHandler.Result.Failed) {
            return new EmbeddedPaymentElement.Result.Failed(((ConfirmationHandler.Result.Failed) result).getCause());
        }
        if (!(result instanceof ConfirmationHandler.Result.Succeeded)) {
            throw new NoWhenBranchMatchedException();
        }
        return new EmbeddedPaymentElement.Result.Completed();
    }
}
