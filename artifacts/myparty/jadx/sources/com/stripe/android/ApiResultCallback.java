package com.stripe.android;

import com.nimbusds.jose.jwk.JWKParameterNames;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;

/* compiled from: ApiResultCallback.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u00020\u00052\n\u0010\t\u001a\u00060\nj\u0002`\u000bH&¨\u0006\f"}, d2 = {"Lcom/stripe/android/ApiResultCallback;", "ResultType", "Lcom/stripe/android/core/model/StripeModel;", "", "onSuccess", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "(Lcom/stripe/android/core/model/StripeModel;)V", "onError", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Exception;", "Lkotlin/Exception;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ApiResultCallback<ResultType extends StripeModel> {
    void onError(Exception e);

    void onSuccess(ResultType result);
}
