package com.stripe.android.paymentelement.confirmation.link;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;

/* compiled from: LinkPassthroughConfirmationDefinition.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"parsePaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkPassthroughConfirmationDefinitionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentMethod parsePaymentMethod(String str) {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(new PaymentMethodJsonParser().parse(new JSONObject(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
            objM9118constructorimpl = null;
        }
        return (PaymentMethod) objM9118constructorimpl;
    }
}
