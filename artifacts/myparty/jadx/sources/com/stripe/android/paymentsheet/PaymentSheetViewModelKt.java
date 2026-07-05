package com.stripe.android.paymentsheet;

import com.stripe.android.link.LinkExpressMode;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.gpay.GooglePayConfirmationOption;
import com.stripe.android.paymentelement.confirmation.link.LinkConfirmationOption;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PaymentSheetViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"isProcessingPayment", "", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Z", "contentVisible", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;", "getContentVisible", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;)Z", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isProcessingPayment(PaymentElementLoader.InitializationMode initializationMode) {
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.PaymentIntent) {
            return true;
        }
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.SetupIntent) {
            return false;
        }
        if (!(initializationMode instanceof PaymentElementLoader.InitializationMode.DeferredIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((PaymentElementLoader.InitializationMode.DeferredIntent) initializationMode).getIntentConfiguration().getMode() instanceof PaymentSheet.IntentConfiguration.Mode.Payment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getContentVisible(ConfirmationHandler.State state) {
        if ((state instanceof ConfirmationHandler.State.Idle) || (state instanceof ConfirmationHandler.State.Complete)) {
            return true;
        }
        if (!(state instanceof ConfirmationHandler.State.Confirming)) {
            throw new NoWhenBranchMatchedException();
        }
        ConfirmationHandler.State.Confirming confirming = (ConfirmationHandler.State.Confirming) state;
        ConfirmationHandler.Option option = confirming.getOption();
        if (option instanceof GooglePayConfirmationOption) {
            return false;
        }
        return ((option instanceof LinkConfirmationOption) && ((LinkConfirmationOption) confirming.getOption()).getLinkExpressMode() == LinkExpressMode.DISABLED) ? false : true;
    }
}
