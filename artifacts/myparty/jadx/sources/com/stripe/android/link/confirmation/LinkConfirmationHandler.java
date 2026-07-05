package com.stripe.android.link.confirmation;

import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: LinkConfirmationHandler.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u000eJ2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0002\u0010\u000bJ2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;", "", "confirm", "Lcom/stripe/android/link/confirmation/Result;", "paymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "cvc", "", "billingPhone", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/link/LinkPaymentDetails;", "(Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkConfirmationHandler {

    /* compiled from: LinkConfirmationHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;", "", "create", "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;", "confirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        LinkConfirmationHandler create(ConfirmationHandler confirmationHandler);
    }

    Object confirm(LinkPaymentDetails linkPaymentDetails, LinkAccount linkAccount, String str, String str2, Continuation<? super Result> continuation);

    Object confirm(ConsumerPaymentDetails.PaymentDetails paymentDetails, LinkAccount linkAccount, String str, String str2, Continuation<? super Result> continuation);
}
