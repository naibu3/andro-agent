package com.stripe.android.view;

import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u001d\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/PaymentUtils;", "", "<init>", "()V", "formatPriceStringUsingFree", "", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "currency", "Ljava/util/Currency;", "free", "formatPriceString", "", "formatPriceString$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentUtils {
    public static final int $stable = 0;
    public static final PaymentUtils INSTANCE = new PaymentUtils();

    private PaymentUtils() {
    }

    @JvmStatic
    public static final String formatPriceStringUsingFree(long amount, Currency currency, String free) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(free, "free");
        if (amount == 0) {
            return free;
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        Intrinsics.checkNotNull(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(Locale.getDefault()));
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return INSTANCE.formatPriceString$payments_core_release(amount, currency);
    }

    public final /* synthetic */ String formatPriceString$payments_core_release(double amount, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        double dPow = amount / Math.pow(10.0d, currency.getDefaultFractionDigits());
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        try {
            Intrinsics.checkNotNull(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(Locale.getDefault()));
            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            String str = ((DecimalFormat) currencyInstance).format(dPow);
            Intrinsics.checkNotNull(str);
            return str;
        } catch (ClassCastException unused) {
            String str2 = currencyInstance.format(dPow);
            Intrinsics.checkNotNull(str2);
            return str2;
        }
    }
}
