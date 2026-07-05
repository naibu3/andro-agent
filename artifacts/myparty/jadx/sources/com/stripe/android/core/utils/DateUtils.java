package com.stripe.android.core.utils;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DateUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0007J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u0005H\u0007J\u001a\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/core/utils/DateUtils;", "", "<init>", "()V", "MAX_VALID_YEAR", "", "isExpiryDataValid", "", "expiryMonth", "expiryYear", "calendar", "Ljava/util/Calendar;", "convertTwoDigitYearToFour", "inputYear", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DateUtils {
    public static final DateUtils INSTANCE = new DateUtils();
    private static final int MAX_VALID_YEAR = 9980;

    private DateUtils() {
    }

    @JvmStatic
    public static final boolean isExpiryDataValid(int expiryMonth, int expiryYear) {
        if (expiryYear < 100) {
            expiryYear = INSTANCE.convertTwoDigitYearToFour(expiryYear);
        }
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        return isExpiryDataValid(expiryMonth, expiryYear, calendar);
    }

    @JvmStatic
    public static final boolean isExpiryDataValid(int expiryMonth, int expiryYear, Calendar calendar) {
        int i;
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        if (1 > expiryMonth || expiryMonth >= 13 || expiryYear < 0 || expiryYear >= 9981 || expiryYear < (i = calendar.get(1))) {
            return false;
        }
        return expiryYear > i || expiryMonth >= calendar.get(2) + 1;
    }

    public final int convertTwoDigitYearToFour(int inputYear) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        return convertTwoDigitYearToFour(inputYear, calendar);
    }

    public final int convertTwoDigitYearToFour(int inputYear, Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        int i = calendar.get(1);
        int i2 = i / 100;
        int i3 = i % 100;
        if (i3 > 80 && inputYear < 20) {
            i2++;
        } else if (i3 < 20 && inputYear > 80) {
            i2--;
        }
        return (i2 * 100) + inputYear;
    }
}
