package com.stripe.android.paymentelement.confirmation.intent;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IntentConfirmationInterceptor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/InvalidClientSecretException;", "Lcom/stripe/android/core/exception/StripeException;", "clientSecret", "", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V", "getClientSecret", "()Ljava/lang/String;", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "intentType", "analyticsValue", "message", "getMessage", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InvalidClientSecretException extends StripeException {
    public static final int $stable = 8;
    private final String clientSecret;
    private final StripeIntent intent;
    private final String intentType;
    private final String message;

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final StripeIntent getIntent() {
        return this.intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidClientSecretException(String clientSecret, StripeIntent intent) {
        String str;
        super(null, null, 0, null, null, 31, null);
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.clientSecret = clientSecret;
        this.intent = intent;
        if (intent instanceof PaymentIntent) {
            str = "PaymentIntent";
        } else {
            if (!(intent instanceof SetupIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "SetupIntent";
        }
        this.intentType = str;
        this.message = StringsKt.trimIndent("\n        Encountered an invalid client secret \"" + clientSecret + "\" for intent type \"" + str + "\"\n    ");
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        return "invalidClientSecretProvided";
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
