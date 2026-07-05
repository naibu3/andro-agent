package com.stripe.android.paymentelement.embedded;

import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import kotlin.Metadata;

/* compiled from: DefaultEmbeddedResultCallbackHelper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;", "", "setResult", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EmbeddedResultCallbackHelper {
    void setResult(EmbeddedPaymentElement.Result result);
}
