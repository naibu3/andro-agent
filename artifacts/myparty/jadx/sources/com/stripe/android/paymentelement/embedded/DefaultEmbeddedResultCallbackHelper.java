package com.stripe.android.paymentelement.embedded;

import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.embedded.content.EmbeddedPaymentElementScope;
import com.stripe.android.paymentelement.embedded.content.EmbeddedStateHelper;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultEmbeddedResultCallbackHelper.kt */
@EmbeddedPaymentElementScope
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;", "Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;", "resultCallback", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;", "stateHelper", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;", "<init>", "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;)V", "setResult", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultEmbeddedResultCallbackHelper implements EmbeddedResultCallbackHelper {
    public static final int $stable = 0;
    private final EmbeddedPaymentElement.ResultCallback resultCallback;
    private final EmbeddedStateHelper stateHelper;

    @Inject
    public DefaultEmbeddedResultCallbackHelper(EmbeddedPaymentElement.ResultCallback resultCallback, EmbeddedStateHelper stateHelper) {
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        Intrinsics.checkNotNullParameter(stateHelper, "stateHelper");
        this.resultCallback = resultCallback;
        this.stateHelper = stateHelper;
    }

    @Override // com.stripe.android.paymentelement.embedded.EmbeddedResultCallbackHelper
    public void setResult(EmbeddedPaymentElement.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.resultCallback.onResult(result);
        if (result instanceof EmbeddedPaymentElement.Result.Completed) {
            this.stateHelper.setState(null);
        }
    }
}
