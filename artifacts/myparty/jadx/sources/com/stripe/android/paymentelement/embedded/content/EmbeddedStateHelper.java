package com.stripe.android.paymentelement.embedded.content;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import kotlin.Metadata;

/* compiled from: EmbeddedStateHelper.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;", "getState", "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;", "setState", "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;)V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EmbeddedStateHelper {
    EmbeddedPaymentElement.State getState();

    void setState(EmbeddedPaymentElement.State state);
}
