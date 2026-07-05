package com.stripe.android;

import com.stripe.android.uicore.format.CurrencyFormatter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.io.FilenameUtils;

/* compiled from: PayWithGoogleUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/PayWithGoogleUtils;", "", "<init>", "()V", "getPriceString", "", "price", "", "currency", "Ljava/util/Currency;", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayWithGoogleUtils {
    public static final int $stable = 0;
    public static final PayWithGoogleUtils INSTANCE = new PayWithGoogleUtils();

    private PayWithGoogleUtils() {
    }

    @Deprecated(message = "Use getPriceString(Long, Currency) instead.", replaceWith = @ReplaceWith(expression = "getPriceString(price.toLong(), currency)", imports = {}))
    @JvmStatic
    public static final String getPriceString(int price, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return getPriceString(price, currency);
    }

    @JvmStatic
    public static final String getPriceString(long price, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        int defaultDecimalDigits = CurrencyFormatter.INSTANCE.getDefaultDecimalDigits(currency);
        int length = String.valueOf(price).length();
        StringBuilder sb = new StringBuilder();
        if (defaultDecimalDigits == 0) {
            for (int i = 0; i < length; i++) {
                sb.append('#');
            }
            DecimalFormat decimalFormat = new DecimalFormat(sb.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
            decimalFormat.setCurrency(currency);
            decimalFormat.setGroupingUsed(false);
            String str = decimalFormat.format(price);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        int i2 = length - defaultDecimalDigits;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append('#');
        }
        if (length <= defaultDecimalDigits) {
            sb.append('0');
        }
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        for (int i4 = 0; i4 < defaultDecimalDigits; i4++) {
            sb.append('0');
        }
        double dPow = price / Math.pow(10.0d, defaultDecimalDigits);
        DecimalFormat decimalFormat2 = new DecimalFormat(sb.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
        decimalFormat2.setCurrency(currency);
        decimalFormat2.setGroupingUsed(false);
        String str2 = decimalFormat2.format(dPow);
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }
}
