package com.stripe.android;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.CardBrand;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;

/* compiled from: CardUtils.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/CardUtils;", "", "<init>", "()V", "getPossibleCardBrand", "Lcom/stripe/android/model/CardBrand;", "cardNumber", "", "isValidLuhnNumber", "", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardUtils {
    public static final CardUtils INSTANCE = new CardUtils();

    private CardUtils() {
    }

    @Deprecated(message = "CardInputWidget and CardMultilineWidget handle card brand lookup. This method should not be relied on for determining CardBrand.")
    @JvmStatic
    public static final CardBrand getPossibleCardBrand(String cardNumber) {
        String str = cardNumber;
        if (str == null || StringsKt.isBlank(str)) {
            return CardBrand.Unknown;
        }
        return CardBrand.INSTANCE.fromCardNumber(new CardNumber.Unvalidated(cardNumber).getNormalized());
    }

    public final boolean isValidLuhnNumber(String cardNumber) {
        if (cardNumber == null) {
            return false;
        }
        int length = cardNumber.length() - 1;
        int i = 0;
        boolean z = true;
        while (-1 < length) {
            char cCharAt = cardNumber.charAt(length);
            if (!Character.isDigit(cCharAt)) {
                return false;
            }
            int numericValue = Character.getNumericValue(cCharAt);
            boolean z2 = !z;
            if (!z) {
                numericValue *= 2;
            }
            if (numericValue > 9) {
                numericValue -= 9;
            }
            i += numericValue;
            length--;
            z = z2;
        }
        return i % 10 == 0;
    }
}
