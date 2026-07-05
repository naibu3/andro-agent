package com.stripe.android.view.i18n;

import androidx.webkit.Profile;
import com.stripe.android.core.StripeError;
import kotlin.Metadata;

/* compiled from: TranslatorManager.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/i18n/TranslatorManager;", "", "<init>", "()V", "DEFAULT_ERROR_MESSAGE_TRANSLATOR", "Lcom/stripe/android/view/i18n/TranslatorManager$Default;", "errorMessageTranslator", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "getErrorMessageTranslator", "setErrorMessageTranslator", "", Profile.DEFAULT_PROFILE_NAME, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TranslatorManager {
    private static ErrorMessageTranslator errorMessageTranslator;
    public static final TranslatorManager INSTANCE = new TranslatorManager();
    private static final Default DEFAULT_ERROR_MESSAGE_TRANSLATOR = new Default();
    public static final int $stable = 8;

    private TranslatorManager() {
    }

    public final ErrorMessageTranslator getErrorMessageTranslator() {
        ErrorMessageTranslator errorMessageTranslator2 = errorMessageTranslator;
        return errorMessageTranslator2 == null ? DEFAULT_ERROR_MESSAGE_TRANSLATOR : errorMessageTranslator2;
    }

    public final void setErrorMessageTranslator(ErrorMessageTranslator errorMessageTranslator2) {
        errorMessageTranslator = errorMessageTranslator2;
    }

    /* compiled from: TranslatorManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/i18n/TranslatorManager$Default;", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "<init>", "()V", "translate", "", "httpCode", "", "errorMessage", "stripeError", "Lcom/stripe/android/core/StripeError;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Default implements ErrorMessageTranslator {
        @Override // com.stripe.android.view.i18n.ErrorMessageTranslator
        public String translate(int httpCode, String errorMessage, StripeError stripeError) {
            return errorMessage == null ? "" : errorMessage;
        }
    }
}
