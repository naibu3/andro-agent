package com.stripe.android.ui.core.elements;

import androidx.appcompat.app.AppCompatDelegate;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* compiled from: ExpiryDateContentDescriptionFormatter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"formatExpirationDateForAccessibility", "Lcom/stripe/android/core/strings/ResolvableString;", "input", "", "payments-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExpiryDateContentDescriptionFormatterKt {
    public static final ResolvableString formatExpirationDateForAccessibility(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String str = input;
        if (str.length() == 0) {
            return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_expiration_date_empty_content_description, new Object[0], null, 4, null);
        }
        if (StringsKt.toIntOrNull(input) == null) {
            return ResolvableStringUtilsKt.getResolvableString(input);
        }
        int i = ((((!StringsKt.isBlank(str) && input.charAt(0) != '0' && input.charAt(0) != '1') || (input.length() > 1 && Integer.parseInt(StringsKt.take(input, 2)) > 12)) ? 1 : 0) ^ 1) + 1;
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.take(input, i));
        Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.slice(input, new IntRange(i, StringsKt.getLastIndex(str))));
        try {
            if (intOrNull != null) {
                Locale locale = AppCompatDelegate.getApplicationLocales().get(0);
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                Date date = new SimpleDateFormat("MM", locale).parse(String.valueOf(intOrNull));
                String str2 = date != null ? new SimpleDateFormat("MMMM", locale).format(date) : null;
                if (intOrNull2 == null) {
                    return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_expiration_date_month_complete_content_description, new Object[]{str2}, null, 4, null);
                }
                if (new IntRange(0, 9).contains(intOrNull2.intValue())) {
                    return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_expiration_date_year_incomplete_content_description, new Object[]{str2}, null, 4, null);
                }
                return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_expiration_date_content_description, new Object[]{str2, Integer.valueOf(intOrNull2.intValue() + 2000)}, null, 4, null);
            }
            return ResolvableStringUtilsKt.getResolvableString(input);
        } catch (ParseException unused) {
            return ResolvableStringUtilsKt.getResolvableString(input);
        }
    }
}
