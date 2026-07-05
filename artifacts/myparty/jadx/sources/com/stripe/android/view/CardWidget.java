package com.stripe.android.view;

import android.text.TextWatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.Metadata;

/* compiled from: CardWidget.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u0000 *2\u00020\u0001:\u0001*J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H&J\u0012\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H&J\u0012\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H&J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\u000fH&J\u0012\u0010\"\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010 H&J\u001c\u0010$\u001a\u00020\u000f2\b\b\u0001\u0010%\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020&H&J\u0012\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010 H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006+"}, d2 = {"Lcom/stripe/android/view/CardWidget;", "", "cardParams", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "paymentMethodCard", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getPaymentMethodCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "setCardValidCallback", "", "callback", "Lcom/stripe/android/view/CardValidCallback;", "setCardInputListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/stripe/android/view/CardInputListener;", "setCardNumberTextWatcher", "cardNumberTextWatcher", "Landroid/text/TextWatcher;", "setExpiryDateTextWatcher", "expiryDateTextWatcher", "setCvcNumberTextWatcher", "cvcNumberTextWatcher", "setPostalCodeTextWatcher", "postalCodeTextWatcher", "setCardHint", "cardHint", "", "clear", "setCardNumber", "cardNumber", "setExpiryDate", "month", "", "year", "setCvcCode", "cvcCode", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CardWidget {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final boolean DEFAULT_POSTAL_CODE_ENABLED = true;
    public static final boolean DEFAULT_POSTAL_CODE_REQUIRED = false;
    public static final boolean DEFAULT_US_ZIP_CODE_REQUIRED = false;

    void clear();

    CardParams getCardParams();

    PaymentMethodCreateParams.Card getPaymentMethodCard();

    PaymentMethodCreateParams getPaymentMethodCreateParams();

    void setCardHint(String cardHint);

    void setCardInputListener(CardInputListener listener);

    void setCardNumber(String cardNumber);

    void setCardNumberTextWatcher(TextWatcher cardNumberTextWatcher);

    void setCardValidCallback(CardValidCallback callback);

    void setCvcCode(String cvcCode);

    void setCvcNumberTextWatcher(TextWatcher cvcNumberTextWatcher);

    void setExpiryDate(int month, int year);

    void setExpiryDateTextWatcher(TextWatcher expiryDateTextWatcher);

    void setPostalCodeTextWatcher(TextWatcher postalCodeTextWatcher);

    /* compiled from: CardWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/view/CardWidget$Companion;", "", "<init>", "()V", "DEFAULT_POSTAL_CODE_ENABLED", "", "DEFAULT_POSTAL_CODE_REQUIRED", "DEFAULT_US_ZIP_CODE_REQUIRED", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final boolean DEFAULT_POSTAL_CODE_ENABLED = true;
        public static final boolean DEFAULT_POSTAL_CODE_REQUIRED = false;
        public static final boolean DEFAULT_US_ZIP_CODE_REQUIRED = false;

        private Companion() {
        }
    }
}
